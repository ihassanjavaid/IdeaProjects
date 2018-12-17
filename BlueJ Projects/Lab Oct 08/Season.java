public enum Season
{
    Summer(21, 6, 20, 9), Autumn(21, 9, 20, 11), Winter(21, 11, 20, 3), Spring(21, 3, 20, 6);
    
    private int startDate;
    private int startMonth;
    private int endDate;
    private int endMonth;
    
    Season(int startDateIn, int startMonthIn, int endDateIn, int endMonthIn)
    {
        startDate = startDateIn;
        startMonth = startMonthIn;
        endDate = endDateIn;
        endMonth = endMonthIn;
    }
    
    public String getSeason(int dt, int mn)
    {
        if ( mn == 1 || mn == 2 || mn == 12)
        {
            return "Winter";
        }
        
        else if ( mn == 4 || mn == 5)
        {
            return "Spring";
        }
        
        else if ( mn == 7 || mn == 8 )
        {
            return "Summer";
        }
        
        else if ( mn == 10 )
        {
            return "Autumn";
        }
        
        else if ( mn == 3 )
        {
            if ( dt <= 20 )
            return "Winter";
            else
            return "Spring";
        }
        
        else if ( mn == 6 )
        {
            if ( dt <= 20 )
            return "Spring";
            else
            return "Summer";
        }
        
        else if ( mn == 9 )
        {
            if ( dt <= 20 )
            return "Summer";
            else
            return "Autumn";
        }
        
        else /*if ( mn == 11 )*/
        {
            if ( dt <= 20 )
            return "Autumn";
            else
            return "Winter";
        }
               
    }
}
