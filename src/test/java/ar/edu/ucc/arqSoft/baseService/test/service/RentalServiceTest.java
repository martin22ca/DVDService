package ar.edu.ucc.arqSoft.baseService.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ucc.arqSoft.baseService.dto.RentalRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.RentalResponseDto;
import ar.edu.ucc.arqSoft.baseService.service.RentalService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
public class RentalServiceTest {
	
	@Autowired
	private RentalService rentalService;
	
	
	@Test
	public void testRegister() {
		RentalRequestDto request = new RentalRequestDto();
		
		request.setClientId((long)1);
		request.setFilmId((long)2);
		RentalResponseDto response = rentalService.registerRental(request);
		
		Assert.assertEquals("Martin",response.getName());
		Assert.assertEquals("Caceres",response.getLastName());
		Assert.assertEquals("The Thing",response.getTitle());
		return;
	}
	 	
}