package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inp, sp[];
        while(true)
        {
            System.out.print("Type in a sentence and press ENTER. ");
            inp = sc.nextLine( );
            inp = inp + "X"; //append a "harmless" string to the end
            inp = inp.toUpperCase( );
            sp = inp.split("S\\s*A");

            if(inp.equals("EXITX"))
                break;

            System.out.println("There are " + (sp.length -1) + " occurrences.");
            System.out.println(""); //blank line

        }
            System.out.println("Finished");





    }
}
