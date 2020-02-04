package com.binod.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class BroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean noConn;

        if(ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){
            noConn = intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY, false);
            if (noConn){
                Toast.makeText(context, "Disconnect", Toast.LENGTH_SHORT).show();
            } else{
                Toast.makeText(context, "Connect", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
