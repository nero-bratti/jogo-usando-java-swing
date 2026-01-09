package Window.Handlers;

import Window.Panels.GameWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameMainHandler implements ActionListener {
    GameWindow gameWindow;

    public GameMainHandler(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
