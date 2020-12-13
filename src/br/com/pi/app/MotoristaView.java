package br.com.pi.app;

import br.com.pi.bll.EnderecoBll;
import br.com.pi.bll.MotoristaBll;
import br.com.pi.design_patterns.template.motorista.*;

import br.com.pi.model.EnderecoModel;
import br.com.pi.model.MotoristaModel;
import br.com.pi.util.Imagem_util;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class MotoristaView extends javax.swing.JFrame {

    BufferedImage imagem;
    byte[] imagemUpdate;
    String nomeUsuarioLogado;
    EnderecoBll endBll = new EnderecoBll();
    EnderecoModel endereco = new EnderecoModel();
    boolean incluirEndereco = true;
    int idDeleteCliente;

    //Watlas
    int idMotorista;
    int idControl;
    MotoristaModel motoristaModel;
    MotoristaBll motoristaBll;
    DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("pt", "BR"));

    public MotoristaView() throws Exception {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/rental_car_key.png")).getImage());
        motoristaBll = new MotoristaBll();
        atualizarGrid();
        btnSalvarMotorista.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnDeletar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnSalvarMotorista = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRg = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JFormattedTextField();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtValidade = new javax.swing.JFormattedTextField();
        txtNregistro = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        btnImagem = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMotorista = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtMotoristaRua = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        txtMotoristaCidade = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        txtMotoristaBairro = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        txtMotoristaCep = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        txtMotoristaComplemento = new javax.swing.JFormattedTextField();
        cboMotoristaUF = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtMotoristaNumero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIdEndMotorista = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMotoristaControl = new javax.swing.JTable();
        jTextFieldpesquisa = new javax.swing.JTextField();
        jComboBoxpesquisa = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão de Motoristas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestão de Motorista"));

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/lixo-24.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDeletar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeletar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnDeletar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/mais.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIncluir.setFocusPainted(false);
        btnIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIncluir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/cancel_77947.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerifyInputWhenFocusTarget(false);
        btnCancelar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVoltar.setIconTextGap(12);
        btnVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnSalvarMotorista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/salve-24.png"))); // NOI18N
        btnSalvarMotorista.setText("Salvar");
        btnSalvarMotorista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvarMotorista.setEnabled(false);
        btnSalvarMotorista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvarMotorista.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnSalvarMotorista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvarMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMotoristaActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/papel.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvarMotorista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnIncluir)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnSalvarMotorista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados dos Motorista"));

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpfKeyTyped(evt);
            }
        });

        jLabel4.setText("RG");

        txtRg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRgKeyTyped(evt);
            }
        });

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyTyped(evt);
            }
        });

        jLabel5.setText("Telefone");

        jLabel6.setText("E-mail");

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria CNH", "A", "B", "AB", "AC", "C", "AD", "D", "E" }));

        jLabel9.setText("Validade");

        try {
            txtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtValidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValidadeKeyTyped(evt);
            }
        });

        txtNregistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNregistroKeyTyped(evt);
            }
        });

        jLabel10.setText("Nº Registro");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem CNH"));
        jPanel5.setMaximumSize(new java.awt.Dimension(238, 81));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnImagem.setText("Add Imagem");
        btnImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNregistro))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCpf)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail))
                    .addComponent(jSeparator1))
                .addGap(18, 18, 18)
                .addComponent(btnImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtNregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Motorista"));

        jTableMotorista.setAutoCreateRowSorter(true);
        jTableMotorista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Nome", "CPF", "Nº CNH", "CATEGORIA"
            }
        ));
        jTableMotorista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableMotoristaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMotorista);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel7.setText("Rua");

        jLabel16.setText("Cidade");

        jLabel17.setText("Bairro");

        jLabel18.setText("CEP");

        try {
            txtMotoristaCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtMotoristaCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMotoristaCepKeyTyped(evt);
            }
        });

        jLabel19.setText("Complemento");

        cboMotoristaUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione UF>", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel3.setText("Número");

        txtMotoristaNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMotoristaNumeroKeyTyped(evt);
            }
        });

        jLabel8.setText("ID");

        txtIdEndMotorista.setEnabled(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdEndMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMotoristaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMotoristaBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMotoristaRua, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMotoristaNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMotoristaComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMotoristaCep)
                    .addComponent(cboMotoristaUF, 0, 140, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtMotoristaCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMotoristaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtMotoristaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtIdEndMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(txtMotoristaComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboMotoristaUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtMotoristaRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtMotoristaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Motorista", jPanel4);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Motoristas"));

        jTableMotoristaControl.setAutoCreateRowSorter(true);
        jTableMotoristaControl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Nome", "CPF", "Nº CNH", "CATEGORIA"
            }
        ));
        jTableMotoristaControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMotoristaControlMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMotoristaControl);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jComboBoxpesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar Por", "Nome", "CPF", "Email", "RG" }));
        jComboBoxpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxpesquisaActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/excluir_small.png"))); // NOI18N
        jButton1.setText("Deletar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxpesquisa, 0, 303, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(547, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(203, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Hitorico de Motorista", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limparEnderecoMotorista() {
        txtMotoristaCidade.setText("");
        txtMotoristaBairro.setText("");
        txtMotoristaCep.setText("");
        txtMotoristaRua.setText("");
        txtMotoristaComplemento.setText("");
        txtMotoristaNumero.setText("");
        cboMotoristaUF.setSelectedItem("<Selecione UF>");
        txtIdEndMotorista.setText("");
    }

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
//            incluirEndereco = false;
//            enableBuEndereco(true);
            motoristaModel = new MotoristaModel();
            endereco = new EnderecoModel();

            motoristaModel.setMotorista_nome(txtNome.getText());
            motoristaModel.setMotorista_email(txtEmail.getText());
            motoristaModel.setMotorista_cpf(txtCpf.getText());
            motoristaModel.setMotorista_rg(txtRg.getText());
            motoristaModel.setMotorista_telefone(txtTelefone.getText());
            motoristaModel.setMotorista_idem(idMotorista);
            //CNH
            motoristaModel.setCnh_categoria(jComboBoxCategoria.getSelectedItem().toString());
            motoristaModel.setCnh_dataValidade(new java.sql.Date(new java.util.Date(txtValidade.getText()).getTime()));
            motoristaModel.setCnh_numeroRegistro(Integer.parseInt(txtNregistro.getText()));
            motoristaModel.setCnh_imagem(imagemUpdate);
            //Endereco
            endereco.setEndereco_bairro(txtMotoristaBairro.getText());
            endereco.setEndereco_cep(txtMotoristaCep.getText());
            endereco.setEndereco_cidade(txtMotoristaCidade.getText());
            endereco.setEndereco_complemento(txtMotoristaComplemento.getText());
            endereco.setEndereco_estado(cboMotoristaUF.getSelectedItem().toString());
            endereco.setEndereco_numero(Integer.parseInt(txtMotoristaNumero.getText()));
            endereco.setEndereco_rua(txtMotoristaRua.getText());
            endereco.setEndereco_iden(Integer.parseInt(txtIdEndMotorista.getText()));
            //MotoristaComEndereco
            motoristaModel.setMotorista_endereco(endereco);

            motoristaBll.updateAll(motoristaModel, endereco);
            atualizarGrid();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        try {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            menu.transferirDados(nomeUsuarioLogado);
            this.dispose();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            enderecoEnableButtons(false);
            enableButtFields(false);
            //incluir = true;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed

        try {
            limparEnderecoMotorista();
            incluirEndereco = true;
            //    enderecoMotoristaEnableButtons(true);
            MotoristaModel m = new MotoristaModel();
            m.setCnh_imagem(Imagem_util.getImgBytes(imagem));

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void jTableMotoristaControlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMotoristaControlMouseClicked
        //idMotorista = Integer.parseInt(jTableMotorista.getValueAt(jTableMotorista.getSelectedRow(), 0).toString());
        idControl = Integer.parseInt(jTableMotoristaControl.getValueAt(jTableMotoristaControl.getSelectedRow(), 0).toString());
        jTextFieldpesquisa.setText(jTableMotoristaControl.getValueAt(jTableMotoristaControl.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_jTableMotoristaControlMouseClicked

    private void btnImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagemActionPerformed
        try {
            JFileChooser path = new JFileChooser();
            path.setFileFilter(new FileNameExtensionFilter("Image files", "bmp", "png", "jpg"));
            path.setAcceptAllFileFilterUsed(false);
            int result = path.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                File file = path.getSelectedFile();
                imagem = Imagem_util.setImagemDimensao(file.getAbsolutePath(), 300, 83);
                lblImagem.setIcon(new ImageIcon(imagem));
                imagemUpdate = Imagem_util.getImgBytes(imagem);
            } else {
                JOptionPane.showMessageDialog(null, "Você não Selecionou uma Imagem!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnImagemActionPerformed

    private void jComboBoxpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxpesquisaActionPerformed
        OrdenaNome nome;
        OrdenaCpf cpf;
        OrdenaEmail email;
        OrdenaRg rg;
        try {
            if (jComboBoxpesquisa.getSelectedItem().toString().contains("Nome")) {
                nome = new OrdenaNome();
                imprimirNaGrid(nome.getAll());
            }
            if (jComboBoxpesquisa.getSelectedItem().toString().contains("CPF")) {
                cpf = new OrdenaCpf();
                imprimirNaGrid(cpf.getAll());
            }
            if (jComboBoxpesquisa.getSelectedItem().toString().contains("Email")) {
                email = new OrdenaEmail();
                imprimirNaGrid(email.getAll());
            }
            if (jComboBoxpesquisa.getSelectedItem().toString().contains("RG")) {
                rg = new OrdenaRg();
                imprimirNaGrid(rg.getAll());
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jComboBoxpesquisaActionPerformed

    private void btnSalvarMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMotoristaActionPerformed
        try {
            motoristaModel = new MotoristaModel();
            endereco = new EnderecoModel();

            motoristaModel.setMotorista_nome(txtNome.getText());
            motoristaModel.setMotorista_email(txtEmail.getText());
            motoristaModel.setMotorista_cpf(txtCpf.getText());
            motoristaModel.setMotorista_rg(txtRg.getText());
            motoristaModel.setMotorista_telefone(txtTelefone.getText());
            //CNH
            motoristaModel.setCnh_categoria(jComboBoxCategoria.getSelectedItem().toString());
            motoristaModel.setCnh_dataValidade(new java.sql.Date(new java.util.Date(txtValidade.getText()).getTime()));
            motoristaModel.setCnh_numeroRegistro(Integer.parseInt(txtNregistro.getText()));
            motoristaModel.setCnh_imagem(Imagem_util.getImgBytes(imagem));
            //Endereco
            endereco.setEndereco_bairro(txtMotoristaBairro.getText());
            endereco.setEndereco_cep(txtMotoristaCep.getText());
            endereco.setEndereco_cidade(txtMotoristaCidade.getText());
            endereco.setEndereco_complemento(txtMotoristaComplemento.getText());
            endereco.setEndereco_estado(cboMotoristaUF.getSelectedItem().toString());
            endereco.setEndereco_numero(Integer.parseInt(txtMotoristaNumero.getText()));
            endereco.setEndereco_rua(txtMotoristaRua.getText());
            //MotoristaComEndereco
            motoristaModel.setMotorista_endereco(endereco);

            motoristaBll.addAll(motoristaModel, endereco);
            atualizarGrid();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarMotoristaActionPerformed

    private void jTableMotoristaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMotoristaMouseReleased
        idMotorista = Integer.parseInt(jTableMotorista.getValueAt(jTableMotorista.getSelectedRow(), 0).toString());

        try {
            motoristaModel = motoristaBll.getById(idMotorista);
            txtNome.setText(motoristaModel.getMotorista_nome());
            txtEmail.setText(motoristaModel.getMotorista_email());
            txtCpf.setText(motoristaModel.getMotorista_cpf());
            txtTelefone.setText(motoristaModel.getMotorista_telefone());
            txtRg.setText(motoristaModel.getMotorista_rg());
            //endereco
            txtIdEndMotorista.setText(motoristaModel.getMotorista_endereco().getEndereco_iden() + "");
            txtMotoristaBairro.setText(motoristaModel.getMotorista_endereco().getEndereco_bairro());
            txtMotoristaCep.setText(motoristaModel.getMotorista_endereco().getEndereco_cep());
            txtMotoristaCidade.setText(motoristaModel.getMotorista_endereco().getEndereco_cidade());
            txtMotoristaComplemento.setText(motoristaModel.getMotorista_endereco().getEndereco_complemento());
            txtMotoristaNumero.setText(motoristaModel.getMotorista_endereco().getEndereco_numero() + "");
            txtMotoristaRua.setText(motoristaModel.getMotorista_endereco().getEndereco_rua());
            //cnh

            SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
            String stringDate = DateFor.format(motoristaModel.getCnh_dataValidade());
            txtValidade.setText(stringDate);
            txtNregistro.setText(motoristaModel.getCnh_numeroRegistro() + "");
            jComboBoxCategoria.setSelectedItem(motoristaModel.getCnh_categoria().toString());
            lblImagem.setIcon(new ImageIcon(motoristaModel.getCnh_imagem()));
            imagemUpdate = motoristaModel.getCnh_imagem();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }


    }//GEN-LAST:event_jTableMotoristaMouseReleased

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try {
            motoristaBll.deleteAll(idMotorista, Integer.parseInt(txtIdEndMotorista.getText()));

            atualizarGrid();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void txtCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")
                && (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE
                && evt.getKeyCode() != KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCpfKeyTyped

    private void txtRgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRgKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")
                && (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE
                && evt.getKeyCode() != KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRgKeyTyped

    private void txtTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")
                && (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE
                && evt.getKeyCode() != KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefoneKeyTyped

    private void txtValidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValidadeKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")
                && (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE
                && evt.getKeyCode() != KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtValidadeKeyTyped

    private void txtNregistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNregistroKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")
                && (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE
                && evt.getKeyCode() != KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNregistroKeyTyped

    private void txtMotoristaNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotoristaNumeroKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")
                && (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE
                && evt.getKeyCode() != KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMotoristaNumeroKeyTyped

    private void txtMotoristaCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotoristaCepKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")
                && (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE
                && evt.getKeyCode() != KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMotoristaCepKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            motoristaBll.delete(idControl);
            jComboBoxpesquisaActionPerformed(null);
            atualizarGrid();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void atualizarGrid() throws Exception {
        DefaultTableModel model = (DefaultTableModel) jTableMotorista.getModel();
        model.setRowCount(0);
        Object[] linha;

        Iterator<MotoristaModel> listMotorista = motoristaBll.getAll();
        for (Iterator<MotoristaModel> it = listMotorista; it.hasNext();) {
            MotoristaModel aux = it.next();
            linha = new Object[]{
                aux.getMotorista_idem(),
                aux.getMotorista_nome(),
                aux.getMotorista_cpf(),
                aux.getCnh_numeroRegistro(),
                aux.getCnh_categoria(),};
            model.addRow(linha);

        }
    }

    private void imprimirNaGrid(List<MotoristaModel> dados) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableMotoristaControl.getModel();
            model.setNumRows(0);
            int pos = 0;
            while (pos < dados.size()) {
                String[] linha = new String[5];
                MotoristaModel obj = dados.get(pos);
                linha[0] = obj.getMotorista_idem() + "";
                linha[1] = obj.getMotorista_nome();
                linha[2] = obj.getMotorista_cpf();
                linha[3] = obj.getCnh_numeroRegistro() + "";
                linha[4] = obj.getCnh_categoria() + "";
                model.addRow(linha);
                pos++;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(MotoristaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotoristaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotoristaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotoristaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MotoristaView().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MotoristaView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnImagem;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSalvarMotorista;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cboMotoristaUF;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxpesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableMotorista;
    private javax.swing.JTable jTableMotoristaControl;
    private javax.swing.JTextField jTextFieldpesquisa;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtEmail;
    private javax.swing.JTextField txtIdEndMotorista;
    private javax.swing.JFormattedTextField txtMotoristaBairro;
    private javax.swing.JFormattedTextField txtMotoristaCep;
    private javax.swing.JFormattedTextField txtMotoristaCidade;
    private javax.swing.JFormattedTextField txtMotoristaComplemento;
    private javax.swing.JTextField txtMotoristaNumero;
    private javax.swing.JFormattedTextField txtMotoristaRua;
    private javax.swing.JFormattedTextField txtNome;
    private javax.swing.JFormattedTextField txtNregistro;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JFormattedTextField txtValidade;
    // End of variables declaration//GEN-END:variables
    public void enableButtFields(boolean yet) {
        if (yet) {
            btnSalvarMotorista.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnCancelar.setEnabled(true);
            btnDeletar.setEnabled(false);
            btnVoltar.setEnabled(false);
            btnImagem.setEnabled(true);
        } else {
            btnIncluir.setEnabled(true);
            btnAlterar.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnDeletar.setEnabled(true);
            btnVoltar.setEnabled(true);
            btnSalvarMotorista.setEnabled(false);
            btnImagem.setEnabled(false);
        }
    }

    private void enderecoMotoristaEnableButtons(boolean butt) {
        if (butt) {
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnCancelar.setEnabled(true);
            btnDeletar.setEnabled(false);
            btnSalvarMotorista.setEnabled(true);

            txtMotoristaCidade.setEnabled(true);
            txtMotoristaBairro.setEnabled(true);
            txtMotoristaCep.setEnabled(true);
            txtMotoristaNumero.setEnabled(true);
            txtMotoristaRua.setEnabled(true);
            txtMotoristaComplemento.setEnabled(true);

        } else {
            btnIncluir.setEnabled(true);
            btnAlterar.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnDeletar.setEnabled(true);

            txtMotoristaCidade.setEnabled(false);
            txtMotoristaBairro.setEnabled(false);
            txtMotoristaCep.setEnabled(false);
            txtMotoristaRua.setEnabled(false);
            txtMotoristaNumero.setEnabled(false);
            txtMotoristaComplemento.setEnabled(false);

        }
    }

    private void consultarEndereco(List<EnderecoModel> lista) throws Exception {
        DefaultTableModel modelo = (DefaultTableModel) jTableMotoristaControl.getModel();
        modelo.setNumRows(0);

        for (int pos = 0; pos < lista.size(); pos++) {
            String[] linha = new String[8];
            EnderecoModel aux = lista.get(pos);
            linha[0] = aux.getEndereco_iden() + "";
            linha[1] = aux.getEndereco_cidade() + "";
            linha[2] = aux.getEndereco_bairro() + "";
            linha[3] = aux.getEndereco_cep() + "";
            linha[4] = aux.getEndereco_rua() + "";
            linha[5] = aux.getEndereco_numero() + "";
            linha[6] = aux.getEndereco_complemento() + "";
            linha[7] = aux.getEndereco_estado() + "";
            modelo.addRow(linha);
        }
    }

    private void enderecoEnableButtons(boolean butt) {
        if (butt) {
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnCancelar.setEnabled(true);
            btnDeletar.setEnabled(false);
            btnSalvarMotorista.setEnabled(true);

            txtMotoristaCidade.setEnabled(true);
            txtMotoristaBairro.setEnabled(true);
            txtMotoristaCep.setEnabled(true);
            txtMotoristaRua.setEnabled(true);
            txtMotoristaComplemento.setEnabled(true);
            txtMotoristaNumero.setEnabled(true);
            //txt.setEnabled(true);

        } else {
            btnIncluir.setEnabled(true);
            btnAlterar.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnDeletar.setEnabled(true);

            txtMotoristaCidade.setEnabled(false);
            txtMotoristaBairro.setEnabled(false);
            txtMotoristaCep.setEnabled(false);
            txtMotoristaRua.setEnabled(false);
            txtMotoristaComplemento.setEnabled(false);
            txtMotoristaNumero.setEnabled(false);
            //txt.setEnabled(true);

            limparEnderecoMotorista();

        }
    }

//    public void camposMotoristaDisable() {
//        txtMotoristaCidade.setEnabled(false);
//        txtMotoristaBairro.setEnabled(false);
//        txtMotoristaCep.setEnabled(false);
//        txtMotoristaRua.setEnabled(false);
//        txtMotoristaComplemento.setEnabled(false);
//        txtMotoristaNumero.setEnabled(false);
//    }
    private void enableBuEndereco(boolean butt) {
        if (butt) {
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnCancelar.setEnabled(true);
            btnDeletar.setEnabled(false);
            btnSalvarMotorista.setEnabled(true);

            txtMotoristaCidade.setEnabled(true);
            txtMotoristaBairro.setEnabled(true);
            txtMotoristaCep.setEnabled(true);
            txtMotoristaRua.setEnabled(true);
            txtMotoristaComplemento.setEnabled(true);
            txtMotoristaNumero.setEnabled(true);
            //txt.setEnabled(true);

        } else {

            btnIncluir.setEnabled(true);
            btnAlterar.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnDeletar.setEnabled(true);
            btnSalvarMotorista.setEnabled(false);

            txtMotoristaCidade.setEnabled(false);
            txtMotoristaBairro.setEnabled(false);
            txtMotoristaCep.setEnabled(false);
            txtMotoristaRua.setEnabled(false);
            txtMotoristaComplemento.setEnabled(false);
            txtMotoristaNumero.setEnabled(false);
            //txt.setEnabled(true);

            //limparEndereco();
        }
    }

}
