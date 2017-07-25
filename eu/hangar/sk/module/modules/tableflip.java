package eu.hangar.sk.module.modules;

import org.lwjgl.input.Keyboard;

import eu.hangar.sk.event.EventTarget;
import eu.hangar.sk.module.Module;
import net.minecraft.client.Minecraft;

@Module.ModInfo(name = " Tableflip", description = "tableflip", category = Module.Catergoy.SALT, bind = Keyboard.KEY_P)
public class tableflip extends Module {
	

	@EventTarget
	public void onEnable(){

		Minecraft.getMinecraft().player.sendChatMessage("(╯°□°）╯︵ ┻━┻");
	}

	    @Override
	    public void onDisable() {

	    }
}
