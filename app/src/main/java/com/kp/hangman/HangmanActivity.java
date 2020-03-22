package com.kp.hangman;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class HangmanActivity extends AppCompatActivity {
    protected String mystery_word;
    protected String guess_word;
    int gallows_state;
    String[] words;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        words = getResources().getStringArray(R.array.words);
    }


}