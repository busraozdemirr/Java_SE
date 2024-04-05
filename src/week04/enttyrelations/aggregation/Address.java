package week04.enttyrelations.aggregation;

public class Address {

    private final String streat;
private final String city;

public Address(String streat,String city){

    this.streat=streat;
    this.city=city;


}

    @Override
    public String toString() {
        return "Address{" +
                "streat='" + streat + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
