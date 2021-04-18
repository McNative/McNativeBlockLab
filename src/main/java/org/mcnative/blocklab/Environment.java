package org.mcnative.blocklab;

import org.mcnative.blocklab.process.Renderer;
import org.mcnative.blocklab.view.View;

import java.util.Collection;

public interface Environment<H, I> {

    String getName();

    Class<?> getType();

    Collection<? extends View<H, I>> getViews();

    Collection<? extends HolderContext<H, I>> getContexts();

    Renderer getRenderer();
}
