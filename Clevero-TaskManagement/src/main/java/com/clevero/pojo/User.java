package com.clevero.pojo;

import java.io.Serializable;

/**
 * 
 * @author Pankaj Suthar User Pojo
 */
public class User implements Serializable {
	
	/** SerialVersionUID*/
	static final long serialVersionUID = 1l;
	
	/** User Name */
	private String userName;
	
	/** User Mail Id */
	private String userEmail;
	
	/** User Password */
	private String password;
	
	/** User Contact No */
	private String contactNo;
	
	/**
	 * Constructor
	 */
	public User() {
		super();
	}
	
	/**
	 * 
	 * @param userName
	 * @param userEmail
	 * @param password
	 * @param contactNo
	 */
	public User(String userName, String userEmail, String password, String contactNo) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.password = password;
		this.contactNo = contactNo;
	}
	
	/**
	 * 
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * 
	 * @return userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}
	
	/**
	 * 
	 * @param userEmail
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	/**
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 
	 * @return contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}
	
	/**
	 * 
	 * @param contactNo
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

}
