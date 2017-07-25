package eu.hangar.sk.module.modules;

import org.lwjgl.input.Keyboard;

import eu.hangar.sk.event.EventTarget;
import eu.hangar.sk.event.events.EventUpdate;
import eu.hangar.sk.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

@Module.ModInfo(name = " Rage", description = "Y U BE SALT", category = Module.Catergoy.SALT, bind = Keyboard.KEY_F4)
public class Rage extends Module {

		@Override
	    public void onEnable() {
	     	Minecraft.getMinecraft().player.sendMessage(new TextComponentString
	    			(TextFormatting.YELLOW +"" +  TextFormatting.BOLD + "[SaltKlient]: "+TextFormatting.RESET + "Rage: Enabled \n cya!" ));
	     	new java.util.Timer().schedule( 
	     	        new java.util.TimerTask() {
	     	            @Override
	     	            public void run() {
	     	            	Minecraft.getMinecraft().shutdown();
	     	            }
	     	        }, 
	     	       7500 
	     	);
	   
		}
		@Override
	    public void onDisable() {
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString
	    			(TextFormatting.YELLOW +"" +  TextFormatting.BOLD + "[SaltKlient]: "+TextFormatting.RESET + "NOPE!" ));
			
		}
	   
}