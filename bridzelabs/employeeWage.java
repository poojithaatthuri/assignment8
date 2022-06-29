package com.bridzelabs;
import java.util.Random;
public class employeeWage {


        public static void main(String[] args){
            System.out.println("Welcom to Employee Wage Computation Program");
            Random random = new Random();
            int wagePerHour=20;
            int fullDayHours=8;
            int partTimeHours=4;
            int wagePerDay = 0;
            int monthlySalary = 0;
            int monthlyHours = 0;
            int days = 0;
            while (monthlyHours<= 100 && days<= 20){

                int attendance = random.nextInt(3);
                wagePerDay=0;
                switch (attendance) {
                    case 0:
                        System.out.println("Employee Absent..");
                        monthlyHours=monthlyHours + partTimeHours;
                        break;
                    case 1:
                        wagePerDay = partTimeHours * wagePerHour;
                        break;
                    default:
                        wagePerDay = fullDayHours * wagePerHour;
                        monthlyHours = monthlyHours + fullDayHours;
                }
                monthlySalary = monthlySalary + wagePerDay ;
            }


        }
    }











