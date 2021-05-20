package sg.edu.rp.c346.id20039529.l05_demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textViewInt);
        Intent i = getIntent();
        int value = i.getIntExtra("value", 0);
        tvAnswer.setText("Integer value recieved is " + value);
    }
}