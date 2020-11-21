package com.vinay.springflux.springwebflux;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

public class StreamsFilter {

	public static void main(String[] args) {
		List<User> userList = new ArrayList();
		User user1 = new User();
		user1.setHasAddress("Y");
		user1.setUserName("Vinay");
		User user2 = new User();
		user2.setHasAddress("");
		user2.setUserName("Vinay");
		User user3 = new User();
		user3.setHasAddress("N");
		user3.setUserName("Vinay");
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		long count = userList.stream().filter(user ->  (user.hasAddress.equalsIgnoreCase("N") || StringUtils.isEmpty(user.hasAddress )) ).count();
		System.out.println(count);

	}

}
