public class PositiveOrNegative {
    
    String isPositive(int number)
    {
        String result = "";
        if(number == 0)
        {
            result = "Zero";
        }
        else if(number > 0)
        {
            result = "Positive";
        }
        else{
            result = "Negative";
        }
        return result;
    }
}
