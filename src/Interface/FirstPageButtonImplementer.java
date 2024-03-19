package Interface;

import GUI.FirstPage;
import GUI.HistoryOfGames;
import GUI.Settings;
import GUI.SwipeBrickBreaker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPageButtonImplementer implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == new FirstPage().StartNewGame) {
            new SwipeBrickBreaker();
        } else if (actionEvent.getSource() == new FirstPage().HistoryOfGames) {
            new HistoryOfGames();
        } else if (actionEvent.getSource() == new FirstPage().Settings) {
            new Settings();
        } else if (actionEvent.getSource() == new FirstPage().Exit) {
            //ToDo
        }
    }
}
