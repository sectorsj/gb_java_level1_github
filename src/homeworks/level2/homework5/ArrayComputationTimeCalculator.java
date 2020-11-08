package homeworks.level2.homework5;

public class ArrayComputationTimeCalculator {
        private final int size = 10000000;
        private final int h = size / 2;
        private float[] arr = new float[size];

        public void doCalc() {
            long start = System.currentTimeMillis();
            float[] arr1 = new float[h];
            float[] arr2 = new float[h];

            System.arraycopy(arr, 0, arr1, 0, h);
            System.arraycopy(arr, h, arr2, 0, h);

            /*
            Объявление потоков t1 и t2 с Синхронизацией,
            Thread t1 = new Thread(() -> {
                synchronized (arr1) {
                    for (int i = 0; i < arr1.length - 1; i++) {
                    arr1[i] = calcValue(arr1[i], i);
                    }
                }
            });
            Thread t2 = new Thread(() -> {
                synchronized (arr2) {
                    for (int i = 0; i < arr2.length - 1; i++) {
                        arr2[i] = calcValue(arr2[i], i);
                    }
                }
            });
            */

            //Объявление потоков t1 и t2 без Синхронизации, для работы с методом Join
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < arr1.length - 1; i++) {
                    arr1[i] = calcValue(arr1[i], i);
                }
            });
            Thread t2 = new Thread(() -> {
                for (int i = 0; i < arr2.length - 1; i++) {
                    arr2[i] = calcValue(arr2[i], i);
                }
            });

            t1.start();
            t2.start();

            // Приостановка потока main и добавление метода Join для потоков t1 и t2
            try {
                t1.join();
                t2.join();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }


            /*
            Слейка массивов с Синхронизацией
            synchronized (arr1) {
                System.arraycopy(arr1, 0, arr, 0, h);
            }
            synchronized (arr2) {
                System.arraycopy(arr2, 0, arr, h, h);
            }
            */


            // Слейка массивов без Синхронизации, для работы с методом Join
            System.arraycopy(arr1, 0, arr, 0, h);
            System.arraycopy(arr2, 0, arr, h, h);


            long end = System.currentTimeMillis() - start;
            System.out.println(end);

    }

    private float calcValue (float v1, int v2) {
            return (float)(v1 * Math.sin(0.2f + v2 / 5) * Math.cos(0.2f + v2 / 5) * Math.cos(0.4f + v2 / 2));
    }
}
