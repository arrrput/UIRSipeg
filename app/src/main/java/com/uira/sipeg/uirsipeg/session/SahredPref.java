package com.uira.sipeg.uirsipeg.session;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by ari putra on 12/2/2016.
 */

public class SahredPref {

    private static String TAG = SahredPref.class.getSimpleName();

    SharedPreferences pref;

    SharedPreferences.Editor editor;
    Context _context;

    // Shared pref mode awal
    int PRIVATE_MODE = 0;

    private static final String PREF_NAME = "AndroidLogin";
    private static final String KEY_IS_LOGGEDIN = "isLoggedIn";

    public SahredPref(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setLogin(boolean isLoggedIn) {

        editor.putBoolean(KEY_IS_LOGGEDIN, isLoggedIn);
        editor.commit();

        Log.d(TAG, "User login session telah dirubah!");
    }

    public boolean isLoggedIn(){
        return pref.getBoolean(KEY_IS_LOGGEDIN, false);
    }
}
