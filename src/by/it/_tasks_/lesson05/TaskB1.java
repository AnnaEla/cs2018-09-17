package by.it._tasks_.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add("line1");
        a1.add("line2");
        a1.add("line3");
        a1.add("line4");
        a1.add("line5");
        System.out.println(a1.size());
        for(int i=0; i<a1.size();i++){
            System.out.println(a1.get(i));
        }


    }

}
