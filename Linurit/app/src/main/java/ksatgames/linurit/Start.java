package ksatgames.linurit;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Point;
import  android.view.Display;


/**
 * Created by aditi on 3/24/17.
 */

public class Start extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Typeface font = Typeface.createFromAsset(getAssets(),
                "DJStitchRegular.ttf");

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        float fontsize = width / 12;

        TextView title = (TextView) findViewById(R.id.Title);
        title.setTypeface(font);
        title.setTextSize(fontsize);

        TextView placeHolder = (TextView) findViewById(R.id.placeHolder);
        placeHolder.setTextSize(fontsize);

        Button play_button=(Button) findViewById(R.id.button_play);
        play_button.setTypeface(font);
        //play_button.setTextColor(rgb(255,255,255)); might be useful if we want offwhite
        play_button.setTextSize(fontsize);

        Button levels_button=(Button) findViewById(R.id.button_levels);
        levels_button.setTypeface(font);
        levels_button.setTextSize(fontsize);

        Button themes_button=(Button) findViewById(R.id.button_themes);
        themes_button.setTypeface(font);
        themes_button.setTextSize(fontsize);
    }

    public void play(View view) {
        Intent intent = new Intent(this, nextLevel.class);
        startActivity(intent);
    }

    public void levels(View view)  {
        Intent intent = new Intent(this, Levels.class);
        startActivity(intent);
    }

    public void themes(View view) {
        Intent intent = new Intent(this, Themes.class);
        startActivity(intent);
    }

    }
