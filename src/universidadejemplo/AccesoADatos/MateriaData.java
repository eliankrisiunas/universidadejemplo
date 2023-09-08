
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Materia;


public class MateriaData {
     private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }
     
     public void guardarMateria(Materia materia){
             String sql = "INSERT INTO materia(nombre, anioMateria, estado)";
             try {
             PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setString(1, materia.getNombre());
             ps.setInt(2, materia.getAnioMateria());
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
         String sql = "SELECT nombre, anioMateria, estado FROM materia WHERE idMateria = ? AND estado = 1";
         PreparedStatement ps = null;
         
         try {
             ps = con.prepareStatement(sql);
             ps.setInt(1, id);
             
             ResultSet rs = ps.executeQuery();
             
             if (rs.next()){
             materia = new Materia();
             materia.setIdMateria(id);
             materia.setNombre(rs.getString("nombre"));
             materia.setAnioMateria(rs.getInt("año"));
             materia.setEstado(true);
             
             
             }else {
             
                 JOptionPane.showMessageDialog(null, "No existe el alumno.");
             
             }
             
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materias. "+ex.getMessage() );
         }
         
         
         return materia;
     }
     
     public void modificarMateria(Materia materia){
         String sql = "UPDATE alumno SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";
         
         PreparedStatement ps = null;
         
         try {
             ps = con.prepareStatement(sql);
             ps.setString(1, materia.getNombre());
             ps.setInt(2, materia.getAnioMateria());
             ps.setBoolean(3, materia.isEstado());
     
             
         } catch (SQLException ex) {
             Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     }
     
}
