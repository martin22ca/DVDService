package ar.edu.ucc.arqSoft.baseService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.baseService.dao.ClientDao;
import ar.edu.ucc.arqSoft.baseService.dto.ClientRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.ClientResponseDto;
import ar.edu.ucc.arqSoft.baseService.model.Client;
import ar.edu.ucc.arqSoft.common.dto.ModelDtoConverter;

@Service
@Transactional
public class ClientService {
	
	@Autowired
	private ClientDao clientDao;

	public ClientResponseDto getClientById(Long id) {
		Client client = clientDao.load(id);
		
		ClientResponseDto clientResponseDto = (ClientResponseDto) new ModelDtoConverter().convertToDto(client, new ClientResponseDto());
		return clientResponseDto;
	}
	
	public List<ClientResponseDto> getAllClients() {
		List<Client> clients = clientDao.getAll();
		List<ClientResponseDto> response = new ArrayList<ClientResponseDto>();
		for (Client client : clients) {
			response.add((ClientResponseDto) new ModelDtoConverter().convertToDto(client, new ClientResponseDto()));
		}
		
		return response;
	}
	
	
	public ClientResponseDto RegisterClient(ClientRequestDto request) {
		
		Client client = (Client) new ModelDtoConverter().convertToEntity(new Client(), request);
		
		clientDao.insert(client);
		
		ClientResponseDto response = (ClientResponseDto) new ModelDtoConverter().convertToDto(client, new ClientResponseDto());	
		
		return response;
	}
}