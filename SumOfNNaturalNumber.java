public class SumOfNNaturalNumber {
    int usingForLoop(int number){
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        return result;
    }

    int usingFormula(int number)
    {
        int result = (number*(number+1))/2;
        return result;
    }

    int usingRecursion(int number)
    {
        if(number == 0)
        {
            return number;
        }
        return number + usingRecursion(number - 1);
    }
}
