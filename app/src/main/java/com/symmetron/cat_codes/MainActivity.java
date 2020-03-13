package com.symmetron.cat_codes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goto301button = findViewById(R.id.button_goto_301);
        Button goto302button = findViewById(R.id.button_goto_302);
        Button goto503button = findViewById(R.id.button_goto_503);

        goto301button.setOnClickListener(this);
        goto302button.setOnClickListener(this);
        goto503button.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button_goto_301){
            Intent intent = new Intent(this, Error301Activity.class);
            intent.putExtra("message","Hello from menu");
            startActivity(intent);
        }

        if (v.getId()==R.id.button_goto_302){
            Intent intent = new Intent(this, Error302Activity.class);
            intent.putExtra("message","Hello from menu");
            startActivity(intent);
        }

        if (v.getId()==R.id.button_goto_503){
            Intent intent = new Intent(this, Error503Activity.class);
            intent.putExtra("message","Hello from menu");
            startActivity(intent);
        }

    }
}
