package com.gowhich.androidtogglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    private ToggleButton toggleButton;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = (ToggleButton) this.findViewById(R.id.toggleButton);
        linearLayout = (LinearLayout) this.findViewById(R.id.linearLayout);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    linearLayout.setOrientation(1);//表示垂直布局
                } else {
                    linearLayout.setOrientation(0);//表示横向布局
                }
            }
        });
    }
}
