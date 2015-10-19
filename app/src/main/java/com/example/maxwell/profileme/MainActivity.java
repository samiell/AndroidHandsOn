package com.example.maxwell.profileme;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private String gender = "Male";
    public final static String Fname = "first_name";
    public final static String Lname = "last_name";
    public final static String Gname = "gender";
    public final static String Cname = "nationale";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        EditText first_name = (EditText) this.findViewById(R.id.firstname);
        EditText last_name = (EditText) this.findViewById(R.id.lastname);
        Spinner nationale = (Spinner) this.findViewById(R.id.country);

        Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
        intent.putExtra(Fname, first_name.getText().toString());
        intent.putExtra(Lname, last_name.getText().toString());
        intent.putExtra(Cname, nationale.getSelectedItem().toString());
        intent.putExtra(Gname, this.gender);
        startActivity(intent);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.female:
                if (checked)
                    this.gender = "Female";
                    break;
            case R.id.male:
                if (checked)
                    this.gender = "Male";
                    break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
