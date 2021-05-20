package sg.edu.rp.c346.id20039529.l05_demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnPassInteger;
    Button btnPassChar;
    TextView textViewDouble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInteger = findViewById(R.id.buttonPassInteger);
        btnPassChar = findViewById(R.id.buttonPassChar);
        textViewDouble = findViewById(R.id.textViewDouble);

        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this, AnswerActivity.class);
                j.putExtra("Value", 1);
                startActivity(j);
            }
        });
        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this, AnswerActivity.class);
                x.putExtra("Char", 'a');
                startActivity(x);
            }
        });
        textViewDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AnswerActivity.class);
                i.putExtra("Decimal", 99.99);
                startActivity(i);
            }
        });

}}