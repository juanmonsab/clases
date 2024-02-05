package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Envio;
import co.edu.unisabana.clases.example.solid.modelo.EnvioInformatica;
import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

import java.util.ArrayList;

public class EnvioMaterial {

  private final EmailService emailService;

  public EnvioMaterial(EmailService emailService) {
    this.emailService = emailService;
  }

  public void enviarMaterialEstudiante(Estudiante estudiante) {
    if (estudiante.carrera.equals("Informatica")) {
      EnvioInformatica envio = new EnvioInformatica();
      envio.material = new ArrayList<>();
      envio.material.add("Computador");
      envio.material.add("Mouse");
      envio.saludoDirector = "Jenny envia saludos";
      emailService.establecerConexion();
      emailService.enviarEmail(envio);
    } else if (estudiante.carrera.equals("Administracion")) {

    } else if (estudiante.carrera.equals("Industrial")) {

    } else {
    }
  }
}
