
package design;

import activity.loading;
import activity.productDetails;
import java.awt.Dimension;
import java.awt.Image;
import java.util.HashMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import internalFrame.productCart;


public class ItemHolder extends javax.swing.JPanel {

    String product_id;
    ImageIcon proImage;
    String product_name;
    String product_price;
    public ItemHolder(ImageIcon image, String Product_name, String product_price, String product_id) {
        initComponents();
        setSize(295, 381);
        setPreferredSize(new Dimension(295, 381));
        setMinimumSize(new Dimension(295, 381));
        setMaximumSize(new Dimension(295,381));
      
        
        productImage.setIcon(image);
        pricetxt.setText(product_price+" ৳");
        productNametxt.setText(Product_name);
        this.product_id=product_id;
        this.proImage=image;
        this.product_name=Product_name;
        this.product_price=product_price;
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productNametxt = new javax.swing.JTextArea();
        pricetxt = new javax.swing.JLabel();
        buybutton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/samsung-galaxy.jpg"))); // NOI18N
        productImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        productImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productImage.setPreferredSize(new java.awt.Dimension(200, 250));
        productImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productImageMouseClicked(evt);
            }
        });
        add(productImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 295, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        productNametxt.setEditable(false);
        productNametxt.setBackground(new java.awt.Color(255, 255, 255));
        productNametxt.setColumns(20);
        productNametxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        productNametxt.setLineWrap(true);
        productNametxt.setRows(5);
        productNametxt.setText("Samsung Galaxy Tab A 8.0\" Snapdragon 429 2GB RAM 32GB ROM Android Tablet");
        productNametxt.setWrapStyleWord(true);
        productNametxt.setAutoscrolls(false);
        jScrollPane1.setViewportView(productNametxt);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 260, 290, 80));

        pricetxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pricetxt.setForeground(new java.awt.Color(255, 102, 51));
        pricetxt.setText("60,000 $");
        add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 140, -1));

        buybutton.setBackground(new java.awt.Color(0, 0, 204));
        buybutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buybutton.setForeground(new java.awt.Color(255, 255, 255));
        buybutton.setText("Add to Cart");
        buybutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buybuttonMouseClicked(evt);
            }
        });
        buybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buybuttonActionPerformed(evt);
            }
        });
        add(buybutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void buybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buybuttonActionPerformed
    
      
    }//GEN-LAST:event_buybuttonActionPerformed

    private void buybuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buybuttonMouseClicked
         productCart.hashMap =new HashMap<>();
         productCart.hashMap.put("product_id", product_id);
          productCart.hashMap.put("product_title", product_name);
           productCart.hashMap.put("product_price", product_price);
           productCart.cartList.add(productCart.hashMap);
           JOptionPane.showMessageDialog(null, "Product added to your cart");
    }//GEN-LAST:event_buybuttonMouseClicked

    private void productImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productImageMouseClicked
       
       productDetails pDetails=new productDetails(product_id);
       pDetails.setVisible(true);
    }//GEN-LAST:event_productImageMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buybutton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pricetxt;
    private javax.swing.JLabel productImage;
    private javax.swing.JTextArea productNametxt;
    // End of variables declaration//GEN-END:variables
}
