package br.com.schumaker.core;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 25/09/14 
 * Singleton, Facade
 */
public class PlayerFacade {

    private String fileName;
    private Player player;

    private static class PlayerHolder {

        private static final PlayerFacade INSTANCE = new PlayerFacade();
    }

    private PlayerFacade() {
    }

    public static PlayerFacade getInstance() {
        return PlayerHolder.INSTANCE;
    }

    public void play(String fileName) {
        addFile(fileName);
        try {
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
        } catch (FileNotFoundException | JavaLayerException e) {
            System.out.println("Problem playing file " + fileName);
            System.out.println(e);
        }
        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                    while (!player.isComplete()) {
                        System.out.println("" + player.getPosition());
                    }
                } catch (JavaLayerException e) {
                    System.out.println(e);
                }
            }
        }.start();
    }

    public void stop() {
        player.close();
    }

    private void addFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getTime() {
        return player.getPosition();
    }

    public boolean isFinished() {
        return player.isComplete();
    }
}
