package com.example.phonegaptest;


import org.apache.cordova.Config;
import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        super.loadUrl(Config.getStartUrl());
		//super.loadUrl("file:///android_asset/www/index.html");
		////setContentView(R.layout.activity_main);
	}

	//@Override
	//public boolean onCreateOptionsMenu(Menu menu) {
	//	// Inflate the menu; this adds items to the action bar if it is present.
	//	getMenuInflater().inflate(R.menu.main, menu);
	//	return true;
	//}

}
