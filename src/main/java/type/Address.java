package type;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Address {

    private String city;
    private String street;
    private String zipcode;

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    // 값 타입은 불변 객체로 설계
    private void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    // 값 타입은 불변 객체로 설계
    private void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    // 값 타입은 불변 객체로 설계
    private void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    // 값 타입의 동등성 비교를 위해 메소드를 재정의
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(zipcode, address.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, zipcode);
    }
}
