package com.boqii.android.app;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ActionBar bar = getActionBar();
		bar.setDisplayHomeAsUpEnabled(true); // œ‘ æHome∞¥≈•
		
		// bar.hide();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);

		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {

		case android.R.id.home:
			Intent intent = new Intent(this, TextActivity.class);
			intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
					| Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(intent);
			Toast.makeText(getApplicationContext(), "android.R.id.home", 0)
					.show();
			break;
		case R.id.saveBtn:
			Toast.makeText(getApplicationContext(), "menu_save..", 0).show();
			break;
		case R.id.moreBtn:
			Toast.makeText(getApplicationContext(), "more..", 0).show();
			break;
		case R.id.cancelBtn:
			break;
		case R.id.shareBtn:
			Toast.makeText(getApplicationContext(), "share..", 0).show();
			break;
		default:
			Toast.makeText(getApplicationContext(), "......", 0).show();
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
