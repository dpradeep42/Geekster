package Nov_13_2021;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Printing 5 *s Consequently");
        for(int i = 0; i < 5; i++){
            System.out.print("*");
        }

        System.out.println("\n");

        System.out.println("Printing n *s Consequently");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }

        System.out.println("\n");

        System.out.println("Printing n *s separated by a space");
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(int i = 0; i < 5; i++){
            System.out.print("* ");
        }
        
        System.out.println("\n");

        System.out.println("Printing n x n *s separated by a space");
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            System.out.println();
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
        }

        System.out.println("\n");

        System.out.println("Printing triangle n *s as base");
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println();
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
        }
        
        System.out.println("\n");

        System.out.println("Printing reverse triangle n *s as base");
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(int i = n; i >= 1; i--){
            System.out.println();
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
        }

        
        System.out.println("\n");

        System.out.println("Printing complete triangle as n *s as height");
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println();
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
        }
        for(int i = n - 1; i >= 1; i--){
            System.out.println();
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
        }
        
        System.out.println("\n");

        System.out.println("Printing triangle numbers n as base each row starting with 1");
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println();
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
        }
        
        System.out.println("\n");

        System.out.println("Printing triangle numbers");
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        int counter = 1;
        for(int i = 1; i <= n; i++){
            System.out.println();
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
        }
        
        System.out.println("\n");

        System.out.println("Printing triangle n *s as base");
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println();
            for(int s = 0; s < 2 * (n - i); s++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
        }
        
        System.out.println("\n");

        System.out.println("Printing triangle n *s as base");
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(int i = n; i > 0; i--){
            System.out.println();
            for(int s = 0; s < 2 * (n - i); s++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
        }
        
        System.out.println("\n");

        System.out.println("Printing triangle n *s as base");
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println();
            for(int s = 0; s < 2 * (n - i); s++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
        }
        for(int i = n - 1; i > 0; i--){
            System.out.println();
            for(int s = 0; s < 2 * (n - i); s++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
        }
        
        System.out.println("\n");

        System.out.println("Printing triangle n *s as base");
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println();
            for(int s = 0; s < n - i; s++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
        }
        
        System.out.println("\n");

        System.out.println("Printing triangle n *s as base");
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(int i = n; i > 0; i--){
            System.out.println();
            for(int s = 0; s < n - i; s++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
        }
        
        System.out.println("\n");

        System.out.println("Printing triangle n *s as base");
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(int i = n; i > 0; i--){
            System.out.println();
            for(int s = 0; s < n - i; s++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print(n - i + 1 + " ");
            }
        }
        
        System.out.println("\n");

        System.out.println("Printing triangle n *s as base");
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(int i = n; i > 0; i--){
            System.out.println();
            for(int s = 0; s < n - i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(n - i + j + " ");
            }
        }
        
        System.out.println("\n");

        System.out.println("Printing triangle n *s as base");
        System.out.print("Enter n value : ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println();
            for(int s = 0; s < n - i; s++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
        }
        for(int i = n - 1; i > 0; i--){
            System.out.println();
            for(int s = 0; s < n - i; s++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
        }

        sc.close();
    }
}
