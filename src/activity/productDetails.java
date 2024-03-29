
package activity;

import Database.dbcon;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class productDetails extends javax.swing.JFrame {

    String pic1, pic2,pic3;
    ImageIcon icon[];
    int currentIndex;

    public productDetails() throws HeadlessException {
    }
    public productDetails(String product_id) {
        initComponents();
        
        dbcon dcon = new dbcon();
        String query = " SELECT *FROM product where id='" + product_id + "'";
        try {
            java.sql.ResultSet rs = dcon.s.executeQuery(query);
            while (rs.next()) {
                String product_name = rs.getString("product_name");
                String product_price = rs.getString("price");
                String status = rs.getString("status");
                String product_categoy = rs.getString("category");
                String shortdes = rs.getString("shortinfo");
                pic1 = rs.getString("bigpic1");
                pic2 = rs.getString("bigpic2");
                pic3 = rs.getString("bigpic3");
                titletxt.setText(product_name);
                pricetxt.setText("Price : " + product_price);
                stocktxt.setText("Status :"+status);
                product_codetxt.setText("Product Code: "+product_id);
                category.setText("Category :"+product_categoy);
                shortdescttxt.setText(shortdes);
            }
        } catch (SQLException ex) {
            Logger.getLogger(productDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(pic1!=null && pic2!=null &pic3!=null){
            try {
                icon=new ImageIcon[3];
                URL url1=new URL(pic1);
                Image first_image=ImageIO.read(url1);
                icon[0]=new ImageIcon(first_image);
                
                 URL url2=new URL(pic2);
                Image second_image=ImageIO.read(url2);
               icon[1]=new ImageIcon(second_image);
                
                 URL url3=new URL(pic3);
                Image third_image=ImageIO.read(url3);
                icon[2]=new ImageIcon(third_image);
                currentIndex=0;
                displayImage(currentIndex);
                 pack();
            } catch (MalformedURLException ex) {
                Logger.getLogger(productDetails.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(productDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
          
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        imagePanel = new javax.swing.JPanel();
        imageHolder = new javax.swing.JLabel();
        nextbtn = new javax.swing.JButton();
        prevbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        titletxt = new javax.swing.JTextArea();
        category = new javax.swing.JLabel();
        pricetxt = new javax.swing.JLabel();
        stocktxt = new javax.swing.JLabel();
        product_codetxt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        shortdescttxt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1254, 0, 30, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagePanel.setLayout(new java.awt.CardLayout());

        imageHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/abc.jpg"))); // NOI18N
        imageHolder.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imageHolder.setPreferredSize(new java.awt.Dimension(502, 504));
        imagePanel.add(imageHolder, "card2");

        jPanel2.add(imagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 506, 500));

        nextbtn.setBackground(new java.awt.Color(0, 102, 102));
        nextbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nextbtn.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn.setText(">>");
        nextbtn.setBorder(null);
        nextbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextbtnMouseClicked(evt);
            }
        });
        jPanel2.add(nextbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 70, 30));

        prevbtn.setBackground(new java.awt.Color(0, 102, 102));
        prevbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        prevbtn.setForeground(new java.awt.Color(255, 255, 255));
        prevbtn.setText("<<");
        prevbtn.setBorder(null);
        prevbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prevbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prevbtnMouseClicked(evt);
            }
        });
        jPanel2.add(prevbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 70, 30));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setOpaque(false);

        titletxt.setEditable(false);
        titletxt.setBackground(new java.awt.Color(255, 255, 255));
        titletxt.setColumns(20);
        titletxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titletxt.setForeground(new java.awt.Color(0, 51, 102));
        titletxt.setLineWrap(true);
        titletxt.setRows(5);
        titletxt.setText("Baseus PPCX030001 10000mAh 20W Magnetic Wireless Charging Power Bank\n");
        titletxt.setWrapStyleWord(true);
        titletxt.setAutoscrolls(false);
        titletxt.setBorder(null);
        jScrollPane2.setViewportView(titletxt);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 750, 90));

        category.setBackground(new java.awt.Color(0, 153, 204));
        category.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        category.setForeground(new java.awt.Color(153, 0, 0));
        category.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        category.setText("Category : Power Bank");
        category.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 110, 230, 50));

        pricetxt.setBackground(new java.awt.Color(0, 153, 204));
        pricetxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pricetxt.setForeground(new java.awt.Color(204, 0, 51));
        pricetxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pricetxt.setText("Price : 3,149 $");
        pricetxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 140, 50));

        stocktxt.setBackground(new java.awt.Color(0, 153, 204));
        stocktxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        stocktxt.setForeground(new java.awt.Color(153, 0, 0));
        stocktxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stocktxt.setText("Status : InStock");
        stocktxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(stocktxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 140, 50));

        product_codetxt.setBackground(new java.awt.Color(0, 153, 204));
        product_codetxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        product_codetxt.setForeground(new java.awt.Color(153, 0, 0));
        product_codetxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product_codetxt.setText("Product Code: 01");
        product_codetxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(product_codetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 180, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Key Features");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 170, 30));

        shortdescttxt.setEditable(false);
        shortdescttxt.setBackground(new java.awt.Color(255, 255, 255));
        shortdescttxt.setColumns(20);
        shortdescttxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        shortdescttxt.setRows(5);
        shortdescttxt.setText("Model: PPCX030001\nCapacity: 10000mAh / 38.5Wh\nType-C Input: 5V/3A; 9V/2A\nType-C Output: 5V/2.4A; 9V/2.22A; 12V/1.5A\nWireless Charge Output: 15W");
        jScrollPane3.setViewportView(shortdescttxt);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 710, 270));

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1290, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 1300, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void prevbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prevbtnMouseClicked
        currentIndex = (currentIndex - 1 + icon.length) % icon.length;
        System.out.println(currentIndex);
            displayImage(currentIndex);
    }//GEN-LAST:event_prevbtnMouseClicked

    private void nextbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextbtnMouseClicked
      
        currentIndex = (currentIndex + 1) % icon.length;
        System.out.println(currentIndex);
      imageHolder.setIcon(icon[currentIndex]);
        
    }//GEN-LAST:event_nextbtnMouseClicked

    
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
            java.util.logging.Logger.getLogger(productDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productDetails("").setVisible(true);
            }
        });
    }

    private void displayImage(int index){
        imageHolder.setIcon(icon[index]);
        revalidate();
        repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel category;
    private javax.swing.JLabel imageHolder;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton nextbtn;
    private javax.swing.JButton prevbtn;
    private javax.swing.JLabel pricetxt;
    private javax.swing.JLabel product_codetxt;
    private javax.swing.JTextArea shortdescttxt;
    private javax.swing.JLabel stocktxt;
    private javax.swing.JTextArea titletxt;
    // End of variables declaration//GEN-END:variables
}
