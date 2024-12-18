/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Controlador.MiControladorSilvero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dam2
 */
public class MiVistaSilvero extends javax.swing.JFrame implements ActionListener{


    
    /**
     * Creates new form Vista
     */
public MiVistaSilvero(){
initComponents();
}




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPDecoracion = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        ImgPrincipal = new javax.swing.JLabel();
        JPBotonera = new javax.swing.JPanel();
        btnEmpezar = new javax.swing.JButton();
        btnOpciones = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 255, 51));
        Titulo.setText("MYTEAM");

        ImgPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconoMenu.png"))); // NOI18N

        javax.swing.GroupLayout JPDecoracionLayout = new javax.swing.GroupLayout(JPDecoracion);
        JPDecoracion.setLayout(JPDecoracionLayout);
        JPDecoracionLayout.setHorizontalGroup(
            JPDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPDecoracionLayout.createSequentialGroup()
                .addComponent(ImgPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPDecoracionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        JPDecoracionLayout.setVerticalGroup(
            JPDecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPDecoracionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addComponent(ImgPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnEmpezar.setText("EMPEZAR");

        btnOpciones.setText("OPCIONES");

        btnSalir.setText("SALIR");

        javax.swing.GroupLayout JPBotoneraLayout = new javax.swing.GroupLayout(JPBotonera);
        JPBotonera.setLayout(JPBotoneraLayout);
        JPBotoneraLayout.setHorizontalGroup(
            JPBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBotoneraLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(JPBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        JPBotoneraLayout.setVerticalGroup(
            JPBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBotoneraLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPDecoracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPDecoracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPBotonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgPrincipal;
    private javax.swing.JPanel JPBotonera;
    private javax.swing.JPanel JPDecoracion;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JButton btnOpciones;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables

    @Override
    public  void actionPerformed(ActionEvent e) {
     switch (e.getActionCommand()){
                  case "EMPEZAR":
             System.out.println("e---> Empezar");
             break;
                  case "OPCIONES":
             System.out.println("e---> Opciones");
                      System.out.println("Redirigiendo a ventana de lista de jugadores");
                      MiControladorSilvero.InicioJDialog();
             break;
                  case "SALIR":
             System.out.println("Has salido del programa");
             System.out.println("Hasta pronto");
             System.exit(0);
             break;
                default:
                    System.out.println("No esta claro....");
                 break;
     }
        
    }

    public void addActionListenerbtnEmpezar(MiControladorSilvero aThis) {
        btnEmpezar.addActionListener(this);
    }

    public void addActionListenerbtnOpciones(MiControladorSilvero aThis) {
       btnOpciones.addActionListener(this);
    }

    public void addActionListenerbtnSalir(MiControladorSilvero aThis) {
      btnSalir.addActionListener(this);
    }



}
