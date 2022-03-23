package com.example.radio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        RadioGroup rg;
        RadioButton b1, b2, b3;
    Button bm;
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      rg = (RadioGroup) findViewById(R.id.rgq);

      bm = (Button) findViewById(R.id.button);
      textView = findViewById(R.id.textView);
      imageView = findViewById(R.id.imageView);


        bm.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              switch (rg.getCheckedRadioButtonId()){
                  case R.id.radioButton:

                      imageView.setImageResource(R.drawable.crown);
                      break;
                  case R.id.radioButton2:
                      textView.setText(b2.getText().toString());
                      imageView.setImageResource(R.drawable.mark);
                      break;
                  case R.id.radioButton3:
                      textView.setText(b3.getText().toString());
                      imageView.setImageResource(R.drawable.evo);
                      break;
              }
          }
      });



    }
}