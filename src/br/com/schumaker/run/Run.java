package br.com.schumaker.run;

import br.com.schumaker.gfx.FrMain;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 25/09/14
 */
public class Run {

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrMain.getInstance().setLocationRelativeTo(null);
                FrMain.getInstance().setVisible(true);
            }
        });
    }
}
