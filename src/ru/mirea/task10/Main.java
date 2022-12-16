package ru.mirea.task10;
import java.util.Scanner;
class Main{ //13
    public void rec() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num != 0) {
            System.out.println(num);
            int num1 = sc.nextInt();
            if (num1 != 0) rec();
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.rec();
    }
}
class Main1{ //14
    public void rec(int a) {
        if (a != 0) {
            rec(a / 10);
            System.out.print(a % 10 + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        Main1 obj = new Main1();
        obj.rec(a);
    }
}
class Main2 { //15
    public void rec(int a){
        if (a != 0){
            System.out.print(a % 10 + " ");
            rec(a / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        Main2 obj = new Main2();
        obj.rec(a);
    }
}