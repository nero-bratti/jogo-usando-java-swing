package Window.Panels;

import Window.Handlers.GameFowardButtonHandler;

import javax.swing.*;
import java.awt.*;

public class GamePanelLore extends JPanel {
    JLabel textLabel;
    JTextArea textArea;
    GameWindow gameWindow;
    JButton returnButton;
    GameFowardButtonHandler gameFowardButtonHandler;

    public GamePanelLore(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        gameFowardButtonHandler = new GameFowardButtonHandler(gameWindow);
        this.setBounds(0,0,800,600);
        this.setBackground(Color.black);
        this.setLayout(null);

        createHistoryLabel();
        add(textLabel);
        createTextArea();
        add(textArea);
        createReturnButton();
        add(returnButton);
    }

    void createHistoryLabel() {
        textLabel = new JLabel("História");
        textLabel.setBounds(0,0,800,200);
        textLabel.setFont(new Font("Felix Titling", Font.BOLD, 50));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setForeground(Color.white);
        textLabel.setVisible(true);
    }

    void createTextArea() {
        textArea = new JTextArea("...");
        textArea.setBounds(20,200,760,500);
        textArea.setFont(new Font("Felix Titling", Font.PLAIN, 25));
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.black);
        textArea.setForeground(Color.white);
        textArea.setVisible(true);
    }

    void createReturnButton() {
        returnButton = new JButton("Voltar");
        returnButton.setFont(new Font("Felix Titling", Font.BOLD, 20));
        returnButton.setBounds(600,35,150,50);
        returnButton.setBackground(Color.white);
        returnButton.addActionListener(gameFowardButtonHandler);
        returnButton.setVisible(true);
    }
}