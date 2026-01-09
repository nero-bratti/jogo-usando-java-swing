package Window.Handlers;

import Window.Panels.GameWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFowardButtonHandler implements ActionListener {
    GameWindow gameWindow;

    public GameFowardButtonHandler(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        gameWindow.show("title");
    }
}
