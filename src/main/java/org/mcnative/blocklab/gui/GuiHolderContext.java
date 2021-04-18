package org.mcnative.blocklab.gui;

import org.mcnative.blocklab.HolderContext;
import org.mcnative.blocklab.variable.Variable;
import org.mcnative.blocklab.view.View;
import org.mcnative.runtime.api.player.ConnectedMinecraftPlayer;
import org.mcnative.runtime.api.service.inventory.Inventory;

import java.util.Collection;

public class GuiHolderContext implements HolderContext<ConnectedMinecraftPlayer, Inventory> {



    @Override
    public ConnectedMinecraftPlayer getHolder() {
        return null;
    }

    @Override
    public Collection<Variable> getVariables() {
        return null;
    }

    @Override
    public Inventory getInstance() {
        return null;
    }

    @Override
    public View getCurrentView() {
        return null;
    }
}
