package org.mcnative.blocklab.view;

import org.mcnative.blocklab.Component;
import org.mcnative.blocklab.Environment;
import org.mcnative.blocklab.HolderContext;

import java.util.Collection;

public interface View<H, I> {

    Environment<H, I> getEnvironment();

    Collection<Component<I>> getComponents();

    void render(HolderContext<H, I> context);
}
