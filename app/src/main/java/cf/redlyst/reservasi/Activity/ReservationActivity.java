package cf.redlyst.reservasi.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import cf.redlyst.reservasi.Data.DataMenu;
import cf.redlyst.reservasi.R;
import cf.redlyst.reservasi.RecyclerView.MenuAdapter;

public class ReservationActivity extends AppCompatActivity {
    RecyclerView rvMenu;
    MenuAdapter menuAdapter;
    GridLayoutManager gridMenu;
    List<DataMenu> menuList = new ArrayList<>();
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        statisJam();
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvMenu = findViewById(R.id.rv_menu);
        rvMenu.setHasFixedSize(true);

        gridMenu = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);

        rvMenu.setLayoutManager(gridMenu);
        menuAdapter = new MenuAdapter(menuList, this);
        rvMenu.setAdapter(menuAdapter);
    }

    private void statisJam() {
        menuList.add(new DataMenu("08:00-08:30", "AVAILABLE"));
        menuList.add(new DataMenu("08:30-09:00", "AVAILABLE"));
        menuList.add(new DataMenu("09:00-09:30", "AVAILABLE"));
        menuList.add(new DataMenu("09:30-10:00", "AVAILABLE"));
        menuList.add(new DataMenu("10:30-11:00", "AVAILABLE"));
        menuList.add(new DataMenu("11:00-11:30", "AVAILABLE"));
        menuList.add(new DataMenu("12:30-13:00", "AVAILABLE"));
        menuList.add(new DataMenu("13:00-13:30", "AVAILABLE"));
        menuList.add(new DataMenu("10:30-11:00", "AVAILABLE"));
        menuList.add(new DataMenu("11:00-11:30", "AVAILABLE"));
        menuList.add(new DataMenu("12:30-13:00", "AVAILABLE"));
        menuList.add(new DataMenu("13:00-13:30", "AVAILABLE"));
        menuList.add(new DataMenu("08:00-08:30", "AVAILABLE"));
        menuList.add(new DataMenu("08:30-09:00", "AVAILABLE"));
        menuList.add(new DataMenu("09:00-09:30", "AVAILABLE"));
        menuList.add(new DataMenu("09:30-10:00", "AVAILABLE"));


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
