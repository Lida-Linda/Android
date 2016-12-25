package com.example.lidiia.theasynctask;

import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    TextView myTextView;
    ProgressBar myProgressBar;
    MyClass myClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button)findViewById(R.id.btn_id);
        myTextView = (TextView)findViewById(R.id.tv_id);
        myProgressBar = (ProgressBar)findViewById(R.id.pb_id);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClass = new MyClass();
                myClass.execute();
            }
        });
    }

    class MyClass extends AsyncTask <Void, Integer, Integer> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            myProgressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected Integer doInBackground(Void... voids) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Random random = new Random();
            int randomColor = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));

            return randomColor;
        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
                myProgressBar.setVisibility(View.GONE);
                myTextView.setTextColor(integer);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }
    }
}
