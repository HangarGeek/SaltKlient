package eu.hangar.sk.module.modules;

import org.lwjgl.input.Keyboard;

import eu.hangar.sk.event.EventTarget;
import eu.hangar.sk.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

@Module.ModInfo(name = " Lenny", description = "lenny", category = Module.Catergoy.SALT, bind = Keyboard.KEY_K)
public class lenny extends Module {
	

	@EventTarget
	public void onEnable(){

		Minecraft.getMinecraft().player.sendChatMessage("( ͡° ͜ʖ ͡°)");
	}

	    @Override
	    public void onDisable() {

	    }
}
