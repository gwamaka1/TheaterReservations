package com.plauralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class TheaterReservation {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = Reverse();
        LocalDate date = date();
        int ticket_s = Tickets();
        String tck = "ticket";
        if (ticket_s>1) {
            tck +='s';
        }
        System.out.println(ticket_s+" "+ tck+ " "+ "reserved for"+" "+ date +" "+ "under"+ " "+name);
        scanner.close();
    }
    public static int Tickets(){
        System.out.println("how many tickets would you like?:");
        int tickets = scanner.nextInt();
        scanner.nextLine();
        return tickets;

    }
    public static String Reverse(){
        System.out.println("please enter your name:");
        String name = scanner.nextLine().trim();
        int space = name.indexOf(" ");
        String newName = name.substring(space+1)+" "+ name.substring(0,space);
        return newName;


    }
    public static LocalDate date(){
        System.out.println("what date will you be coming?(MM/dd/YYYY)");
        String date = scanner.nextLine().trim();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(date,fmt);
        return localDate;
    }
}
