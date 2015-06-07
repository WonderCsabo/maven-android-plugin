package com.simpligility.android.helloflashlight;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableLayout;

/**
 * HelloFlashlight is a sample application for the usage of the Maven Android Plugin.
 * The code is trivial and not the focus of this example and therefore not really documented.
 *
 * @author Manfred Moser <manfred@simpligility.com>
 */
public class HelloFlashlight extends Activity {

	TableLayout table;
	Button redButton;
	Button greenButton;
	Button blueButton;
	Button blackButton;
	Button whiteButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // get all the view components
        table = (TableLayout) findViewById(R.id.Table);
        redButton = (Button) findViewById(R.id.ButtonRed);
        greenButton = (Button) findViewById(R.id.ButtonGreen);
        blueButton = (Button) findViewById(R.id.ButtonBlue);
        blackButton = (Button) findViewById(R.id.ButtonBlack);
        whiteButton = (Button) findViewById(R.id.ButtonWhite);

        // default the full screen to white
        table.setBackgroundColor(Color.WHITE);

        // hook up all the buttons with a table color change on click listener
        redButton.setOnClickListener(createListener(Color.RED));
        greenButton.setOnClickListener(createListener(Color.GREEN));
        blueButton.setOnClickListener(createListener(Color.BLUE));
        blackButton.setOnClickListener(createListener(Color.BLACK));
        whiteButton.setOnClickListener(createListener(Color.WHITE));
    }
    
    public OnClickListener createListener(final int color) {
    	return new BackgroundChanger(table, color);
    }

}
