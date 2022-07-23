package employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveemployee {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Employee employee = new Employee();
		employee.setId(22);
		employee.setName("sathvik");
		employee.setSalary(50000.00);
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		

	}

}
