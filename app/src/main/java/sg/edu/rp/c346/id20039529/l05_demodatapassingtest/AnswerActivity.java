package sg.edu.rp.c346.id20039529.l05_demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import sg.edu.rp.c346.id20039529.l05_demodatapassingtest.R;

public class AnswerActivity extends AppCompatActivity {
    TextView tvShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvShow = findViewById(R.id.textViewAns);
        Intent i = getIntent();

        int value = i.getIntExtra("Value", 0);
        char letter = i.getCharExtra("Char", 'b');
        double decimal = i.getDoubleExtra("Decimal", 0.1);

        if(value != 0) {
            tvShow.setText("Integer value recieved is " + value);
        }else if (letter != 'b') {
            tvShow.setText("Character value recieved is " + letter);
        }else if (decimal != 0.1) {
            tvShow.setText("Double value recieved is " + decimal);
        }
    }
}