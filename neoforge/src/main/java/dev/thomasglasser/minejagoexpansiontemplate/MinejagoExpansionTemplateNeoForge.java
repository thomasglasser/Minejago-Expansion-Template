package dev.thomasglasser.minejagoexpansiontemplate;

import dev.thomasglasser.minejagoexpansiontemplate.data.MinejagoExpansionTemplateDataGenerators;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(MinejagoExpansionTemplate.MOD_ID)
public class MinejagoExpansionTemplateNeoForge
{
    public MinejagoExpansionTemplateNeoForge(IEventBus bus) {
        MinejagoExpansionTemplate.init();

        bus.addListener(MinejagoExpansionTemplateDataGenerators::onGatherData);
    }
}