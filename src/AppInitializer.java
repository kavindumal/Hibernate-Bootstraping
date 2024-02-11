import config.SessionFactoryConfig;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
//        Session session = SessionFactoryConfig
//                .getInstance()
//                .getSession();
//
//        Transaction transaction = session.beginTransaction();
//
//        Customer customer = new Customer();
//        customer.setId(1);
//        customer.setName("Kavindu");
//        customer.setAddress("Galle");
//        customer.setSalary(99000.00);
//
//        session.save(customer);
//
//        transaction.commit();
//
//
//
//        session.close();
//
//
//        Session getSession = SessionFactoryConfig.
//                getInstance().
//                getSession();
//        Customer existingCustomer =
//                getSession.
//                        get(Customer.class,1);
//        System.out.println("Existting Customer" + existingCustomer);
//        session.close();
//
//        Session updateSession = SessionFactoryConfig.getInstance().getSession();
//
//        Transaction updateTransaction = updateSession.beginTransaction();
//
//        Customer existingCus = updateSession.get(Customer.class,1);
//        existingCus.setAddress("Matara");
//        updateSession.update(existingCus);
//        updateTransaction.commit();
//        updateSession.close();

    Session deleteSession = SessionFactoryConfig.getInstance().getSession();

        Customer existingCus = deleteSession.get(Customer.class,1);
        existingCus.setAddress("Matara");
    Transaction deleteTransaction =
            deleteSession.beginTransaction();

    deleteSession.delete(existingCus);
    deleteTransaction.commit();

    }
}