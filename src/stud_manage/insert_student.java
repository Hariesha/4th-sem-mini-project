/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud_manage;

import static com.sun.xml.internal.bind.marshaller.Messages.format;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;
import javax.swing.*;
import java.sql.*;
import java.sql.ResultSet;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

/**
 *
 * @author lenovo
 */
public class insert_student extends javax.swing.JFrame {

    /**
     * Creates new form insert_student
     */
    public insert_student() { 
        ImageIcon img= new ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\stud_manage\\src\\img\\icon.jpg");
        setIconImage(img.getImage());
        initComponents();
        
          /*  String n=name.getText();
        String s=usn.getText();
        String d=dept.getText();
        String se=sem.getText();
        String a=age.getText();
        String g=gender.getSelectedItem().toString();
        String ad=address.getText();
        String p=phone.getText();
        String ee=email.getText();
        String t=type.getSelectedItem().toString();
        String f=fname.getText();
        String m=mname.getText();
        String pp=pphone.getText();
        String add=add_no.getText();
        String add1=add_date.getText();
        String c=cet_rank.getText();
        String dd=dob.getText();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
            if(n.length()==0 || s.length()==0 || d.length()==0 || se.length()==0 || a.length()==0 || g.length()==0 || ad.length()==0 || pp.length()==0 || ee.length()==0 || f.length()==0 || m.length()==0 || p.length()==0 || add.length()==0 || add1.length()==0 )
            {
                JOptionPane.showMessageDialog(null, "fields cannot be empty", "alert", JOptionPane.ERROR_MESSAGE);

            }

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select usn from stud_details where usn='"+s+"'");
            if(rs.next())
            {
                Pattern pusn= Pattern.compile("^(1vk)([\\w]+)$");
                Matcher musn= pusn.matcher(usn.getText());

                boolean valid=musn.matches();

                if(valid){

                    String query="update stud_details set name=?,dept=?,sem=?,age=?,gender=?,adress=?,phone=?,email=?,fname=?,mname=?,pphone=?,type=?,add_no=?,add_date=?,cet_rank=?,dob=? where usn='"+s+"'";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1,n);
                    pst.setString(2,d);
                    pst.setString(3,se);
                    pst.setString(4,a);
                    pst.setString(5,g);
                    pst.setString(6,ad);
                    pst.setString(7,p);
                    pst.setString(8,ee);
                    pst.setString(9,f);
                    pst.setString(10,m);
                    pst.setString(11,pp);
                    pst.setString(12,t);
                    pst.setString(13,add);
                    pst.setString(14,add1);
                    pst.setString(15,c);
                    pst.setString(16,dd);
                    pst.executeUpdate();
                    /*     stmt.executeUpdate("update stud_details set name='"+n+"'");
                    stmt.executeUpdate("update stud_details set dept='"+d+"'");
                    stmt.executeUpdate("update stud_details set sem='"+se+"'");
                    stmt.executeUpdate("update stud_details set age='"+a+"'");
                    stmt.executeUpdate("update stud_details set gender='"+g+"'");
                    stmt.executeUpdate("update stud_details set adress='"+ad+"'");
                    stmt.executeUpdate("update stud_details set phone='"+p+"'");
                    stmt.executeUpdate("update stud_details set email='"+ee+"'");
                    stmt.executeUpdate("update stud_details set fname='"+f+"'");
                    stmt.executeUpdate("update stud_details set mname='"+m+"'");
                    stmt.executeUpdate("update stud_details set pphone='"+pp+"'");
                    stmt.executeUpdate("update stud_details set type='"+t+"'");
                    stmt.executeUpdate("update stud_details set add_no='"+add+"'");
                    stmt.executeUpdate("update stud_details set add_date='"+add1+"'");
                    stmt.executeUpdate("update stud_details set cet_rank='"+c+"'");
                    stmt.executeUpdate("update stud_details set dob='"+dd+"'");
                    JOptionPane.showMessageDialog(null, "student details updated successfully","null",JOptionPane.INFORMATION_MESSAGE);

                }
                else
                {
                    JOptionPane.showMessageDialog(null,"usn should be in correct format","",JOptionPane.ERROR_MESSAGE);
                }

            }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }

        */

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        usn = new javax.swing.JTextField();
        dept = new javax.swing.JTextField();
        sem = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        pphone = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        add_no = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        add_date = new javax.swing.JTextField();
        cet_rank = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel6.setText("AGE :");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel7.setText("GENDER :");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel1.setText("DEPARTMENT :");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel2.setText("ADD STUDENT DETAILS");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel8.setText("ADDRESS:");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel3.setText("NAME :");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel9.setText("PHONE :");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel4.setText("USN :");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel10.setText("E-MAIL :");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel5.setText("SEM :");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        usn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usnActionPerformed(evt);
            }
        });

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel11.setText("M/F");

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jButton1.setText("ADD DETAILS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel12.setText("PARENTS DETAILS");

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel13.setText("FATHERS NAME :");

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel14.setText("MOTHERS NAME :");

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel15.setText("PARENT NUMBER :");

        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel16.setText("ADDMISSION DETAILS");

        jLabel17.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel17.setText("TYPE :");

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CET", "MANAGEMENT" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel18.setText("ADDMISSION NO :");

        jLabel19.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel19.setText("CET RANK :");

        jLabel20.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel20.setText("ADDMISSION DATE :");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jLabel21.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel21.setText("D.O.B :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usn, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addComponent(jLabel8)
                                .addComponent(jLabel21))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel11))
                                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel16))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jLabel12)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(add_no)
                                .addGap(163, 163, 163))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(mname)
                                    .addComponent(pphone))
                                .addGap(185, 185, 185))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(26, 26, 26)
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cet_rank, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(add_date))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(mname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pphone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(add_no, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(address)
                                .addGap(18, 18, 18)
                                .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add_date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cet_rank, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
 
    String n=name.getText();
    String s=usn.getText();
    String d=dept.getText();
    String se=sem.getText();
    String a=age.getText();
    String g=gender.getSelectedItem().toString();
    String ad=address.getText();
    String p=phone.getText();
    String ee=email.getText();
    String t=type.getSelectedItem().toString();
    String f=fname.getText();
    String m=mname.getText();
    String pp=pphone.getText();
    String add=add_no.getText();
    String add1=add_date.getText();
    String c=cet_rank.getText();
    String dd=dob.getText().trim(); 
    //String dd1=formatter.format(dd);
    //String dd2=formatter.format(add1);
    try{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
    if(n.length()==0 || s.length()==0 || d.length()==0 || se.length()==0 || a.length()==0 || g.length()==0 || ad.length()==0 || pp.length()==0 || ee.length()==0 || f.length()==0 || m.length()==0 || p.length()==0 || add.length()==0 || add1.length()==0 )
    { 
       JOptionPane.showMessageDialog(null, "fields cannot be empty", "alert", JOptionPane.ERROR_MESSAGE); 
     
    }    
   
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("select usn from stud_details where usn='"+s+"'");
    
    if(rs.next())  
     {
        JOptionPane.showMessageDialog(null, "usn already exists", "alert", JOptionPane.ERROR_MESSAGE);
       
     
     }
    else
    {   Pattern pusn= Pattern.compile("^(1vk)([\\w]+)$");
        Matcher musn= pusn.matcher(usn.getText());
        
        boolean valid=musn.matches();
        
      if(valid){
          //java.util.Date dob = format.parse(dd);
          //long time=dob.getTime();
          //java.sql.Date dob1 = new java.sql.Date(time);
          
          //java.util.Date adm = format.parse(add1);
          //long time1=adm.getTime();
          //java.sql.Date adm1 = new java.sql.Date(time1);
          
      int x = stmt.executeUpdate("insert into stud_details values('"+n+"','"+s+"','"+d+"','"+se+"','"+a+"','"+g+"','"+ad+"','"+p+"','"+ee+"','"+f+"','"+m+"','"+pp+"','"+t+"','"+add+"','"+add1+"','"+c+"','"+dd+"')");
      if(x>0)
      { JOptionPane.showMessageDialog(null, "student details added successfully","null",JOptionPane.INFORMATION_MESSAGE);   
      
      }}
      else
      {
          JOptionPane.showMessageDialog(null,"usn should be in correct format","",JOptionPane.ERROR_MESSAGE);
      }
      
      
    
    
    
    }
     
          
                 
    
    
    }
    catch(Exception e)
    {
         System.out.print(e);
    }   

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new mainpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void usnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usnActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

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
            java.util.logging.Logger.getLogger(insert_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert_student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add_date;
    private javax.swing.JTextField add_no;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField cet_rank;
    private javax.swing.JTextField dept;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField pphone;
    private javax.swing.JTextField sem;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField usn;
    // End of variables declaration//GEN-END:variables
}
