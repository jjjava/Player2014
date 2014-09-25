package br.com.schumaker.core;

import java.util.ArrayList;
import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 25/09/14 Command
 */
public class CommandList {

    private ArrayList<ICommand> commnads;
    private boolean isPlaying;

    public CommandList() {
        isPlaying = false;
        commnads = new ArrayList<>();
    }

    public void addCommand(ICommand command) {
        commnads.add(command);
    }

    public void executeCommands() {
        System.out.println("entrou");
        if (!isPlaying) {
            isPlaying = true;
            new Thread() {
                @Override
                public void run() {
                    System.out.println("size:" + commnads.size());
                    for (ICommand c : commnads) {
                        System.out.println("looping");
                        c.execute();

                        System.out.println("size:" + commnads.size());
                        //FrMain.getInstance().setMusicName(c.);

                        while (!PlayerFacade.getInstance().isFinished()) {
                        }
                        System.out.println("W");
                    }
                    System.out.println("F");
                    commnads.clear();
                    System.out.println("size:" + commnads.size());
                    isPlaying = false;
                }
            }.start();
        }
    }
}
