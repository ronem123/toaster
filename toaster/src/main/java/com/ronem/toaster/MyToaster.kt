package com.ronem.toaster

import android.app.AlertDialog
import android.content.Context
import android.widget.Toast

/**
 * Created by Ram Mandal(ram.mandal@8squarei.com) on 11/4/2020.
 * Programmed on Dell Xps 15 9560
 */

fun showMessage(context: Context, msg: String, duration: Int) {
    Toast.makeText(context, msg, duration).show()
}

fun showAlertDialog(context: Context, title: String, message: String) {
    AlertDialog.Builder(context)
        .setTitle(title)
        .setMessage(message)
        .create().show()
}