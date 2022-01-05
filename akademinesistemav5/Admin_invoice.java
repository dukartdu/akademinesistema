
package akademinesistemav5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Admin_invoice extends javax.swing.JFrame {


    public Admin_invoice() {
        initComponents();
    }


    @SuppressWarnings("Pazymekite visus laukus")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bendrikas = new javax.swing.JTextField();
        bible = new javax.swing.JTextField();
        paskola = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        month = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        surname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Bendrabutis:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 220, 120, 16);

        jLabel3.setText("Bibliotekos skola:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 260, 120, 16);

        jLabel4.setText("Mokestis uz studijas:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 300, 120, 16);
        getContentPane().add(bendrikas);
        bendrikas.setBounds(130, 220, 139, 22);
        getContentPane().add(bible);
        bible.setBounds(130, 260, 139, 22);
        getContentPane().add(paskola);
        paskola.setBounds(130, 300, 139, 22);

        jButton1.setText("Generuoti");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 380, 110, 25);

        jScrollPane1.setViewportView(text);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(283, 0, 267, 464);

        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Grizti");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(126, 435, 40, 16);

        jLabel7.setText("men.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 150, 40, 16);
        getContentPane().add(month);
        month.setBounds(130, 150, 80, 22);

        jLabel8.setText("Studento ID:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 80, 70, 16);
        getContentPane().add(id);
        id.setBounds(130, 80, 139, 22);

        jLabel9.setText("Pavarde:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 110, 60, 16);
        getContentPane().add(surname);
        surname.setBounds(130, 110, 139, 22);

        jLabel10.setText("Iveskite suma:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(90, 190, 170, 16);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 255));
        jLabel11.setText("Sugeneruoti saskaita");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(29, 10, 220, 29);

        jLabel12.setText("Data:   2022 m.");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 150, 80, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        String dorm = bendrikas.getText();
        double a= Double.parseDouble(dorm);
        String paskol = paskola.getText();
        double l= Double.parseDouble(paskol);
        String  skolab= bible.getText();
        double s= Double.parseDouble(skolab);
        String mn= month.getText(); 
        
        double total= a+s+l;

        
        text.setText("\t Saskaita faktura \n\n ************************************"
                + "\n\n\tKolegijos pavadinimas\n\n  ************************************\n\n 2022 metu "+mn+" menesio saskaita \n\n\n"
                + "Bibliotekos skola: "+skolab+"\n Mokestis uz bendrabuti:  "+dorm+"\n Mokestis uz studijas "+paskol+
                "\nViso moketi: "+total+"\n\nMokejimo paskirtyje irasykite savo studento koda\n\n Banko saskaita LT670000000000000000 LUMINOR"
                + "\n Apmoketi per 3d.d. nuo saskaitos sugeneravimo ");
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","");
        String sql= "insert into feesubmit values(?,?,?,?,?,?)";
        PreparedStatement ptst = conn.prepareStatement(sql);
        
        ptst.setString(1,id.getText());
        ptst.setString(2,surname.getText());
        ptst.setString(3,mn);
        ptst.setDouble(4,a);
        ptst.setDouble(5,s);
        ptst.setDouble(6,l);
        ptst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saskaita sugeneruota sekmingai!");
            conn.close();
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        Admin__meniu obj=new Admin__meniu();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bendrikas;
    private javax.swing.JTextField bible;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField month;
    private javax.swing.JTextField paskola;
    private javax.swing.JTextField surname;
    private javax.swing.JTextPane text;
    // End of variables declaration//GEN-END:variables
}
