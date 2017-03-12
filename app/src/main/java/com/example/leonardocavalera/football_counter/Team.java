package com.example.leonardocavalera.football_counter;

import android.text.TextUtils;
import android.widget.TextView;


public class Team {

    private String mName;
    private int mScore;
    private int mCorner;
    private int mFoul;
    private TextView mScoreView;
    private TextView mCornerView;
    private TextView mFoulView;
    private TextView mNameView;


     Team(TextView name, TextView score, TextView corner, TextView foul) {
        mScore = 0;
        mCorner = 0;
        mFoul = 0;
         mNameView = name;
        mScoreView = score;
        mCornerView = corner;
        mFoulView = foul;
    }

//    protected Team(Parcel in) {
//        mName = in.readString();
//        mScore = in.readInt();
//        mCorner = in.readInt();
//        mFoul = in.readInt();
//    }
//
//    public static final Creator<Team> CREATOR = new Creator<Team>() {
//        @Override
//        public Team createFromParcel(Parcel in) {
//            return new Team(in);
//        }
//
//        @Override
//        public Team[] newArray(int size) {
//            return new Team[size];
//        }
//    };

    void setName(String name){
        mName = name;
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
        if (!TextUtils.isEmpty(mName)){
            mNameView.setText(String.valueOf(mName));
        }

    }

    void resetValue() {
        mScore = 0;
        mFoul = 0;
        mCorner = 0;
        updateView();
    }

//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeStringArray(new String[]{
//                this.mName,
//                String.valueOf(this.mScore),
//                String.valueOf(this.mCorner),
//                String.valueOf(this.mFoul)
//        });
//
//    }

}
