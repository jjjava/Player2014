package br.com.schumaker.core;

import java.util.ArrayList;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 25/09/14
 */
public class Play implements ICommand {

    private ArrayList<String> fileNames;

    public Play() {
        fileNames = new ArrayList<>();
    }

    public Play(ArrayList<String> fileNames) {
        this.fileNames = fileNames;
    }

    public void add(String fileName) {
        fileNames.add(fileName);
    }

    @Override
    public void execute() {

    }

}
