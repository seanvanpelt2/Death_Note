package com.death_note_book.death.note;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.MenuItem;

public class Title_page extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_page);
        Typeface font1 = Typeface.createFromAsset(getAssets(), "Death_Note_Font.ttf");
        Typeface font2 = Typeface.createFromAsset(getAssets(), "Ryuk_Font.ttf");
        Typeface font3 = Typeface.createFromAsset(getAssets(), "Death_Note_Rules.ttf"); 
        //TextView view = (TextView) findViewById(R.id.title); 
        //view.setTypeface(font3); 
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
        case(R.id.menu_settings):
        	startActivity(new Intent(this, Rules_page.class));
        }
        return true;
    }
    
}
