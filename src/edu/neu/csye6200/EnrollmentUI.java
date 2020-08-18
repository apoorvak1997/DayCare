/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200;

import java.util.List;
import java.util.ListIterator;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class EnrollmentUI extends javax.swing.JFrame {
	
	StudentImmunizationPool studentImmunizationPool = new StudentImmunizationPool();
	DayCare dayCare;
	StudentEnroller studentEnroller;
	int IdCounter = 1;
	

    /**
     * Creates new form EnrollmentUI
     */
    public EnrollmentUI() {
        initComponents();
    }
    

    public EnrollmentUI(DayCare dayCare, StudentEnroller studentEnroller) {
    	setStudentEnroller(studentEnroller);
		setDayCare(dayCare);
		initComponents();
    }
    
    private void setDayCare(DayCare dayCare) {
    	this.dayCare = dayCare;
	}

	public void setStudentEnroller(StudentEnroller studentEnroller) {
    	this.studentEnroller = studentEnroller;
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
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        age = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        parentsName = new javax.swing.JTextField();
        csvFilePath = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        regDate = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        removeButtonVariable = new javax.swing.JButton();
        vaccineRules = new javax.swing.JButton();
        addButtonVariable = new javax.swing.JButton();
        renewVariable = new javax.swing.JButton();
        vaccinateMeVariable = new javax.swing.JButton();
        vaccinateAllVariable = new javax.swing.JButton();
        expiryAlertsVariable = new javax.swing.JButton();
        poolVariable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table1.setBackground(new java.awt.Color(204, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr No.", "Name", "Age", "Parent's Name", "Phone Number", "Address"
            }
        ));
        jScrollPane3.setViewportView(table1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        age.setBackground(new java.awt.Color(204, 204, 204));
        age.setText("Enter Age");
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        jLabel2.setText("Age  :");

        jLabel4.setText("Phone Number :");

        phoneNumber.setBackground(new java.awt.Color(204, 204, 204));
        phoneNumber.setText("Enter PhoneNumber");
        phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberActionPerformed(evt);
            }
        });

        jLabel5.setText("Address :");

        address.setBackground(new java.awt.Color(204, 204, 204));
        address.setText("Enter Address");

        jLabel1.setText("Name  :");

        name.setBackground(new java.awt.Color(204, 204, 204));
        name.setText("Enter Name");
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel3.setText("Parent's Name :");

        parentsName.setBackground(new java.awt.Color(204, 204, 204));
        parentsName.setText("Enter Parent's Name");

        csvFilePath.setBackground(new java.awt.Color(204, 204, 204));
        csvFilePath.setText("Add Students using CSV file");
        csvFilePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csvFilePathActionPerformed(evt);
            }
        });

        jLabel6.setText("Date :");

        regDate.setBackground(new java.awt.Color(204, 204, 204));
        regDate.setText("Enter Reg. Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parentsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(csvFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(parentsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(csvFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        removeButtonVariable.setText("Remove");
        removeButtonVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonVariableActionPerformed(evt);
            }
        });

        vaccineRules.setText("Vaccine  Rules");
        vaccineRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineRulesActionPerformed(evt);
            }
        });

        addButtonVariable.setText("ADD");
        addButtonVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonVariableActionPerformed(evt);
            }
        });

        renewVariable.setText("Renew");
        renewVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renewVariableActionPerformed(evt);
            }
        });

        vaccinateMeVariable.setText("Vaccinate Me");
        vaccinateMeVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccinateMeVariableActionPerformed(evt);
            }
        });

        vaccinateAllVariable.setText("Vaccinate All");
        vaccinateAllVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccinateAllVariableActionPerformed(evt);
            }
        });

        expiryAlertsVariable.setText("Expiry Alerts");
        expiryAlertsVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiryAlertsVariableActionPerformed(evt);
            }
        });

        poolVariable.setText("Student Pool");
        poolVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poolVariableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 77, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poolVariable, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(removeButtonVariable, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(renewVariable, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vaccineRules, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vaccinateMeVariable, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vaccinateAllVariable, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(expiryAlertsVariable, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addButtonVariable, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(addButtonVariable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeButtonVariable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(renewVariable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(poolVariable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vaccinateMeVariable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vaccinateAllVariable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expiryAlertsVariable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vaccineRules)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int i=1;

    private void addButtonVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-EnrollmentUI:event_addButtonVariableActionPerformed
		if(!"Enter Name".equals(name.getText())  && !"Enter Age".equals(age.getText())){
		        DefaultTableModel model=(DefaultTableModel)table1.getModel();
		        model.addRow(new Object[]{i,name.getText(),age.getText(),parentsName.getText(),phoneNumber.getText(),address.getText()});
		        String studentString = this.IdCounter+","+name.getText()+","+age.getText()+","+parentsName.getText()+","+address.getText()+","+phoneNumber.getText();
		        Student student = new Student(this.IdCounter,name.getText(),Integer.parseInt(age.getText()), parentsName.getText(),address.getText(),phoneNumber.getText());
		        this.studentEnroller.EnrollStudent(studentString);
		        this.studentImmunizationPool.addStudentImm(new StudentImmunization(student, null, "lab report"));
		        this.IdCounter++;
		        i++;
		}
		else if("Enter Name".equals(name.getText()) && "Enter Age".equals(age.getText())){
		      JOptionPane.showMessageDialog(null, "Enter Valid Name as well as Age");
		}
		else if("Enter Name".equals(name.getText())){
		     JOptionPane.showMessageDialog(null, "Enter Valid Name");
		}
		else if("Enter Age".equals(age.getText())){
		    JOptionPane.showMessageDialog(null, "Enter Valid Age");
}

    }//GEN-LAST:event_addButtonVariableActionPerformed

    private void removeButtonVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-EnrollmentUI:event_removeButtonVariableActionPerformed
       if(table1.getSelectedRow() != -1) {
              // remove selected row from the model
              DefaultTableModel model=(DefaultTableModel)table1.getModel();
               model.removeRow(table1.getSelectedRow());
               JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
               i--;
    }//GEN-LAST:event_removeButtonVariableActionPerformed
    }
    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-EnrollmentUI:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-EnrollmentUI:event_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberActionPerformed

    private void vaccineRulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-EnrollmentUI:event_vaccineRulesActionPerformed
//      int column = 1;
//    int row = table1.getSelectedRow();
//    String value = table1.getModel().getValueAt(row, column).toString();
//    System.out.println(value);
        RuleTable.demo();
    }//GEN-LAST:event_vaccineRulesActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-EnrollmentUI:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void csvFilePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-EnrollmentUI:event_csvFilePathActionPerformed
    }//GEN-LAST:event_csvFilePathActionPerformed

    private void renewVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-EnrollmentUI:event_renewVariableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_renewVariableActionPerformed

    private void vaccinateMeVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-EnrollmentUI:event_vaccinateMeVariableActionPerformed
    	this.studentImmunizationPool.vaccinateMe(name.getText());
    }//GEN-LAST:event_vaccinateMeVariableActionPerformed

    private void vaccinateAllVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-EnrollmentUI:event_vaccinateAllVariableActionPerformed
        // TODO add your handling code here:
    	//get student list
    	this.studentImmunizationPool.vaccinateAll();
    	
    }//GEN-LAST:event_vaccinateAllVariableActionPerformed

    private void expiryAlertsVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-EnrollmentUI:event_expiryAlertsVariableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expiryAlertsVariableActionPerformed

    private void poolVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-EnrollmentUI:event_poolVariableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poolVariableActionPerformed

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
            java.util.logging.Logger.getLogger(EnrollmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnrollmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnrollmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnrollmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnrollmentUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButtonVariable;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField csvFilePath;
    private javax.swing.JButton expiryAlertsVariable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField parentsName;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JButton poolVariable;
    private javax.swing.JTextField regDate;
    private javax.swing.JButton removeButtonVariable;
    private javax.swing.JButton renewVariable;
    private javax.swing.JTable table1;
    private javax.swing.JButton vaccinateAllVariable;
    private javax.swing.JButton vaccinateMeVariable;
    private javax.swing.JButton vaccineRules;
    // End of variables declaration//GEN-END:variables
}