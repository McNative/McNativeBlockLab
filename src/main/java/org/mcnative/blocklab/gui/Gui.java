package org.mcnative.blocklab.gui;

import org.mcnative.blocklab.Environment;
import org.mcnative.blocklab.HolderContext;
import org.mcnative.blocklab.gui.view.GuiView;
import org.mcnative.blocklab.process.Renderer;
import org.mcnative.blocklab.view.View;
import org.mcnative.runtime.api.player.ConnectedMinecraftPlayer;
import org.mcnative.runtime.api.service.inventory.Inventory;

import java.util.Collection;

public class Gui implements Environment<ConnectedMinecraftPlayer, Inventory> {

    private final String name;

    public Gui(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Class<?> getType() {
        return Gui.class;
    }

    @Override
    public Collection<GuiView> getViews() {
        return null;
    }

    @Override
    public Collection<GuiHolderContext> getContexts() {
        return null;
    }

    @Override
    public Renderer getRenderer() {
        return null;
    }
}
