package creational.builder;

import java.util.Date;

public class Person {

    public static class Builder {
        private String name;
        private String address;
        private Date dateOfBirth;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder dateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    private String name;
    private String address;
    private Date dateOfBirth;

    private Person(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.dateOfBirth = builder.dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
