package com.example.leonardocavalera.football_counter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class NameSet extends AppCompatActivity {

    String team;

    EditText editField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_set);

        team = getIntent().getStringExtra("Team");

        editField = (EditText) findViewById(R.id.edit_field);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    //    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.save_button:
                Intent i = new Intent(this, MainActivity.class);
                i.putExtra("TeamSelected", team);
                i.putExtra("TeamName",  editField.getText().toString());
                startActivity(i);
                break;
        }

    }

}
