package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    int [] mass = new int[10];                                              //Создание массива
    int num = 2;                                                            //Обявление переменной для искомого числа
    for(int i = 0, j = 1; i < mass.length; i++, j++) {                      //Цикл для заполнения массива
//        if (j != num)
            mass[i] = j;
    }




//    int fist = mass[0], last = mass[mass.length - 1];                       //Переменные для промежутка ввелённых чисел
    int fistI = 0, lastI = mass.length;                                       //Переменные для промежутка, где производится поиск числа

    for (int i = (fistI + lastI) / 2; ; i = (fistI + lastI) / 2) {
        if (num > mass[i] && fistI != i) {                                    //Если число больше чем число в середине промежутка и промежуток не повторялся, то
            fistI = i;                                                        //промежуток сдвигается влево
//            fist = mass[i];
        } else if (num < mass[i] && lastI != i){                              //Иначе, если число меньше чем число в середине промежутка и промежуток не повторялся, то
            lastI = i;                                                        //промежуток сдвигается вправо
//            last = mass[i];
        } else if (num == mass[i]) {                                          //Иначе, если число найдено, то
            System.out.println("Число найдено");                              //выводим сообщение и прерываем цикл
            break;
        } else {                                                              //Иначе
            System.out.println("Числа нет");                                  //выводим сообщение и прерываем цикл
            break;
        }
    }


    System.out.println(Arrays.toString(mass));


    }
}
