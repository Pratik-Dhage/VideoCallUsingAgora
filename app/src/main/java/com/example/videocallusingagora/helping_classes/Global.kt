package com.example.videocallusingagora.helping_classes

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import android.text.Layout
import android.text.TextUtils
import android.util.Patterns
import android.util.TypedValue
import android.view.View
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet
import com.example.videocallusingagora.R
import com.google.android.material.snackbar.Snackbar


object Global {

   /* val api_Service by lazy {
       RestClient.create()
    }*/

    fun showToast(context: Context, str:String){
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show()
    }

    fun showSnackBar(view: View, str : String){
        val snackBar : Snackbar = Snackbar.make(view,str,Snackbar.LENGTH_SHORT)
        snackBar.show()
    }

    fun isValidEmail(target: String): Boolean =
        !TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches()

    fun isValidCellPhone(number: String?): Boolean =
        Patterns.PHONE.matcher(number.toString()).matches()


   /* fun saveStringInSharedPref(context: Context, key: String, value: String) {
        SharedPreferenceHelper.writeString(context, key, value)
    }

    fun getStringFromSharedPref(context: Context, key: String): String {
        return SharedPreferenceHelper.getString(context, key, "") ?: ""
    }

    fun removeStringInSharedPref(context: Context, key: String) {
        SharedPreferenceHelper.writeString(context, key, "")
    }

    fun getLanguage(activity: Activity): String {
        return getStringFromSharedPref(activity, Constants.PREFS_APP_LANG)
    }*/
}