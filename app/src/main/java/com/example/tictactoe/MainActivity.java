package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView img1IV, img2IV, img3IV, img4IV, img5IV, img6IV, img7IV, img8IV, img9IV;
    private Button playagainBT;

    int count = 0;

    int[] click = new int[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1IV = findViewById(R.id.img1);
        img2IV = findViewById(R.id.img2);
        img3IV = findViewById(R.id.img3);
        img4IV = findViewById(R.id.img4);
        img5IV = findViewById(R.id.img5);
        img6IV = findViewById(R.id.img6);
        img7IV = findViewById(R.id.img7);
        img8IV = findViewById(R.id.img8);
        img9IV = findViewById(R.id.img9);

        playagainBT = findViewById(R.id.PlayAgain);

        final int done = R.drawable.ic_done;
        final int close  = R.drawable.ic_close;

        img1IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (click[0] == 1){
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
                else{
                    if (count == 0){
                        img1IV.setImageResource(done);
                        count = 1;
                    }
                    else{
                        img1IV.setImageResource(close);
                        count = 0;
                    }
                }
                click[0] = 1;
            }
        });

        img2IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click[1] == 2){
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (count == 0){
                        img2IV.setImageResource(done);
                        count = 1;
                    }
                    else{
                        img2IV.setImageResource(close);
                        count = 0;
                    }
                }
                click[1] = 2;
            }
        });

        img3IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click[2] == 3){
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (count == 0) {
                        img3IV.setImageResource(done);
                        count = 1;
                    } else {
                        img3IV.setImageResource(close);
                        count = 0;
                    }

                }
                click[2] = 3;

            }
        });

        img4IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click[3] == 4){
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (count == 0) {
                        img4IV.setImageResource(done);
                        count = 1;
                    } else {
                        img4IV.setImageResource(close);
                        count = 0;
                    }
                }
                click[3] =4;

            }
        });

        img5IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click[4] == 5){
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (count == 0) {
                        img5IV.setImageResource(done);
                        count = 1;
                    } else {
                        img5IV.setImageResource(close);
                        count = 0;
                    }
                }
                click[4] = 5;

            }
        });

        img6IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click[5] == 6){
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (count == 0) {
                        img6IV.setImageResource(done);
                        count = 1;
                    } else {
                        img6IV.setImageResource(close);
                        count = 0;
                    }
                }
                click[5] = 6;

            }
        });

        img7IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click[6] == 7){
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (count == 0) {
                        img7IV.setImageResource(done);
                        count = 1;
                    } else {
                        img7IV.setImageResource(close);
                        count = 0;
                    }
                }
                click[6] = 7;
            }
        });

        img8IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click[7] == 8){
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (count == 0) {
                        img8IV.setImageResource(done);
                        count = 1;
                    } else {
                        img8IV.setImageResource(close);
                        count = 0;
                    }
                }
                click[7] = 8;

            }
        });

        img9IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click[8] == 9){
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (count == 0) {
                        img9IV.setImageResource(done);
                        count = 1;
                    } else {
                        img9IV.setImageResource(close);
                        count = 0;
                    }
                }
                click[8] = 9;

            }
        });

        playagainBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                img1IV.setImageResource(R.drawable.finger);
                img2IV.setImageResource(R.drawable.finger);
                img3IV.setImageResource(R.drawable.finger);
                img4IV.setImageResource(R.drawable.finger);
                img5IV.setImageResource(R.drawable.finger);
                img6IV.setImageResource(R.drawable.finger);
                img7IV.setImageResource(R.drawable.finger);
                img8IV.setImageResource(R.drawable.finger);
                img9IV.setImageResource(R.drawable.finger);

                count = 0;

                click = new int[9];

            }
        });


    }

}
