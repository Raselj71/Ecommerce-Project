
package activity;

import internalFrame.productmenu;
import design.Header;
import internalFrame.homescreen;
import java.awt.Color;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class MainActivity extends javax.swing.JFrame {

     String name;
     String phone;
     String gender;
     String email;
     
     private DrawerController drawer;
    
    public MainActivity(String name, String phone, String gender, String email) {
        this.name=name;
        this.phone=phone;
        this.gender=gender;
        this.email=email;
        initComponents();
        desktopmenuadd();
        nametxt.setText("Welcome "+name);
        
        drawer=Drawer.newDrawer(this)
                .header(new Header(name))
                .separator(2, new Color(90,90,90))
               .addChild(new DrawerItem("Account Informaton").icon(new ImageIcon(getClass().getResource("/photos/usermenu.png"))).build())
                .addFooter(new DrawerItem("Exit").icon(new ImageIcon(getClass().getResource("/photos/exitbutton.png"))).build())
               
                .event(new EventDrawer() {
                    @Override
                    public void selected(int index, DrawerItem item) {
                        if (index==0) {
                           productmenu product=new productmenu();
                           desktop.removeAll();
                           desktop.add(product);
                           product.setVisible(true);
                           
                        }
                        
                    }
                })
                .build();
        
    }

   

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationPanel = new javax.swing.JPanel();
        menubtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nametxt = new javax.swing.JLabel();
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

        getContentPane().add(navigationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 80));

        desktop.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1280, 650));

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
              MainActivity mainActivity=  new MainActivity("", "", "", "");
              mainActivity.setVisible(true);
              
            }
        });
    }

    void desktopmenuadd(){
        homescreen home=new homescreen();
        
        desktop.removeAll();
        desktop.add(home);
        home.setVisible(true);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel menubtn;
    private javax.swing.JLabel nametxt;
    private javax.swing.JPanel navigationPanel;
    // End of variables declaration//GEN-END:variables
}
