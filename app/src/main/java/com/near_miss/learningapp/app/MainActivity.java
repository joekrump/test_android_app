package com.near_miss.learningapp.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    Galaxy milkyWay = new Galaxy("Milky Way", 511, 97);
    TextView nameData;
    TextView solarData;
    TextView habitData;
    TextView colonyData;
    TextView popData;
    TextView fleetData;
    TextView shipsData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createDefaultGalaxy();
        createUITextViews();
        transferDataValues();
    }

    private void createUITextViews() {
        nameData = (TextView)findViewById(R.id.name);
        solarData = (TextView)findViewById(R.id.solar);
        habitData = (TextView)findViewById(R.id.habit);
        colonyData = (TextView)findViewById(R.id.colony);
        popData = (TextView)findViewById(R.id.pop);
        fleetData = (TextView)findViewById(R.id.fleet);
        shipsData = (TextView)findViewById(R.id.ships);
    }

    private void transferDataValues() {
        nameData.setText(milkyWay.galaxyName);
        solarData.setText(Integer.toString(milkyWay.getGalaxySolarSystems()));
        habitData.setText(Integer.toString(milkyWay.galaxyPlanets));
        colonyData.setText(Long.toString(milkyWay.galaxyColonies));
        popData.setText(Double.toString(milkyWay.galaxyLifeforms));
        fleetData.setText(Integer.toString(milkyWay.galaxyFleets));
        shipsData.setText(Integer.toString(milkyWay.galaxyStarships));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * Creates a Galaxy with some default values.
     */
    private void createDefaultGalaxy(){
        milkyWay.setGalaxyColonies(37579321);
        milkyWay.setGalaxyPopulation(1967387132);
        milkyWay.setGalaxyFleets(237);
        milkyWay.setGalaxyStarships(34769);
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

}
