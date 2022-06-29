package com.bridzelabs;
import java.util.Random;
public class employeeWage {




        public static void main(String[] args){
            System.out.println("Welcom to Employee Wage Computation Program");
            Random random = new Random();
            int attendance = random.nextInt(2);
            if(attendance == 1)
                System.out.println("Employee present...");
            else
                System.out.println("Employee Absent....");


        }
    }

