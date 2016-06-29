package com.epicodus.humanesociety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.adoptButton) Button mAdoptButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mAdoptButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mAdoptButton) {
            Intent intent = new Intent(MainActivity.this, AdoptActivity.class);
            startActivity(intent);
        }
    }
}
