/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleregistrationfx;

/**
 *
 * @author admin
 */
class CorporateOwner extends Owner
{
	Integer aBN;
	/**
	 * @param name
	 * @param address
	 * @param phone_num
	 * @param aBN
	 */
	public CorporateOwner(String name, String address, String phone_num, Integer aBN) {
		super(name, address, phone_num);
		this.aBN = aBN;
	}


	/**
	 * @return the aBN
	 */
	public Integer getaBN() {
		return aBN;
	}

	/**
	 * @param aBN the aBN to set
	 */
	public void setaBN(Integer aBN) {
		this.aBN = aBN;
	}
	public void showInfo()
	{
		System.out.printf("%-15s%-15s%-25s%-15s\n","ABN","Name","Address","Phone Number");
		System.out.printf("%-15s%-15s%-25s%-15s\n",this.aBN,this.name,this.address,this.phone_num);
	}
}
