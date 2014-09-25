package br.com.schumaker.core;

import java.util.ArrayList;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 25/09/14 
 * Command
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

    private void remove() {
        fileNames.remove(0);
    }

    @Override
    public void execute() {
        PlayerFacade.getInstance().play(fileNames.get(0));
        remove();
        new Thread() {

            @Override
            public void run() {
                try {
                    while (!PlayerFacade.getInstance().isFinished()) {
                        if (PlayerFacade.getInstance().getTime() / 1000 < 60) {
                        } else {
                            double aux = (double) PlayerFacade.getInstance().getTime() / 1000;
                            double aux2 = aux / 60.0;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }.start();
    }
}
