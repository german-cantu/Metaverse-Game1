using UnrealBuildTool;

public class Metaverse_Game1ServerTarget : TargetRules
{
	public Metaverse_Game1ServerTarget(TargetInfo Target) : base(Target)
	{
		DefaultBuildSettings = BuildSettingsVersion.Latest;
		IncludeOrderVersion = EngineIncludeOrderVersion.Latest;
		Type = TargetType.Server;
		ExtraModuleNames.Add("Metaverse_Game1");
	}
}
