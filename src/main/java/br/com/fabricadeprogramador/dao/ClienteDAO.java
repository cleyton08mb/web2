package br.com.fabricadeprogramador.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.fabricadeprogramador.entidade.Cliente;


public class ClienteDAO {

	private EntityManager em;

	public ClienteDAO() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cliente_db");
		 em = emf.createEntityManager();
	}

	public void salvar(Cliente cliente) {
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
	}

	public void excluir(Cliente cliente) {
		em.getTransaction();
		em.remove(cliente);
		em.getTransaction().commit();
	}

	public List<Cliente> buscarTodos() {
Query q =em.createNamedQuery("select c from Cliente");
	return q.getResultList();
	}

	public Cliente buscarPorId(int id) {
		return em.find(Cliente.class, id);

		
	}

	
}
