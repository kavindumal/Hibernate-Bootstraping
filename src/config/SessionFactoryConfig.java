package config;

import entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryConfig {
    private static SessionFactoryConfig factoryConfig;

    private SessionFactoryConfig() {

    }

    public static SessionFactoryConfig getInstance() {
        return (null == factoryConfig) ? factoryConfig = new SessionFactoryConfig() : factoryConfig;
    }

    public Session getSession() {
        //  1)  create a service registry.
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();

        //  2)  create a metadata object.
        Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(Customer.class)
                .getMetadataBuilder()
                .build();

        //  3)  create a Session Factory
        SessionFactory sessionFactory = metadata
                .buildSessionFactory();

        //  create and open the session
        return sessionFactory.openSession();
    }

}
