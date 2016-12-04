package com.example.jellybean.nbatalent;
//Created By Javier Kirksey on Dec. 4th, 2016

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NBA_DetailActivity extends AppCompatActivity {

    ImageView img;
    TextView nameTxt;
    TextView descTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_detail);

        //Receive Our Data
        Intent i = getIntent();
        final String name = i.getExtras().getString("Name");
        final String description = i.getExtras().getString("Description");
        final int images = i.getExtras().getInt("Image");

        //Referance each variable to the proper object within the .XML files
        img = (ImageView) findViewById(R.id.playerImage);
        nameTxt= (TextView) findViewById(R.id.nameTxt);
        descTxt = (TextView) findViewById(R.id.descTxt);

        //Here We are assigning data to those Views
        img.setImageResource(images);
        nameTxt.setText(name);
        //put pos back in here
        descTxt.setText(description);

    }
}