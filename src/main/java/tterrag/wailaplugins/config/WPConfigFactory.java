package tterrag.wailaplugins.config;

import net.minecraft.client.gui.GuiScreen;
import tterrag.core.common.config.BaseConfigFactory;

public class WPConfigFactory extends BaseConfigFactory
{
    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass()
    {
        return WPConfigGui.class;
    }
}
