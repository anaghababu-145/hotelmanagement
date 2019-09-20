package facegardens;
import java.util.Scanner;
import java.sql.Date;

public class Room {
String ac;
String cot;
String cable;
String wifi;
String laundry;
String date;
int charge;
int booked[]=new int[25];
int roomid;
static int roomId=1;
static int i=0;
public String getAc() {
	return ac;
}
public void setAc(String ac) {
	this.ac = ac;
}
public String getCot() {
	return cot;
}
public void setCot(String cot) {
	this.cot = cot;
}
public String getCable() {
	return cable;
}
public void setCable(String cable) {
	this.cable = cable;
}
public String getWifi() {
	return wifi;
}
public void setWifi(String wifi) {
	this.wifi = wifi;
}
public String getLaundry() {
	return laundry;
}
public void setLaundry(String laundry) {
	this.laundry = laundry;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}

void Book()
{
	charge = 0;
	if(this.ac.equals("AC"))
		charge+=1000;
	else
		charge+=750;
	if(this.cot.equals("Single"))
		charge+=0;
	else
		charge+=350;
	if(this.cable.equals("C"))
		charge+=50;
	else
		charge+=0;
	if(this.wifi.equals("W"))
		charge+=200;
	else
		charge=+0;
	if(this.laundry.equals("L"))
		charge+=100;
	else
		charge+=0;

	System.out.println("The total charge is Rs"+charge);
	System.out.println("The services chosen are");
	if(this.cot.equalsIgnoreCase("Single")) System.out.println("Single cot");
	else System.out.println("Double cot");
	if(this.ac.equalsIgnoreCase("AC"))
		System.out.println("AC room");
	else System.out.println("non-AC room");
	if(this.cable.equalsIgnoreCase("C"))
		System.out.println("Cable connection enabled");
	else System.out.println("Cable connection disabled");
	if(this.wifi.equalsIgnoreCase("W"))
		System.out.println("Wifi enabled");
	else
		System.out.println("Wifi disabled");
	if(this.laundry.equalsIgnoreCase("L"))
		System.out.println("with laundry services");
	else System.out.println("without laundry services");

	booked[++i]=++roomid;
		
}
public void CheckStatus(int roomid)
{
	int flag=0;
	for( int j=0;j<25;j++)
	{
		if(roomid==booked[j])
		{
			System.out.println("Room number "+roomid+" is booked");
			flag=1;
			break;
		}
	}
	if(flag==0)
		System.out.println("Room number "+roomid+" is not booked");
}
}
