package eu.hangar.sk.event.events;

import eu.hangar.sk.event.Event;


public class EventRender3D extends Event {

    public float particlTicks;

    public EventRender3D(float particlTicks) {

        this.particlTicks = particlTicks;
    }

    public float getParticlTicks() {

        return particlTicks;
    }

    public void setParticlTicks(float particlTicks) {

        this.particlTicks = particlTicks;
    }
}
