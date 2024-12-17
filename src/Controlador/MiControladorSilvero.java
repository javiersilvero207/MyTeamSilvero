/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelitos.MiModeloSilvero;
import Ventanas.MiVistaSilvero;
import Ventanas.PantallaDeCarga;
import Ventanas.VentanaConf;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author dam2
 */
public class MiControladorSilvero {
    
    //DECLARO VARIABLES DE VISTA Y MODELO
    private static MiVistaSilvero ventanita;
    private MiModeloSilvero modelito;
    public static PantallaDeCarga pantallita;
    public static VentanaConf retoques;
    private String nombre;
    private String equipo;
    private String posicion;

    // HAGO CONSTRUCTOR Y GETTERS AND SETTERS DEL CONTROLADOR
    
    public void Escuchadores (){
    ventanita.addActionListenerbtnEmpezar(this);
    ventanita.addActionListenerbtnOpciones(this);
    ventanita.addActionListenerbtnSalir(this);
    retoques.addActionListenerTFEquipo(this);
    retoques.addActionListenerTFNombre(this);
    retoques.addActionListenerTFPosicion(this);

    
}

    public MiControladorSilvero() {
    }
    
    public static void Arranque (){
    InicioCarga();
    pantallita.dispose();
    InicioPrincipal();
    
    }
    public static void InicioCarga(){  
        pantallita.setVisible(true);
    }
    public static void InicioPrincipal(){  
        ventanita.setVisible(true);
    }
    public static void InicioJDialog(){
        retoques.setVisible(true);
    } 
    
    
    
    public MiControladorSilvero(MiVistaSilvero ventanita, MiModeloSilvero modelito, PantallaDeCarga pantallita, VentanaConf retoques) {
        this.ventanita = ventanita;
        this.modelito = modelito;
        this.pantallita = pantallita;
        this.retoques = retoques;        
        Escuchadores();
        agregarJugador();
    }

    public MiVistaSilvero getVentanita() {
        return ventanita;
    }

    public void setVentanita(MiVistaSilvero ventanita) {
        this.ventanita = ventanita;
    }

    public MiModeloSilvero getModelito() {
        return modelito;
    }

    public void setModelito(MiModeloSilvero modelito) {
        this.modelito = modelito;
    }

public void agregarJugador() {
    nombre = retoques.getTFNombre().getText();
    equipo = retoques.getTFEquipo().getText();
    posicion = retoques.getTFPosicion().getText();
    String jugador = nombre + "," + equipo + "," + posicion;
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