/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import dao.DAOFuncionarios;
import entidade.Funcionarios;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab01_Aluno
 */
public final class JFLoginInicio extends javax.swing.JFrame {

    /**
     * Creates new form TelaLoginInicio
     */
    public JFLoginInicio() {
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

        jPanel1 = new javax.swing.JPanel();
        jPLogin = new javax.swing.JPanel();
        jLSenhaFunci = new javax.swing.JLabel();
        jTFUsuarioFunci = new javax.swing.JTextField();
        jPFSenhaFunci = new javax.swing.JPasswordField();
        jBEntrar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jLUsuarioFunci = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLPlanoFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login do Sistema");
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1402, 11, 0, 177);

        jPLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Para acessar o sistema, informe o seu USUÁRIO, SENHA e TIPO DE USUÁRIO !", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLSenhaFunci.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLSenhaFunci.setText("Senha:");

        jPFSenhaFunci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPFSenhaFunciKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPFSenhaFunciKeyTyped(evt);
            }
        });

        jBEntrar.setText("Entrar");
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jLUsuarioFunci.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLUsuarioFunci.setText("Usuário:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter_face/imagem/k.png"))); // NOI18N

        javax.swing.GroupLayout jPLoginLayout = new javax.swing.GroupLayout(jPLogin);
        jPLogin.setLayout(jPLoginLayout);
        jPLoginLayout.setHorizontalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPLoginLayout.createSequentialGroup()
                        .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLUsuarioFunci)
                            .addComponent(jLSenhaFunci))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPFSenhaFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFUsuarioFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLoginLayout.createSequentialGroup()
                        .addComponent(jBEntrar)
                        .addGap(18, 18, 18)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGap(135, 135, 135))
        );
        jPLoginLayout.setVerticalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPLoginLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFUsuarioFunci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLUsuarioFunci))
                        .addGap(24, 24, 24)
                        .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLSenhaFunci)
                            .addComponent(jPFSenhaFunci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBEntrar)
                            .addComponent(jBSair)))
                    .addGroup(jPLoginLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(jPLogin);
        jPLogin.setBounds(110, 110, 520, 280);

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter_face/imagem/dumbells.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -50, 790, 590);
        getContentPane().add(jLPlanoFundo);
        jLPlanoFundo.setBounds(0, 0, 780, 500);

        setSize(new java.awt.Dimension(797, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed

        try {
            Funcionarios funcionario = new Funcionarios();
            funcionario.setUsuario(jTFUsuarioFunci.getText());
            funcionario.setSenha(String.valueOf(jPFSenhaFunci.getPassword()));

            Funcionarios funci = new Funcionarios();
            DAOFuncionarios daofunci = new DAOFuncionarios();
            funci = daofunci.PesquisaLogin(funcionario);

            String usuario_banco = funci.getUsuario();
            String senha_banco = funci.getSenha();

            if ((funcionario.getUsuario().equals(usuario_banco))
                    && (funcionario.getSenha().equals(senha_banco))) {

                this.setVisible(false);

                JFFormularioPrincipal form = new JFFormularioPrincipal(funci);
                form.setVisible(true);

                JOptionPane.showMessageDialog(rootPane, "SEJA BEM - VINDO (a) " + funci.getNome());
            }

            if ((usuario_banco == null)
                    || (senha_banco == null)) {

                JOptionPane.showMessageDialog(rootPane, "USUÁRIO ou SENHA incorreto(s) !", "ACESSO NEGADO", 1);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JFLoginInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:

        System.exit(0);

    }//GEN-LAST:event_formWindowClosed

    private void jPFSenhaFunciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPFSenhaFunciKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jPFSenhaFunciKeyTyped

    private void jPFSenhaFunciKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPFSenhaFunciKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPFSenhaFunciKeyPressed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

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
            java.util.logging.Logger.getLogger(JFLoginInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLoginInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLoginInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLoginInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLoginInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEntrar;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLPlanoFundo;
    private javax.swing.JLabel jLSenhaFunci;
    private javax.swing.JLabel jLUsuarioFunci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPFSenhaFunci;
    private javax.swing.JPanel jPLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFUsuarioFunci;
    // End of variables declaration//GEN-END:variables
}
