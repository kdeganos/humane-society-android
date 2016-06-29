package com.epicodus.humanesociety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AdoptActivity extends AppCompatActivity {
    @Bind(R.id.petView) ListView mPetView;
    private static final String TAG = AdoptActivity.class.getSimpleName();
    private String[] pets = new String[] {"Buddy the Dog", "Jack the Rabbit", "Sammy the Kitty", "Roger the Lizard"};

    Pet[] petArray = {new Pet("Buddy the Dog", "9 months", "Male", "Golden", "10 lbs", R.drawable.buddy_dog),
            new Pet("Jack the Rabbit", "2 years", "Male", "Gray", "3 lbs", R.drawable.jack_rabbit),
            new Pet("Sammy the Kitty", "1 year", "Femae", "Ligtht Brown", "3 lbs", R.drawable.sammy_kitten),
            new Pet("Roger the Lizard", "3 years", "Male", "Blue", "1 lb", R.drawable.roger_lizard)};

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
        mPetView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(AdoptActivity.this, ProfileActivity.class);
                intent.putExtra("petObject", petArray[position]);

                startActivity(intent);
            }
        });

    }
}
