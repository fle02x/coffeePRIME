package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Window;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Preview extends AppCompatActivity {
    private Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_preview);
        go = (Button) findViewById(R.id.button);
    }
    public void go(View view){
        Intent intent = new Intent(Preview.this,MainActivity.class);
        startActivity(intent);
    }
}