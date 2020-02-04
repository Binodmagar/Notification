package com.binod.createchannel;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

public class CreateChannel {
    Context context;
    public final static  String CHANNEL_1 = "Channel1";
    public final static  String CHANNEL_2 = "Channel2";

    public CreateChannel(Context context){
        this.context = context;
    }

    public void createChannel(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel Channel = new NotificationChannel(CHANNEL_1, "Channel 1", NotificationManager.IMPORTANCE_HIGH);
            Channel.setDescription("This is channel 1");


            NotificationChannel Channel1 = new NotificationChannel(CHANNEL_2, "Channel 2", NotificationManager.IMPORTANCE_LOW);
            Channel1.setDescription("This is channel 2");


            NotificationManager manager = context.getSystemService(NotificationManager.class);
            manager.createNotificationChannel(Channel);
            manager.createNotificationChannel(Channel1);
        }
    }

}
