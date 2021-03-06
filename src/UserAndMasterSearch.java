/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminaldatabase;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author dilawardhaliwal
 */
public class UserAndMasterSearch extends javax.swing.JFrame {

    /**
     * Creates new form UserAuthentication
     */
    public UserAndMasterSearch() {
        initComponents();
        nameSearch.setVisible(false);
        fatherNameSearch.setVisible(false);
        citySearch.setVisible(false);
        crimeTypeSearch.setVisible(false);
        crimeYearSearch.setVisible(false);
        nameSearchInput.setVisible(false);
        fathersNameSearchInput.setVisible(false);
        citySearchInput.setVisible(false);
        crimeTypeSearchInput.setVisible(false);
        crimeYearSearchInput.setVisible(false);
        nameStaticText.setVisible(false);
        fatherStaticText.setVisible(false);
        cityStaticText.setVisible(false);
        crimeTypeStaticText.setVisible(false);
        crimeYearStaticText.setVisible(false);
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameSearchInput = new javax.swing.JTextField();
        nameStaticText = new javax.swing.JLabel();
        searchCriminal = new javax.swing.JButton();
        backToAuthentication = new javax.swing.JButton();
        fatherStaticText = new javax.swing.JLabel();
        fathersNameSearchInput = new javax.swing.JTextField();
        cityStaticText = new javax.swing.JLabel();
        citySearchInput = new javax.swing.JTextField();
        crimeTypeStaticText = new javax.swing.JLabel();
        crimeTypeSearchInput = new javax.swing.JTextField();
        crimeYearStaticText = new javax.swing.JLabel();
        crimeYearSearchInput = new javax.swing.JTextField();
        searchByQuery = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        showAll = new javax.swing.JRadioButton();
        nameSearch = new javax.swing.JCheckBox();
        fatherNameSearch = new javax.swing.JCheckBox();
        citySearch = new javax.swing.JCheckBox();
        crimeTypeSearch = new javax.swing.JCheckBox();
        crimeYearSearch = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("PUNJAB CRIMINAL DATABASE");

        jLabel2.setText("Search By -");

        nameStaticText.setText("Name");

        searchCriminal.setText("SEARCH");
        searchCriminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCriminalActionPerformed(evt);
            }
        });

        backToAuthentication.setText("Back to Authentication Page");
        backToAuthentication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToAuthenticationActionPerformed(evt);
            }
        });

        fatherStaticText.setText("Father's Name");

        cityStaticText.setText("City");

        crimeTypeStaticText.setText("Crime Type");

        crimeYearStaticText.setText("Crime Year");

        buttonGroup1.add(searchByQuery);
        searchByQuery.setText("Queries");
        searchByQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByQueryActionPerformed(evt);
            }
        });

        jLabel3.setText("OR");

        buttonGroup1.add(showAll);
        showAll.setText("Show All");
        showAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllActionPerformed(evt);
            }
        });

        nameSearch.setText("Name");
        nameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSearchActionPerformed(evt);
            }
        });

        fatherNameSearch.setText("Father's Name");
        fatherNameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatherNameSearchActionPerformed(evt);
            }
        });

        citySearch.setText("City");
        citySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citySearchActionPerformed(evt);
            }
        });

        crimeTypeSearch.setText("Crime Type");
        crimeTypeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crimeTypeSearchActionPerformed(evt);
            }
        });

        crimeYearSearch.setText("Crime Year");
        crimeYearSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crimeYearSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchCriminal, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backToAuthentication, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fatherStaticText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(searchByQuery)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(showAll))
                                    .addComponent(nameSearch)
                                    .addComponent(fatherNameSearch)
                                    .addComponent(citySearch)
                                    .addComponent(crimeTypeSearch)
                                    .addComponent(crimeYearSearch)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fathersNameSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nameSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(citySearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(crimeTypeSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(crimeYearSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(crimeTypeStaticText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(crimeYearStaticText)
                                .addComponent(cityStaticText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(nameStaticText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchByQuery)
                    .addComponent(jLabel3)
                    .addComponent(showAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fatherNameSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(citySearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crimeTypeSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crimeYearSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameStaticText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fatherStaticText)
                    .addComponent(fathersNameSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityStaticText)
                    .addComponent(citySearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crimeTypeSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crimeTypeStaticText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crimeYearSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crimeYearStaticText))
                .addGap(18, 18, 18)
                .addComponent(searchCriminal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backToAuthentication, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backToAuthenticationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToAuthenticationActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AuthenticationPortal().setVisible(true);
    }//GEN-LAST:event_backToAuthenticationActionPerformed

    private void searchByQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByQueryActionPerformed
        // TODO add your handling code here:
        if(searchByQuery.isSelected())
        {
            nameSearch.setVisible(true);
            fatherNameSearch.setVisible(true);
            citySearch.setVisible(true);
            crimeTypeSearch.setVisible(true);
            crimeYearSearch.setVisible(true);
            this.pack();
        }
    }//GEN-LAST:event_searchByQueryActionPerformed

    private void showAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllActionPerformed
        // TODO add your handling code here:
        if(showAll.isSelected())
        {
            nameSearch.setVisible(false);
            fatherNameSearch.setVisible(false);
            citySearch.setVisible(false);
            crimeTypeSearch.setVisible(false);
            crimeYearSearch.setVisible(false);
            this.pack();
        }
    }//GEN-LAST:event_showAllActionPerformed

    private void nameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSearchActionPerformed
        // TODO add your handling code here:
        if(nameSearch.isSelected())
        {
            nameStaticText.setVisible(true);
            nameSearchInput.setVisible(true);
            this.pack();
        }
        else
        {
            nameStaticText.setVisible(false);
            nameSearchInput.setVisible(false);
            this.pack();
        }
    }//GEN-LAST:event_nameSearchActionPerformed

    private void fatherNameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatherNameSearchActionPerformed
        // TODO add your handling code here:
        if(fatherNameSearch.isSelected())
        {
            fatherStaticText.setVisible(true);
            fathersNameSearchInput.setVisible(true);
            this.pack();
        }
        else
        {
            fatherStaticText.setVisible(false);
            fathersNameSearchInput.setVisible(false);
            this.pack();
        }
    }//GEN-LAST:event_fatherNameSearchActionPerformed

    private void citySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citySearchActionPerformed
        // TODO add your handling code here:
        if(citySearch.isSelected())
        {
            cityStaticText.setVisible(true);
            citySearchInput.setVisible(true);
            this.pack();
        }
        else
        {
            cityStaticText.setVisible(false);
            citySearchInput.setVisible(false);
            this.pack();
        }
    }//GEN-LAST:event_citySearchActionPerformed

    private void crimeTypeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crimeTypeSearchActionPerformed
        // TODO add your handling code here:
        if(crimeTypeSearch.isSelected())
        {
            crimeTypeStaticText.setVisible(true);
            crimeTypeSearchInput.setVisible(true);
            this.pack();
        }
        else
        {
            crimeTypeStaticText.setVisible(false);
            crimeTypeSearchInput.setVisible(false);
            this.pack();
        }
    }//GEN-LAST:event_crimeTypeSearchActionPerformed

    private void crimeYearSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crimeYearSearchActionPerformed
        // TODO add your handling code here:
        if(crimeYearSearch.isSelected())
        {
            crimeYearStaticText.setVisible(true);
            crimeYearSearchInput.setVisible(true);
            this.pack();
        }
        else
        {
            crimeYearStaticText.setVisible(false);
            crimeYearSearchInput.setVisible(false);
            this.pack();
        }
    }//GEN-LAST:event_crimeYearSearchActionPerformed

    private void searchCriminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCriminalActionPerformed
        // TODO add your handling code here:
        ResultSet result;
        if(showAll.isSelected())
        {
            this.setVisible(false);
            SearchDisplay table= new SearchDisplay();
            table.setVisible(true);
            result=CriminalDatabase.showAllRecords();
            try
            {
                while(result.next())
                {
                    String name,fatherName,age,city,crimeType,crimeYear;
                    name=result.getString("Name");
                    fatherName=result.getString("Father_Name");
                    age=result.getString("Age");
                    city=result.getString("City");
                    crimeType=result.getString("Crime_Type");
                    crimeYear=result.getString("Crime_Year");
                    table.insertContent(name, fatherName, age, city, crimeType, crimeYear);
                }
            }
            catch(SQLException ex)
            {
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(rootPane, "Unable to display data");
            }
        }
        else if(searchByQuery.isSelected())
        {
            String name="",fatherName="",age="",city="",crimeType="",crimeYear="";
            if(nameSearch.isSelected())
            {
                name=nameSearchInput.getText();
            }
            if(fatherNameSearch.isSelected())
            {
                fatherName=fathersNameSearchInput.getText();
            }
            if(citySearch.isSelected())
            {
                city=citySearchInput.getText();
            }
            if(crimeTypeSearch.isSelected())
            {
                crimeType=crimeTypeSearchInput.getText();
            }
            if(crimeYearSearch.isSelected())
            {
                crimeYear=crimeYearSearchInput.getText();
            }
            try
            {
                result=CriminalDatabase.searchByQuery();
                while(result.next())
                {
                }
            }
            catch(SQLException ex)
            {
                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Please Select either Show all or Search by Query");
        }
    }//GEN-LAST:event_searchCriminalActionPerformed

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
            java.util.logging.Logger.getLogger(UserAndMasterSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAndMasterSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAndMasterSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAndMasterSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAndMasterSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToAuthentication;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox citySearch;
    private javax.swing.JTextField citySearchInput;
    private javax.swing.JLabel cityStaticText;
    private javax.swing.JCheckBox crimeTypeSearch;
    private javax.swing.JTextField crimeTypeSearchInput;
    private javax.swing.JLabel crimeTypeStaticText;
    private javax.swing.JCheckBox crimeYearSearch;
    private javax.swing.JTextField crimeYearSearchInput;
    private javax.swing.JLabel crimeYearStaticText;
    private javax.swing.JCheckBox fatherNameSearch;
    private javax.swing.JLabel fatherStaticText;
    private javax.swing.JTextField fathersNameSearchInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JCheckBox nameSearch;
    private javax.swing.JTextField nameSearchInput;
    private javax.swing.JLabel nameStaticText;
    private javax.swing.JRadioButton searchByQuery;
    private javax.swing.JButton searchCriminal;
    private javax.swing.JRadioButton showAll;
    // End of variables declaration//GEN-END:variables
}
