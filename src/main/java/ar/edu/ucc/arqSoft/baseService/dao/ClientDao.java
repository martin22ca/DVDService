package ar.edu.ucc.arqSoft.baseService.dao;

import java.util.List;

import ar.edu.ucc.arqSoft.baseService.model.Client;
import ar.edu.ucc.arqSoft.common.dao.GenericDao;

public interface ClientDao extends GenericDao<Client, Long> {

	public List<Client> findByName(String name);
}
