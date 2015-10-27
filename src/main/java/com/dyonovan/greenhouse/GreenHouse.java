package com.dyonovan.greenhouse;

import com.dyonovan.greenhouse.common.CommonProxy;
import com.dyonovan.greenhouse.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * This file was created for GreenHouses
 * <p/>
 * GreenHouses is licensed under the
 * Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * @author Dyonovan
 * @since October 27, 2015
 */

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.VERSION)
public class GreenHouse {

    @Mod.Instance(Reference.MOD_ID)
    public static GreenHouse instance;

    @SidedProxy( clientSide="com.dyonovan.greenhouse.client.ClientProxy", serverSide="com.dyonovan.greenhouse.common.CommonProxy")
    public static CommonProxy proxy;

    //Creates the Creative Tab
    public static CreativeTabs tabGreenHouse = new CreativeTabs("tabGreenHouse") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Items.wheat;
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) { }
}
