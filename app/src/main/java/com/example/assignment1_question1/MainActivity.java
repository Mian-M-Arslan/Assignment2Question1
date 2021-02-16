package com.example.assignment1_question1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 SearchView searchview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchview = (SearchView) findViewById(R.id.searchView);
        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(MainActivity.this,query,Toast.LENGTH_LONG).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });



    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.java:
                if (checked)
                {
                    Toast.makeText(MainActivity.this,"Java",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.android:
                if (checked)
                {
                    Toast.makeText(MainActivity.this,"Android",Toast.LENGTH_LONG).show();
                }
                 break;
            case R.id.xml:
                if (checked)
                {
                    Toast.makeText(MainActivity.this,"XML",Toast.LENGTH_LONG).show();
                }
                break;
            default:
                Toast.makeText(MainActivity.this,"Data Not Found",Toast.LENGTH_LONG).show();
        }
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.male:
                if (checked)
                {
                    Toast.makeText(MainActivity.this,"Male",Toast.LENGTH_LONG).show();
                }
                    break;
            case R.id.female:
                if (checked)
                    Toast.makeText(MainActivity.this,"Female",Toast.LENGTH_LONG).show();break;
        }
    }
}