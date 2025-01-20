package essencepouchtracking;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(EssencePouchTrackingConfig.GROUP)
public interface EssencePouchTrackingConfig extends Config
{
	String GROUP = "essencepouchtracking";

	@ConfigItem(
		keyName = "showOnlyColossal",
		name = "Colossal Pouch Only",
		description = "Only shows the overlays for the Colossal Pouch",
		position = 0
	)
	default boolean showOnlyColossal()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showStoredEssence",
		name = "Show Stored",
		description = "Shows the amount of stored essence over the essence pouch",
		position = 1
	)
	default boolean showStoredEssence()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showDecay",
		name = "Show Decay",
		description = "Shows the approx. amount of essence able to be stored before the essence pouch decays",
		position = 2
	)
	default boolean showDecay()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showDebugOverlay",
		name = "Show Debug Overlay",
		description = "Shows the debug overlay",
		hidden = false,
		position = Integer.MAX_VALUE
	)
	default boolean showDebugOverlay()
	{
		return false;
	}
}
