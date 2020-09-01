package com.example.logandregister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid= findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);

    }
    private void setSingleEvent(GridLayout mainGrid){

        for (int i= 0; i<mainGrid.getChildCount(); i++){
            CardView cardView= (CardView) mainGrid.getChildAt(i);

            final int finalI= i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI==0){
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                    }
                    else if(finalI==1){
                        startActivity(new Intent(getApplicationContext(), tictactoe.class));
                    }
                    else if(finalI==2){
                        startActivity(new Intent(getApplicationContext(), bottleflip.class));
                    }
                    else if(finalI==3){
                        startActivity(new Intent(getApplicationContext(), Mapactivity.class));
                    }
                }
            });
        }

    }
}