package variables.sorting;

import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) {
//        int n[];
//        String[] nn;
//        nn = new String[4];
//        nn[0] = "a";
//  //      nn[10] = "b";
//
//        int[] nums = {1, 2, 3, 4, 5, 6}; // 0-5
//        System.out.println(Arrays.toString(nn));
//        String x = nn[0];
//
//        for (int i = 0; i < nums.length; i++) { // 0-5
//            System.out.println(nums[i]);
//        }
//
//        for (int el : nums) {
//            System.out.println(el);
//        }
//

//        int[] nums = {1, 2, 3, 4, 5, 6};
//        int[] nums2 = nums.clone();
//        nums2[0] = 100;
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(nums2));


        //Количество элементов и нахождения четного

        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] s = new int[n];
//        for (int i = 0; i < n; i++) {
//            s[i] = scanner.nextInt();
//
//        }
//        for (int i = 0; i < n; i++) {
//            if (s[i] % 2 == 0) {
//
//                System.out.println(s[i]);
//            }
//
//        }
//        System.out.println(n);
//    }
////}
//        }
//        // сравнения предыдущего числа с настоящей
//        int n = scanner.nextInt();
//        int[] s = new int[n];
//        for (int i = 0; i < n; i++) {
//            s[i] = scanner.nextInt();
//        }
//        for (int i = 1; i < n; i++) {
//            if (s[i - 1] <= s[i])
//                System.out.println(s[i]);
//
//        }
//    }
//        // Нахождения наибольшего числа и его индекс
//        int s = scanner.nextInt();
//        int n [] = new int [s];
//        int max = 0;
//        int maxInd = 0;
//        for (int i = 0; i < s; i++) {
//            n[i] = scanner.nextInt();
//
//        }
//        for (int i = 0; i < s; i++) {
//           if (n[i] > max){
//               max = n[i];
//               maxInd = i;
//           }
//        }
//
//        System.out.println(max);
//        System.out.println(maxInd);


        //Общее колво элементов которые больше предыдущего

//        Scanner scanner1 = new Scanner(System.in);
//        int m = scanner1.nextInt();
//        int [] mas = new int[m];
//        int masTotal= 0;
//
//        for (int i = 0; i < m; i++) {
//            mas[i] = scanner1.nextInt();
//
//        }
//        for (int i = 1; i < m ; i++) {
//            if (mas[i - 1] < mas[i]){
//                masTotal++;
//            }
//        }
//        System.out.println(masTotal);

//        }
//    }

//         Найти наименьшее натуральное число --

//        Scanner scanner = new Scanner(System.in);
//        int numbers = scanner.nextInt();
//        int[] check = new int[numbers];
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < numbers; i++) {
//            check[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < numbers; i++) {
//            if (check[i] < min && check[i] > 0)
//                min = check[i];
//
//        }
//        System.out.println(min);
////    }
//}

//        // Вывод числа который больше след и пред , вывести колво разниц

//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int n [] = new int [number];
//        int pred = 0;
//        int next = 0;
//        int real = 0;
//        int total = 0;
//
//
//        for (int i = 0; i <number ; i++) {
//            n[i] = scanner.nextInt();
//        }
//        for (int i = 1; i < n.length -1; i++) {
//            pred = n[i - 1]  ;
//            next = n[i + 1];
//            real = n[i];
//
//            if (real> next && real > pred) {
//                total++;
//            }
//        }
//        System.out.println(total);


//        // рост
//        Scanner scanner = new Scanner(System.in);
//        int quantity = scanner.nextInt();
//        int [] height = new int[quantity];
//        for (int q = 0; q<quantity ; q++){
//            height[q] = scanner.nextInt();
//        }
//        int []height2 = height.clone();
//
//        for (int i = 0; i< height.length;i++){
//            int first  = i;
//            for (int j = i+ 1;j<height.length;j++){
//                if (height[first] > height[j] ){
//                    first = j;
//                }
//            }
//            int ring = height[i];
//            height[i] = height[first];
//            height[first] = ring;
//
//        }
//        System.out.println(Arrays.toString(height));
//        System.out.println(Arrays.toString(height2));

//        int total[]  = new int[quantity];
//        int pred = 0;
//        int next = 0;
//        int real = 0;
//        for (int i = 0; i < quantity; i++) {
//            height[i] = scanner.nextInt();
//
//        }
//        for (int i = 1; i < height.length-1; i++) {
//            pred = height[i - 1];
//            next = height[i + 1];
//            real = height[i];
//            if (real > pred && real > next){
//                total[i] = real;
//
//            }
//        }
//        System.out.println(Arrays.toString(total));
//    }

    }

}
