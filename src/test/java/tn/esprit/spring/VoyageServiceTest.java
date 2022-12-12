package tn.esprit.spring;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import tn.esprit.spring.entities.Voyage;
import tn.esprit.spring.repository.VoyageRepository;
import tn.esprit.spring.services.IVoyageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class VoyageServiceTest {
	
	    @Autowired
	    IVoyageService voyageService;
	    @Autowired
	    VoyageRepository voyageRepository;
	    
	    @Test
	    @Order(1)
	    void retrieveAllProduitTest()  {
	        List<Voyage> voyageList= voyageService.recupererAll();

	        Long count=voyageRepository.count();
	        Assertions.assertEquals(count,voyageList.size());
	    }

}
