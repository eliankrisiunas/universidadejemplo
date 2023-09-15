package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;

public class InscripcionData {

    private Connection con = null;
    private AlumnoData alumnodata;
    private MateriaData materiadata;

    public InscripcionData() {
        con = Conexion.getConexion();
        alumnodata = new AlumnoData();
        materiadata = new MateriaData();
    }

    public void guardarInscripcion(Inscripcion inscripcion) {
        String sql = "INSERT INTO inscripcion( nota, idAlumno, idMateria) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, inscripcion.getNota());
            ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(3, inscripcion.getMateria().getIdMateria());
            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion " + ex.getMessage());
        }

    }

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripcionLista = new ArrayList();
        String sql = "SELECT * FROM inscripcion WHERE 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setAlumno(alumnodata.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setMateria(materiadata.buscarMateria(rs.getInt("idMateria")));
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getInt("nota"));
                inscripcionLista.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion" + ex.getMessage());
        }

        return inscripcionLista;
    }

    public List<Inscripcion> obtenerInscripcionPorAlumno(int id) {
        List<Inscripcion> inscripcionLista = new ArrayList();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setAlumno(alumnodata.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setMateria(materiadata.buscarMateria(rs.getInt("idMateria")));
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getInt("nota"));
                inscripcionLista.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion" + ex.getMessage());
        }
        return inscripcionLista;
    }
}
