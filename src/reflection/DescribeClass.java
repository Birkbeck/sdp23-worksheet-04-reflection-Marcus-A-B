package reflection;

import java.util.Arrays;

public class DescribeClass {
    public static void main(String[] args) {
        if (args.length != 1)
            System.out.println("Usage: Supply exactly one parameter which is the name of the class you want to inspect"); // TODO: describe how to use the utility

        // TODO: implement the functionality for Question 1
        Class<?> c = null;
        try
        {
            c = (Class<?>) Class.forName(args[0]);
        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        Class<?>[] interfaces= c.getInterfaces();
        Arrays.stream(interfaces).forEach(s -> System.out.println(s.toString()));
    }
}
