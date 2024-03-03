package dev.thomasglasser.minejagoexpansiontemplate;

import net.fabricmc.api.ModInitializer;

public class MinejagoExpansionTemplateFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        MinejagoExpansionTemplate.init();
    }
}