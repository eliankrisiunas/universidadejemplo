
package universidadejemplo.Entidades;

public class Materia {
    int idMateria;
    String nombre;
    int añoMateria;
    boolean estado;

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int añoMateria, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.añoMateria = añoMateria;
        this.estado = estado;
    }

    public Materia(String nombre, int añoMateria, boolean estado) {
        this.nombre = nombre;
        this.añoMateria = añoMateria;
        this.estado = estado;
    }


    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return añoMateria;
    }

    public void setAño(int añoMateria) {
        this.añoMateria = añoMateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", añoMateria=" + añoMateria + ", estado=" + estado + '}';
    }
    


    
}
