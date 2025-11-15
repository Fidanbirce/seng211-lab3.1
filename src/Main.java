public class Main {
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("Aşk ve Gurur","Jane Austin",150.0);

        b1.showDetails();
        b2.showDetails();

        Student s1=new Student();
        s1.info();

        System.out.println(s1.age);
        System.out.println(s1.name);
        s1.info();
    }
}
