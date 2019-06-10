/*
 * The MIT License
 *
 * Copyright 2019 Brian & Willian.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.edu.qi.view;

import br.edu.qi.model.BurgerVO;
import br.edu.qi.services.BurgerServices;
import br.edu.qi.services.ServicesFactory;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Brian & Willian
 */
public class UINewBurger extends javax.swing.JInternalFrame {

    /**
     * Creates new form UINewBurger
     */
    public UINewBurger() {
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

        jlpData = new javax.swing.JLayeredPane();
        jlName = new javax.swing.JLabel();
        jlDescription = new javax.swing.JLabel();
        jlPrice = new javax.swing.JLabel();
        jtName = new javax.swing.JTextField();
        jtDescription = new javax.swing.JTextField();
        jtPrice = new javax.swing.JTextField();
        jlpAction = new javax.swing.JLayeredPane();
        jbAdd = new javax.swing.JButton();
        jbClear = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("New Burguer");

        jlpData.setBorder(new javax.swing.border.MatteBorder(null));

        jlName.setText("Name");

        jlDescription.setText("Description");

        jlPrice.setText("Price");

        jlpData.setLayer(jlName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jlDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jlPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jtName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jtDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpData.setLayer(jtPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDataLayout = new javax.swing.GroupLayout(jlpData);
        jlpData.setLayout(jlpDataLayout);
        jlpDataLayout.setHorizontalGroup(
            jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDataLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jlpDataLayout.createSequentialGroup()
                        .addComponent(jlPrice)
                        .addGap(18, 18, 18)
                        .addComponent(jtPrice))
                    .addGroup(jlpDataLayout.createSequentialGroup()
                        .addComponent(jlDescription)
                        .addGap(18, 18, 18)
                        .addComponent(jtDescription))
                    .addGroup(jlpDataLayout.createSequentialGroup()
                        .addComponent(jlName)
                        .addGap(18, 18, 18)
                        .addComponent(jtName, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jlpDataLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jlDescription, jlName, jlPrice});

        jlpDataLayout.setVerticalGroup(
            jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDataLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlName)
                    .addComponent(jtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDescription)
                    .addComponent(jtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jlpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrice)
                    .addComponent(jtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jlpDataLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jlDescription, jlName, jlPrice});

        jlpAction.setBorder(new javax.swing.border.MatteBorder(null));

        jbAdd.setText("Add");
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        jbClear.setText("Clear");
        jbClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearActionPerformed(evt);
            }
        });

        jbCancel.setText("Cancel");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        jlpAction.setLayer(jbAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAction.setLayer(jbClear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAction.setLayer(jbCancel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpActionLayout = new javax.swing.GroupLayout(jlpAction);
        jlpAction.setLayout(jlpActionLayout);
        jlpActionLayout.setHorizontalGroup(
            jlpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpActionLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbClear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlpActionLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbAdd, jbCancel, jbClear});

        jlpActionLayout.setVerticalGroup(
            jlpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpActionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jlpActionLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbAdd, jbCancel, jbClear});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlpData)
                    .addComponent(jlpAction))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlpAction)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void testTextField(JTextField textField, String message) {
        if (textField.getText().isEmpty()) {
            throw new NullPointerException(message);
        }
    }
    
    private void add() {
        try {
            testTextField(jtName, "Name text field is empty.");
            testTextField(jtDescription, "Description text field is empty.");
            testTextField(jtPrice, "Price text field is empty.");
            
            BurgerVO burgerVO = new BurgerVO(
                    jtName.getText(),
                    jtDescription.getText(),
                    Double.parseDouble(jtPrice.getText())
            );
            BurgerServices burgerServices = ServicesFactory.getBURGER_SERVICES();
            burgerServices.insertBurger(burgerVO);
            
            clear();
            
            JOptionPane.showMessageDialog(
                    this, 
                    "Burger has been added to the database.",
                    "Success!",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    private void clear() {
        jtName.setText(null);
        jtDescription.setText(null);
        jtPrice.setText(null);
    }
    
    private void cancel() {
        // to do this method
        this.dispose();
    }
    
    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        add();
    }//GEN-LAST:event_jbAddActionPerformed

    private void jbClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearActionPerformed
        clear();
    }//GEN-LAST:event_jbClearActionPerformed

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        cancel();
    }//GEN-LAST:event_jbCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbClear;
    private javax.swing.JLabel jlDescription;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlPrice;
    private javax.swing.JLayeredPane jlpAction;
    private javax.swing.JLayeredPane jlpData;
    private javax.swing.JTextField jtDescription;
    private javax.swing.JTextField jtName;
    private javax.swing.JTextField jtPrice;
    // End of variables declaration//GEN-END:variables
}
