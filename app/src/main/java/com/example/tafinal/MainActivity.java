package com.example.tafinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View view){
        Intent intent = new Intent(this, life.class);
        startActivity(intent);
    }
    public void click2(View view){
        Intent intent = new Intent(this, scrollView.class);
        startActivity(intent);
    }
    public void click3(View view){
        Intent intent = new Intent(this, webView.class);
        startActivity(intent);
    }
    public void click4(View view){
        Intent intent = new Intent(this, ratingBar.class);
        startActivity(intent);
    }
    public void click5(View view){
        Intent intent = new Intent(this, seekBar.class);
        startActivity(intent);
    }
    public void click6(View view){
        Intent intent = new Intent(this, compond.class);
        startActivity(intent);
    }
    public void click7(View view){
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
    }
    public void click8(View view){
        Intent intent = new Intent(this, spinner.class);
        startActivity(intent);
    }
}
