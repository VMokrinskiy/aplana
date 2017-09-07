package com.aplana;

import java.util.ArrayList;
import java.util.List;


public class App
{
    public static void main( String[] args )
    {
        System.out.println(resultt("5+8-7"));
    }
    public static int resultt(String s){
        String[] a = s.split("");
        String b=a[0];
        List<Integer> c = new ArrayList();
        List<String> d = new ArrayList<String>();


        /*
        Проверяем каждый элемент массива на равенство с + или -. все + и - записываем в список в. Все цифры до + или - объединяем и записываем в список с в виде целого числа.
        В цикле также проверяем, является ли элемент после арифметического знака последним в массиве а.
         */
        for (int i=1; i<a.length; i++)
        {
            if (!a[i].equals("+")&&!a[i].equals("-"))
            {
                b=b+a[i];
                if (i==a.length-1)
                    c.add(Integer.parseInt(b));
            }
            else if (a[i].equals("+")||a[i].equals("-"))
            {
                c.add (Integer.parseInt(b));
                b = a[i+1];
                d.add(a[i]);
                if (i+1==a.length-1)
                    c.add(Integer.parseInt(b));
                i++;
            }
        }
        int result=c.get(0);
        /*
        Переменной result присваиваем значение первого элемент списка c. К нему в зависимости от символов в списке d прибавляем или вычитаем следующее число из списка c.
         */
        for (int i=1; i<c.size();i++) {

            if (d.get(i - 1).equals("+"))
                result = result + c.get(i);
            else if (d.get(i - 1).equals("-"))
                result = result - c.get(i);
        }
        return result;
    }
}
