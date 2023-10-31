package com.hrisi.supplychain;

import com.hrisi.supplychain.entities.UserEntity;
import com.hrisi.supplychain.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
public class SupplychainApplication implements ApplicationRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SupplychainApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		//TODO place your logic here

		List<UserEntity> userEntityList = userRepository.findAll();
		System.out.println("DB state: " + userEntityList);

		UserEntity user1 = userRepository.save(new UserEntity("hrisi", 27));
		System.out.println("Created user: " + user1);

		List<UserEntity> userEntitiesAfterInsert = userRepository.findAll();
		System.out.println("DB state after insert: " + userEntitiesAfterInsert);
	}
}
