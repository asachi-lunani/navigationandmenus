package com.marion.navigationandmenus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void home(View view) {
        Intent x=new Intent(this,HomeActivity.class);
        startActivity(x);
    }

    public void products(View view) {
        Intent x=new Intent(this,ProductsActivity.class);
        startActivity(x);
    }

    public void services(View view) {
        Intent x=new Intent(this,ServicesActivity.class);
        startActivity(x);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getTitle().toString().equalsIgnoreCase("help"))
        {
            Toast.makeText(this, "Help", Toast.LENGTH_SHORT).show();
        }
        else if (item.getTitle().toString().equalsIgnoreCase("Settings"))
        {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();

        }
        else if (item.getTitle().toString().equalsIgnoreCase("logout"))
        {
            Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);

    }

}
