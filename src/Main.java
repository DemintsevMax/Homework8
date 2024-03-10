import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double[] array1 = {1.57, 7.654, 9.986};
        double[] array2 = {1.1, 1.2, 1.3, 1.4, 1.5};
        System.out.println("_");

        System.out.println("Task 2");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + " ,");
            } else {
                System.out.print(array[i]);
                System.out.println(" ");
                for (i = 0; i < array1.length; i++) {
                    if (i != array1.length - 1) {
                        System.out.print(array1[i] + " ,");
                    } else {
                        System.out.print(array1[i]);
                        System.out.println(" ");
                        for (i = 0; i < array2.length; i++) {
                            if (i != array2.length - 1) {
                                System.out.print(array2[i] + " ,");
                            } else {
                                System.out.print(array2[i]);
                                System.out.println(" ");
                                System.out.println("Task 3");
                                for (int index = 2; index >= 0; index--) {
                                    System.out.print(array[index] + ",");
                                }
                                System.out.println(" ");
                                for (int index2 = 2; index2 >= 0; index2--) {
                                    System.out.print(array1[index2] + " ");
                                }

                                System.out.println(" ");
                                System.out.println("Task 4");
                                array[0] += 1;
                                array[1] += 1;
                                array[2] += 1;
                                System.out.println(Arrays.toString(array));


                            }


                        }
                    }
                }
            }
        }
    }
}





