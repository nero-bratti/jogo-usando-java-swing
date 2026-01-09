package Window.Handlers;

import Window.Panels.GameWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameTitleHandler implements ActionListener {
    GameWindow gameWindow;

    public GameTitleHandler(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String option = actionEvent.getActionCommand();

        if (option.equals("history")) {
            gameWindow.show("history");
        } else if (option.equals("introduction")) {
            gameWindow.show("introduction");
        }
    }
}
