
package adminInternalFrame;

import Database.dbModel;
import Database.dbcon;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.get;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class productList extends javax.swing.JInternalFrame {

  
    public productList() {
        initComponents();
        
        productTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        productTable.getTableHeader().setOpaque(false);
       // productTable.getTableHeader().setBackground(new Color(25,118,221));
       // productTable.getTableHeader().setForeground(new Color(255, 255, 255));
        setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI UI = (BasicInternalFrameUI) getUI();
        UI.setNorthPane(null);
        
        DefaultTableModel tblmodel=(DefaultTableModel) productTable.getModel();
        dbcon dcon=new dbcon();
        
        
        
        String selectQuery="SELECT * FROM `product`";
        try {
            java.sql.ResultSet rs = dcon.s.executeQuery(selectQuery);
            while (rs.next()) {
                Object[] rowdata = new Object[5];
                rowdata[0] = rs.getObject("id");
                rowdata[1] = rs.getObject("product_name");
                 rowdata[2] = rs.getObject("category");
                rowdata[3] = rs.getObject("price");
                 
                rowdata[4] = rs.getString("quantity");
                tblmodel.addRow(rowdata);
              

                // dbModel db=new dbModel(rs.getString("id"), rs.getString("product_name"), rs.getString("category"), rs.getString("price"), rs.getString("quantity"));
                // datalist.add(db);
            }
        } catch (SQLException ex) {
            Logger.getLogger(productList.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product List");

        productTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productTable.setGridColor(new java.awt.Color(255, 0, 0));
        productTable.setRowHeight(40);
        productTable.setRowMargin(10);
        productTable.setShowGrid(true);
        productTable.getTableHeader().setResizingAllowed(false);
        jScrollPane1.setViewportView(productTable);
        if (productTable.getColumnModel().getColumnCount() > 0) {
            productTable.getColumnModel().getColumn(0).setResizable(false);
            productTable.getColumnModel().getColumn(1).setResizable(false);
            productTable.getColumnModel().getColumn(2).setResizable(false);
            productTable.getColumnModel().getColumn(3).setResizable(false);
            productTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1084, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables
}
