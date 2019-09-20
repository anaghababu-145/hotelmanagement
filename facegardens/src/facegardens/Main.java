package facegardens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{

	public static void main(String[] args) throws IOException {
		
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Room r=new Room();
		System.out.println("Name");
		name=br.readLine();
		System.out.println("Address");
		address=br.readLine();
		System.out.println("contactNumber");
		contactNumber=br.readLine();
		System.out.println("email");
		email=br.readLine();
		System.out.println("proofType");
		proofType=br.readLine();
		System.out.println("proofID");
		proofID=br.readLine();
Customer customer=new Customer(name,address,contactNumber,email,proofType,proofID);
customer.register(name,address,contactNumber,email,proofType,proofID);

String ac;
String cot;
String cable;
String wifi;
String laundry;
String date ;
String ch;
int var;

while(true){
System.out.println("Menu");
System.out.println("1.Book");
System.out.println("2.Check Status");
System.out.println("3.Exit");
System.out.println("Enter your choice");
var=Integer.parseInt(br.readLine());

switch(var)
{
case 1:
	
do {
	System.out.println("Booking:");
	System.out.println("Please choose the services required.");
	System.out.println("AC/non-AC(AC/nAC)");
	ac=br.readLine();
	System.out.println("Cot(Single/Double)");
	cot=br.readLine();
	System.out.println("With cable connection/without cable connection(C/nC)");
	cable=br.readLine();
	System.out.println("Wi-Fi needed or not(W/nW)");
	wifi=br.readLine();
	System.out.println("Laundry service needed or not(L/nL)");
	laundry=br.readLine();
	System.out.println("Date");
	date=br.readLine();
	
	r.ac=ac;
	r.cot=cot;
	r.cable=cable;
	r.wifi=wifi;
	r.laundry=laundry;
	r.date=date;
	r.Book();

System.out.println("Do you want to continue?(yes/no)");

ch=br.readLine();
}while(ch.equals("no"));
if(ch.equals("yes"))
{
	System.out.println("Thank you for booking.Your room no is "+r.roomId);

}

break;
case 2:
	System.out.println("Enter your room number");
	int roomid=Integer.parseInt(br.readLine());
	r.CheckStatus(roomid);
	break;
case 3:
	System.exit(0);
	//gfbreak;
	}}}}
