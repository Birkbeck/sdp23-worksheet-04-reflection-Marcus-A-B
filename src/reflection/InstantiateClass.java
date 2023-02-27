package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InstantiateClass {
    public static void main(String[] args) {
        if (args.length < 1)
        {
            System.out.println("Usage: Supply the class name as the first parameter followed by each constructor argument thereafter"); // TODO: describe how to use the utility
            System.exit(0);
        }

        // TODO: implement the functionality for Question 2
        Class<?> cl = null;
        try
        {
            cl = Class.forName(args[0]);
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e);
        }

        Class<?>[] argTypes = new Class[args.length - 1];
        for(int i = 1; i < args.length; i++)
        {
            argTypes[i] = args[i].getClass();
        }

        Constructor con = null;
        try {
            con = cl.getConstructor(argTypes);
        }
        catch (NoSuchMethodException e)
        {
            System.out.println(e);
        }
    }
}