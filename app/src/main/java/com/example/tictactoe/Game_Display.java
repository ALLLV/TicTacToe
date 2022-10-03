package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Game_Display extends AppCompatActivity {

    private TicTacToeBoard ticTacToeBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_display);

        Button playAgainBTN = findViewById(R.id.button3);
        Button homeBTN = findViewById(R.id.button4);
        TextView playerTurn = findViewById(R.id.textView5);

        playAgainBTN.setVisibility(View.GONE);
        homeBTN.setVisibility(View.GONE);

        String[] playerNames = getIntent().getStringArrayExtra("Player_Names");

        assert playerNames != null;
        if (playerNames[0].equals("")){

            playerTurn.setText("Player 1's turn");
        }
        else{
            playerTurn.setText((playerNames[0] + "'s turn"));
        }

        ticTacToeBoard = findViewById(R.id.ticTacToeBoard);

        ticTacToeBoard.setUpGame(playAgainBTN, homeBTN, playerTurn, playerNames);
    }

    public void homeButton_Click(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void againButton_Click(View view){
        ticTacToeBoard.resetGame();
        ticTacToeBoard.invalidate();
    }
}