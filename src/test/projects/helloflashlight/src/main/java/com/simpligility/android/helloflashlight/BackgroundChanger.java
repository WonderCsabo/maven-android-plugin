package com.simpligility.android.helloflashlight;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TableLayout;

/**
 * An OnClickListener that changes the color of the table.
 */
public class BackgroundChanger implements OnClickListener{

	private final TableLayout table;

	private final int color;

	public BackgroundChanger(TableLayout table, int color) {
		this.table = table;
		this.color = color;
	}

	public void onClick(View view) {
		//table.setBackgroundColor(color);
	}
}
