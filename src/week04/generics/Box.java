package week04.generics;

public class Box<T> {
    private T item;
    public void additem(T item){
        this.item=item;


    }
    public T getItem(){
      return item;

    }

    public static void main(String[] args) {
        Box<String>stringBox= new Box<>();
        stringBox.additem("Merhaba Dünya!");
        String message =stringBox.getItem();
        System.out.println("Message:"+message);

        Box<Integer>integerBox=new Box<>();
        integerBox.additem(42);
        int number=integerBox.getItem();
        System.out.println("Sayı:"+number);
    }
}
