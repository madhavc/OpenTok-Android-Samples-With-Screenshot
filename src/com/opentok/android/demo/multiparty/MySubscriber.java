package com.opentok.android.demo.multiparty;

import android.content.Context;

import com.opentok.android.Stream;
import com.opentok.android.Subscriber;
import com.opentok.android.demo.video.CustomVideoRenderer;

public class MySubscriber extends Subscriber {

    private String userId;
    private String name;
    private CustomVideoRenderer renderer;
        
    public MySubscriber(Context context, Stream stream) {
        super(context, stream);
        // With the userId we can query our own database
        // to extract player information
        setName("User" + ((int)(Math.random()*1000)));
        
        renderer = new CustomVideoRenderer(context);
        setRenderer(renderer);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String name) {
        this.userId = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void saveScreenshot() {
    	if(renderer != null) {
    		renderer.saveScreenshot();
    	}
    	
    }
}
