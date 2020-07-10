package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {
// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private String discType;
    private Boolean doubleSided = false;

    public CD(String name, ArrayList<String> contents, double capacity, int rpmSpeed, String compatibleDevice, String discType) {
        super(name, contents, capacity, rpmSpeed, compatibleDevice);
        this.discType = discType;
    }

    @Override
    public void spinDisc() {
        System.out.println(discType + " is spinning at " + getRpmSpeed() + "RPM\n");
    }

    @Override
    public void loadDisc() {
        System.out.println(discType + " is starting...\n");
    }

    @Override
    public void ejectDisc() {
        System.out.println(discType + " is stopping...\n...\n...\nDisc stopped. Safe to eject disc.\n");
    }

}
