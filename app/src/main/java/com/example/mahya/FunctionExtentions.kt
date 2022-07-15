package com.example.mahya

import android.app.Activity
import android.content.Context
import android.content.Intent

fun Context.intentCreator(targetActivity: Activity){
    startActivity(Intent(this,targetActivity::class.java))
}