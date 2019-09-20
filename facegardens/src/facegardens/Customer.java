package facegardens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofID() {
		return proofID;
	}
	public void setProofID(String proofID) {
		this.proofID = proofID;
	}
	public static int getRegisterID() {
		return registerID;
	}
	public static void setRegisterID(int registerID) {
		Customer.registerID = registerID;
	}
	static int registerID=0;
	public Customer(String name,String address,String contactNumber,String email,String proofType,String proofID)
	{
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.proofType=proofType;
		this.proofID=proofID;
		
	}
	public void register(String name,String address,String contactNumber,String email,String proofType,String proofID)
	{
	System.out.println(this.name);
	System.out.println(this.address);
	System.out.println(this.contactNumber);
	System.out.println(this.email);
	System.out.println(this.proofType);
	System.out.println(this.proofID);
    System.out.println("Thanks for registering.Your ID is : "+ ++registerID);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
