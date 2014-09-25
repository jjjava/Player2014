package br.com.schumaker.gfx;

import br.com.schumaker.core.CoreFrMain;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 25/09/14 
 * Singleton
 */
public class FrMain extends javax.swing.JFrame {

    private static class FrMainHolder {

        private static final FrMain INSTANCE = new FrMain();
    }

    private FrMain() {
        initComponents();
    }

    public static FrMain getInstance() {
        return FrMain.FrMainHolder.INSTANCE;
    }

    public void setMusicName(String musicName) {
        jlMusicName.setText(musicName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jsPlayTime = new javax.swing.JSlider();
        btStop = new javax.swing.JButton();
        btPlay = new javax.swing.JButton();
        jlMusicName = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mOpen = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HsPlayer");

        jsPlayTime.setBackground(new java.awt.Color(0, 0, 0));
        jsPlayTime.setForeground(new java.awt.Color(255, 255, 255));
        jsPlayTime.setMajorTickSpacing(10);
        jsPlayTime.setPaintTrack(false);
        jsPlayTime.setEnabled(false);

        btStop.setText("Stop");
        btStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStopActionPerformed(evt);
            }
        });

        btPlay.setText("Play");
        btPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlayActionPerformed(evt);
            }
        });

        jlMusicName.setText("xxx");

        jMenu1.setText("File");

        mOpen.setText("Open");
        mOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mOpenActionPerformed(evt);
            }
        });
        jMenu1.add(mOpen);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jsPlayTime, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btPlay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btStop))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlMusicName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlMusicName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jsPlayTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btStop)
                    .addComponent(btPlay))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlayActionPerformed
        CoreFrMain.getInstance().play();
    }//GEN-LAST:event_btPlayActionPerformed

    private void btStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStopActionPerformed
        CoreFrMain.getInstance().stop();
    }//GEN-LAST:event_btStopActionPerformed

    private void mOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mOpenActionPerformed
        CoreFrMain.getInstance().getFiles();
    }//GEN-LAST:event_mOpenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPlay;
    private javax.swing.JButton btStop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jlMusicName;
    private javax.swing.JSlider jsPlayTime;
    private javax.swing.JMenuItem mOpen;
    // End of variables declaration//GEN-END:variables
}
