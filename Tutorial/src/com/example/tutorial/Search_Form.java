package com.example.tutorial;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class Search_Form extends Activity {

	protected String name, color, trait, classification, ability, trigger;
	protected int level, cost, power, soul;
	private EditText editText;
	private Spinner spinner;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search__form);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_search__form, menu);
		return true;
	}

	public void searchQuery(View view) {
		editText = (EditText) findViewById(R.id.name_text);
		name = editText.getText().toString();

		editText = (EditText) findViewById(R.id.trait_text);
		trait = editText.getText().toString();

		editText = (EditText) findViewById(R.id.ability_text);
		ability = editText.getText().toString();

		editText = (EditText) findViewById(R.id.cost_number);
		cost = Integer.valueOf(editText.getText().toString());

		editText = (EditText) findViewById(R.id.power_number);
		power = Integer.valueOf(editText.getText().toString());

		spinner = (Spinner) findViewById(R.id.soul_spinner);
		soul = Integer.valueOf(String.valueOf(spinner.getSelectedItem()));
		
		spinner = (Spinner) findViewById(R.id.trigger_spinner);
		trigger = String.valueOf(spinner.getSelectedItem());
		
		spinner = (Spinner) findViewById(R.id.classification_spinner);
		classification = String.valueOf(spinner.getSelectedItem());
		
		spinner = (Spinner) findViewById(R.id.level_spinner);
		level = Integer.valueOf(String.valueOf(spinner.getSelectedItem()));
		
		spinner = (Spinner) findViewById(R.id.color_spinner);
		color = String.valueOf(spinner.getSelectedItem());
		
	}

	public void clearAll(View view) {
		clear();
	}

	private void clear() {
		name = "";
		color = "";
		trait = "";
		classification = "";
		ability = "";
		level = 0;
		cost = 0;
		power = 0;
		soul = 0;
		trigger = "";
	}

}
