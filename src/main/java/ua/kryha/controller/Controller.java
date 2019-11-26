package ua.kryha.controller;

import ua.kryha.model.Form;

import ua.kryha.model.Model;
import ua.kryha.view.View;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Controller {
    Model model;
    View view;
    Form form = new Form();


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        form.setFirstName(inputStringWithScanner(sc , Regex.REGEX_FOR_FIRSTNAME));





    }

    private String inputStringWithScanner(Scanner sc, Pattern pattern) {
        String res = sc.next();
        while(!pattern.matcher(res).matches()) {
            view.printMessage(View.TRY_AGAIN);
            res = sc.next();
        }
        return res;
    }


}
