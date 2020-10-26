package ar.edu.ucc.arqSoft.baseService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.ucc.arqSoft.baseService.dto.FilmRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.FilmResponseDto;
import ar.edu.ucc.arqSoft.baseService.service.FilmService;

@Controller
@RequestMapping("/film")
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody FilmResponseDto SearchPeliculaById(@PathVariable("id") Long id)
    {
        return filmService.getfilmById(id);
    }
	
	@RequestMapping(method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<FilmResponseDto> getAllFilms()
    {
        return filmService.getAllFilms();
    }
	
	@RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody FilmResponseDto RegisterClient(@RequestBody FilmRequestDto request)
    {
        return filmService.RegisterFilm(request);
    }
 }


