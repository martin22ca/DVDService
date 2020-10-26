package ar.edu.ucc.arqSoft.baseService.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.edu.ucc.arqSoft.common.model.GenericObject;


@Entity
@Table(name = "FILM")
public class Film extends GenericObject{
	
	@NotNull
	@Size(min = 1, max = 100)
	@Column(name = "TITLE")
	private String title;
	
	@NotNull
	@Size(min = 1, max = 2000)
	@Column(name = "SYNOPSIS")
	private String synopsis;
	
	@NotNull
	@Size(min = 1, max = 4)
	@Column(name = "YEAR")
	private String year;
	
	@Enumerated(value = EnumType.ORDINAL)
	@Column(name = "GENRE")
	private Genre genre;
	
	@OneToMany(mappedBy="film", fetch = FetchType.LAZY)
	private Set<Rental> rentals;

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

	public Set<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(Set<Rental> rentals) {
		this.rentals = rentals;
	}
	
}
