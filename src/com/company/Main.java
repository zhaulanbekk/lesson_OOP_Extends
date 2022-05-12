package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\t\t\t\t~~~>Programmer<~~~");
        System.out.println("___________________________________________________________________________________________");
        Programmer programmer=new Programmer("Jaulanbek","junior","Peaksoft house");
        System.out.println("==> "+programmer);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        programmer.walk();
        programmer.learn();
        programmer.eat();
        programmer.coding();
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();

        Dancer dancer=new Dancer("Dastan","beginner","HanBiyke");
        System.out.println("\t\t\t\t}"+"Dancer"+"{");
        System.out.println("..................................................................................");
        System.out.println("# "+dancer);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        dancer.walk();
        dancer.learn();
        dancer.eat();
        dancer.dancing();
        System.out.println();
        System.out.println("##################################################################################");
        System.out.println();

        Singer singer=new Singer("Datka","Manager","BIZ tobu");
        System.out.println("\t\t\t:=>"+"Singer"+"<=:");
        System.out.println("------------------------------------------------------------------------");
        System.out.println(singer);
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        singer.walk();
        singer.learn();
        singer.eat();
        singer.playGuitar();
        singer.singing();

    }
}

