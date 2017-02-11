package com.example.leonardocavalera.football_counter;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Team A score
    int scoreTeamA = 0;
    int cornerTeamA = 0;
    int foulTeamA = 0;

    //Team B score
    int scoreTeamB = 0;
    int cornerTeamB = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add Foul to Team A
     */

    public void addFoulForTeamA(View v) {
        foulTeamA ++;
        TextView scoreView = (TextView) findViewById(R.id.foul_a_view);
        String str = "Foul : ";
        if (foulTeamA > 1){
            str = "Fouls : ";
        }
        scoreView.setText(String.valueOf(str + foulTeamA));
    }

    /**
     * Add Corner to Team A
     */

    public void addCornerForTeamA(View v) {
        cornerTeamA ++;
        TextView scoreView = (TextView) findViewById(R.id.corner_a_view);
        String str = "Corner : ";
        if (cornerTeamA > 1){
            str = "Corners : ";
        }
        scoreView.setText(String.valueOf(str + cornerTeamA));
    }

    /**
     * Add 1 Goal to Team A
     */

    public void addGoalForTeamA(View v) {
        if (scoreTeamA >= 50){

            Context context = getApplicationContext();
            CharSequence text = "Are you crazy?!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }else {
            scoreTeamA ++;
            TextView scoreView = (TextView) findViewById(R.id.team_a_score);
            scoreView.setText(String.valueOf(scoreTeamA));
        }
    }

    /**
     * Add Foul to Team B
     */

    public void addFoulForTeamB(View v) {
        foulTeamB ++;
        TextView scoreView = (TextView) findViewById(R.id.foul_b_view);
        String str = "Foul : ";
        if (foulTeamB > 1){
            str = "Fouls : ";
        }
        scoreView.setText(String.valueOf(str + foulTeamB));
    }

    /**
     * Add Corner to Team B
     */

    public void addCornerForTeamB(View v) {
        cornerTeamB ++;
        TextView scoreView = (TextView) findViewById(R.id.corner_b_view);
        String str = "Corner : ";
        if (cornerTeamB > 1){
            str = "Corners : ";
        }
        scoreView.setText(String.valueOf(str + cornerTeamB));
    }

    /**
     * Add 1 Goal to Team B
     */

    public void addGoalForTeamB(View v) {
        if (scoreTeamB >= 50){

            Context context = getApplicationContext();
            CharSequence text = "Are you crazy?!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }else {
            scoreTeamB++;
            TextView scoreView = (TextView) findViewById(R.id.team_b_score);
            scoreView.setText(String.valueOf(scoreTeamB));
        }
    }

    /**
     * Reset Score
     */

    public void resetScore(View v) {
        scoreTeamA = 0;
        cornerTeamA = 0;
        foulTeamA = 0;
        scoreTeamB = 0;
        cornerTeamB = 0;
        foulTeamB = 0;

        displayGoalForTeamA(scoreTeamA);
        displayCornerForTeamA(cornerTeamA);
        displayFoulForTeamA(foulTeamA);
        displayGoalForTeamB(scoreTeamB);
        displayCornerForTeamB(cornerTeamB);
        displayFoulForTeamB(foulTeamB);


    }

    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCornerForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corner_a_view);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_a_view);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCornerForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corner_b_view);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_b_view);
        scoreView.setText(String.valueOf(score));
    }

}
