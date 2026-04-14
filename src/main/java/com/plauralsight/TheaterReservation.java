package com.plauralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name:");
        String yourName = scanner.nextLine().trim();
        System.out.println("what date will you be coming?(MM/dd/YYYY)");
        String date = scanner.nextLine().trim();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(date,fmt);
        int numberOfTickets = Tickets(scanner);
        String rev = Reverse(yourName);
        String tck = "ticket";
        if (numberOfTickets>1) {
            tck +='s';
        }
        System.out.println(numberOfTickets +" "+ tck+ " "+ "reserved for"+" "+ localDate +" "+ "under"+ " "+rev);
        scanner.close();



    }
    public static int Tickets(Scanner scanner){
        System.out.println("how many tickets would you like?:");
        int tickets = scanner.nextInt();
        return tickets;

    }
    public static String Reverse(String name){
        int space = name.indexOf(" ");
        String newName = name.substring(space+1)+" "+ name.substring(0,space);
        return newName;


    }
}
