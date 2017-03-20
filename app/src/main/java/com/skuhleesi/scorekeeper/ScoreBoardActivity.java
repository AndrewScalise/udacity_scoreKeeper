package com.skuhleesi.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreBoardActivity extends AppCompatActivity {

    int mScoreTeamA = 0;
    int mScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);
        displayForTeamA(mScoreTeamA);
        displayForTeamB(mScoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_A_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add seven points for a touch down to team A
     */
    public void addSevenA(View view){
        mScoreTeamA += 7;
        displayForTeamA(mScoreTeamA);
    }

    /**
     * Add three points for a fieldgoal to team A
     */

    public void addThreeA(View view){
        mScoreTeamA += 3;
        displayForTeamA(mScoreTeamA);
    }

    /**
     * Add two points for safety for Team A
     */
    public void addTwoA(View view){
        mScoreTeamA += 2;
        displayForTeamA(mScoreTeamA);
    }

    /**
     * Reset points for Team A
     */

    public void resetA(View view){
        mScoreTeamA = 0;
        displayForTeamA(mScoreTeamA);
    }

    /**
     * Add seven points for a touch down to team B
     */
    public void addSevenB(View view){
        mScoreTeamB += 7;
        displayForTeamB(mScoreTeamB);
    }

    /**
     * Add three points for a fieldgoal to team B
     */

    public void addThreeB(View view){
        mScoreTeamB += 3;
        displayForTeamB(mScoreTeamB);
    }

    /**
     * Add two points for safety for Team B
     */
    public void addTwoB(View view){
        mScoreTeamB += 2;
        displayForTeamB(mScoreTeamB);
    }

    /**
     * Reset points for Team B
     */

    public void resetB(View view){
        mScoreTeamB = 0;
        displayForTeamB(mScoreTeamB);
    }
}
