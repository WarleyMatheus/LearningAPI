package wm.software.service;

import wm.software.model.Client;
import wm.software.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	
	private ClientRepository repository;

    public ClientService(ClientRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Client client){
        validarCliente(client);
        this.repository.persist(client);
    }

    public void validarCliente(Client client){
        //aplica validações
    }

}
