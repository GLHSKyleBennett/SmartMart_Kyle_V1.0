package com.example.a02kylebennett.smartmart_kyle_v10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class Pets extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pets);

        Spinner spinner = (Spinner) findViewById(R.id.spinner50);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);
    }

    public void Search(View view) {
        Intent intent = new Intent(this, Selector_Spinner.class);
        Bundle bundle = new Bundle();
        bundle.putString("Selection", item);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public String item = "";

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        item = parent.getItemAtPosition(position).toString();


    }

    public void onNothingSelected(AdapterView<?> arg0) {

    }

    public void ITW(View view) {
        Intent intent = new Intent(this, ITW.class);
        startActivity(intent);
    }

    public void All_Firms(View view) {
        Intent intent = new Intent(this, All_Firms.class);
        startActivity(intent);
    }


}
