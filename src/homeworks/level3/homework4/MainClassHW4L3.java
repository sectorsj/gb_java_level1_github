package homeworks.level3.homework4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClassHW4L3 {
    public static void main(String[] args) {
        ABC abc = new ABC();

        /**
         * если мы объявляем поток в такой форме -
         * Thread t1 = new Thread(abc::printA);
         */
        /**
         * то при создании executorService, прилется написать так-
         * executorService.submit(t1);
         */
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        /**
         * либо чтобы сэкономить строки кода,
         * сразу пишем "abc::printA" в executorService
         */
        executorService.submit(abc::printA);
        executorService.submit(abc::printB);
        executorService.submit(abc::printC);

        executorService.shutdown();
    }
}
