package eu.hangar.sk.module;




import java.lang.reflect.Field;
import java.util.Collection;
import java.util.TreeMap;

import eu.hangar.sk.module.modules.AntiNooback;
import eu.hangar.sk.module.modules.FreeRanks;
import eu.hangar.sk.module.modules.Rage;

import eu.hangar.sk.module.modules.lenny;
import eu.hangar.sk.module.modules.skillaura;
import eu.hangar.sk.module.modules.tableflip;
import eu.hangar.sk.module.modules.unflip;


public class ModuleManager {

    private final TreeMap<String, Module> modules = new TreeMap();

   
//HAXS
    public final skillaura sa = new skillaura();
    public final AntiNooback an = new AntiNooback();
 //SALT
    public final Rage s = new Rage();
    public final FreeRanks fr = new FreeRanks();
    public final lenny l = new lenny();
    public final tableflip tf = new tableflip();   
    public final unflip uf = new unflip();


    public ModuleManager() {

        try {
            for (Field field : ModuleManager.class.getFields()) {
                Module module = (Module) field.get(this);
                modules.put(module.getName(), module);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Collection<Module> getAllModules() {

        return modules.values();
    }

    public Module getModuleByName(String name) {

        return modules.get(name);
    }

    public Module getModuleByClass(Class<? extends Module> clazz) {

        for (Module module : getAllModules()) {
            if (module.getClass() == clazz) {
                return module;
            }
        }
        return null;
    }

}
