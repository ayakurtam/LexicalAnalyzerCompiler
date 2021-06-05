package LexicalAnalyzerCompiler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class StartFrame extends javax.swing.JFrame {
    Set <String> s =new TreeSet<String>();
    LexerClass lex = new LexerClass();
    ArrayList<Token> List = new ArrayList<>();
    public StartFrame() {
        initComponents();
        s.add("Divisio");
        s.add("InferedFrom");
        s.add("Else");
        s.add("Ire");
        s.add("Sire");
        s.add("Clo");
        s.add("SetOfClo");
        s.add("SFBU");
        s.add("NoneValue");
        s.add("TerminateThisNow");
        s.add("RingWhen");
        s.add("BackedValue");
        s.add("STT");
        s.add("Check");
        s.add("CaseOf");
        s.add("Beginning");
        s.add("End");
        s.add("Using");
        s.add("&&");
        s.add("||");
        s.add("==");
        s.add("!=");
        s.add(">=");
        s.add("<=");
        s.add("/#");
        s.add("#/");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButtonBrowse = new javax.swing.JButton();
        jButtonCompile = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea.setColumns(20);
        jTextArea.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextArea.setRows(5);
        jTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jButtonBrowse.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jButtonBrowse.setForeground(new java.awt.Color(0, 153, 153));
        jButtonBrowse.setText("BROWSE");
        jButtonBrowse.setPreferredSize(new java.awt.Dimension(72, 42));
        jButtonBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrowseActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBrowse);

        jButtonCompile.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jButtonCompile.setForeground(new java.awt.Color(0, 153, 153));
        jButtonCompile.setText("COMPILE");
        jButtonCompile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompileActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCompile);

        jButtonExit.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(0, 153, 153));
        jButtonExit.setText("EXIT");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExit);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 155, 155));
        jLabel2.setText("Enter your code or choose file:");
        jPanel2.add(jLabel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrowseActionPerformed
        // TODO add your handling code here:
            try{
                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);
                File file = chooser.getSelectedFile();
                if (file.length() != 0){
                    //LexicalAnalyzer.printTableNames();
                    FileManager.Location = file.toString();
                    FileManager.runProgram();
                }else{
                    JOptionPane.showMessageDialog(this, "Please choose valid file!");
                }
                
            }catch (Exception ex){
                System.out.print("");
            }
            dispose();
    }//GEN-LAST:event_jButtonBrowseActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonCompileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompileActionPerformed
        // TODO add your handling code here:
        String holder = jTextArea.getText();
        if (holder.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter your code!");
        }else{
            FileWriter file = null;    
            try {
                file = new FileWriter("externalInput.txt");
                file.write(holder);  
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(StartFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            FileManager.Location = "externalInput.txt";
            FileManager.runProgram();
            dispose();
        }
    }//GEN-LAST:event_jButtonCompileActionPerformed

    private void jTextAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getKeyCode()==KeyEvent.VK_DELETE||evt.getKeyCode()==KeyEvent.VK_SHIFT||evt.getKeyCode()==KeyEvent.VK_CAPS_LOCK)
        {
           
        }
        else
        {   
            String to_check = jTextArea.getText();
            int to_check_len = to_check.length();
            for(String data:s)
            {
                String check_from_data="";
                for(int i=0;i<to_check_len;i++)
                {
                    if(to_check_len<=data.length())
                    {
                        check_from_data = check_from_data+data.charAt(i);
                    }
                }
                if(check_from_data.equals(to_check))
                {
                    jTextArea.setText(data);
                    jTextArea.setSelectionStart(to_check_len);
                    jTextArea.setSelectionEnd(data.length());
                    break;
                }
            }
        }
    }//GEN-LAST:event_jTextAreaKeyReleased

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
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new StartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBrowse;
    private javax.swing.JButton jButtonCompile;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea;
    // End of variables declaration//GEN-END:variables
}
