package com.example.lidiia.thethread;

import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    ProgressBar myProgressBar;
    TextView myTextView;
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = (TextView) findViewById(R.id.tv_id);
        myProgressBar = (ProgressBar) findViewById(R.id.progressBar_id);
        myButton = (Button) findViewById(R.id.button_id);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Handler handler = new Handler() {
                    @Override
                    public void handleMessage(Message msg) {
                        Bundle bundle = msg.getData();
                        int color = bundle.getInt("ThreadColor");
                        myTextView.setTextColor(color);
                    }
                };

                Thread myThread = new Thread(new Runnable() {
                    Random random = new Random();
                    Bundle bundle = new Bundle();
                    Message msg2 = handler.obtainMessage();

                    @Override
                    public void run() {
                        int randomColor = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
                        bundle.putInt("ThreadColor", randomColor);
                        msg2.setData(bundle);
                        handler.sendMessage(msg2);
                    }
                });
                myThread.start();
            }
        });


    }

}
