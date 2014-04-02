package com.boqii.android.app;

import com.boqii.android.widget.CustomRoundProgressBar;

import android.app.Activity;
import android.content.res.Resources.Theme;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class TextActivity extends Activity {
	
	private CustomRoundProgressBar bar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.test);
		
		bar=(CustomRoundProgressBar) findViewById(R.id.roundProgressBar2);
		bar.setMax(100);
		new Thread(new Runnable() {
			public void run() {
				
				while(true){
					
					Message message= mHandler.obtainMessage();
					mHandler.sendMessage(message);
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			
			}
		}).start();
	}

	int p=0;
	
	Handler mHandler=new Handler(){
		public void handleMessage(Message msg) {
			p++;
			bar.setProgress(p);
			
		};
	};
}
