package br.com.schumaker.core;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author hudson.sales
 */
public class CoreFrMain {

    private volatile static CoreFrMain instance = null;
    private ArrayList<String> fileList;
    private final CommandList commandList;

    private CoreFrMain() {
        fileList = new ArrayList<>();
        commandList = new CommandList();
    }

    public static CoreFrMain getInstance() {
        if (instance == null) {
            synchronized (CoreFrMain.class) {
                if (instance == null) {
                    instance = new CoreFrMain();
                }
            }
        }
        return instance;
    }

    public void play() {
        PlayerFacade.getInstance().play(fileList.get(0));
    }

    public void getFiles() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String aqs[] = file.list();
            File files[] = file.listFiles();
            for (File f : files) {
                fileList.add(f.getAbsolutePath());
            }
        }
    }
}
