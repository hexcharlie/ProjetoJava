package controller;

import java.util.ArrayList;
import java.util.UUID;
import model.Cliente;
import service.ClienteService;

public class ClienteController {
	
    private ClienteService service = new ClienteService();
	
    public ArrayList<Cliente> listaClientes() {
        return service.listaClientes();
    }
    
    public Cliente atualizaCadastro(Cliente cliente) {
        return service.atualizaCadastro(cliente);
    }

    public String apagaCadastro(String email) {
        return service.deletaCliente(email);
    }
    
    public String novoCadastro() {
    	return service.cadastroCliente();
    }
    
    public Cliente achaCliente(String cliente) {
    	return service.achaCliente(cliente);
    }
    
    
    

}
