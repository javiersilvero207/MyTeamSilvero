/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelitos.MiModeloSilvero;
import Ventanas.MiVistaSilvero;
import Ventanas.PantallaDeCarga;

/**
 *
 * @author dam2
 */
public class MiControladorSilvero {
    
    //DECLARO VARIABLES DE VISTA Y MODELO
    private static MiVistaSilvero ventanita;
    private MiModeloSilvero modelito;
    public static PantallaDeCarga pantallita;
    // HAGO CONSTRUCTOR Y GETTERS AND SETTERS DEL CONTROLADOR
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

    
    
    
    public MiControladorSilvero(MiVistaSilvero ventanita, MiModeloSilvero modelito, PantallaDeCarga pantallita) {
        this.ventanita = ventanita;
        this.modelito = modelito;
        this.pantallita = pantallita;
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


}