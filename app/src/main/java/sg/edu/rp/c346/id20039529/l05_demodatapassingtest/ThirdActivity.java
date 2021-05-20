package sg.edu.rp.c346.id20039529.l05_demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tvAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAns = findViewById(R.id.textViewChar);
        Intent i = getIntent();
        String letter = i.getStringExtra("Char");
        tvAns.setText("Character value recieved is " + letter);
    }
}