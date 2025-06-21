import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class a16_prioityList {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        String aadhar=sc.nextLine().trim();
        String dob=sc.nextLine().trim();
        String comorbity=sc.nextLine().trim().toLowerCase();

        if(!aadhar.matches("\\d{4} \\d{4} \\d{4}")){
            System.out.println("Invalid adhar");
            return;
        }
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate=LocalDate.parse(dob,formatter);

        LocalDate currenDate=LocalDate.now();

        int age=Period.between(birthDate, currenDate).getYears();

        if(!comorbity.equalsIgnoreCase("yes") &&!comorbity.equalsIgnoreCase("no") ){
            System.out.println("wrong");
            return;
        }
        if(age>60 || comorbity.equalsIgnoreCase("yes")){
             System.out.println("1");
        }
        else if(age>45){
            System.out.println(2);
        }
        else if (age>30) {
            System.out.println(3);
        }
        else{
            System.out.println("invalid input");
        }
        //desert,boycoot,admonish

    }
}
