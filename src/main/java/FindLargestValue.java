import java.util.Scanner;
public class FindLargestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []array = new int[10];
        for (int i = 0;i<array.length;i++){
            System.out.println("Enter number ");
            array[i] = scanner.nextInt();
        }
        for (int j =0;j<array.length;j++){
            System.out.println("phan tu trong mang " + array[j]);
        }
        int maxvalue = array[0];
        int number = 0;
        for (int i = 0;i<array.length;i++){
            if (maxvalue < array[i]){
                maxvalue = array[i];
                number = i;
            }
        }
        System.out.println("maxvalue is " + maxvalue +" o vi tri thu : " +  number  );

    }
}
