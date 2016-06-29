package com.epicodus.humanesociety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

import static java.lang.Integer.parseInt;

public class ProfileActivity extends AppCompatActivity {
    @Bind(R.id.petNameView) TextView mPetNameView;
    @Bind(R.id.petImageView) ImageView mPetImageView;
    @Bind(R.id.petAgeView) TextView mPetAgeView;
    @Bind(R.id.petSexView) TextView mPetSexView;
    @Bind(R.id.petColorView) TextView mPetColorView;
    @Bind(R.id.petWeightView) TextView mPetWeightView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String petName = intent.getStringExtra("petName");
        String age = intent.getStringExtra("age");
        String sex = intent.getStringExtra("sex");
        String color = intent.getStringExtra("color");
        String weight = intent.getStringExtra("weight");
        String imageId = intent.getStringExtra("imageId");

        mPetNameView.setText(petName);
        mPetImageView.setImageResource(parseInt(imageId));
        mPetAgeView.setText("Age: " + age + " old");
        mPetSexView.setText("Sex: " + sex);
        mPetColorView.setText("Color: " + color);
        mPetWeightView.setText("Weight: " + weight);


    }
}
