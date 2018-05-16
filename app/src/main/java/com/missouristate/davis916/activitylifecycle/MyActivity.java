/*
 * Laura Davis CIS 262-902
 * 26 February 2018
 * This app demonstrates Android activities by demonstrating
 * callback methods accessed via certain actions like pressing
 * the Home button, rotating the screen, minimizing the app, etc.
 */
package com.missouristate.davis916.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    //Declare variables
    private String createMsg;
    private String startMsg;
    private String resumeMsg;
    private String pauseMsg;
    private String stopMsg;
    private String restartMsg;
    //Code from Android Developers @ https://developer.android.com/reference/android/util/Log.html
    private static final String MSG = "MyActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        initializeMessages();

        Toast.makeText(this, createMsg, Toast.LENGTH_LONG).show();
        Log.d(MSG, createMsg);

    }//end onCreate()

    //Initializes the methods by referencing entries in strings.xml
    private void initializeMessages(){
        createMsg = (String)
                getResources().getText(R.string.create_message);
        startMsg = (String)
                getResources().getText(R.string.start_message);
        resumeMsg = (String)
                getResources().getText(R.string.resume_message);
        pauseMsg = (String)
                getResources().getText(R.string.pause_message);
        stopMsg = (String)
                getResources().getText(R.string.stop_message);
        restartMsg = (String)
                getResources().getText(R.string.restart_message);

    }//end initializeMessages()

    /*
    Override method for the onStart Toast and
    its message when callback occurs
    The Log compiles log entries for debugging
    */
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, startMsg, Toast.LENGTH_LONG).show();
        Log.d(MSG, startMsg);
    }//end onStart()

    /*
    Override method for the onResume Toast and
    its message when callback occurs
    The Log compiles log entries for debugging
    */
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, resumeMsg, Toast.LENGTH_LONG).show();
        Log.d(MSG, resumeMsg);
    }//end onResume()

    /*
    Override method for the onPause Toast and
    its message when callback occurs
    The Log compiles log entries for debugging
    */
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, pauseMsg, Toast.LENGTH_LONG).show();
        Log.d(MSG, pauseMsg);
    }//end onPause()

    /*
    Override method for the onStop Toast and
    its message when callback occurs
    The Log compiles log entries for debugging
    */
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, stopMsg, Toast.LENGTH_LONG).show();
        Log.d(MSG, stopMsg);
    }//end onStop()

    /*
    Override method for the onRestart Toast and
    its message when callback occurs
    The Log compiles log entries for debugging
    */
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, restartMsg, Toast.LENGTH_LONG).show();
        Log.d(MSG, restartMsg);
    }//end onRestart()

    //Creates menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //Inflate the menu
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }//end onCreateOptionsMenu

    //Determines text displayed when menu is clicked
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        /* Handle action bar item clicks here.
         * The action bar will automatically handle clicks
         * on the Home/Up button so long as you specify
         * a parent activity in AndroidManifest.xml.
         */
        int id = item.getItemId();
        if (id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }//end onOptionsItemSelected()

}//end MyActivity
