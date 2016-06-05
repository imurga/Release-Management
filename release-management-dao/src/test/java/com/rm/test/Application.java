package com.rm.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.rm.dao.entity.User;
import com.rm.dao.repo.UserRepo;

public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new ClassPathResource("spring-config.xml").getPath());
		UserRepo userRepo = context.getBean(UserRepo.class);

		User user = new User();
		user.setUserName("imurga");
		user.setPassword("imurga");
		user.setPossition("dev");
		user.setEmail("murga@mur.com");
		userRepo.save(user);

		List<User> userList = (List<User>) userRepo.findAll();
		for (User item : userList) {
			System.out.println(item);
		}

		context.close();

	}
}
