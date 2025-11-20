package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    final public static Logger log = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       App.log.info("Hello and welcome!");

        Scanner sc = new Scanner(System.in);

        App.log.info("How many loops would you like?");
        int loops = sc.nextInt();

        App.iterateLoop(1, loops);
    }

    public static void iterateLoop(int start, int end) {
        for (int i = start; i <= end; i++) {
            final int current = i;
            log.info(() -> "i = " + current);
        }
    }
}