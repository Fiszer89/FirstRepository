public class Main {

    public static void main(String[] args) {
        int j = 1;
        
        char[] digits = {1,2,3,4,5,6,7,8,9,1,2};
        if (digits.length != 10)
        {
            System.out.println("zla liczba cyfr!");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= digits.length; i++)
        {
            sum += i * digits[i-1];
        }

        if (sum % 11 == 0)
        {
            System.out.println(sum);
            System.out.println("prawdilowo!");
            return;
        }
        else
        {
            System.out.println(sum);
            System.out.println("nieprawidlowo");
            return;
        }
        
    }
}
