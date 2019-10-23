/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import dao.DAOAlunos;
import dao.DAOMensalidades;
import entidade.Alunos;
import entidade.Funcionarios;
import entidade.Mensalidades;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lab01_Aluno
 */
public final class JFGerenciarAlunos extends javax.swing.JFrame {

    /**
     * Creates new form JFGerenciarAlunos
     */
    Funcionarios acesso_funci = null;
    public JFGerenciarAlunos(Funcionarios funci) throws ClassNotFoundException, SQLException, ParseException {

        acesso_funci = funci;
        
        initComponents();
        populaTabelaAluno();
    }

    private JFGerenciarAlunos() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Imagem = new javax.swing.JLabel();
        jTFPesquisaFoto = new javax.swing.JTextField();
        jBPesquisarFoto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_PesquisarAluno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAluno = new javax.swing.JTable();
        jBCadastrar_AlterarAluno = new javax.swing.JButton();
        jBEditarAluno = new javax.swing.JButton();
        jBExcluirAluno = new javax.swing.JButton();
        jBNovoCadAluno = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFNomeAluno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jDCNasciAluno = new com.toedter.calendar.JDateChooser();
        jFTFRgAluno = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFTFTelefoneAluno = new javax.swing.JFormattedTextField();
        jFTFCelularAluno = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFEnderecoAluno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFNumEndeAluno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFBairroAluno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jDCDataInicio = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jDCDataVencimento = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Alunos");
        setName(""); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto do Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel_Imagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Imagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTFPesquisaFoto.setEnabled(false);

        jBPesquisarFoto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBPesquisarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter_face/imagem/camera_add.png"))); // NOI18N
        jBPesquisarFoto.setText("Pesquisar");
        jBPesquisarFoto.setEnabled(false);
        jBPesquisarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jTFPesquisaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jBPesquisarFoto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel_Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFPesquisaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jBPesquisarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione um Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel3.setToolTipText("");
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Procurar:");

