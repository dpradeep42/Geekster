package Assignment_17_Nov_2021;

import java.util.Scanner;

public class Syllabus {

    static String fetchSubjects(int year, String department) {
        switch (year) {
        case 1:
            return "English, Maths, Science";
        case 2:
            switch (department) {
            case "CSE":
                return "Operating System, Java, Data Structure";
            case "ECE":
                return "Micro processors, Logic switching theory";
            case "MEC":
                return "Drawing, Manufacturing Machines";
            default:
                return "Invalid branch";
            }
        case 3:
            switch (department) {
            case "CSE":
                return "Computer Organization, MultiMedia";
            case "ECE":
                return "Fundamentals of Logic Design, Microelectronics";
            case "MEC":
                return "Internal Combustion Engines, Mechanical Vibration";
            default:
                return "Invalid branch";
            }
        case 4:
            switch (department) {
            case "CSE":
                return "Data Communication and Networks, MultiMedia";
            case "ECE":
                return "Embedded System, Image Processing";
            case "MEC":
                return "Production Technology, Thermal Engineering";
            default:
                return "Invalid branch";
            }
        default:
            return "Invalid Year";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Year : ");
        int y = sc.nextInt();

        System.out.print("Enter the Year : ");
        String d = sc.next();

        System.out.println("The subjects for " + y + " year and " + d + " are " + fetchSubjects(y, d));

        sc.close();
    }
}
