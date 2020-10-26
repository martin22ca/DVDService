package ar.edu.ucc.arqSoft.baseService.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ucc.arqSoft.baseService.dto.ClientRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.ClientResponseDto;
import ar.edu.ucc.arqSoft.baseService.service.ClientService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
public class ClientServiceTest {
	
	@Autowired
	private ClientService clientService;
	
	@Test
	public void testFindById() {
		ClientResponseDto response = clientService.getClientById((long) 1);
		
		Assert.assertEquals("martin", response.getName());
		return;
	}
	
	@Test
	public void testInsert() {
		ClientRequestDto request = new ClientRequestDto();
		request.setName("Ignacio");
		request.setLastName("Perez");
		request.setEmail("perezignacio@gmail.com");
		request.setDni("12335385");
		
		ClientResponseDto response = clientService.RegisterClient(request);
		
		Assert.assertEquals("Ignacio",response.getName());
		Assert.assertEquals("Perez",response.getLastName());
		Assert.assertEquals("perezignacio@gmail.com",response.getEmail());
		Assert.assertEquals("12335385",response.getDni());
		return;
	}
}
