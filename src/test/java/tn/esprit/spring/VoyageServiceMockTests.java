package tn.esprit.spring;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Voyage;
import tn.esprit.spring.repository.VoyageRepository;
import tn.esprit.spring.services.VoyageServiceImpl;

//@SpringBootTest
//@TestMethodOrder(OrderAnnotation.class)
//@ExtendWith(MockitoExtension.class)
public class VoyageServiceMockTests {
	 @Mock
	 VoyageRepository voyageRepository;
	 @InjectMocks
	 VoyageServiceImpl voyageService;
	 
	// Voyage voyage = new Voyage(1L,25,"tunis","Rades",new Date(),new Date(),12.30,15.30);
	// ArrayList<Voyage> listvoyages = new ArrayList<Voyage>() {
		
		/**
		 * 
		 */
	//	private static final long serialVersionUID = 1L;

	//	{
	//	 add(new Voyage(2L,25,"tunis","Rades",new Date(),new Date(),12.30,15.30));
	//	 add(new Voyage(3L,25,"tunis","Rades",new Date(),new Date(),12.30,15.30));
	//	 }
	// };
	 
	// @Test
   // public void retrieveProduitTest(){
   //     Mockito.when(voyageRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(voyage));
    //    Voyage voyage1=voyageService.recupererVoyageParId(3L);
    //    Assertions.assertNotNull(voyage1);
   // }
	// @Test
   //  public void retrieveAllProduit(){
   //     Mockito.when(voyageRepository.findAll()).thenReturn(listvoyages);
   //     Assertions.assertEquals(listvoyages,voyageService.recupererAll());
   // }
	
	

}
