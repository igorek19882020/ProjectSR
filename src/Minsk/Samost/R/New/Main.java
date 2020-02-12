package Minsk.Samost.R.New;

public class Main {
    public static void main(String[] args) {


        Person p = new Person("Vas", 45);
        p.setName("Igor");
        p.setAge(23);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.toString());
    }
}