package com.near_miss.learningapp.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class EditGalaxy extends ActionBarActivity {
    Button colonyButton, popButton, fleetButton, shipsButton;
    EditText colonyEdit, popEdit, fleetEdit, shipsEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_galaxy);
        instantiateUI();
        colonyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MainActivity.milkyWay.galaxyColonies = Long.parseLong(colonyEdit.getText().toString());
            }
        });
        popButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MainActivity.milkyWay.galaxyLifeforms = Long.parseLong(popEdit.getText().toString());
            }
        });
        fleetButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MainActivity.milkyWay.galaxyFleets = Integer.parseInt(fleetEdit.getText().toString());
            }
        });
        shipsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MainActivity.milkyWay.galaxyStarships = Integer.parseInt(shipsEdit.getText().toString());
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.edit_galaxy, menu);
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

    /**
     * Instantiate the value for ui elements from the Edit Galaxy view.
     */
    private void instantiateUI(){
        colonyButton = (Button)findViewById(R.id.submit_colony);
        popButton = (Button)findViewById(R.id.submit_pop);
        fleetButton = (Button)findViewById(R.id.submit_fleet);
        shipsButton = (Button)findViewById(R.id.submit_ships);
        colonyEdit = (EditText)findViewById(R.id.edit_colony);
        popEdit = (EditText)findViewById(R.id.edit_pop);
        fleetEdit = (EditText)findViewById(R.id.edit_fleet);
        shipsEdit = (EditText)findViewById(R.id.edit_ships);
    }

}
