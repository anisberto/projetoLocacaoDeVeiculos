package br.com.pi.app;

import br.com.pi.bll.ModeloBll;
import br.com.pi.bll.VeiculoBll;
import br.com.pi.dal.ModeloDal;
import br.com.pi.design_patterns.template.veiculo.OrdenaAnoFabricacao;
import br.com.pi.design_patterns.template.veiculo.OrdenaAnoModelo;
import br.com.pi.design_patterns.template.veiculo.OrdenaMarca;
import br.com.pi.design_patterns.template.veiculo.OrdenaModelo;
import br.com.pi.model.ModeloModel;
import br.com.pi.model.MotoristaModel;
import br.com.pi.model.VeiculoModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VeiculoView extends javax.swing.JFrame {

    VeiculoBll veiculoInclud;
    ModeloBll modeloBll;
    int idDelete;
    String nomeUsuarioLogado;
    boolean incluir = true;

    public VeiculoView() throws Exception {
        initComponents();
        veiculoInclud = new VeiculoBll();
        modeloBll = new ModeloBll();
        jpDelecao.setVisible(false);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/rental_car_key.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnDeletar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRenavam = new javax.swing.JFormattedTextField();
        txtPrecoCompra = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNumeroPessoas = new javax.swing.JFormattedTextField();
        txtAnoFabricacao = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAnoModelo = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtQuilometragem = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jcModelo = new javax.swing.JComboBox<>();
        jcSituacao = new javax.swing.JComboBox<>();
        jcTipoVeiculo = new javax.swing.JComboBox<>();
        jcTipoCombustivel = new javax.swing.JComboBox<>();
        btnNovaMarca = new javax.swing.JButton();
        btnNovoModelo = new javax.swing.JButton();
        txtMarcaVeiculo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVeiculos = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableUsuarios2 = new javax.swing.JTable();
        txtElementoBuscador = new javax.swing.JTextField();
        jcBuscapor = new javax.swing.JComboBox<>();
        btnDeletarTable = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jpDelecao = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblRenavam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão de Veiculos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestão de Veiculos"));

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

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/salve-24.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvar.setEnabled(false);
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
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

        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/sale_small.png"))); // NOI18N
        btnVender.setText("Vender");
        btnVender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVender.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnVender.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnVender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados dos Veiculos"));

        jLabel1.setText("RENAVAM");

        try {
            txtRenavam.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRenavam.setEnabled(false);
        txtRenavam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRenavamKeyReleased(evt);
            }
        });

        txtPrecoCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        txtPrecoCompra.setEnabled(false);

        jLabel5.setText("Preço de Compra");

        jLabel9.setText("Nº de Pessoas");

        txtNumeroPessoas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtNumeroPessoas.setEnabled(false);

        try {
            txtAnoFabricacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtAnoFabricacao.setEnabled(false);

        jLabel10.setText("Ano de Fabricação");

        jLabel7.setText("Preço de Venda");

        txtPrecoVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####.00"))));
        txtPrecoVenda.setEnabled(false);

        jLabel11.setText("Ano do Modelo");

        try {
            txtAnoModelo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtAnoModelo.setEnabled(false);

        jLabel12.setText("Quilometragem");

        txtQuilometragem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtQuilometragem.setEnabled(false);

        jcModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jcModelo.setEnabled(false);
        jcModelo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcModeloAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jcModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcModeloActionPerformed(evt);
            }
        });

        jcSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Situação", "Disponivel", "Vendido" }));
        jcSituacao.setEnabled(false);

        jcTipoVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Veiculo", "Sedan", "Hatch", "SUV", "Pickup" }));
        jcTipoVeiculo.setEnabled(false);

        jcTipoCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Combustivel", "Flex", "Gasolina", "Etanol", "Gás" }));
        jcTipoCombustivel.setEnabled(false);
        jcTipoCombustivel.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcTipoCombustivelPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        btnNovaMarca.setText("+");
        btnNovaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaMarcaActionPerformed(evt);
            }
        });

        btnNovoModelo.setText("+");
        btnNovoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoModeloActionPerformed(evt);
            }
        });

        txtMarcaVeiculo.setEnabled(false);

        jLabel2.setText("Marca: ");

        jLabel3.setText("Modelo: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcTipoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jcTipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumeroPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcModelo, 0, 146, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNovoModelo)
                                        .addGap(12, 12, 12)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtAnoModelo))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMarcaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNovaMarca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(19, 19, 19))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovaMarca)
                    .addComponent(btnNovoModelo)
                    .addComponent(txtMarcaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNumeroPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1)
                    .addComponent(txtRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcTipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcTipoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Veiculos"));

        tableVeiculos.setAutoCreateRowSorter(true);
        tableVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Modelo", "Marca", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVeiculosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableVeiculos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Veiculos", jPanel7);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Veiculos"));

        jTableUsuarios2.setAutoCreateRowSorter(true);
        jTableUsuarios2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Modelo", "Marca", "Ano do Modelo", "Ano de Fabricação", "RENAVAM", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuarios2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarios2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableUsuarios2);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap())
        );

        jcBuscapor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar Por", "Marca", "Modelo", "Ano de Fabricacao", "Ano do Modelo" }));
        jcBuscapor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBuscaporActionPerformed(evt);
            }
        });

        btnDeletarTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/excluir_small.png"))); // NOI18N
        btnDeletarTable.setText("Deletar");
        btnDeletarTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarTableActionPerformed(evt);
            }
        });

        jButton1.setText("Listar dados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jpDelecao.setBorder(javax.swing.BorderFactory.createTitledBorder("Deleção"));

        jLabel4.setText("Modelo: ");

        lblModelo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(204, 0, 0));
        lblModelo.setText("Modelo ");

        jLabel8.setText("RENAVAM: ");

        lblRenavam.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRenavam.setForeground(new java.awt.Color(204, 0, 0));
        lblRenavam.setText("RENAVAM");

        javax.swing.GroupLayout jpDelecaoLayout = new javax.swing.GroupLayout(jpDelecao);
        jpDelecao.setLayout(jpDelecaoLayout);
        jpDelecaoLayout.setHorizontalGroup(
            jpDelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDelecaoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRenavam)
                .addContainerGap())
        );
        jpDelecaoLayout.setVerticalGroup(
            jpDelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDelecaoLayout.createSequentialGroup()
                .addGroup(jpDelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblModelo)
                    .addComponent(jLabel8)
                    .addComponent(lblRenavam))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jcBuscapor, 0, 194, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtElementoBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletarTable, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpDelecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcBuscapor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtElementoBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarTable)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpDelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Controle de Veiculos", jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try {
            if (!txtMarcaVeiculo.getText().isEmpty()) {
                int conf = JOptionPane.showConfirmDialog(null, "Confirmar a deleção do Veiculo RENAVAM Nº: " + veiculoInclud.getById(idDelete).getVeiculo_renavam(), "Deleção",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null);
                if (conf == 0) {
                    veiculoInclud.delete(idDelete);
                    JOptionPane.showMessageDialog(null, "Veiculo deletado com sucesso");
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Deleção Cancelada!");
                }
                imprimirDadosNaGrid(veiculoInclud.getAll());
            } else {
                JOptionPane.showMessageDialog(null, "Selecione o Veiculo na Tabela", "Deleção", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        try {
            enableButtFields(true);
            incluir = true;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            enableButtFields(false);
            clearFields();
            setItemMarca();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        try {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            menu.transferirDados(nomeUsuarioLogado);
            this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            VeiculoModel newVeiculo = new VeiculoModel();

            newVeiculo.setVeiculo_modelo(modeloBll.getByNome(jcModelo.getSelectedItem().toString()));
            newVeiculo.setVeiculo_precoVenda(Float.parseFloat(txtPrecoVenda.getText().replace(".", "").replace(",", "")));
            newVeiculo.setVeiculo_precoCompra(Float.parseFloat(txtPrecoCompra.getText().replace(".", "").replace(",", "")));
            newVeiculo.setVeiculo_numeroDePassageiro(Integer.parseInt(txtNumeroPessoas.getText()));
            newVeiculo.setVeiculo_anoFabrica(txtAnoFabricacao.getText());
            newVeiculo.setVeiculo_anoModelo(txtAnoModelo.getText());
            newVeiculo.setVeiculo_renavam(txtRenavam.getText());
            newVeiculo.setVeiculo_quilometragem(Float.parseFloat(txtQuilometragem.getText().replace(".", "").replace(",", "")));
            newVeiculo.setVeiculo_tipoCombustivel(jcTipoCombustivel.getSelectedItem().toString());
            newVeiculo.setVeiculo_tipoVeiculo(jcTipoVeiculo.getSelectedItem().toString());
            newVeiculo.setVeiculo_situacaoVeiculo(jcSituacao.getSelectedItem().toString());

            if (incluir) {
                veiculoInclud.add(newVeiculo);
                JOptionPane.showMessageDialog(null, "Processo Finalizado");
                enableButtFields(false);
                clearFields();
            } else {
                newVeiculo.setVeiculo_idem(Integer.parseInt(tableVeiculos.getValueAt(tableVeiculos.getSelectedRow(), 0).toString()));
                veiculoInclud.update(newVeiculo);
            }
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains("empt")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            } else {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } catch (Exception ilegal) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos");
        } finally {

            try {
                imprimirDadosNaGrid(veiculoInclud.getAll());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos");
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            enableButtFields(true);
            incluir = false;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tableVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVeiculosMouseClicked
        try {
            setItensFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tableVeiculosMouseClicked

    private void jTableUsuarios2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarios2MouseClicked
        try {
            setItensSecund();
            jpDelecao.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTableUsuarios2MouseClicked

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnNovoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoModeloActionPerformed
        try {
            ModeloView modeloNew = new ModeloView();
            modeloNew.setVisible(true);
            modeloNew.nomeUsuarioLogado = this.nomeUsuarioLogado;
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnNovoModeloActionPerformed
    private void imprimirDadosNaGrid(Iterator conjunto) {
        DefaultTableModel model = (DefaultTableModel) tableVeiculos.getModel();
        model.setNumRows(0);
        while (conjunto.hasNext()) {
            String[] linha = new String[4];
            VeiculoModel objVeiculo = (VeiculoModel) conjunto.next();
            linha[0] = objVeiculo.getVeiculo_idem() + "";
            linha[1] = objVeiculo.getVeiculo_modelo().getModelo_descricao();
            linha[2] = objVeiculo.getVeiculo_modelo().getModelo_marca().getMarca_descricao();
            linha[3] = objVeiculo.getVeiculo_situacaoVeiculo();
            model.addRow(linha);
        }
    }

    private void imprimirDadosNaGridCompleta(Iterator conjunto) {
        DefaultTableModel model = (DefaultTableModel) jTableUsuarios2.getModel();
        model.setNumRows(0);
        while (conjunto.hasNext()) {
            String[] linha = new String[7];
            VeiculoModel objVeiculo = (VeiculoModel) conjunto.next();
            linha[0] = objVeiculo.getVeiculo_idem() + "";
            linha[1] = objVeiculo.getVeiculo_modelo().getModelo_descricao();
            linha[2] = objVeiculo.getVeiculo_modelo().getModelo_marca().getMarca_descricao();
            linha[3] = objVeiculo.getVeiculo_anoModelo();
            linha[4] = objVeiculo.getVeiculo_anoFabrica();
            linha[5] = objVeiculo.getVeiculo_renavam();
            linha[6] = objVeiculo.getVeiculo_situacaoVeiculo();

            model.addRow(linha);
        }
    }
    private void btnNovaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaMarcaActionPerformed
        try {
            MarcaView marcaNew = new MarcaView();
            marcaNew.setVisible(true);
            marcaNew.nomeUsuarioLogado = this.nomeUsuarioLogado;
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnNovaMarcaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            imprimirDadosNaGrid(veiculoInclud.getAll());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowActivated

    private void jcModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcModeloActionPerformed
        try {
            setItemMarca();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jcModeloActionPerformed

    private void jcModeloAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcModeloAncestorAdded
        try {
            setItemsCombo();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jcModeloAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            imprimirDadosNaGridCompleta(veiculoInclud.getAll());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeletarTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarTableActionPerformed
        try {
            if (jpDelecao.isVisible()) {
                int conf = JOptionPane.showConfirmDialog(null, "Confirmar a deleção do Veiculo RENAVAM Nº: " + veiculoInclud.getById(idDelete).getVeiculo_renavam(), "Deleção",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null);
                if (conf == 0) {
                    veiculoInclud.delete(idDelete);
                    JOptionPane.showMessageDialog(null, "Veiculo deletado com sucesso");
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Deleção Cancelada!");
                }
                imprimirDadosNaGrid(veiculoInclud.getAll());
            } else {
                JOptionPane.showMessageDialog(null, "Selecione o Veiculo na Tabela", "Deleção", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não é Possivel Deletar este Veiculo!", "Veiculo vinculado a uma locação", JOptionPane.ERROR_MESSAGE);
            int conf = JOptionPane.showConfirmDialog(null, "Ir para locações", "Locações",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null);
            if (conf == 0) {
                LocacaoView locacao;
                try {
                    locacao = new LocacaoView();
                    locacao.setVisible(true);
                    locacao.nomeUsuarioLogado = nomeUsuarioLogado;
                    dispose();
                } catch (Exception ex) {
                    Logger.getLogger(VeiculoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } finally {
            try {
                jpDelecao.setVisible(false);
                imprimirDadosNaGridCompleta(veiculoInclud.getAll());
            } catch (Exception ex) {
                Logger.getLogger(VeiculoView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDeletarTableActionPerformed

    private void txtRenavamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRenavamKeyReleased

    }//GEN-LAST:event_txtRenavamKeyReleased

    private void jcTipoCombustivelPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcTipoCombustivelPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTipoCombustivelPopupMenuWillBecomeInvisible

    private void jcBuscaporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBuscaporActionPerformed
        OrdenaAnoFabricacao anofabricacao;
        OrdenaAnoModelo anomodelo;
        OrdenaMarca marca;
        OrdenaModelo modelo;
        try {

            if (jcBuscapor.getSelectedItem().toString().contains("Marca")) {
                marca = new OrdenaMarca();
                imprimir(marca.getAll());
            }
            if (jcBuscapor.getSelectedItem().toString().contains("Modelo")) {
                modelo = new OrdenaModelo();
                imprimir(modelo.getAll());
            }
            if (jcBuscapor.getSelectedItem().toString().contains("Ano de Fabricacao")) {
                anofabricacao = new OrdenaAnoFabricacao();
                imprimir(anofabricacao.getAll());
            }
            if (jcBuscapor.getSelectedItem().toString().contains("Ano de Modelo")) {
                modelo = new OrdenaModelo();
                imprimir(modelo.getAll());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jcBuscaporActionPerformed

    private void imprimir(ArrayList<VeiculoModel> dados) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableUsuarios2.getModel();
            model.setNumRows(0);
            int pos = 0;
            while (pos < dados.size()) {
                String[] linha = new String[7];
                VeiculoModel obj = dados.get(pos);
                linha[0] = obj.getVeiculo_idem() + "";
                linha[1] = obj.getVeiculo_modelo().getModelo_descricao();
                linha[2] = obj.getVeiculo_modelo().getModelo_marca().getMarca_descricao();
                linha[3] = obj.getVeiculo_anoModelo() + "";
                linha[4] = obj.getVeiculo_anoFabrica() + "";
                linha[5] = obj.getVeiculo_renavam() + "";
                linha[6] = obj.getVeiculo_situacaoVeiculo() + "";
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
            java.util.logging.Logger.getLogger(VeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VeiculoView().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(VeiculoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnDeletarTable;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnNovaMarca;
    private javax.swing.JButton btnNovoModelo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTableUsuarios2;
    private javax.swing.JComboBox<String> jcBuscapor;
    private javax.swing.JComboBox<String> jcModelo;
    private javax.swing.JComboBox<String> jcSituacao;
    private javax.swing.JComboBox<String> jcTipoCombustivel;
    private javax.swing.JComboBox<String> jcTipoVeiculo;
    private javax.swing.JPanel jpDelecao;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblRenavam;
    private javax.swing.JTable tableVeiculos;
    private javax.swing.JFormattedTextField txtAnoFabricacao;
    private javax.swing.JFormattedTextField txtAnoModelo;
    private javax.swing.JTextField txtElementoBuscador;
    private javax.swing.JTextField txtMarcaVeiculo;
    private javax.swing.JFormattedTextField txtNumeroPessoas;
    private javax.swing.JFormattedTextField txtPrecoCompra;
    private javax.swing.JFormattedTextField txtPrecoVenda;
    private javax.swing.JFormattedTextField txtQuilometragem;
    private javax.swing.JFormattedTextField txtRenavam;
    // End of variables declaration//GEN-END:variables
    public void enableButtFields(boolean yet) {
        if (yet) {
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnCancelar.setEnabled(true);
            btnDeletar.setEnabled(false);
            btnSalvar.setEnabled(true);
            btnVoltar.setEnabled(false);
            btnVender.setEnabled(false);

            btnNovoModelo.setEnabled(false);
            btnNovaMarca.setEnabled(false);

            jcModelo.setEnabled(true);
            txtPrecoVenda.setEnabled(true);
            txtPrecoCompra.setEnabled(true);
            txtNumeroPessoas.setEnabled(true);
            txtAnoFabricacao.setEnabled(true);
            txtAnoModelo.setEnabled(true);
            txtRenavam.setEnabled(true);
            txtQuilometragem.setEnabled(true);
            jcTipoVeiculo.setEnabled(true);
            jcTipoCombustivel.setEnabled(true);
            jcSituacao.setEnabled(true);
        } else {
            btnIncluir.setEnabled(true);
            btnAlterar.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnDeletar.setEnabled(true);
            btnVoltar.setEnabled(true);
            btnSalvar.setEnabled(false);
            btnVender.setEnabled(true);

            btnNovoModelo.setEnabled(true);
            btnNovaMarca.setEnabled(true);

            jcModelo.setEnabled(false);
            txtPrecoVenda.setEnabled(false);
            txtPrecoCompra.setEnabled(false);
            txtNumeroPessoas.setEnabled(false);
            txtAnoFabricacao.setEnabled(false);
            txtAnoModelo.setEnabled(false);
            txtRenavam.setEnabled(false);
            txtQuilometragem.setEnabled(false);
            jcTipoVeiculo.setEnabled(false);
            jcTipoCombustivel.setEnabled(false);
            jcSituacao.setEnabled(false);
        }
    }

    public void clearFields() {
        txtPrecoVenda.setText("");
        txtPrecoCompra.setText("");
        txtNumeroPessoas.setText("");
        txtAnoFabricacao.setText("");
        txtAnoModelo.setText("");
        txtRenavam.setText("");
        txtQuilometragem.setText("");
        txtMarcaVeiculo.setText("");
    }

    private void setItemsCombo() throws Exception {
        ModeloBll modelo = new ModeloBll();
        Iterator<ModeloModel> modeloListados = modelo.getAll();
        while (modeloListados.hasNext()) {
            jcModelo.addItem(modeloListados.next().getModelo_descricao());
        }
    }

    public void setItemMarca() throws Exception {
        ModeloDal modelo = new ModeloDal();
        ModeloModel modeloField = modelo.getByNome(jcModelo.getSelectedItem().toString());
        txtMarcaVeiculo.setText(modeloField.getModelo_marca().getMarca_descricao());
    }

    private void setItensFirst() {
        try {
            int id = Integer.parseInt(tableVeiculos.getValueAt(tableVeiculos.getSelectedRow(), 0).toString());
            idDelete = id;
            VeiculoModel veiculo = veiculoInclud.getById(id);

            txtMarcaVeiculo.setText(veiculo.getVeiculo_modelo().getModelo_marca().getMarca_descricao());
            txtPrecoVenda.setText(veiculo.getVeiculo_precoVenda() + "");
            txtPrecoCompra.setText(veiculo.getVeiculo_precoCompra() + "");
            txtNumeroPessoas.setText(veiculo.getVeiculo_numeroDePassageiro() + "");
            txtAnoFabricacao.setText(veiculo.getVeiculo_anoFabrica());
            txtAnoModelo.setText(veiculo.getVeiculo_anoModelo());
            txtRenavam.setText(veiculo.getVeiculo_renavam());
            txtQuilometragem.setText(veiculo.getVeiculo_quilometragem() + "");

            jcModelo.removeAllItems();
            jcModelo.addItem(veiculo.getVeiculo_modelo().getModelo_descricao());

            jcTipoCombustivel.removeAllItems();
            jcTipoCombustivel.addItem(veiculo.getVeiculo_tipoCombustivel());

            jcTipoVeiculo.removeAllItems();
            jcTipoVeiculo.addItem(veiculo.getVeiculo_tipoVeiculo());

            jcSituacao.removeAllItems();
            jcSituacao.addItem(veiculo.getVeiculo_situacaoVeiculo());
            jcSituacao.addItem("Vendido");
            jcSituacao.addItem("Disponivel");
        } catch (Exception e) {
        }
    }

    private void setItensSecund() throws Exception {
        int id = Integer.parseInt(jTableUsuarios2.getValueAt(jTableUsuarios2.getSelectedRow(), 0).toString());
        idDelete = id;
        VeiculoModel veiculo = veiculoInclud.getById(id);

        lblModelo.setText(veiculo.getVeiculo_modelo().getModelo_descricao());
        lblRenavam.setText(veiculo.getVeiculo_renavam());
    }
}
