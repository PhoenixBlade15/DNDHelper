package dnd_helper_project_netbeans;

import javax.swing.JOptionPane;



public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(0, 13, 56));
        MoneySplitterPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MoneySplitterPanel = new javax.swing.JPanel();
        PlayerAmountLabel = new javax.swing.JLabel();
        PlayerAmountUser = new javax.swing.JTextField();
        PlatAmountLabel = new javax.swing.JLabel();
        GoldAmountLabel = new javax.swing.JLabel();
        SilverAmountLabel = new javax.swing.JLabel();
        CopperAmountLabel = new javax.swing.JLabel();
        PlatinumAmountUser = new javax.swing.JTextField();
        GoldAmountUser = new javax.swing.JTextField();
        SilverAmountUser = new javax.swing.JTextField();
        CopperAmountUser = new javax.swing.JTextField();
        PlatinumPayoutLabel = new javax.swing.JLabel();
        GoldPayoutLabel = new javax.swing.JLabel();
        SilverPayoutLabel = new javax.swing.JLabel();
        CopperPayoutLabel = new javax.swing.JLabel();
        PlatinumPayoutText = new javax.swing.JLabel();
        GoldPayoutText = new javax.swing.JLabel();
        SilverPayoutText = new javax.swing.JLabel();
        CopperPayoutText = new javax.swing.JLabel();
        PlatinumLeftoverLabel = new javax.swing.JLabel();
        GoldLeftoverLabel = new javax.swing.JLabel();
        SilverLeftoverLabel = new javax.swing.JLabel();
        CopperLeftoverLabel = new javax.swing.JLabel();
        PlatinumLeftoverText = new javax.swing.JLabel();
        GoldLeftoverText = new javax.swing.JLabel();
        SilverLeftoverText = new javax.swing.JLabel();
        CopperLeftoverText = new javax.swing.JLabel();
        SplitMoneyButton = new javax.swing.JButton();
        MoneySplitterButton = new javax.swing.JButton();
        QuitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));

        MoneySplitterPanel.setBackground(new java.awt.Color(15, 33, 94));
        MoneySplitterPanel.setName(""); // NOI18N

        PlayerAmountLabel.setBackground(new java.awt.Color(255, 255, 255));
        PlayerAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        PlayerAmountLabel.setText("Player Amount:");

        PlatAmountLabel.setBackground(new java.awt.Color(255, 255, 255));
        PlatAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        PlatAmountLabel.setText("Platinum Amount:");

        GoldAmountLabel.setBackground(new java.awt.Color(255, 255, 255));
        GoldAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        GoldAmountLabel.setText("Gold Amount:");

        SilverAmountLabel.setBackground(new java.awt.Color(255, 255, 255));
        SilverAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        SilverAmountLabel.setText("Silver Amount:");

        CopperAmountLabel.setBackground(new java.awt.Color(255, 255, 255));
        CopperAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        CopperAmountLabel.setText("Copper Amount:");

        PlatinumPayoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        PlatinumPayoutLabel.setText("Platinum per character:");

        GoldPayoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        GoldPayoutLabel.setText("Gold per character:");

        SilverPayoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        SilverPayoutLabel.setText("Silver per character:");

        CopperPayoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        CopperPayoutLabel.setText("Copper per character:");

        PlatinumPayoutText.setForeground(new java.awt.Color(255, 255, 255));
        PlatinumPayoutText.setText("0");

        GoldPayoutText.setForeground(new java.awt.Color(255, 255, 255));
        GoldPayoutText.setText("0");

        SilverPayoutText.setForeground(new java.awt.Color(255, 255, 255));
        SilverPayoutText.setText("0");

        CopperPayoutText.setForeground(new java.awt.Color(255, 255, 255));
        CopperPayoutText.setText("0");

        PlatinumLeftoverLabel.setForeground(new java.awt.Color(255, 255, 255));
        PlatinumLeftoverLabel.setText("Platinum Leftover:");

        GoldLeftoverLabel.setForeground(new java.awt.Color(255, 255, 255));
        GoldLeftoverLabel.setText("Gold Leftover:");

        SilverLeftoverLabel.setForeground(new java.awt.Color(255, 255, 255));
        SilverLeftoverLabel.setText("Silver Leftover:");

        CopperLeftoverLabel.setForeground(new java.awt.Color(255, 255, 255));
        CopperLeftoverLabel.setText("Copper Leftover:");

        PlatinumLeftoverText.setForeground(new java.awt.Color(255, 255, 255));
        PlatinumLeftoverText.setText("0");

        GoldLeftoverText.setForeground(new java.awt.Color(255, 255, 255));
        GoldLeftoverText.setText("0");

        SilverLeftoverText.setForeground(new java.awt.Color(255, 255, 255));
        SilverLeftoverText.setText("0");

        CopperLeftoverText.setForeground(new java.awt.Color(255, 255, 255));
        CopperLeftoverText.setText("0");

        SplitMoneyButton.setText("Split Money");
        SplitMoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SplitMoneyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MoneySplitterPanelLayout = new javax.swing.GroupLayout(MoneySplitterPanel);
        MoneySplitterPanel.setLayout(MoneySplitterPanelLayout);
        MoneySplitterPanelLayout.setHorizontalGroup(
            MoneySplitterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoneySplitterPanelLayout.createSequentialGroup()
                .addGroup(MoneySplitterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MoneySplitterPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MoneySplitterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PlayerAmountLabel)
                            .addComponent(PlatAmountLabel)
                            .addComponent(GoldAmountLabel)
                            .addComponent(SilverAmountLabel)
                            .addComponent(CopperAmountLabel))
                        .addGap(18, 18, 18)
                        .addGroup(MoneySplitterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PlayerAmountUser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MoneySplitterPanelLayout.createSequentialGroup()
                                .addGroup(MoneySplitterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MoneySplitterPanelLayout.createSequentialGroup()
                                        .addComponent(CopperAmountUser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CopperPayoutLabel))
                                    .addGroup(MoneySplitterPanelLayout.createSequentialGroup()
                                        .addComponent(SilverAmountUser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SilverPayoutLabel))
                                    .addGroup(MoneySplitterPanelLayout.createSequentialGroup()
                                        .addComponent(GoldAmountUser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(GoldPayoutLabel))
                                    .addGroup(MoneySplitterPanelLayout.createSequentialGroup()
                                        .addComponent(PlatinumAmountUser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(PlatinumPayoutLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MoneySplitterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(MoneySplitterPanelLayout.createSequentialGroup()
                                        .addComponent(CopperPayoutText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CopperLeftoverLabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoneySplitterPanelLayout.createSequentialGroup()
                                        .addComponent(SilverPayoutText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SilverLeftoverLabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoneySplitterPanelLayout.createSequentialGroup()
                                        .addComponent(GoldPayoutText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(GoldLeftoverLabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoneySplitterPanelLayout.createSequentialGroup()
                                        .addComponent(PlatinumPayoutText)
                                        .addGap(44, 44, 44)
                                        .addComponent(PlatinumLeftoverLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MoneySplitterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PlatinumLeftoverText)
                                    .addComponent(GoldLeftoverText)
                                    .addComponent(SilverLeftoverText)
                                    .addComponent(CopperLeftoverText)))))
                    .addGroup(MoneySplitterPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(SplitMoneyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 92, Short.MAX_VALUE))
        );
        MoneySplitterPanelLayout.setVerticalGroup(
            MoneySplitterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoneySplitterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MoneySplitterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayerAmountLabel)
                    .addComponent(PlayerAmountUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MoneySplitterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlatAmountLabel)
                    .addComponent(PlatinumAmountUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlatinumPayoutLabel)
                    .addComponent(PlatinumPayoutText)
                    .addComponent(PlatinumLeftoverLabel)
                    .addComponent(PlatinumLeftoverText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MoneySplitterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GoldAmountLabel)
                    .addComponent(GoldAmountUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoldPayoutLabel)
                    .addComponent(GoldPayoutText)
                    .addComponent(GoldLeftoverLabel)
                    .addComponent(GoldLeftoverText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MoneySplitterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SilverAmountLabel)
                    .addComponent(SilverAmountUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SilverPayoutLabel)
                    .addComponent(SilverPayoutText)
                    .addComponent(SilverLeftoverLabel)
                    .addComponent(SilverLeftoverText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MoneySplitterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CopperAmountLabel)
                    .addComponent(CopperAmountUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CopperPayoutLabel)
                    .addComponent(CopperPayoutText)
                    .addComponent(CopperLeftoverLabel)
                    .addComponent(CopperLeftoverText))
                .addGap(18, 18, 18)
                .addComponent(SplitMoneyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        MoneySplitterButton.setText("Money Splitter");
        MoneySplitterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneySplitterButtonActionPerformed(evt);
            }
        });

        QuitButton.setText("Exit");
        QuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MoneySplitterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(MoneySplitterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MoneySplitterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QuitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MoneySplitterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Button to bring up money splitter panel
    private void MoneySplitterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneySplitterButtonActionPerformed
        MoneySplitterPanel.setVisible(true);
    }//GEN-LAST:event_MoneySplitterButtonActionPerformed

    // Button to quit
    private void QuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_QuitButtonActionPerformed

    // Split money on the money splitter panel
    private void SplitMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SplitMoneyButtonActionPerformed
        
        int playerCount, platinumCount, goldCount, silverCount, copperCount, totalPlatinum, 
                totalGold, totalSilver, totalCopper, leftoverPlatinum, leftoverGold, leftoverSilver, leftoverCopper;
        
        // Get player count
        playerCount = 1;
        try{
            playerCount = Integer.parseInt(PlayerAmountUser.getText());
        } catch ( Exception E ){
            msgbox("Player amount has to be a positive integer. Counting it as 1.");
            playerCount = 1;
        }
        
        // Get platinum count
        platinumCount = 0;
        try{
            platinumCount = Integer.parseInt(PlatinumAmountUser.getText());
        } catch ( Exception E ){
            msgbox("Platinum amount has to be a positive integer. Counting it as 0.");
            platinumCount = 0;
        }
        
        // Get gold count
        goldCount = 0;
        try{
            goldCount = Integer.parseInt(GoldAmountUser.getText());
        } catch ( Exception E ){
            msgbox("Gold amount has to be a positive integer. Counting it as 0.");
            goldCount = 0;
        }
        
        // Get silver count
        silverCount = 0;
        try{
            silverCount = Integer.parseInt(SilverAmountUser.getText());
        } catch ( Exception E ){
            msgbox("Silver amount has to be a positive integer. Counting it as 0.");
            silverCount = 0;
        }
        
        // Get copper count
        copperCount = 0;
        try{
            copperCount = Integer.parseInt(CopperAmountUser.getText());
        } catch ( Exception E ){
            msgbox("Copper amount has to be a positive integer. Counting it as 0.");
            copperCount = 0;
        }
        
        // Handles Platinum
        totalPlatinum = (int) Math.floor(platinumCount/playerCount);
        leftoverPlatinum = platinumCount%playerCount;
        PlatinumPayoutText.setText(Integer.toString(totalPlatinum));
        PlatinumLeftoverText.setText(Integer.toString(leftoverPlatinum));
        
        // Handles Gold
        totalGold = (int) Math.floor(goldCount/playerCount);
        leftoverGold = goldCount%playerCount;
        GoldPayoutText.setText(Integer.toString(totalGold));
        GoldLeftoverText.setText(Integer.toString(leftoverGold));
        
        // Handles Silver
        totalSilver = (int) Math.floor(silverCount/playerCount);
        leftoverSilver = silverCount%playerCount;
        SilverPayoutText.setText(Integer.toString(totalSilver));
        SilverLeftoverText.setText(Integer.toString(leftoverSilver));
        
        // Handles Copper
        totalCopper = (int) Math.floor(copperCount/playerCount);
        leftoverCopper = copperCount%playerCount;
        CopperPayoutText.setText(Integer.toString(totalCopper));
        CopperLeftoverText.setText(Integer.toString(leftoverCopper));
        
        
    }//GEN-LAST:event_SplitMoneyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Send message to user
    private void msgbox(String s){
        JOptionPane.showMessageDialog(null, s);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CopperAmountLabel;
    private javax.swing.JTextField CopperAmountUser;
    private javax.swing.JLabel CopperLeftoverLabel;
    private javax.swing.JLabel CopperLeftoverText;
    private javax.swing.JLabel CopperPayoutLabel;
    private javax.swing.JLabel CopperPayoutText;
    private javax.swing.JLabel GoldAmountLabel;
    private javax.swing.JTextField GoldAmountUser;
    private javax.swing.JLabel GoldLeftoverLabel;
    private javax.swing.JLabel GoldLeftoverText;
    private javax.swing.JLabel GoldPayoutLabel;
    private javax.swing.JLabel GoldPayoutText;
    private javax.swing.JButton MoneySplitterButton;
    private javax.swing.JPanel MoneySplitterPanel;
    private javax.swing.JLabel PlatAmountLabel;
    private javax.swing.JTextField PlatinumAmountUser;
    private javax.swing.JLabel PlatinumLeftoverLabel;
    private javax.swing.JLabel PlatinumLeftoverText;
    private javax.swing.JLabel PlatinumPayoutLabel;
    private javax.swing.JLabel PlatinumPayoutText;
    private javax.swing.JLabel PlayerAmountLabel;
    private javax.swing.JTextField PlayerAmountUser;
    private javax.swing.JButton QuitButton;
    private javax.swing.JLabel SilverAmountLabel;
    private javax.swing.JTextField SilverAmountUser;
    private javax.swing.JLabel SilverLeftoverLabel;
    private javax.swing.JLabel SilverLeftoverText;
    private javax.swing.JLabel SilverPayoutLabel;
    private javax.swing.JLabel SilverPayoutText;
    private javax.swing.JButton SplitMoneyButton;
    // End of variables declaration//GEN-END:variables
}

