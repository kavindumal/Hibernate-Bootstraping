package entity;

import embedded.NameIdentifier;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity(name = "customer")
public class Customer {
    @Id // tells hibernate to this is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int id;

    @Column(name = "customer_name")
    private NameIdentifier name;

    @Transient
    @Column(name = "customer_address")
    private String address;

    @Column(name = "customer_salary")
    @Transient
    private double salary;

    @Transient
    @Column(name = "m_number")
    private int moNumber;

    @CreationTimestamp
    private Timestamp timestamp;

    public Customer() {
    }

    public Customer(int id, NameIdentifier name, String address, double salary, int moNumber, Timestamp timestamp) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.moNumber = moNumber;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NameIdentifier getName() {
        return name;
    }

    public void setName(NameIdentifier name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getMoNumber() {
        return moNumber;
    }

    public void setMoNumber(int moNumber) {
        this.moNumber = moNumber;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", moNumber=" + moNumber +
                '}';
    }
}
