public class ObjectPassTest {
    public static void main(String[] args) {
        ObjectPass p = new ObjectPass();
        p.value = 5;

        System.out.println(p.value);
        ObjectPass.increment(p);
        System.out.println(p.value);


    }
}

class ObjectPass{
    public int value;

    public static void increment(ObjectPass a){
        a.value++;
    }
}