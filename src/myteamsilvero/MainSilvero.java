/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myteamsilvero;

/**
 *
 * @author dam2
 */
public class MainSilvero {
    
    
        public static void main(String[] args) {
            // Declaramos objetos del proyecto (MVC)
            MiModeloSilvero modelo = new MiModeloSilvero();
            MiVistaSilvero ventana = new MiVistaSilvero();
            MiControladorSilvero controlador = new MiControladorSilvero(ventana, modelo);

            // Se abre la ventana
            ventana.setVisible(true);
        }

    
    
}
