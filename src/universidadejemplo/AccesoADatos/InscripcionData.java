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
import universidadejemplo.Entidades.Materia;

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
        String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1,inscripcion.getNota());
            ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(3, inscripcion.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                ps.close();
            }
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
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setAlumno(alumnodata.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setMateria(materiadata.buscarMateria(rs.getInt("idMateria")));
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getInt("nota"));
                inscripcionLista.add(inscripcion);
            }System.out.println(inscripcionLista);
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion" + ex.getMessage());
        }
        return inscripcionLista;
    }

    public List<Materia> obtenerMateriaCursadas(int id) {
        List<Materia> materias = new ArrayList();
        String sql = "SELECT inscripcion.idMateria, nombre, anno, estado FROM inscripcion JOIN materia ON(inscripcion.idMateria=materia.idMateria) "
                + "WHERE inscripcion.idAlumno = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setEstado(rs.getBoolean("estado"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnno(rs.getInt("anno"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion " + ex.getMessage());
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNoCursadas(int id) {
        List<Materia> materias = new ArrayList();
        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in "
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno =?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setEstado(rs.getBoolean("estado"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnno(rs.getInt("anno"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion " + ex.getMessage());
        }
        return materias;
    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        List<Alumno> alumnos = new ArrayList();
        String sql = "SELECT inscripcion.idAlumno FROM inscripcion WHERE inscripcion.idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                alumnos.add(alumnodata.buscarAlumno(rs.getInt("idAlumno")));
            } System.out.println(alumnos);
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alumnos;
    }
    // REVISAR METODOS CON MENTOR!!!!!!!!!!!!!!!! 
    
    public void borrarInscripcionMateriaAlumno (int idAlumno, int idMateria){
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "se ha eliminado la inscripcion");
           }
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
    public void actualizarNota(double nota,int idAlumno, int idMateria) {
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "La nota ha sido actualizada.");
            } else {
                JOptionPane.showMessageDialog(null, "La nota no se ha podido actualizar");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la base de datos: "+ ex.getMessage());
        }


    }
}
