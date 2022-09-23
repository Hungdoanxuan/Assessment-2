/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleregistrationfx;

/**
 *
 * @author admin
 */
class LightVehicle extends Vehicle {

    Integer numberofSeats;

    /**
     * @param plateNumber
     * @param make
     * @param model
     * @param year
     * @param isPrivate
     * @param ownderId
     * @param ownerABN
     * @param numberofSeats
     */
    public LightVehicle(String plateNumber, String make, String model, Integer year, boolean isPrivate,
            Integer ownderId, Integer ownerABN, Integer numberofSeats) {
        super(plateNumber, make, model, year, isPrivate, ownderId, ownerABN);
        this.numberofSeats = numberofSeats;
    }

    /**
     * @return the numberofSeats
     */
    public Integer getNumberofSeats() {
        return numberofSeats;
    }

    /**
     * @param numberofSeats the numberofSeats to set
     */
    public void setNumberofSeats(Integer numberofSeats) {
        this.numberofSeats = numberofSeats;
    }

    @Override
    public void showInfo() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-25s%-15s\n", "Plate Number", "Number of Seats", "Make", "Model", "Year","OwnerType", "OwnerABN");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-25s%-15s\n", this.plateNumber, this.numberofSeats, this.make, this.model, this.year, (this.isPrivate == true?"Private":"Unprivate"), this.ownerABN);
    }
}
