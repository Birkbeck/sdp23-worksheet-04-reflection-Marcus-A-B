package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class DescribeClass {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: Supply exactly one parameter which is the name of the class you want to inspect"); // TODO: describe how to use the utility
            System.exit(0);
        }
        // TODO: implement the functionality for Question 1
        Class<?> c;
        try
        {
            c = Class.forName(args[0]);
        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        Class<?>[] interfaces= c.getInterfaces();
        Arrays.stream(interfaces).forEach(s -> System.out.println(s.toString()));

        System.out.println(Arrays.toString(c.getInterfaces()));
        System.out.println(c.getName());
        System.out.println(Arrays.toString(c.getClasses()));
        System.out.println(c.arrayType());
        System.out.println(c);
        System.out.println(Arrays.toString(c.getDeclaredFields()));

        Method[] m = c.getMethods();
        Field[] f = c.getFields();

        Constructor con = null;
        try {
            con = c.getConstructor();
        }catch(NoSuchMethodException e)
        {
            System.out.println(e);
            System.out.println();
        }

        System.out.println("Methods:");
        for (Method item:m) System.out.println(item);
        System.out.println();
        System.out.println("Fields:");
        for (Field item:f) System.out.println(item);
        System.out.println();
        System.out.println("Constructor:");
        System.out.println(con);
        System.out.println();
        System.out.println("End");



    }
}
