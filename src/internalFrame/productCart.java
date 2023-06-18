
package internalFrame;

import Database.dbcon;
import design.cartItem;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class productCart extends javax.swing.JInternalFrame {
    public  static HashMap<String , String> hashMap;
    public static ArrayList<HashMap<String, String> > cartList=new ArrayList<>();
    static String username;
    static String phoneNumber;
    static String useraddress;
    
     double totalcost=0;
     double deliveryfee=150;
     double totalItem=cartList.size();
     
     double totalPayment=0;
     dbcon databasecon=new dbcon();
     String paymentMethod;
     String orderProduct="";
   
    public productCart() {
        initComponents();
        setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI UI = (BasicInternalFrameUI) getUI();
        UI.setNorthPane(null);
        initComponents(); 
        
        
        
        nametxt.setText("Name : "+username);
        phonetxt.setText("Phone : "+phoneNumber);
        addrtxt.setText("Address : "+useraddress);
        
        for(int i=0; i<cartList.size(); i++){
            hashMap=cartList.get(i);
            String prid=hashMap.get("product_id");
            orderProduct=orderProduct.concat(prid+" ");
            String prname=hashMap.get("product_title");
            String prprice=hashMap.get("product_price");
            double prpriceintaka=Double.parseDouble(prprice);
            totalcost=totalcost+prpriceintaka;
            cartItem item=new cartItem(prname, prprice);
            cartItemHolder.add(item);
            
        }
        
        totalPayment=totalcost+deliveryfee;
        totalitemtxt.setText(": "+totalItem);
        deliverytxt.setText(": "+deliveryfee+" ৳");
        totalpyamenttxt.setText(": "+totalPayment+" ৳");
       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartItemHolder = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        phonetxt = new javax.swing.JLabel();
        nametxt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addrtxt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalitemtxt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        deliverytxt = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalpyamenttxt = new javax.swing.JLabel();
        orderbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cashOndelivery = new javax.swing.JCheckBox();
        MobileBanking = new javax.swing.JCheckBox();
        Card = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(1280, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setForeground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cart List");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 30));

        cartItemHolder.setLayout(new java.awt.GridLayout(0, 1, 0, 10));
        jScrollPane1.setViewportView(cartItemHolder);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 620));

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order Details");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, 40));

        phonetxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phonetxt.setForeground(new java.awt.Color(255, 255, 255));
        phonetxt.setText("Phone : 01836849353");
        jPanel2.add(phonetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 370, 30));

        nametxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nametxt.setForeground(new java.awt.Color(255, 255, 255));
        nametxt.setText("Name: Rasel Ahmed");
        jPanel2.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 370, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("Customer Details");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 230, 30));

        addrtxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addrtxt.setForeground(new java.awt.Color(255, 255, 255));
        addrtxt.setText("Address: Bangla Bazar, Sonargaon, Narayangonj, Bangladesh");
        addrtxt.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        addrtxt.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        addrtxt.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel2.add(addrtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 420, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 102));
        jLabel4.setText("Order Summary");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 460, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Items");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 290, 30));

        totalitemtxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalitemtxt.setForeground(new java.awt.Color(255, 255, 255));
        totalitemtxt.setText(":  5");
        jPanel2.add(totalitemtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 80, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Delivery Fee");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 290, 30));

        deliverytxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deliverytxt.setForeground(new java.awt.Color(255, 255, 255));
        deliverytxt.setText(":  150 $");
        jPanel2.add(deliverytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 80, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Payment");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 290, 30));

        totalpyamenttxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalpyamenttxt.setForeground(new java.awt.Color(255, 255, 255));
        totalpyamenttxt.setText(":  2550 $");
        jPanel2.add(totalpyamenttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 80, 30));

        orderbtn.setBackground(new java.awt.Color(0, 0, 102));
        orderbtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        orderbtn.setForeground(new java.awt.Color(255, 255, 255));
        orderbtn.setText("Place Order");
        orderbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderbtnMouseClicked(evt);
            }
        });
        orderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderbtnActionPerformed(evt);
            }
        });
        jPanel2.add(orderbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 360, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("Payment Method");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 200, -1));

        buttonGroup1.add(cashOndelivery);
        cashOndelivery.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cashOndelivery.setForeground(new java.awt.Color(255, 255, 255));
        cashOndelivery.setText("Cash On Delivery");
        jPanel2.add(cashOndelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        buttonGroup1.add(MobileBanking);
        MobileBanking.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MobileBanking.setForeground(new java.awt.Color(255, 255, 255));
        MobileBanking.setText("Mobile Banking");
        jPanel2.add(MobileBanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        buttonGroup1.add(Card);
        Card.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Card.setForeground(new java.awt.Color(255, 255, 255));
        Card.setText("Card & IBanking");
        jPanel2.add(Card, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 500, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderbtnActionPerformed

    private void orderbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderbtnMouseClicked
        if(cartList.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please add some products");
        }else{
            if(cashOndelivery.isSelected()){
                paymentMethod="Cash On Delivery";
            }else if(MobileBanking.isSelected()){
                paymentMethod="Mobile Banking";
            }else if(Card.isSelected()){
                paymentMethod="Card & IBanking";
            }else{
                JOptionPane.showMessageDialog(null, "Please select a Payment Method");
                return;
            }
            
            Date date=new Date();
            
            String Query="INSERT INTO `orderDetails` (`customerName`, `customerNumber`, `customerAddress`, `productsId`, `totalPayment`, `paymentMethod`, `orderItem`, `orderDate`) VALUES ('"+username+"', '"+phoneNumber+"', '"+useraddress+"', '"+orderProduct+"', '"+totalPayment+"', '"+paymentMethod+"', '"+totalItem+"', '"+date+"');";
             int option= JOptionPane.showConfirmDialog(null, "Do you want to confirm your order?","Order Confirmation",JOptionPane.YES_NO_OPTION);
              if(option==JOptionPane.YES_OPTION){
                try {
                    databasecon.s.executeUpdate(Query);
                    JOptionPane.showMessageDialog(null, "Order Place Successfully");
                    cartList.clear();
                    orderProduct="";
                } catch (SQLException ex) {
                    Logger.getLogger(productCart.class.getName()).log(Level.SEVERE, null, ex);
                }
                  
              }
           
        }
    }//GEN-LAST:event_orderbtnMouseClicked

    
   public static void userinfo(String name, String phone, String address){
       username=name;
       phoneNumber=phone;
       useraddress=address;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Card;
    private javax.swing.JCheckBox MobileBanking;
    private javax.swing.JLabel addrtxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel cartItemHolder;
    private javax.swing.JCheckBox cashOndelivery;
    private javax.swing.JLabel deliverytxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nametxt;
    private javax.swing.JButton orderbtn;
    private javax.swing.JLabel phonetxt;
    private javax.swing.JLabel totalitemtxt;
    private javax.swing.JLabel totalpyamenttxt;
    // End of variables declaration//GEN-END:variables
}
