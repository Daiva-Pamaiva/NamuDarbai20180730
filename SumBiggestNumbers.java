package NamuDarbaiMS.BalticTalents;

public class SumBiggestNumbers {

    public static void main (String[] arg)
    {

        int sum = 0;
        for(int i = 1; i <= 100; i++)
        {
            if(i >= 98)
            {
                System.out.println("Summan blir : " + i);
                sum = sum + i;

            }
        }
        System.out.println("Sum : " + sum);
    }
}