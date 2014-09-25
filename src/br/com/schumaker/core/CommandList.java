package br.com.schumaker.core;

import java.util.ArrayList;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 25/09/14 
 * Command
 */
public class CommandList {

    private ArrayList<ICommand> commnads;

    public CommandList() {
        commnads = new ArrayList<>();
    }

    public void addCommand(ICommand command) {
        commnads.add(command);
    }

    public void executeCommands() {
        for (ICommand c : commnads) {
            c.execute();
        }
    }
}
