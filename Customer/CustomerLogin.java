/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapidrentals;


public class CustomerLogin extends javax.swing.JFrame {

    /**
     * Creates new form Frame3
     */
    public CustomerLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        NAME_JLABEL = new javax.swing.JLabel();
        PASS_JLABEL = new javax.swing.JLabel();
        NAME_jTextField = new javax.swing.JTextField();
        PASSWORD_jTextField = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        NAME_JLABEL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NAME_JLABEL.setText("NAME");
        getContentPane().add(NAME_JLABEL);
        NAME_JLABEL.setBounds(80, 60, 50, 14);

        PASS_JLABEL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PASS_JLABEL.setText("PASSWORD");
        getContentPane().add(PASS_JLABEL);
        PASS_JLABEL.setBounds(50, 110, 90, 20);

        NAME_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAME_jTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NAME_jTextField);
        NAME_jTextField.setBounds(140, 60, 170, 30);
        getContentPane().add(PASSWORD_jTextField);
        PASSWORD_jTextField.setBounds(140, 110, 170, 30);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton1.setText("LOGIN");
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(130, 190, 90, 20);

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton2.setText("SIGNUP");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(275, 260, 110, 23);

        pack();
    }// </editor-fold>                        

    private void NAME_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel NAME_JLABEL;
    private javax.swing.JTextField NAME_jTextField;
    private javax.swing.JTextField PASSWORD_jTextField;
    private javax.swing.JLabel PASS_JLABEL;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration                   
}
