package com.maxf.main;

import java.util.ArrayList;
import java.util.List;

import com.maxf.activity.SecondActivity;
import com.maxf.activity.ThirdActivity;
import com.maxf.model.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends BaseActivity implements OnClickListener {
	private Button secondActivity = null, thirdActivity = null;
	private Bundle bundle = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		secondActivity = (Button) findViewById(R.id.button_second);
		thirdActivity = (Button) findViewById(R.id.button_third);
		secondActivity.setOnClickListener(this);
		thirdActivity.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.button_second:
			Intent second = new Intent(MainActivity.this, SecondActivity.class);
			if (bundle == null) {
				bundle = new Bundle();
			}
			bundle.putString("USERNAME", "林榕青");
			bundle.putString("SEX", "女");
			bundle.putInt("AGE", 26);
			bundle.putString("ADDRESS", "福建省莆田市城厢区灵川镇张边村");
			//<<--1-->> 
			//second.putExtras(bundle);
			second.putExtra("BUNDLE", bundle);
			startActivity(second);
			break;
		case R.id.button_third:
			Intent third = new Intent(MainActivity.this, ThirdActivity.class);
			startActivity(third);
			break;
		}
	}

}
