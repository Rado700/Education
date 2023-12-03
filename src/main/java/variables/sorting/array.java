package variables.sorting;

public class array {
    public static void main(String[] args) {


        //
//        int [] arr = {22, 3, 222, 4,5,370};
//        int min = arr [0];
//        for (int i = 0; i <arr.length ; i++) {
//            if (arr[i]< min )min = arr[i];
//
//
//        }
//        System.out.println(min);
////
//
//        int []count = {2, 1, 3, 4, 6, 7};
//
//        Arrays.sort(count);
//        System.out.println(Arrays.toString(count));
//
//        int []count2 = {2, 1, 3, 4, 6, 7};
//        int[]sortedNumbers = Arrays.copyOf(count2,count2.length);
//        Arrays.sort(sortedNumbers);
//        System.out.println(Arrays.toString(sortedNumbers));
//        System.out.println(Arrays.toString(count2));

        // -----Есть ли определенное число в массиве(Таргет)
//
//    // 1 вариант
//
//    class Solution1 {
//        public int missingNumber (int [] nums){
//            int sum = 0;
//            for (int num = 1; num <= nums.length; num++) sum += num;
//            for (int num : nums) sum-= num;
//            return sum;
//
//
//            }
//
//        }
//
//    }
//
//
//    //Второй вариант
//
//    class Solution {
//        public int missingNumber(int[] nums) {
//            for (int target = 0; target < nums.length; target++) {
//                boolean isMissing = true;
//                for (int i = 0; i < nums.length && isMissing; i++) {
//                    if (target == nums[i]) isMissing = false;
//
//                }
//                if (isMissing) return target;
//
//            }
//            throw new IllegalArgumentException("Invalid input");
//        }
//
//
//    }


//
//        // Рандомный ввод массива
//        int min = -15;
//        int max = 15;
//        int mas[] = new int[10];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = (int) (Math.random() * ((max - min) + 1) + min);
//
//        }
//        System.out.println(Arrays.toString(mas));

//        // Деление Массива
//
//        int mainM[] = new int[10];
//
//        int min2 = -15;
//        int max2 = 15;
//        int j = 0;
//
//        int mas1[] = new int[mainM.length / 2];
//        int mas2[] = new int[mainM.length / 2];
//        int pos[] = new int[10];
//        int odd[] = new int[10];
//        for (int i = 0; i < mainM.length; i++) {
//            mainM[i] = (int) (Math.random() * ((min2 - max2)) + max2);
//            System.out.println(Arrays.toString(new int[]{mainM[i]}));
//            if (i < mainM.length / 2) {
//                mas1[i] = mainM[i];
//            } else {
//                mas2[j++] = mainM[i];
//            }
//            if (mainM[i] > 0) {
//                pos[i] = mainM[i];
//            }
//            if (mainM[i] % 2 != 0) {
//                odd[i] = mainM[i];
//            }
//        }}

//
//
//        }
//        System.out.println(Arrays.toString(mainM));//Массив целый
//        System.out.println(Arrays.toString(mas1));//Массив первая половина
//        System.out.println(Arrays.toString(mas2));//Массив вторая половина
//        System.out.println(Arrays.toString(pos));//Массив положительные числа
//        System.out.println(Arrays.toString(odd));//Массив НЕчетные числа


//        // Сортировка методом выбора перестановкой

//        int mas[] = new int[10];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = (int)(Math.random()*10);
//
//        }
//        System.out.println("Исходный код"+ Arrays.toString(mas));
//
//        for (int min = 0; min < mas.length ; min++) {//внешний цикл для перебора элементов
//            int first = min;     //находим миимальный элемент (first(0,1...)
//            for (int two = min+1; two < mas.length; two++) {    //внутрений цикл, который находит индекс след минимального элемента
//                if (mas[two]< mas[first]){
//                    first=two;   //    в эту переменную присваеваем индекс минимального значения
//                }
//                //<- если поставить стрелку наоборот(>) будет из большего к меньшему
//            }
//            //Меняем местами
//            int tmp = mas[min];
//            mas[min] = mas[first];
//            mas[first] = tmp;
//
//        }
//        System.out.println("Отсартированный массив"+Arrays.toString(mas));


        /// Сортировка массива методом пузырька

//
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 10);
//        }
//
//        // Изменяет арр таким образом,  чтобы он сортировался путем замены соседних элементов, пока
//        // arr отсартирован
//        boolean hasSwapped = true;
//        while (hasSwapped) {
//            hasSwapped = false;
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // Swap adjacent elements
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    hasSwapped = true;
//                }
//            }
//        }
//    }
//}
//

//
//        int [] mas = new int[10];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = (int) (Math.random()*10);
//        }
//        System.out.println("Начальный массив"+ Arrays.toString(mas));
//                //после сортировки цикл продолжит пока не пройдет по всей длине !
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas.length -1; j++) {
//                if (mas[j] > mas[j + 1]){
//                 int tmp  = mas[j];
//                 mas[j] = mas[ j+1 ];
//                 mas[j +1] = tmp;
//                }
//
//            }
//        }
//
//        System.out.println("Отсартированный массив" + Arrays.toString(mas));

//
//        /// Сортировка массива методом пузырька
//
//
//        int[] mas = new int[10];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = (int) (Math.random() * 10);
//
//        }
//        System.out.println("Начальный массив" + Arrays.toString(mas));
//        int tmp;
//        int c = 0;
//        boolean statusSort = false;
//        while (!statusSort) {
//            c++;  // это чтоб узнать сколько раз повторил цикл
//            statusSort = true;
//            for (int i = 0; i < mas.length - 1; i++) {
//                if (mas[i] > mas[i + 1]) {
//                    statusSort = false;
//                    tmp = mas[i];
//                    mas[i] = mas[i + 1];
//                    mas[i + 1] = tmp;
//                }
//            }
//            System.out.println(c+ "" + Arrays.toString(mas));
//        }


//        // Быстрая сортировка
//
//        public static void quickSort ( int[] array, int low, int high){
//
//            if (array.length == 0)
//                return;
//            if (low >= high)
//                return;
//            int middle = low +(high - low) /2;
//            int opora = array[middle];
//
//            //Разделить подмассивы который больше и меньше опорного
//            int i = low, j = high;
//            while (i <= j) {
//                while (array[i] < opora) {
//                    i++;
//                }
//                while (array[j] > opora) {
//                    j--;
//                }
//                if (i <= j) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                    i++;
//                    j--;
//                }
//            }
//            // рекурсивная функция для сортировки левой и правой части
//            if (low < j)
//                quickSort(array, low, j);
//            if (high > i)
//                quickSort(array, i, high);
//
//        }
//
//    public static void main(String[] args) {
//
//
//        int[] mas = new int[10];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = (int) (Math.random() * 10);
//        }
//        System.out.println("Первоначальное значение" + Arrays.toString(mas));
//
//        int low = 0;
//        int high = mas.length - 1;//?(-1)
//        quickSort(mas, low, high);
//        System.out.println("Отсартированный массив" + Arrays.toString(mas));
//
//        // Конец быстрой сортировки

//

//        //Сортировка по вставке ?
//
//        int arr[] = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 10);
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//
//        for (int i = 1; i < arr.length; i++) {
//            int currentIndex = i;
//            while (currentIndex > 0 && arr[currentIndex - 1] > arr[currentIndex]) {
//                int temp = arr[currentIndex];
//                arr[currentIndex] = arr[currentIndex - 1];
//                arr[currentIndex - 1] = temp;
//                currentIndex = -1;
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));
//

