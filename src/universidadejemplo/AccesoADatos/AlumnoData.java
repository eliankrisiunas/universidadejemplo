
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;

/**
 *
 * @author Leo
 */
public class AlumnoData {
    private Connection con = null;

    public AlumnoData() {
        
        con = Conexion.getConexion();
    }
    
    public void guadarAlumno(Alumno alumno){
    
        
            String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES(?, ?, ?, ?, ?) ";
        try {    
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                ps.close();
            }
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }
        }
    
    public Alumno buscarAlumno(int id){
    
    Alumno alumno = null;
    String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
    PreparedStatement ps = null;
    
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                alumno= new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
                
            }
            
            ps.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Debes ingresar un id");
        }
    
    
    return alumno;
    }
    
    public Alumno buscarAlumnoPorDni(int dni){
    Alumno alumno = null;
    String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni=? AND estado = 1";
    PreparedStatement ps = null;
    
        try {
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
                
            } else {
            JOptionPane.showMessageDialog(null, "No existe el alumno o faltan datos.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
        }
    
    
        return alumno;
    }
    
    public List<Alumno> listarAlumnos(){ 
            List<Alumno> alumnos = new ArrayList();
        
     String sql = "SELECT * FROM alumno WHERE estado = 1";
     
     
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
                alumnos.add(alumno);
              
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+ex.getMessage());
        }
     
     
     
     return alumnos;
     
    
    
}

public void modificarAlumno(Alumno alumno){
    String sql = "UPDATE alumno SET  dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ? WHERE idAlumno = ?";
    PreparedStatement ps = null;
    
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1){
            JOptionPane.showConfirmDialog(null, "Alumno modificado exitosamente.");
            }else{
            JOptionPane.showMessageDialog(null, "El alumno no existe");
            }
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al accerder a la tabla alumno "+ex.getMessage());
        }
      
}

public void eliminarAlumno(int id){
    String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ? ";
    PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if(fila ==1){
                JOptionPane.showMessageDialog(null, "Se elimino el alumno.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
 
    

}




}