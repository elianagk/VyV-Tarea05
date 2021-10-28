public class Methods {

    public double decimalToBinary(int number){
        int exp=0;
        double binary=0;
        int digit;
        while(number!=0){
            digit = number % 2;
            binary = binary + digit * Math.pow(10, exp);
            exp++;
            number = number/2;
        }

        return binary;
    }

    public boolean primeNumber(int number){
        int count = 2;
        boolean prime=true;
        while ((prime) && (count!=number)){
            if (number % count == 0)
                prime = false;
            count++;
        }

        return prime;
    }

    public int digitsInNumber(int number){
        int count = 0;
        while (number != 0) {
            number /= 10;
            ++count;
        }
        return count;
    }
}
