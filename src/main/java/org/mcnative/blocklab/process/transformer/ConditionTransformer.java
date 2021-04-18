package org.mcnative.blocklab.process.transformer;

import org.mcnative.blocklab.process.Context;
import org.mcnative.blocklab.process.Transformer;
import org.mcnative.blocklab.process.definition.Definition;
import org.mcnative.blocklab.process.definition.Parameter;

@Definition(name="Condition", parameters = {
        @Parameter(name = "",type =Boolean.class,dynamic = true),
        @Parameter(name = "else",type=Void.class)
})
public class ConditionTransformer implements Transformer {

    @Override
    public void transform(Context context) {
        if(context.getParameter("condition").getAs(Boolean.class)){
            return context.getParameter("true").get();
        } else {
            return context.getParameter("false").get();
        }
    }
}
