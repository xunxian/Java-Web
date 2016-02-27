package com.maxf.activity;

import com.maxf.main.BaseActivity;

import com.maxf.main.R;
import com.maxf.myutil.ActivityCollects;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_layout);
		Log.d("Count", ActivityCollects.getCount()+"");
		TextView text_user = (TextView) findViewById(R.id.text_id_user);
		Intent intent = this.getIntent();
		// <<--1-->>
		// Bundle bundle = intent.getExtras();
		// <<--2-->>
		Bundle bundle = intent.getBundleExtra("BUNDLE");
		String user = bundle.getString("USERNAME") + "\n" + bundle.getString("SEX") + "\n" + bundle.getInt("AGE") + "\n"
				+ bundle.getString("ADDRESS");
		text_user.setText(user);
	}
}
