/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlines.reservation.system;

import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sudhakar
 */
public class Ticket extends javax.swing.JFrame {

    /**
     * Creates new form Seat
     */
    public Ticket() {
        initComponents();
      
        
    }
    String name,lastname,passnum,senum;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        p = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panum = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        snum = new javax.swing.JLabel();
        fl = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        fna = new javax.swing.JLabel();
        lana = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();
        nam = new javax.swing.JTextField();
        lsna = new javax.swing.JTextField();
        seat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        pnum = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("????????????????s");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(150, 10, 70, 20);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("????????????????");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 150, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/take-off (1).png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(380, 10, 70, 70);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("?????????.???????????A?????????????s.?????????");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(450, 60, 170, 15);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1000, 0, 64, 60);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question (1).png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15);
        jLabel15.setBounds(890, 10, 40, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1070, 90);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(490, 90, 10, 400);

        p.setBackground(new java.awt.Color(204, 204, 204));
        p.setBorder(new javax.swing.border.MatteBorder(null));
        p.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("DELHI");
        p.add(jLabel7);
        jLabel7.setBounds(450, 70, 80, 40);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("TO");
        p.add(jLabel6);
        jLabel6.setBounds(470, 40, 30, 20);

        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PASSPORT NUMBER:");
        p.add(jLabel5);
        jLabel5.setBounds(20, 250, 160, 30);

        jLabel13.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("FIRST NAME :");
        p.add(jLabel13);
        jLabel13.setBounds(20, 110, 130, 30);

        jLabel14.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("LAST NAME :");
        p.add(jLabel14);
        jLabel14.setBounds(20, 180, 130, 30);

        panum.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        panum.setForeground(new java.awt.Color(0, 0, 153));
        p.add(panum);
        panum.setBounds(70, 280, 210, 30);

        jLabel17.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("BOOKING SUMMARY");
        p.add(jLabel17);
        jLabel17.setBounds(10, 10, 320, 40);

        jLabel18.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 153));
        jLabel18.setText("BAN");
        p.add(jLabel18);
        jLabel18.setBounds(290, 70, 60, 40);

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("FROM");
        p.add(jLabel19);
        jLabel19.setBounds(300, 40, 40, 20);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("SEATS  :");
        p.add(jLabel20);
        jLabel20.setBounds(320, 210, 50, 20);

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("FLIGHT NO :");
        p.add(jLabel22);
        jLabel22.setBounds(300, 150, 60, 20);

        jPanel5.setBackground(new java.awt.Color(0, 0, 153));
        jPanel5.setForeground(new java.awt.Color(0, 0, 153));
        jPanel5.setLayout(null);

        snum.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        snum.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(snum);
        snum.setBounds(0, 0, 50, 40);

        p.add(jPanel5);
        jPanel5.setBounds(370, 200, 50, 40);

        fl.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        fl.setForeground(new java.awt.Color(0, 0, 153));
        fl.setText("B2546tTY");
        p.add(fl);
        fl.setBounds(370, 140, 80, 30);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/240_F_144828053_KteKilMW9RHFp5yvSxJr4vujMGa1EWFP (2).jpg"))); // NOI18N
        p.add(jLabel25);
        jLabel25.setBounds(290, 260, 231, 90);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/airliner (1).png"))); // NOI18N
        p.add(jLabel26);
        jLabel26.setBounds(380, 70, 40, 40);

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Please rember passport number no.flight concelled");
        p.add(jLabel27);
        jLabel27.setBounds(20, 50, 250, 20);

        fna.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        fna.setForeground(new java.awt.Color(0, 0, 153));
        p.add(fna);
        fna.setBounds(80, 140, 210, 30);

        lana.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lana.setForeground(new java.awt.Color(0, 0, 153));
        p.add(lana);
        lana.setBounds(70, 210, 210, 30);

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 153));
        p.add(jLabel31);
        jLabel31.setBounds(300, 220, 90, 20);

        jPanel1.add(p);
        p.setBounds(510, 100, 550, 360);

        t.setBackground(new java.awt.Color(255, 255, 255));
        t.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        t.setForeground(new java.awt.Color(0, 0, 153));
        t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Passport num", "Seat"
            }
        ));
        jScrollPane1.setViewportView(t);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 560, 550, 150);

        nam.setBackground(new java.awt.Color(255, 255, 255));
        nam.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(nam);
        nam.setBounds(90, 230, 230, 30);

        lsna.setBackground(new java.awt.Color(255, 255, 255));
        lsna.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(lsna);
        lsna.setBounds(90, 300, 230, 30);

        seat.setBackground(new java.awt.Color(255, 255, 255));
        seat.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(seat);
        seat.setBounds(400, 290, 50, 30);

        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PASSPORT NUMBER :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 350, 170, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ticket.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 430, 160, 60);

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("PASSENGER DETAILS");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 110, 320, 40);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Passenger Passport must equal goverment iussed ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 150, 260, 30);

        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("FIRST NAME :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 200, 130, 30);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(830, 470, 120, 70);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/booking.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(620, 470, 150, 70);

        jLabel21.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("SEAT NUM :");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(380, 250, 90, 30);

        pnum.setBackground(new java.awt.Color(255, 255, 255));
        pnum.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(pnum);
        pnum.setBounds(90, 380, 230, 30);

        jLabel23.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("LAST NAME :");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(20, 270, 130, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1063, 729));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      name=nam.getText();
      lastname=lsna.getText();
      passnum=pnum.getText();
      senum=seat.getText();
      
      fna.setText(name);
      lana.setText(lastname);
      panum.setText(passnum);
      snum.setText(senum);
      
      
      
      
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
        
        String details[]={nam.getText(),lsna.getText(),pnum.getText(),seat.getText()};
        DefaultTableModel dt=(DefaultTableModel)t.getModel();
        dt.addRow(details);
        
         nam.setText("");
      lsna.setText("");
      pnum.setText("");
      seat.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            try {
            Toolkit tkp = p.getToolkit();
    PrintJob pjp = tkp.getPrintJob(this, null, null);
    Graphics g = pjp.getGraphics();
    p.print(g);
    g.dispose();
    pjp.end();
    fna.setText("");
      lana.setText("");
      panum.setText("");
      snum.setText("");
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        // TODO add your handling code here:
        Instrucation i=new Instrucation();
        i.setVisible(true);
    }//GEN-LAST:event_jLabel15MousePressed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        Instrucation i=new Instrucation();
        i.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.nameg.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fl;
    private javax.swing.JLabel fna;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lana;
    private javax.swing.JTextField lsna;
    private javax.swing.JTextField nam;
    private javax.swing.JPanel p;
    private javax.swing.JLabel panum;
    private javax.swing.JTextField pnum;
    private javax.swing.JTextField seat;
    private javax.swing.JLabel snum;
    private javax.swing.JTable t;
    // End of variables declaration//GEN-END:variables

    private SimpleDateFormat SimpleDateFormat(String ddmmyyyy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
