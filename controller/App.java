package controller;

import data.student.Input;

public class App {
    public void run() {

        try {
            Input data = new Input();
            data.inputStudentData();
            data.search();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}