package Window.Panels;

import Window.Handlers.GameFowardButtonHandler;

import javax.swing.*;
import java.awt.*;

public class GamePanelIntroduction extends JPanel {
    GameWindow gameWindow;
    GameFowardButtonHandler gameFowardButtonHandler;
    JButton fowardButton;
    JTextArea textArea;
    int cont;

    public GamePanelIntroduction(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        gameFowardButtonHandler = new GameFowardButtonHandler(gameWindow);
        cont = 0;
        this.setBounds(0,0,800,600);
        this.setBackground(Color.black);
        this.setLayout(null);

        createTextArea();
        add(textArea);
        createFowardButton();
        add(fowardButton);
    }

    void createTextArea() {
        textArea = new JTextArea("");
        textArea.setBounds(20,150,760,500);
        textArea.setFont(new Font("Felix Titling", Font.PLAIN, 25));
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.black);
        textArea.setForeground(Color.white);
        textArea.setVisible(true);
    }

    void createFowardButton() {
        fowardButton = new JButton("Proseguir");
        fowardButton.setFont(new Font("Felix Titling", Font.BOLD, 16));
        fowardButton.setBounds(600,35,150,50);
        fowardButton.setBackground(Color.white);
        fowardButton.setVisible(true);
    }
}
