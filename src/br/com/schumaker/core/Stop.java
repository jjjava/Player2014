package br.com.schumaker.core;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 25/09/14
 * Command
 */
public class Stop implements ICommand {

    @Override
    public void execute() {
        PlayerFacade.getInstance().stop();
    }

}
