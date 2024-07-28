package CodeSoft_problems;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of subject:- ");
        int ns = sc.nextInt();
        if(ns<=1){
            System.out.println("Enter the number of subjects:- ");
            return;
        }
        int totalmarks=0;
        int maxmarkspersub = 100;
        for (int i=1; i<= ns; i++){
            System.out.println("Enter marks obtained in subject " + i );
            int marks = sc.nextInt();
            if(marks<0||marks>maxmarkspersub){
                System.out.println("Marks should be in range of 0 to 100. please enter valid marks.");
                i--;
            }
            else{
                totalmarks += marks;
            }
        }

        double numsubjects = ns;
        double avpercentage = (double) totalmarks / (numsubjects * maxmarkspersub)*100;
        System.out.println("Total Marks: "+totalmarks);
        System.out.println("Average Percentage: "+ avpercentage + "%");
        String grade;
        if (avpercentage>=90){
            grade="A+";

        } else if (avpercentage>=80){
            grade="A";
        } else if (avpercentage>=70) {
            grade="B";

        } else if (avpercentage>=60) {
            grade="C";

        } else if (avpercentage>=50) {
            grade="D";
            
            
        }
        else {
            grade="F";


        }
        System.out.println("Grade:- " +grade);    
    }
}
