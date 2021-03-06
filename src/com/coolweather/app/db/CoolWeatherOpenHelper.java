package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	public CoolWeatherOpenHelper(Context context, String name, CursorFactory factory, int version) {
		// TODO Auto-generated constructor stub
		super(context, name, factory, version);
	}
	
	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	public static final String CREATE_PROVINCE = "create table Province (" +
			"id integer primary key autoincrement, " + 
			"province_name text, province_code text"; 
	
	public static final String CREATE_CITY = "create table City (" +
			"id integer primary key autoincrement, " +
			"city_name text, city_code text, province_id integer";
	
	public static final String CREATE_COUNTY = "create table county (" +
			"id integer primary key autoincrement, " +
			"county_name text, county_code text, city_id integer";
}
