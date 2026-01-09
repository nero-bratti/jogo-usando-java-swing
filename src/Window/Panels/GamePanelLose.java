package Window.Panels;

import javax.swing.*;
import java.awt.*;

public class GamePanelLose extends JPanel {
    GameWindow gameWindow;
    JLabel textLabel,textLabel2,textLabel3;
    JButton restartButton;
    JButton exitButton;

    public GamePanelLose(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        this.setBounds(0,0,800,600);
        this.setBackground(Color.black);
        this.setLayout(null);

        createParts();
        addParts();
    }
    void createParts() {
        createTextLabel();
        createTextLabel2();
        createTextLabel3();
        createRestartButton();
        createExitButton();
    }

    void addParts() {
        this.add(textLabel);
        this.add(textLabel2);
        this.add(textLabel3);
        this.add(restartButton);
        this.add(exitButton);
    }

    void createTextLabel() {
        textLabel = new JLabel("O mundo foi destruído por Glozium,");
        textLabel.setBounds(20,20,760,100);
        textLabel.setFont(new Font("Felix Titling", Font.BOLD, 30));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setForeground(Color.white);
        textLabel.setVisible(true);
    }

    void createTextLabel2() {
        textLabel2 = new JLabel("uma fatalidade terrível...");
        textLabel2.setBounds(20,120,760,100);
        textLabel2.setFont(new Font("Felix Titling", Font.BOLD, 30));
        textLabel2.setHorizontalAlignment(JLabel.CENTER);
        textLabel2.setForeground(Color.white);
        textLabel2.setVisible(true);
    }

    void createTextLabel3() {
        textLabel3 = new JLabel("Fim de Jogo");
        textLabel3.setBounds(20,220,760,100);
        textLabel3.setFont(new Font("Felix Titling", Font.BOLD, 30));
        textLabel3.setHorizontalAlignment(JLabel.CENTER);
        textLabel3.setForeground(Color.white);
        textLabel3.setVisible(true);
    }

    void createRestartButton() {
        restartButton = new JButton("Tentar novamente");
        restartButton.setFont(new Font("Felix Titling", Font.BOLD, 20));
        restartButton.setHorizontalAlignment(JLabel.CENTER);
        restartButton.setBounds(245,360,300,50);
        restartButton.setBackground(Color.white);
        restartButton.addActionListener(actionEvent -> {
            gameWindow.show("main");
        });
        restartButton.setVisible(true);
    }

    void createExitButton() {
        exitButton = new JButton("Sair");
        exitButton.setFont(new Font("Felix Titling", Font.BOLD, 20));
        exitButton.setBounds(295,440,200,50);
        exitButton.setBackground(Color.white);
        exitButton.addActionListener(actionEvent -> {
            System.exit(0);
        });
        exitButton.setVisible(true);
    }
}