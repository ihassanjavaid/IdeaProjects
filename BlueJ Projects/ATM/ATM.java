public class ATM
{
    private int five_hundreds;
    private int thousands;
    private int five_thousands;
    
    public ATM(){
        // initialization | constructor
        five_hundreds = 10;
        thousands = 10;
        five_thousands = 10;
    
    }
    
    public void withdraw(int amount){
        
       if ( validateAmount(amount) ){
        
       if ( checkBalance() > amount ){
           
           if ( amount >= 10000 ){
            
            while ( amount > 5000 ){
                System.out.println("5000");
                five_thousands -= 1 ;
                amount -= 5000;
            }
            
        }
            
            while ( amount > 1000 ) {
                System.out.println("1000");
                thousands -= 1;
                amount -= 1000;
            }
            
            if ( amount == 1000 ) {
                System.out.println("500");
                System.out.println("500");
                five_hundreds -= 2;
                amount -= 1000;
            }
            
            if ( amount == 500 ) {
                System.out.println("500");
                five_hundreds -= 1;
                amount -= 500;
            } 
        
        
        }
       
       else{
       System.out.println("Sorry, the machine is out of order");
        }
      }
      else{
        System.out.println("Please enter a valid amount");
        }
    }

    
    private int checkBalance(){
        int bal = 0;
        bal = ( five_hundreds * 500 ) + ( thousands * 100 ) + ( five_thousands * 5000 );
        return bal;
    }
    
    private boolean validateAmount(int amount){
        boolean valid;
        if ( amount > 25000 ){
            return false;
        }
        
        
        if ( amount % 500 == 0 )
            return true;
        return false;
    }
    
    
}