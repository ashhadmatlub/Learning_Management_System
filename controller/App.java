package controller;

import java.util.Scanner;

import data.course.InputC;
import data.student.Input;

public class App {
    public void run() {

        Scanner sc = new Scanner(System.in);
        String cmd;

        try {
            Input studentData = new Input(); // For Student
            InputC courseData = new InputC(); // For Course

            System.out.println("Welcome to the LMS. Please review and follow the instructions properly outlined below");

            System.out.println("Enter command ( student ) for managing students.");
            System.out.println("Enter command ( course ) for managing courses.");

            cmd = sc.nextLine();

            if (cmd.trim().equalsIgnoreCase("student")) {

                System.out.println("Enter command ( add ) to insert items into the list.");
                System.out.println("Enter command ( remove ) to remove item from the list.");
                System.out.println("Enter command ( search ) to search item.");
                System.out.println("Enter command ( overview ) to see whole list.");

                cmd = sc.nextLine();

                if (cmd.trim().equalsIgnoreCase("add")) {
                    studentData.inputStudentData();
                } else if (cmd.trim().equalsIgnoreCase("search")) {
                    studentData.search();
                } else if (cmd.trim().equalsIgnoreCase("remove")) {
                    studentData.remove();
                } else if (cmd.trim().equalsIgnoreCase("overview")) {
                    studentData.display();
                } else {
                    System.out.println("Wrong command entered");
                }
            } else if (cmd.trim().equalsIgnoreCase("course")) {

                System.out.println("Enter command ( add ) to insert items into the list.");
                System.out.println("Enter command ( remove ) to remove item from the list.");
                System.out.println("Enter command ( search ) to search item.");
                System.out.println("Enter command ( overview ) to see whole list.");

                cmd = sc.nextLine();

                if (cmd.trim().equalsIgnoreCase("add")) {
                    courseData.inputCourseData();
                } else if (cmd.trim().equalsIgnoreCase("search")) {
                    courseData.search();
                } else if (cmd.trim().equalsIgnoreCase("remove")) {
                    courseData.remove();
                } else if (cmd.trim().equalsIgnoreCase("overview")) {
                    courseData.display();
                } else {
                    System.out.println("Wrong command entered");
                }
            } else {
                System.out.println("Wrong command Entered");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}