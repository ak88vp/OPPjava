package StopWatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        int number;

//        System.out.println("Menu :");
//        System.out.println("1:bắt đầu lấy thời gian ");
//        System.out.println("2 dừng thời gian");
//        System.out.println("3 : thời gian đã trôi qua");
//        System.out.println("4 dừng trương trình");
//        do {
//            System.out.println("nhập lựa chọn :");
//            number = scanner.nextInt();
//        } while (number > 4);
//
//        if (number == 1) {
//            System.out.println(stopWatch.start());
//        }
//        if (number == 2) {
//            System.out.println(stopWatch.stop());
//        }
//        if (number == 3) {
//            System.out.println(stopWatch.getElapsedTime());
//        }

        stopWatch.start();
        for (int i=0; i<10000000;i++)  {

        }

        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
