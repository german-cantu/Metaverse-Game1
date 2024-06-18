using UnrealBuildTool;

public class Metaverse_Game1ClientTarget : TargetRules
{
	public Metaverse_Game1ClientTarget(TargetInfo Target) : base(Target)
	{
		DefaultBuildSettings = BuildSettingsVersion.Latest;
		IncludeOrderVersion = EngineIncludeOrderVersion.Latest;
		Type = TargetType.Client;
		ExtraModuleNames.Add("Metaverse_Game1");
	}
}
