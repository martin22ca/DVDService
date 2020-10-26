package ar.edu.ucc.arqSoft.baseService.service;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.baseService.dao.RentalDao;
import ar.edu.ucc.arqSoft.baseService.dao.FilmDao;
import ar.edu.ucc.arqSoft.baseService.dao.ClientDao;
import ar.edu.ucc.arqSoft.baseService.dto.RentalRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.RentalResponseDto;
import ar.edu.ucc.arqSoft.baseService.model.Rental;

@Service
@Transactional
public class RentalService {
	
	@Autowired
	private RentalDao rentalDao;
	
	@Autowired
	private FilmDao filmDao;
	
	@Autowired
	private ClientDao clientDao;
	
	
	public RentalResponseDto registerRental (RentalRequestDto dto) {
		
		Rental rental = new Rental();
		
		rental.setRentalDate(Calendar.getInstance().getTime());
		rental.setFilm(filmDao.load(dto.getFilmId()));
		rental.setClient(clientDao.load(dto.getClientId()));
		
		rentalDao.insert(rental);
		
		RentalResponseDto response = new RentalResponseDto();
		
		response.setName(rental.getClient().getName());
		response.setLastName(rental.getClient().getLastName());
		response.setTitle(rental.getFilm().getTitle());
		response.setDate(rental.getRentalDate());
		
		return response;	
	}	
}