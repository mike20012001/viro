/**
 * Copyright © 2016 Viro Media. All rights reserved.
 */
package com.viromedia.bridge.component;

import android.support.annotation.Nullable;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.viromedia.bridge.utility.ViroEvents;

import java.util.Map;

/**
 * Video360Manager for building a {@link Video360}
 * corresponding to the Viro360Video.js control.
 */
public class Video360Manager extends ViroViewGroupManager<Video360> {
    public Video360Manager(ReactApplicationContext context){
        super(context);
    }

    @Override
    public String getName() {
        return "VRT360Video";
    }

    @Override
    protected Video360 createViewInstance(ThemedReactContext reactContext) {
        Video360 video =  new Video360(getContext());
        return video;
    }

    @ReactProp(name = "paused", defaultBoolean = true)
    public void setPaused(Video360 view, boolean visibility) {
        view.setPaused(visibility);
    }

    @ReactProp(name = "loop", defaultBoolean = false)
    public void setLoop(Video360 view, boolean visibility) {
        view.setLoop(visibility);
    }

    @ReactProp(name = "muted", defaultBoolean = false)
    public void setMuted(Video360 view, boolean visibility) {
        view.setMuted(visibility);
    }

    @ReactProp(name = "volume", defaultFloat = 1f)
    public void setVolume(Video360 view, float opacity) {
        view.setVolume(opacity);
    }

    @ReactProp(name = "source")
    public void setSource(Video360 view, @Nullable ReadableMap map) {
        view.setSource(map.getString("uri"));
    }

    @Override
    public @Nullable Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of(
                ViroEvents.ON_FINISH,
                MapBuilder.of("registrationName", ViroEvents.ON_FINISH)
        );
    }
}