package org.mcnative.blocklab;

import org.mcnative.runtime.api.player.ConnectedMinecraftPlayer;

public interface Component<I> {

    Object[] getParameters();

    void render(ConnectedMinecraftPlayer player, I instance);
}
