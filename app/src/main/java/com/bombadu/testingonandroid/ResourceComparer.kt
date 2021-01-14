package com.bombadu.testingonandroid

import android.content.Context
import android.content.LocusId

class ResourceComparer {

    fun isEqual(context: Context, resId: Int, string: String) : Boolean {
        return context.getString(resId) == string
    }
}