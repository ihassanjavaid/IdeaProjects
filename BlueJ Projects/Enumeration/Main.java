public class Main{
    public static void main(){
        Levels hiLevel = Levels.High;
        System.out.println(hiLevel);
        System.out.println(hiLevel.ordinal());
        
        Days day1 = Days.MONDAY;
        System.out.println(day1);
        System.out.println(day1.ordinal());
        
        Direction dir = Direction.North;
        System.out.println(dir);
        System.out.println(dir.ordinal());
        
        if ( dir.valueOf("North") == Direction.North ){
            System.out.println("yes");
        }
        
        Student std = Student.s5;
        System.out.println(std);
        System.out.println(std.ordinal());
        
        University uni = University.cui;
        System.out.println(uni);
        System.out.println(uni.ordinal());
        
        City mycity = City.Isb;
        System.out.println(mycity);
        System.out.println(mycity.ordinal());
        
    }
}