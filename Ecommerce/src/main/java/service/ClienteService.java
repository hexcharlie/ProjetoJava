package service;

import java.util.ArrayList;
import java.util.UUID;

import model.Cliente;
import repository.ClienteRepository;

public class ClienteService {
	
	ClienteRepository repository = new ClienteRepository();
	
	
	public ArrayList<Cliente> listaClientes() {
		return repository.listaClientes();
	}
	
	public String cadastroCliente() {
		return repository.cadastroCliente();
	}
	
	public String deletaCliente(String email) {
		return repository.deletaCliente(email);
	}
	
	public Cliente atualizaCadastro(Cliente cliente) {
		return repository.atualizaCadastro(cliente);
	}
	
	public Cliente achaCliente(String cliente) {
		return repository.achaCliente(cliente);
	}

}
