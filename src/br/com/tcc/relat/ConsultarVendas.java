/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.relat;

import Conexao.ConnectionFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo P Souza
 */
public class ConsultarVendas extends javax.swing.JFrame {

    public static String sql;

    public ConsultarVendas() {
        initComponents();
        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);
//        String dia = cbxDia.getSelectedItem().toString();
//        String mes = cbxMes.getSelectedItem().toString();
        spnAno.setValue(ano);
        spnAno2.setValue(ano);
        spnAno3.setValue(ano);
        spnAno4.setValue(ano);
//        String data = ano+"-"+mes+"-"+dia;
//        sql =  "SELECT cliente.nome, funcionario.nome, tipopagamento.descricao, vendaregistro.dataVenda, vendaregistro.vlrSugerido, vendaregistro.totalVenda, vendaregistro.parcela, vendaregistro.1vencimento, vendaregistro.ativo FROM vendaregistro as vendaregistro INNER JOIN cliente as cliente ON (vendaregistro.idCliente = cliente.id) INNER JOIN funcionario as funcionario ON (vendaregistro.idFuncionario = funcionario.id) INNER JOIN tipopagamento as tipopagamento ON (vendaregistro.idTipoPagamento = tipopagamento.id) WHERE  dataVenda BETWEEN " + data +" AND CURRENT_DATE";

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
        jLabel1 = new javax.swing.JLabel();
        cbxDia = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbxMes = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        spnAno = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbxDia2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cbxMes2 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        spnAno2 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        cbxDia3 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cbxMes3 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        spnAno3 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cbxDia4 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cbxMes4 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        spnAno4 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa vendas desde"));

        jLabel1.setText("Dia:");

        cbxDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel2.setText("Mês:");

        cbxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        jLabel3.setText("Ano:");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnAno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(spnAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar entre datas"));

        jLabel4.setText("Dia:");

        cbxDia2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel5.setText("Mês:");

        cbxMes2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        jLabel6.setText("Ano:");

        jLabel7.setText("Dia:");

        cbxDia3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel8.setText("Mês:");

        cbxMes3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        jLabel9.setText("Ano:");

        jButton2.setText("Pesquisar");
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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxDia2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxMes2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnAno2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxDia3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxMes3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnAno3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxDia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbxMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(spnAno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxDia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbxMes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(spnAno3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa vendas pela data"));

        jLabel10.setText("Dia:");

        cbxDia4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel11.setText("Mês:");

        cbxMes4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        jLabel12.setText("Ano:");

        jButton3.setText("Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxDia4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxMes4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnAno4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbxDia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cbxMes4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(spnAno4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String dia = cbxDia.getSelectedItem().toString();
        int mes = cbxMes.getSelectedIndex() + 1;
        String ano = spnAno.getValue().toString();
        String data = ano + "-" + mes + "-" + dia;
        System.out.println(data);
        sql = "SELECT cliente.nome, funcionario.nome, tipopagamento.descricao, vendaregistro.dataVenda, vendaregistro.vlrSugerido, vendaregistro.totalVenda, vendaregistro.parcela, vendaregistro.1vencimento, vendaregistro.ativo FROM vendaregistro as vendaregistro INNER JOIN cliente as cliente ON (vendaregistro.idCliente = cliente.id) INNER JOIN funcionario as funcionario ON (vendaregistro.idFuncionario = funcionario.id) INNER JOIN tipopagamento as tipopagamento ON (vendaregistro.idTipoPagamento = tipopagamento.id) WHERE  dataVenda BETWEEN '" + data + "' AND CURRENT_DATE";
        System.out.println(sql);
        try {
            relat(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ConsultarVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConsultarVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String dia2 = cbxDia2.getSelectedItem().toString();
        String dia3 = cbxDia3.getSelectedItem().toString();
        int mes2 = cbxMes2.getSelectedIndex() + 1;
        int mes3 = cbxMes3.getSelectedIndex() + 1;
        String ano2 = spnAno2.getValue().toString();
        String ano3 = spnAno3.getValue().toString();
        String data2 = ano2 + "-" + mes2 + "-" + dia2;
        String data3 = ano3 + "-" + mes3 + "-" + dia3;
//        System.out.println(data);
        sql = "SELECT cliente.nome, funcionario.nome, tipopagamento.descricao, vendaregistro.dataVenda, vendaregistro.vlrSugerido, vendaregistro.totalVenda, vendaregistro.parcela, vendaregistro.1vencimento, vendaregistro.ativo FROM vendaregistro as vendaregistro INNER JOIN cliente as cliente ON (vendaregistro.idCliente = cliente.id) INNER JOIN funcionario as funcionario ON (vendaregistro.idFuncionario = funcionario.id) INNER JOIN tipopagamento as tipopagamento ON (vendaregistro.idTipoPagamento = tipopagamento.id) WHERE  dataVenda BETWEEN '" + data2 + "' AND '" + data3 + "'";
        System.out.println(sql);
        try {
            relat(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ConsultarVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConsultarVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String dia = cbxDia4.getSelectedItem().toString();
        int mes = cbxMes4.getSelectedIndex() + 1;
        String ano = spnAno4.getValue().toString();
        String data = ano + "-" + mes + "-" + dia;
        System.out.println(data);
        sql = "SELECT cliente.nome, funcionario.nome, tipopagamento.descricao, vendaregistro.dataVenda, vendaregistro.vlrSugerido, vendaregistro.totalVenda, vendaregistro.parcela, vendaregistro.1vencimento, vendaregistro.ativo FROM vendaregistro as vendaregistro INNER JOIN cliente as cliente ON (vendaregistro.idCliente = cliente.id) INNER JOIN funcionario as funcionario ON (vendaregistro.idFuncionario = funcionario.id) INNER JOIN tipopagamento as tipopagamento ON (vendaregistro.idTipoPagamento = tipopagamento.id) WHERE  dataVenda = '" + data + "'";
        System.out.println(sql);
        try {
            relat(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ConsultarVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConsultarVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {

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
            java.util.logging.Logger.getLogger(ConsultarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbxDia;
    private javax.swing.JComboBox cbxDia2;
    private javax.swing.JComboBox cbxDia3;
    private javax.swing.JComboBox cbxDia4;
    private javax.swing.JComboBox cbxMes;
    private javax.swing.JComboBox cbxMes2;
    private javax.swing.JComboBox cbxMes3;
    private javax.swing.JComboBox cbxMes4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner spnAno;
    private javax.swing.JSpinner spnAno2;
    private javax.swing.JSpinner spnAno3;
    private javax.swing.JSpinner spnAno4;
    // End of variables declaration//GEN-END:variables

    public void relat(String sql) throws SQLException, DocumentException, FileNotFoundException, IOException {
        /* Create Connection objects */
        Connection con = new ConnectionFactory().getConnection();
        Statement stmt = con.createStatement();
        /* Define the SQL query */
//         sql = "SELECT cliente.nome, funcionario.nome, tipopagamento.descricao, vendaregistro.dataVenda, vendaregistro.vlrSugerido, vendaregistro.totalVenda, vendaregistro.parcela, vendaregistro.1vencimento, vendaregistro.ativo FROM vendaregistro as vendaregistro INNER JOIN cliente as cliente ON (vendaregistro.idCliente = cliente.id) \n" +
//"INNER JOIN funcionario as funcionario ON (vendaregistro.idFuncionario = funcionario.id) INNER JOIN tipopagamento as tipopagamento ON (vendaregistro.idTipoPagamento = tipopagamento.id) WHERE  dataVenda = CURRENT_DATE";
        ResultSet query = stmt.executeQuery(sql);
        /* Step-2: Initialize PDF documents - logical objects */
        Document PDFLogReport = new Document();
        PdfWriter.getInstance(PDFLogReport, new FileOutputStream("../../VendaDoDia.pdf"));
        PDFLogReport.open();

        Paragraph cabecalho = new Paragraph("AGRO EMPRESARIAL - SISTEMA DE GERENCIAMENTO\n"
                + "RUA GONÇALVES CHAVES, 602 PELOTAS/RS\n"
                + "FONE:(53) 3232-3232 BAIRRO: CENTRO\n"
                + "CNPJ: 12.345.678/1011-12\n\n\n");
        cabecalho.setAlignment(Element.ALIGN_CENTER);
        PDFLogReport.add(cabecalho);
        //we have two columns in our table  
        PdfPTable LogTable = new PdfPTable(9);

        // Título para a tabela
        Paragraph tableHeader = new Paragraph("Relatório Venda do Dia");

        PdfPCell header = new PdfPCell(tableHeader);

        // Definindo que o header vai ocupar as 2 colunas
        header.setColspan(9);
        // Definindo alinhamento do header
        header.setHorizontalAlignment(Paragraph.ALIGN_CENTER);
        // Adicionando o header à tabela

        Font fonte = new Font(Font.FontFamily.HELVETICA, 7, Font.BOLD, BaseColor.BLACK);
        Font fonteDados = new Font(Font.FontFamily.TIMES_ROMAN, 6, Font.NORMAL, BaseColor.BLACK);

        LogTable.addCell(header);
        LogTable.addCell(new Paragraph("Cliente ", fonte));
        LogTable.addCell(new Paragraph("Funcionario", fonte));
        LogTable.addCell(new Paragraph("Tipo Pagamento", fonte));
        LogTable.addCell(new Paragraph("Data Compra", fonte));
        LogTable.addCell(new Paragraph("Valor Sugerido", fonte));
        LogTable.addCell(new Paragraph("Valor da Venda", fonte));
        LogTable.addCell(new Paragraph("Parcelas", fonte));
        LogTable.addCell(new Paragraph("1º Vencimento", fonte));
        LogTable.addCell(new Paragraph("Status da Compra", fonte));
        //create a cell object  
//         PdfPCell table_cell;  
        while (query.next()) {
            String cliente = query.getString("cliente.nome");
            LogTable.addCell(new Paragraph(cliente, fonteDados));
            String funcionario = query.getString("funcionario.nome");
            LogTable.addCell(new Paragraph(funcionario, fonteDados));
            String tipoPagamento = query.getString("tipopagamento.descricao");
            LogTable.addCell(new Paragraph(tipoPagamento, fonteDados));
            String dataVenda = query.getString("dataVenda");
            LogTable.addCell(new Paragraph(dataVenda, fonteDados));
            String vlrSugerido = query.getString("vlrSugerido");
            LogTable.addCell(new Paragraph(vlrSugerido, fonteDados));
            String totalVenda = query.getString("totalVenda");
            LogTable.addCell(new Paragraph(totalVenda, fonteDados));
            String parcela = query.getString("parcela");
            LogTable.addCell(new Paragraph(parcela, fonteDados));
            String vencimento = query.getString("1vencimento");
            LogTable.addCell(new Paragraph(vencimento, fonteDados));
            String ativo = query.getString("ativo");
            LogTable.addCell(new Paragraph(ativo, fonteDados));
        }
        /* Attach report table to PDF */
        PDFLogReport.add(LogTable);
        PDFLogReport.close();
        /* Close all DB related objects */
        query.close();
        stmt.close();
        con.close();
        String file;
        file = "C:\\Users\\Leonardo P Souza\\Desktop\\Relat\\VendaDoDia.pdf";
        //Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + file);
        File pdf = new File("../../VendaDoDia.pdf");
        try {
            Desktop.getDesktop().open(pdf);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao abrir relatório: " + ex);
        }
    }

}
