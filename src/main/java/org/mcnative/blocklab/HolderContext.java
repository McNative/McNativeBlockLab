package org.mcnative.blocklab;


import org.mcnative.blocklab.variable.Variable;
import org.mcnative.blocklab.view.View;

import java.util.Collection;

public interface HolderContext<H, I> {

    H getHolder();

    Collection<Variable> getVariables();

    I getInstance();

    View<H, I> getCurrentView();
}
