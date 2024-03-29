
package design;


public class cartItem extends javax.swing.JPanel {

    
    public cartItem(String productname, String productprice) {
        initComponents();
        
        product_name.setText(productname);
        product_price.setText("৳ "+productprice);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        product_name = new javax.swing.JTextArea();
        product_price = new javax.swing.JLabel();
        removebtn = new javax.swing.JLabel();
        addbtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        product_name.setEditable(false);
        product_name.setBackground(new java.awt.Color(255, 255, 255));
        product_name.setColumns(20);
        product_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        product_name.setLineWrap(true);
        product_name.setRows(2);
        product_name.setText("Xiaomi MI 4C R4CM 300 Mbps 4 Antenna Router (Global Version)Xiaomi MI 4C R4CM 300 Mbps 4 Antenna Router (Global Version)");
        product_name.setWrapStyleWord(true);
        product_name.setAutoscrolls(false);
        product_name.setBorder(null);
        jScrollPane1.setViewportView(product_name);

        product_price.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        product_price.setForeground(new java.awt.Color(204, 0, 51));
        product_price.setText("$500,00 taka");

        removebtn.setBackground(new java.awt.Color(204, 204, 204));
        removebtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        removebtn.setForeground(new java.awt.Color(153, 153, 153));
        removebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removebtn.setText("-");
        removebtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        removebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removebtn.setPreferredSize(new java.awt.Dimension(25, 25));

        addbtn.setBackground(new java.awt.Color(204, 204, 204));
        addbtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        addbtn.setForeground(new java.awt.Color(153, 153, 153));
        addbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addbtn.setText("+");
        addbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addbtn.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("1");
        jLabel3.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(product_price)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(removebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(product_price)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addbtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea product_name;
    private javax.swing.JLabel product_price;
    private javax.swing.JLabel removebtn;
    // End of variables declaration//GEN-END:variables
}
