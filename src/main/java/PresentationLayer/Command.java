package PresentationLayer;

import FunctionLayer.LegohouseException;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put( "order", new Order() );
        commands.put( "backdoorLogin", new backdoorLogin());
        commands.put( "createLegohouse", new createLegoHouse());
        commands.put( "createOrder", new createOrder());
        commands.put( "seeMyOrders", new getmyOrders());
    }

    static Command from( HttpServletRequest request ) {
        String commandName = request.getParameter( "command" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand() );
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response ) 
            throws LegohouseException;

}
