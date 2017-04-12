/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kunall17.textbuilder;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javax.swing.JOptionPane.showMessageDialog;

public class GenerateTextForm extends javax.swing.JFrame {

    BuilderTableModel tm;
    int numberOfPlaceHolders = -1;
    String text;
    GenerateTextInterface generateTextInterface;

    public void setGenerateTextInterface(GenerateTextInterface generateTextInterface) {
        this.generateTextInterface = generateTextInterface;
    }

    /**
     * Creates new form GenerateTextForm
     */
    public GenerateTextForm(int numberOfPlaceHolders, String text) {
        initComponents();
        this.text = text;
        this.numberOfPlaceHolders = numberOfPlaceHolders;
        tm = new BuilderTableModel(numberOfPlaceHolders);
        jTable1.setModel(tm);

//        setupMenuBar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("Fill with");
        jMenu1.add(jSeparator1);

        jMenu4.setText("Add rows");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu4);

        jMenuItem1.setText("Add file list");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenu5.setText("Add full path list");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu5);

        jMenu6.setText("Generate Numbers");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu6);

        jMenu7.setText("Generate alphabets");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu7);

        jMenu8.setText("Clear tables");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Generate");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        System.out.println("ASASDASD");
        String t1 = text;

        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < tm.getRowCount(); i++) {

            for (int j = 0; j < numberOfPlaceHolders; j++) {
                text = text.replace(Constants.PLACEHOLDER_TEXT + j, tm.getValueAt(i, j).toString());
            }
            finalString.append(text + "\n");
            text = t1;
        }


        if (generateTextInterface != null) { //Check if started from plugin
            generateTextInterface.replaceText(finalString.toString());
            return;
        }

        JFileChooser jfc = new JFileChooser();
        int result = jfc.showSaveDialog(this);
        if (result == JFileChooser.CANCEL_OPTION) {
            return;
        }
        if (result == JFileChooser.APPROVE_OPTION) {

            try {

                Files.write(Paths.get(jfc.getSelectedFile().getPath()),
                        finalString.toString().getBytes(), StandardOpenOption.CREATE);
                JOptionPane.showMessageDialog(rootPane, jfc.getSelectedFile().getName().toString() + " saved successfully");
            } catch (IOException ex) {
                Logger.getLogger(GenerateTextForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        boolean w = false;
        HelpForm hf = new HelpForm(w);
        hf.show();
        hf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        System.out.println("asdasd");
        Object result = JOptionPane.showInputDialog(this, "Enter Number of Rows to be added?");
        try {
            int no = Integer.parseInt(result.toString());
            for (int i = 0; i < no; i++) {
                tm.addRow();
            }
        } catch (Exception e1) {
            showMessageDialog(this, e1.toString());
        }

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        Object result = JOptionPane.showInputDialog(this, "Enter Number of Rows to be added?");
        try {
            int no = Integer.parseInt(result.toString());
            for (int i = 0; i < no; i++) {
                tm.addRow();
            }
        } catch (Exception e1) {
            showMessageDialog(this, e1.toString());
        }
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

        if (jTable1.getSelectedColumnCount() == 0) {
            showMessageDialog(null, "No selected Column");

        } else {

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            fileChooser.setMultiSelectionEnabled(true);
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File[] selectedFile = fileChooser.getSelectedFiles();
                if (selectedFile.length == 1) {
                    tm.setValueAt(selectedFile[0].getAbsoluteFile().toString(), jTable1.getSelectedRow(), jTable1.getSelectedColumn());
                } else {

                    for (int i = 0; i < selectedFile.length; i++) {
                        if (jTable1.getSelectedRow() + i >= jTable1.getRowCount()) {
                            tm.addRow();
                        }
                        tm.setValueAt(selectedFile[i].getAbsoluteFile(), jTable1.getSelectedRow() + i, jTable1.getSelectedColumn());
                    }

                }

            }

        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:

        if (jTable1.getSelectedColumnCount() == 0) {
            showMessageDialog(null, "No selected Column");

        } else {

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            fileChooser.setMultiSelectionEnabled(true);
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File[] selectedFile = fileChooser.getSelectedFiles();
                if (selectedFile.length == 1) {
                    tm.setValueAt(selectedFile[0].getAbsolutePath().toString(), jTable1.getSelectedRow(), jTable1.getSelectedColumn());
                } else {

                    for (int i = 0; i < selectedFile.length; i++) {
                        if (jTable1.getSelectedRow() + i >= jTable1.getRowCount()) {
                            tm.addRow();
                        }
                        tm.setValueAt(selectedFile[i].getAbsolutePath(), jTable1.getSelectedRow() + i, jTable1.getSelectedColumn());
                    }

                }

            }

        }
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        if (jTable1.getSelectedColumnCount() == 0) {
            showMessageDialog(null, "No selected Column");

        } else {
            Object result = JOptionPane.showInputDialog(null, "Enter Numbers seperated by - (Eg. 4-11)");
            String[] sd = String.valueOf(result).split("-");
            int n1 = Integer.parseInt(sd[0]);
            int n2 = Integer.parseInt(sd[1]);

            for (int i = 0; i <= n2 - n1; i++) {
                if (jTable1.getSelectedRow() + i >= jTable1.getRowCount()) {
                    tm.addRow();
                }
                for (int j = 0; j < jTable1.getSelectedColumnCount(); j++) {

                    tm.setValueAt(n1 + i, jTable1.getSelectedRow() + i, jTable1.getSelectedColumn() + j);
                }
            }
        }
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        if (jTable1.getSelectedColumnCount() == 0) {
            showMessageDialog(null, "No selected Column");

        } else {
            String s = (String) JOptionPane.showInputDialog(this,
                    "Enter the alphabets (Same case alphabets) Eg. A-Z",
                    "Alphabets", JOptionPane.OK_CANCEL_OPTION, null,
                    null, "A-Z");

            String[] d = s.split("-");
            char c1 = d[0].charAt(0);
            char c2 = d[1].charAt(0);

            int i = 0;
            do {
                if (jTable1.getSelectedRow() + i >= jTable1.getRowCount()) {
                    tm.addRow();
                }
                for (int j = 0; j < jTable1.getSelectedColumnCount(); j++) {
                    tm.setValueAt(c1, jTable1.getSelectedRow() + i, jTable1.getSelectedColumn() + j);
                }

                c1 = ((char) (getInt(c1) + 1));
                if (i++ > 55) {
                    break;
                }
            } while (c1 != c2);

            if (jTable1.getSelectedRow() + i >= jTable1.getRowCount()) {
                tm.addRow();
            }
            for (int j = 0; j < jTable1.getSelectedColumnCount(); j++) {
                tm.setValueAt(c1, jTable1.getSelectedRow() + i, jTable1.getSelectedColumn() + j);
            }
        }

    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
        // TODO add your handling code here:
        tm.clearAll();
    }//GEN-LAST:event_jMenu8ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked

        // TODO add your handling code here:
        if (jTable1.getSelectedColumnCount() == 0) {
            showMessageDialog(null, "No selected Column");

        } else {

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            fileChooser.setMultiSelectionEnabled(true);
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File[] selectedFile = fileChooser.getSelectedFiles();
                if (selectedFile.length == 1) {
                    tm.setValueAt(selectedFile[0].getAbsolutePath().toString(), jTable1.getSelectedRow(), jTable1.getSelectedColumn());
                } else {

                    for (int i = 0; i < selectedFile.length; i++) {
                        if (jTable1.getSelectedRow() + i >= jTable1.getRowCount()) {
                            tm.addRow();
                        }
                        tm.setValueAt(selectedFile[i].getAbsolutePath(), jTable1.getSelectedRow() + i, jTable1.getSelectedColumn());
                    }

                }

            }

        }
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        if (jTable1.getSelectedColumnCount() == 0) {
            showMessageDialog(null, "No selected Column");

        } else {
            Object result = JOptionPane.showInputDialog(null, "Enter Numbers seperated by - (Eg. 4-11)");
            String[] sd = String.valueOf(result).split("-");
            int n1 = Integer.parseInt(sd[0]);
            int n2 = Integer.parseInt(sd[1]);

            for (int i = 0; i <= n2 - n1; i++) {
                if (jTable1.getSelectedRow() + i >= jTable1.getRowCount()) {
                    tm.addRow();
                }
                for (int j = 0; j < jTable1.getSelectedColumnCount(); j++) {

                    tm.setValueAt(n1 + i, jTable1.getSelectedRow() + i, jTable1.getSelectedColumn() + j);
                }
            }
        }
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        if (jTable1.getSelectedColumnCount() == 0) {
            showMessageDialog(null, "No selected Column");

        } else {
            String s = (String) JOptionPane.showInputDialog(this,
                    "Enter the alphabets (Same case alphabets) Eg. A-Z",
                    "Alphabets", JOptionPane.OK_CANCEL_OPTION, null,
                    null, "A-Z");

            String[] d = s.split("-");
            char c1 = d[0].charAt(0);
            char c2 = d[1].charAt(0);

            int i = 0;
            do {
                if (jTable1.getSelectedRow() + i >= jTable1.getRowCount()) {
                    tm.addRow();
                }
                for (int j = 0; j < jTable1.getSelectedColumnCount(); j++) {
                    tm.setValueAt(c1, jTable1.getSelectedRow() + i, jTable1.getSelectedColumn() + j);
                }

                c1 = ((char) (getInt(c1) + 1));
                if (i++ > 55) {
                    break;
                }
            } while (c1 != c2);

            if (jTable1.getSelectedRow() + i >= jTable1.getRowCount()) {
                tm.addRow();
            }
            for (int j = 0; j < jTable1.getSelectedColumnCount(); j++) {
                tm.setValueAt(c1, jTable1.getSelectedRow() + i, jTable1.getSelectedColumn() + j);
            }
        }
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        // TODO add your handling code here:
        tm.clearAll();
    }//GEN-LAST:event_jMenu8MouseClicked

    public int getInt(char c) {
        return (int) c;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
