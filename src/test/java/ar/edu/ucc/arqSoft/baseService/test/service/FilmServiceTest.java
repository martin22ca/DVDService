package ar.edu.ucc.arqSoft.baseService.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ucc.arqSoft.baseService.dto.FilmRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.FilmResponseDto;
import ar.edu.ucc.arqSoft.baseService.model.Genre;
import ar.edu.ucc.arqSoft.baseService.service.FilmService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
public class FilmServiceTest {

	@Autowired
	private FilmService filmService;
	
	@Test
	public void testFindById() {
		FilmResponseDto response = filmService.getfilmById((long) 1);
		
		Assert.assertEquals("Star Wars", response.getTitle());
		Assert.assertEquals(Genre.SCI_FI,response.getGenre());
		return;
	}
	
	@Test
	public void testInsert() {
		FilmRequestDto request = new FilmRequestDto();
		request.setTitle("Hunger Games");
		request.setSynopsis("A Battle royale in the future");
		request.setGenre(Genre.ACTION);
		request.setYear("2010");
		
		FilmResponseDto response = filmService.RegisterFilm(request);
		
		Assert.assertEquals("Hunger Games",response.getTitle());
		Assert.assertEquals("A Battle royale in the future",response.getSynopsis());
		Assert.assertEquals(Genre.ACTION,response.getGenre());
		Assert.assertEquals("2010",response.getYear());
		return;
	}

}
