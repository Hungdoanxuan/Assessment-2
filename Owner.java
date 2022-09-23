/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleregistrationfx;

/**
 *
 * @author admin
 */
abstract class Owner
{
	String name;
	String address;
	String phone_num;
	/**
	 * @param name
	 * @param address
	 * @param phone_num
	 */
	public Owner(String name, String address, String phone_num) {
		this.name = name;
		this.address = address;
		this.phone_num = phone_num;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the phone_num
	 */
	public String getPhone_num() {
		return phone_num;
	}
	/**
	 * @param phone_num the phone_num to set
	 */
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public void showinfo(){
            
        }
}

