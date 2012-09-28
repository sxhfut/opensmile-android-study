package org.opensmile.android.czhengtripclasstwo;

import android.R.color;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.webkit.WebSettings.TextSize;
import android.widget.TextView;

public class LoginTip  extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.activity_logintip);
		Intent intent = getIntent();
		TextView tv = (TextView)findViewById(R.id.welname);
		tv.setText(intent.getStringExtra("name"));
		tv.setBackgroundColor(color.background_dark);
		tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,50);
		super.onCreate(savedInstanceState);
	}
}
