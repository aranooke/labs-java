package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* 3. Увести n рядків з консолі. Вивести на консоль ті рядки, довжина яких менше середньої, також їх довжини.
     3.Написати регулярне вираження, що визначає чи є заданий рядок правильним Mac-Адресою.
    Приклад правильних виражень: ae:dc:ca:56:76:54.
    Приклад неправильних виражень: 01:23:45:67:89:Az.
    3. Скласти два багаточлени заданого ступеня, якщо коефіцієнти багаточленів зберігаються в об'єкті Hashmap.
    3. Зобразити в апплете, що наближається видали куля, що віддаляється куля. Куля повинен рухатися з постійною швидкістю.
    3. Чат. Клієнт посилає через сервер повідомлення, яке одержують усі клієнти. Список клієнтів зберігається на сервері у файлі.
      */
        int average =0,n;
        float len = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");
        n = scan.nextInt();
        String[] result = new String[n];
        String stroka;
        for (int i = 0; i < n ; i++) {
                System.out.printf("Enter %d sentence\n",i+1);
                stroka=scan.next();
                result[i] = stroka;
                len+=stroka.length();
        }
        len/=n;
        System.out.printf("Average length of words is %.2f\n",len);
        for (int i = 0; i < n ; i++) {
            if(result[i].length() < len)
            {
                System.out.println(result[i]);
            }
        }

        System.out.println("holla world");
    }
}
