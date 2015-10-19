package com.example.maxwell.profileme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView firstname_text_view = (TextView) findViewById(R.id.firstname_view);
        TextView lastname_text_view = (TextView) findViewById(R.id.lastname_view);
        TextView gender_text_view = (TextView) findViewById(R.id.gender_view);
        TextView country_text_view = (TextView) findViewById(R.id.nation_view);

        Intent intent = getIntent();

        String usersFirstname = intent.getStringExtra(MainActivity.Fname).toString();
        String usersLastname = intent.getStringExtra(MainActivity.Lname).toString();
        String usersGender = intent.getStringExtra(MainActivity.Gname).toString();
        String usersCountry = intent.getStringExtra(MainActivity.Cname).toString();

        firstname_text_view.setText(usersFirstname);
        lastname_text_view.setText(usersLastname);
        gender_text_view.setText(usersGender);
        country_text_view.setText(usersCountry);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
