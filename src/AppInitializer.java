import config.SessionFactoryConfig;
import embedded.NameIdentifier;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        System.out.println("Create");
        Session session = SessionFactoryConfig
                .getInstance()
                .getSession();

        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();
        customer.setId(1);
        NameIdentifier nameIdentifier = new NameIdentifier();
        nameIdentifier.setFirstName("kavindu");
        nameIdentifier.setMiddleName("malshan");
        nameIdentifier.setLastName("Jayasinghe");
        customer.setName(nameIdentifier);
        customer.setAddress("Galle");
        customer.setSalary(99000.00);
        customer.setMoNumber(074-5896589);

        session.save(customer);

        transaction.commit();



        session.close();

//        System.out.println("Update");
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
//
//        System.out.println("Delete");
//
//    Session deleteSession = SessionFactoryConfig.getInstance().getSession();
//
//        Customer existingCust = deleteSession.get(Customer.class,1);
//        existingCust.setAddress("Matara");
//    Transaction deleteTransaction =
//            deleteSession.beginTransaction();
//
//    deleteSession.delete(existingCust);
//    deleteTransaction.commit();

    }
}