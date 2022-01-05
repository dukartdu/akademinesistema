
package akademinesistemav5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Admin_editstudent extends javax.swing.JFrame {


    public Admin_editstudent() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        vard = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pav = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ak = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        elpast = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        grupe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        add = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel7.setText("Grupe:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(156, 262, 80, 16);

        jLabel8.setText("Telefonas:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(156, 294, 80, 16);

        jLabel9.setText("Adresas:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(156, 334, 80, 16);

        jLabel11.setForeground(new java.awt.Color(0, 153, 255));
        jLabel11.setText("Grizti");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(270, 410, 50, 16);
        getContentPane().add(sid);
        sid.setBounds(239, 82, 166, 22);
        getContentPane().add(vard);
        vard.setBounds(239, 117, 166, 22);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Studento redagavimas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 230, 29);
        getContentPane().add(pav);
        pav.setBounds(239, 152, 166, 22);

        jLabel2.setText("ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(156, 85, 70, 16);
        getContentPane().add(ak);
        ak.setBounds(239, 187, 166, 22);

        jLabel3.setText("Vardas:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(156, 120, 70, 16);
        getContentPane().add(elpast);
        elpast.setBounds(241, 222, 166, 22);

        jLabel4.setText("Pavarde:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(156, 155, 80, 16);
        getContentPane().add(grupe);
        grupe.setBounds(241, 256, 166, 22);

        jLabel5.setText("A/K:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(156, 190, 70, 16);
        getContentPane().add(phone);
        phone.setBounds(240, 290, 166, 22);

        jLabel6.setText("El. pastas");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(156, 225, 80, 16);
        getContentPane().add(add);
        add.setBounds(240, 330, 166, 22);

        jButton1.setText("Redaguoti");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 370, 100, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

        Admin_generalstudent obj=new Admin_generalstudent();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        String id = sid.getText();
        String name= vard.getText();
        String pavarde= pav.getText();
        String cla=grupe.getText();
        String pnum=ak.getText();
        String email= elpast.getText();
        String address= add.getText();
        String rn= phone.getText();
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","");
        String sql = "update `stureg` SET `surname`='"+pavarde+"',`name`='"+name+"',`grupe`='"+cla+"',`asmkodas`='"+pnum+"'WHERE id = '"+id+"'";
        PreparedStatement ptst= conn.prepareStatement(sql);
        ptst.execute();
        
        JOptionPane.showMessageDialog(null, "Pakeitimas issaugotas sekmingai!");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }
               
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_editstudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JTextField ak;
    private javax.swing.JTextField elpast;
    private javax.swing.JTextField grupe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField pav;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField vard;
    // End of variables declaration//GEN-END:variables
}
