package jaeoh.johnjayonetouch;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.analytics.Tracker;

import jaeoh.johnjayonetouch.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    public void onClick01 (View v) {
        Intent intent_1 = new Intent (getApplicationContext(),view_email.class);
        startActivity(intent_1);
    }

    public void onClick02 (View v) {
        Intent intent_2 = new Intent (getApplicationContext(),view_blackboard.class);
        startActivity(intent_2);
    }


    public void onClick03 (View v) {
        Intent intent_3 = new Intent (getApplicationContext(),view_cunyfirst.class);
        startActivity(intent_3);
    }

    public void onClick04 (View v) {
        Intent intent_4 = new Intent (getApplicationContext(), contact.class);
        startActivity(intent_4);
    }

}



