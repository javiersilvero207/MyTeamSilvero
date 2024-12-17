/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelitos.MiModeloSilvero;
import Ventanas.MiVistaSilvero;
import Ventanas.PantallaDeCarga;
import Ventanas.VentanaConf;

/**
 *
 * @author Javier Silvero
 */
public class MainSilvero {
    
    
        public static void main(String[] args) {
            System.out.println("Iniciando programa...");
            // Declaramos objetos del proyecto (MVC)
            MiModeloSilvero modelito = new MiModeloSilvero();
            MiVistaSilvero ventanita = new MiVistaSilvero();
            PantallaDeCarga pantallita = new PantallaDeCarga();
            VentanaConf retoques = new VentanaConf(pantallita, true);
            
            MiControladorSilvero butler = new MiControladorSilvero(ventanita, modelito, pantallita, retoques);

            // Se abre la ventana
            butler.Arranque();

        }

    
    
}
