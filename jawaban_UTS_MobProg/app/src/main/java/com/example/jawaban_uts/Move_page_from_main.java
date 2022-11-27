package com.example.jawaban_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Move_page_from_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_page_from_main);
    }

    public void Pindah2(View view) {
        Intent intent = new Intent(Move_page_from_main.this, Page_2.class);
        startActivity(intent);
    }
}