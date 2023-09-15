package com.example.widget_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private ImageView image;
    private TextView txtResult;
    private Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.btn_1);
        button2 = findViewById(R.id.btn_2);
        button3 = findViewById(R.id.btn_3);

        image = findViewById(R.id.img);
        txtResult = findViewById(R.id.txtResult);
        txtResult.setText("This is a dog");

        button1.setOnClickListener(new MyButton());
        button2.setOnClickListener(new MyButton());
        button3.setOnClickListener(new MyButton());


    }

    private class MyButton implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_1:
                    image.setImageResource(R.drawable.dog_1);
                    txtResult.setText("This is a dog1");
                    break;
                case R.id.btn_2:
                    image.setImageResource(R.drawable.dog_2);
                    txtResult.setText("This is dog2");
                    break;
                case R.id.btn_3:
                    image.setImageResource(R.drawable.dog_3);
                    txtResult.setText("This is Dog2");
                    break;
            }
        }
    }
}

