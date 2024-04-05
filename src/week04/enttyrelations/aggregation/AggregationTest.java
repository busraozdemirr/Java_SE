package week04.enttyrelations.aggregation;

public class AggregationTest {
    public static void main(String[] args) {
        //  Address address = new Address("2037","Ankara");
        //System.out.println(address);

        AggregateEmployee employee=new AggregateEmployee(1,"Büşra",new Address("2037","Ankara"));
        System.out.println(employee);
    }
}