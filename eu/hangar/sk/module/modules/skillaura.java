package eu.hangar.sk.module.modules;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

import org.lwjgl.input.Keyboard;

import eu.hangar.sk.event.EventTarget;
import eu.hangar.sk.event.events.EventUpdate;
import eu.hangar.sk.module.Module;

	

@Module.ModInfo(name = " SkillAura", description = "Y U HAX", category = Module.Catergoy.HAXS, bind = Keyboard.KEY_F9)
public class skillaura extends Module {
	

	@EventTarget
	public void onEnable(){
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString(TextFormatting.YELLOW +"" +  TextFormatting.BOLD + "[SaltKlient]: "+TextFormatting.RESET + "SkillAura: Enabled"));
		Minecraft.getMinecraft().player.sendChatMessage("me be using hax");
	}
	 /*   @EventTarget
	    public void onUpdate(EventUpdate event) {
	    
	        if (getState()) {
	            
	        }
	    }
*/
	    @Override
	    public void onDisable() {

	    	Minecraft.getMinecraft().player.sendMessage(new TextComponentString(TextFormatting.YELLOW +"" +  TextFormatting.BOLD + "[SaltKlient]: "+TextFormatting.RESET + "SkillAura: Disabled"));
	    }
}
