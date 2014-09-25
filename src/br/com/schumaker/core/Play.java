package br.com.schumaker.core;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 25/09/14 Command
 */
public class Play implements ICommand {

    private final String fileName;
    private final String filePath;

    public Play(String fileName, String filePath) {
        this.fileName = fileName;
        this.filePath = filePath;
    }

    @Override
    public String getFileName() {
        return fileName;
    }

    @Override
    public void execute() {
        PlayerFacade.getInstance().play(filePath);
    }
}
