package dev.thomasglasser.minejagoexpansiontemplate.data.modonomicons.wiki;

import com.klikli_dev.modonomicon.api.datagen.ModonomiconLanguageProvider;
import dev.thomasglasser.minejago.Minejago;
import dev.thomasglasser.minejago.data.modonomicons.wiki.MinejagoWikiBookProvider;
import dev.thomasglasser.minejago.data.modonomicons.wiki.categories.ExpansionsCategoryProvider;
import dev.thomasglasser.tommylib.api.data.modonomicons.AdditionalEntryProvider;
import net.minecraft.data.PackOutput;

import static dev.thomasglasser.minejagoexpansiontemplate.MinejagoExpansionTemplate.MOD_ID;

public class TemplateAdditionalEntryProvider extends AdditionalEntryProvider
{
	public TemplateAdditionalEntryProvider(PackOutput packOutput, ModonomiconLanguageProvider defaultLang)
	{
		super(packOutput, MOD_ID, defaultLang, Minejago.MOD_ID, MinejagoWikiBookProvider.ID, ExpansionsCategoryProvider.ID, ExpansionsCategoryProvider.ENTRY_MAP);
	}

	@Override
	protected void generate()
	{
		add(TemplateEntryProvider::new, '6');
	}
}
