package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Envio;

public class EmailOutlook implements EmailService {

  @Override
  public void establecerConexion() {
    System.out.println("ESTABLECIENDO CONEXION CON EL SERVIDOR");
  }

  @Override
  public void enviarEmail(Envio envio) {
    System.out.println("EMAIL ENVIADO y correspondencia " + envio);
  }
}
