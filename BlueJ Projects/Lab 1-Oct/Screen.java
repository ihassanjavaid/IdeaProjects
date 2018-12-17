public class Screen {

    public static void howMany(Object...var){
        int num = 0;
        
        int Integers = 0;
        int Strings = 0;
        int Doubles = 0;
        int Booleans = 0;
        for ( Object temp:var){
            
            if (temp instanceof String ) 
                Strings++;
            else if (temp instanceof Float || temp instanceof Double)
                Doubles++;
            else if (temp instanceof Boolean)
                Booleans++;
            else
                Integers++;
                      
            System.out.print(temp + " ");
            num++;
        }
        System.out.println("\n");
        System.out.println("No. of values: " +num);
        System.out.println("No. of Strings: " +Strings);
        System.out.println("No. of Doubles: " +Doubles);
        System.out.println("No. of Integers: " +Integers);
        System.out.println("No. of Booleans: " +Booleans);
    }
}
