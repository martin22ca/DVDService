package ar.edu.ucc.arqSoft.baseService.test.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.baseService.dao.ClientDao;
import ar.edu.ucc.arqSoft.baseService.model.Client;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
@Transactional
public class ClientDaoTest {

	private static final Logger logger = LogManager.getLogger(ClientDaoTest.class);
	
	@Autowired
	private ClientDao clientDao;
	
	@Test
	public void testFindById() {
		logger.info("Search client by id test");
		Client client = clientDao.load((long) 1);
		
		Assert.assertEquals("Martin", client.getName());
		return;
	}
	
	@Test
	public void testRegister() {

		logger.info("Register Client test");
		Client client = new Client();
		client.setName("Pedro");
		client.setEmail("pedrop@gmail.com");
		client.setDni("22118987");
		client.setLastName("Gonzales");

		clientDao.insert(client);
		Assert.assertEquals(5, client.getId().longValue());
		return;
	}
	
	@Test
	public void testUpdate() {

		logger.info("Update client test");
		Client client = clientDao.load((long) 1);
		client.setName("Jose");
		clientDao.update(client);

		Client client1 = clientDao.load((long) 1);
		Assert.assertEquals("Jose", client1.getName());
		return;
	}
	
	@Test
	public void testfindByName() {

		logger.info("Search clients by name test");
		List<Client> states= clientDao.findByName("martin");
		Assert.assertEquals(1, states.size());
		return;
	}
	
	@Test
	public void testGetAll() {

		logger.info("Test de busqueda de todos los States");
		List<Client> states= clientDao.getAll();
		Assert.assertNotNull(states);
		return;
	}
	
}
