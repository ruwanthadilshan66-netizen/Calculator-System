/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;

/**
 *
 * @author prasa
 */
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JColorChooser;
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    double NumEnter1;
    double NumEnter2;
    double Result;
    String Op = "";
    public Calculator() {
        initComponents();
        showDateTime();
    }
public void showDateTime(){

    Timer timer = new Timer(1000,new ActionListener(){
    
      @Override
      public void actionPerformed(ActionEvent e){
          Date date = new Date();
          SimpleDateFormat dateFormat = new  SimpleDateFormat("dd-MM-yyyy");
          SimpleDateFormat timeFormat = new  SimpleDateFormat("hh:mm:ss a");
          
          lblDate.setText(dateFormat.format(date));
          lblTime.setText(timeFormat.format(date)); 
      } 
    
    });
    timer.start();
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtResult = new javax.swing.JTextField();
        jbtnPM = new javax.swing.JButton();
        jbtnSquare = new javax.swing.JButton();
        jbtnCE = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnP = new javax.swing.JButton();
        jbtnGIT7 = new javax.swing.JButton();
        jbtnGIT8 = new javax.swing.JButton();
        jbtnGIT9 = new javax.swing.JButton();
        jbtnGIT5 = new javax.swing.JButton();
        jbtnM = new javax.swing.JButton();
        jbtnGIT6 = new javax.swing.JButton();
        jbtnGIT4 = new javax.swing.JButton();
        jbtnMA = new javax.swing.JButton();
        jbtnGIT3 = new javax.swing.JButton();
        jbtnGIT2 = new javax.swing.JButton();
        jbtnGIT1 = new javax.swing.JButton();
        jbtnD = new javax.swing.JButton();
        jbtnE = new javax.swing.JButton();
        jbtnGIT0 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistory = new javax.swing.JTextArea();
        jbtnSqer = new javax.swing.JButton();
        jbtBS2 = new javax.swing.JButton();
        jbtBS3 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jbtBS5 = new javax.swing.JButton();
        jbtBS6 = new javax.swing.JButton();
        jbtnMO2 = new javax.swing.JButton();
        jbtnPre = new javax.swing.JButton();
        jbtBS8 = new javax.swing.JButton();
        btncopy = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtResult.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });
        getContentPane().add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 350, 50));

        jbtnPM.setBackground(new java.awt.Color(0, 0, 102));
        jbtnPM.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPM.setForeground(new java.awt.Color(255, 255, 255));
        jbtnPM.setText("±");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, 60, 60));

        jbtnSquare.setBackground(new java.awt.Color(0, 0, 102));
        jbtnSquare.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jbtnSquare.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSquare.setText("xʸ");
        jbtnSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSquareActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSquare, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 60, 60));

        jbtnCE.setBackground(new java.awt.Color(0, 0, 102));
        jbtnCE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnCE.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 60, 60));

        jbtnC.setBackground(new java.awt.Color(242, 0, 0));
        jbtnC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnC.setForeground(new java.awt.Color(255, 255, 255));
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 60, 60));

        jbtnP.setBackground(new java.awt.Color(255, 102, 51));
        jbtnP.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnP.setForeground(new java.awt.Color(204, 255, 255));
        jbtnP.setText("+");
        jbtnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 60, 60));

        jbtnGIT7.setBackground(new java.awt.Color(0, 0, 102));
        jbtnGIT7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnGIT7.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGIT7.setText("7");
        jbtnGIT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGIT7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGIT7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 60, 60));

        jbtnGIT8.setBackground(new java.awt.Color(0, 0, 102));
        jbtnGIT8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnGIT8.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGIT8.setText("8");
        jbtnGIT8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGIT8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGIT8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 60, 60));

        jbtnGIT9.setBackground(new java.awt.Color(0, 0, 102));
        jbtnGIT9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnGIT9.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGIT9.setText("9");
        jbtnGIT9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGIT9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGIT9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 60, 60));

        jbtnGIT5.setBackground(new java.awt.Color(0, 0, 102));
        jbtnGIT5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnGIT5.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGIT5.setText("5");
        jbtnGIT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGIT5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGIT5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 60, 60));

        jbtnM.setBackground(new java.awt.Color(255, 102, 51));
        jbtnM.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnM.setForeground(new java.awt.Color(204, 255, 255));
        jbtnM.setText("-");
        jbtnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnM, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 60, 60));

        jbtnGIT6.setBackground(new java.awt.Color(0, 0, 102));
        jbtnGIT6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnGIT6.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGIT6.setText("6");
        jbtnGIT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGIT6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGIT6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 60, 60));

        jbtnGIT4.setBackground(new java.awt.Color(0, 0, 102));
        jbtnGIT4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnGIT4.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGIT4.setText("4");
        jbtnGIT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGIT4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGIT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 60, 60));

        jbtnMA.setBackground(new java.awt.Color(255, 102, 51));
        jbtnMA.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnMA.setForeground(new java.awt.Color(204, 255, 255));
        jbtnMA.setText("*");
        jbtnMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMAActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 60, 60));

        jbtnGIT3.setBackground(new java.awt.Color(0, 0, 102));
        jbtnGIT3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnGIT3.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGIT3.setText("3");
        jbtnGIT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGIT3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGIT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 60, 60));

        jbtnGIT2.setBackground(new java.awt.Color(0, 0, 102));
        jbtnGIT2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnGIT2.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGIT2.setText("2");
        jbtnGIT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGIT2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGIT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 60, 60));

        jbtnGIT1.setBackground(new java.awt.Color(0, 0, 102));
        jbtnGIT1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnGIT1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGIT1.setText("1");
        jbtnGIT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGIT1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGIT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 60, 60));

        jbtnD.setBackground(new java.awt.Color(0, 0, 102));
        jbtnD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnD.setForeground(new java.awt.Color(255, 255, 255));
        jbtnD.setText(".");
        jbtnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, 60, 60));

        jbtnE.setBackground(new java.awt.Color(51, 153, 0));
        jbtnE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnE.setForeground(new java.awt.Color(204, 255, 255));
        jbtnE.setText("=");
        jbtnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 60, 130));

        jbtnGIT0.setBackground(new java.awt.Color(0, 0, 102));
        jbtnGIT0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnGIT0.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGIT0.setText("0");
        jbtnGIT0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGIT0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGIT0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 60, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("SMART SCIENTIFIC CALCULATOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("HISTORY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtHistory.setColumns(20);
        txtHistory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHistory.setRows(5);
        txtHistory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtHistory);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 350, -1));

        jbtnSqer.setBackground(new java.awt.Color(0, 0, 102));
        jbtnSqer.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jbtnSqer.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSqer.setText("√");
        jbtnSqer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSqerActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSqer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 60, 60));

        jbtBS2.setBackground(new java.awt.Color(0, 0, 102));
        jbtBS2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jbtBS2.setForeground(new java.awt.Color(255, 255, 255));
        jbtBS2.setText("sin");
        jbtBS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBS2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtBS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 60, 60));

        jbtBS3.setBackground(new java.awt.Color(0, 0, 102));
        jbtBS3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jbtBS3.setForeground(new java.awt.Color(255, 255, 255));
        jbtBS3.setText("←");
        jbtBS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBS3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtBS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 60, 60));

        btnSave.setBackground(new java.awt.Color(0, 51, 204));
        btnSave.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 60, 60));

        jbtBS5.setBackground(new java.awt.Color(0, 0, 102));
        jbtBS5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jbtBS5.setForeground(new java.awt.Color(255, 255, 255));
        jbtBS5.setText("X²");
        jbtBS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBS5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtBS5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 60, 60));

        jbtBS6.setBackground(new java.awt.Color(0, 0, 102));
        jbtBS6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jbtBS6.setForeground(new java.awt.Color(255, 255, 255));
        jbtBS6.setText("cos");
        jbtBS6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBS6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtBS6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 60, 60));

        jbtnMO2.setBackground(new java.awt.Color(255, 102, 51));
        jbtnMO2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnMO2.setForeground(new java.awt.Color(204, 255, 255));
        jbtnMO2.setText("/");
        jbtnMO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMO2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, 60, 60));

        jbtnPre.setBackground(new java.awt.Color(0, 0, 102));
        jbtnPre.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jbtnPre.setForeground(new java.awt.Color(255, 255, 255));
        jbtnPre.setText("%");
        jbtnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPreActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 60, 60));

        jbtBS8.setBackground(new java.awt.Color(0, 0, 102));
        jbtBS8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jbtBS8.setForeground(new java.awt.Color(255, 255, 255));
        jbtBS8.setText("tan");
        jbtBS8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBS8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtBS8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 60, 60));

        btncopy.setBackground(new java.awt.Color(0, 51, 204));
        btncopy.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btncopy.setForeground(new java.awt.Color(255, 255, 255));
        btncopy.setText("Copy");
        btncopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncopyActionPerformed(evt);
            }
        });
        getContentPane().add(btncopy, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 60, 60));

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 0, 51));
        lblTime.setText("Time");
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 0, 51));
        lblDate.setText("Date");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
             private void EnterNumbers(String q){
                String Nums = txtResult.getText() + q;
               txtResult.setText(Nums);
             }
    
    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
       txtResult.setText("");
       
       String Fn,Sn;
       
       Fn = String.valueOf(NumEnter1);
       Sn = String.valueOf(NumEnter2);
       
       Fn = "";
       Sn = "";
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSquareActionPerformed
            NumEnter1 = Double.parseDouble(txtResult.getText());
            txtResult.setText("");
            Op ="power";
           
    }//GEN-LAST:event_jbtnSquareActionPerformed
    
    private void jbtnGIT7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGIT7ActionPerformed
       EnterNumbers("7");
    }//GEN-LAST:event_jbtnGIT7ActionPerformed

    private void jbtnGIT8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGIT8ActionPerformed
         EnterNumbers("8");
    }//GEN-LAST:event_jbtnGIT8ActionPerformed

    private void jbtnGIT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGIT5ActionPerformed
        EnterNumbers("5");
    }//GEN-LAST:event_jbtnGIT5ActionPerformed

    private void jbtnGIT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGIT4ActionPerformed
       EnterNumbers("4");
    }//GEN-LAST:event_jbtnGIT4ActionPerformed

    private void jbtnGIT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGIT2ActionPerformed
         EnterNumbers("2");
    }//GEN-LAST:event_jbtnGIT2ActionPerformed

    private void jbtnGIT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGIT1ActionPerformed
        EnterNumbers("1");
    }//GEN-LAST:event_jbtnGIT1ActionPerformed

    private void jbtnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDActionPerformed
        
        if ( ! txtResult.getText().contains(".") )
        {
          txtResult.setText(txtResult.getText() + jbtnD.getText());
        }
        
    }//GEN-LAST:event_jbtnDActionPerformed

    private void jbtnGIT0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGIT0ActionPerformed
        EnterNumbers("0");
    }//GEN-LAST:event_jbtnGIT0ActionPerformed

    private void jbtnGIT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGIT3ActionPerformed
        EnterNumbers("3");
    }//GEN-LAST:event_jbtnGIT3ActionPerformed

    private void jbtnGIT6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGIT6ActionPerformed
       EnterNumbers("6");
    }//GEN-LAST:event_jbtnGIT6ActionPerformed

    private void jbtnGIT9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGIT9ActionPerformed
       EnterNumbers("9");
    }//GEN-LAST:event_jbtnGIT9ActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
       double nums = Double.parseDouble(String.valueOf(txtResult.getText()));
       nums = nums * (-1);
       txtResult.setText(String.valueOf(nums));
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPActionPerformed
      NumEnter1 = Double.parseDouble(txtResult.getText());
      txtResult.setText("");
      Op ="+";
      txtResult.setText(txtResult.getText() + "+");
    }//GEN-LAST:event_jbtnPActionPerformed

    private void jbtnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMActionPerformed
      NumEnter1 = Double.parseDouble(txtResult.getText());
      txtResult.setText("");
      Op ="-";
      txtResult.setText(txtResult.getText() + "-");
    }//GEN-LAST:event_jbtnMActionPerformed

    private void jbtnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEActionPerformed
        NumEnter2 = Double.parseDouble( txtResult.getText());
        
        switch (Op){
       
            case "+":
                Result =  NumEnter1 + NumEnter2;
                txtHistory.append(NumEnter1+" "+Op +" "+NumEnter2+" = "+Result+" \n" );
                txtResult.setText( NumEnter1 + "+" + NumEnter2 +"=" + Result);
                break;
            case "-":
                Result =  NumEnter1 + NumEnter2;
                txtHistory.append(NumEnter1+" "+ Op +" "+NumEnter2+" = "+Result+" \n" );
                txtResult.setText( NumEnter1 + "-" + NumEnter2 +"=" + Result);
                break;
            case "*":
                Result =  NumEnter1 * NumEnter2;
                txtHistory.append(NumEnter1+" "+Op +" "+NumEnter2+" = "+Result+" \n" );
                txtResult.setText( NumEnter1 + "*" + NumEnter2 +"=" + Result);
                break;
            case "/":
               if (NumEnter2 ==0){
                  txtResult.setText("Cannot Divide by Zero");
                        return;
               }
                Result = NumEnter1 / NumEnter2;
                txtHistory.append(NumEnter1+" "+Op +" "+NumEnter2+" = "+Result+" \n" );
                txtResult.setText(NumEnter1 + "/" + NumEnter2 +"=" + Result);
                break;
            case "%":
                Result =  NumEnter1/ 100 ;
                txtHistory.append(NumEnter1+" % = "+Result+" \n" );
                txtResult.setText( NumEnter1 + "%" +"=" + Result);
                break;
             case "power":
                Result =  Math.pow(NumEnter1,NumEnter2);
                txtHistory.append(NumEnter1+" "+Op +" "+NumEnter2+" = "+Result+" \n" );
                txtResult.setText( NumEnter1 + "^" + NumEnter2 + "=" +Result);
                break;
            case "sqrt":
                Result = Math.sqrt(NumEnter1);
                txtHistory.append(NumEnter1+" "+Op +" "+NumEnter2+" = "+Result+" \n" );
                txtResult.setText(  NumEnter1+"√" + "=" +Result);
                break;
             case "square":
                Result = NumEnter1 * NumEnter1;
                txtHistory.append(NumEnter1+" "+Op +" "+NumEnter2+" = "+Result+" \n" );
                txtResult.setText(  NumEnter1 + "²=" +Result);
                break;    
            case "sin":
                Result = Math.sin(Math.toRadians(NumEnter1));
                txtHistory.append(NumEnter1+" "+Op +" "+NumEnter2+" = "+Result+" \n" );
                txtResult.setText("sin("+NumEnter1+")="+Result);
                break;        
            case "cos":
                Result = Math.cos(Math.toRadians(NumEnter1));
                txtHistory.append(NumEnter1+" "+Op +" "+NumEnter2+" = "+Result+" \n" );
                txtResult.setText("cos("+NumEnter1+")="+Result);
                break; 
             case "tan":
                Result = Math.tan(Math.toRadians(NumEnter1));
                txtHistory.append(NumEnter1+" "+Op +" "+NumEnter2+" = "+Result+" \n" );
                txtResult.setText("tan("+NumEnter1+")="+Result);
                break;                 
        }
        txtResult.setText(String.valueOf(Result));
       
    }//GEN-LAST:event_jbtnEActionPerformed

    private void jbtnMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMAActionPerformed
      NumEnter1 = Double.parseDouble(txtResult.getText());
      txtResult.setText(" ");
      Op ="*";
     
    }//GEN-LAST:event_jbtnMAActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
       txtResult.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultActionPerformed

    private void jbtnSqerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSqerActionPerformed
            NumEnter1 = Double.parseDouble(txtResult.getText());
            txtResult.setText("");
            Op ="sqrt";
           
    }//GEN-LAST:event_jbtnSqerActionPerformed

    private void jbtBS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBS2ActionPerformed
              NumEnter1 = Double.parseDouble(txtResult.getText());
              txtResult.setText("");
              Op ="sin";
              
    }//GEN-LAST:event_jbtBS2ActionPerformed

    private void jbtBS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBS3ActionPerformed
            
        String backsp = null;
             
             if (txtResult.getText().length() > 0)
             {
                   StringBuilder ab = new  StringBuilder(txtResult.getText());
                   ab.deleteCharAt(txtResult.getText().length() -1);
                   backsp = ab.toString();
                   txtResult.setText(  backsp);
             
             }
    }//GEN-LAST:event_jbtBS3ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       try {
       
           FileWriter writer = new FileWriter("History.txt");
           writer.write(txtHistory.getText());
           writer.close();
           JOptionPane.showMessageDialog(this,"History Saved Successfull!");
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,e.getMessage());
       
       }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jbtBS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBS5ActionPerformed
        NumEnter1 = Double.parseDouble(txtResult.getText());
        txtResult.setText("");
        Op ="square";
       
        
    }//GEN-LAST:event_jbtBS5ActionPerformed

    private void jbtBS6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBS6ActionPerformed
          NumEnter1 = Double.parseDouble(txtResult.getText());
          txtResult.setText("");
          Op ="cos";
         
    }//GEN-LAST:event_jbtBS6ActionPerformed

    private void jbtnMO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMO2ActionPerformed
          NumEnter1 = Double.parseDouble(txtResult.getText());
          txtResult.setText("");
          Op ="/";
         
        
    }//GEN-LAST:event_jbtnMO2ActionPerformed

    private void jbtnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPreActionPerformed
        NumEnter1 = Double.parseDouble(txtResult.getText());
        txtResult.setText("");
        Op ="%";
       
    }//GEN-LAST:event_jbtnPreActionPerformed

    private void jbtBS8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBS8ActionPerformed
          NumEnter1 = Double.parseDouble(txtResult.getText());
          txtResult.setText("");
          Op ="tan";
          
    }//GEN-LAST:event_jbtBS8ActionPerformed
     
    private void btncopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncopyActionPerformed
        StringSelection stringSelection = new  StringSelection(txtResult.getText());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents( stringSelection,null);
    }//GEN-LAST:event_btncopyActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btncopy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtBS2;
    private javax.swing.JButton jbtBS3;
    private javax.swing.JButton jbtBS5;
    private javax.swing.JButton jbtBS6;
    private javax.swing.JButton jbtBS8;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnD;
    private javax.swing.JButton jbtnE;
    private javax.swing.JButton jbtnGIT0;
    private javax.swing.JButton jbtnGIT1;
    private javax.swing.JButton jbtnGIT2;
    private javax.swing.JButton jbtnGIT3;
    private javax.swing.JButton jbtnGIT4;
    private javax.swing.JButton jbtnGIT5;
    private javax.swing.JButton jbtnGIT6;
    private javax.swing.JButton jbtnGIT7;
    private javax.swing.JButton jbtnGIT8;
    private javax.swing.JButton jbtnGIT9;
    private javax.swing.JButton jbtnM;
    private javax.swing.JButton jbtnMA;
    private javax.swing.JButton jbtnMO2;
    private javax.swing.JButton jbtnP;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPre;
    private javax.swing.JButton jbtnSqer;
    private javax.swing.JButton jbtnSquare;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextArea txtHistory;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
