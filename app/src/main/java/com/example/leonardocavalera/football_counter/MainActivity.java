package com.example.leonardocavalera.football_counter;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView nameViewA;
    TextView foulViewA;
    TextView cornerViewA;
    TextView scoreViewA;
    TextView nameViewB;
    TextView foulViewB;
    TextView cornerViewB;
    TextView scoreViewB;
    String teamSelected;

    public Team teamA;
    public Team teamB;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

      nameViewA = (TextView) findViewById(R.id.team_a_text);
      foulViewA = (TextView) findViewById(R.id.foul_a_view);
      cornerViewA = (TextView) findViewById(R.id.corner_a_view);
      scoreViewA = (TextView) findViewById(R.id.team_a_score);

      nameViewB = (TextView) findViewById(R.id.team_b_text);
      foulViewB = (TextView) findViewById(R.id.foul_b_view);
      cornerViewB = (TextView) findViewById(R.id.corner_b_view);
      scoreViewB = (TextView) findViewById(R.id.team_b_score);

      teamA = new Team(nameViewA, scoreViewA, cornerViewA, foulViewA);
      teamB = new Team(nameViewB, scoreViewB, cornerViewB, foulViewB);

      teamA.updateView();
      teamB.updateView();

      if (!TextUtils.isEmpty(getIntent().getStringExtra("TeamName"))){  //Se valorizzata allora setto il nome della squadra
          switch (getIntent().getStringExtra("TeamSelected")){
              case "A":
                  teamA.setName(getIntent().getStringExtra("TeamName"));
                  teamA.updateView();
                  break;
              case "B":
                  teamB.setName(getIntent().getStringExtra("TeamName"));
                  teamB.updateView();
                  break;
          }
      }



    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
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
            case R.id.team_a_text:
                Intent i = new Intent(this, NameSet.class);
                i.putExtra("Team", "A");
                teamSelected = "A";
                startActivity(i);
                break;
            case R.id.team_b_text:
                Intent d = new Intent(this, NameSet.class);
                d.putExtra("Team", "B");
                teamSelected = "B";
                startActivity(d);
                break;
            case R.id.reset_button:
                teamA.resetValue();
                teamB.resetValue();
                break;
        }
    }


}
