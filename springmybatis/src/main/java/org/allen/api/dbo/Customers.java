package org.allen.api.dbo;

import javax.persistence.*;

@Table(name = "dbo.Customers")
public class Customers {
    @Id
    @Column(name = "CustomerId")
    private Integer customerid;

    @Column(name = "Name")
    private String name;

    @Column(name = "Location")
    private String location;

    @Column(name = "Email")
    private String email;

    /**
     * @return CustomerId
     */
    public Integer getCustomerid() {
        return customerid;
    }

    /**
     * @param customerid
     */
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    /**
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return Location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * @return Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}