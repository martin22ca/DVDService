package ar.edu.ucc.arqSoft.baseService.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import ar.edu.ucc.arqSoft.common.model.GenericObject;

@Entity
@Table(name = "RENTAL")
public class Rental extends GenericObject {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FILM_ID")
	private Film film;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CLIENT_ID")
	private Client client;
	
	@NotNull
	@Column(name = "RENTAL_DATE")
	private Date rentalDate;

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}

	
}
