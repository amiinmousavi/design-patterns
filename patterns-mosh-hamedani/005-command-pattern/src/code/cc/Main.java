package code.cc;

//import code.fx.Button;

import code.cc.BlackAndWhiteCommand;
import code.cc.CompositeCommand;
import code.cc.ResizeCommand;

public class Main {
    public static void main(String[] args) {
        var composite = new CompositeCommand();

        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());

        composite.execute();
        composite.execute();
    }
}
