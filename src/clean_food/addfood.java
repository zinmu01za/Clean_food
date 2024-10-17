
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




public class addfood extends javax.swing.JFrame {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private Object ImgPath;
    String filename = null;
    byte[] person_image = null;
    private int i;
    public addfood() {
        initComponents();
        con=Connect.ConnectDB();
        ShowDataToForm();
        ShowDataToForm1();
        setIcon();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }

    private void setIcon(){
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("123.png")));
         
     }
    
    
    public void ShowDataToForm(){
        String sql="SELECT ProductID as 'ลำดับ',ProductName as 'ชื่อเมนู',Price as 'ราคา'\n"
                + "FROM menu_food "; 
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            tb_list.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(orderfood.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ShowDataToForm1(){
        String sql="SELECT ProductID as 'ลำดับ',ProductName as 'ชื่อเมนู',Price as 'ราคา'\n"
                + "FROM menu_drink ";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            tb_list1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(orderfood.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_list = new javax.swing.JTable();
        txt_search4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_price4 = new javax.swing.JTextField();
        txt_name4 = new javax.swing.JTextField();
        lbl_image4 = new javax.swing.JLabel();
        btnImage = new javax.swing.JButton();
        up_btn = new javax.swing.JButton();
        dlt_btn = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_list1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txt_search5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_name5 = new javax.swing.JTextField();
        txt_price5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lbl_image5 = new javax.swing.JLabel();
        btnImage2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_save1 = new javax.swing.JButton();
        dlt_btn1 = new javax.swing.JButton();
        up_btn1 = new javax.swing.JButton();
        txt_id1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("โปรแกรมระบบร้าน Food & Restaurant Apps");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(204, 102, 0));
        jTabbedPane1.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(457, 508));
        jTabbedPane1.setOpaque(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_list.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        tb_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_list);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 390, 138));

        txt_search4.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        txt_search4.setFocusTraversalPolicyProvider(true);
        txt_search4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search4ActionPerformed(evt);
            }
        });
        txt_search4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search4KeyReleased(evt);
            }
        });
        jPanel1.add(txt_search4, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 280, 146, -1));

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel2.setText("ชื่อเมนู :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel3.setText("ราคา :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 130, -1, -1));

        txt_price4.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        txt_price4.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel1.add(txt_price4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 147, -1));

        txt_name4.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        txt_name4.setPreferredSize(new java.awt.Dimension(6, 30));
        txt_name4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_name4ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 147, -1));

        lbl_image4.setBackground(new java.awt.Color(204, 204, 204));
        lbl_image4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_image4.setOpaque(true);
        jPanel1.add(lbl_image4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 140, 112));

        btnImage.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        btnImage.setText("เลือกรูปภาพ");
        btnImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImageMouseClicked(evt);
            }
        });
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });
        jPanel1.add(btnImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 140, -1));

        up_btn.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        up_btn.setText("แก้ไข");
        up_btn.setMaximumSize(new java.awt.Dimension(55, 30));
        up_btn.setMinimumSize(new java.awt.Dimension(55, 30));
        up_btn.setPreferredSize(new java.awt.Dimension(55, 30));
        up_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_btnActionPerformed(evt);
            }
        });
        jPanel1.add(up_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 65, -1));

        dlt_btn.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        dlt_btn.setText("ลบ");
        dlt_btn.setMaximumSize(new java.awt.Dimension(55, 30));
        dlt_btn.setMinimumSize(new java.awt.Dimension(55, 30));
        dlt_btn.setPreferredSize(new java.awt.Dimension(65, 30));
        dlt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlt_btnActionPerformed(evt);
            }
        });
        jPanel1.add(dlt_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        btn_save.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        btn_save.setText("เพิ่ม");
        btn_save.setMaximumSize(new java.awt.Dimension(55, 30));
        btn_save.setMinimumSize(new java.awt.Dimension(55, 30));
        btn_save.setPreferredSize(new java.awt.Dimension(65, 30));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jButton4.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jButton4.setText("กลับสู่หน้าระบบงาน");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, -1, -1));

        txt_id.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        txt_id.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 147, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon("D:\\My Documents\\Downloads\\อาหารคลีน.jpg")); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 464, 506));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel1.setText("ลำดับ :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel10.setText("ค้นหา :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ข้อมูลรายการอาหาร", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("TH SarabunPSK", 1, 18))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 430, 210));

        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "เพิ่มรายการอาหาร", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("TH SarabunPSK", 1, 18))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 430, 210));

        jTabbedPane1.addTab("เพิ่มรายการอาหาร", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_list1.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        tb_list1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_list1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_list1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_list1);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 390, 138));

        jLabel9.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel9.setText("ค้นหา :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        txt_search5.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        txt_search5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search5ActionPerformed(evt);
            }
        });
        txt_search5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_search5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search5KeyReleased(evt);
            }
        });
        jPanel2.add(txt_search5, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 280, 146, -1));

        jLabel11.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel11.setText("ชื่อเมนู :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 90, -1, -1));

        txt_name5.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        txt_name5.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel2.add(txt_name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 147, 30));

        txt_price5.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        txt_price5.setMinimumSize(new java.awt.Dimension(6, 30));
        txt_price5.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel2.add(txt_price5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 147, 30));

        jLabel12.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel12.setText("ราคา :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 130, -1, -1));

        lbl_image5.setBackground(new java.awt.Color(204, 204, 204));
        lbl_image5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_image5.setOpaque(true);
        jPanel2.add(lbl_image5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 140, 112));

        btnImage2.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        btnImage2.setText("เลือกรูปภาพ");
        btnImage2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImage2MouseClicked(evt);
            }
        });
        btnImage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImage2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 140, -1));

        jButton5.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jButton5.setText("กลับสู่หน้าระบบงาน");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, -1, -1));

        btn_save1.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        btn_save1.setText("เพิ่ม");
        btn_save1.setPreferredSize(new java.awt.Dimension(65, 30));
        btn_save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        dlt_btn1.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        dlt_btn1.setText("ลบ");
        dlt_btn1.setPreferredSize(new java.awt.Dimension(65, 30));
        dlt_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlt_btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(dlt_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        up_btn1.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        up_btn1.setText("แก้ไข");
        up_btn1.setMinimumSize(new java.awt.Dimension(51, 33));
        up_btn1.setPreferredSize(new java.awt.Dimension(65, 30));
        up_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(up_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 65, -1));

        txt_id1.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        txt_id1.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel2.add(txt_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 147, 30));

        jLabel4.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel4.setText("ลำดับ :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "เพิ่มรายการเครื่องดื่ม", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("TH SarabunPSK", 1, 18))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 430, 210));

        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ข้อมูลรายการเครื่องดื่ม", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("TH SarabunPSK", 1, 18))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 430, 210));

        jLabel18.setIcon(new javax.swing.ImageIcon("D:\\My Documents\\Downloads\\อาหารคลีน.jpg")); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 510));

        jTabbedPane1.addTab("เพิ่มรายการเครื่องดื่ม", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 470, 540));

        jLabel17.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel17.setText("     - ");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 0, 40, 40));

        jLabel13.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel13.setText("Clean Food Programs");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clean_food/123.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 30, 30));

        jLabel16.setBackground(new java.awt.Color(255, 51, 51));
        jLabel16.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabel16.setText("   X");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 0, 40, 40));

        jLabel15.setBackground(new java.awt.Color(204, 102, 0));
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel15.setOpaque(true);
        jLabel15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel15MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel15MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void deleteRecord() {
        String selectId = txt_id.getText();
        String sql ="delete from menu_food WHERE ProductID='" +selectId+ "'";
        try {
            Connection c = Connect.ConnectDB();
            if (pst.executeUpdate(sql) != -1) {
                JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
                ShowDataToForm();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    private void tb_list1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_list1MouseClicked
        try {
            int row=tb_list1.getSelectedRow();
            String selectId=tb_list1.getValueAt(row,0).toString();
            String sql="select * from menu_drink where ProductID='"+selectId+"'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
               
                
                
                String add1=rs.getString("ProductID");
                txt_id1.setText(add1);
                
                String add2=rs.getString("ProductName");
                txt_name5.setText(add2);
                int add3=rs.getInt("Price");
                txt_price5.setText(add3+"");
                byte[] add4=rs.getBytes("image");
                
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(add4).getImage().getScaledInstance(lbl_image5.getWidth(),lbl_image5.getHeight(),Image.SCALE_SMOOTH));
                lbl_image5.setIcon(imageIcon);
                pst.execute();
            }
        } catch (SQLException ex) {
            Logger.getLogger(orderfood.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tb_list1MouseClicked

    private void txt_search5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search5ActionPerformed

    private void txt_search5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search5KeyReleased
         DefaultTableModel table = (DefaultTableModel) tb_list1.getModel();
        String search = txt_search5.getText();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(table);
        tb_list1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txt_search5KeyReleased

    private void btnImage2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImage2MouseClicked
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_image5.getWidth(),lbl_image5.getHeight(),Image.SCALE_SMOOTH));
        lbl_image5.setIcon(imageIcon);
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);

            }
            person_image=bos.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnImage2MouseClicked

    private void btnImage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImage2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImage2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Menu field= new Menu();
        field.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save1ActionPerformed
        try{
            String query="insert into menu_drink (ProductID,ProductName,Price,image)values(?,?,?,?)";
            pst=con.prepareStatement(query);
             pst.setString(1, txt_id1.getText());
            pst.setString(2, txt_name5.getText());
            pst.setString(3, txt_price5.getText());
           
            pst.setBytes(4, person_image);
              
            pst.execute();
            JOptionPane.showMessageDialog(this, "บันทึก","บันทึกเรียบร้อย",JOptionPane.INFORMATION_MESSAGE);
            ShowDataToForm1();
            clearData();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_save1ActionPerformed

    private void dlt_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlt_btn1ActionPerformed
        deleteRecord1();
    }//GEN-LAST:event_dlt_btn1ActionPerformed

    public void deleteRecord1() {
        String id = txt_id1.getText();
        String sql ="delete from menu_drink WHERE ProductID='" + id + "'";
        try {
            Connection c = Connect.ConnectDB();
            if (pst.executeUpdate(sql) != -1) {
                JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
                ShowDataToForm1();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    private void up_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_btn1ActionPerformed
       try{

            String value1= txt_id1.getText();
            String value2= txt_name5.getText();
            String value3= txt_price5.getText();
            
            

            String sql="UPDATE menu_drink SET ProductID='"+value1+"',ProductName ='"+value2+"',Price ='"+value3+"' WHERE ProductID='"+value1+"'";
            pst=con.prepareStatement(sql);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Update");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        ShowDataToForm1();
    }//GEN-LAST:event_up_btn1ActionPerformed

    private void txt_search5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search5KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Menu field= new Menu();
        field.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        try{
            String sql="insert into menu_food (ProductName,Price,image)values(?,?,?)";
            pst=con.prepareStatement(sql);
          
            pst.setString(1, txt_name4.getText());
            pst.setString(2, txt_price4.getText());

            pst.setBytes(3, person_image);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "บันทึก","บันทึกเรียบร้อย",JOptionPane.INFORMATION_MESSAGE);
            ShowDataToForm();
            clearData();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void dlt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlt_btnActionPerformed
        deleteRecord();
    }//GEN-LAST:event_dlt_btnActionPerformed

    private void up_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_btnActionPerformed
        try{

            String value1= txt_id.getText();
            String value2= txt_name4.getText();
            String value3= txt_price4.getText();

            String sql="UPDATE menu_food SET ProductID='"+value1+"',ProductName ='"+value2+"',Price ='"+value3+"' WHERE ProductID='"+value1+"'";
            pst=con.prepareStatement(sql);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Update");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        ShowDataToForm();
    }//GEN-LAST:event_up_btnActionPerformed

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImageActionPerformed

    private void btnImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImageMouseClicked

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_image4.getWidth(),lbl_image4.getHeight(),Image.SCALE_SMOOTH));
        lbl_image4.setIcon(imageIcon);
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);

            }
            person_image=bos.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnImageMouseClicked

    private void txt_search4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search4KeyReleased
        DefaultTableModel table = (DefaultTableModel) tb_list.getModel();
        String search = txt_search4.getText();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(table);
        tb_list.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txt_search4KeyReleased

    private void txt_search4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search4ActionPerformed

    private void tb_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_listMouseClicked

        try {
            int row=tb_list.getSelectedRow();
            String selectId=tb_list.getValueAt(row,0).toString();
            String sql="select * from menu_food where ProductID='"+selectId+"'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){

                String add1=rs.getString("ProductID");
                txt_id.setText(add1);
                String add2=rs.getString("ProductName");
                txt_name4.setText(add2);
                int add3=rs.getInt("Price");
                txt_price4.setText(add3+"");
                byte[] add4=rs.getBytes("image");

                ImageIcon imageIcon = new ImageIcon(new ImageIcon(add4).getImage().getScaledInstance(lbl_image4.getWidth(),lbl_image4.getHeight(),Image.SCALE_SMOOTH));
                lbl_image4.setIcon(imageIcon);
                pst.execute();
            }
        } catch (SQLException ex) {
            Logger.getLogger(orderfood.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tb_listMouseClicked

    private void txt_name4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_name4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_name4ActionPerformed

    private void jLabel15MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseDragged
        Point P = evt.getLocationOnScreen();
        this.setLocation(P);

    }//GEN-LAST:event_jLabel15MouseDragged

    private void jLabel15MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseMoved

    }//GEN-LAST:event_jLabel15MouseMoved

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel17MouseClicked

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
            java.util.logging.Logger.getLogger(addfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addfood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnImage2;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_save1;
    private javax.swing.JButton dlt_btn;
    private javax.swing.JButton dlt_btn1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_image4;
    private javax.swing.JLabel lbl_image5;
    private javax.swing.JTable tb_list;
    private javax.swing.JTable tb_list1;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_id1;
    private javax.swing.JTextField txt_name4;
    private javax.swing.JTextField txt_name5;
    private javax.swing.JTextField txt_price4;
    private javax.swing.JTextField txt_price5;
    private javax.swing.JTextField txt_search4;
    private javax.swing.JTextField txt_search5;
    private javax.swing.JButton up_btn;
    private javax.swing.JButton up_btn1;
    // End of variables declaration//GEN-END:variables
private void clearData() {
        
        txt_name4.setText("");
        txt_price4.setText("");
        
        
    }



}
