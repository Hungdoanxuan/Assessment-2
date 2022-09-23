/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleregistrationfx;

import java.io.Serializable;
import vehicleregistrationfx.Owner;

/**
 *
 * @author admin
 */
class PrivateOwner extends Owner implements Serializable {

    Integer id;
    String DateofBirth;

    /**
     * @param name
     * @param address
     * @param phone_num
     * @param id
     * @param dateofBirth
     */
    public PrivateOwner(String name, String address, String phone_num, Integer id, String dateofBirth) {
        super(name, address, phone_num);
        this.id = id;
        this.DateofBirth = dateofBirth;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the dateofBirth
     */
    public String getDateofBirth() {
        return DateofBirth;
    }

    /**
     * @param dateofBirth the dateofBirth to set
     */
    public void setDateofBirth(String dateofBirth) {
        DateofBirth = dateofBirth;
    }

    @Override
    public void showinfo() {
        System.out.printf("%-15s%-15s%-15s%-25s%-15s\n", "ID", "Date of Birth", "Name", "Address", "Phone Number");
        System.out.printf("%-15s%-15s%-15s%-25s%-15s\n", this.id, this.DateofBirth, this.name, this.address, this.phone_num);
    }

    @Override
    public String toString() {
        return this.id + ": " + this.name + ": " + this.address + ": " + this.phone_num;
    }
}
