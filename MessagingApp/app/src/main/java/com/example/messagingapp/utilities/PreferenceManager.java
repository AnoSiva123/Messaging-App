package com.example.messagingapp.utilities;

import android.content.Context;
import android.content.SharedPreferences;

// Helper class for managing shared preferences
public class PreferenceManager {

    private final SharedPreferences sharedPreferences;

    // Constructor
    public PreferenceManager(Context context) {
        sharedPreferences = context.getSharedPreferences(Constants.KEY_PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    // Save boolean value to shared preferences
    public void putBoolean(String key, Boolean value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    // Retrieve boolean value from shared preferences
    public Boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    // Save string value to shared preferences
    public void putString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    // Retrieve string value from shared preferences
    public String getString(String key) {
        return sharedPreferences.getString(key, null);
    }

    // Clear all preferences
    public void clear() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
}
