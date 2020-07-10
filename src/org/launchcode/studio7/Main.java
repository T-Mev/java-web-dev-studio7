package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD musicCD = new CD("Music's Greatest Hits", new ArrayList<>(Arrays.asList( "Song1,Song2,Song3")), 700,
                500, "CD Player", "CD-ROM");

        DVD movieDVD = new DVD("World Funniest Videos", new ArrayList<>(Arrays.asList( "Clip1,Clip2,Clip3")), 4.7,
                1600, "DVD Player", "DVD-RW");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        System.out.println("➤ CD Methods:");
        System.out.println("[Spin]");
        musicCD.spinDisc();
        System.out.println("[Load]");
        musicCD.loadDisc();
        System.out.println("[Eject]");
        musicCD.ejectDisc();
        System.out.println("[Store Data]");
        musicCD.storeData(100);
        System.out.println("[Write Data]");
        musicCD.writeData("New Song");
        System.out.println("[Read Data]");
        musicCD.readData();

        System.out.println("-----------------");

        System.out.println("➤ DVD Methods:");
        System.out.println("[Spin]");
        movieDVD.spinDisc();
        System.out.println("[Load]");
        movieDVD.loadDisc();
        System.out.println("[Eject]");
        movieDVD.ejectDisc();
        System.out.println("[Store Data]");
        movieDVD.storeData(5);
        System.out.println("[Write Data]");
        movieDVD.writeData("New Clip");
        System.out.println("[Read Data]");
        movieDVD.readData();

    }
}
