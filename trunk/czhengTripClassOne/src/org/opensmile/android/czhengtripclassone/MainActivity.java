package org.opensmile.android.czhengtripclassone;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView mainTV = (TextView) findViewById(R.id.mainTV);
		mainTV.setText("czheng Trip Main TextView");
		Button mainBT = (Button) findViewById(R.id.mainBT);
		mainBT.setText("Button client");
		mainBT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Button bt = (Button) v;

				CharSequence cs = bt.getText();
				String str = cs.toString();
				if (str.contains("click")) {
					bt.setText(cs + " again");
				} else {
					bt.setText("ye! are you click it");
				}
				
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, OtherActivity.class);
				MainActivity.this.startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
