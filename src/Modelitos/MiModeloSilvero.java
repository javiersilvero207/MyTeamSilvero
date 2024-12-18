package Modelitos;

import static Controlador.MiControladorSilvero.retoques;
import java.awt.Dimension;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author capri
 */
public class MiModeloSilvero {
    private Controlador.MiControladorSilvero controlcito;
    private String nombre;
    private String equipo;
    private String posicion;

    public static Dimension getPreferredSize(){   
    return new Dimension(640,480);
}
    public void agregarJugador() {
    nombre = retoques.getTFNombre().getText();
    equipo = retoques.getTFEquipo().getText();
    posicion = retoques.getTFPosicion().getText();
    String jugador = "Has añadido a: " + nombre + "que juega en los " + equipo + " en las posicion de " 
            + posicion;
    String rutaArchivo = "jugadores.txt";
    
    try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
        escritor.write(jugador);
        escritor.newLine(); 
        System.out.println("Jugador guardado correctamente: " + jugador);
       
    } catch (IOException e) {
        System.err.println("Error al guardar el jugador: " + e.getMessage());
    }
}
}
