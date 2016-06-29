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

import butterknife.Bind;
import butterknife.ButterKnife;

public class AdoptActivity extends AppCompatActivity {
    @Bind(R.id.petView) ListView mPetView;
    private static final String TAG = AdoptActivity.class.getSimpleName();
    private String[] pets = new String[] {"Buddy the Dog", "Jack the Rabbit", "Sammy the Kitty", "Roger the Lizard"};
    private String[] ages = new String[] {"9 months", "2 years", "1 year", "3 years"};
    private String[] sex = new String[] {"Male", "Male", "Female", "Male"};
    private String[] color = new String[] {"Golden", "Gray", "Light Brown", "Blue"};
    private String[] weight = new String[] {"10 lbs", "3 lbs", "3 lbs", "1 lb"};
    private String[] imageLocation = new String [] {"../app/src/main/res/drawable/buddy_dog.jpg", "../app/src/main/res/drawable/jack_rabbit.jpg"
    , "../app/src/main/res/drawable/sammy_kitten.jpg", "../app/src/main/res/drawable/roger_lizard.jpg"};

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
                intent.putExtra("petName", pets[position]);
                intent.putExtra("age", ages[position]);
                intent.putExtra("sex", sex[position]);
                intent.putExtra("color", color[position]);
                intent.putExtra("weight", weight[position]);
                intent.putExtra("imageId", imageId[position].toString());
//                Log.d(TAG, imageId[position].toString());
                startActivity(intent);
//                Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

//
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, pets);
//        mPetView.setAdapter(adapter);
    }
}
