//Q.1 : Hashset

//import java.util.HashSet;
//
//public class SetExamples {
//    public static void main(String[] args){
//        HashSet<String> student = new HashSet<>();
//
//        student.add("Gayatri");
//        student.add("Swati");
//        student.add("Ankita");
//        student.add("Priya");
//        student.add("Riya");
//
//        System.out.println(student);
//
//      for( String temp : student){
//            System.out.println(temp);
//        }
//    }
//}


//Q.2 :Hashset
//import java.util.HashSet;
//public class SetExamples {
//
//    public static void main(String[] args){
//            HashSet<Integer> numbers = new HashSet<>();
//
//            numbers.add(10);
//            numbers.add(34);
//            numbers.add(69);
//            numbers.add(34);
//            numbers.add(54);
//
//            System.out.println(numbers);

//            for (Integer temp : numbers) {
//                System.out.println(temp);
//            }
//        }
//    }

//Q.3 Hashset
//import java.util.HashSet;
//public class SetExamples {
//
//    public static void main(String[] args){
//        HashSet<String> fruits = new HashSet<>();
//           fruits.add("mango");
//           fruits.add("orange");
//           fruits.add("apple");
//           fruits.add("banana");
//           fruits.add("mango");
//
//            System.out.println("check this fruit are exists :"+fruits.contains("mango"));
//
//            for (String temp : fruits) {
//        System.out.println(temp);
//            }
//                    }
//                    }
//


//Q.4 Hashset
//import java.util.HashSet;
//public class SetExamples {
//
//    public static void main(String[] args){
//        HashSet<String> colours = new HashSet<>();
//        colours.add("yellow");
//        colours.add("red");
//        colours.add("pink");
//        colours.add("blue");
//
//        colours.remove("red");
//
//        System.out.println(colours);
//
//        for (String temp : colours) {
//            System.out.println(temp);
//        }
//    }
//}

//Q.1.LinkedHash

//import java.util.LinkedHashSet;
//public class SetExamples{
//    public static void main(String[] args){
//        LinkedHashSet<String> student = new LinkedHashSet<>();
//
//        student.add("Gayatri");
//        student.add("Swati");
//        student.add("Ankita");
//        student.add("Priya");
//        student.add("Priya");
//
//        System.out.println(student);
//
//    }
//}

//Q.2.LinkedHash

//import java.util.LinkedHashSet;
//public class SetExamples {
//    public static void main(String[] args){
//        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
//
//        numbers.add(201);
//        numbers.add(205);
//        numbers.add(208);
//        numbers.add(204);
//        numbers.add(205);
//
//        System.out.println(numbers);
//    }
//}



//Q.3 LinkedHashSet

//import java.util.LinkedHashSet;
//public class SetExamples {
//    public static void main(String[] args){
//        LinkedHashSet<String> cities = new LinkedHashSet<>();
//
//        cities.add("Nashik");
//        cities.add("Pune");
//        cities.add("Mumbai");
//        cities.add("Thane");
//
//        System.out.println(cities.remove("Nashik"));
//
//        for (String temp : cities) {
//            System.out.println(temp);
//        }
//    }
//}


//Q.1.Treeset

//import java.util.TreeSet;
//public class SetExamples {
//    public static void main(String[] args){
//        TreeSet<Integer> numbers = new TreeSet<>();
//
//        numbers.add(19);
//        numbers.add(25);
//        numbers.add(10);
//        numbers.add(201);
//        numbers.add(48);
//
//        System.out.println(numbers);
//
//        for( int temp : numbers){
//            System.out.println(temp);
//        }
//    }
//}

//Q.2.TreeSet

//import java.util.TreeSet;
//public class SetExamples {
//    public static void main(String[] args){
//        TreeSet<String> names = new TreeSet<>();
//
//        names.add("Gayatri");
//        names.add("Ankita");
//        names.add("Priya");
//        names.add("Vidya");
//        names.add("Swati");
//
//
//
//        System.out.println(names);
//
//        for(String temp : names){
//            System.out.println(temp);
//        }
//    }
//}

//Q.3.TreeSet

import java.util.TreeSet;
public class SetExamples {
    public static void main(String[] args){
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(20);
        numbers.add(34);
        numbers.add(10);
        numbers.add(69);
        numbers.add(20);
        
        System.out.println(numbers);

        for(int temp : numbers){
            System.out.println(temp);
        }
    }
}