package cf.redlyst.reservasi.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cf.redlyst.reservasi.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnInput, btnReservation;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnInput = findViewById(R.id.btnInput);
        btnReservation = findViewById(R.id.btnReservation);

        btnInput.setOnClickListener(this);
        btnReservation.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnInput) {
            startActivity(new Intent(this, InputActivity.class));
        }

        if (v == btnReservation) {
            startActivity(new Intent(this, ReservationActivity.class));
        }
    }
}
