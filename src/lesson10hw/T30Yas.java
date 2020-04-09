package lesson10hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class T30Yas {
    public static void main(String[] agrs){

        //Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.

        ArrayList<Integer> list=new ArrayList<Integer>(20);
        for(int i=0;i<100;i++){
            Integer number=(int)(Math.random()*10+1);
            list.add(i,number);
        }
        System.out.println(list);
        Set<Integer> set = new LinkedHashSet<Integer>(list);
        System.out.println(set);
    }
}

