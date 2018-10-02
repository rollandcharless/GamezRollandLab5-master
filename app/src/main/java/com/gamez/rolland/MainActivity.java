package com.gamez.rolland;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, CustomService.class);
        this.startService(i);
    }

    public void process (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.button){
            i = new Intent(this, Main2Activity.class);
            startActivity(i);
        } else if (v.getId() == R.id.act2Map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.589929, 120.975017"));
            chooser = Intent.createChooser(i, "Select application");
            startActivity(chooser);
        }
    }
}