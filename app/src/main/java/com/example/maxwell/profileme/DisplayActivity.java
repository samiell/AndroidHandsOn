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

        TextView fnameView = (TextView) findViewById(R.id.firstname_view);
        TextView lnameView = (TextView) findViewById(R.id.lastname_view);
        TextView gnameView = (TextView) findViewById(R.id.gender_view);
        TextView nationView = (TextView) findViewById(R.id.nation_view);

        Intent intent = getIntent();
        if(fnameView != null) fnameView.setText(intent.getStringExtra(MainActivity.Fname).toString());
        if(lnameView != null) lnameView.setText(intent.getStringExtra(MainActivity.Lname).toString());
        if(gnameView != null) gnameView.setText(intent.getStringExtra(MainActivity.Gname).toString());
        if(nationView != null) nationView.setText(intent.getStringExtra(MainActivity.Fname).toString());

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
