/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myteamsilvero;

/**
 *
 * @author dam2
 */
public class MiControladorSilvero {
    
    //DECLARO VARIABLES DE VISTA Y MODELO
    private MiVistaSilvero ventana;
    private MiModeloSilvero modelo;
    
    // HAGO CONSTRUCTOR DEL CONTROLADOR
    public MiControladorSilvero(MiVistaSilvero ventana, MiModeloSilvero modelo) {
        this.ventana = ventana;
        this.modelo = modelo;
    }

    public MiVistaSilvero getVentana() {
        return ventana;
    }

    public void setVentana(MiVistaSilvero ventana) {
        this.ventana = ventana;
    }

    public MiModeloSilvero getModelo() {
        return modelo;
    }

    public void setModelo(MiModeloSilvero modelo) {
        this.modelo = modelo;
    }
    
        
}
