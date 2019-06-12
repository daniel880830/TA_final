package com.example.tafinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class seekBar extends AppCompatActivity {
    private TextView tvText1;
    private SeekBar sbSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seekbar);
        findViews();
    }

    private void findViews() {
        tvText1 = (TextView) findViewById(R.id.tvText1);
        sbSize = (SeekBar) findViewById(R.id.sbSize);

        sbSize.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvText1.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(seekBar.this, "start size = " + seekBar.getProgress(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(seekBar.this, "stop size = " + seekBar.getProgress(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
