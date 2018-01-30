package cf.redlyst.reservasi.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cf.redlyst.reservasi.R;

public class InputActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSubmit;
    private EditText ed_doctor_name, ed_doctor_schedule;
    private Toolbar toolbar;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnSubmit = findViewById(R.id.btnSubmit);
        ed_doctor_name = findViewById(R.id.ed_doctor_name);
        ed_doctor_schedule = findViewById(R.id.ed_doctor_schedule);


        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnSubmit) {
            Toast.makeText(this, "Clicked Function!", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
