package com.test;

import java.util.Date;

import com.test.jpa.PersonSpringDataRepository;
import com.test.security.JPA.UserRepository;
import com.test.jpa.Person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class TestApplication implements CommandLineRunner{

	private Logger logger=LoggerFactory.getLogger(this.getClass());	
	// @Autowired
	// Business1 business1;

	// @Autowired
	// Business2 business2;

	// @Autowired
	// PersonDao personDao;
	// @Autowired
	// PersonJpaRepository repo;

	// @Autowired
	// PersonSpringDataRepository repo;



	public static void main(String[] args) {
		//ApplicationContext context;
		SpringApplication.run(TestApplication.class, args);
		System.out.println("Started.............. Pramod");
		//SortService sort=context.getBean(SortService.class);
		//sort.sort();
	} 

	@Override
	public void run(String... args) throws Exception {

		//logger.info(business1.getData());
		//logger.info(business2.getData());
		// logger.info("All Users -> {}",personDao.findAll());
		// logger.info("Users 101 Data-> {}",personDao.findById(101));
		// logger.info("Deleted User 103 Data->No of rows affected {}",personDao.deleteById(103));
		// logger.info("Insert User 105 Data",personDao.insert(new Person(105,"Vijaya","Uran",new Date())));
		// logger.info("Update User 104 Data",personDao.update(new Person(104,"Kalyan","Kamothe",new Date())));
/*
		//logger.info("All Users -> {}",repo.findAllPerson());
		// logger.info("All Users -> {}",repo.findAllPerson());
		logger.info("All Users -> {}",repo.findAll());
		// logger.info("Users 101 Data-> {}",repo.findById(101));
		logger.info("Users 101 Data-> {}",repo.findById(101));
		// logger.info("Deleted User 103 Data->No of rows affected {}",personDao.deleteById(103));
		// logger.info("Insert User 105 Data",repo.insert(new Person(105,"Vijaya","Uran",new Date())));
		logger.info("Insert User 105 Data",repo.save(new Person(105,"Vijaya","Uran",new Date())));
		// logger.info("Update User 104 Data",repo.update(new Person(104,"Kalyan","Kamothe",new Date())));
		logger.info("Update User 104 Data",repo.save(new Person(104,"Kalyan","Kamothe",new Date())));
		repo.deleteById(103);

		*/
		




	}

}
