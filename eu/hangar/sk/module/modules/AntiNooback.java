package eu.hangar.sk.module.modules;

import java.awt.Color;

import org.lwjgl.input.Keyboard;

import eu.hangar.sk.event.EventTarget;
import eu.hangar.sk.event.events.EventUpdate;
import eu.hangar.sk.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.Sound;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

@Module.ModInfo(name = " AntiNooback", description = "Y U HAX", category = Module.Catergoy.HAXS, bind = Keyboard.KEY_H)
public class AntiNooback extends Module {

		@Override
	    public void onEnable() {
	    	Minecraft.getMinecraft().player.sendMessage(new TextComponentString(TextFormatting.YELLOW +"" +  TextFormatting.BOLD + "[SaltKlient]: "+TextFormatting.RESET + "AntiNoobBack: Enabled"));
	    	Minecraft.getMinecraft().player.sendChatMessage("i use hax");
	    	 Minecraft.getMinecraft().player.setSneaking(true);
	    	 Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0F));
	    	
		}     
	    @EventTarget
	    public void onUpdate(EventUpdate e){
	    	if (getState()) {
	          if (! Minecraft.getMinecraft().player.isSneaking()){
	        	  Minecraft.getMinecraft().player.setSneaking(true);
	          }
	           
	    	}
	        
	    }

	    @Override
	    public void onDisable() {

	    	Minecraft.getMinecraft().player.sendMessage(new TextComponentString
	    			(TextFormatting.YELLOW +"" +  TextFormatting.BOLD + "[SaltKlient]: "+TextFormatting.RESET + "AntiNoobBack: Disabled"));
	    }
}
