import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Celcius :");
        double C = input.nextDouble();

        System.out.println(" Pilih opsi ");
        System.out.println(" 1. Ferenheit ");
        System.out.println(" 2. Reamur ");
        System.out.println(" 3. Kelvin ");

        int opsi = input.nextInt();

        switch (opsi){
            case 1:
            System.out.println("Farenheit "+(C * 9/5) + 35);break;
            case 2: 
            System.out.println("Reamur "+C * 4/5);break;
            case 3:
            System.out.println("Kelvin "+C * 273);break;
            default:System.out.println("Opsi tidak valid");
        }
       
    }
    
}

