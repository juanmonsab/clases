package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Envio;

public interface EmailService {
    
    void establecerConexion();

    void enviarEmail(Envio envio);
}