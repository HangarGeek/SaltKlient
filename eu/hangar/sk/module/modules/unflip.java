package eu.hangar.sk.module.modules;

import org.lwjgl.input.Keyboard;

import eu.hangar.sk.event.EventTarget;
import eu.hangar.sk.module.Module;
import net.minecraft.client.Minecraft;

@Module.ModInfo(name = " Unflip", description = "unflip", category = Module.Catergoy.SALT, bind = Keyboard.KEY_L)
public class unflip extends Module {
	

	@EventTarget
	public void onEnable(){

		Minecraft.getMinecraft().player.sendChatMessage("┬─┬﻿ ノ( ゜-゜ノ)");
	}

	    @Override
	    public void onDisable() {

	    }
}
