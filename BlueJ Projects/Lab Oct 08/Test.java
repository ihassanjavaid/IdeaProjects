public class Test
{
    public static void main()
    {
        Season season = Season.Summer; // For initialization
        String mySeason = season.getSeason(25, 4); // You can change the values from here 
        
        if ( mySeason.equals("Summer") )
        season = Season.Summer;
        if ( mySeason.equals("Autumn") )
        season = Season.Autumn;
        if ( mySeason.equals("Winter") )
        season = Season.Winter;
        if ( mySeason.equals("Spring") )
        season = Season.Spring;
        
        System.out.println("The season is: " +season.toString() );
    }
}