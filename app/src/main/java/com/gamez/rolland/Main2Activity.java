package com.gamez.rolland;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = new Intent(this, CustomService.class);
        this.startService(i);
    }
    public void process (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.button2){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.button3){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5813, 121.0082"));
            chooser = Intent.createChooser(i, "Select application");
            startActivity(chooser);
        }
    }
}