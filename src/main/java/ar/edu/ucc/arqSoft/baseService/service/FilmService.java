package ar.edu.ucc.arqSoft.baseService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.baseService.dao.FilmDao;
import ar.edu.ucc.arqSoft.baseService.dto.FilmRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.FilmResponseDto;
import ar.edu.ucc.arqSoft.baseService.model.Film;
import ar.edu.ucc.arqSoft.common.dto.ModelDtoConverter;

@Service
@Transactional
public class FilmService {
	
	
	@Autowired
	private FilmDao filmDao;
	
	
	public FilmResponseDto getfilmById (Long id) {
		
		Film film = filmDao.load(id);
		
		FilmResponseDto dto = new FilmResponseDto();
		dto.setTitle(film.getTitle());
		dto.setSynopsis(film.getSynopsis());
		dto.setGenre(film.getGenre());
		dto.setYear(film.getYear());
		
		return dto;
		
	}
	
	public List<FilmResponseDto> getAllFilms() {
		List<Film> films = filmDao.getAll();
		
		List<FilmResponseDto> response = new ArrayList<FilmResponseDto>();
		 
		for (Film film : films) {
			response.add((FilmResponseDto) new ModelDtoConverter().convertToDto(film, new FilmResponseDto()));
		}
		return response;
	}
	
	
	public FilmResponseDto RegisterFilm(FilmRequestDto request) {
		
		Film film = (Film) new ModelDtoConverter().convertToEntity(new Film(), request);
		
		filmDao.insert(film);
		
		FilmResponseDto response = (FilmResponseDto) new ModelDtoConverter().convertToDto(film, new FilmResponseDto());	
		
		return response;
	}

}
