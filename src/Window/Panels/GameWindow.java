package Window.Panels;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JPanel history;
    private JPanel main;
    private JPanel lose;
    private JPanel title;
    private JPanel introduction;
    private JPanel transition;

    public GameWindow() {
        this.setSize(800,600);
        this.setTitle("A Jornada");
        this.setIconImage(new ImageIcon("src/Images/icon.png").getImage());
        this.setResizable(false);
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        history = new GamePanelLore(this);
        main = new GamePanelMain(this);
        lose = new GamePanelLose(this);
        title = new GamePanelTitle(this);
        introduction = new GamePanelIntroduction(this);
        transition = new GamePanelIntroduction(this);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        cardPanel.setBounds(0, 0, 800, 600);

        this.add(cardPanel);

        cardPanel.add(title, "title");
        cardPanel.add(main, "main");
        cardPanel.add(history, "history");
        cardPanel.add(lose, "lose");
        cardPanel.add(introduction, "introduction");
        cardPanel.add(transition, "transition");

        show("title");

        this.setVisible(true);
    }

    public void show(String name) {
        cardLayout.show(cardPanel, name);
    }
}
