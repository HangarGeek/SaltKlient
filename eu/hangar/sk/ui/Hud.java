package eu.hangar.sk.ui;

import eu.hangar.sk.saltklient;
import eu.hangar.sk.event.EventManager;
import eu.hangar.sk.event.EventTarget;
import eu.hangar.sk.event.events.EventKeyboard;
import eu.hangar.sk.event.events.EventRender2D;
import eu.hangar.sk.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;


public class Hud {

    public Hud() {

        EventManager.register(this);
    }

    @EventTarget
    public void onRender(EventRender2D event) {

        ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft());

        saltklient.INSTANCE.FONT_MANAGER.hud.drawString(saltklient.INSTANCE.NAME, 0, 0, -1, false);
        saltklient.INSTANCE.FONT_MANAGER.hud.drawString("FPS: " + Minecraft.getMinecraft().getDebugFPS(), 200, 0, -200, false);

        saltklient.INSTANCE.TAB.render();

        renderArrayList(scaledResolution);

    }

    @EventTarget
    public void onKeyPress(EventKeyboard event) {

        saltklient.INSTANCE.TAB.onKeyPressed(event.getKey());
    }

    private void renderArrayList(ScaledResolution scaledResolution) {

        int yCount = 5;
        int right = scaledResolution.getScaledWidth();

        for (Module module : saltklient.INSTANCE.MODULE_MANAGER.getAllModules()) {
            if (module.getState() && module.getCatergoy() != Module.Catergoy.GUI) {
                saltklient.INSTANCE.FONT_MANAGER.arraylist.drawString(module.getName(), right - saltklient.INSTANCE.FONT_MANAGER.arraylist.getStringWidth(module.getName()), yCount, module.getCatergoy().color);
                yCount += 10;
            }
        }
    }


}
