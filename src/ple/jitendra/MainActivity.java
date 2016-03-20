package ple.jitendra;

import android.app.*;
import android.content.Intent;
import android.os.*;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity{
	public void onCreate(Bundle sd)
	{
	super.onCreate(sd);
	
	 getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		        WindowManager.LayoutParams.FLAG_FULLSCREEN);
		    // Hide the Title bar of this activity screen
		    getWindow().requestFeature(Window.FEATURE_NO_TITLE);
		    setContentView(R.layout.splash);
		    new Handler().postDelayed(new Runnable()
			{

				@Override
				public void run() {
					// TODO Auto-generated method stub
					Intent i=new Intent("ple.jitendra.Splash");
					startActivity(i);
					finish();
				}
				
			},4000);
}

	
}