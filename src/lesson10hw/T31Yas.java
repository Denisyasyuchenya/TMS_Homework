package lesson10hw;

import java.util.ArrayList;
import java.util.Iterator;

public class T31Yas {
    public static void main (String[] agrs){

        /*Создать список оценок учеников с помощью ArryList, заполнить случайными
        оценками. Найти самую высокую оценку с использованием итератора.*/

        ArrayList<Integer> list=new ArrayList<>(12);
        for(int i=0;i<12;i++){
            Integer number=(int)(Math.random()*10+1);
            list.add(i,number);
        }
        System.out.println(list);
        Integer max = list.get(0);
        for(Iterator<Integer> iterator = list.iterator(); iterator.hasNext();){
            Integer m=iterator.next();
            if (max < m) {
                max = m;
            }
        }
        System.out.println("Максимальный оценка="+max);
    }
}
