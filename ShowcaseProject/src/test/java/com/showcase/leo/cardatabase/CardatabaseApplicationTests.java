package com.showcase.leo.cardatabase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.showcase.leo.cardatabase.domain.Owner;
import com.showcase.leo.cardatabase.domain.OwnerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CardatabaseApplicationTests {
		
	 @Autowired 
	 private OwnerRepository orepository;
	 
	 
	@Test
	public void contextLoads() {
		Owner owner1 = new Owner("Peter" , "Pan");
		Owner owner2 = new Owner("Jissie" , "Li");
		orepository.save(owner1);
		orepository.save(owner2);
	}

}
