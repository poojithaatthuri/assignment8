package com.bridzelabs;
import java.util.Random;
public class employeeWage {
        public static void main(String[] args){
            System.out.println("Welcom to Employee Wage Computation Program");
            Random random = new Random();
            int attendance = random.nextInt(2);
            int wagePerHour=20;
            int fullDayHours=8;
            int partTimeHours=4;
            int wagePerDay = 0;

            switch(attendance)
            {
                case 0: System.out.println("Employee Absent..");
                    break;
                case 1: wagePerDay = partTimeHours * wagePerHour;
                    break;
                default:
                    wagePerDay = fullDayHours * wagePerHour;
            }

            if(attendance == 1) {
                System.out.println("Employee present...");
                wagePerDay = wagePerHour * fullDayHours;
            }
            else
                System.out.println("Employee Absent....");
            System.out.println("Employee wages Per Day: " + wagePerDay);


        }
    }











