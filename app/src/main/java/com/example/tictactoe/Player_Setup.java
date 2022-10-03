package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Player_Setup extends AppCompatActivity {

    private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_setup);

        player1 = findViewById(R.id.player1Name);
        player2 = findViewById(R.id.player2Name);
    }

    public void submitButton_Click(View view){
        String playerOneName = player1.getText().toString();
        String playerTwoName = player2.getText().toString();

        Intent intent = new Intent(this, Game_Display.class);
        intent.putExtra("Player_Names", new String[] {playerOneName, playerTwoName});
        startActivity(intent);
    }
}