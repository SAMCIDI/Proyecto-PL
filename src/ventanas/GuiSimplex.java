package ventanas;

import operaciones.AproximarNumero;
import operaciones.ColorFilas;
import operaciones.ColorFilasFunciones;
import operaciones.CrearTablasSimplex;
import operaciones.GetX;
import operaciones.Simplex;
import static operaciones.Simplex.filalaMenor;
import static operaciones.Simplex.todosMenor;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

public class GuiSimplex extends javax.swing.JFrame {

    private DefaultTableModel modeloRestricciones = null;
    private DefaultTableModel modeloSolucion = null;
    private int Xn = 0, Nrestricciones;
    private boolean limpiar = true, guardar = true;

    public GuiSimplex() {
        initComponents();
        Tablon.setDefaultRenderer(Object.class, new ColorFilas());
        jtRestricciones.setDefaultRenderer(Object.class, new ColorFilasFunciones());
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/brain.png")).getImage());
        jDialog1.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/brain.png")).getImage());
        ventanaCoeficientes.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/brain.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaCoeficientes = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtRestricciones = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        info2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jcbObjetivo = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jspRest = new javax.swing.JSpinner();
        jspvariables = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaOperaciones = new javax.swing.JTextArea();
        jlPivote = new javax.swing.JLabel();
        jlcolunna = new javax.swing.JLabel();
        jlfila = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tablon = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtaEcuaciones = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        info = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        ventanaCoeficientes.setTitle("Coeficientes");
        ventanaCoeficientes.setMinimumSize(new java.awt.Dimension(610, 610));
        ventanaCoeficientes.setResizable(false);
        ventanaCoeficientes.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 254));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coeficientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 0, 18), new java.awt.Color(255, 102, 0))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(590, 350));
        jPanel3.setLayout(null);

        jtRestricciones.setFont(new java.awt.Font("Tahoma", 0, 14));
        jtRestricciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        jtRestricciones.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtRestricciones.setComponentPopupMenu(jPopupMenu2);
        jtRestricciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtRestriccionesFocusGained(evt);
            }
        });
        jtRestricciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtRestriccionesMousePressed(evt);
            }
        });
        jtRestricciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtRestriccionesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtRestricciones);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(16, 30, 370, 350);

        jButton2.setFont(new java.awt.Font("Arial Narrow", 0, 18));
        jButton2.setForeground(new java.awt.Color(153, 153, 153));
        jButton2.setText("Listo");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(400, 110, 110, 40);

        jCheckBox1.setFont(new java.awt.Font("Arial Narrow", 0, 14));
        jCheckBox1.setText("Rellenar con ceros");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCheckBox1MousePressed(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox1);
        jCheckBox1.setBounds(400, 50, 140, 31);

        info2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(info2);
        info2.setBounds(10, 400, 380, 22);

        ventanaCoeficientes.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 450));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel8.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 254));
        jPanel1.setLayout(null);

        jcbObjetivo.setBackground(new java.awt.Color(255, 255, 254));
        jcbObjetivo.setFont(new java.awt.Font("Arial Narrow", 1, 18));
        jcbObjetivo.setForeground(new java.awt.Color(153, 153, 153));
        jcbObjetivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maximizar", "Minimizar" }));
        jPanel1.add(jcbObjetivo);
        jcbObjetivo.setBounds(20, 24, 120, 34);

        jPanel8.add(jPanel1);
        jPanel1.setBounds(20, 10, 160, 80);

        jPanel5.setBackground(new java.awt.Color(255, 255, 254));
        jPanel5.setLayout(null);

        jspRest.setFont(new java.awt.Font("Arial Narrow", 1, 18));
        jspRest.setModel(new javax.swing.SpinnerNumberModel(2, 1, 400, 1));
        jspRest.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jspRestStateChanged(evt);
            }
        });
        jPanel5.add(jspRest);
        jspRest.setBounds(140, 50, 100, 28);

        jspvariables.setFont(new java.awt.Font("Arial Narrow", 1, 18));
        jspvariables.setModel(new javax.swing.SpinnerNumberModel(2, 2, 350, 1));
        jPanel5.add(jspvariables);
        jspvariables.setBounds(140, 10, 100, 28);

        jButton3.setFont(new java.awt.Font("Arial Narrow", 0, 18));
        jButton3.setForeground(new java.awt.Color(153, 153, 153));
        jButton3.setText("Cambiar");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(280, 30, 60, 30);

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 18));
        jLabel4.setText("Restricciones");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(30, 47, 110, 30);

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 0, 18));
        jLabel6.setText("Variables ");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(30, 10, 130, 30);

        jPanel8.add(jPanel5);
        jPanel5.setBounds(220, 6, 360, 88);

        ventanaCoeficientes.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        ventanaCoeficientes.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 580));

        jDialog1.setTitle("Abrir");
        jDialog1.setMinimumSize(new java.awt.Dimension(643, 419));
        jDialog1.getContentPane().setLayout(new javax.swing.BoxLayout(jDialog1.getContentPane(), javax.swing.BoxLayout.LINE_AXIS));
        jDialog1.getAccessibleContext().setAccessibleParent(null);

        jMenuItem5.setText("Eliminar Fila");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simplex");
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solución", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 0, 14), new java.awt.Color(255, 153, 0))); // NOI18N
        jPanel4.setLayout(null);

        jtaOperaciones.setColumns(20);
        jtaOperaciones.setEditable(false);
        jtaOperaciones.setFont(new java.awt.Font("Arial Narrow", 0, 18));
        jtaOperaciones.setForeground(new java.awt.Color(102, 102, 102));
        jtaOperaciones.setRows(5);
        jScrollPane2.setViewportView(jtaOperaciones);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(10, 20, 240, 260);

        jlPivote.setFont(new java.awt.Font("Arial Narrow", 1, 18));
        jlPivote.setForeground(new java.awt.Color(255, 153, 0));
        jlPivote.setText("Pivote:");
        jPanel4.add(jlPivote);
        jlPivote.setBounds(10, 300, 180, 20);

        jlcolunna.setFont(new java.awt.Font("Arial Narrow", 1, 18));
        jlcolunna.setForeground(new java.awt.Color(255, 153, 0));
        jlcolunna.setText("Columna:");
        jPanel4.add(jlcolunna);
        jlcolunna.setBounds(10, 340, 150, 20);

        jlfila.setFont(new java.awt.Font("Arial Narrow", 1, 18));
        jlfila.setForeground(new java.awt.Color(255, 153, 0));
        jlfila.setText("Fila:");
        jPanel4.add(jlfila);
        jlfila.setBounds(10, 320, 130, 20);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 270, 390));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(null);

        Tablon.setFont(new java.awt.Font("Tahoma", 0, 14));
        Tablon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tablon.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(Tablon);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 490, 360);

        jLabel3.setText("Ingeniería de sistemas CECAR 2015   ---- Fredys Vergara");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 570, 310, 20);

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imagenes/solucion.png")), jPanel2); // NOI18N

        jPanel6.setBackground(new java.awt.Color(241, 239, 239));
        jPanel6.setLayout(null);

        jScrollPane5.setBorder(null);

        jtaEcuaciones.setBackground(new java.awt.Color(255, 255, 254));
        jtaEcuaciones.setColumns(20);
        jtaEcuaciones.setEditable(false);
        jtaEcuaciones.setFont(new java.awt.Font("Arial Narrow", 0, 24));
        jtaEcuaciones.setRows(5);
        jtaEcuaciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 204, 0), 1, true));
        jtaEcuaciones.setOpaque(false);
        jScrollPane5.setViewportView(jtaEcuaciones);

        jPanel6.add(jScrollPane5);
        jScrollPane5.setBounds(40, 40, 430, 290);

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imagenes/ecuacion.png")), jPanel6); // NOI18N

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 520, 440));
        //----------------------------------------------
        //JDialog d = new javax.swing.JDialog();;
        //d.setMinimumSize(new java.awt.Dimension(643, 419));
        //d.setVisible(true);
        //------------------------------------------

        jButton1.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coeficientes.png"))); // NOI18N
        jButton1.setText("Coeficientes");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 170, 50));

        jButton5.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calories.png"))); // NOI18N
        jButton5.setText("Resolver");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 170, 50));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/climb.png"))); // NOI18N
        jButton4.setText("Paso a Paso");
        jButton4.setToolTipText("Resolver Paso a Paso");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 170, 50));
        getContentPane().add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 160, 40));

        jButton6.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Salir");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 70, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 480));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1041)/2, (screenSize.height-481)/2, 1041, 481);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ventanaCoeficientes.setBounds(this.getX() + 100, this.getY() + 5, ventanaCoeficientes.getWidth(), ventanaCoeficientes.getHeight());
        ventanaCoeficientes.setVisible(true);
        if (limpiar) {
            crearTablaRestricciones();
        }
        limpiar = false;
        jButton4.setEnabled(false);
        Nrestricciones = modeloRestricciones.getRowCount() - 1;

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        crearTablaRestricciones();
        jCheckBox1ActionPerformed(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!validar()) {
            CrearTablasSimplex.TablaSolucion(Xn, Nrestricciones, modeloRestricciones, Tablon);
            modeloSolucion = (DefaultTableModel) Tablon.getModel();
            Simplex.calcularZj(modeloSolucion);
            Simplex.calcularCj_Zj(modeloSolucion);
            if (jcbObjetivo.getSelectedIndex() == 0) {
                Simplex.mayorFilaCj_Zj(modeloSolucion);

            } else {

                Simplex.menorFilaCj_Zj(modeloSolucion);
            }
            Simplex.CalcularXn_Mayor(modeloSolucion);
            Simplex.Menor(modeloSolucion);
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            ventanaCoeficientes.setVisible(false);
            Simplex.ntablones = 1;
            jtaOperaciones.setText(null);
            jlfila.setText("Fila: " + (Simplex.filalaMenor - 1));
            jlcolunna.setText("Columna: " + (Simplex.columnaMayor));
            jlPivote.setText("Pivote: " + Simplex.pivote);
            jlPivote.setText("Pivote: " + AproximarNumero.valorAprocimado(String.valueOf(modeloSolucion.getValueAt(filalaMenor, Simplex.columnaMayor))));
            Ecuaciones();
        }
        info2.setText("");


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (!todosMenor) {
            if (filalaMenor <= 0) {
                info.setText("No hay solución");
            } else {
                Simplex.Convertir0Pivote(modeloSolucion);
                Simplex.Gauss(modeloSolucion);
                Simplex.calcularZj(modeloSolucion);
                Simplex.calcularCj_Zj(modeloSolucion);
                if (jcbObjetivo.getSelectedItem().toString().equalsIgnoreCase("Maximizar")) {
                    Simplex.mayorFilaCj_Zj(modeloSolucion);
                } else if (jcbObjetivo.getSelectedItem().toString().equalsIgnoreCase("Minimizar")) {
                    Simplex.menorFilaCj_Zj(modeloSolucion);
                }
                Simplex.CalcularXn_Mayor(modeloSolucion);
                Simplex.Menor(modeloSolucion);
            }
        }
        if (todosMenor) {
            jButton4.setEnabled(false);
            GetX.mostar(modeloSolucion, Xn);
            limpiarUltimaCelda();

        }
        jlfila.setText("Fila: " + (Simplex.filalaMenor - 1));
        jlcolunna.setText("Columna: " + (Simplex.columnaMayor));
        jlPivote.setText("Pivote: " + AproximarNumero.valorAprocimado(String.valueOf(modeloSolucion.getValueAt(filalaMenor, Simplex.columnaMayor))));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jspRestStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jspRestStateChanged
        int fi = Integer.parseInt(jspRest.getValue().toString());
        String g[] = new String[Xn];
        if (fi > Nrestricciones) {
            for (int i = Nrestricciones + 1; i <= fi; i++) {
                g[0] = "Restricción " + i;
                modeloRestricciones.addRow(g);
                modeloRestricciones.setValueAt("<=", i, modeloRestricciones.getColumnCount() - 2);
            }
            Nrestricciones = fi;
        } else if (fi < Nrestricciones) {
            while (Nrestricciones != fi) {
                modeloRestricciones.removeRow(Nrestricciones);
                Nrestricciones--;
            }
        }
        jCheckBox1ActionPerformed(null);
    }//GEN-LAST:event_jspRestStateChanged

    private void jtRestriccionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtRestriccionesKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '-' && c != 'E' && c != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_jtRestriccionesKeyTyped

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        if (jCheckBox1.isSelected()) {
            for (int f = 0; f < modeloRestricciones.getRowCount(); f++) {
                for (int c = 1; c < modeloRestricciones.getColumnCount(); c++) {
                    if (c != modeloRestricciones.getColumnCount() - 2) {
                        if (String.valueOf(modeloRestricciones.getValueAt(f, c)).equalsIgnoreCase("") || String.valueOf(modeloRestricciones.getValueAt(f, c)).equalsIgnoreCase("null")) {
                            modeloRestricciones.setValueAt("0", f, c);
                        }
                    }
                }
            }
            modeloRestricciones.setValueAt("", 0, modeloRestricciones.getColumnCount() - 1);
        } else {
            for (int f = 0; f < modeloRestricciones.getRowCount(); f++) {
                for (int c = 1; c < modeloRestricciones.getColumnCount(); c++) {
                    if (c != modeloRestricciones.getColumnCount() - 2) {
                        if (String.valueOf(modeloRestricciones.getValueAt(f, c)).equalsIgnoreCase("0") || !isNumeric(String.valueOf(modeloRestricciones.getValueAt(f, c)))) {
                            modeloRestricciones.setValueAt("", f, c);
                        }
                    }
                }
            }
        }
        info2.setText(null);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        while (!todosMenor && filalaMenor > 0) {
            jButton4ActionPerformed(evt);
        }
        jButton5.setEnabled(false);
        limpiarUltimaCelda();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        info2.setText(" Procesando…");
    }//GEN-LAST:event_jButton2MousePressed

    private void jCheckBox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MousePressed
        info2.setText(" Procesando…"); // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1MousePressed

    private void jtRestriccionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtRestriccionesFocusGained
    }//GEN-LAST:event_jtRestriccionesFocusGained

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        int fil = jtRestricciones.getSelectedRow();
        if (fil > 0) {
            modeloRestricciones.removeRow(fil);
            Nrestricciones--;
            for (int i = 1; i < modeloRestricciones.getRowCount(); i++) {
                modeloRestricciones.setValueAt("Restricción. " + i, i, 0);
                jspRest.setValue(Nrestricciones);
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jtRestriccionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtRestriccionesMousePressed
        int fil = jtRestricciones.getSelectedRow();
        if (fil > 0 && modeloRestricciones.getRowCount() > 2) {
            jMenuItem5.setEnabled(true);
        } else {
            jMenuItem5.setEnabled(false);
        }
    }//GEN-LAST:event_jtRestriccionesMousePressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);  // TODO add your handling code here:
}//GEN-LAST:event_jButton6ActionPerformed
    private void crearTablaRestricciones() {
        Xn = Integer.parseInt(String.valueOf(jspvariables.getValue()));
        Nrestricciones = Integer.parseInt(String.valueOf(jspRest.getValue()));
        Object cabeza[] = new String[Xn + 3];
        cabeza[0] = (" ");
        for (int i = 1; i <= Xn; i++) {
            cabeza[i] = ("X" + i);
        }
        cabeza[Xn + 1] = (" ");
        cabeza[Xn + 2] = (" ");

        modeloRestricciones = new DefaultTableModel(cabeza, 0) {

            public boolean isCellEditable(int row, int column) {
                if (column == 0) {
                    return false;
                }
                if (row == 0 && column >= modeloRestricciones.getColumnCount() - 2) {
                    return false;
                }
                return true;
            }
        };
        jtRestricciones.setModel(modeloRestricciones);
        String fila[] = new String[Xn + 3];
        for (int i = 0; i < Nrestricciones + 1; i++) {
            if (i == 0) {
                fila[0] = new String("     Z =");
            } else {
                fila[0] = new String("Restricción. " + (i));
                fila[modeloRestricciones.getColumnCount() - 2] = "<=";
            }
            modeloRestricciones.addRow(fila);
        }
        agregarComboBox(modeloRestricciones.getColumnCount(), jtRestricciones);
    }

    private void Ecuaciones() {
        jtaEcuaciones.setText(null);
        int fila = modeloRestricciones.getRowCount();
        int col = modeloRestricciones.getColumnCount();
        jtaEcuaciones.append(" Z = ");
        for (int c = 1; c < col - 2; c++) {
            if (Double.parseDouble(String.valueOf(modeloRestricciones.getValueAt(0, c))) >= 0) {
                jtaEcuaciones.append(" +" + " " + modeloRestricciones.getValueAt(0, c) + "X" + c);
            } else {
                jtaEcuaciones.append(" " + modeloRestricciones.getValueAt(0, c) + " X" + c);
            }
        }
        jtaEcuaciones.append(" \n\n");
        for (int fil = 1; fil < fila; fil++) {
            jtaEcuaciones.append(" ");
            for (int co = 1; co < col; co++) {
                if (co == 1) {
                    jtaEcuaciones.append("" + modeloRestricciones.getValueAt(fil, co) + "X" + co);
                } else if (co == col - 2) {
                    jtaEcuaciones.append(" " + modeloRestricciones.getValueAt(fil, co));
                } else {
                    if (co >= col - 2) {
                        jtaEcuaciones.append(" " + modeloRestricciones.getValueAt(fil, co));
                    } else {
                        if (Double.parseDouble(String.valueOf(modeloRestricciones.getValueAt(fil, co))) >= 0) {
                            jtaEcuaciones.append(" +" + " " + modeloRestricciones.getValueAt(fil, co) + "X" + co);
                        } else {
                            jtaEcuaciones.append(" " + modeloRestricciones.getValueAt(fil, co) + " X" + co);
                        }
                    }
                }
            }
            jtaEcuaciones.append("\n");
        }
    }

    private void agregarComboBox(int co, JTable jtRestricciones) {
        String[] Condicion = {"<=", ">=", "=", ">", "<"};
        JComboBox jcb = new JComboBox(Condicion);
        TableColumn tc = jtRestricciones.getColumnModel().getColumn(co - 2);
        TableCellEditor tce = new DefaultCellEditor(jcb);

        tc.setCellEditor(tce);
        jtRestricciones.getColumnModel().getColumn(0).setPreferredWidth(50);
        jtRestricciones.getColumnModel().getColumn(co - 1).setPreferredWidth(80);
        jtRestricciones.getColumnModel().getColumn(co - 2).setPreferredWidth(30);
        for (int i = 1; i <= co - 2; i++) {
            jtRestricciones.getColumnModel().getColumn(0).setPreferredWidth(80);
        }
        jtRestricciones.setRowHeight(25);
    }

    private boolean validar() {
        String texto;
        int fila = modeloRestricciones.getRowCount();
        int colum = modeloRestricciones.getColumnCount();
        for (int i = 0; i < fila; i++) {
            for (int j = 1; j < colum; j++) {
                if (i == 0 && j >= colum - 2) {
                    break;
                } else if (j != colum - 2) {
                    texto = String.valueOf(modeloRestricciones.getValueAt(i, j));
                    if (!texto.matches("([+-]{1})?[0-9]+(\\.[0-9]+)?([Ee]{1}([-]{1})?[1-9])?")) {
                        JOptionPane.showMessageDialog(this, "Al parecer faltan o hay datos incorrectos,\nasegúrese de no escribir espacios en \nblanco o los decimales con coma…");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Component prepareEditor(TableCellEditor editor, int row, int columna) {
        return null;

    }

    public void limpiarUltimaCelda() {
        for (int i = 0; i < Tablon.getRowCount(); i++) {
            Tablon.setValueAt("", i, Tablon.getColumnCount() - 1);
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
            java.util.logging.Logger.getLogger(GuiSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GuiSimplex().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablon;
    private javax.swing.JLabel info;
    private javax.swing.JLabel info2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox jcbObjetivo;
    private javax.swing.JLabel jlPivote;
    private javax.swing.JLabel jlcolunna;
    private javax.swing.JLabel jlfila;
    private javax.swing.JSpinner jspRest;
    private javax.swing.JSpinner jspvariables;
    private javax.swing.JTable jtRestricciones;
    private javax.swing.JTextArea jtaEcuaciones;
    public static javax.swing.JTextArea jtaOperaciones;
    private javax.swing.JFrame ventanaCoeficientes;
    // End of variables declaration//GEN-END:variables

    private static boolean isNumeric(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
