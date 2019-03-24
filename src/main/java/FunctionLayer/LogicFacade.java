package FunctionLayer;

import DBAccess.UserMapper;
import FunctionLayer.LegohouseException;
import java.util.ArrayList;
import java.util.List;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LegohouseException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LegohouseException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    public static List<Order> getAllOrders () throws LegohouseException {
        return UserMapper.getAllOrders();
    }
    
    public static ArrayList<Order> getAllOrdersByUser (User user) throws LegohouseException {
        return UserMapper.getOrdersByUser(user);
    }
    
    public static void createOrder (LegoHouse legohouse, User user) throws LegohouseException {
        Order order = new Order(legohouse.getLength(), legohouse.getWidth(), legohouse.getHeight(), user, false);
        UserMapper.createOrder(order);
    }

    public static LegoHouse createLegohouse(int length, int width, int height) {
        LegoHouse house = new LegoHouse(length, width, height);
        return CalcPartList.createPartList(house);
    }

}
