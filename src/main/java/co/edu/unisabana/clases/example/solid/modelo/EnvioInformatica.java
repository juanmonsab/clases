package co.edu.unisabana.clases.example.solid.modelo;

import java.util.List;

public class EnvioInformatica extends Envio{
    public List<String> material;

    @Override
    public String toString() {
        return "EnvioInformatica{" +
                "material=" + material +
                ", saludoDirector='" + saludoDirector + '\'' +
                '}';
    }
}
