import net.summerframework.mvc.controller.DefaultControllerActivator;
import net.summerframework.mvc.controller.DefaultControllerFactory;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        new DefaultControllerFactory(new DefaultControllerActivator());
    }
}
