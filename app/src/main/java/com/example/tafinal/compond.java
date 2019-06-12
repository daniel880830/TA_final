package com.example.tafinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class compond extends AppCompatActivity {
    private TextView tvMessage;
    private RadioGroup rgGender;
    private Switch swWifi;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compond);
        findViews();
    }

    private void findViews() {
        tvMessage = (TextView) findViewById(R.id.tvMessage);
        rgGender = (RadioGroup) findViewById(R.id.rgGender);
        swWifi = (Switch) findViewById(R.id.swWifi);

        rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton) group
                        .findViewById(checkedId);
                tvMessage.setText(radioButton.getText());
            }
        });

        swWifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                Switch sw = (Switch) buttonView;
                String swName = sw.getText().toString();
                String message = "";
                if (isChecked) {
                    message += swName + " " + sw.getTextOn();
                } else {
                    message += swName + " " + sw.getTextOff();
                }
                tvMessage.setText(message);
            }
        });
    }
}