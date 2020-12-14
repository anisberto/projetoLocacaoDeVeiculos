package br.com.pi.app;

import br.com.pi.bll.AdministradorBll;
import br.com.pi.bll.LocacaoBll;
import br.com.pi.bll.MotoristaBll;
import br.com.pi.bll.PessoaBll;
import br.com.pi.bll.PessoaPFBll;
import br.com.pi.bll.PessoaPJBll;
import br.com.pi.bll.ReservaBll;
import br.com.pi.bll.VeiculoBll;
import br.com.pi.dal.AdministradorDal;
import br.com.pi.dal.VeiculoDal;
import br.com.pi.model.AdministradorModel;
import br.com.pi.model.LocacaoModel;
import br.com.pi.model.MotoristaModel;
import br.com.pi.model.PessoaModel;
import br.com.pi.model.PessoaPFModel;
import br.com.pi.model.PessoaPJModel;
import br.com.pi.model.ReservaModel;
import br.com.pi.model.VeiculoModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LocacaoView extends javax.swing.JFrame {

    ReservaBll reservabll;
    LocacaoBll incluirLocacao;
    MotoristaBll motoristas;
    VeiculoBll veiculobll;
    PessoaBll pessoaBll;
    PessoaPFBll pf;
    PessoaPJBll pj;
    String nomeUsuarioLogado;
    int idDelecao = 0;
    AdministradorBll adm;
    boolean incluir = true;

    public LocacaoView() throws Exception {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/rental_car_key.png")).getImage());
        jcClienteFisica.setVisible(false);
        jcClienteJuridica.setVisible(false);
        incluirLocacao = new LocacaoBll();
        motoristas = new MotoristaBll();
        reservabll = new ReservaBll();
        adm = new AdministradorBll();
        veiculobll = new VeiculoBll();
        pessoaBll = new PessoaBll();
        pf = new PessoaPFBll();
        pj = new PessoaPJBll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnDeletar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDataRetirada = new javax.swing.JFormattedTextField();
        txtCodigo = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDataDevolucao = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtKMInicial = new javax.swing.JFormattedTextField();
        txtValorLocacao = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtValorCaucao = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtValorSeguro = new javax.swing.JFormattedTextField();
        jcMotorista = new javax.swing.JComboBox<>();
        btnNovoMotorista = new javax.swing.JButton();
        jcVeiculo = new javax.swing.JComboBox<>();
        btnNovoVeiculo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtRenavamVeiculo = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jrFisica = new javax.swing.JRadioButton();
        jrJuridica = new javax.swing.JRadioButton();
        jcClienteFisica = new javax.swing.JComboBox<>();
        btnNovoCliente = new javax.swing.JButton();
        jcClienteJuridica = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLocacao = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtLocaGerir = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNomeDevo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtnomeMotDevo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcpfDevo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCnhDevo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtKmDevo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDataDevo = new javax.swing.JTextField();
        btnDevolver = new javax.swing.JButton();
        txtVeiculoDevo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtRenavamDevo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtCompletaLocacao = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        btnIncluirReserva = new javax.swing.JButton();
        btnCancelarReserva = new javax.swing.JButton();
        btnSalvarReserva = new javax.swing.JButton();
        btnCancelar2 = new javax.swing.JButton();
        btnCancelarReserva1 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtDataRetiradaReserva = new javax.swing.JFormattedTextField();
        txtCodigoReserva = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        txtDataDevolucaoReserva = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        txtKMInicialReserva = new javax.swing.JFormattedTextField();
        txtValorLocacaoReserva = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtValorCaucaoReserva = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        txtValorSeguroReserva = new javax.swing.JFormattedTextField();
        jcMotoristaReserva = new javax.swing.JComboBox<>();
        txtRenavamReserva = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        txtVeiculoReserva = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtClienteReserva = new javax.swing.JFormattedTextField();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableReservas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locação");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestão de Locações"));

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/lixo-24.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDeletar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeletar.setPreferredSize(new java.awt.Dimension(50, 70));
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
        btnIncluir.setPreferredSize(new java.awt.Dimension(50, 70));
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
        btnCancelar.setPreferredSize(new java.awt.Dimension(50, 70));
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
        btnVoltar.setPreferredSize(new java.awt.Dimension(50, 70));
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
        btnSalvar.setPreferredSize(new java.awt.Dimension(50, 70));
        btnSalvar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados de Locações"));

        jLabel1.setText("Codigo");

        jLabel2.setText("Data de Retirada");

        try {
            txtDataRetirada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataRetirada.setEnabled(false);

        txtCodigo.setEnabled(false);

        jLabel3.setText("Data Prevista de Devolução");

        try {
            txtDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataDevolucao.setEnabled(false);

        jLabel4.setText("KM Inicial");

        txtKMInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtKMInicial.setEnabled(false);

        txtValorLocacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtValorLocacao.setEnabled(false);

        jLabel5.setText("Valor da Locação");

        jLabel6.setText("RENAVAM");

        txtValorCaucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtValorCaucao.setEnabled(false);

        jLabel7.setText("Valor do Seguro");

        txtValorSeguro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtValorSeguro.setEnabled(false);

        jcMotorista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motorista" }));
        jcMotorista.setEnabled(false);
        jcMotorista.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcMotoristaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jcMotorista.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcMotoristaPopupMenuWillBecomeVisible(evt);
            }
        });
        jcMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMotoristaActionPerformed(evt);
            }
        });

        btnNovoMotorista.setText("+");
        btnNovoMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoMotoristaActionPerformed(evt);
            }
        });

        jcVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veiculo" }));
        jcVeiculo.setEnabled(false);
        jcVeiculo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcVeiculoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jcVeiculo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcVeiculoPopupMenuWillBecomeVisible(evt);
            }
        });
        jcVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcVeiculoActionPerformed(evt);
            }
        });

        btnNovoVeiculo.setText("+");
        btnNovoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoVeiculoActionPerformed(evt);
            }
        });

        txtRenavamVeiculo.setEnabled(false);

        jLabel15.setText("Valor Caução");

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Cliente"));

        jrFisica.setText("Pessoa Fisica");
        jrFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrFisicaActionPerformed(evt);
            }
        });

        jrJuridica.setText("Pessoa Juridica");
        jrJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrJuridicaActionPerformed(evt);
            }
        });

        jcClienteFisica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente Fisico" }));
        jcClienteFisica.setEnabled(false);
        jcClienteFisica.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcClienteFisicaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jcClienteFisica.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcClienteFisicaPopupMenuWillBecomeVisible(evt);
            }
        });
        jcClienteFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcClienteFisicaActionPerformed(evt);
            }
        });

        btnNovoCliente.setText("+");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        jcClienteJuridica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente Juridico" }));
        jcClienteJuridica.setEnabled(false);
        jcClienteJuridica.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcClienteJuridicaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jcClienteJuridica.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcClienteJuridicaPopupMenuWillBecomeVisible(evt);
            }
        });
        jcClienteJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcClienteJuridicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrFisica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrJuridica)
                .addGap(18, 18, 18)
                .addComponent(jcClienteFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcClienteJuridica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoCliente)
                    .addComponent(jrFisica)
                    .addComponent(jrJuridica)
                    .addComponent(jcClienteFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcClienteJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorSeguro, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNovoMotorista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNovoVeiculo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKMInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorCaucao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtRenavamVeiculo))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtDataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtValorSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRenavamVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValorCaucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtKMInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtValorLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoMotorista)
                    .addComponent(jcMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Locações"));

        tabelaLocacao.setAutoCreateRowSorter(true);
        tabelaLocacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Codigo", "Cliente", "Motorista", "Veiculo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaLocacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaLocacaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaLocacao);

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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Locação", jPanel4);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Locações"));

        JtLocaGerir.setAutoCreateRowSorter(true);
        JtLocaGerir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Codigo", "Cliente", "Motorista", "Veiculo", "Situação Veiculo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtLocaGerir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtLocaGerirMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JtLocaGerir);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Devolução de Veiculo"));

        jLabel8.setText("Nome Cliente");

        txtNomeDevo.setEnabled(false);
        txtNomeDevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDevoActionPerformed(evt);
            }
        });
        txtNomeDevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeDevoKeyReleased(evt);
            }
        });

        jLabel9.setText("Nome Motorista");

        txtnomeMotDevo.setEnabled(false);

        jLabel10.setText("CPF Motorista");

        txtcpfDevo.setEnabled(false);

        jLabel11.setText("CNH");

        txtCnhDevo.setEnabled(false);

        jLabel12.setText("KM Inicial");

        txtKmDevo.setEnabled(false);

        jLabel13.setText("Data de Devolução");

        txtDataDevo.setEnabled(false);

        btnDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/car_Small.png"))); // NOI18N
        btnDevolver.setText("Devolver");
        btnDevolver.setEnabled(false);
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });
        btnDevolver.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnDevolverKeyReleased(evt);
            }
        });

        txtVeiculoDevo.setEnabled(false);

        jLabel16.setText("Veiculo");

        txtRenavamDevo.setEnabled(false);

        jLabel17.setText("RENAVAM");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeDevo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataDevo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtKmDevo, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVeiculoDevo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRenavamDevo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcpfDevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnomeMotDevo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCnhDevo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(btnDevolver)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDevolver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtNomeDevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(txtcpfDevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtnomeMotDevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addComponent(txtCnhDevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtDataDevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtKmDevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(txtVeiculoDevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(txtRenavamDevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar Por", "Nome Cliente", "Nome Motorista", "CPF Cliente", "CPF Motorista" }));

        jButton1.setText("Carregar Locações");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jComboBox4, 0, 340, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gerenciar Locações", jPanel5);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Locações"));

        jtCompletaLocacao.setAutoCreateRowSorter(true);
        jtCompletaLocacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Codigo", "Cliente", "Motorista", "Veiculo", "Data de Devolução", "Data de Locação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCompletaLocacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCompletaLocacaoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtCompletaLocacao);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 956, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Hitorico de Locações", jPanel8);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestão de Locações"));

        btnIncluirReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/mais.png"))); // NOI18N
        btnIncluirReserva.setText("Atender");
        btnIncluirReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIncluirReserva.setFocusPainted(false);
        btnIncluirReserva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIncluirReserva.setPreferredSize(new java.awt.Dimension(50, 70));
        btnIncluirReserva.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnIncluirReserva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIncluirReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirReservaActionPerformed(evt);
            }
        });

        btnCancelarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/cancel_77947.png"))); // NOI18N
        btnCancelarReserva.setText("Cancelar");
        btnCancelarReserva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarReserva.setPreferredSize(new java.awt.Dimension(50, 70));
        btnCancelarReserva.setVerifyInputWhenFocusTarget(false);
        btnCancelarReserva.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCancelarReserva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarReservaActionPerformed(evt);
            }
        });

        btnSalvarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/salve-24.png"))); // NOI18N
        btnSalvarReserva.setText("Salvar");
        btnSalvarReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvarReserva.setEnabled(false);
        btnSalvarReserva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvarReserva.setPreferredSize(new java.awt.Dimension(50, 70));
        btnSalvarReserva.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnSalvarReserva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarReservaActionPerformed(evt);
            }
        });

        btnCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/listar.png"))); // NOI18N
        btnCancelar2.setText("Buscar Reservas");
        btnCancelar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar2.setPreferredSize(new java.awt.Dimension(50, 70));
        btnCancelar2.setVerifyInputWhenFocusTarget(false);
        btnCancelar2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCancelar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });

        btnCancelarReserva1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pi/icons/rental_small.png"))); // NOI18N
        btnCancelarReserva1.setText("Ir para Reservas");
        btnCancelarReserva1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarReserva1.setPreferredSize(new java.awt.Dimension(50, 70));
        btnCancelarReserva1.setVerifyInputWhenFocusTarget(false);
        btnCancelarReserva1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCancelarReserva1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarReserva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarReserva1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIncluirReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarReserva1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncluirReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarReserva1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados de Locações"));

        jLabel18.setText("Codigo");

        jLabel19.setText("Data de Retirada");

        try {
            txtDataRetiradaReserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataRetiradaReserva.setEnabled(false);

        txtCodigoReserva.setEnabled(false);

        jLabel20.setText("Data Prevista de Devolução");

        try {
            txtDataDevolucaoReserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataDevolucaoReserva.setEnabled(false);

        jLabel21.setText("KM Inicial");

        txtKMInicialReserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtKMInicialReserva.setEnabled(false);

        txtValorLocacaoReserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtValorLocacaoReserva.setEnabled(false);

        jLabel22.setText("Valor da Locação");

        jLabel23.setText("RENAVAM");

        txtValorCaucaoReserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtValorCaucaoReserva.setEnabled(false);

        jLabel24.setText("Valor do Seguro");

        txtValorSeguroReserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtValorSeguroReserva.setEnabled(false);

        jcMotoristaReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motorista" }));
        jcMotoristaReserva.setEnabled(false);
        jcMotoristaReserva.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcMotoristaReservaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jcMotoristaReserva.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcMotoristaReservaPopupMenuWillBecomeVisible(evt);
            }
        });
        jcMotoristaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMotoristaReservaActionPerformed(evt);
            }
        });

        txtRenavamReserva.setEnabled(false);

        jLabel25.setText("Valor Caução");

        txtVeiculoReserva.setEnabled(false);

        jLabel27.setText("Veiculo");

        jLabel28.setText("Cliente");

        txtClienteReserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtClienteReserva.setEnabled(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKMInicialReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataRetiradaReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(txtValorLocacaoReserva))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(txtDataDevolucaoReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(32, 32, 32)
                                .addComponent(txtValorCaucaoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jLabel28)
                                .addGap(22, 22, 22))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jcMotoristaReserva, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtVeiculoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorSeguroReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(txtRenavamReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtClienteReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(txtDataRetiradaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtDataDevolucaoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtValorSeguroReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtKMInicialReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtValorLocacaoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorCaucaoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(txtClienteReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcMotoristaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRenavamReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtVeiculoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Reservas"));

        jTableReservas.setAutoCreateRowSorter(true);
        jTableReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Cliente", "Veiculo", "Data de Reserva", "Experação Reserva"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableReservasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableReservas);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Reservas Abertas", jPanel11);

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
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try {

            if (idDelecao > 0) {
                int conf = JOptionPane.showConfirmDialog(null, "Confirmar a deleção da locacao Id Nº: " + idDelecao, "Deleção",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null);
                if (conf == 0) {
                    incluirLocacao.delete(idDelecao);
                    JOptionPane.showMessageDialog(null, "Locação deletado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Deleção Cancelada!");
                }
                imprimirDadosNaGrid(incluirLocacao.getAll());
            } else {
                JOptionPane.showMessageDialog(null, "Selecione a Locação na Tabela", "Deleção", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
        } finally {
            enableFielsCrud(false);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        try {
            incluir = true;
            enableButtFields(true);
            enableFielsCrud(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            enableButtFields(false);
            enableFielsCrud(false);
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

    private void tabelaLocacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaLocacaoMouseClicked
        try {
            idDelecao = Integer.parseInt(tabelaLocacao.getValueAt(tabelaLocacao.getSelectedRow(), 0).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tabelaLocacaoMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            if (txtCodigo.getText().isEmpty() || txtDataDevolucao.getText().isEmpty() || txtDataRetirada.getText().isEmpty()
                    || txtKMInicial.getText().isEmpty() || txtValorCaucao.getText().isEmpty() || txtValorLocacao.getText().isEmpty()
                    || txtValorSeguro.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Dados para Inclusão", JOptionPane.ERROR_MESSAGE);
            } else {
                LocacaoModel locaVeiculo = new LocacaoModel();
                AdministradorModel admInclud = adm.getByNome(nomeUsuarioLogado);
                locaVeiculo.setLocacao_dataRetirada(new Date(txtDataRetirada.getText()));
                locaVeiculo.setLocacao_dataDevolucao(new Date(txtDataDevolucao.getText()));
                locaVeiculo.setLocacao_dataDeAlugamento(new Date());
                locaVeiculo.setLocacao_valorSeguro(Integer.parseInt(txtValorSeguro.getText().replace(".", "").replace(",", "")));
                locaVeiculo.setLocacao_quilometragemInicial(Float.parseFloat(txtKMInicial.getText().replace(".", "").replace(",", "")));
                locaVeiculo.setLocacao_valorCalcao(Integer.parseInt(txtValorLocacao.getText().replace(".", "").replace(",", "")));
                locaVeiculo.setLocacao_valorCalcao(Integer.parseInt(txtValorCaucao.getText().replace(".", "").replace(",", "")));
                locaVeiculo.setLocacao_motorista((MotoristaModel) motoristas.getByNome(jcMotorista.getSelectedItem().toString()));
                VeiculoModel veiculoIncluindo = (VeiculoModel) jcVeiculo.getSelectedItem();
                locaVeiculo.setLocacao_veiculo(veiculoIncluindo);
                locaVeiculo.setLocacao_administrador(admInclud);

                if (jrFisica.isSelected()) {
                    locaVeiculo.setLocacao_pessoa((PessoaModel) jcClienteFisica.getSelectedItem());
                    System.out.println("Fisica");
                } else if (jrJuridica.isSelected()) {
                    locaVeiculo.setLocacao_pessoa((PessoaModel) jcClienteJuridica.getSelectedItem());
                    System.out.println("Juridica");
                } else {
                    JOptionPane.showMessageDialog(this, "Defina o Cliente!", "Cliente", JOptionPane.ERROR_MESSAGE);
                }
                if (incluir) {
                    incluirLocacao.add(locaVeiculo);
                    veiculoIncluindo.setVeiculo_situacaoVeiculo("Locado");
                    veiculobll.update(veiculoIncluindo);

                    JOptionPane.showMessageDialog(null, "VEICULO LOCADO");
                    JOptionPane.showMessageDialog(null, "SEU COMPROVANTE DE LOCAÇÃO FOI ENVIADO POR E-MAIL\n"
                            + "--------------------------------------------------------------------------------------------------------------------\n"
                            + "# CLIENTE :....... " + locaVeiculo.getLocacao_pessoa().getPessoa_nome() + "\n"
                            + "# VEICULO :................ " + locaVeiculo.getLocacao_veiculo().getVeiculo_modelo().getModelo_descricao() + " - # MARCA :................ " + locaVeiculo.getLocacao_veiculo().getVeiculo_modelo().getModelo_marca().getMarca_descricao() + "\n"
                            + "# RENAVAM DO VEICULO :..... " + locaVeiculo.getLocacao_veiculo().getVeiculo_renavam() + "\n"
                            + "# E-mail :........................... " + locaVeiculo.getLocacao_pessoa().getPessoa_email() + "\n"
                            + "# DATA DE DEVOLUÇÃO :..... " + new SimpleDateFormat("dd 'de' MM 'de' yyyy ").format(locaVeiculo.getLocacao_dataDevolucao()) + "\n"
                            + "# DATA DE RETIRADA DO VEICULO :...... " + new SimpleDateFormat("dd 'de' MM 'de' yyyy ").format(locaVeiculo.getLocacao_dataRetirada()) + "\n"
                            + "--------------------------------------------------------------------------------------------------------------------\n"
                            + "\n----------------------------------«««« Locação de Veiculos »»»»---------------------------------------\n\n", "Comprovante de Locação", JOptionPane.PLAIN_MESSAGE);
                    enableButtFields(false);
                    enableFielsCrud(false);
                } else {

                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos ", "Worning", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Element Error: " + ex.getMessage(), "Worning", JOptionPane.ERROR_MESSAGE);
        } finally {

            try {
                imprimirDadosNaGrid(incluirLocacao.getAll());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Atention: " + ex.getMessage(), "Worning", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void JtLocaGerirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtLocaGerirMouseClicked
        try {
            setarCamposDevolucao();
            try {
                if (!txtNomeDevo.getText().isEmpty()) {
                    btnDevolver.setEnabled(true);
                } else {
                    btnDevolver.setEnabled(false);
                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_JtLocaGerirMouseClicked

    private void jtCompletaLocacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCompletaLocacaoMouseClicked

    }//GEN-LAST:event_jtCompletaLocacaoMouseClicked

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        try {
            ClienteView cliente = new ClienteView();
            cliente.setVisible(true);
            cliente.nomeUsuarioLogado = this.nomeUsuarioLogado;
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnNovoMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoMotoristaActionPerformed
        try {
            MotoristaView motorista = new MotoristaView();
            motorista.setVisible(true);
            motorista.nomeUsuarioLogado = this.nomeUsuarioLogado;
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnNovoMotoristaActionPerformed

    private void btnNovoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoVeiculoActionPerformed
        try {
            VeiculoView veiculo = new VeiculoView();
            veiculo.setVisible(true);
            veiculo.nomeUsuarioLogado = this.nomeUsuarioLogado;
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnNovoVeiculoActionPerformed

    private void jrFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrFisicaActionPerformed
        try {
            if (jrFisica.isSelected()) {
                jcClienteFisica.setVisible(true);
                jcClienteJuridica.setVisible(false);
                jrJuridica.setSelected(false);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jrFisicaActionPerformed

    private void jrJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrJuridicaActionPerformed
        try {
            if (jrJuridica.isSelected()) {
                jcClienteFisica.setVisible(false);
                jcClienteJuridica.setVisible(true);
                jrFisica.setSelected(false);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jrJuridicaActionPerformed

    private void jcClienteJuridicaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcClienteJuridicaAncestorAdded

    }//GEN-LAST:event_jcClienteJuridicaAncestorAdded

    private void jcClienteJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcClienteJuridicaActionPerformed

    }//GEN-LAST:event_jcClienteJuridicaActionPerformed

    private void jcClienteFisicaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcClienteFisicaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jcClienteFisicaAncestorAdded

    private void jcClienteFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcClienteFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcClienteFisicaActionPerformed

    private void jcVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcVeiculoActionPerformed
        try {
            setRenavam();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jcVeiculoActionPerformed
    public void setRenavam() throws Exception {
        VeiculoDal veiculosBusca = new VeiculoDal();
        VeiculoModel veiculo = (VeiculoModel) jcVeiculo.getSelectedItem();
        txtRenavamVeiculo.setText(veiculo.getVeiculo_renavam());
    }
    private void jcVeiculoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcVeiculoAncestorAdded

    }//GEN-LAST:event_jcVeiculoAncestorAdded

    private void jcVeiculoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcVeiculoPopupMenuWillBecomeVisible
        try {
            transferirItens();
        } catch (Exception ex) {
            Logger.getLogger(LocacaoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcVeiculoPopupMenuWillBecomeVisible

    private void jcMotoristaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcMotoristaAncestorAdded
    }//GEN-LAST:event_jcMotoristaAncestorAdded

    private void jcMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMotoristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcMotoristaActionPerformed

    private void jcMotoristaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcMotoristaPopupMenuWillBecomeVisible
        SetJCMoto();
    }//GEN-LAST:event_jcMotoristaPopupMenuWillBecomeVisible

    private void jcClienteFisicaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcClienteFisicaPopupMenuWillBecomeVisible
        selecteElementPF();
    }//GEN-LAST:event_jcClienteFisicaPopupMenuWillBecomeVisible

    private void jcClienteJuridicaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcClienteJuridicaPopupMenuWillBecomeVisible
        selecteElementPJ();
    }//GEN-LAST:event_jcClienteJuridicaPopupMenuWillBecomeVisible

    private void txtNomeDevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDevoActionPerformed

    }//GEN-LAST:event_txtNomeDevoActionPerformed

    private void txtNomeDevoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeDevoKeyReleased

    }//GEN-LAST:event_txtNomeDevoKeyReleased

    private void btnIncluirReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirReservaActionPerformed
        try {
            boolean atender = true;
            transFerirReservas(reservabll.getAll());
        } catch (Exception e) {
        } finally {
            enableButtFieldsReserva(true);
            enableFielsCrudReserva(true);
        }
    }//GEN-LAST:event_btnIncluirReservaActionPerformed

    private void btnCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarReservaActionPerformed
        try {

        } catch (Exception e) {
        } finally {
            enableButtFieldsReserva(false);
            enableFielsCrudReserva(false);
        }
    }//GEN-LAST:event_btnCancelarReservaActionPerformed

    private void btnSalvarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarReservaActionPerformed
        try {
            if (txtCodigoReserva.getText().isEmpty() || txtDataDevolucaoReserva.getText().isEmpty() || txtDataRetiradaReserva.getText().isEmpty()
                    || txtValorCaucaoReserva.getText().isEmpty() || txtValorLocacaoReserva.getText().isEmpty()
                    || txtValorSeguroReserva.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Dados para Inclusão", JOptionPane.ERROR_MESSAGE);
            } else {
                LocacaoModel locaVeiculo = new LocacaoModel();
                AdministradorModel admInclud = adm.getByNome(nomeUsuarioLogado);
                locaVeiculo.setLocacao_dataRetirada(new Date(txtDataRetiradaReserva.getText()));
                locaVeiculo.setLocacao_dataDevolucao(new Date(txtDataDevolucaoReserva.getText()));
                locaVeiculo.setLocacao_dataDeAlugamento(new Date());
                locaVeiculo.setLocacao_valorSeguro(Integer.parseInt(txtValorSeguroReserva.getText().replace(".", "").replace(",", "")));
                locaVeiculo.setLocacao_quilometragemInicial(Float.parseFloat(txtKMInicialReserva.getText().replace(".", "").replace(",", "")));
                locaVeiculo.setLocacao_valorCalcao(Integer.parseInt(txtValorLocacaoReserva.getText().replace(".", "").replace(",", "")));
                locaVeiculo.setLocacao_valorCalcao(Integer.parseInt(txtValorCaucaoReserva.getText().replace(".", "").replace(",", "")));
                locaVeiculo.setLocacao_motorista((MotoristaModel) motoristas.getByNome(jcMotoristaReserva.getSelectedItem().toString()));
                locaVeiculo.setLocacao_veiculo((VeiculoModel) veiculobll.getByNome(txtRenavamReserva.getText()));
                locaVeiculo.setLocacao_administrador(admInclud);
                locaVeiculo.setLocacao_pessoa((PessoaModel) pessoaBll.getByNome(txtClienteReserva.getText()));

                if (incluir) {
                    incluirLocacao.add(locaVeiculo);

                    JOptionPane.showMessageDialog(null, "RESERVA ATENDIDA - VEICULO LOCADO");
                    JOptionPane.showMessageDialog(null, "SEU COMPROVANTE DE LOCAÇÃO FOI ENVIADO POR E-MAIL\n"
                            + "--------------------------------------------------------------------------------------------------------------------\n"
                            + "# CLIENTE :....... " + locaVeiculo.getLocacao_pessoa().getPessoa_nome() + "\n"
                            + "# VEICULO :................ " + locaVeiculo.getLocacao_veiculo().getVeiculo_modelo().getModelo_descricao() + " - # MARCA :................ " + locaVeiculo.getLocacao_veiculo().getVeiculo_modelo().getModelo_marca().getMarca_descricao() + "\n"
                            + "# RENAVAM DO VEICULO :..... " + locaVeiculo.getLocacao_veiculo().getVeiculo_renavam() + "\n"
                            + "# E-mail :........................... " + locaVeiculo.getLocacao_pessoa().getPessoa_email() + "\n"
                            + "# DATA DE DEVOLUÇÃO :..... " + new SimpleDateFormat("dd 'de' MMMM 'de' yyyy ").format(locaVeiculo.getLocacao_dataDevolucao()) + "\n"
                            + "# DATA DE RETIRADA DO VEICULO :...... " + new SimpleDateFormat("dd 'de' MMMM 'de' yyyy ").format(locaVeiculo.getLocacao_dataRetirada()) + "\n"
                            + "--------------------------------------------------------------------------------------------------------------------\n"
                            + "\n----------------------------------«««« Locação de Veiculos »»»»---------------------------------------\n\n", "Comprovante de Locação", JOptionPane.PLAIN_MESSAGE);
                    enableButtFieldsReserva(false);
                    enableFielsCrudReserva(false);
                } else {

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Refaça o Processo e Preencha todos os dados.");
            enableButtFieldsReserva(false);
            enableFielsCrudReserva(false);
        } finally {
            try {
                transFerirReservas(reservabll.getAll());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Atention: " + ex.getMessage() + "\nLocale: " + ex.getClass().getName(), "Worning", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSalvarReservaActionPerformed

    private void jcMotoristaReservaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcMotoristaReservaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jcMotoristaReservaAncestorAdded

    private void jcMotoristaReservaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcMotoristaReservaPopupMenuWillBecomeVisible
        SetJCMotoReserva();
    }//GEN-LAST:event_jcMotoristaReservaPopupMenuWillBecomeVisible

    private void jcMotoristaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMotoristaReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcMotoristaReservaActionPerformed

    private void jTableReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableReservasMouseClicked
        try {
            transFerirDadosReserva();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTableReservasMouseClicked

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        try {
            transFerirReservas(reservabll.getAll());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Atention: " + ex.getMessage() + "\nLocale: " + ex.getClass().getName(), "Worning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void btnCancelarReserva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarReserva1ActionPerformed
        try {
            ReservaView reservaTela = new ReservaView();
            reservaTela.setVisible(true);
            reservaTela.nomeUsuarioLogado = this.nomeUsuarioLogado;
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCancelarReserva1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            imprimirDadosNaGrid(incluirLocacao.getAll());
            imprimirDadosNaGridLocacaoCompleto(incluirLocacao.getAll());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            imprimirDadosNaGridLocacao(incluirLocacao.getAll());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDevolverKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDevolverKeyReleased
        try {
            if (!txtNomeDevo.getText().isEmpty()) {
                btnDevolver.setEnabled(true);
            } else {
                btnDevolver.setEnabled(false);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDevolverKeyReleased

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        try {
            int id = Integer.parseInt(JtLocaGerir.getValueAt(JtLocaGerir.getSelectedRow(), 0).toString());
            LocacaoModel locDevolucao = incluirLocacao.getById(id);
            String kmFinal = JOptionPane.showInputDialog(this, "Informe o KM Final do Veiculo!", "KM Final! Devolução", JOptionPane.QUESTION_MESSAGE);
            if (kmFinal.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Informe o KM Final do Veiculo!", "KM Final! Devolução", JOptionPane.ERROR_MESSAGE);
            } else {
                locDevolucao.setLocacao_quilometragemFinal(Float.parseFloat(kmFinal));
                locDevolucao.getLocacao_veiculo().setVeiculo_situacaoVeiculo("Disponivel");
                veiculobll.update(locDevolucao.getLocacao_veiculo());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Atenção: " + e.getMessage());
        } finally {
            clearDevoFields();
        }
    }//GEN-LAST:event_btnDevolverActionPerformed
    public void clearDevoFields() {
        txtNomeDevo.setText("");
        txtcpfDevo.setText("");
        txtnomeMotDevo.setText("");
        txtCnhDevo.setText("");
        txtDataDevo.setText("");
        txtKmDevo.setText("");
        txtVeiculoDevo.setText("");
        txtRenavamDevo.setText("");
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
            java.util.logging.Logger.getLogger(LocacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LocacaoView().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(LocacaoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtLocaGerir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnCancelarReserva;
    private javax.swing.JButton btnCancelarReserva1;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnIncluirReserva;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnNovoMotorista;
    private javax.swing.JButton btnNovoVeiculo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarReserva;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableReservas;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<Object> jcClienteFisica;
    private javax.swing.JComboBox<Object> jcClienteJuridica;
    private javax.swing.JComboBox<Object> jcMotorista;
    private javax.swing.JComboBox<Object> jcMotoristaReserva;
    private javax.swing.JComboBox<Object> jcVeiculo;
    private javax.swing.JRadioButton jrFisica;
    private javax.swing.JRadioButton jrJuridica;
    private javax.swing.JTable jtCompletaLocacao;
    private javax.swing.JTable tabelaLocacao;
    private javax.swing.JFormattedTextField txtClienteReserva;
    private javax.swing.JTextField txtCnhDevo;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JFormattedTextField txtCodigoReserva;
    private javax.swing.JTextField txtDataDevo;
    private javax.swing.JFormattedTextField txtDataDevolucao;
    private javax.swing.JFormattedTextField txtDataDevolucaoReserva;
    private javax.swing.JFormattedTextField txtDataRetirada;
    private javax.swing.JFormattedTextField txtDataRetiradaReserva;
    private javax.swing.JFormattedTextField txtKMInicial;
    private javax.swing.JFormattedTextField txtKMInicialReserva;
    private javax.swing.JTextField txtKmDevo;
    private javax.swing.JTextField txtNomeDevo;
    private javax.swing.JTextField txtRenavamDevo;
    private javax.swing.JFormattedTextField txtRenavamReserva;
    private javax.swing.JFormattedTextField txtRenavamVeiculo;
    private javax.swing.JFormattedTextField txtValorCaucao;
    private javax.swing.JFormattedTextField txtValorCaucaoReserva;
    private javax.swing.JFormattedTextField txtValorLocacao;
    private javax.swing.JFormattedTextField txtValorLocacaoReserva;
    private javax.swing.JFormattedTextField txtValorSeguro;
    private javax.swing.JFormattedTextField txtValorSeguroReserva;
    private javax.swing.JTextField txtVeiculoDevo;
    private javax.swing.JFormattedTextField txtVeiculoReserva;
    private javax.swing.JTextField txtcpfDevo;
    private javax.swing.JTextField txtnomeMotDevo;
    // End of variables declaration//GEN-END:variables

    public void enableButtFields(boolean yet) {
        if (yet) {
            btnIncluir.setEnabled(false);
//            btnAlterar.setEnabled(false);
            btnCancelar.setEnabled(true);
            btnDeletar.setEnabled(false);
            btnSalvar.setEnabled(true);
            btnVoltar.setEnabled(false);
        } else {
            btnIncluir.setEnabled(true);
//            btnAlterar.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnDeletar.setEnabled(true);
            btnVoltar.setEnabled(true);
            btnSalvar.setEnabled(false);

            jrFisica.setSelected(false);
            jrJuridica.setSelected(false);

            jcClienteFisica.setVisible(false);
            jcClienteJuridica.setVisible(false);
        }
    }

    private void imprimirDadosNaGrid(Iterator conjunto) {
        DefaultTableModel model = (DefaultTableModel) tabelaLocacao.getModel();
        model.setNumRows(0);
        while (conjunto.hasNext()) {
            String[] linha = new String[5];
            LocacaoModel locaTable = (LocacaoModel) conjunto.next();
            linha[0] = locaTable.getLocacao_idem() + "";
            linha[1] = locaTable.getLocacao_codigoDelocacao() + "";
            linha[2] = locaTable.getLocacao_pessoa().getPessoa_nome();
            linha[3] = locaTable.getLocacao_motorista().getMotorista_nome();
            linha[4] = locaTable.getLocacao_veiculo().getVeiculo_modelo().getModelo_descricao();
            model.addRow(linha);
        }
    }

    public void enableButtFieldsReserva(boolean yet) {
        if (yet) {
            btnIncluirReserva.setEnabled(false);
            btnCancelarReserva.setEnabled(true);
            btnSalvarReserva.setEnabled(true);
        } else {
            btnIncluirReserva.setEnabled(true);
            btnCancelarReserva.setEnabled(true);
            btnSalvarReserva.setEnabled(false);

        }
    }

    private void selecteElementPF() {
        try {
            jcClienteFisica.removeAllItems();
            Iterator<PessoaPFModel> pfisica = pf.getAll();
            while (pfisica.hasNext()) {
                jcClienteFisica.addItem(pfisica.next().getPessoa());
            }

        } catch (Exception e) {
        }
    }

    private void selecteElementPJ() {
        try {
            jcClienteJuridica.removeAllItems();
            Iterator<PessoaPJModel> pJuridica = pj.getAll();
            while (pJuridica.hasNext()) {
                jcClienteJuridica.addItem(pJuridica.next().getPessoaModel());
            }
        } catch (Exception e) {
        }
    }

    public void enableFielsCrud(boolean action) {
        if (action) {
            txtCodigo.setEnabled(true);
            txtDataRetirada.setEnabled(true);
            txtDataDevolucao.setEnabled(true);
            txtKMInicial.setEnabled(true);
            txtValorLocacao.setEnabled(true);
            txtValorCaucao.setEnabled(true);
            txtValorSeguro.setEnabled(true);
            jcMotorista.setEnabled(true);
            jcVeiculo.setEnabled(true);
            jcClienteFisica.setEnabled(true);
            jcClienteJuridica.setEnabled(true);

            btnNovoCliente.setEnabled(false);
            btnNovoMotorista.setEnabled(false);
            btnNovoVeiculo.setEnabled(false);

            txtCodigo.setText("");
            txtDataRetirada.setText("");
            txtDataDevolucao.setText("");
            txtKMInicial.setText("");
            txtValorLocacao.setText("");
            txtValorCaucao.setText("");
            txtValorSeguro.setText("");

//            jcMotorista.removeAllItems();
//            jcMotorista.addItem("Motorista");
//            jcVeiculo.removeAllItems();
//            jcVeiculo.addItem("Veiculo");
//            jcClienteFisica.removeAllItems();
//            jcClienteFisica.addItem("Cliente Fisico");
//            jcClienteJuridica.removeAllItems();
//            jcClienteJuridica.addItem("Cliente Juridico");
            txtRenavamVeiculo.setText("");
        } else {
            txtRenavamVeiculo.setText("");
            txtCodigo.setEnabled(false);
            txtDataRetirada.setEnabled(false);
            txtDataDevolucao.setEnabled(false);
            txtKMInicial.setEnabled(false);
            txtValorLocacao.setEnabled(false);
            txtValorCaucao.setEnabled(false);
            txtValorSeguro.setEnabled(false);
            jcMotorista.setEnabled(false);
            jcVeiculo.setEnabled(false);
            jcClienteFisica.setEnabled(false);
            jcClienteJuridica.setEnabled(false);

            btnNovoCliente.setEnabled(true);
            btnNovoMotorista.setEnabled(true);
            btnNovoVeiculo.setEnabled(true);

            txtCodigo.setText("");
            txtDataRetirada.setText("");
            txtDataDevolucao.setText("");
            txtKMInicial.setText("");
            txtValorLocacao.setText("");
            txtValorCaucao.setText("");
            txtValorSeguro.setText("");

//            jcMotorista.removeAllItems();
//            jcMotorista.addItem("Motorista");
//            jcVeiculo.removeAllItems();
//            jcVeiculo.addItem("Veiculo");
//            jcClienteFisica.removeAllItems();
//            jcClienteFisica.addItem("Cliente Fisico");
//            jcClienteJuridica.removeAllItems();
//            jcClienteJuridica.addItem("Cliente Juridico");
        }
    }

    public void enableFielsCrudReserva(boolean action) {
        if (action) {
            txtCodigoReserva.setEnabled(true);
            txtDataRetiradaReserva.setEnabled(true);
            txtDataDevolucaoReserva.setEnabled(true);
            txtValorLocacaoReserva.setEnabled(true);
            txtValorCaucaoReserva.setEnabled(true);
            txtValorSeguroReserva.setEnabled(true);
            txtKMInicialReserva.setEnabled(true);
            jcMotoristaReserva.setEnabled(true);

            txtCodigoReserva.setText("");
            txtDataRetiradaReserva.setText("");
            txtDataDevolucaoReserva.setText("");
            txtKMInicialReserva.setText("");
            txtValorLocacaoReserva.setText("");
            txtValorCaucaoReserva.setText("");
            txtValorSeguroReserva.setText("");

            txtClienteReserva.setText("");
            txtVeiculoReserva.setText("");
            txtRenavamReserva.setText("");

            jcMotoristaReserva.removeAllItems();
            jcMotoristaReserva.addItem("Motorista");
        } else {
            txtCodigoReserva.setEnabled(false);
            txtDataRetiradaReserva.setEnabled(false);
            txtDataDevolucaoReserva.setEnabled(false);
            txtKMInicialReserva.setEnabled(false);
            txtValorLocacaoReserva.setEnabled(false);
            txtValorCaucaoReserva.setEnabled(false);
            txtValorSeguroReserva.setEnabled(false);
            jcMotoristaReserva.setEnabled(false);

            txtCodigoReserva.setText("");
            txtDataRetiradaReserva.setText("");
            txtDataDevolucaoReserva.setText("");
            txtKMInicialReserva.setText("");
            txtValorLocacaoReserva.setText("");
            txtValorCaucaoReserva.setText("");
            txtValorSeguroReserva.setText("");

            txtClienteReserva.setText("");
            txtVeiculoReserva.setText("");
            txtRenavamReserva.setText("");

            jcMotoristaReserva.removeAllItems();
            jcMotoristaReserva.addItem("Motorista");
        }
    }

    private void transferirItens() throws Exception {
        try {
            jcVeiculo.removeAllItems();
            VeiculoBll modelo = new VeiculoBll();
            Iterator<VeiculoModel> veiculoListado = modelo.getAll();
            while (veiculoListado.hasNext()) {
                jcVeiculo.addItem(veiculoListado.next());
            }
        } catch (Exception e) {
        }
    }

    private void SetJCMoto() {
        try {
            Iterator<MotoristaModel> motLista = motoristas.getAll();
            jcMotorista.removeAllItems();
            while (motLista.hasNext()) {
                jcMotorista.addItem(motLista.next().getMotorista_nome());
            }
        } catch (Exception e) {
        }
    }

    private void SetJCMotoReserva() {
        try {
            Iterator<MotoristaModel> motLista = motoristas.getAll();
            jcMotoristaReserva.removeAllItems();
            while (motLista.hasNext()) {
                jcMotoristaReserva.addItem(motLista.next().getMotorista_nome());
            }
        } catch (Exception e) {
        }
    }

    private void transFerirReservas(Iterator conjunto) throws Exception {
        DefaultTableModel model = (DefaultTableModel) jTableReservas.getModel();
        model.setNumRows(0);
        boolean verif = false;
        while (conjunto.hasNext()) {
            String[] linha = new String[5];
            ReservaModel objVeiculo = (ReservaModel) conjunto.next();

            String dataAtual = new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime());
            String datVerificar = formatDateStruct(objVeiculo.getReserva_dataExpiracao());
            verif = verificarValidade(dataAtual, datVerificar);

            if (!verif) {
                linha[0] = objVeiculo.getReserva_idem() + "";
                linha[1] = objVeiculo.getReserva_cliente().getPessoa_nome() + "";
                linha[2] = objVeiculo.getReserva_veiculo().getVeiculo_modelo().getModelo_descricao();
                linha[3] = formatDateStruct(objVeiculo.getReserva_dataReserva());
                linha[4] = formatDateStruct(objVeiculo.getReserva_dataExpiracao());
                model.addRow(linha);
            }
        }
    }

    private void imprimirDadosNaGridLocacao(Iterator conjunto) {
        DefaultTableModel model = (DefaultTableModel) JtLocaGerir.getModel();
        model.setNumRows(0);
        while (conjunto.hasNext()) {
            String[] linha = new String[6];
            LocacaoModel locaTable = (LocacaoModel) conjunto.next();
            linha[0] = locaTable.getLocacao_idem() + "";
            linha[1] = locaTable.getLocacao_codigoDelocacao() + "";
            linha[2] = locaTable.getLocacao_pessoa().getPessoa_nome();
            linha[3] = locaTable.getLocacao_motorista().getMotorista_nome();
            linha[4] = locaTable.getLocacao_veiculo().getVeiculo_modelo().getModelo_descricao();
            String situ = "";
            if (locaTable.getLocacao_veiculo().getVeiculo_situacaoVeiculo().equalsIgnoreCase("Disponivel")) {
                situ = "Veiculo Devolvido";
            } else {
                situ = locaTable.getLocacao_veiculo().getVeiculo_situacaoVeiculo();
            }
            linha[5] = situ;

            model.addRow(linha);
        }
    }

    private void imprimirDadosNaGridLocacaoCompleto(Iterator conjunto) {
        DefaultTableModel model = (DefaultTableModel) jtCompletaLocacao.getModel();
        model.setNumRows(0);
        while (conjunto.hasNext()) {
            String[] linha = new String[7];
            LocacaoModel locaTable = (LocacaoModel) conjunto.next();
            linha[0] = locaTable.getLocacao_idem() + "";
            linha[1] = locaTable.getLocacao_codigoDelocacao() + "";
            linha[2] = locaTable.getLocacao_pessoa().getPessoa_nome();
            linha[3] = locaTable.getLocacao_motorista().getMotorista_nome();
            linha[4] = locaTable.getLocacao_veiculo().getVeiculo_modelo().getModelo_descricao();
            linha[5] = new SimpleDateFormat("dd/MM/yyyy").format(locaTable.getLocacao_dataDevolucao());
            linha[6] = new SimpleDateFormat("dd/MM/yyyy").format(locaTable.getLocacao_dataDeAlugamento());

            model.addRow(linha);
        }
    }

    public String formatDateStruct(String oldDate) {
        String[] newForm = oldDate.split("-");
        return newForm[2] + "/" + newForm[1] + "/" + newForm[0];
    }

    private void transFerirDadosReserva() throws Exception {
        int id = Integer.parseInt(jTableReservas.getValueAt(jTableReservas.getSelectedRow(), 0).toString());
        ReservaModel reserv = (ReservaModel) reservabll.getById(id);
        txtClienteReserva.setText(reserv.getReserva_cliente().getPessoa_nome());
        txtVeiculoReserva.setText(reserv.getReserva_veiculo().getVeiculo_modelo().getModelo_descricao());
        txtRenavamReserva.setText(reserv.getReserva_veiculo().getVeiculo_renavam());
    }

    public boolean verificarValidade(String dataAtual, String dataVerificar) {
        String AtualVerificar[] = dataAtual.split("/");
        String DataVerificar[] = dataVerificar.split("/");

        int diaAtual = Integer.parseInt(AtualVerificar[0]);
        int diaVerificar = Integer.parseInt(DataVerificar[0]);

        int mesAtual = Integer.parseInt(AtualVerificar[1]);
        int mesVerificar = Integer.parseInt(DataVerificar[1]);

        int anoAtual = Integer.parseInt(AtualVerificar[2]);
        int anoAVerificar = Integer.parseInt(DataVerificar[2]);

        if (mesVerificar <= mesAtual) {
            if (anoAVerificar <= anoAtual) {
                if (diaVerificar <= diaAtual) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private void setarCamposDevolucao() throws Exception {
        int id = Integer.parseInt(JtLocaGerir.getValueAt(JtLocaGerir.getSelectedRow(), 0).toString());
        LocacaoModel locDevolucao = incluirLocacao.getById(id);
        txtNomeDevo.setText(locDevolucao.getLocacao_pessoa().getPessoa_nome());
        txtcpfDevo.setText(locDevolucao.getLocacao_motorista().getMotorista_cpf());
        txtnomeMotDevo.setText(locDevolucao.getLocacao_motorista().getMotorista_nome());
        txtCnhDevo.setText(locDevolucao.getLocacao_motorista().getCnh_numeroRegistro() + "");
        txtDataDevo.setText(new SimpleDateFormat("dd/MM/yyyy").format(locDevolucao.getLocacao_dataDevolucao()));
        txtKmDevo.setText(locDevolucao.getLocacao_quilometragemInicial() + "");
        txtVeiculoDevo.setText(locDevolucao.getLocacao_veiculo().getVeiculo_modelo().getModelo_descricao());
        txtRenavamDevo.setText(locDevolucao.getLocacao_veiculo().getVeiculo_renavam());
    }
}
