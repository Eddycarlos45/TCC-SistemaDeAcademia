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
import java.awt.Image;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.AlteraData;

/**
 *
 * @author Lab01_Aluno
 */
public final class JFMensalidades extends javax.swing.JFrame {

    /**
     * Creates new form JFMensalidades
     */
    Date datavenci = null;
    
    Funcionarios acesso_funci = null;

    public JFMensalidades(Funcionarios funci) throws SQLException, ClassNotFoundException {
        
        acesso_funci = funci;
        
        initComponents();
        populaTabelaAlunos();

    }

    private JFMensalidades() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTMensal = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jDCPagamento = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jCBListarMensal = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLImagemAluno = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAlunos = new javax.swing.JTable();
        jTFPesquisarAluno = new javax.swing.JTextField();
        jTFNomeAluno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Mensalidades");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione uma Mensalidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTMensal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Mensalidade", "Data do Pagamento", "Data do Vencimento", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTMensal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTMensalMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTMensal);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter_face/imagem/bloggif_5805611bcc99c.png"))); // NOI18N
        jButton1.setText("Efetuar Pagamento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Data do Pagamento:");

        jCBListarMensal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Todos", "Devendo", "Pago" }));
        jCBListarMensal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBListarMensalMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCBListarMensalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCBListarMensalMouseReleased(evt);
            }
        });
        jCBListarMensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBListarMensalActionPerformed(evt);
            }
        });
        jCBListarMensal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCBListarMensalKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Listar por:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter_face/imagem/x.png"))); // NOI18N
        jButton2.setText("Consultar Todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBListarMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jButton2))
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jDCPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBListarMensal)
                    .addComponent(jButton2)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDCPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquise Alunos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLImagemAluno.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.gray));

        jTAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Aluno", "RG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAlunosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTAlunosMouseEntered(evt);
            }
        });
        jScrollPane4.setViewportView(jTAlunos);

        jTFPesquisarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPesquisarAlunoActionPerformed(evt);
            }
        });
        jTFPesquisarAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFPesquisarAlunoKeyReleased(evt);
            }
        });

        jTFNomeAluno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFNomeAluno.setText("Foto do Aluno");
        jTFNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTFPesquisarAluno)
                        .addGap(169, 169, 169))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLImagemAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jTFNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTFPesquisarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jTFNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLImagemAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(752, 649));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAlunosMouseClicked
        // TODO add your handling code here:

        if (jTAlunos.getSelectedRow() != -1) {

            try {

                PopulaFotoAluno();
                populaTabelaMensal();
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(JFMensalidades.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jTAlunosMouseClicked

    private void jTFNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeAlunoActionPerformed

    private void jTMensalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTMensalMouseClicked
        // TODO add your handling code here:

        DefaultTableModel modelo = (DefaultTableModel) jTMensal.getModel();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        if (jTMensal.getSelectedRow() != -1) {
            try {

                datavenci = (Date) formato.parse(modelo.getValueAt(jTMensal.getSelectedRow(), 2).toString());

            } catch (ParseException ex) {
                Logger.getLogger(JFMensalidades.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jTMensalMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            DefaultTableModel modelo = (DefaultTableModel) jTAlunos.getModel();
            DefaultTableModel modelomensal = (DefaultTableModel) jTMensal.getModel();

            if (jTMensal.getSelectedRow() != -1 && modelomensal.getValueAt(jTMensal.getSelectedRow(), 3).equals("Devendo")) {

                int confirma = JOptionPane.showConfirmDialog(rootPane, "Confirmar o pagamento?", null, 1);
                if (confirma == JOptionPane.YES_OPTION) {
                    //Atualiza Mensalidade
                    Alunos alu = new Alunos();
                    alu.setId_aluno((int) modelo.getValueAt(jTAlunos.getSelectedRow(), 0));

                    Mensalidades mensal = new Mensalidades();
                    mensal.setAluno(alu);
                    mensal.setStatus_mensal("Pago");
                    mensal.setId_mensalidade((int) modelomensal.getValueAt(jTMensal.getSelectedRow(), 0));
                    mensal.setData_pagamento(jDCPagamento.getDate());

                    DAOMensalidades daomensal = new DAOMensalidades();
                    daomensal.efetuarPagamento(mensal);

                    populaTabelaMensal();

                    //Cadastra Mensalidade
                    AlteraData altdata = new AlteraData();
                    Date data = altdata.trintaDias(datavenci, 1);
                    mensal.setData_vencimento(data);
                    mensal.setStatus_mensal("Devendo");

                    daomensal.cadastrarMensalidades(mensal);
                    populaTabelaMensal();
                }
                if (confirma == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Não efetuado!");
                }
                if (confirma == JOptionPane.CANCEL_OPTION) {

                }
                if (confirma == JOptionPane.CLOSED_OPTION) {

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Esta mensalidade já está paga!", null, 2);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(JFMensalidades.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCBListarMensalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBListarMensalActionPerformed

        if (jTAlunos.getSelectedRow() != -1) {

            try {

                Mensalidades mensal = new Mensalidades();
                mensal.setStatus_mensal((String) jCBListarMensal.getSelectedItem());

                if (jCBListarMensal.getSelectedItem().equals("Selecionar")) {
                    DefaultTableModel modeloMensal = (DefaultTableModel) jTMensal.getModel();
                    
                    modeloMensal.getDataVector().removeAllElements();
                    modeloMensal.addRow(new Object[]{"VAZIO", "VAZIO", "VAZIO"});

                }

                if (jCBListarMensal.getSelectedItem().equals("Devendo")) {

                    PopulaFotoAluno();
                    populaTabelaMensal2(mensal);

                }

                if (jCBListarMensal.getSelectedItem().equals("Pago")) {
                    PopulaFotoAluno();
                    populaTabelaMensal2(mensal);
                }
                
                if(jCBListarMensal.getSelectedItem().equals("Todos")){
                    populaTabelaMensal();
                }

            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(JFMensalidades.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_jCBListarMensalActionPerformed

    private void jTFPesquisarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPesquisarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPesquisarAlunoActionPerformed

    private void jTFPesquisarAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesquisarAlunoKeyReleased

        try {

            populaTabelaAlunos();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(JFMensalidades.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jTFPesquisarAlunoKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        JFConsultaMensalidades cm = new JFConsultaMensalidades(acesso_funci);
        cm.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCBListarMensalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCBListarMensalKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jCBListarMensalKeyReleased

    private void jCBListarMensalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBListarMensalMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBListarMensalMouseReleased

    private void jCBListarMensalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBListarMensalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBListarMensalMouseClicked

    private void jCBListarMensalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBListarMensalMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBListarMensalMousePressed

    private void jTAlunosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAlunosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAlunosMouseEntered

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
        dispose();
        
        JFFormularioPrincipal form = new JFFormularioPrincipal(acesso_funci);
        form.setVisible(true);
        
    }//GEN-LAST:event_formWindowClosing

    public void populaTabelaAlunos() throws SQLException, ClassNotFoundException {
        Alunos aluno = new Alunos();
        aluno.setNome_aluno(jTFPesquisarAluno.getText());

        DAOMensalidades daoMensal = new DAOMensalidades();

        List<Alunos> resultado;
        resultado = daoMensal.pesquisarAlunos(aluno);

        DefaultTableModel modelo = (DefaultTableModel) jTAlunos.getModel();
        modelo.getDataVector().removeAllElements();

        for (int i = 0; i < resultado.size(); i++) {
            modelo.addRow(new Object[]{resultado.get(i).getId_aluno(),
                resultado.get(i).getNome_aluno(),
                resultado.get(i).getRg_aluno()});
        }
    }

    public void populaTabelaMensal() throws SQLException, ClassNotFoundException {

        DefaultTableModel modelo = (DefaultTableModel) jTAlunos.getModel();

        Alunos aluno = new Alunos();
        aluno.setId_aluno((int) modelo.getValueAt(jTAlunos.getSelectedRow(), 0));

        Mensalidades mensal = new Mensalidades();
        mensal.setAluno(aluno);

        DAOMensalidades daoMensal = new DAOMensalidades();
        List<Mensalidades> resultado;
        resultado = daoMensal.pesquisarMensalidades(mensal);

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        DefaultTableModel modeloMensal = (DefaultTableModel) jTMensal.getModel();
        modeloMensal.getDataVector().removeAllElements();

        for (int i = 0; i < resultado.size(); i++) {

            String datapag = null;
            if (resultado.get(i).getData_pagamento() == null) {
                datapag = "-";
            }
            if (resultado.get(i).getData_pagamento() != null) {
                datapag = formato.format(resultado.get(i).getData_pagamento());
            }
            String datavenci = null;
            if (resultado.get(i).getData_vencimento() == null) {
                datavenci = "-";
            }
            if (resultado.get(i).getData_vencimento() != null) {
                datavenci = formato.format(resultado.get(i).getData_vencimento());
            }

            modeloMensal.addRow(new Object[]{
                resultado.get(i).getId_mensalidade(),
                datapag,
                datavenci,
                resultado.get(i).getStatus_mensal()});

        }
    }

    public void populaTabelaMensal2(Mensalidades mensali) throws SQLException, ClassNotFoundException {

        DefaultTableModel modelo = (DefaultTableModel) jTAlunos.getModel();

        Alunos aluno = new Alunos();
        aluno.setId_aluno((int) modelo.getValueAt(jTAlunos.getSelectedRow(), 0));

        Mensalidades mensal = new Mensalidades();
        mensal.setAluno(aluno);
        mensal.setStatus_mensal(mensali.getStatus_mensal());

        DAOMensalidades daoMensal = new DAOMensalidades();
        List<Mensalidades> resultado;
        resultado = daoMensal.pesquisarMensalidades2(mensal);

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        DefaultTableModel modeloMensal = (DefaultTableModel) jTMensal.getModel();
        modeloMensal.getDataVector().removeAllElements();

        for (int i = 0; i < resultado.size(); i++) {

            String datapag = null;
            if (resultado.get(i).getData_pagamento() == null) {
                datapag = "-";
            }
            if (resultado.get(i).getData_pagamento() != null) {
                datapag = formato.format(resultado.get(i).getData_pagamento());
            }
            String datavenci = null;
            if (resultado.get(i).getData_vencimento() == null) {
                datavenci = "-";
            }
            if (resultado.get(i).getData_vencimento() != null) {
                datavenci = formato.format(resultado.get(i).getData_vencimento());
            }

            modeloMensal.addRow(new Object[]{
                resultado.get(i).getId_mensalidade(),
                datapag,
                datavenci,
                resultado.get(i).getStatus_mensal()});
        }
    }

    public void PopulaFotoAluno() throws ClassNotFoundException, SQLException {

        DefaultTableModel modelo = (DefaultTableModel) jTAlunos.getModel();

        Alunos alu = new Alunos();

        alu.setId_aluno((int) modelo.getValueAt(jTAlunos.getSelectedRow(), 0));

        DAOAlunos daoalu = new DAOAlunos();

        alu = daoalu.buscarImagemAluno(alu);

        jTFNomeAluno.setText((String) modelo.getValueAt(jTAlunos.getSelectedRow(), 1));

        if (alu.getFoto_aluno() != null) {

            ImageIcon imagem = new ImageIcon((byte[]) alu.getFoto_aluno());

            jLImagemAluno.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLImagemAluno.getWidth(), jLImagemAluno.getHeight(), Image.SCALE_DEFAULT)));

        } else {

            jLImagemAluno.setIcon(null);
            jLImagemAluno.setHorizontalAlignment(0);
            jLImagemAluno.setText("SEM FOTO");
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFMensalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMensalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMensalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMensalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMensalidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCBListarMensal;
    private com.toedter.calendar.JDateChooser jDCPagamento;
    private javax.swing.JLabel jLImagemAluno;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTAlunos;
    private javax.swing.JTextField jTFNomeAluno;
    private javax.swing.JTextField jTFPesquisarAluno;
    private javax.swing.JTable jTMensal;
    // End of variables declaration//GEN-END:variables
}