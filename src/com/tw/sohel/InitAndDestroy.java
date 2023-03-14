package com.tw.sohel;

public class InitAndDestroy {
private String userName;
private int userID;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getUserID() {
	return userID;
}
public void setUserID(int userID) {
	this.userID = userID;
}
@Override
public String toString() {
	return "InitAndDestroy [userName=" + userName + ", userID=" + userID + "]";
}
public void init() {
	System.out.println("Print from init method");
}
public void destroy() {
	System.out.println("Print from destroy method");
}
}
