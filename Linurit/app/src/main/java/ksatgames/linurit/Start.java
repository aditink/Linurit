package ksatgames.linurit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.graphics.Typeface;
import android.widget.TextView;
import android.graphics.Point;
import  android.view.Display;

/**
 * Created by aditi on 3/24/17.
 */

public class Start extends AppCompatActivity{
    @Override
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
        float fontsize=width/12;

        TextView title=(TextView)findViewById(R.id.Title);
        title.setTypeface(font);
        title.setTextSize(fontsize);



    }
}
