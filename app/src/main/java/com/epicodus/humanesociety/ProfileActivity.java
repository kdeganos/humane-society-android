package com.epicodus.humanesociety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;


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

        Pet pet = getIntent().getParcelableExtra("petObject");

        mPetNameView.setText(pet.mName);
        mPetImageView.setImageResource(pet.mImageId);
        mPetAgeView.setText("Age: " + pet.mAge + " old");
        mPetSexView.setText("Sex: " + pet.mSex);
        mPetColorView.setText("Color: " + pet.mColor);
        mPetWeightView.setText("Weight: " + pet.mWeight);

    }
}
