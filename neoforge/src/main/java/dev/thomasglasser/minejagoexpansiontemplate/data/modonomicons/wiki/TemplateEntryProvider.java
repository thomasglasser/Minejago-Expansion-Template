package dev.thomasglasser.minejagoexpansiontemplate.data.modonomicons.wiki;

import com.klikli_dev.modonomicon.api.datagen.CategoryProvider;
import com.klikli_dev.modonomicon.api.datagen.EntryBackground;
import com.klikli_dev.modonomicon.api.datagen.EntryProvider;
import com.klikli_dev.modonomicon.api.datagen.book.BookIconModel;
import com.klikli_dev.modonomicon.api.datagen.book.page.BookTextPageModel;
import com.mojang.datafixers.util.Pair;
import net.minecraft.world.item.ItemStack;

public class TemplateEntryProvider extends EntryProvider
{
	public static final String ID = "template";

	public TemplateEntryProvider(CategoryProvider parent)
	{
		super(parent);
	}

	@Override
	protected void generatePages()
	{
		page("summary", () ->
				BookTextPageModel.create()
						.withText(context().pageText())
						.withTitle(context().pageTitle()));

		pageTitle("Summary");
		pageText("This is where you would put the summary of your expansion, i.e. the theme. Use other pages to describe what the expansion adds.");
	}

	@Override
	protected String entryName()
	{
		return "Template Expansion";
	}

	@Override
	protected String entryDescription()
	{
		return "This is where you would put the description of your expansion, i.e. what it adds to the game.";
	}

	@Override
	protected Pair<Integer, Integer> entryBackground()
	{
		return EntryBackground.DEFAULT;
	}

	@Override
	protected BookIconModel entryIcon()
	{
		// TODO: Replace with relevant item
		return BookIconModel.create(ItemStack.EMPTY);
	}

	@Override
	protected String entryId()
	{
		return ID;
	}
}
