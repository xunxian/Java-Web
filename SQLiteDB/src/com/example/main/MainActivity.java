package com.example.main;

import com.example.db.SQLiteDB;
import com.example.sqlitedb.R;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {
	private SQLiteDatabase db;
	private Button insertBtn, selectBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SQLiteDB dbHelper = new SQLiteDB(MainActivity.this);
		db = dbHelper.getWritableDatabase();
		insertBtn = (Button) findViewById(R.id.db_insert);
		insertBtn.setOnClickListener(this);
		selectBtn = (Button) findViewById(R.id.db_select);
		selectBtn.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.db_insert:
			ContentValues cv = new ContentValues();
			cv.put("username", "Maxfang");
			cv.put("password", "ant123456");
			db.insert("User", null, cv);
			break;
		case R.id.db_select:
			Log.d("SYS", "YOUMA");
			Cursor cs = db.query("User", null, null, null, null, null, null);
			Log.d("SYS", "YOUMA1");
			if (cs.moveToFirst()) {
				Log.d("SYS", "YOUMA2");
				for (int i = 0; i < cs.getCount(); i++) {
					Log.i("USER", "编号：" + cs.getString(0) + "用户名：" + cs.getString(1) + "密码：" + cs.getString(2));
					cs.moveToNext();
				}
			}
			break;
		}
	}

}
