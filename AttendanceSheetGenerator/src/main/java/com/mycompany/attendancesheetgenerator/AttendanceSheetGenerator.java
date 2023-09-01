/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.attendancesheetgenerator;

/**
 *
 * @author thiongo
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceSheetGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.println("ATTENDANCE SHEET GENERATOR\n");
        System.out.print("Kindly enter the total number of students in the class: ");
        int totalStudents = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Enter the name of the student " + i + ": ");
            String name = scanner.nextLine();
            students.add(name);
        }
        
        ArrayList<Boolean> attendance = new ArrayList<>();
        for (String student : students) {
            System.out.print("Is " + student + " present? (yes/no): ");
            String attendanceStatus = scanner.nextLine().toLowerCase();
            boolean isPresent = attendanceStatus.equals("yes");
            attendance.add(isPresent);
        }

        System.out.println("\nAttendance Sheet");
        System.out.println("-----");
        System.out.println("Student Name\t\tAttendance\n");
        System.out.println("-----");
        for (int i = 0; i < students.size(); i++) {
            System.out.printf("%-20s\t%s%n", students.get(i), attendance.get(i) ? "Present" : "Absent");
        }

        scanner.close();
    }
}
