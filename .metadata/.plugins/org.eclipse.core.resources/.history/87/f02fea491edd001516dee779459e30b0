package com.maxf.main;

import com.maxf.myutil.ActivityCollects;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class BaseActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("BaseActivity", getClass().getSimpleName());
		ActivityCollects.addActivity(this);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		ActivityCollects.removeActivity(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_layout, menu);
		return true;
	}

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_settings:
			Toast.makeText(BaseActivity.this, "设置选项", Toast.LENGTH_SHORT).show();
			break;
		case R.id.menu_finishs:
			Log.d("Count", ActivityCollects.getCount()+"");
			ActivityCollects.finishAll();
			break;
		}
		return true;
	}
}
