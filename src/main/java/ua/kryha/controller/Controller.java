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
        form.setLastName(inputStringWithScanner(sc , Regex.REGEX_FOR_LASTNAME));
        form.setPatronimic(inputStringWithScanner(sc , Regex.REGEX_FOR_PATRONIMIK));
        form.setNickName(inputStringWithScanner(sc , Regex.REGEX_FOR_NICKNAME));
        form.setComment(inputStringWithScanner(sc , Regex.REGEX_FOR_COMMENT));
        form.setPhoneNumber(inputStringWithScanner(sc , Regex.REGEX_FOR_SECOND_PHONE_NUMBER));
        form.setEmail(inputStringWithScanner(sc , Regex.REGEX_FOR_EMAIL));
        form.setSkype(inputStringWithScanner(sc , Regex.REGEX_FOR_SKYPE));
        form.setHomePhoneNumber(inputStringWithScanner(sc , Regex.REGEX_FOR_HOME_PHONE_NUMBER));
        form.setDate(inputStringWithScanner(sc , Regex.REGEX_FOR_DATE));
        form.setDateOfChange(inputStringWithScanner(sc , Regex.REGEX_FOR_DATE_OF_CHANGE));



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
