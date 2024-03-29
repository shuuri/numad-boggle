package edu.madcourse.dancalacci;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;
import edu.neu.mobileClass.*;
import edu.madcourse.dancalacci.sudoku.*;
import edu.madcourse.dancalacci.boggle.*;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	// NUMAD Authorization
    	PhoneCheckAPI.doAuthorization(this);
    	
    	//starting the activity
        super.onCreate(savedInstanceState);     
        setContentView(R.layout.activity_main);
        setTitle("Dan Calacci");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    // Team Members Button etc. TODO
    public void OnTeamMembersButtonClicked(View v) {
    	Intent i = new Intent(this, TeamMembers.class);
    	startActivity(i);
    }
    
    public void OnCreateErrorButtonClicked(View v) {
    	// Throwing an error for create_error button
    	throw new RuntimeException("This intentional Error created by Create Error button.");
    }
    
    public void OnSudokuButtonClicked(View v) {
    	Intent i = new Intent(this, Sudoku.class);
    	startActivity(i);
    }
    
    public void OnBoggleButtonClicked(View v) {
    	Intent i = new Intent(this, Boggle.class);
    	startActivity(i);
    }
}
