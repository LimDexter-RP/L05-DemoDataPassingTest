package sg.edu.rp.c346.id20039529.l05_demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tvAnswer1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAnswer1 = findViewById(R.id.textViewDouble);
        Intent i = getIntent();
        double decimal = i.getDoubleExtra("value1", 0);
        tvAnswer1.setText("Double value recieved is " + decimal);
    }
}