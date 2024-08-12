public class ArrayDemo {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        int [] array1={10,20,30,40,80};
        for (int i = 0; i < array.length; i++) {

            if (array[i] == array1[i]) {
                System.out.println("Array are same");
                break;
            } else {
                System.out.println("Array are different");
                break;

            }
//            System.out.println("array size is not equal");
        }
    }
}
