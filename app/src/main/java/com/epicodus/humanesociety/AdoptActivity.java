package com.epicodus.humanesociety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AdoptActivity extends AppCompatActivity {
    @Bind(R.id.petView) ListView mPetView;
    private String[] pets = new String[] {"Buddy the Dog", "Jack the Rabbit", "Sammy the Kitty", "Roger the Lizard"};
    Integer[] imageId = {
            R.drawable.buddy_dog,
            R.drawable.jack_rabbit,
            R.drawable.sammy_kitten,
            R.drawable.roger_lizard,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt);
        ButterKnife.bind(this);
        CustomList adapter = new
                CustomList(AdoptActivity.this, pets, imageId);
        mPetView.setAdapter(adapter);

//
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, pets);
//        mPetView.setAdapter(adapter);
    }
}
