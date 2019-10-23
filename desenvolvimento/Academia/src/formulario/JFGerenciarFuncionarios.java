/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import dao.DAOCargos;
import dao.DAOFuncionarios;
import entidade.Cargos;
import entidade.Funcionarios;
import entidade.Login;
import java.awt.Color;
import static java.awt.Color.RED;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lab01_Aluno
 */
public final class JFGerenciarFuncionarios extends javax.swing.JFrame {

    Funcionarios acesso_funci;

    public JFGerenciarFuncionarios(Funcionarios funci) throws ClassNotFoundException, SQLException, ParseException {
        initComponents();

        acesso_funci = funci;

        populaTabelaFunci();

        populaComboBox();
    }

    public JFGerenciarFuncionarios() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFNomeFunci = new javax.swing.JTextField();
        jDCNasciFunci = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTFTelefoneFunci = new javax.swing.JFormattedTextField();
        jTFCelularFunci1 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jCBCargos = new javax.swing.JComboBox<>();
        jLLoginFunci = new javax.swing.JLabel();
        jTFUsuarioFunci = new javax.swing.JTextField();
        jLSenhaFunci = new javax.swing.JLabel();
        jTFSenhaFunci = new javax.swing.JPasswordField();
        jChBConfirmaLogin = new javax.swing.JCheckBox();
        jLConfirmaUsuario = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jBExcluirFunci = new javax.swing.JButton();
        jB_NovoCadastro = new javax.swing.JButton();
        jBCadastrarFunci = new javax.swing.JButton();
        jBEditarFunci = new javax.swing.JButton();
        jTFRG = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_PesquisarFunci = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFunci = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel_FotoFunci = new javax.swing.JLabel();
        jTextField_FotoFunci = new javax.swing.JTextField();
        jB_PesquisaFotoFunci = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Funcionários");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar  Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jTFNomeFunci.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTFNomeFunci.setEnabled(false);
        jTFNomeFunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeFunciActionPerformed(evt);
            }
        });

        jDCNasciFunci.setEnabled(false);
        jDCNasciFunci.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Data de Nascimento:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Telefone:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Celular:");

        try {
            jTFTelefoneFunci.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTFTelefoneFunci.setAutoscrolls(false);
        jTFTelefoneFunci.setEnabled(false);
        jTFTelefoneFunci.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        try {
            jTFCelularFunci1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTFCelularFunci1.setEnabled(false);
        jTFCelularFunci1.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Cargo:");

        jCBCargos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        jCBCargos.setEnabled(false);
        jCBCargos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBCargosItemStateChanged(evt);
            }
        });
        jCBCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCargosActionPerformed(evt);
            }
        });

        jLLoginFunci.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLLoginFunci.setText("Login:");

        jTFUsuarioFunci.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTFUsuarioFunci.setEnabled(false);
        jTFUsuarioFunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsuarioFunciActionPerformed(evt);
            }
        });
        jTFUsuarioFunci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFUsuarioFunciKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFUsuarioFunciKeyTyped(evt);
            }
        });

        jLSenhaFunci.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLSenhaFunci.setText("Senha:");

        jTFSenhaFunci.setEnabled(false);

        jChBConfirmaLogin.setEnabled(false);

        jLConfirmaUsuario.setEnabled(false);

        jBExcluirFunci.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBExcluirFunci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter_face/imagem/bin-full-icon (Custom).png"))); // NOI18N
        jBExcluirFunci.setText("Excluir Seleionado");
        jBExcluirFunci.setEnabled(false);
        jBExcluirFunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirFunciActionPerformed(evt);
            }
        });

        jB_NovoCadastro.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jB_NovoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter_face/imagem/document-ok.png"))); // NOI18N
        jB_NovoCadastro.setText("Novo Cadastro");
        jB_NovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_NovoCadastroActionPerformed(evt);
            }
        });

        jBCadastrarFunci.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBCadastrarFunci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter_face/imagem/check-user-icon (Custom).png"))); // NOI18N
        jBCadastrarFunci.setText("Cadastrar Funcionário");
        jBCadastrarFunci.setEnabled(false);
        jBCadastrarFunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarFunciActionPerformed(evt);
            }
        });

        jBEditarFunci.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBEditarFunci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter_face/imagem/clip_paste.png"))); // NOI18N
        jBEditarFunci.setText("Editar Selecionado");
        jBEditarFunci.setEnabled(false);
        jBEditarFunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarFunciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBCadastrarFunci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBEditarFunci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBExcluirFunci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_NovoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBCadastrarFunci)
                .addGap(18, 18, 18)
                .addComponent(jBEditarFunci)
                .addGap(18, 18, 18)
                .addComponent(jBExcluirFunci)
                .addGap(18, 18, 18)
                .addComponent(jB_NovoCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try {
            jTFRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTFRG.setEnabled(false);
        jTFRG.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("RG:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLConfirmaUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTFTelefoneFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCelularFunci1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTFNomeFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDCNasciFunci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 47, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFRG)))
                    .addComponent(jChBConfirmaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLLoginFunci)
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTFUsuarioFunci)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLSenhaFunci)
                            .addComponent(jTFSenhaFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDCNasciFunci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFNomeFunci, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTelefoneFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCelularFunci1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel14))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFRG, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLConfirmaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLoginFunci)
                    .addComponent(jLSenhaFunci))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFUsuarioFunci)
                    .addComponent(jTFSenhaFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jChBConfirmaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione um Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel3.setToolTipText("");
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Nome:");

        jTextField_PesquisarFunci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_PesquisarFunciMouseClicked(evt);
            }
        });
        jTextField_PesquisarFunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PesquisarFunciActionPerformed(evt);
            }
        });
        jTextField_PesquisarFunci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_PesquisarFunciKeyReleased(evt);
            }
        });

        jTFunci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "RG", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTFunci.getTableHeader().setReorderingAllowed(false);
        jTFunci.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTFunciMouseDragged(evt);
            }
        });
        jTFunci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFunciMouseClicked(evt);
            }
        });
        jTFunci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFunciKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFunciKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTFunci);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_PesquisarFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_PesquisarFunci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto do Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel_FotoFunci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_FotoFunci.setEnabled(false);

        jB_PesquisaFotoFunci.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jB_PesquisaFotoFunci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter_face/imagem/camera_add.png"))); // NOI18N
        jB_PesquisaFotoFunci.setText("Pesquisar");
        jB_PesquisaFotoFunci.setEnabled(false);
        jB_PesquisaFotoFunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_PesquisaFotoFunciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel_FotoFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField_FotoFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_PesquisaFotoFunci)))
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel_FotoFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_FotoFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_PesquisaFotoFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1044, 691));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFunciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFunciMouseClicked

        DefaultTableModel modelo = (DefaultTableModel) jTFunci.getModel();

        if (jTFunci.getSelectedRow() != -1) {

            if (String.valueOf(modelo.getValueAt(jTFunci.getSelectedRow(), 0)).equals("VAZIO")) {

            } else {

                try {

                    jBCadastrarFunci.setEnabled(false);
                    jBEditarFunci.setEnabled(true);
                    jBExcluirFunci.setEnabled(true);

                    jTFNomeFunci.setEnabled(true);
                    jDCNasciFunci.setEnabled(true);
                    jTFRG.setEnabled(true);
                    jTFTelefoneFunci.setEnabled(true);
                    jCBCargos.setEnabled(true);
                    jTFCelularFunci1.setEnabled(true);
                    jB_PesquisaFotoFunci.setEnabled(true);
                    jTextField_FotoFunci.setEnabled(true);
                    jB_PesquisaFotoFunci.setEnabled(true);

                    if (acesso_funci.getCargo().getId_cargo() != 1) {
                        jLLoginFunci.setVisible(false);
                        jTFUsuarioFunci.setVisible(false);
                        jTFUsuarioFunci.setEnabled(false);
                        jLSenhaFunci.setVisible(false);
                        jTFSenhaFunci.setVisible(false);
                        jTFSenhaFunci.setEnabled(false);

                    } else {
                        jLLoginFunci.setVisible(true);
                        jTFUsuarioFunci.setVisible(true);
                        jTFUsuarioFunci.setEnabled(true);
                        jLSenhaFunci.setVisible(true);
                        jTFSenhaFunci.setVisible(true);
                        jTFSenhaFunci.setEnabled(true);
                    }

                    DAOFuncionarios daoafun = new DAOFuncionarios();
                    Funcionarios fun = new Funcionarios();

                    fun.setId_funcionario((int) modelo.getValueAt(jTFunci.getSelectedRow(), 0));

                    fun = daoafun.buscarFuncionario(fun);

                    int id_admin = 0;

                    if (fun.getCargo().getId_cargo() == 1) {
                        id_admin = fun.getCargo().getId_cargo();
                    }

                    if ((acesso_funci.getCargo().getId_cargo() != 1) && (fun.getCargo().getId_cargo() == id_admin)) {
                        JOptionPane.showMessageDialog(rootPane, "Somente um ADMINISTRADOR pode alterar outro ADMINISTRADOR !", "Alteração não permitida", 1);

                        jTFunci.clearSelection();

                        jTFNomeFunci.setEnabled(false);
                        jDCNasciFunci.setEnabled(false);
                        jTFRG.setEnabled(false);
                        jTFTelefoneFunci.setEnabled(false);
                        jCBCargos.setEnabled(false);
                        jTFCelularFunci1.setEnabled(false);
                        jB_PesquisaFotoFunci.setEnabled(false);
                        jTextField_FotoFunci.setEnabled(false);
                        jB_PesquisaFotoFunci.setEnabled(false);
                        jTFSenhaFunci.setEnabled(false);
                        jTFUsuarioFunci.setEnabled(false);

                        jTFNomeFunci.setText(null);
                        jDCNasciFunci.setDate(null);
                        jTFRG.setValue(null);
                        jTFTelefoneFunci.setValue(null);
                        jCBCargos.setSelectedItem(0);
                        jTFCelularFunci1.setValue(null);
                        jLabel_FotoFunci.setIcon(null);
                        jTextField_FotoFunci.setText(null);
                        jTFUsuarioFunci.setText(null);
                        jTFSenhaFunci.setText(null);

                        jBEditarFunci.setEnabled(false);
                        jBExcluirFunci.setEnabled(false);

                    }

                    if ((acesso_funci.getCargo().getId_cargo() != 1) && (fun.getCargo().getId_cargo() != id_admin)) {
                        jTFNomeFunci.setText(fun.getNome());
                        jTFRG.setValue(fun.getRg_funcionario());
                        jCBCargos.setSelectedItem(fun.getCargo().getId_cargo() + " - " + fun.getCargo().getNome_cargo());
                        jTFUsuarioFunci.setText(fun.getUsuario());
                        jTFSenhaFunci.setText(fun.getSenha());

                        if (fun.getData_nasc_funcionario() != null) {
                            Date data = new SimpleDateFormat("yyyy-MM-dd").parse(fun.getData_nasc_funcionario().toString());
                            jDCNasciFunci.setDate(data);
                        } else {
                            jDCNasciFunci.setDate(null);
                        }

                        if (fun.getTelefone() != null) {
                            jTFTelefoneFunci.setValue(fun.getTelefone());
                        } else {
                            jTFTelefoneFunci.setValue("(00)0000-0000");
                        }

                        if (fun.getCelular().isEmpty() == false) {
                            jTFCelularFunci1.setValue(fun.getCelular());
                        } else {
                            jTFCelularFunci1.setValue("(00)0-0000-0000");
                        }

                        if (fun.getFoto_funcionario() != null) {
                            ImageIcon imagem = new ImageIcon((byte[]) fun.getFoto_funcionario());
                            jLabel_FotoFunci.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLabel_FotoFunci.getWidth(), jLabel_FotoFunci.getHeight(), Image.SCALE_DEFAULT)));
                        } else {
                            jLabel_FotoFunci.setIcon(null);
                            jLabel_FotoFunci.setHorizontalAlignment(0);
                            jLabel_FotoFunci.setText("SEM FOTO");
                        }
                    }

                    if (acesso_funci.getCargo().getId_cargo() == 1) {
                        jTFNomeFunci.setText(fun.getNome());
                        jTFRG.setValue(fun.getRg_funcionario());
                        jCBCargos.setSelectedItem(fun.getCargo().getId_cargo() + " - " + fun.getCargo().getNome_cargo());
                        jTFUsuarioFunci.setText(fun.getUsuario());
                        jTFSenhaFunci.setText(fun.getSenha());

                        if (fun.getData_nasc_funcionario() != null) {
                            Date data = new SimpleDateFormat("yyyy-MM-dd").parse(fun.getData_nasc_funcionario().toString());
                            jDCNasciFunci.setDate(data);
                        } else {
                            jDCNasciFunci.setDate(null);
                        }

                        if (fun.getTelefone() != null) {
                            jTFTelefoneFunci.setValue(fun.getTelefone());
                        } else {
                            jTFTelefoneFunci.setValue("(00)0000-0000");
                        }

                        if (fun.getCelular().isEmpty() == false) {
                            jTFCelularFunci1.setValue(fun.getCelular());
                        } else {
                            jTFCelularFunci1.setValue("(00)0-0000-0000");
                        }

                        if (fun.getFoto_funcionario() != null) {
                            ImageIcon imagem = new ImageIcon((byte[]) fun.getFoto_funcionario());
                            jLabel_FotoFunci.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLabel_FotoFunci.getWidth(), jLabel_FotoFunci.getHeight(), Image.SCALE_DEFAULT)));
                        } else {
                            jLabel_FotoFunci.setIcon(null);
                            jLabel_FotoFunci.setHorizontalAlignment(0);
                            jLabel_FotoFunci.setText("SEM FOTO");
                        }
                    }

                } catch (ParseException | ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(JFGerenciarAlunos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jTFunciMouseClicked

    private void jB_PesquisaFotoFunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_PesquisaFotoFunciActionPerformed
        // TODO add your handling code here:

        JFileChooser escolha_arq = new JFileChooser();
        escolha_arq.setDialogTitle("Selecione a Foto do Funcionário");
        escolha_arq.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int opc = escolha_arq.showOpenDialog(this);

        if (opc == JFileChooser.APPROVE_OPTION) {
            File arquivo = new File("Caminho");
            arquivo = escolha_arq.getSelectedFile();
            String nome_arquivo = arquivo.getAbsolutePath();

            jTextField_FotoFunci.setText(nome_arquivo);

            jLabel_FotoFunci.setText(null);

            ImageIcon imagem = new ImageIcon(arquivo.getPath());
            jLabel_FotoFunci.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLabel_FotoFunci.getWidth(), jLabel_FotoFunci.getHeight(), Image.SCALE_DEFAULT)));

        }
    }//GEN-LAST:event_jB_PesquisaFotoFunciActionPerformed

    private void jTextField_PesquisarFunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PesquisarFunciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PesquisarFunciActionPerformed

    private void jB_NovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_NovoCadastroActionPerformed
        // TODO add your handling code here:

        //Desativa BOTÕES
        jBEditarFunci.setEnabled(false);
        jBExcluirFunci.setEnabled(false);

        //ATIVA CAMPOS
        jTFNomeFunci.setEnabled(true);
        jDCNasciFunci.setEnabled(true);
        jTFRG.setEnabled(true);
        jTFTelefoneFunci.setEnabled(true);
        jCBCargos.setEnabled(true);
        jCBCargos.setSelectedIndex(0);
        jTFCelularFunci1.setEnabled(true);
        jTextField_FotoFunci.setEnabled(true);
        jLLoginFunci.setVisible(true);
        jTFUsuarioFunci.setVisible(true);
        jTFUsuarioFunci.setEnabled(true);
        jLSenhaFunci.setVisible(true);
        jTFSenhaFunci.setVisible(true);
        jTFSenhaFunci.setEnabled(true);

        //ATIVA BOTÕES
        jBCadastrarFunci.setEnabled(true);
        jB_PesquisaFotoFunci.setEnabled(true);

        //OCULTA CAMPOS
        jChBConfirmaLogin.setVisible(false);
        jLConfirmaUsuario.setVisible(false);

        //Anula testo dos CAMPOS
        jTFNomeFunci.setText(null);
        jDCNasciFunci.setDate(null);
        jTFRG.setValue(null);
        jTFTelefoneFunci.setValue(null);
        jCBCargos.setSelectedItem(0);
        jTFCelularFunci1.setValue(null);
        jLabel_FotoFunci.setIcon(null);
        jTextField_FotoFunci.setText(null);
        jTFUsuarioFunci.setText(null);
        jTFSenhaFunci.setText(null);

    }//GEN-LAST:event_jB_NovoCadastroActionPerformed

    private void jBExcluirFunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirFunciActionPerformed
        // TODO add your handling code here:

        try {
            DefaultTableModel modelo = (DefaultTableModel) jTFunci.getModel();

            Funcionarios funci = new Funcionarios();

            DAOFuncionarios daofun = new DAOFuncionarios();

            if (jTFunci.getSelectedRow() != -1) {

                int confirma = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?", null, 1);
                if (confirma == JOptionPane.YES_OPTION) {

                    String item = jCBCargos.getSelectedItem().toString();
                    String[] texto = item.split(" - ");
                    Cargos cargo = new Cargos();
                    cargo.setId_cargo((Integer.parseInt(texto[0])));
                    funci.setCargo(cargo);
                    List<Funcionarios> lista_funci = new ArrayList<Funcionarios>();

                    lista_funci = daofun.buscaTodosFuncionarios(funci);

//                    if () {
//                        JOptionPane.showConfirmDialog(rootPane, "Não é permitido excluir o único ADMINISTRADOR !");
//                    }

                    funci.setId_funcionario((int) modelo.getValueAt(jTFunci.getSelectedRow(), 0));
                    daofun.apagarFuncionario(funci);

                    populaTabelaFunci();

                    //DESATIVA BOTÕES
                    jBExcluirFunci.setEnabled(false);
                    jBEditarFunci.setEnabled(false);
                    jB_PesquisaFotoFunci.setEnabled(false);

                    //Anula testo dos CAMPOS
                    jTFNomeFunci.setText(null);
                    jDCNasciFunci.setDate(null);
                    jTFRG.setValue(null);
                    jTFTelefoneFunci.setValue(null);
                    jCBCargos.setSelectedItem(null);
                    jTFCelularFunci1.setValue(null);
                    jTFUsuarioFunci.setText(null);
                    jTFSenhaFunci.setText(null);

                    jLabel_FotoFunci.setIcon(null);
                    jTextField_FotoFunci.setText(null);

                    //Desativa CAMPOS
                    jTFNomeFunci.setEnabled(false);
                    jDCNasciFunci.setEnabled(false);
                    jTFRG.setEnabled(false);
                    jTFTelefoneFunci.setEnabled(false);
                    jCBCargos.setEnabled(false);
                    jTFCelularFunci1.setEnabled(false);
                    jTextField_FotoFunci.setEnabled(false);
                    jTFUsuarioFunci.setEnabled(false);
                    jTFSenhaFunci.setEnabled(false);
                }

                if (confirma == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Não Excluído!");
                }
                if (confirma == JOptionPane.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(null, "Cancelado!");
                }
                if (confirma == JOptionPane.CLOSED_OPTION) {

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Nenhum Registro Selecionado!");

            }

        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(JFGerenciarFuncionarios.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBExcluirFunciActionPerformed

    private void jBEditarFunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarFunciActionPerformed
        try {
            // TODO add your handling code here:

            DefaultTableModel modelo = (DefaultTableModel) jTFunci.getModel();

            Login login = new Login();
            login.setUsuario(jTFUsuarioFunci.getText());

            Funcionarios fun = new Funcionarios();
            fun.setId_funcionario((int) modelo.getValueAt(jTFunci.getSelectedRow(), 0));

            if (jTFNomeFunci.getText().isEmpty() == false) {
                fun.setNome(jTFNomeFunci.getText());
                jTFNomeFunci.setBackground(Color.WHITE);
            } else {
                jTFNomeFunci.setBackground(Color.RED);
            }

            if (jTFRG.getValue() != null) {
                fun.setRg_funcionario(String.valueOf(jTFRG.getValue()));
                jTFRG.setBackground(Color.WHITE);
            } else {
                jTFRG.setBackground(Color.RED);
            }

            if (jDCNasciFunci.getDate() != null) {
                fun.setData_nasc_funcionario(jDCNasciFunci.getDate());
            } else {
                fun.setData_nasc_funcionario(null);
            }

            if (jTFTelefoneFunci.getValue() != null) {
                fun.setTelefone(String.valueOf(jTFTelefoneFunci.getValue()));
            } else {
                fun.setTelefone("(00)0000-0000");
            }

            if (jTFCelularFunci1.getValue() != null) {
                fun.setCelular(String.valueOf(jTFCelularFunci1.getValue()));
            } else {
                fun.setCelular("(00)0-0000-0000");
            }

            if (!jCBCargos.getSelectedItem().equals("Selecionar")) {
                String item = jCBCargos.getSelectedItem().toString();
                String[] texto = item.split(" - ");
                Cargos cargo = new Cargos();
                cargo.setId_cargo((Integer.parseInt(texto[0])));

                fun.setCargo(cargo);
                jTFNomeFunci.setBackground(Color.WHITE);
            } else {
                jCBCargos.setBackground(Color.RED);
            }

            if (jTFUsuarioFunci.getText().isEmpty() == false) {
                fun.setUsuario(jTFUsuarioFunci.getText());
                jTFUsuarioFunci.setBackground(Color.WHITE);
            } else {
                jTFUsuarioFunci.setBackground(Color.RED);
            }

            if (String.valueOf(jTFSenhaFunci.getPassword()).isEmpty() == false) {
                fun.setSenha(String.valueOf(jTFSenhaFunci.getPassword()));
                jTFSenhaFunci.setBackground(Color.WHITE);
            } else {
                jTFSenhaFunci.setBackground(Color.RED);
            }

            if (jTextField_FotoFunci.getText() != null) {
                fun.setImagem_funcionario(jTextField_FotoFunci.getText());
            } else {
                fun.setImagem_funcionario(String.valueOf(null));
            }

            if ((jTFNomeFunci.getText().isEmpty() == true)
                    || (jTFRG.getValue() == null)
                    || (jCBCargos.getSelectedItem().equals("Selecionar"))
                    || (jTFUsuarioFunci.getText().isEmpty() == true)
                    || (String.valueOf(jTFSenhaFunci.getPassword()).isEmpty() == true)
                    || (jChBConfirmaLogin.isSelected() == false)) {

                JOptionPane.showMessageDialog(rootPane, "Não é permitido EDITAR um FUNCIONÁRIO sem :"
                        + "\n"
                        + "NOME;"
                        + "\n"
                        + "RG;"
                        + "\n"
                        + "CARGO;"
                        + "\n"
                        + "USUÁRIO;"
                        + "\n"
                        + "SENHA;"
                        + "\n"
                        + "OU USUÁRIO REPETIDO;", "Cadastro não permitido", 1);
            }

            if ((jTFNomeFunci.getText().isEmpty() == false)
                    && (jTFRG.getValue() != null)
                    && (!jCBCargos.getSelectedItem().equals("Selecionar"))
                    && (jTFUsuarioFunci.getText().isEmpty() == false)
                    && (String.valueOf(jTFSenhaFunci.getPassword()).isEmpty() == false)
                    && (jChBConfirmaLogin.isSelected() == true)) {

                DAOFuncionarios daofun = new DAOFuncionarios();
                daofun.editarFuncionarios(fun);

                populaTabelaFunci();

                //Desativa BOTÕES
                jBEditarFunci.setEnabled(false);
                jBExcluirFunci.setEnabled(false);
                jBCadastrarFunci.setEnabled(false);
                jB_PesquisaFotoFunci.setEnabled(false);

                //Desativa CAMPOS
                jTFNomeFunci.setEnabled(false);
                jDCNasciFunci.setEnabled(false);
                jTFRG.setEnabled(false);
                jTFTelefoneFunci.setEnabled(false);
                jCBCargos.setEnabled(false);
                jTFCelularFunci1.setEnabled(false);
                jTextField_FotoFunci.setEnabled(false);
                jTFSenhaFunci.setEnabled(false);
                jTFUsuarioFunci.setEnabled(false);

                //Anula testo dos CAMPOS
                jTFNomeFunci.setText(null);
                jDCNasciFunci.setDate(null);
                jTFRG.setValue(null);
                jTFTelefoneFunci.setValue(null);
                jCBCargos.setSelectedItem(null);
                jTFCelularFunci1.setValue(null);
                jLabel_FotoFunci.setIcon(null);
                jTextField_FotoFunci.setText(null);
                jTFSenhaFunci.setText(null);
                jTFUsuarioFunci.setText(null);
            }

        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(JFGerenciarFuncionarios.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBEditarFunciActionPerformed

    private void jBCadastrarFunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarFunciActionPerformed
        // TODO add your handling code here:

        try {
            DAOFuncionarios daofun = new DAOFuncionarios();
            Funcionarios funci = new Funcionarios();

            //ARMAZENA DADOS PESSOAIS
            if (jTFNomeFunci.getText().isEmpty() == false) {
                funci.setNome(jTFNomeFunci.getText());
                jTFNomeFunci.setBackground(null);
            } else {
                jTFNomeFunci.setBackground(Color.RED);
            }

            if (jTFRG.getValue() != null) {
                funci.setRg_funcionario(String.valueOf(jTFRG.getValue()));
                jTFRG.setBackground(null);
            } else {
                jTFRG.setBackground(Color.RED);
            }

            if (jTextField_FotoFunci.getText().isEmpty() == false) {
                funci.setImagem_funcionario(jTextField_FotoFunci.getText());
            } else {
                funci.setImagem_funcionario(null);
            }

            if (jDCNasciFunci.getDate() != null) {
                funci.setData_nasc_funcionario(jDCNasciFunci.getDate());
            } else {
                funci.setData_nasc_funcionario(null);
            }

            if (jTFTelefoneFunci.getValue() != null) {
                funci.setTelefone(String.valueOf(jTFTelefoneFunci.getValue()));
            } else {
                funci.setTelefone("(00)0000-0000");
            }

            if (jTFCelularFunci1.getValue() != null) {
                funci.setCelular(String.valueOf(jTFCelularFunci1.getValue()));
            } else {
                funci.setCelular("(00)0-0000-0000");
            }

            //ARMAZENA DADOS DO CARGO
            if (!jCBCargos.getSelectedItem().equals("Selecionar")) {
                String item = jCBCargos.getSelectedItem().toString();
                String[] texto = item.split(" - ");
                Cargos cargo = new Cargos();
                cargo.setId_cargo((Integer.parseInt(texto[0])));

                funci.setCargo(cargo);

                jCBCargos.setBackground(null);
            } else {
                jCBCargos.setBackground(Color.RED);
            }

            //ARMAZENA DADOS DO LOGIN
            if (jTFUsuarioFunci.getText().isEmpty() == false) {
                funci.setUsuario(jTFUsuarioFunci.getText());
                jTFUsuarioFunci.setBackground(null);
            } else {
                jTFUsuarioFunci.setBackground(Color.RED);
            }

            if (String.valueOf(jTFSenhaFunci.getPassword()).isEmpty() == false) {
                funci.setSenha(String.valueOf(jTFSenhaFunci.getPassword()));
                jTFSenhaFunci.setBackground(null);
            } else {
                jTFSenhaFunci.setBackground(Color.RED);
            }

            if ((jTFNomeFunci.getText().isEmpty() == true)
                    || (jTFRG.getValue() == null)
                    || (jCBCargos.getSelectedItem().equals("Selecionar"))
                    || (jTFUsuarioFunci.getText().isEmpty() == true)
                    || (String.valueOf(jTFSenhaFunci.getPassword()).isEmpty() == true)
                    || (jTFUsuarioFunci.getBackground() == RED)
                    || (jChBConfirmaLogin.isSelected() == false)) {

                JOptionPane.showMessageDialog(rootPane, "Não é permitido CADASTRAR um FUNCIONÁRIO sem :"
                        + "\n"
                        + "NOME;"
                        + "\n"
                        + "RG;"
                        + "\n"
                        + "CARGO;"
                        + "\n"
                        + "USUÁRIO;"
                        + "\n"
                        + "SENHA;"
                        + "\n"
                        + "OU USUÁRIO REPETIDO;", "Cadastro não permitido", 1);

            }

            if (((jTFNomeFunci.getText().isEmpty() == false)
                    && (jTFRG.getValue() != null)
                    && (!jCBCargos.getSelectedItem().equals("Selecionar"))
                    && (jTFUsuarioFunci.getText().isEmpty() == false)
                    && (String.valueOf(jTFSenhaFunci.getPassword()).isEmpty() == false))
                    && (jTFUsuarioFunci.getBackground() != RED)
                    && (jChBConfirmaLogin.isSelected() == true)) {

                daofun.cadastrarFuncionarios(funci);

                populaTabelaFunci();

                //Desativa BOTÕES
                jBEditarFunci.setEnabled(false);
                jBExcluirFunci.setEnabled(false);
                jBCadastrarFunci.setEnabled(false);

                //Desativa CAMPOS
                jTFNomeFunci.setEnabled(false);
                jDCNasciFunci.setEnabled(false);
                jTFRG.setEnabled(false);
                jTFTelefoneFunci.setEnabled(false);
                jCBCargos.setEnabled(false);
                jTFCelularFunci1.setEnabled(false);
                jTextField_FotoFunci.setEnabled(true);
                jTFUsuarioFunci.setEnabled(false);
                jTFSenhaFunci.setEnabled(false);

                //OCULTAR CAMPOS
                jChBConfirmaLogin.setVisible(false);
                jLConfirmaUsuario.setVisible(false);

                //Anula testo dos CAMPOS
                jTFNomeFunci.setText(null);
                jDCNasciFunci.setDate(null);
                jTFRG.setValue(null);
                jTFTelefoneFunci.setValue(null);
                jCBCargos.setSelectedItem("Selecionar");
                jTFCelularFunci1.setValue(null);
                jTFUsuarioFunci.setText(null);
                jTFSenhaFunci.setText(null);
                jChBConfirmaLogin.setText(null);
                jLConfirmaUsuario.setText(null);

                jLabel_FotoFunci.setIcon(null);
                jTextField_FotoFunci.setText(null);

            }
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(JFGerenciarFuncionarios.class
                    .getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jBCadastrarFunciActionPerformed

    private void jTFNomeFunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeFunciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeFunciActionPerformed

    private void jTextField_PesquisarFunciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PesquisarFunciKeyReleased

        try {

            jTFunci.clearSelection();

            DefaultTableModel modelo = (DefaultTableModel) jTFunci.getModel();
            modelo.getDataVector().removeAllElements();

            populaTabelaFunci();

        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(JFGerenciarAlunos.class
                    .getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jTextField_PesquisarFunciKeyReleased

    private void jTFUsuarioFunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUsuarioFunciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUsuarioFunciActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        jChBConfirmaLogin.setVisible(false);
        jLConfirmaUsuario.setVisible(false);

        jTFunci.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }//GEN-LAST:event_formWindowOpened

    private void jTFUsuarioFunciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFUsuarioFunciKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUsuarioFunciKeyTyped

    private void jTFUsuarioFunciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFUsuarioFunciKeyReleased
        // TODO add your handling code here:

        if (jBCadastrarFunci.isEnabled() == true) {

            try {
                DAOFuncionarios daofun = new DAOFuncionarios();
                Funcionarios fun = new Funcionarios();
                Funcionarios funci = new Funcionarios();

                if (jTFUsuarioFunci.getText().isEmpty() == false) {
                    funci.setUsuario(jTFUsuarioFunci.getText());
                    fun = daofun.pesquisaUsuario(funci);

                    if (fun.getUsuario() != null) {
                        jChBConfirmaLogin.setVisible(true);
                        jChBConfirmaLogin.setSelected(false);
                        jChBConfirmaLogin.setText("Este <USUÁRIO> já existe ! Tente outro...");
                    } else {

                        jChBConfirmaLogin.setVisible(true);
                        jChBConfirmaLogin.setSelected(true);
                        jChBConfirmaLogin.setText("<USUÁRIO> aceito !");
                    }
                } else {
                    jChBConfirmaLogin.setVisible(false);
                    jChBConfirmaLogin.setSelected(false);
                    jChBConfirmaLogin.setText(null);
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(JFGerenciarFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (jBEditarFunci.isEnabled() == true) {
            try {
                DAOFuncionarios daofun = new DAOFuncionarios();
                Funcionarios fun = new Funcionarios();
                Funcionarios funci = new Funcionarios();

                DefaultTableModel modelo = (DefaultTableModel) jTFunci.getModel();

                if (jTFUsuarioFunci.getText().isEmpty() == false) {
                    funci.setId_funcionario((int) modelo.getValueAt(jTFunci.getSelectedRow(), 0));
                    funci.setUsuario(jTFUsuarioFunci.getText());

                    fun = daofun.pesquisaUsuario(funci);

                    if (fun.getId_funcionario() != funci.getId_funcionario()) {

                        if (fun.getUsuario() != null) {
                            jChBConfirmaLogin.setVisible(true);
                            jChBConfirmaLogin.setSelected(false);
                            jChBConfirmaLogin.setText("Este <USUÁRIO> já existe ! Tente outro...");
                        } else {

                            jChBConfirmaLogin.setVisible(true);
                            jChBConfirmaLogin.setSelected(true);
                            jChBConfirmaLogin.setText("<USUÁRIO> aceito !");
                        }
                    } else {
                        jChBConfirmaLogin.setVisible(true);
                        jChBConfirmaLogin.setSelected(true);
                        jChBConfirmaLogin.setText("<USUÁRIO> aceito !");

                    }
                } else {
                    jChBConfirmaLogin.setVisible(false);
                    jChBConfirmaLogin.setSelected(false);
                    jChBConfirmaLogin.setText(null);
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(JFGerenciarFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTFUsuarioFunciKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

        dispose();

        JFFormularioPrincipal form = new JFFormularioPrincipal(acesso_funci);
        form.setVisible(true);

    }//GEN-LAST:event_formWindowClosing

    private void jTFunciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFunciKeyReleased
        // TODO add your handling code here:

        DefaultTableModel modelo = (DefaultTableModel) jTFunci.getModel();

        if (jTFunci.getSelectedRow() != -1) {

            if (String.valueOf(modelo.getValueAt(jTFunci.getSelectedRow(), 0)).equals("VAZIO")) {

            } else {

                try {

                    jBCadastrarFunci.setEnabled(false);
                    jBEditarFunci.setEnabled(true);
                    jBExcluirFunci.setEnabled(true);

                    jTFNomeFunci.setEnabled(true);
                    jDCNasciFunci.setEnabled(true);
                    jTFRG.setEnabled(true);
                    jTFTelefoneFunci.setEnabled(true);
                    jCBCargos.setEnabled(true);
                    jTFCelularFunci1.setEnabled(true);
                    jB_PesquisaFotoFunci.setEnabled(true);
                    jTextField_FotoFunci.setEnabled(true);
                    jB_PesquisaFotoFunci.setEnabled(true);

                    if (acesso_funci.getCargo().getId_cargo() != 1) {
                        jLLoginFunci.setVisible(false);
                        jTFUsuarioFunci.setVisible(false);
                        jTFUsuarioFunci.setEnabled(false);
                        jLSenhaFunci.setVisible(false);
                        jTFSenhaFunci.setVisible(false);
                        jTFSenhaFunci.setEnabled(false);

                    } else {
                        jLLoginFunci.setVisible(true);
                        jTFUsuarioFunci.setVisible(true);
                        jTFUsuarioFunci.setEnabled(true);
                        jLSenhaFunci.setVisible(true);
                        jTFSenhaFunci.setVisible(true);
                        jTFSenhaFunci.setEnabled(true);
                    }

                    DAOFuncionarios daoafun = new DAOFuncionarios();
                    Funcionarios fun = new Funcionarios();

                    fun.setId_funcionario((int) modelo.getValueAt(jTFunci.getSelectedRow(), 0));

                    fun = daoafun.buscarFuncionario(fun);

                    int id_admin = 0;

                    if (fun.getCargo().getId_cargo() == 1) {
                        id_admin = fun.getCargo().getId_cargo();
                    }

                    if ((acesso_funci.getCargo().getId_cargo() != 1) && (fun.getCargo().getId_cargo() == id_admin)) {
                        JOptionPane.showMessageDialog(rootPane, "Somente um ADMINISTRADOR pode alterar outro ADMINISTRADOR !", "Alteração não permitida", 1);

                        jTFunci.clearSelection();

                        jTFNomeFunci.setEnabled(false);
                        jDCNasciFunci.setEnabled(false);
                        jTFRG.setEnabled(false);
                        jTFTelefoneFunci.setEnabled(false);
                        jCBCargos.setEnabled(false);
                        jTFCelularFunci1.setEnabled(false);
                        jB_PesquisaFotoFunci.setEnabled(false);
                        jTextField_FotoFunci.setEnabled(false);
                        jB_PesquisaFotoFunci.setEnabled(false);
                        jTFSenhaFunci.setEnabled(false);
                        jTFUsuarioFunci.setEnabled(false);

                        jTFNomeFunci.setText(null);
                        jDCNasciFunci.setDate(null);
                        jTFRG.setValue(null);
                        jTFTelefoneFunci.setValue(null);
                        jCBCargos.setSelectedItem(0);
                        jTFCelularFunci1.setValue(null);
                        jLabel_FotoFunci.setIcon(null);
                        jTextField_FotoFunci.setText(null);
                        jTFUsuarioFunci.setText(null);
                        jTFSenhaFunci.setText(null);

                        jBEditarFunci.setEnabled(false);
                        jBExcluirFunci.setEnabled(false);

                    }

                    if ((acesso_funci.getCargo().getId_cargo() != 1) && (fun.getCargo().getId_cargo() != id_admin)) {
                        jTFNomeFunci.setText(fun.getNome());
                        jTFRG.setValue(fun.getRg_funcionario());
                        jCBCargos.setSelectedItem(fun.getCargo().getId_cargo() + " - " + fun.getCargo().getNome_cargo());
                        jTFUsuarioFunci.setText(fun.getUsuario());
                        jTFSenhaFunci.setText(fun.getSenha());

                        if (fun.getData_nasc_funcionario() != null) {
                            Date data = new SimpleDateFormat("yyyy-MM-dd").parse(fun.getData_nasc_funcionario().toString());
                            jDCNasciFunci.setDate(data);
                        } else {
                            jDCNasciFunci.setDate(null);
                        }

                        if (fun.getTelefone() != null) {
                            jTFTelefoneFunci.setValue(fun.getTelefone());
                        } else {
                            jTFTelefoneFunci.setValue("(00)0000-0000");
                        }

                        if (fun.getCelular().isEmpty() == false) {
                            jTFCelularFunci1.setValue(fun.getCelular());
                        } else {
                            jTFCelularFunci1.setValue("(00)0-0000-0000");
                        }

                        if (fun.getFoto_funcionario() != null) {
                            ImageIcon imagem = new ImageIcon((byte[]) fun.getFoto_funcionario());
                            jLabel_FotoFunci.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLabel_FotoFunci.getWidth(), jLabel_FotoFunci.getHeight(), Image.SCALE_DEFAULT)));
                        } else {
                            jLabel_FotoFunci.setIcon(null);
                            jLabel_FotoFunci.setHorizontalAlignment(0);
                            jLabel_FotoFunci.setText("SEM FOTO");
                        }
                    }

                    if (acesso_funci.getCargo().getId_cargo() == 1) {
                        jTFNomeFunci.setText(fun.getNome());
                        jTFRG.setValue(fun.getRg_funcionario());
                        jCBCargos.setSelectedItem(fun.getCargo().getId_cargo() + " - " + fun.getCargo().getNome_cargo());
                        jTFUsuarioFunci.setText(fun.getUsuario());
                        jTFSenhaFunci.setText(fun.getSenha());

                        if (fun.getData_nasc_funcionario() != null) {
                            Date data = new SimpleDateFormat("yyyy-MM-dd").parse(fun.getData_nasc_funcionario().toString());
                            jDCNasciFunci.setDate(data);
                        } else {
                            jDCNasciFunci.setDate(null);
                        }

                        if (fun.getTelefone() != null) {
                            jTFTelefoneFunci.setValue(fun.getTelefone());
                        } else {
                            jTFTelefoneFunci.setValue("(00)0000-0000");
                        }

                        if (fun.getCelular().isEmpty() == false) {
                            jTFCelularFunci1.setValue(fun.getCelular());
                        } else {
                            jTFCelularFunci1.setValue("(00)0-0000-0000");
                        }

                        if (fun.getFoto_funcionario() != null) {
                            ImageIcon imagem = new ImageIcon((byte[]) fun.getFoto_funcionario());
                            jLabel_FotoFunci.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLabel_FotoFunci.getWidth(), jLabel_FotoFunci.getHeight(), Image.SCALE_DEFAULT)));
                        } else {
                            jLabel_FotoFunci.setIcon(null);
                            jLabel_FotoFunci.setHorizontalAlignment(0);
                            jLabel_FotoFunci.setText("SEM FOTO");
                        }
                    }

                } catch (ParseException | ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(JFGerenciarAlunos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_jTFunciKeyReleased

    private void jTFunciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFunciKeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_jTFunciKeyTyped

    private void jCBCargosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBCargosItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCargosItemStateChanged

    private void jCBCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCargosActionPerformed
        // TODO add your handling code here:

        if (acesso_funci.getCargo().getId_cargo() != 1) {

            if (jCBCargos.getSelectedItem().equals("1 - Administrador")) {
                jLConfirmaUsuario.setVisible(true);
                jLConfirmaUsuario.setText("Apenas um ADMINISTRADOR pode atribuir o cargo <<ADMINISTRADOR>> !");
                jCBCargos.setSelectedItem("Selecionar");
                System.out.println("ativa");
                jTFRG.requestFocusInWindow();
            } else {
                jLConfirmaUsuario.setVisible(false);
                System.out.println("desativa");
            }
        } else {

        }

    }//GEN-LAST:event_jCBCargosActionPerformed

    private void jTFunciMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFunciMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFunciMouseDragged

    private void jTextField_PesquisarFunciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_PesquisarFunciMouseClicked
        // TODO add your handling code here:

        jTFunci.clearSelection();

    }//GEN-LAST:event_jTextField_PesquisarFunciMouseClicked

    public void populaTabelaFunci() throws ClassNotFoundException, SQLException, ParseException {

        try {
            DAOFuncionarios daofun = new DAOFuncionarios();
            Funcionarios funci = new Funcionarios();
            funci.setNome(jTextField_PesquisarFunci.getText());

            List<Funcionarios> lista = daofun.PesquisaFuncionario(funci);

            DefaultTableModel modelo = (DefaultTableModel) jTFunci.getModel();
            modelo.getDataVector().removeAllElements();

            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{
                    lista.get(i).getId_funcionario(),
                    lista.get(i).getNome(),
                    lista.get(i).getRg_funcionario(),
                    lista.get(i).getCargo().getNome_cargo()});
            }

            if (lista.isEmpty() == true) {

                for (int i = 0; i < 1; i++) {
                    modelo.addRow(new Object[]{null});
                    modelo.removeRow(i);
                    modelo.addRow(new Object[]{"VAZIO", "VAZIO", "VAZIO"});

                }

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JFGerenciarFuncionarios.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void populaComboBox() throws SQLException, ClassNotFoundException {

        try {
            DAOCargos dao = new DAOCargos();
            List<Cargos> lista = dao.buscarTodosCargos();

            for (Cargos cargo : lista) {
                jCBCargos.addItem(cargo.getId_cargo() + " - " + cargo.getNome_cargo());

            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(JFLoginInicio.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarFuncionarios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGerenciarFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarFunci;
    private javax.swing.JButton jBEditarFunci;
    private javax.swing.JButton jBExcluirFunci;
    private javax.swing.JButton jB_NovoCadastro;
    private javax.swing.JButton jB_PesquisaFotoFunci;
    private javax.swing.JComboBox<String> jCBCargos;
    private javax.swing.JCheckBox jChBConfirmaLogin;
    private com.toedter.calendar.JDateChooser jDCNasciFunci;
    private javax.swing.JLabel jLConfirmaUsuario;
    private javax.swing.JLabel jLLoginFunci;
    private javax.swing.JLabel jLSenhaFunci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_FotoFunci;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField jTFCelularFunci1;
    private javax.swing.JTextField jTFNomeFunci;
    private javax.swing.JFormattedTextField jTFRG;
    private javax.swing.JPasswordField jTFSenhaFunci;
    private javax.swing.JFormattedTextField jTFTelefoneFunci;
    private javax.swing.JTextField jTFUsuarioFunci;
    private javax.swing.JTable jTFunci;
    private javax.swing.JTextField jTextField_FotoFunci;
    private javax.swing.JTextField jTextField_PesquisarFunci;
    // End of variables declaration//GEN-END:variables
}
