/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Entidades;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.Conexion;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.AccesoADatos.MateriaData;

public class Main {

    public static void main(String[] args) {
        Conexion EXP = new Conexion();
        Conexion.getConexion();

        AlumnoData alumnodata = new AlumnoData();
        InscripcionData inscripciondata = new InscripcionData();
        MateriaData materiadata = new MateriaData();
        Alumno alum = new Alumno();
        Materia mat = new Materia();
        Inscripcion ins = new Inscripcion();
        
    }
}
