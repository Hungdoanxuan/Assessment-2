/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleregistrationfx;

/**
 *
 * @author admin
 */
class Vehicle
{
	String plateNumber;
	String make;
	String model; 
	Integer year;
	boolean isPrivate;
	Integer ownderId;
	Integer ownerABN;
	/**
	 * @param plateNumber
	 * @param make
	 * @param model
	 * @param year
	 * @param isPrivate
	 * @param ownderId
	 * @param ownerABN
	 */
	public Vehicle(String plateNumber, String make, String model, Integer year, boolean isPrivate, Integer ownderId,
			Integer ownerABN) {
		super();
		this.plateNumber = plateNumber;
		this.make = make;
		this.model = model;
		this.year = year;
		this.isPrivate = isPrivate;
		this.ownderId = ownderId;
		this.ownerABN = ownerABN;
	}
	/**
	 * @return the plateNumber
	 */
	public String getPlateNumber() {
		return plateNumber;
	}
	/**
	 * @param plateNumber the plateNumber to set
	 */
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the year
	 */
	public Integer getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) {
		this.year = year;
	}
	/**
	 * @return the isPrivate
	 */
	public boolean isPrivate() {
		return isPrivate;
	}
	/**
	 * @param isPrivate the isPrivate to set
	 */
	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
	/**
	 * @return the ownderId
	 */
	public Integer getOwnderId() {
		return ownderId;
	}
	/**
	 * @param ownderId the ownderId to set
	 */
	public void setOwnderId(Integer ownderId) {
		this.ownderId = ownderId;
	}
	/**
	 * @return the ownerABN
	 */
	public Integer getOwnerABN() {
		return ownerABN;
	}
	/**
	 * @param ownerABN the ownerABN to set
	 */
	public void setOwnerABN(Integer ownerABN) {
		this.ownerABN = ownerABN;
	}
	public void showInfo()
	{
            
		System.out.printf("%-15s%-15s%-25s%-15s\n","Plate Number","Make","Model","Year", "ownderId");
		System.out.printf("%-15s%-15s%-25s%-15s\n",this.plateNumber,this.make,this.model,this.year,this.ownderId);
	}
}

