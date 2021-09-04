package com.example.burggerratingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar=findViewById(R.id.ratingBar);
        textView=findViewById(R.id.textView);

    }
    public void submit(View view){
        float ratingvalue=ratingBar.getRating();

        if (ratingvalue>=0.5 && ratingvalue<=2){
            textView.setText(" Rating: "  + ratingvalue + "\n We Will Better Next Time ");
        }
        else if(ratingvalue>2 && ratingvalue<3){
            textView.setText(" Rating: " + ratingvalue +"\n We Will Improving Day By Day ");

        }
        else if (ratingvalue>=3 && ratingvalue<=4){
            textView.setText(" Rating: " + ratingvalue +"\n We Will Improving As Wish You Want ");

        }else{
            textView.setText(" Rating: " +ratingvalue+"\n Thanks For Your Rating \n We Will Being Permanent Like This ");

        }


    }
}