public class ATM {
    private Bucket five_hundreds;
    private Bucket thousands;
    private Bucket five_thousands;

    ATM(){
        // Constructor | Initializing;
        five_hundreds = new Bucket();
        thousands = new Bucket();
        five_thousands = new Bucket();
    }


    public int[] withdrawMoney(int amount){

        int[] finalArray = new int[3];

        if ( validateAmountAndBalCheck(amount) ){

            if ( amount >= 10000 ){

                while ( amount >= 5000){
                    finalArray[2] += 1;
                    amount -= 5000;
                    five_thousands.decreaseNotes();
                }
            }

            while ( amount > 1000 ){
                finalArray[1] += 1;
                amount -= 1000;
                thousands.decreaseNotes();
            }

            if ( amount == 1000 ){
                finalArray[0] += 2;
                amount -= 1000;
                five_hundreds.decreaseNotes();
            }

            else if ( amount == 500 ){
                finalArray[0] += 1;
                amount -= 500;
                five_hundreds.decreaseNotes();
            }

            if ( amount== 0 );
            else System.out.println("There's an error!");

        }

        else{
            System.out.println("Sorry, Invalid amount");
        }
        return finalArray;
    }

    private boolean validateAmountAndBalCheck(int amount){
        boolean flag = false;

        if ( (amount % 500 == 0) && (amount <= 25000) ){
            flag = balCheck(amount);
        }
            return flag;
    }

    private boolean balCheck(int amount) {
        int bal = (five_hundreds.getValue() * 500) + (thousands.getValue() * 1000) + (five_thousands.getValue() * 5000);

        return (amount <= bal);
    }

    private class Bucket {
        private int value;

        Bucket(){
            value = 10;
        }

        public int getValue() {
            return value;
        }

        public void decreaseNotes(){
            this.value--;
        }

    }

}
