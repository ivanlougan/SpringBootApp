package pl.rob.springrelationonetoone.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = 1L;
    private String street;


    public Address() {
    }

    public Address(String street) {
        this.street = street;
    }

}
