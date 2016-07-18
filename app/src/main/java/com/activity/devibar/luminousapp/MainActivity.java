package com.activity.devibar.luminousapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    private ToggleButton mbtn;
    private ImageView mImage1;
    private ImageView mImage2;



    public void addListenerOnButton(){
        mImage1 = (ImageView) findViewById(R.id.off);
        mbtn = (ToggleButton) findViewById(R.id.tglSwitch);

      mbtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
          @Override
          public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
              if(mbtn.isChecked()){
                  mImage1.setImageResource(R.drawable.on);
              }
              else{

                  mImage1.setImageResource(R.drawable.off);
              }
          }
      });


    }
}
