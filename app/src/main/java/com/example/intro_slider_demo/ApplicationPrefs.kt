package com.example.intro_slider_demo
import android.content.SharedPreferences
import android.provider.SyncStateContract

class ApplicationPrefs {

    private val mPreferences: SharedPreferences = App.self().getSharedPreferences(
        SyncStateContract.Constants.ACCOUNT_NAME, 0
    )

    fun isNotFirstTime(): Boolean {
        return mPreferences.getBoolean("IS_FIRST_TIME", false)
    }

    fun setNotFirstTime(b: Boolean) {
        val mEditor = mPreferences.edit()
        mEditor.putBoolean("IS_FIRST_TIME", b).apply()
    }
}