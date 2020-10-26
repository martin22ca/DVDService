package ar.edu.ucc.arqSoft.baseService.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import ar.edu.ucc.arqSoft.baseService.model.Client;
import ar.edu.ucc.arqSoft.common.dao.GenericDaoImp;

@Repository
public class ClientImpDao extends GenericDaoImp<Client, Long> implements ClientDao{

	@Override
	public List<Client> findByName(String name) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Client> criteria = builder.createQuery(Client.class);
        Root<Client> entity = criteria.from(Client.class);

        criteria.select(entity).where(builder.equal(entity.get("name"), name));
        return em.createQuery(criteria).getResultList();
	}

}
