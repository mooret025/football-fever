package com.example.android.footballfever;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int homeTeamScore = 0;
    int awayTeamScore = 0;


    /**
     * **********Home team***************
     * Adds 6 points for the home team.
     */

    public void addSixPointsForHome(View v) {
        homeTeamScore = homeTeamScore + 6;
        displayHomeTeam(homeTeamScore);
    }

    //Adds 1 point for the home team.

    public void addOnePointForHome(View v) {
        homeTeamScore = homeTeamScore + 1;
        displayHomeTeam(homeTeamScore);
    }

    //Adds 2 points for the home team.

    public void addTwoPointsForHome(View v) {
        homeTeamScore = homeTeamScore + 2;
        displayHomeTeam(homeTeamScore);
    }

    //Adds 3 points for the home team.

    public void addThreePointsForHome(View v) {
        homeTeamScore = homeTeamScore + 3;
        displayHomeTeam(homeTeamScore);
    }

    /**
     * **********Away team***************
     * Adds 6 points for the away team.
     */

    public void addSixPointsForAway(View v) {
        awayTeamScore = awayTeamScore + 6;
        displayAwayTeam(awayTeamScore);
    }

    //Adds 1 point for the away team.

    public void addOnePointForAway(View v) {
        awayTeamScore = awayTeamScore + 1;
        displayAwayTeam(awayTeamScore);
    }

    //Adds 2 points for the away team.

    public void addTwoPointsForAway(View v) {
        awayTeamScore = awayTeamScore + 2;
        displayAwayTeam(awayTeamScore);
    }

    //Adds 3 points for the away team.

    public void addThreePointsForAway(View v) {
        awayTeamScore = awayTeamScore + 3;
        displayAwayTeam(awayTeamScore);
    }

    /**
     * Resets the scores for the home and away teams to zero
     */

    public void resetScoresToZero(View v) {
        homeTeamScore = 0;
        awayTeamScore = 0;
        displayHomeTeam(homeTeamScore);
        displayAwayTeam(awayTeamScore);
    }

    /**
     * ***********Displays***********
     * Displays score for home team.
     */


    private void displayHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(score));

    }

    //Displays score for the away team.

    private void displayAwayTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_team_score);
        scoreView.setText(String.valueOf(score));

    }


}
