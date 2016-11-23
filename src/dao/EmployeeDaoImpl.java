package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.EmployeeDetails;
import util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void saveEmployee(EmployeeDetails employee) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(employee);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<EmployeeDetails> showAllEmployees() {
		List<EmployeeDetails> employeeList = new ArrayList<EmployeeDetails>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("From EmployeeDetails");
		employeeList = query.list();
		session.close();
		return employeeList;
	}

	@Override
	public void updateEmployee(EmployeeDetails employee) {
		System.out.println("name :" + employee.getEname());
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.merge(employee);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void deleteEmployee(EmployeeDetails employee) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(employee);
		transaction.commit();
		session.close();
	}

}
