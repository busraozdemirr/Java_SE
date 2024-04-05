package week04.enttyrelations.Composition;

import week04.enttyrelations.aggregation.Address;

public class CompositeEmployee {
    private final int id;
    private final String name;
    private final Address address;


    @Override
    public String toString() {
        return "AggregateEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public CompositeEmployee(int id, String name, String street, String city) {
        this.id = id;
        this.name = name;
        this.address = new Address(street, city);
    }



        private static class Address {
        private final String streat;
        private final String city;

        public Address(String streat, String city) {

            this.streat = streat;
            this.city = city;

        }

        @Override
        public String toString() {
            return "Address{" +
                    "streat='" + streat + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }










}
