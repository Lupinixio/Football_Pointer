package com.example.leonardocavalera.football_counter;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView foulViewA;
    TextView cornerViewA;
    TextView scoreViewA;

    TextView foulViewB;
    TextView cornerViewB;
    TextView scoreViewB;

    Team teamA;
    Team teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        foulViewA = (TextView) findViewById(R.id.foul_a_view);
        cornerViewA = (TextView) findViewById(R.id.corner_a_view);
        scoreViewA = (TextView) findViewById(R.id.team_a_score);

        foulViewB = (TextView) findViewById(R.id.foul_b_view);
        cornerViewB = (TextView) findViewById(R.id.corner_b_view);
        scoreViewB = (TextView) findViewById(R.id.team_b_score);

        teamA = new Team(scoreViewA, cornerViewA, foulViewA);
        teamB = new Team(scoreViewB, cornerViewB, foulViewB);


        teamA.updateView();
        teamB.updateView();



    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.corner_a_button:
                teamA.addCorner();
                break;
            case R.id.goal_a_button:
                teamA.addScore();
                break;
            case R.id.foul_a_button:
                teamA.addFoul();
                break;
            case R.id.corner_b_button:
                teamB.addCorner();
                break;
            case R.id.goal_b_button:
                teamB.addScore();
                break;
            case R.id.fail_b_button:
                teamB.addFoul();
                break;
            case R.id.reset_button:
                teamA.resetValue();
                teamB.resetValue();
                break;
        }
    }

}
