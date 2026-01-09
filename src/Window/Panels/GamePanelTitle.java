package Window.Panels;

import Window.Handlers.GameTitleHandler;

import javax.swing.*;
import java.awt.*;

public class GamePanelTitle extends JPanel {
    GameWindow gameWindow;
    GameTitleHandler gameTitleHandler;
    JLabel titleLabel;
    JButton startButton;
    JButton storyButton;

    public GamePanelTitle(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        this.setBounds(0,0,800,600);
        this.setBackground(Color.black);
        this.setLayout(null);

        gameTitleHandler = new GameTitleHandler(gameWindow);

        createParts();
        addParts();
    }
    void createParts() {
        createTitleLabel();
        createStartButton();
        createStoryButton();
    }

    void addParts() {
        this.add(titleLabel);
        this.add(startButton);
        this.add(storyButton);
    }

    void createTitleLabel() {
        titleLabel = new JLabel("A Jornada");
        titleLabel.setBounds(-5,0,800,200);
        titleLabel.setFont(new Font("Felix Titling", Font.BOLD, 50));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setVerticalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(Color.white);
        titleLabel.setVisible(true);
    }

    void createStartButton() {
        startButton = new JButton("Começar");
        startButton.setFont(new Font("Felix Titling", Font.BOLD, 20));
        startButton.setBounds(300,260,150,50);
        startButton.setBackground(Color.white);
        startButton.addActionListener(gameTitleHandler);
        startButton.setActionCommand("introduction");
        startButton.setVisible(true);
    }

    void createStoryButton() {
        storyButton = new JButton("História");
        storyButton.setFont(new Font("Felix Titling", Font.BOLD, 20));
        storyButton.setBounds(300,340,150,50);
        storyButton.setBackground(Color.white);
        storyButton.addActionListener(gameTitleHandler);
        storyButton.setActionCommand("history");
        storyButton.setVisible(true);
    }
}
