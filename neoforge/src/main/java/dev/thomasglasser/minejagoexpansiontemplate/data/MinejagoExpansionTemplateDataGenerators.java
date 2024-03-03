package dev.thomasglasser.minejagoexpansiontemplate.data;

import com.klikli_dev.modonomicon.api.datagen.AbstractModonomiconLanguageProvider;
import dev.thomasglasser.minejagoexpansiontemplate.data.lang.TemplateEnUsLanguageProvider;
import dev.thomasglasser.minejagoexpansiontemplate.data.modonomicons.wiki.TemplateAdditionalEntryProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

import static dev.thomasglasser.minejagoexpansiontemplate.MinejagoExpansionTemplate.MOD_ID;

public class MinejagoExpansionTemplateDataGenerators
{
	public static void onGatherData(GatherDataEvent event)
	{
		DataGenerator generator = event.getGenerator();
		PackOutput packOutput = generator.getPackOutput();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

		boolean includeServer = event.includeServer();
		boolean includeClient = event.includeClient();

		AbstractModonomiconLanguageProvider mconEnUs = new AbstractModonomiconLanguageProvider(packOutput, MOD_ID, "en_us") {
			@Override
			protected void addTranslations()
			{}
		};

		// Server
		generator.addProvider(includeServer, new TemplateAdditionalEntryProvider(packOutput, mconEnUs));

		// LanguageProviders
		LanguageProvider enUs = new TemplateEnUsLanguageProvider(packOutput)
		{
			@Override
			protected void addTranslations()
			{
				super.addTranslations();
				mconEnUs.data().forEach(this::add);
			}
		};
		generator.addProvider(includeClient, enUs);
	}
}
