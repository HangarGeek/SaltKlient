package eu.hangar.sk.event.events;

import eu.hangar.sk.event.Event;


public class EventKeyboard extends Event {

    public int key;

    public EventKeyboard(int key) {

        this.key = key;
    }

    public int getKey() {

        return key;
    }
}
