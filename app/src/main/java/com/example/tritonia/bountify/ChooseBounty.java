package com.example.tritonia.bountify;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class ChooseBounty extends ActionBarActivity {

    ArrayList<String> bountyNameList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_bounty);
/*
        final ListView bountyList = (ListView)findViewById(R.id.huntListView);

        bountyNameList = new ArrayList<>();
        getTestName();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.activity_list_item, bountyNameList);

        bountyList.setAdapter(arrayAdapter);

        bountyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view.setSelected(true);

            }
        });

        */
        final Intent acceptBounty = new Intent(this, pregame.class);
        final Intent cancelBounty = new Intent(this, MainActivity.class);

        Button bountyAcceptBtn = (Button) findViewById(R.id.acceptHuntSelectionButton);
        Button bountyCancelBtn = (Button) findViewById(R.id.cancelHuntSelectionButton);

        bountyAcceptBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // get an image from the camera
                        startActivity(acceptBounty);
                    }
                }
        );

        bountyCancelBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // get an image from the camera
                        startActivity(cancelBounty);
                    }
                }
        );

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_bounty, menu);
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

    public void getTestName(){
        bountyNameList.add("Kamloops");
        bountyNameList.add("Vancouver");
        bountyNameList.add("Vernon");
        bountyNameList.add("Merrit");
        bountyNameList.add("Kelowna");
        bountyNameList.add("GP");

    }

}
