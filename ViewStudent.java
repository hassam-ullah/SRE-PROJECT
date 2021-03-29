

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAC
 */
public class ViewStudent extends javax.swing.JFrame {

    /**
     * Creates new form ViewStudent
     */
    public ViewStudent() {
        initComponents();
    }

    public ViewStudent(Student s)
    {
        initComponents();
     System.out.println("VIEW STUDENT");
     name.setText(s.getName());
     regno.setText(s.getRegNo());
     semester.setText(Integer.toString(s.getSemester()));
     cgpa.setText(Double.toString(s.getCgpa()));
     batch.setText(s.getBatch());
     gender.setText(s.getGender());
     phone.setText(s.getPhone());
     cnic.setText(s.getCnic());
     email.setText(s.getEmail());
     address.setText(s.getCurrentAddress());
     age.setText(Integer.toString(s.getAge()));
     dob.setText(s.getDob());
     guardian.setText(s.getGuardian());
     gc.setText(s.getGuardianContact());
     dept.setText(s.getDepartment());
     dp.setText(s.getDegreeProgram());
     ch.setText(Integer.toString(s.getCreditHours()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        semester = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        cgpa = new javax.swing.JLabel();
        batch = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        cnic = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        dp = new javax.swing.JLabel();
        regno = new javax.swing.JLabel();
        gc = new javax.swing.JLabel();
        dept = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        ch = new javax.swing.JLabel();
        guardian = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Detail");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 25, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Close");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 753, 562, 47));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel7.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 91, 562, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 136, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registration#");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 173, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Semester");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CGPA");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 247, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Batch");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 284, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 358, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CNIC");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 401, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 438, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Age");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 512, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Guardian");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 580, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Date of Birth");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 543, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Guardian Contact");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 617, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Department");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 648, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Degree Program");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 685, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Credit Hours");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 722, -1, -1));

        semester.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        semester.setForeground(new java.awt.Color(255, 255, 255));
        semester.setText("Name");
        jPanel7.add(semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name");
        jPanel7.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        cgpa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cgpa.setForeground(new java.awt.Color(255, 255, 255));
        cgpa.setText("Name");
        jPanel7.add(cgpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        batch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        batch.setForeground(new java.awt.Color(255, 255, 255));
        batch.setText("Name");
        jPanel7.add(batch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        gender.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setText("Name");
        jPanel7.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        phone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.setText("Name");
        jPanel7.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        cnic.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cnic.setForeground(new java.awt.Color(255, 255, 255));
        cnic.setText("Name");
        jPanel7.add(cnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Name");
        jPanel7.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        address.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setText("Name");
        jPanel7.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        age.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));
        age.setText("Name");
        jPanel7.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        dp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dp.setForeground(new java.awt.Color(255, 255, 255));
        dp.setText("Name");
        jPanel7.add(dp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, -1, -1));

        regno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        regno.setForeground(new java.awt.Color(255, 255, 255));
        regno.setText("Name");
        jPanel7.add(regno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        gc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gc.setForeground(new java.awt.Color(255, 255, 255));
        gc.setText("Name");
        jPanel7.add(gc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, -1, -1));

        dept.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dept.setForeground(new java.awt.Color(255, 255, 255));
        dept.setText("Name");
        jPanel7.add(dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, -1, -1));

        dob.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dob.setForeground(new java.awt.Color(255, 255, 255));
        dob.setText("Name");
        jPanel7.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, -1, -1));

        ch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ch.setForeground(new java.awt.Color(255, 255, 255));
        ch.setText("Name");
        jPanel7.add(ch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 720, -1, -1));

        guardian.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        guardian.setForeground(new java.awt.Color(255, 255, 255));
        guardian.setText("Name");
        jPanel7.add(guardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 580, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel age;
    private javax.swing.JLabel batch;
    private javax.swing.JLabel cgpa;
    private javax.swing.JLabel ch;
    private javax.swing.JLabel cnic;
    private javax.swing.JLabel dept;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel dp;
    private javax.swing.JLabel email;
    private javax.swing.JLabel gc;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel guardian;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel regno;
    private javax.swing.JLabel semester;
    // End of variables declaration//GEN-END:variables
}
