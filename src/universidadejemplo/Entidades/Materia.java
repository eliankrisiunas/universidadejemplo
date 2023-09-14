
package universidadejemplo.Entidades;

public class Materia {
    int idMateria;
    String nombre;
    int anno;
    boolean estado;

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int anno, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anno = anno;
        this.estado = estado;
    }

    public Materia(String nombre, int anno, boolean estado) {
        this.nombre = nombre;
        this.anno = anno;
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

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return idMateria + " " + nombre + " " + anno ;
    }
    


    
}
