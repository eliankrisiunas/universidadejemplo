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

//        InscripcionData insd = new InscripcionData();
//        LocalDate fecha = LocalDate.of(2002, Month.MARCH, 16);
//        AlumnoData alumnodata = new AlumnoData();
//        Alumno alum;
//        alum = alumnodata.buscarAlumno(4);
//        MateriaData materiadata = new MateriaData();
//        Materia mat;
//        mat = materiadata.buscarMateria(5);
//        Inscripcion ins = new Inscripcion(alum, mat, 6);
//        insd.guardarInscripcion(ins);
//        insd.obtenerInscripcionPorAlumno(7);
//        insd.borrarInscripcionMateriaAlumno(4, 5);
//        for (Materia mat : insd.obtenerMateriasNoCursadas(5)) {
//            System.out.println(mat.getNombre());
//            System.out.println(mat.getIdMateria());
//            System.out.println(mat.getAnno());
//            System.out.println(mat.isEstado());
//        }
//        insd.obtenerAlumnosXMateria(5);
//        for (Materia mat : insd.obtenerMateriaCursadas(4)) {
//            System.out.println(mat.getNombre());
//            System.out.println(mat.getIdMateria());
//            System.out.println(mat.getAnno());
//            System.out.println(mat.isEstado());
//        }
//        insd.actualizarNota(10, 4, 5);
    }
}
