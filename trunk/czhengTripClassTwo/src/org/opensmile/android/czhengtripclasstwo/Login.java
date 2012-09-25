package org.opensmile.android.czhengtripclasstwo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity {

	private SubmitClick subClick;
	
	{
		subClick = new SubmitClick();
	}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
      Button submit = (Button)findViewById(R.id.submit);
      submit.setOnClickListener(subClick);
    }
   
    
    public class SubmitClick implements OnClickListener {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			EditText nameText = (EditText)findViewById(R.id.name);
			String name = nameText.getText().toString();
			nameText = (EditText)findViewById(R.id.pwd);
			String passwd =nameText.getText().toString();
			System.out.println(name+"  :  "+passwd);
			TextView tip = (TextView)findViewById(R.id.tip);
			tip.setVisibility(View.VISIBLE);
			if("czheng".equals(name) && "123".equals(passwd)){
				tip.setText("success");
			}else{
				tip.setText("fail");
			}
		}
    	
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        return true;
    }
}
