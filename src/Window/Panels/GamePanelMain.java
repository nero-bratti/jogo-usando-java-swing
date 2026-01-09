package Window.Panels;

import javax.swing.*;
import java.awt.*;

public class GamePanelMain extends JPanel {
    GameWindow gameWindow;
    JLabel hpLabel,titleLabel,weaponLabel;
    JTextArea textArea;
    JButton firstOptionButton;
    JButton secondOptionButton;
    JButton thirdOptionButton;
    JButton fourthOptionButton;
    JButton fifthOptionButton;
    JButton sixthOptionButton;


    public GamePanelMain(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        this.setBounds(0,0,800,600);
        this.setBackground(Color.black);
        this.setLayout(null);

        createCharacters();
        createParts();
        addParts();
    }

    private void createCharacters() {
    }

    void createParts() {
        createHPLabel();
        createTitleLabel();
        createWeaponLabel();
        createTextArea();
        createFirstOptionButton();
        createSecondOptionButton();
        createThirdOptionButton();
        createFourthOptionButton();
        createFifthOptionButton();
        createSixthOptionButton();
    }

    void addParts() {
        this.add(hpLabel);
        this.add(titleLabel);
        this.add(weaponLabel);
        this.add(textArea);
        this.add(firstOptionButton);
        this.add(secondOptionButton);
        this.add(thirdOptionButton);
        this.add(fourthOptionButton);
        this.add(fifthOptionButton);
        this.add(sixthOptionButton);
    }

    void createHPLabel() {
        hpLabel = new JLabel("HP: 5");
        hpLabel.setBounds(20,15,50,35);
        hpLabel.setFont(new Font("Felix Titling", Font.BOLD, 15));
        hpLabel.setBackground(Color.black);
        hpLabel.setForeground(Color.white);
        hpLabel.setVisible(true);
    }

    void createWeaponLabel() {
        weaponLabel = new JLabel("Itens: Espada simples");
        weaponLabel.setBounds(20,65,755,35);
        weaponLabel.setFont(new Font("Felix Titling", Font.BOLD, 15));
        weaponLabel.setBackground(Color.black);
        weaponLabel.setForeground(Color.white);
        weaponLabel.setVisible(true);
    }

    void createTitleLabel() {
        titleLabel = new JLabel("Ato 1: Floresta do Atendimentus");
        titleLabel.setBounds(180,15,400,35);
        titleLabel.setFont(new Font("Felix Titling", Font.BOLD, 20));
        titleLabel.setBackground(Color.black);
        titleLabel.setForeground(Color.white);
        titleLabel.setVisible(true);
    }

    void createTextArea() {
        textArea = new JTextArea("Um lugar encantado, dizem que as pessoas doentes ou com almas" +
                " feridas podem ir a floresta para serem curadas.");
        textArea.setBounds(25,150,745,200);
        textArea.setFont(new Font("Felix Titling", Font.PLAIN, 15));
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.black);
        textArea.setForeground(Color.white);
        textArea.setVisible(true);
    }

    void createFirstOptionButton() {
        firstOptionButton = new JButton("Entrar na floresta");
        firstOptionButton.setFont(new Font("Felix Titling", Font.BOLD, 20));
        firstOptionButton.setBounds(5,395,385,50);
        firstOptionButton.setBackground(Color.white);
        firstOptionButton.addActionListener(actionEvent -> {
            switch(firstOptionButton.getText()) {
            }
        });
        firstOptionButton.setVisible(true);
    }

    void createSecondOptionButton() {
        secondOptionButton = new JButton("---");
        secondOptionButton.setFont(new Font("Felix Titling", Font.BOLD, 20));
        secondOptionButton.setBounds(395,395,385,50);
        secondOptionButton.setBackground(Color.white);
        secondOptionButton.addActionListener(actionEvent -> {
        });
        secondOptionButton.setVisible(true);
    }

    void createThirdOptionButton() {
        thirdOptionButton = new JButton("---");
        thirdOptionButton.setFont(new Font("Felix Titling", Font.BOLD, 20));
        thirdOptionButton.setBounds(5,450,385,50);
        thirdOptionButton.setBackground(Color.white);
        thirdOptionButton.addActionListener(actionEvent -> {
            switch (thirdOptionButton.getText()) {
            }
        });
        thirdOptionButton.setVisible(true);
    }

    void createFourthOptionButton() {
        fourthOptionButton = new JButton("Itens");
        fourthOptionButton.setFont(new Font("Felix Titling", Font.BOLD, 20));
        fourthOptionButton.setBounds(395,450,385,50);
        fourthOptionButton.setBackground(Color.white);
        fourthOptionButton.setVisible(true);
    }

    void createFifthOptionButton() {
        fifthOptionButton = new JButton("Salsichinha");
        fifthOptionButton.setFont(new Font("Felix Titling", Font.BOLD, 20));
        fifthOptionButton.setBounds(5,505,385,50);
        fifthOptionButton.setBackground(Color.white);
        fifthOptionButton.setVisible(true);
    }

    void createSixthOptionButton() {
        sixthOptionButton = new JButton("Desistir");
        sixthOptionButton.setFont(new Font("Felix Titling", Font.BOLD, 20));
        sixthOptionButton.setBounds(395,505,385,50);
        sixthOptionButton.setBackground(Color.white);
        sixthOptionButton.addActionListener(actionEvent -> {
            gameWindow.show("lose");
        });
        sixthOptionButton.setVisible(true);
    }
}
