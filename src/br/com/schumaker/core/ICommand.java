package br.com.schumaker.core;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 25/09/14
 * Command
 */
public interface ICommand {

    void execute();
    String getFileName();
}
