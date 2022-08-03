

import java.util.Random;
public class Main {
    public static void main(String[] args) {

        System.out.println( permission(30, 10));
        System.out.println( permission(18, 23));
        System.out.println( permission(50, -5));
        System.out.println( permission(34, 30));
        System.out.println( permission(70, 39));

        System.out.println(generateRandomAge());
        System.out.println( permission(generateRandomAge(), 25));
    }
    public static String permission (int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age <20 && temperature > 0 && temperature<25) {
            return "Можно идти гулять";
        } else if (age >45 && temperature > -10 && temperature <25) {
            return "Можно идти гулять";
        }
        else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge(){
        Random random = new Random();
        int x = random.nextInt(45)+1;
        return x;


    }


}