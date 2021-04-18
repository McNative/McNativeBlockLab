package org.mcnative.blocklab.variable;

import org.mcnative.runtime.api.player.ConnectedMinecraftPlayer;

public interface Variable {

    String getName();

    Object getValue(ConnectedMinecraftPlayer player);
}
