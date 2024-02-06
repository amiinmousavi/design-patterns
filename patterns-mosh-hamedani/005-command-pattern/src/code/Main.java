package code;

//import code.fx.Button;

import code.fx.BlackAndWhiteCommand;
import code.fx.CompositeCommand;
import code.fx.ResizeCommand;

public class Main {
    public static void main(String[] args) {
        //        var service = new CustomerService();
        //        var command = new AddCustomerCommand(service);
        //        var button = new Button(command);
        //        button.click();
        
        var composite = new CompositeCommand();

        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());

        composite.execute();
        composite.execute();
    }
}
