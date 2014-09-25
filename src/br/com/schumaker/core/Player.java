package br.com.schumaker.core;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 25/09/14
 */
public class Player {

    private static class PlayerHolder {

        private static final Player INSTANCE = new Player();
    }

    private Player() {
    }

    public static Player getInstance() {
        return PlayerHolder.INSTANCE;
    }
}
