public class Screen {

    public static void print(Object...var){
        for ( Object temp:var){
            if (temp instanceof String)

            System.out.print(temp + " ");
        }
    }
}
