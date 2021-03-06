package com.example.awea;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class HomeActivity extends ActionBarActivity {

	ArrayList<String> animalList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		initList();
		initDropdownSpinner();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void initList() {
		animalList.add("Cow");
		animalList.add("Pig");
	}
	
	public void initDropdownSpinner() {
		Spinner animalSpinner = (Spinner) findViewById(R.id.animalSpinner);
		ArrayAdapter<String> animalSpinnerAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, animalList);
		animalSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		animalSpinner.setAdapter(animalSpinnerAdapter);
	}
}
