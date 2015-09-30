package com.adybuciuman.aplicatiianimle;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

    Animal animal;
    ImageView imagine;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagine = (ImageView) findViewById(R.id.imagine_animal);
        text = (TextView) findViewById(R.id.textView);

    }


    public void creazaMaimuta(View view) {
        animal = new Maimuta("Maribel", 15, 50);
        updateLayout();
    }

    public void creazaTRex(View view) {
        animal = new TRex("Azor", 7000, -2_000_000, 3);
        updateLayout();
    }

    public void updateLayout() {
        text.setText(animal.toString());
        imagine.setImageResource(animal.getImageID());

    }


}
