package org.opensmile.android.czhengtripclassone;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity  extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other);
		TextView tv =(TextView)findViewById(R.id.otherTV);
		tv.setText("yes here is other");
	}
}
