package com.example.android.cricketscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAruns = 0;
    private int teamBruns = 0;
    private short teamAwickets = 0;
    private short teamBwickets = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFourTeamA(View v) {
        teamAruns += 4;
        displayRunsTeamA();
    }

    public void addSixTeamA(View v) {
        teamAruns += 6;
        displayRunsTeamA();
    }

    public void addOneTeamA(View v) {
        teamAruns += 1;
        displayRunsTeamA();
    }

    public void addFourTeamB(View v) {
        teamBruns += 4;
        displayRunsTeamB();
    }

    public void addSixTeamB(View v) {
        teamBruns += 6;
        displayRunsTeamB();
    }

    public void addOneTeamB(View v) {
        teamBruns += 1;
        displayRunsTeamB();
    }

    public void teamAout(View v) {
        teamAwickets += 1;
        displayWicketsTeamA();

        if(teamAwickets == 10)
            teamAtoggle(false);
    }

    public void teamBout(View v) {
        teamBwickets += 1;
        displayWicketsTeamB();

        if(teamBwickets == 10)
            teamBtoggle(false);
    }

    private void displayRunsTeamA() {
        TextView runView = (TextView) findViewById(R.id.team_a_runs);
        runView.setText(String.valueOf(teamAruns));
    }

    private void displayRunsTeamB() {
        TextView runView = (TextView) findViewById(R.id.team_b_runs);
        runView.setText(String.valueOf(teamBruns));
    }

    private void displayWicketsTeamA() {
        TextView wicketsView = (TextView) findViewById(R.id.team_a_wickets);
        wicketsView.setText(String.valueOf(teamAwickets));
    }

    private void displayWicketsTeamB() {
        TextView wicketsView = (TextView) findViewById(R.id.team_b_wickets);
        wicketsView.setText(String.valueOf(teamBwickets));
    }

    private void teamAtoggle(boolean flag) {
        Button teamAsix = (Button) findViewById(R.id.team_a_6);
        Button teamAfour = (Button) findViewById(R.id.team_a_4);
        Button teamAone = (Button) findViewById(R.id.team_a_1);
        Button teamAout = (Button) findViewById(R.id.team_a_out);
        teamAsix.setEnabled(flag);
        teamAfour.setEnabled(flag);
        teamAone.setEnabled(flag);
        teamAout.setEnabled(flag);
    }

    private void teamBtoggle(boolean flag) {
        Button teamBsix = (Button) findViewById(R.id.team_b_6);
        Button teamBfour = (Button) findViewById(R.id.team_b_4);
        Button teamBone = (Button) findViewById(R.id.team_b_1);
        Button teamBout = (Button) findViewById(R.id.team_b_out);
        teamBsix.setEnabled(flag);
        teamBfour.setEnabled(flag);
        teamBone.setEnabled(flag);
        teamBout.setEnabled(flag);
    }

    public void resetScore(View v) {
        teamAruns = 0;
        teamBruns = 0;
        teamAwickets = 0;
        teamBwickets = 0;

        displayRunsTeamA();
        displayRunsTeamB();
        displayWicketsTeamA();
        displayWicketsTeamB();

        teamAtoggle(true);
        teamBtoggle(true);
    }
}