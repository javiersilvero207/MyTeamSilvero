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
    private MiVistaSilvero ventanita;
    private MiModeloSilvero modelito;
    
    // HAGO CONSTRUCTOR Y GETTERS AND SETTERS DEL CONTROLADOR

    public MiControladorSilvero(MiVistaSilvero ventanita, MiModeloSilvero modelito) {
        this.ventanita = ventanita;
        this.modelito = modelito;
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