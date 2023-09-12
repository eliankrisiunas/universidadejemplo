
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
import universidadejemplo.Entidades.Materia;


public class MateriaData {
     private Connection con = null;


    public MateriaData() {
        con = Conexion.getConexion();
    }
     
     public void guardarMateria(Materia materia){
             String sql = "INSERT INTO materia(nombre, añoMateria, estado)";
             try {
             PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setString(1, materia.getNombre());
             ps.setInt(2, materia.getAño());
             ps.setBoolean(3, materia.isEstado());
             ResultSet rs= ps.getGeneratedKeys();
             if (rs.next()){
                 materia.setIdMateria(rs.getInt("idMateria"));
                 ps.close();
             }
             
        
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "error de conexión "+"\n"+ ex.getMessage());
         }
     
     }
     
     public Materia buscarMateria(int id){
         Materia materia = null;
         String sql = "SELECT nombre, añoMateria, estado FROM materia WHERE idMateria = ? AND estado = 1";
         PreparedStatement ps = null;
         
         try {
             ps = con.prepareStatement(sql);
             ps.setInt(1, id);
             
             ResultSet rs = ps.executeQuery();
             
             if (rs.next()){
             materia = new Materia();
             materia.setIdMateria(id);
             materia.setNombre(rs.getString("nombre"));
             materia.setAño(rs.getInt("año"));
             materia.setEstado(true);
             
             
             }else {
             
                 JOptionPane.showMessageDialog(null, "No existe el alumno.");
             
             }
             
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materias. "+ex.getMessage() );
         }
         
         
         return materia;
     }

    public void modificarMateria(Materia materia) {
        String sql = "UPDATE alumno SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());

        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarMateria(int id) {
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Materia> listarMaterias() {
    List<Materia> mat = new ArrayList<>();
    
    String sql = "SELECT * FROM materia WHERE estado = 1";
     
     
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(true);
                mat.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia"+ex.getMessage());
        }
    
         return mat;
    }
    
}
