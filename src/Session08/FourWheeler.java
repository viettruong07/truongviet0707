package Session08;

import Session09.Vehicle;

public class FourWheeler extends Vehicle {
    private boolean powerSteer;

    /**
     *
     * @param vId
     * @param vName
     * @param numWheels
     * @param pStreet
     */
    public FourWheeler(String vId, String vName, int numWheels, boolean pStreet){
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
        powerSteer = pStreet;
    }
    public void showDetails(){
        System.out.println("Vehicle no: " + vehicleNo);
        System.out.println("Vehicle name: " + vehicleName);
        System.out.println("Number of wheels: "+ wheels);

        if (powerSteer == true)
            System.out.println("Power Steering: Yes");
        else
            System.out.println("Power Steering: No");
    }

}

