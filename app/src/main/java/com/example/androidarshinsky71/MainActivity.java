package com.example.androidarshinsky71;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button[] buttons = new Button[11];
    private Button[] opbuttons = new Button[5];
    private Button[] spesbuttons = new Button[3];
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        textView = findViewById(R.id.textview);
        buttons[0] = (Button) findViewById(R.id.button0);
        buttons[1] = (Button) findViewById(R.id.button1);
        buttons[2] = (Button) findViewById(R.id.button2);
        buttons[3] = (Button) findViewById(R.id.button3);
        buttons[4] = (Button) findViewById(R.id.button4);
        buttons[5] = (Button) findViewById(R.id.button5);
        buttons[6] = (Button) findViewById(R.id.button6);
        buttons[7] = (Button) findViewById(R.id.button7);
        buttons[8] = (Button) findViewById(R.id.button8);
        buttons[9] = (Button) findViewById(R.id.button9);
        buttons[10] = (Button) findViewById(R.id.buttonDot);

        opbuttons[0] = (Button) findViewById(R.id.buttonmult);
        opbuttons[1] = (Button) findViewById(R.id.buttonminus);
        opbuttons[2] = (Button) findViewById(R.id.buttonplus);
        opbuttons[3] = (Button) findViewById(R.id.buttoneval);
        opbuttons[4] = (Button) findViewById(R.id.buttondiv);

        spesbuttons[0] = (Button) findViewById(R.id.buttonreset);
        spesbuttons[1] = (Button) findViewById(R.id.buttonsign);
        spesbuttons[2] = (Button) findViewById(R.id.buttonproc);

        buttons[0].setText(R.string._0);
        buttons[1].setText(R.string._1);
        buttons[2].setText(R.string._2);
        buttons[3].setText(R.string._3);
        buttons[4].setText(R.string._4);
        buttons[5].setText(R.string._5);
        buttons[6].setText(R.string._6);
        buttons[7].setText(R.string._7);
        buttons[8].setText(R.string._8);
        buttons[9].setText(R.string._9);
        buttons[10].setText(R.string._dot);

        opbuttons[0].setText(R.string._mult);
        opbuttons[1].setText(R.string._minus);
        opbuttons[2].setText(R.string._plus);
        opbuttons[3].setText(R.string._eval);
        opbuttons[4].setText(R.string._div);

        spesbuttons[0].setText(R.string._reset);
        spesbuttons[1].setText(R.string._sign);
        spesbuttons[2].setText(R.string._proc);

        for (int i = 0; i < buttons.length; i++) {

            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str = textView.getText().toString() + ((Button) v).getText().toString();
                    textView.setText(str);
                }
            });
        }
    }
}
