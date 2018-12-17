public class Date
{
    private int day;
    private int month;
    private int year;
    
    public Date(){
     day = 1;
     month = 1;
     year = 1947;
    }
    
    public Date(int d, int m, int y){
     day = d;
     month = m;
     year = m;
    }
    
    public Date(Date date)  {
     day = date.day;
     month = date.month;
     year = date.year;    
    }
    
    public void displayDate(){
     System.out.println(day + " / " + month + " / " + year);
    }
    
    public void setDate(int d, int m, int y){
     day = d;
     month = m;
     year = y;
    }
    
    private boolean validateDate(){
        boolean flag = true;
        boolean isLeap = false;
        
        if ( year < 1947 ){
            return false;
        }
        
        if ( year > 2020 ){
            return false;
        }
        
        isLeap = isLeapYear();
        
        // Validate Month
        if ( month < 1 || month > 12 ){
            flag = false;
        }
        
        if ( month == 2 ){
            if ( isLeapYear()) {
                if ( day > 29 ){
                return false;
                }
            }
        
        else{
               if ( day > 28 ){
                return false;
               } 
             }
        }
        
        return flag;
    }

    
    private boolean isLeapYear(){
        boolean isLeap = false;
        
        if ( year % 4 == 0 ) {
            
            if ( year % 100 == 0 ) {
                
                if ( year % 400 == 0 ){
                    isLeap = true;
                }
                else{
                    isLeap = false;
                }
                
            }
            else{
                isLeap = true;
            }
        }
        return isLeap;
    }
    
    private int numberOfDays(){
        int day = 0;
        
        if ( month == 2 ){
            if (isLeapYear())
                return 29;
            else
                return 28;
            
        }
        
        if ( month < 7 ) {
            
        }
        
   
    
    }
    
    
    
}  
