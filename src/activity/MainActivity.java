
package activity;

import internalFrame.account_information;
import design.Header;
import design.ItemHolder;

import internalFrame.homescreen;
import internalFrame.productCart;
import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;


public class MainActivity extends javax.swing.JFrame {

    public String name;
    public String phone;
    public String gender;
    public String email;
    public  String address;
     
     private DrawerController drawer;
    
    public MainActivity(String name, String phone, String gender, String email, String address) {
        this.name=name;
        this.phone=phone;
        this.gender=gender;
        this.email=email;
        this.address=address;
        initComponents();
        desktopmenuadd();
        nametxt.setText("Welcome "+name);
        
        drawer=Drawer.newDrawer(this)
                .header(new Header(name))
                .separator(2, new Color(90,90,90))
                .addChild(new DrawerItem("Product").icon(new ImageIcon(getClass().getResource("/photos/product.png"))).build())
               .addChild(new DrawerItem("Account Informaton").icon(new ImageIcon(getClass().getResource("/photos/usermenu.png"))).build())
                .addFooter(new DrawerItem("Exit").icon(new ImageIcon(getClass().getResource("/photos/exitbutton.png"))).build())
               
                .event(new EventDrawer() {
                    @Override
                    public void selected(int index, DrawerItem item) {
                        if (index==0) {
                            homescreen home = new homescreen();
                            desktop.removeAll();
                            desktop.add(home);
                            home.setVisible(true);
                        }else if(index==1){
                          account_information menu=new account_information(name,phone, email,gender,address);
                          desktop.removeAll();
                          desktop.add(menu);
                          menu.setVisible(true);
                        }else if(index==2){
                         dispose();
                        }
                        
                    }
                })
                .build();
        
        
         adddata();
        
    }

   

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationPanel = new javax.swing.JPanel();
        menubtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nametxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navigationPanel.setBackground(new java.awt.Color(25, 118, 221));
        navigationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menubtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/icons8-menu-50.png"))); // NOI18N
        menubtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menubtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menubtnMouseClicked(evt);
            }
        });
        navigationPanel.add(menubtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/maleusericon.png"))); // NOI18N
        navigationPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

        nametxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nametxt.setForeground(new java.awt.Color(255, 255, 255));
        nametxt.setText("jLabel2");
        navigationPanel.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 240, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/cart.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        navigationPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        getContentPane().add(navigationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 70));

        desktop.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1280, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menubtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubtnMouseClicked
        if (drawer.isShow()) {
            drawer.hide();   
        }else{
            drawer.show();
        }
    }//GEN-LAST:event_menubtnMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        productCart procart=new productCart();
        desktop.removeAll();
        desktop.add(procart);
        procart.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

   
    public static void main(String args[]) {
        
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              MainActivity mainActivity=  new MainActivity("", "", "", "", "");
              mainActivity.setVisible(true);
              
            }
        });
    }

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel menubtn;
    private javax.swing.JLabel nametxt;
    private javax.swing.JPanel navigationPanel;
    // End of variables declaration//GEN-END:variables

    private void desktopmenuadd() {
       homescreen home=new homescreen();
       desktop.removeAll();
       desktop.add(home);
       home.setVisible(true);
    }
    
    void adddata(){
        productCart.userinfo(name, phone, address);
    }
}
