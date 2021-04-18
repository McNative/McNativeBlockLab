package org.mcnative.blocklab;

import org.mcnative.blocklab.process.Context;
import org.mcnative.blocklab.process.Parameter;
import org.mcnative.blocklab.process.Transformer;

import java.util.Map;

public class Test {

    public void main() {
        Context context = new TestContext();
        //add parameter

        //Compileted Object
             //name => player.name


        //output
        context.getOutputs().forEach((s, o) -> {
            System.out.println(s+" | "+o);
        });



        //Friend {player.name} {player.IsOnline ? "Online": "Offline"}


        /*
        appendTransformer
        {
        Friend
        VariableReadTransformer (player.name)
        Condition(player.IsOnline, true: ONline, false: offline)
        }
         */


        //Player variable;


        if() {
            //do something
        } else {
            //do something
            //
            if() {
                //do something
            } else {
                //do something
            }
        }

        //>Next
    }

    private static class TestContext implements Context {

        @Override
        public Map<String, Object> getOutputs() {
            return null;
        }

        @Override
        public void fireOutput(Object object) {

        }

        @Override
        public void next(int index) {

        }

        @Override
        public Parameter getParameter(String key) {
            return null;
        }

        @Override
        public Parameter[] getParameters() {
            return new Parameter[0];
        }
    }
}
