package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private ArrayList<String> contents = new ArrayList<>();
    private double capacity;
    private int rpmSpeed;
    private String compatibleDevice;

    public BaseDisc(String name, ArrayList<String> contents, double capacity, int rpmSpeed, String compatibleDevice) {
        this.name = name;
        this.contents = contents;
        this.capacity = capacity;
        this.rpmSpeed = rpmSpeed;
        this.compatibleDevice = compatibleDevice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRpmSpeed() {
        return rpmSpeed;
    }

    public void setRpmSpeed(int rpmSpeed) {
        this.rpmSpeed = rpmSpeed;
    }

    public String getCompatibleDevice() {
        return compatibleDevice;
    }

    public void setCompatibleDevice(String compatibleDevice) {
        this.compatibleDevice = compatibleDevice;
    }

    public void storeData(double sizeOfData) {
        double sizeRemaining = this.capacity - sizeOfData;

        if (sizeRemaining > 0){
            this.capacity = sizeRemaining;
            System.out.println("Data stored on disc successfully!\n");
        } else {
            System.out.println("ERROR: Disc is full!\n");
        }

    }

    public void writeData(String data){
        this.contents.add(data);
        System.out.println(data + " was written to disc.\n");
    }

    public void readData(){
        for(String each : contents){
            System.out.println(each);
        }
    }
}
