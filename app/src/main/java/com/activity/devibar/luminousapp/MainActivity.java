package com.activity.devibar.luminousapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    private Button mbtn;
    private ImageView mImage1;
    private ImageView mImage2;



    public void addListenerOnButton(){
        mImage1 = (ImageView) findViewById(R.id.off);
        mbtn = (Button) findViewById(R.id.btnSwitch);


        mbtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mbtn.getText()=="ON"){
                    mImage1.setImageResource(R.drawable.on);
                    mbtn.setText("Off");
                }
                else {
                    mImage1.setImageResource(R.drawable.off);
                    mbtn.setText("ON");

                }





            }
        });


    }
}
