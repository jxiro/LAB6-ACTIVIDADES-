package com.example.actividades;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        String msn = this.getIntent().getExtras().getString("msn");
        TextView txt =findViewById(R.id.textView);
        txt.setText(msn);
    }
    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(Actividad1.this, " ON START", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(Actividad1.this, "ON RESUME", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(Actividad1.this, "ON PAUSE", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(Actividad1.this, "ON STOP", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(Actividad1.this, "ON RESTART", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(Actividad1.this, "ON DESTROY GG", Toast.LENGTH_LONG).show();
    }

}
