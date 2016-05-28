package anamed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anamed.entity.Client;
import anamed.repository.ClientRepository;

@Service
@Transactional(readOnly = true)
public class ClientService implements IClientService {

	@Autowired
	private ClientRepository repository;

	@Override
	@Transactional(readOnly = false)
	public void save(Client client) {
		repository.save(client);
	}

}
