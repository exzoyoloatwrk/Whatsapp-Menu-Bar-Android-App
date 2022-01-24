package com.example.whatappmenu;

import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuInflater;
import android.view.Menu;


import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu,menu);
        return true;
    }
    public boolean onOptionItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.f1:
                Toast.makeText(this, "New Group",Toast.LENGTH_LONG).show();
                return true;
            case R.id.d1:
                Toast.makeText(this, "New broadcast",Toast.LENGTH_LONG).show();
                return true;
            case R.id.cg1:
                Toast.makeText(this, "Linked devices",Toast.LENGTH_LONG).show();
                return true;
            case R.id.s1:
                Toast.makeText(this, "Paytm",Toast.LENGTH_LONG).show();
                return true;
            case R.id.smsg:
                Toast.makeText(this, "Starred Messages",Toast.LENGTH_LONG).show();
                return true;
            case R.id.sett:
                Toast.makeText(this, "Settings",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}