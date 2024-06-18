using UnrealBuildTool;

public class Metaverse_Game1Target : TargetRules
{
	public Metaverse_Game1Target(TargetInfo Target) : base(Target)
	{
		DefaultBuildSettings = BuildSettingsVersion.Latest;
		IncludeOrderVersion = EngineIncludeOrderVersion.Latest;
		Type = TargetType.Game;
		ExtraModuleNames.Add("Metaverse_Game1");
	}
}
