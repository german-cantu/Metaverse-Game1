using UnrealBuildTool;

public class Metaverse_Game1EditorTarget : TargetRules
{
	public Metaverse_Game1EditorTarget(TargetInfo Target) : base(Target)
	{
		DefaultBuildSettings = BuildSettingsVersion.Latest;
		IncludeOrderVersion = EngineIncludeOrderVersion.Latest;
		Type = TargetType.Editor;
		ExtraModuleNames.Add("Metaverse_Game1");
	}
}
