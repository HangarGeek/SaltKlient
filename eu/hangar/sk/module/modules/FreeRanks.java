package eu.hangar.sk.module.modules;

import org.lwjgl.input.Keyboard;

import eu.hangar.sk.event.EventTarget;
import eu.hangar.sk.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

@Module.ModInfo(name = " FreeRanks", description = "Y U scammer", category = Module.Catergoy.SALT, bind = Keyboard.KEY_F6)
public class FreeRanks extends Module {
	

	@EventTarget
	public void onEnable(){
     	Minecraft.getMinecraft().player.sendMessage(new TextComponentString
    			(TextFormatting.YELLOW +"" +  TextFormatting.BOLD + "[SaltKlient]: "+TextFormatting.RESET + "FreeRanks: Enabled" ));
		Minecraft.getMinecraft().player.sendChatMessage("Get free Admin rank here: cbecrft.net/freeranks");
	}

	    @Override
	    public void onDisable() {

	      	Minecraft.getMinecraft().player.sendMessage(new TextComponentString
	    			(TextFormatting.YELLOW +"" +  TextFormatting.BOLD + "[SaltKlient]: "+TextFormatting.RESET + "FreeRanks: Disabled" ));
	    }
}
