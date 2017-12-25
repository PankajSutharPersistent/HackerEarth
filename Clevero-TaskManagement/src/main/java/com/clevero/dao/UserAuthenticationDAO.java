/**
 * 
 */
package com.clevero.dao;

import com.clevero.pojo.User;

/**
 * @author Pankaj Suthar
 *
 */
public interface UserAuthenticationDAO {
	/**
	 * 
	 * @param user
	 * @return user if exists otherwise null
	 */
	public User authenticateUser(User user);
	
	/**
	 * 
	 * @param user
	 * @return user after successful registration
	 */
	public User registerUser(User user);

}
