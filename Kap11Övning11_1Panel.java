/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package kapitel11Övning11_1;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author dogge
 */
public class Kap11Övning11_1Panel extends javax.swing.JPanel {
String vägskylt = "röd";

     
    public Kap11Övning11_1Panel() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSlåom = new javax.swing.JButton();

        btnSlåom.setText("Slå om");
        btnSlåom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSlåomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnSlåom)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnSlåom)
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSlåomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSlåomActionPerformed
        
        if (vägskylt.equals("röd")) {
vägskylt = "grön";
} else {
vägskylt = "röd";
}
repaint();

        
    }//GEN-LAST:event_btnSlåomActionPerformed

protected void paintComponent(Graphics g){
    super.paintComponent(g);
    
    g.setColor(Color.black);
    g.drawRect(30, 100, 50, 150);
    g.fillRect(30, 100, 50, 150);
    
    if(vägskylt.equals("grön")){
        g.setColor(Color.GREEN);
        g.drawOval(32, 200, 45, 45);
        g.fillOval(32, 200, 45, 45);
}
    else {
        g.setColor(Color.RED);
        g.drawOval(32, 100, 45, 45);
        g.fillOval(32,100,45,45);
}
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSlåom;
    // End of variables declaration//GEN-END:variables
}
