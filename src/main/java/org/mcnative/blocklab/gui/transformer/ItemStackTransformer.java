package org.mcnative.blocklab.gui.transformer;

import org.mcnative.blocklab.process.Context;
import org.mcnative.blocklab.process.Transformer;
import org.mcnative.blocklab.process.definition.Definition;
import org.mcnative.blocklab.process.definition.Parameter;
import org.mcnative.runtime.api.service.inventory.item.ItemStack;
import org.mcnative.runtime.api.service.inventory.item.material.Material;

@Definition(name="ItemStack", outputType = ItemStack.class, parameters = {
        @Parameter(name="material", type= Material.class),
        @Parameter(name="displayName", type=String.class)
})
public class ItemStackTransformer implements Transformer {

    @Override
    public void transform(Context context) {
        context.fireOutput(ItemStack.newItemStack(Material.STONE).setDisplayName(context.getParameter("displayName").getAsString()));
    }
}
