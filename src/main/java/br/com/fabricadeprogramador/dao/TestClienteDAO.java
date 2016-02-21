package br.com.fabricadeprogramador.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fabricadeprogramador.entidade.Cliente;

public class TestClienteDAO {

	public static void main(String[] args) {
		
		
		Cliente c = new Cliente();
		c.setNome("Cleyton");
		c.setRg("001634751");
		c.setCpf("02926535147");
		
		ClienteDAO cDAO = new ClienteDAO();
		cDAO.salvar(c);
		
	}

}
