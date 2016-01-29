package com.example.db;

import com.example.SystemUtil.SQLiteDBConfig;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.widget.Toast;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteDB extends SQLiteOpenHelper{
	private Context context;
	public SQLiteDB(Context context) {
		super(context, SQLiteDBConfig.DBNAME, null, SQLiteDBConfig.VERSION);
		this.context=context;
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(SQLiteDBConfig.CREATE_USER);
		Toast.makeText(context, "表格创建成功~", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	
}
