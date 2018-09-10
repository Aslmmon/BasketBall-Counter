package com.example.android.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button addOne,addTwo,addThree,resetTeamA,addoneTeamB,addtwoTeamB,addthreeTeamB,resetTeamB;
    TextView showResult,showResultTeamB;
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializingViews();
    }

    private void initializingViews() {
        addOne = findViewById(R.id.addOneTeamA);
        addOne.setOnClickListener(this);
        addTwo = findViewById(R.id.addTwoTeamA);
        addTwo.setOnClickListener(this);
        addThree = findViewById(R.id.addThreeTeamA);
        addThree.setOnClickListener(this);
        resetTeamA = findViewById(R.id.ResetTeamA);
        resetTeamA.setOnClickListener(this);
        addoneTeamB = findViewById(R.id.addOneTeamB);
        addoneTeamB.setOnClickListener(this);
        addtwoTeamB = findViewById(R.id.addTwoTeamB);
        addtwoTeamB.setOnClickListener(this);
        addthreeTeamB = findViewById(R.id.addThreeTeamB);
        addthreeTeamB.setOnClickListener(this);
        resetTeamB = findViewById(R.id.ResetTeamB);
        resetTeamB.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.addOneTeamA:
                scoreTeamA = scoreTeamA + 1;
                displayResultTeamA(scoreTeamA);
                break;
            case R.id.addTwoTeamA:
                scoreTeamA= scoreTeamA + 2;
                displayResultTeamA(scoreTeamA);
                break;
            case R.id.addThreeTeamA:
                scoreTeamA = scoreTeamA + 3;
                displayResultTeamA(scoreTeamA);
                break;
            case R.id.ResetTeamA:
                scoreTeamA = 0;
                displayResultTeamA(scoreTeamA);
                break;
            case R.id.addOneTeamB:
                scoreTeamB = scoreTeamB + 1;
                displayResultTeamB(scoreTeamB);
                break;
            case R.id.addTwoTeamB:
                scoreTeamB = scoreTeamB + 2;
                displayResultTeamB(scoreTeamB);
                break;
            case R.id.addThreeTeamB:
                scoreTeamB = scoreTeamB + 3;
                displayResultTeamB(scoreTeamB);
                break;
            case R.id.ResetTeamB:
                scoreTeamB = 0;
                displayResultTeamB(scoreTeamB);
                break;
        }
    }

    private void displayResultTeamA(int result) {
        showResult = findViewById(R.id.showResultTeamA);
        showResult.setText(String.valueOf(result));
    }
    private void displayResultTeamB(int result){
        showResultTeamB = findViewById(R.id.showResultTeamB);
        showResultTeamB.setText(String.valueOf(result));
    }
}
