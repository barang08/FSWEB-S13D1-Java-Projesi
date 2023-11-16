import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));
        System.out.println("------------------");
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
        System.out.println("------------------");
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
        System.out.println("------------------");
Scanner scanner = new Scanner(System.in);
        System.out.println("genişlik girin");
double width = scanner.nextDouble();
        System.out.println(width);
        double height = scanner.nextDouble();
        System.out.println(height);

    }


    public static boolean shouldWakeUp(boolean isBarking, int saat){
       if(saat<0 || saat>23) return false;
       if(!isBarking) return false;
       return saat<8 || saat >=20;
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        return (num1>=13 && num1 <=19) || (num2>=13 && num2 <=19) || (num3>=13 && num3 <=19);


    }

    public static boolean isCatPlaying(boolean isSummer, int temperature ){
        if(isSummer){
            return temperature >25 && temperature <= 45;
        }
            return temperature >25 && temperature <=35;

    }

    public static double area(double width, double height){
        if(width<0 || height<0){
return -1;
        }
        return width*height;
    }
}