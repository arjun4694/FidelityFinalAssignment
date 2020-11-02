package testHibernate;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

@SuppressWarnings("deprecation")
public class Employee_read {
	public static void get_data(int employeeid) {
		try {
			SessionFactory sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
			Session session = sessionfactory.openSession();
			Employee obj_Employee = new Employee();
			Criteria crit = session.createCriteria(Employee.class);
			crit.add(Restrictions.eq("employeeid", employeeid));
			List results = crit.list();

			for (Iterator iterator = results.iterator(); iterator.hasNext();) {
				Employee employee = (Employee) iterator.next();
				System.out.println("Employee name: " + employee.getEmployee_name());
				System.out.println("Employee mobile number: " + employee.getMobil_no());
				System.out.println("Employee id: " + employee.getEmployeeid());

			}

			session.beginTransaction().commit();
			session.close();
			sessionfactory.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}