public class ArmstrongNumbers {
    public static boolean isArmstrong(int num) {
        int sum = 0,
         temp = num, 
         dig = Integer.toString(num).length();
        
         while(temp>0)
         {
            int d = temp % 10;
            sum += Math.pow(d, dig);
            temp /= 10;
         }
        
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1000 and 9999:");
        for (int i = 1000; i <= 9999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
}
