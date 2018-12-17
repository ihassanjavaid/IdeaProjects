public class Main {

    enum Colour {
        red("Stop"), green("Go"), yellow("Wait");
        private  final String action;

        Colour(String action){ // Constructor
            this.action = action;
        }

        public void getAction1(){
            System.out.println(this.action);
        }

        public String getAction(){
            return this.action;
        }

    }

    public static void main(String[] args){

        for (Colour clr: Colour.values() ){
            System.out.println(clr.getAction());
            System.out.println(clr.ordinal());
            System.out.println(clr.name());
            System.out.println(clr.toString());
            clr.getAction1();

            System.out.println();
            System.out.println();

        }



    }
}

