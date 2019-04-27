package com.example.trafficlight3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView redImg;
    private ImageView yellowImg;
    private Button redBtn;
    private Button yellowBtn;
    private ImageView greenImg;
    private Button greenBtn;
    private Button offBtn;

    //==============================================//
    // this is the main method for all your codes  //
    //============================================//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //========================================================//
        // this is where we reference all our XML code for use   //
        //======================================================//

         redImg = findViewById(R.id.red);
        yellowImg = findViewById(R.id.yellow);
        greenImg = findViewById(R.id.green);

//        redBtn = findViewById(R.id.red_bt);
        yellowBtn = findViewById(R.id.yellow_bt);
        greenBtn = findViewById(R.id.green_bt);
        offBtn = findViewById(R.id.off_bt);

    }

    //=================================================//
    // this handles the click event when the red button//
    // is clicked                                      //
    //================================================//

    public void red(View v){

        redImg.setImageResource(R.drawable.red);
        yellowImg.setImageResource(R.drawable.offline);
        greenImg.setImageResource(R.drawable.offline);

    }

    //==================================================//
    // this handles the yellow button when it is clicked//
    //==================================================//

    public void yellow(View v){
        yellowImg.setImageResource(R.drawable.yellow);
        redImg.setImageResource(R.drawable.offline);
        greenImg.setImageResource(R.drawable.offline);
    }

    //=================================================//
    // this part handles the green button when clicked //
    //================================================//
    public void green(View v){
        redImg.setImageResource(R.drawable.offline);
        yellowImg.setImageResource(R.drawable.offline);
        greenImg.setImageResource(R.drawable.green);
    }

    //=================================================//
    // this part handles the off button when clicked  //
    //================================================//

     public void off (View v){
        redImg.setImageResource(R.drawable.offline);
         yellowImg.setImageResource(R.drawable.offline);
         greenImg.setImageResource(R.drawable.offline);

     }
}




