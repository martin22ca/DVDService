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

import ar.edu.ucc.arqSoft.baseService.dto.ClientRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.ClientResponseDto;
import ar.edu.ucc.arqSoft.baseService.service.ClientService;

@Controller
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
    private ClientService clientService;

    @RequestMapping(method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<ClientResponseDto> getAllClients()
    {
        return clientService.getAllClients();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ClientResponseDto SearchClientById(@PathVariable("id") Long id)
    {
        return clientService.getClientById(id);
    }
    
    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ClientResponseDto RegisterClient(@RequestBody ClientRequestDto request)
    {
        return clientService.RegisterClient(request);
    }
}