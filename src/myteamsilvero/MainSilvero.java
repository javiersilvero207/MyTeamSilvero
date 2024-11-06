/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myteamsilvero;

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
            MiControladorSilvero butler = new MiControladorSilvero(ventanita, modelito);

            // Se abre la ventana
            ventanita.setVisible(true);
        }

    
    
}
