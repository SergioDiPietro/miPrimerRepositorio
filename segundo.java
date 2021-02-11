import java.util.Scanner;

public class segundo {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduzca el tamaño del array: ");
        int size = scan.nextInt();

        int[] numsarray = new int[size];

        System.out.println("Introduzca los números del array:");
        int num;
        for (int i=0; i<size; i++) {
            num = scan.nextInt();
            numsarray[i] = num;
        }

        for (int i=0; i<(int)(size/2); i++) {
            if (numsarray[i] != numsarray[numsarray.length-(i+1)]) {
                System.out.println("El array no es capicúa.");
                break;
            } else {
                System.out.println("El array sí es capicúa.");
            }
        }
        scan.close();
    }
}