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
    private final ArrayList<String> fileList;
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
        commandList.executeCommands();
    }
    public void stop(){
        commandList.addCommand(new Stop());
    }

    public void getFiles() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            File files[] = file.listFiles();
            for (File f : files) {
                commandList.addCommand(new Play(f.getName(), f.getAbsolutePath()));
            }
        }
    }
}
