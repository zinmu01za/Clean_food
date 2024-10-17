/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clean_food;

import clean_food.Menu;
import static com.oracle.jrockit.jfr.ContentType.Bytes;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DELL
 */
public class report extends javax.swing.JFrame {
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    
    
    
    public report() {
        
        initComponents();
        con=Connect.ConnectDB();
        ShowDataToForm();
        
        ShowDataToForm();
        
        setIcon();
       Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
    }
    
    
    
    private void setIcon(){
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("123.png")));
         
     }
   
    
    public void ShowDataToForm(){
        String sql="SELECT ProductName as 'ชื่อเมนู',Price as 'ราคา',gobbet as 'จำนวน',put as 'ภาชนะ'\n"
                + "FROM list_bay ";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            tbproduct_list.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(orderfood.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbproduct_list = new javax.swing.JTable();
        txt_sum = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("โปรแกรมระบบร้าน Food & Resturant Apps");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N

        tbproduct_list.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        tbproduct_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "title1", "title2", "title3", "title4"
            }
        ));
        tbproduct_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbproduct_listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbproduct_list);

        jTabbedPane1.addTab("โต๊ะที่1", jScrollPane2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 560, 340));

        txt_sum.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        txt_sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sumActionPerformed(evt);
            }
        });
        getContentPane().add(txt_sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 168, 30));

        jButton2.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jButton2.setText("รวม");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        jButton24.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jButton24.setText("กลับสู่หน้าระบบงาน");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "สรุปรายการขาย", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("TH SarabunPSK", 1, 18))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 390));

        jLabel50.setBackground(new java.awt.Color(255, 51, 51));
        jLabel50.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabel50.setText("   X");
        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel50.setOpaque(true);
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 40, 40));

        jLabel77.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel77.setText("    - ");
        jLabel77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel77MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 30, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\My Documents\\Downloads\\อาหารคลีน.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 450));

        jLabel78.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel78.setText("Clean Food Programs");
        getContentPane().add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clean_food/123.png"))); // NOI18N
        getContentPane().add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 30, 30));

        jLabel25.setBackground(new java.awt.Color(204, 102, 0));
        jLabel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel25.setOpaque(true);
        jLabel25.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel25MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel25MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
 
    private void txt_sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sumActionPerformed
 
    }//GEN-LAST:event_txt_sumActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        Menu field= new Menu();
        field.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jLabel25MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseDragged
        Point P = evt.getLocationOnScreen();
        this.setLocation(P);
    }//GEN-LAST:event_jLabel25MouseDragged

    private void jLabel25MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseMoved

    private void jLabel77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel77MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel50MouseClicked

    private void tbproduct_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbproduct_listMouseClicked
      
    }//GEN-LAST:event_tbproduct_listMouseClicked

               
  
      
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
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton24;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbproduct_list;
    private javax.swing.JTextField txt_sum;
    // End of variables declaration//GEN-END:variables
}