        jTextField_PesquisarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PesquisarAlunoActionPerformed(evt);
            }
        });
        jTextField_PesquisarAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_PesquisarAlunoKeyReleased(evt);
            }
        });

        jTAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "RG"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAluno.getTableHeader().setReorderingAllowed(false);
        jTAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTAluno);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jTextField_PesquisarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_PesquisarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBCadastrar_AlterarAluno.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBCadastrar_AlterarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter_face/imagem/check-user-icon (Custom).png"))); // NOI18N
        jBCadastrar_AlterarAluno.setText("Cadastrar Aluno");
        jBCadastrar_AlterarAluno.setEnabled(false);
        jBCadastrar_AlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrar_AlterarAlunoActionPerformed(evt);
            }
        });

        jBEditarAluno.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBEditarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter_face/imagem/clip_paste.png"))); // NOI18N
        jBEditarAluno.setText("Editar Selecionado");
        jBEditarAluno.setEnabled(false);
        jBEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarAlunoActionPerformed(evt);
            }
        });

        jBExcluirAluno.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBExcluirAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter_face/imagem/bin-full-icon (Custom).png"))); // NOI18N
        jBExcluirAluno.setText("Excluir Seleionado");
        jBExcluirAluno.setEnabled(false);
        jBExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirAlunoActionPerformed(evt);
            }
        });

        jBNovoCadAluno.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBNovoCadAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter_face/imagem/document-ok.png"))); // NOI18N
        jBNovoCadAluno.setText("Novo Cadastro");
        jBNovoCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoCadAlunoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jTFNomeAluno.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTFNomeAluno.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Data de Nascimento:");

        jDCNasciAluno.setEnabled(false);
        jDCNasciAluno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        try {
            jFTFRgAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" ##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFRgAluno.setEnabled(false);
        jFTFRgAluno.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        jFTFRgAluno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFTFRgAluno.setVerifyInputWhenFocusTarget(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("RG:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Telefone:");

        try {
            jFTFTelefoneAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFTelefoneAluno.setEnabled(false);
        jFTFTelefoneAluno.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        try {
            jFTFCelularAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFCelularAluno.setEnabled(false);
        jFTFCelularAluno.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Celular:");

        jTFEnderecoAluno.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTFEnderecoAluno.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Endereço:");

        jTFNumEndeAluno.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTFNumEndeAluno.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nº:");

        jTFBairroAluno.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTFBairroAluno.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Bairro:");

        jDCDataInicio.setEnabled(false);
        jDCDataInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jDCDataInicioKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Data de Início");

        jDCDataVencimento.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Data Vencimento:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDCNasciAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFTFRgAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTFEnderecoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jTFNumEndeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTFBairroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jDCDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel9)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(191, 191, 191)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jDCDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel10))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFTFTelefoneAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jFTFCelularAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 233, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDCNasciAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTFRgAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFEnderecoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNumEndeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFBairroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTFTelefoneAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFCelularAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDCDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jDCDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBNovoCadAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBCadastrar_AlterarAluno))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBEditarAluno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBExcluirAluno, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBCadastrar_AlterarAluno)
                            .addComponent(jBEditarAluno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBNovoCadAluno)
                            .addComponent(jBExcluirAluno)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1091, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarFotoActionPerformed
        JFileChooser escolha_arq = new JFileChooser();
        escolha_arq.setDialogTitle("Selecione a FOTO do Aluno");
        escolha_arq.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int opc = escolha_arq.showOpenDialog(this);

        if (opc == JFileChooser.APPROVE_OPTION) {
            File arquivo = new File("Caminho");
            arquivo = escolha_arq.getSelectedFile();
            String nome_arquivo = arquivo.getAbsolutePath();

            jTFPesquisaFoto.setText(nome_arquivo);

            jLabel_Imagem.setText(null);
            ImageIcon imagem = new ImageIcon(arquivo.getPath());
            jLabel_Imagem.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLabel_Imagem.getWidth(), jLabel_Imagem.getHeight(), Image.SCALE_DEFAULT)));
        }

    }//GEN-LAST:event_jBPesquisarFotoActionPerformed

    private void jTAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAlunoMouseClicked
        // TODO add your handling code here:

        DefaultTableModel modelo = (DefaultTableModel) jTAluno.getModel();

        if (jTAluno.getSelectedRow() != -1) {

            if (String.valueOf(modelo.getValueAt(jTAluno.getSelectedRow(), 0)).equals("VAZIO")) {

            } else {
                try {
                    jBCadastrar_AlterarAluno.setEnabled(false);
                    jBEditarAluno.setEnabled(true);
                    jBExcluirAluno.setEnabled(true);
                    jBPesquisarFoto.setEnabled(true);

                    jTFNomeAluno.setEnabled(true);
                    jDCNasciAluno.setEnabled(true);
                    jFTFRgAluno.setEnabled(true);
                    jFTFTelefoneAluno.setEnabled(true);
                    jFTFCelularAluno.setEnabled(true);
                    jTFEnderecoAluno.setEnabled(true);
                    jTFNumEndeAluno.setEnabled(true);
                    jTFBairroAluno.setEnabled(true);
                    jDCDataInicio.setEnabled(true);
                    jDCDataVencimento.setEnabled(true);

                    //ANULA VALOR CAMPOS
                    jFTFRgAluno.setValue(null);
                    jFTFTelefoneAluno.setValue(null);
                    jFTFCelularAluno.setValue(null);

                    //PINTA CAMPOS
                    jTFNomeAluno.setBackground(Color.WHITE);
                    jFTFRgAluno.setBackground(Color.WHITE);
                    jDCDataInicio.setBackground(Color.WHITE);
                    jDCDataVencimento.setBackground(Color.WHITE);

                    DAOAlunos daoaluno = new DAOAlunos();
                    Alunos aluno = new Alunos();
                    aluno.setId_aluno((int) modelo.getValueAt(jTAluno.getSelectedRow(), 0));

                    aluno = daoaluno.buscarAluno(aluno);

                    jTFNomeAluno.setText(aluno.getNome_aluno());
                    jFTFRgAluno.setValue(aluno.getRg_aluno());
                    jFTFTelefoneAluno.setValue(aluno.getTelefone_aluno());
                    jFTFCelularAluno.setValue(aluno.getCelular_aluno());

                    if (aluno.getDatanascimento_aluno() != null) {
                        Date data = new SimpleDateFormat("yyyy-MM-dd").parse(aluno.getDatanascimento_aluno().toString());
                        jDCNasciAluno.setDate(data);
                    } else {
                        jDCNasciAluno.setDate(null);
                    }

                    jTFEnderecoAluno.setText(aluno.getEndereco_aluno());
                    jTFBairroAluno.setText(aluno.getBairro_aluno());
                    jTFNumEndeAluno.setText(Integer.toString(aluno.getNum_ende_aluno()));

                    Date data2 = new SimpleDateFormat("yyyy-MM-dd").parse(aluno.getDatainicio().toString());
                    jDCDataInicio.setDate(data2);
                    Date data3 = new SimpleDateFormat("yyyy-MM-dd").parse(aluno.getDatavencimento().toString());
                    jDCDataVencimento.setDate(data3);

                    if (aluno.getFoto_aluno() != null) {
                        jLabel_Imagem.setText(null);
                        ImageIcon imagem = new ImageIcon((byte[]) aluno.getFoto_aluno());
                        jLabel_Imagem.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLabel_Imagem.getWidth(), jLabel_Imagem.getHeight(), Image.SCALE_DEFAULT)));

                    } else {
                        jLabel_Imagem.setIcon(null);
                        jLabel_Imagem.setText("SEM FOTO");
                    }

                } catch (ParseException | ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(JFGerenciarAlunos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }//GEN-LAST:event_jTAlunoMouseClicked

    private void jTextField_PesquisarAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PesquisarAlunoKeyReleased

        
        
        try {
            
            jTAluno.clearSelection();
            DefaultTableModel modelo = (DefaultTableModel) jTAluno.getModel();
            modelo.getDataVector().removeAllElements();

            populaTabelaAluno();

        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(JFGerenciarAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jTextField_PesquisarAlunoKeyReleased

    private void jTextField_PesquisarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PesquisarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PesquisarAlunoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
         jTAluno.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }//GEN-LAST:event_formWindowOpened

    private void jDCDataInicioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDCDataInicioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jDCDataInicioKeyReleased

    private void jBEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarAlunoActionPerformed
        try {
            // TODO add your handling code here:

            DAOAlunos daoalu = new DAOAlunos();
            Alunos alunos = new Alunos();
            DefaultTableModel modelo = (DefaultTableModel) jTAluno.getModel();

            alunos.setId_aluno((int) modelo.getValueAt(jTAluno.getSelectedRow(), 0));

            if (jTFNomeAluno.getText().isEmpty() == false) {
                alunos.setNome_aluno(jTFNomeAluno.getText());
                jTFNomeAluno.setBackground(Color.WHITE);
            } else {
                jTFNomeAluno.setBackground(Color.RED);
            }

            if (jFTFRgAluno.getValue() != null) {
                alunos.setRg_aluno(String.valueOf(jFTFRgAluno.getValue()));
                jFTFRgAluno.setBackground(Color.WHITE);
            } else {
                jFTFRgAluno.setBackground(Color.RED);
            }

            if (jDCNasciAluno.getDate() != null) {
                alunos.setDatanascimento_aluno(jDCNasciAluno.getDate());
            } else {
                alunos.setDatanascimento_aluno(null);
            }

            if (jFTFTelefoneAluno.getValue() != null) {
                alunos.setTelefone_aluno(String.valueOf(jFTFTelefoneAluno.getValue()));
            } else {
                alunos.setTelefone_aluno("(00)0000-0000");
            }

            if (jFTFCelularAluno.getValue() != null) {
                alunos.setCelular_aluno(String.valueOf(jFTFCelularAluno.getValue()));
            } else {
                alunos.setCelular_aluno("(00)0-0000-0000");
            }

            if (jTFEnderecoAluno.getText().isEmpty() == false) {
                alunos.setEndereco_aluno(jTFEnderecoAluno.getText());
            } else {
                alunos.setEndereco_aluno(null);
            }
            if (jTFNumEndeAluno.getText().isEmpty() == false) {
                alunos.setNum_ende_aluno(Integer.parseInt(jTFNumEndeAluno.getText()));
            } else {
                alunos.setNum_ende_aluno(0);
            }

            if (jTFBairroAluno.getText().isEmpty() == false) {
                alunos.setBairro_aluno(jTFBairroAluno.getText());
            } else {
                alunos.setBairro_aluno(null);
            }

            if (jDCDataInicio.getDate() != null) {
                alunos.setDatainicio(jDCDataInicio.getDate());
                jDCDataInicio.setBackground(Color.WHITE);
            } else {
                jDCDataInicio.setBackground(Color.RED);
            }
            if (jDCDataVencimento.getDate() != null) {
                alunos.setDatavencimento(jDCDataVencimento.getDate());
                jDCDataVencimento.setBackground(Color.WHITE);
            } else {
                jDCDataVencimento.setBackground(Color.RED);
            }

            if (jTFPesquisaFoto.getText().isEmpty() == false) {
                alunos.setImagem_aluno(jTFPesquisaFoto.getText());
            } else {
                alunos.setImagem_aluno(null);
            }

            if ((jTFNomeAluno.getText().isEmpty() == true) || (jFTFRgAluno.getValue() == null) || (jDCDataInicio.getDate() == null) || (jDCDataVencimento.getDate() == null)) {
                JOptionPane.showMessageDialog(rootPane, "Não é permitido cadastrar um ALUNO sem :"
                        + "\n"
                        + "\n"
                        + "NOME;"
                        + "\n"
                        + "RG;"
                        + "\n"
                        + "DATA DE INÍCIO;"
                        + "\n"
                        + "DATA DE VENCIMENTO;", "Cadastro não permitido", 1);
            }

            if ((jTFNomeAluno.getText().isEmpty() == false) && (jFTFRgAluno.getValue() != null) && (jDCDataInicio.getDate() != null) && (jDCDataVencimento.getDate() != null)) {

                daoalu.editarAlunos(alunos);

                populaTabelaAluno();

                //Desativa BOTÕES
                jBEditarAluno.setEnabled(false);
                jBExcluirAluno.setEnabled(false);
                jBCadastrar_AlterarAluno.setEnabled(false);
                jBPesquisarFoto.setEnabled(false);

                //Desativa CAMPOS
                jTFNomeAluno.setEnabled(false);
                jDCNasciAluno.setEnabled(false);
                jFTFRgAluno.setEnabled(false);
                jFTFTelefoneAluno.setEnabled(false);
                jFTFCelularAluno.setEnabled(false);
                jTFEnderecoAluno.setEnabled(false);
                jTFNumEndeAluno.setEnabled(false);
                jTFBairroAluno.setEnabled(false);
                jDCDataInicio.setEnabled(false);
                jDCDataVencimento.setEnabled(false);

                //Anula testo dos CAMPOS
                jTFNomeAluno.setText(null);
                jDCNasciAluno.setDate(null);
                jFTFRgAluno.setValue(null);
                jFTFTelefoneAluno.setValue(null);
                jFTFCelularAluno.setValue(null);
                jTFEnderecoAluno.setText(null);
                jTFNumEndeAluno.setText(null);
                jTFBairroAluno.setText(null);
                jDCDataInicio.setDate(null);
                jDCDataVencimento.setDate(null);
                jLabel_Imagem.setIcon(null);
                jTFPesquisaFoto.setText(null);
                jFTFRgAluno.setValue(null);

            }

        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(JFGerenciarAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jBEditarAlunoActionPerformed

    private void jBExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirAlunoActionPerformed
        // TODO add your handling code here:

        try {
            DefaultTableModel modelo = (DefaultTableModel) jTAluno.getModel();
            DAOAlunos daoalu = new DAOAlunos();

            if (jTAluno.getSelectedRow() != -1) {

                int confirma = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?", null, 1);
                if (confirma == JOptionPane.YES_OPTION) {
                    Alunos aluno = new Alunos();
                    aluno.setId_aluno((int) modelo.getValueAt(jTAluno.getSelectedRow(), 0));
                    daoalu.apagarAlunos(aluno);

                    populaTabelaAluno();

                    //Anula testo dos CAMPOS
                    jTFNomeAluno.setText(null);
                    jDCNasciAluno.setDate(null);
                    jFTFRgAluno.setText(null);
                    jFTFTelefoneAluno.setText(null);
                    jFTFCelularAluno.setText(null);
                    jTFEnderecoAluno.setText(null);
                    jTFNumEndeAluno.setText(null);
                    jTFBairroAluno.setText(null);
                    jDCDataInicio.setDate(null);
                    jDCDataVencimento.setDate(null);
                    jLabel_Imagem.setIcon(null);
                    jTFPesquisaFoto.setText(null);

                    //Desativa CAMPOS
                    jTFNomeAluno.setEnabled(false);
                    jDCNasciAluno.setEnabled(false);
                    jFTFRgAluno.setEnabled(false);
                    jFTFTelefoneAluno.setEnabled(false);
                    jFTFCelularAluno.setEnabled(false);
                    jTFEnderecoAluno.setEnabled(false);
                    jTFNumEndeAluno.setEnabled(false);
                    jTFBairroAluno.setEnabled(false);
                    jDCDataInicio.setEnabled(false);
                    jDCDataVencimento.setEnabled(false);
                    jBEditarAluno.setEnabled(false);
                    jBExcluirAluno.setEnabled(false);
                }

                if (confirma == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Não Excluído!");
                }
                if (confirma == JOptionPane.CANCEL_OPTION) {

                }
                if (confirma == JOptionPane.CLOSED_OPTION) {

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Nenhum Registro Selecionado!");
            }

        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(JFGerenciarAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBExcluirAlunoActionPerformed

    private void jBNovoCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoCadAlunoActionPerformed
        // TODO add your handling code here:

        //Desativa BOTÕES
        jBEditarAluno.setEnabled(false);
        jBExcluirAluno.setEnabled(false);
        jBCadastrar_AlterarAluno.setEnabled(true);
        jBPesquisarFoto.setEnabled(true);

        //Ativa CAMPOS
        jTFNomeAluno.setEnabled(true);
        jDCNasciAluno.setEnabled(true);
        jFTFRgAluno.setEnabled(true);
        jFTFTelefoneAluno.setEnabled(true);
        jFTFCelularAluno.setEnabled(true);
        jTFEnderecoAluno.setEnabled(true);
        jTFNumEndeAluno.setEnabled(true);
        jTFBairroAluno.setEnabled(true);
        jDCDataInicio.setEnabled(true);
        jDCDataVencimento.setEnabled(true);

        //Anula testo dos CAMPOS
        jTFNomeAluno.setText(null);
        jDCNasciAluno.setDate(null);
        jFTFRgAluno.setText(null);
        jFTFTelefoneAluno.setValue(null);
        jFTFCelularAluno.setValue(null);
        jTFEnderecoAluno.setText(null);
        jTFNumEndeAluno.setText(null);
        jTFBairroAluno.setText(null);
        jDCDataInicio.setDate(null);
        jDCDataVencimento.setDate(null);
        jLabel_Imagem.setIcon(null);
        jTFPesquisaFoto.setText(null);
        jFTFRgAluno.setValue(null);
        jFTFTelefoneAluno.setValue(null);
        jFTFCelularAluno.setValue(null);

        //PINTA CAMPOS
        jTFNomeAluno.setBackground(Color.WHITE);
        jDCDataInicio.setBackground(Color.WHITE);
        jDCDataVencimento.setBackground(Color.WHITE);
        jFTFRgAluno.setBackground(Color.WHITE);
    }//GEN-LAST:event_jBNovoCadAlunoActionPerformed

    private void jBCadastrar_AlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrar_AlterarAlunoActionPerformed
        // TODO add your handling code here:

        try {

            DAOAlunos daoalu = new DAOAlunos();
            Alunos alunos = new Alunos();

            //ARMAZENA NOME DO ALUNO
            if (jTFNomeAluno.getText().isEmpty() == false) {
                alunos.setNome_aluno(jTFNomeAluno.getText());
                jTFNomeAluno.setBackground(Color.WHITE);
            } else {
                jTFNomeAluno.setBackground(Color.RED);
            }

            //ARMAZENA DATA DE NASCIMENTO DO ALUNO
            if (jDCNasciAluno.getDate() != null) {
                alunos.setDatanascimento_aluno(jDCNasciAluno.getDate());
            } else {
                alunos.setDatanascimento_aluno(null);
            }

            //ARMAZENA RG DO ALUNO
            if (jFTFRgAluno.getValue() != null) {
                alunos.setRg_aluno(String.valueOf(jFTFRgAluno.getValue()));
                jFTFRgAluno.setBackground(Color.WHITE);
            } else {
                jFTFRgAluno.setBackground(Color.RED);
            }

            //ARMAZENA O TELEFONE DO ALUNO
            if (jFTFTelefoneAluno.getValue() != null) {
                alunos.setTelefone_aluno(String.valueOf(jFTFTelefoneAluno.getValue()));
            } else {
                alunos.setTelefone_aluno("(00)0000-0000");
            }

            //ARMAZENA O CELULAR DO ALUMO
            if (jFTFCelularAluno.getValue() != null) {
                alunos.setCelular_aluno(String.valueOf(jFTFCelularAluno.getValue()));
            } else {
                alunos.setCelular_aluno("(00)0-0000-0000");
            }

            //ARMAZENA O ENDEREÇO DO ALUNO
            alunos.setEndereco_aluno(jTFEnderecoAluno.getText());

            //ARMAZENA O NÚMERO DO ENDEREÇO DO ALUNO
            if (jTFNumEndeAluno.getText().isEmpty() == false) {
                alunos.setNum_ende_aluno(Integer.parseInt(jTFNumEndeAluno.getText()));
            } else {
                alunos.setNum_ende_aluno(0);
            }

            //ARMAZENA O BAIRRO DO ALUNO
            alunos.setBairro_aluno(jTFBairroAluno.getText());

            //ARMAZENA A DATA DE INÍCIO DO ALUNO
            if (jDCDataInicio.getDate() != null) {
                alunos.setDatainicio(jDCDataInicio.getDate());
                jDCDataInicio.setBackground(Color.WHITE);
            } else {
                jDCDataInicio.setBackground(Color.RED);
            }

            //ARAMAZENA A DATA DE VENCIMENTO DO ALUNO
            if (jDCDataVencimento.getDate() != null) {
                alunos.setDatavencimento(jDCDataVencimento.getDate());
                jDCDataVencimento.setBackground(Color.WHITE);
            } else {
                jDCDataVencimento.setBackground(Color.RED);
            }

            //ARMAZENA FOTO DO ALUNO
            if (jTFPesquisaFoto.getText().isEmpty() == false) {
                alunos.setImagem_aluno(jTFPesquisaFoto.getText());
            } else {
                alunos.setImagem_aluno(null);
            }

            // VERIFICA SE NOME <<OU>> RG <<OU>> INÍCIO <<OU>> VENCIMENTO ESTÃO NULOS
            if ((jTFNomeAluno.getText().isEmpty() == true) || (jFTFRgAluno.getValue() == null) || (jDCDataInicio.getDate() == null) || (jDCDataVencimento.getDate() == null)) {

                JOptionPane.showMessageDialog(rootPane, "Não é permitido CADASTRAR um ALUNO sem :"
                        + "\n"
                        + "\n"
                        + "NOME;"
                        + "\n"
                        + "RG;"
                        + "\n"
                        + "DATA DE INÍCIO;"
                        + "\n"
                        + "DATA DE VENCIMENTO;", "Cadastro não permitido", 1);

            }

            if ((jTFNomeAluno.getText().isEmpty() == false) && (jFTFRgAluno.getValue() != null) && (jDCDataInicio.getDate() != null) && (jDCDataVencimento.getDate() != null)) {

                daoalu.cadastrarAlunos(alunos);

                Alunos alu = new Alunos();
                alu = daoalu.buscarIDAluno(alunos);

                Mensalidades mensal = new Mensalidades();
                mensal.setAluno(alu);
                mensal.setData_vencimento(jDCDataVencimento.getDate());
                mensal.setStatus_mensal("Devendo");

                DAOMensalidades daomensal = new DAOMensalidades();
                daomensal.cadastrarMensalidades(mensal);

                populaTabelaAluno();

                //Desativa BOTÕES
                jBEditarAluno.setEnabled(false);
                jBExcluirAluno.setEnabled(false);
                jBCadastrar_AlterarAluno.setEnabled(false);

                //Desativa CAMPOS
                jTFNomeAluno.setEnabled(false);
                jDCNasciAluno.setEnabled(false);
                jFTFRgAluno.setEnabled(false);
                jFTFTelefoneAluno.setEnabled(false);
                jFTFCelularAluno.setEnabled(false);
                jTFEnderecoAluno.setEnabled(false);
                jTFNumEndeAluno.setEnabled(false);
                jTFBairroAluno.setEnabled(false);
                jDCDataInicio.setEnabled(false);
                jDCDataVencimento.setEnabled(false);

                //Anula testo dos CAMPOS
                jTFNomeAluno.setText(null);
                jDCNasciAluno.setDate(null);
                jFTFRgAluno.setText(null);
                jFTFTelefoneAluno.setValue(null);
                jFTFCelularAluno.setValue(null);
                jTFEnderecoAluno.setText(null);
                jTFNumEndeAluno.setText(null);
                jTFBairroAluno.setText(null);
                jDCDataInicio.setDate(null);
                jDCDataVencimento.setDate(null);
                jLabel_Imagem.setIcon(null);
                jTFPesquisaFoto.setText(null);
                jFTFRgAluno.setValue(null);
                jFTFTelefoneAluno.setValue(null);
                jFTFCelularAluno.setValue(null);

                //PINTA CAMPOS
                jTFNomeAluno.setBackground(Color.WHITE);
                jDCDataInicio.setBackground(Color.WHITE);
                jDCDataVencimento.setBackground(Color.WHITE);
                jFTFRgAluno.setBackground(Color.WHITE);

            }
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(JFGerenciarAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBCadastrar_AlterarAlunoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
        dispose();
        
        JFFormularioPrincipal form = new JFFormularioPrincipal(acesso_funci);
        form.setVisible(true);
        
    }//GEN-LAST:event_formWindowClosing

    public void populaTabelaAluno() throws ClassNotFoundException, SQLException, ParseException {

        try {
            DAOAlunos daoaluno = new DAOAlunos();
            Alunos aluno = new Alunos();
            aluno.setNome_aluno(jTextField_PesquisarAluno.getText());

            List<Alunos> lista = daoaluno.PesquisaAlunos(aluno);

            DefaultTableModel modelo = (DefaultTableModel) jTAluno.getModel();
            modelo.getDataVector().removeAllElements();

            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{
                    lista.get(i).getId_aluno(),
                    lista.get(i).getNome_aluno(),
                    lista.get(i).getRg_aluno()});
            }

            if (lista.isEmpty() == true) {

                for (int i = 0; i < 1; i++) {
                    modelo.addRow(new Object[]{null});
                    modelo.removeRow(i);
                    modelo.addRow(new Object[]{"VAZIO", "VAZIO", "VAZIO"});
                }

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JFGerenciarAlunos.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(JFGerenciarAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGerenciarAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar_AlterarAluno;
    private javax.swing.JButton jBEditarAluno;
    private javax.swing.JButton jBExcluirAluno;
    private javax.swing.JButton jBNovoCadAluno;
    private javax.swing.JButton jBPesquisarFoto;
    private com.toedter.calendar.JDateChooser jDCDataInicio;
    private com.toedter.calendar.JDateChooser jDCDataVencimento;
    private com.toedter.calendar.JDateChooser jDCNasciAluno;
    private javax.swing.JFormattedTextField jFTFCelularAluno;
    private javax.swing.JFormattedTextField jFTFRgAluno;
    private javax.swing.JFormattedTextField jFTFTelefoneAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Imagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAluno;
    private javax.swing.JTextField jTFBairroAluno;
    private javax.swing.JTextField jTFEnderecoAluno;
    private javax.swing.JTextField jTFNomeAluno;
    private javax.swing.JTextField jTFNumEndeAluno;
    private javax.swing.JTextField jTFPesquisaFoto;
    private javax.swing.JTextField jTextField_PesquisarAluno;
    // End of variables declaration//GEN-END:variables
}
