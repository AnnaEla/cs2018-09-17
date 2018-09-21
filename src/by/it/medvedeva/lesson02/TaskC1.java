package by.it.medvedeva.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int i = sc1.nextInt(34);
        Scanner sc2 = new Scanner(System.in);
        int k = sc2.nextInt(26);
        System.out.println("Вывод");
        System.out.println("Sum"+" "+"="+" "+i+"+"+k);
    }





}
