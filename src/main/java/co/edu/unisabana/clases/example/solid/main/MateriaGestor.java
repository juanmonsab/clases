package co.edu.unisabana.clases.example.solid.main;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public class MateriaGestor {

    public static void gestionMaterias(Estudiante estudiante) {
        switch (estudiante.carrera) {
            case "Informatica" -> System.out.println("Programacion, Arquitectura, Base de datos");
            case "Administracion" -> System.out.println("Negocios, Administracion I, Historia de la Administracion");
            case "Industrial" -> System.out.println("Procesos, Analitica de datos, Gestion de Calidad ");
            default -> System.out.println("Carrera no reconocida: " + estudiante.carrera);
        }
    }
}
