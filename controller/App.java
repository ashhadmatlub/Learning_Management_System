package controller;

import java.util.Scanner;

import data.student.Input;

public class App {
    public void run() {

        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();

        try {
            Input data = new Input();

            System.out.println("Welcome to the LMS. Please review and follow the instructions properly outlined below");

            System.out.println("Enter the command ( add ) to insert a student into the list.");
            System.out.println("Enter the command ( remove ) to remove student from the list.");
            System.out.println("Enter the command ( search ) to search student.");

            if (cmd.trim().equalsIgnoreCase("add")) {
                data.inputStudentData();
            } else if (cmd.trim().equalsIgnoreCase("search")) {
                data.search();
            } else if (cmd.trim().equalsIgnoreCase("remove")) {
                data.remove();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}