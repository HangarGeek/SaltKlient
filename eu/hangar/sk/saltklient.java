package eu.hangar.sk;

import org.lwjgl.input.Keyboard;

import eu.hangar.sk.event.EventManager;
import eu.hangar.sk.event.EventTarget;
import eu.hangar.sk.event.events.EventKeyboard;
import eu.hangar.sk.module.Module;
import eu.hangar.sk.module.ModuleManager;
import eu.hangar.sk.tab.TabGui;
import eu.hangar.sk.ttf.FontManager;
import eu.hangar.sk.ui.Hud;

/**
 * Created by HangarGeek 
 */
public class saltklient {

    public static final saltklient INSTANCE = new saltklient();

    public final String NAME = "SaltKlient";

    public final String VERSION = " 0.6.9.0";

    public final String MC_VERSION = "1.11";

    public final ModuleManager MODULE_MANAGER = new ModuleManager();

    public final FontManager FONT_MANAGER = new FontManager();

    public final Hud HUD = new Hud();

    public final TabGui TAB = new TabGui();

    public void startClient() {

        EventManager.register(this);
        FONT_MANAGER.loadFonts();




        //Ends Client

    }

    public void endClient() {

    }

    @EventTarget
    private void eventKeyboard(EventKeyboard eventKeyboard) {

        for (Module module : saltklient.INSTANCE.MODULE_MANAGER.getAllModules()) {
            if (Keyboard.getEventKey() == module.getBind()) {
                module.toggle();
            }
        }
    }

}
