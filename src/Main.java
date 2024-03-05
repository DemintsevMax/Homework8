public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1" + "Task 2");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println(array[0] + "," + array[1] + "," + array[2]);
        double[] array1 = {1.57, 7.654, 9.986};
        System.out.print(array1[0] + "," + array1[1] + "," + array1[2]);
        double[] array3 = {1.1, 1.2, 1.3, 1.4, 1.5};
        System.out.println("_");
        System.out.print(array3[0] + "," + array3[1] + "," + array3[2] + "," + array3[3] + "," + array3[4]);
        System.out.println(" ");

        System.out.println("Task 3");
        array = new int[3];
        for (int i = 0; i >= args.length; i++) {
            System.out.println(array[i]);

        }
        
        

    }
}