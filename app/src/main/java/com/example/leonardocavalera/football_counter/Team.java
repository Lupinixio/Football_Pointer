package com.example.leonardocavalera.football_counter;

import android.widget.TextView;


public class Team {

    private int mScore;
    private int mCorner;
    private int mFoul;
    private TextView mScoreView;
    private TextView mCornerView;
    private TextView mFoulView;


     Team(TextView score, TextView corner, TextView foul) {
        mScore = 0;
        mCorner = 0;
        mFoul = 0;
        mScoreView = score;
        mCornerView = corner;
        mFoulView = foul;
    }

    void addScore() {
        mScore++;
        updateView();
    }

    void addCorner() {
        mCorner++;
        updateView();
    }

    void addFoul() {
        mFoul++;
        updateView();
    }

    void updateView() {
        mScoreView.setText(String.valueOf(mScore));
        String strFoul = "Foul : ";
        if (mFoul > 1) {
            strFoul = "Fouls : ";
        }
        mFoulView.setText(String.valueOf(strFoul + mFoul));
        String strCorner = "Corner : ";
        if (mCorner > 1) {
            strCorner = "Corners : ";
        }
        mCornerView.setText(String.valueOf(strCorner + mCorner));

    }

    void resetValue() {
        mScore = 0;
        mFoul = 0;
        mCorner = 0;
        updateView();
    }

}
