package com.example.bbugariu.myapplication;

import android.content.Context;
import android.support.v7.app.AlertDialog;

/**
 * Created by bbugariu on 9/10/2017.
 */

/**
 * Simple alert dialog
 */
class AlertHelper {

    AlertDialog build(int message, Context activity) {
        // Create a instance of AlertDialog.Builder
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);

        // Set object options
        alertDialogBuilder.setMessage(message).setCancelable(true);

        return alertDialogBuilder.create();
    }
}
