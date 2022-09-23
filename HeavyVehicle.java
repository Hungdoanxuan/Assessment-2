/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleregistrationfx;

/**
 *
 * @author admin
 */
class HeavyVehicle extends Vehicle
{
	Integer loadCapacity;
	/**
	 * @param plateNumber
	 * @param make
	 * @param model
	 * @param year
	 * @param isPrivate
	 * @param ownderId
	 * @param ownerABN
	 * @param loadCapacity
	 */
	public HeavyVehicle(String plateNumber, String make, String model, Integer year, boolean isPrivate,
			Integer ownderId, Integer ownerABN, Integer loadCapacity) {
		super(plateNumber, make, model, year, isPrivate, ownderId, ownerABN);
		this.loadCapacity = loadCapacity;
	}


	/**
	 * @return the loadCapacity
	 */
	public Integer getLoadCapacity() {
		return loadCapacity;
	}

	/**
	 * @param loadCapacity the loadCapacity to set
	 */
	public void setLoadCapacity(Integer loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
        
        

    @Override
    public void showInfo() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-25s%-15s\n", "Plate Number", "Load of Capacity", "Make", "Model", "Year","OwnerType", "OwnderId");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-25s%-15s\n", this.plateNumber, this.loadCapacity, this.make, this.model, this.year, (this.isPrivate == true?"Private":"Unprivate"), this.ownderId);
    }
    }

