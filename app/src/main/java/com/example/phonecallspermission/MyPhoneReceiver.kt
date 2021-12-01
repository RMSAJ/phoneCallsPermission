package com.example.phonecallspermission

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telecom.TelecomManager
import android.telephony.TelephonyManager
import android.widget.Toast

class MyPhoneReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        Toast.makeText(context, intent?.getStringExtra(TelephonyManager.EXTRA_STATE), Toast.LENGTH_SHORT).show()
    }
}