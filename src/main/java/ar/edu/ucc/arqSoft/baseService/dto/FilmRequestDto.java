package ar.edu.ucc.arqSoft.baseService.dto;


import ar.edu.ucc.arqSoft.baseService.model.Genre;
import ar.edu.ucc.arqSoft.common.dto.DtoEntity;

public class FilmRequestDto implements DtoEntity{

	private String title;
	
	private String synopsis;
	
	private String year;
	
	private Genre genre;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

}
