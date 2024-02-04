package co.edu.unisabana.clases.example.solid.main;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public class MateriaHandler {

    public static void handleMaterias(Estudiante estudiante) {
        if (estudiante.carrera.equals("Informatica")) {
            System.out.println("Manejo de materias para Informatica");
        } else if (estudiante.carrera.equals("Administracion")) {
            System.out.println("Manejo de materias para Administracion");
        } else if (estudiante.carrera.equals("Industrial")) {
            System.out.println("Manejo de materias para Industrial");
        } else {
            System.out.println("Carrera no reconocida: " + estudiante.carrera);
        }
    }
}
