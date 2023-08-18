package repository;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import main.Menu;
import model.Cliente;

public class ClienteRepository {

	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private Menu main = new Menu();
	public Scanner leia = new Scanner(System.in);
	
	
    public ArrayList<Cliente> listaClientes() {
        return clientes;
    }

    public String cadastroCliente() {
    	Cliente cliente = new Cliente();
    		System.out.println("Nome");
    		String nome = leia.next();
    		cliente.setNome(nome);   		
    		System.out.println("Endereço");
    		String endereco = leia.next();
    		cliente.setEndereco(endereco);
    		System.out.println("Email");
    		String email = leia.next();
    		cliente.setEmail(email);
    		System.out.println("Senha");
    		String senha = leia.next();
    		cliente.setSenha(senha);
    		cliente.setId(UUID.randomUUID());
    		
    	 clientes.add(cliente);
    	 main.showMenu();
		return "Ok";
    }
	
    public String deletaCliente(String email) {
    	clientes.removeIf(x -> x.getEmail() == (email));
        return null;
    }
    
    Cliente cliente;
    public Cliente achaCliente(String email) {
    	    	clientes.forEach((Cliente e) -> {
    		if(e.getEmail() == email) {
    			cliente = e;
    		} 
    	});
		return cliente;
    }

    public Cliente atualizaCadastro(Cliente cliente) {
        int idx = 0;
        String email = " ";
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getEmail() == (cliente.getEmail())) {
                email = cliente.getEmail();
                idx = i;
                break;
            }
        }
        
        Cliente atualizaCliente = new Cliente();
        atualizaCliente.setNome(cliente.getNome());
        atualizaCliente.setEmail(cliente.getEmail());
        atualizaCliente.setEndereco(cliente.getEndereco());
        clientes.set(idx, cliente);
        return atualizaCliente;
       
    }
}
