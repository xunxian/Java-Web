package com.example.main;

import com.example.db.SQLiteDB;
import com.example.sqlitedb.R;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
public class MainActivity extends Activity implements OnClickListener{
	private SQLiteDatabase db;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SQLiteDB dbHelper=new SQLiteDB(MainActivity.this);
		db=dbHelper.getWritableDatabase();
		Button insertBtn=(Button) findViewById(R.id.db_insert);
		insertBtn.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View view) {
		switch(view.getId())
		{
		case R.id.db_insert:
			ContentValues cv=new ContentValues();
			cv.put("username", "Maxfang");
			cv.put("password", "ant123456");
			db.insert("User", null, cv);
			break;
		}
	}

}
