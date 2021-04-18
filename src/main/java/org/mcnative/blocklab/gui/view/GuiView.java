package org.mcnative.blocklab.gui.view;

import org.mcnative.blocklab.Component;
import org.mcnative.blocklab.Environment;
import org.mcnative.blocklab.HolderContext;
import org.mcnative.blocklab.view.View;
import org.mcnative.runtime.api.player.ConnectedMinecraftPlayer;
import org.mcnative.runtime.api.service.inventory.Inventory;

import java.util.Collection;

public class GuiView implements View<ConnectedMinecraftPlayer, Inventory> {

    @Override
    public Environment<ConnectedMinecraftPlayer, Inventory> getEnvironment() {
        return null;
    }

    @Override
    public Collection<Component<Inventory>> getComponents() {
        return null;
    }

    @Override
    public void render(HolderContext<ConnectedMinecraftPlayer, Inventory> context) {

    }
}
