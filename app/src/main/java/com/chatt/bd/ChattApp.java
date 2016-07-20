package com.chatt.bd;

import android.app.Application;

import com.parse.Parse;

/**
 * The Class ChattApp is the Main Application class of this app. The onCreate
 * method of this class initializes the Parse.
 */
public class ChattApp extends Application
{

	/* (non-Javadoc)
	 * @see android.app.Application#onCreate()
	 */
	@Override
	public void onCreate()
	{
		super.onCreate();

		Parse.initialize(this, "7VxgdOvpzxJ36LAT2JWJAnAAj2kcjKV9qSnwANIh",
				"0fW0thCa533KJ2qgfZvuZbqnPdMo72cJ0YxPTOot");

	}
}
