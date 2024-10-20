/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.medical;

import javax.swing.JOptionPane;

/**
 *
 * @author Siesta
 */
public class PatientForm extends javax.swing.JFrame {

    /**
     * Creates new form PatientForm
     */
    public PatientForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sex = new javax.swing.ButtonGroup();
        Insurance = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Btype = new javax.swing.JComboBox<>();
        insureyes = new javax.swing.JRadioButton();
        insureno = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Diagnosis = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Prescription = new javax.swing.JTextField();
        Menu = new javax.swing.JButton();
        Doctor = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        MRI = new javax.swing.JCheckBox();
        Blood = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PrescriptionCost = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patient Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(238, 238, 238))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Sex.add(Male);
        Male.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });

        Sex.add(Female);
        Female.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Sex: ");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("First name: ");

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Last name: ");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Age: ");

        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("Blood Type:");

        Btype.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Btype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "B+", "AB+", "A-", "B-", "AB-", "O+", "O-" }));
        Btype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtypeActionPerformed(evt);
            }
        });

        Insurance.add(insureyes);
        insureyes.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        insureyes.setText("Yes");
        insureyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insureyesActionPerformed(evt);
            }
        });

        Insurance.add(insureno);
        insureno.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        insureno.setText("No");
        insureno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insurenoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Insurance:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("Prescription:");

        Diagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagnosisActionPerformed(evt);
            }
        });

        Submit.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setText("Diagnosis:");

        Prescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrescriptionActionPerformed(evt);
            }
        });

        Menu.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        Doctor.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Doctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Cardiologist", "Neurologist", "Oncologist" }));
        Doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setText("Doctor");

        MRI.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        MRI.setText("MRI");
        MRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRIActionPerformed(evt);
            }
        });

        Blood.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Blood.setText("Blood");
        Blood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tests");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel12)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel13.setText("Prescription Cost:");

        PrescriptionCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrescriptionCostActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel14.setText("₱");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fname))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Male)
                                    .addGap(18, 18, 18)
                                    .addComponent(Female))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Diagnosis)
                                        .addComponent(Prescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(PrescriptionCost)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Age))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(Doctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(insureyes)
                                        .addGap(18, 18, 18)
                                        .addComponent(insureno))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(Btype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(MRI)
                                        .addGap(18, 18, 18)
                                        .addComponent(Blood)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Submit)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(59, 59, 59))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(Btype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Male)
                                    .addComponent(Female)
                                    .addComponent(jLabel2)
                                    .addComponent(insureyes)
                                    .addComponent(insureno)
                                    .addComponent(jLabel7))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MRI)
                            .addComponent(Blood))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Diagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Prescription, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(PrescriptionCost, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

    private void BtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtypeActionPerformed

    private void insureyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insureyesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insureyesActionPerformed

    private void insurenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insurenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insurenoActionPerformed

    private void DiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagnosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiagnosisActionPerformed

    private void PrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrescriptionActionPerformed

    protected static String nameToSend = ";"; // to identify name when writing to test result txt
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String fn = fname.getText();
        String ln = lname.getText();
        String age = Age.getText();
        String sex = "";
        String insurance = "";
        String blood = "";
        Staff doctor = null;
        String diagnosis = Diagnosis.getText();
        String prescription = Prescription.getText();
        String prescriptionCost = PrescriptionCost.getText();
        double bill = 0;

        StringBuilder errorMessages = new StringBuilder();
        
        // Error if empty Jtextfield
        if (fn.isEmpty()) {
            errorMessages.append("Please fill out your first name\n");
        } else if (!fn.matches("[a-zA-Z ]*")) {
            errorMessages.append("First name should only contain letters and spaces\n");
        }
        if (ln.isEmpty()) {
            errorMessages.append("Please fill out your last name\n");
        } else if (!ln.matches("[a-zA-Z ]*")) {
            errorMessages.append("Last name should only contain letters and spaces\n");
        }
        if (age.isEmpty()) {
        errorMessages.append("Please fill out your age\n");
        } else {
            try {
                int ageValue = Integer.parseInt(age);
                if (ageValue < 0 || ageValue > 120) {
                    errorMessages.append("Please enter a valid age (0-120)\n");
                }
            } catch (NumberFormatException e) {
                errorMessages.append("Age must be an integer\n");
            }
        }
        if (diagnosis.isEmpty()) {
            errorMessages.append("Please fill out the diagnosis\n");
        } else if (diagnosis.contains(";")) {
            errorMessages.append("Diagnosis should not end with a semicolon (;)\n");
        }
        if (prescription.isEmpty()) {
            errorMessages.append("Please fill out the prescription\n");
        } else if (prescription.contains(";")) {
            errorMessages.append("Prescription should not end with a semicolon (;)\n");
        }
        if (prescriptionCost.isEmpty()) {
            errorMessages.append("Please fill out the prescription\n");
        } else {
            try {
                Double.parseDouble(prescriptionCost);
            } catch (Exception e) {
                errorMessages.append("Please input a valid prescription cost input\n");
            }
        }

        // Radio Buttons
        if (Sex.getSelection() == null) {
            errorMessages.append("Please Select Your Sex\n");
        } else {
            if (Male.isSelected())          sex = "male".toUpperCase();
            else                            sex = "female".toUpperCase();
        }

        // Insurance Status
        if (Insurance.getSelection() == null) {
            errorMessages.append("Please Select Insurance Status\n");
        } else {
            if (insureyes.isSelected())     insurance = "true";
            else                            insurance = "false";
        }

        // Combo Box
        if (Btype.getSelectedItem() == null || Btype.getSelectedItem().equals("")) {
            errorMessages.append("Please Select Blood Type\n");
        } else {
            blood = Btype.getSelectedItem().toString();
        }
        
        if (Doctor.getSelectedItem() == null || Doctor.getSelectedItem().equals("")) {
            errorMessages.append("Please Select Your Doctor\n");
        } else {

            if(Doctor.getSelectedItem().toString().length() > 0){
                doctor = Reader.assignDoctor((Doctor.getSelectedItem().toString()));
            } else {
                errorMessages.append("Please choose a specialist\n");
            }
        }
        
        // Check if there are any error messages
        if (errorMessages.length() > 0) {
            JOptionPane.showMessageDialog(rootPane, errorMessages.toString(), "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            nameToSend = ln.toUpperCase() + "," + fn.toUpperCase();
            //        Checkbox
            if (Blood.isSelected()){
                BloodTestUI obj = new BloodTestUI();
                obj.setVisible(true);
                System.out.println("Bill" + bill);
                bill += 500;
                System.out.println("Bill" + bill);
            }

            if (MRI.isSelected()){
                MriUI obj = new MriUI();
                obj.setVisible(true);
                bill += 15000;
            }
            bill += doctor.getFee();
            System.out.println("Final bill: " + bill);
            String lineToWrite = ln.toUpperCase() + ";" + fn.toUpperCase() + ";" + age + ";" + blood + ";" + sex.toUpperCase() + ";" + insurance + ";" + doctor.getLastName() + "," + doctor.getFirstName() + ";" + diagnosis.toUpperCase() + ";" + prescription.toUpperCase() + ";" + prescriptionCost;
            
            System.out.println(lineToWrite);
            Reader.writeToPatients(lineToWrite);

//          Set to default after submitting
            fname.setText("");
            lname.setText("");
            Age.setText("");
            Sex.clearSelection();
            Insurance.clearSelection();
            Btype.setSelectedIndex(-1);
            Doctor.setSelectedIndex(-1);
            Blood.setSelected(false);
            MRI.setSelected(false);
            Diagnosis.setText("");
            Prescription.setText("");
            PrescriptionCost.setText("");
        }


        
    }//GEN-LAST:event_SubmitActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        MenuPage obj = new MenuPage();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuActionPerformed

    private void DoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorActionPerformed

    private void MRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MRIActionPerformed

    private void BloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodActionPerformed

    private void PrescriptionCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrescriptionCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrescriptionCostActionPerformed

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
            java.util.logging.Logger.getLogger(PatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JCheckBox Blood;
    private javax.swing.JComboBox<String> Btype;
    private javax.swing.JTextField Diagnosis;
    private javax.swing.JComboBox<String> Doctor;
    private javax.swing.JRadioButton Female;
    private javax.swing.ButtonGroup Insurance;
    private javax.swing.JCheckBox MRI;
    private javax.swing.JRadioButton Male;
    private javax.swing.JButton Menu;
    private javax.swing.JTextField Prescription;
    private javax.swing.JTextField PrescriptionCost;
    private javax.swing.ButtonGroup Sex;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField fname;
    private javax.swing.JRadioButton insureno;
    private javax.swing.JRadioButton insureyes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    // End of variables declaration//GEN-END:variables
}
