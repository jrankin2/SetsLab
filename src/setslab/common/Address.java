package setslab.common;

import java.util.Objects;

public class Address {
    private String address1;
    private String address2;
    private String city;
    private String phone;
    private String email;
    private String state;
    private String zipcode;

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


    public Address(String address1, String address2) {
        this.address1 = address1;
        this.address2 = address2;
    }

    public Address(String address1, String city, String phone) {
        this.address1 = address1;
        this.city = city;
        this.phone = phone;
    }
    
    public String getState() {
        return state;
    }

    
    public void setState(String state) {
        this.state = state;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.address1);
        hash = 53 * hash + Objects.hashCode(this.address2);
        hash = 53 * hash + Objects.hashCode(this.city);
        hash = 53 * hash + Objects.hashCode(this.phone);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if (!Objects.equals(this.address1, other.address1)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Address{" + "address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", phone=" + phone + ", email=" + email + '}';
    }

    
}
