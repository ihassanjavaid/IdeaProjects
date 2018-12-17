class Time{
    private int hour;
    private int min;
    private int sec;
    
    // No Argument Constructor
    Time(){
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }
    
    // Two argument Constructor
    Time(int hourInput, int minInput){
        this.hour = hourInput;
        this.min = minInput;
        this.sec = 0;
    }
    
    // Three argument Constructor
    Time(int hourInput, int minInput, int secInput){
        setTime(hourInput, minInput, secInput);
    }
    
    public void setTime(int hourInput, int minInput, int secInput){
        setHour(hourInput);
        setMin(minInput);
        setSec(secInput);
    }
    
    public void setHour(int hourInput){
       if ( hourInput >= 0 && hourInput <= 24 ){
        this.hour = hourInput;
       }
       else{
        this.hour = 0;
        }
    }
    
    public void setMin(int minInput){
       if ( minInput >= 0 && minInput <= 60) {
        this.min = minInput;
       }
       else{
        this.min = 0;
        }
    }
    
    public void setSec(int secInput){
         if ( secInput >= 0 && secInput <= 60) {
        this.sec = secInput;
       }
       else{
        this.sec = 0;
        }
    }
    
    public String getTimeString(){
        
        String answer = "";
            
        if ( hour > 12 ){
            answer = ((hour-12) + " : " + min + " : " +sec +" PM");
        }
            
        else{
            answer = (hour+ " : " + min + " : " +sec +" AM");
        }
        return answer;
        
    }
}