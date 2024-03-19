package GUI;

import Interface.FirstPageButtonImplementer;

import javax.swing.*;
import java.awt.*;

public class FirstPage implements Pages{
    private JFrame firstFrame;
    public JButton StartNewGame;
    private JLabel Record;
    public JButton HistoryOfGames;
    public JButton Settings;
    public JButton Exit;
    FirstPageButtonImplementer buttonImplementer;
    public FirstPage() {
        firstFrame = new JFrame();
        firstFrame.setSize(600, 600);
        firstFrame.setTitle("Main Menu");
        firstFrame.setResizable(false);
        firstFrame.setLayout(null);
        firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonImplementer = new FirstPageButtonImplementer();

        Record = new JLabel();
        // Record should be completed
        Record.setText("Total record : ");
        Record.setBounds(120, 80, 360, 40);
        Record.setBackground(new Color(0, 0, 120));
        Record.setForeground(new Color(0xD98E24));
        Record.setFont(new Font("", Font.ITALIC | Font.BOLD, 20));
        Record.setHorizontalAlignment(JLabel.CENTER);
        Record.setVerticalAlignment(JLabel.CENTER);
        Record.setOpaque(true);

        StartNewGame = new JButton();
        StartNewGame.setText("Start New Game");
        StartNewGame.setHorizontalAlignment(JButton.CENTER);
        StartNewGame.setVerticalAlignment(JButton.CENTER);
        StartNewGame.setBounds(120, 160, 360, 40);
        StartNewGame.addActionListener(buttonImplementer);

        HistoryOfGames = new JButton();
        HistoryOfGames.setText("History Of Games");
        HistoryOfGames.setHorizontalAlignment(JButton.CENTER);
        HistoryOfGames.setVerticalAlignment(JButton.CENTER);
        HistoryOfGames.setBounds(120, 240, 360, 40);
        HistoryOfGames.addActionListener(buttonImplementer);

        Settings = new JButton();
        Settings.setText("Settings");
        Settings.setHorizontalAlignment(JButton.CENTER);
        Settings.setVerticalAlignment(JButton.CENTER);
        Settings.setBounds(120, 320, 360, 40);
        Settings.addActionListener(buttonImplementer);

        Exit = new JButton();
        Exit.setText("Exit");
        Exit.setHorizontalAlignment(JButton.CENTER);
        Exit.setVerticalAlignment(JButton.CENTER);
        Exit.setBounds(120, 400, 360, 40);
        Exit.addActionListener(buttonImplementer);

        firstFrame.add(StartNewGame);
        firstFrame.add(Record);
        firstFrame.add(HistoryOfGames);
        firstFrame.add(Settings);
        firstFrame.add(Exit);
        firstFrame.setVisible(true);

    }
}