//        // Сортировка вставками
//
//
//        int[] array = {5, 2, 8, 3, 1};
//        System.out.println("Исходный массив ");
//        printArray(array);
//
//        insertionSort(array);
//        System.out.println("Отсартированный массив");
//        printArray(array);
//
//    }
//
//    public static void insertionSort(int[] array) {
//        int n = array.length;
//        for (int i = 1; i < n; i++) {
//            int key = array[i];
//            int j = i - 1;
//            //Перемещаем элементы большее Key на одну позицию вперед
//            while (j >= 0 && array[j] > key) {
//                array[j + 1] = array[j];
//                j--;
//            }
//            //Вставляем key на пральную позицию
//            array[j + 1] = key;
//
//        }
//    }
//
//    public static void printArray(int[] array) {
//        for (int value : array) {
//            System.out.println(value + "");
//        }
//        System.out.println();
//
//    }
//}


        // Сортировка по куче

//
//        public class Solution{
//            public void heapSort(int [] arr){
//
//                // Mutates elements in lst by utilizing the heap data structure
//                // Изменяет элементы в 1st ,используя структуру данных куки
//                for (int i = arr.length/2 -1; i >= 0; i--) {
//                    maxHepify(arr,arr.length,i);
//                }
//
//                for (int i = arr.length -1; i >0 ; i--) {
//                    //swap last element with first element
//                    //поменять местатми последний элемент с первым
//                    int temp = arr[i];
//                    arr[i] = arr[0];
//                    arr[0] = temp;
//                    //note that we reduce the heap size by 1 every iteration
//                    //обратите внимание, что мы уменьшаем размер кучи на 1 с каждой итерацией
//                    maxHepify(arr,i,0);
//                }
//            }
//            private void maxHepify(int [] arr, int heapSize, int index){
//                int left = 2*index +1;
//                int right = 2*index+2;
//                int largest = index;
//                if (left < heapSize && arr[left] > arr[largest]){
//                    largest = right;
//                }
//                if (largest != index){
//                    int temp = arr[index];
//                    arr[index] = arr[largest];
//                    arr[largest] = temp;
//                    maxHepify(arr,heapSize,largest);
//                }
//            }
//
//        }
//    }
//
//
//        // Слияние двух массивов
//
//        public static int[] mergeArrays ( int[] a1, int[] a2){
//            a1 = new int[]{2, 3, -5, 1};
//            a2 = new int[]{33, 17, -2, 7, -4};
//            int[] result = new int[a1.length + a2.length];
//            int pos1 = 0;
//            int pos2 = 0;
//            while (pos1 < a1.length || pos2 < a2.length) {
//                result[pos1 + pos2] = (pos1 < a1.length && (pos2 == a2.length || a1[pos1] < a2[pos2]) ?
//                        a1[pos1++] : a2[pos2++]);
//            }
//            return result;
//        }

    }
}
