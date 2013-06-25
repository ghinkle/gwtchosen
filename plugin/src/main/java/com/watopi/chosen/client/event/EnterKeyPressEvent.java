package com.watopi.chosen.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.watopi.chosen.client.event.EnterKeyPressEvent.EnterKeyPressHandler;

/**
 *
 */
public class EnterKeyPressEvent extends GwtEvent<EnterKeyPressHandler> {

    public interface EnterKeyPressHandler extends EventHandler {
        void onEnterKeyPressed(EnterKeyPressEvent event);
    }

    public static Type<EnterKeyPressHandler> TYPE = new Type<EnterKeyPressHandler>();

    public static Type<EnterKeyPressHandler> getType() {
        return TYPE;
    }

    private int keyCode;
    private String currentSearchText;

    public EnterKeyPressEvent(int keyCode, String currentSearchText) {
        this.keyCode = keyCode;
        this.currentSearchText = currentSearchText;
    }

    @Override
    public Type<EnterKeyPressHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(EnterKeyPressHandler handler) {
        handler.onEnterKeyPressed(this);
    }

    public int getKeyCode() {
        return keyCode;
    }

    public String getCurrentSearchText() {
        return currentSearchText;
    }
}

