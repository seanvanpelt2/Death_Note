package com.death_note_book.death.note;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.text.Html;

public class Rules_page extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules_page);
        Typeface font1 = Typeface.createFromAsset(getAssets(), "Death_Note_Font.ttf"); 
        Typeface font2 = Typeface.createFromAsset(getAssets(), "Ryuk_Font.ttf");
        Typeface font3 = Typeface.createFromAsset(getAssets(), "Death_Note_Rules.ttf"); 
        TextView view = (TextView) findViewById(R.id.rules); 
        view.setTypeface(font3); 
        
        TextView foo = (TextView)findViewById(R.id.rules);
        foo.setText(Html.fromHtml(getString(R.string.rules_list)));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
   
    
}
