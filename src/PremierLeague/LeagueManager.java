package PremierLeague;

import javafx.stage.Stage;

public interface LeagueManager {

    void addClub(FootballClub footballClub);

    void deleteClub();

    void displayStatistics();

    void displayTable();

    void GUI();

    void addMatch();
}
