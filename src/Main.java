import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {


        SomeClass<String,String,String> someClass = new SomeClass<>();
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("salam");

        }

        public static <T extends Number> void method1(ArrayList<? extends Number> a ){
        System.out.println(a.size());

        }

        }





       /*
        Generics = new Generics(generic);
        generics.var1 = String.valueOf(12);
        generics.var2 = 13;
        generics.var2 = 14;
        generics.var2 = 15;
        System.out.println(generics.var1);
        System.out.println(generics);






        ArrayList<Integer> ar = new ArrayList<>();
        SomeClass<Integer, Double, String> someClass = new SomeClass<>("Syimuk");
        SomeClass.var1 = "Atabek";
        someClass.var2 = 25;
        System.out.println(someClass);


        method(123);
    }

    public static <T, V, C> void method(T a) {
        System.out.println(a);*/


