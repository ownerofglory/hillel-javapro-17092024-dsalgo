package ua.ithillel.dsalgo;

import ua.ithillel.dsalgo.list.MyArrayList;
import ua.ithillel.dsalgo.list.MyList;
import ua.ithillel.dsalgo.list.MySinglyLinkedList;
import ua.ithillel.dsalgo.map.MyHashMap;
import ua.ithillel.dsalgo.map.MyMap;
import ua.ithillel.dsalgo.map.MyTreeMap;
import ua.ithillel.dsalgo.model.person.Employee;
import ua.ithillel.dsalgo.model.person.Student;
import ua.ithillel.dsalgo.model.product.Book;

import java.time.LocalDateTime;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        MyMap<String, Integer> badTreeMap = new MyTreeMap<>();
        badTreeMap.put("Berlin", 3_755_000);
        badTreeMap.put("Istanbul", 15_655_000);
        badTreeMap.put("London", 8_800_000);
        badTreeMap.put("Odessa", 1_100_000);
        badTreeMap.put("Vienna", 2_200_000);


        MyMap<String, Integer> treeMap = new MyTreeMap<>((city1, city2) -> city2.compareTo(city1));
        treeMap.put("Istanbul", 15_655_000);
        treeMap.put("London", 8_800_000);
        treeMap.put("Berlin", 3_755_000);
        treeMap.put("Kyiv", 2_950_000);
        treeMap.put("Odessa", 1_100_000);
        treeMap.put("Kharkiv", 1_400_000);
        treeMap.put("Vienna", 2_000_000);
        treeMap.put("Bucharest", 1_700_000);
        treeMap.put("Prague", 2_400_000);
        treeMap.put("Budapest", 1_600_000);
        treeMap.put("Paris", 2_000_000);

        treeMap.put("Vienna", 2_200_000);

        Integer populationOfKyiv1 = treeMap.get("Kyiv");
        Integer populationOfOdessa = treeMap.get("Odessa");


        Student student1 = new Student("Alice", "Johnson", LocalDateTime.of(2000, 5, 15, 0, 0), 3.8);
        Student student2 = new Student("Bob", "Smith", LocalDateTime.of(2001, 8, 20, 0, 0), 3.6);
        Student student3 = new Student("Charlie", "Brown", LocalDateTime.of(2002, 12, 10, 0, 0), 3.9);
        Student student4 = new Student("Diana", "Williams", LocalDateTime.of(1999, 2, 28, 0, 0), 3.7);
        Student student5 = new Student("Evan", "Davis", LocalDateTime.of(2003, 11, 5, 0, 0), 4.0);

        Book book1 = new Book.Builder()
                .setId("1")
                .setName("Effective Java")
                .setDescription("A comprehensive guide to best practices in Java")
                .setAuthor("Joshua Bloch")
                .setPublisher("Addison-Wesley")
                .setCategory("Programming")
                .setType("Technical")
                .build();

        Book book2 = new Book.Builder()
                .setId("2")
                .setName("Clean Code")
                .setDescription("A Handbook of Agile Software Craftsmanship")
                .setAuthor("Robert C. Martin")
                .setPublisher("Prentice Hall")
                .setCategory("Programming")
                .setType("Technical")
                .build();

        Book book3 = new Book.Builder()
                .setId("3")
                .setName("Java: The Complete Reference")
                .setDescription("A comprehensive reference to the Java programming language")
                .setAuthor("Herbert Schildt")
                .setPublisher("McGraw-Hill Education")
                .setCategory("Programming")
                .setType("Reference")
                .build();

        Book book4 = new Book.Builder()
                .setId("4")
                .setName("Introduction to Algorithms")
                .setDescription("The standard text for algorithms and data structures")
                .setAuthor("Thomas H. Cormen")
                .setPublisher("MIT Press")
                .setCategory("Computer Science")
                .setType("Textbook")
                .build();

        Book book5 = new Book.Builder()
                .setId("5")
                .setName("Design Patterns: Elements of Reusable Object-Oriented Software")
                .setDescription("A classic guide to design patterns in software engineering")
                .setAuthor("Erich Gamma")
                .setPublisher("Addison-Wesley")
                .setCategory("Programming")
                .setType("Technical")
                .build();

        Book book6 = new Book.Builder()
                .setId("6")
                .setName("Java Concurrency in Practice")
                .setDescription("A deep dive into concurrency and multithreading in Java")
                .setAuthor("Brian Goetz")
                .setPublisher("Addison-Wesley")
                .setCategory("Programming")
                .setType("Technical")
                .build();

        Book book7 = new Book.Builder()
                .setId("7")
                .setName("Refactoring: Improving the Design of Existing Code")
                .setDescription("A guide to refactoring techniques and best practices")
                .setAuthor("Martin Fowler")
                .setPublisher("Addison-Wesley")
                .setCategory("Programming")
                .setType("Technical")
                .build();

        Book book8 = new Book.Builder()
                .setId("8")
                .setName("Cracking the Coding Interview")
                .setDescription("A guide to acing technical interviews with coding questions and solutions")
                .setAuthor("Gayle Laakmann McDowell")
                .setPublisher("CareerCup")
                .setCategory("Interview Preparation")
                .setType("Practical")
                .build();

        Book book9 = new Book.Builder()
                .setId("9")
                .setName("Head First Java")
                .setDescription("An engaging introduction to Java programming for beginners")
                .setAuthor("Kathy Sierra")
                .setPublisher("O'Reilly Media")
                .setCategory("Programming")
                .setType("Educational")
                .build();

        Book book10 = new Book.Builder()
                .setId("10")
                .setName("The Pragmatic Programmer")
                .setDescription("A guide to pragmatic software development techniques")
                .setAuthor("Andrew Hunt")
                .setPublisher("Addison-Wesley")
                .setCategory("Programming")
                .setType("Technical")
                .build();


        //
        Comparator<Student> studentAgeComparator = (left, right) -> {
            return right.getDateOfBirth().compareTo(left.getDateOfBirth());
        };

//        Map<Student, List<Book>> studentBookAssignment = new TreeMap<>(studentAgeComparator);
        MyMap<Student, List<Book>> studentBookAssignment = new MyTreeMap<>(studentAgeComparator);
        studentBookAssignment.put(student1, Arrays.asList(book1, book2, book3));
        studentBookAssignment.put(student2, Arrays.asList(book1, book2));
        studentBookAssignment.put(student3, Arrays.asList(book5, book6));
        studentBookAssignment.put(student4, Arrays.asList(book8, book4));






        System.out.println(treeMap);


        MyMap<String, Integer> map = new MyHashMap<>();
        map.put("Istanbul", 15_655_000);
        map.put("London", 8_800_000);
        map.put("Berlin", 3_755_000);
        map.put("Kyiv", 2_950_000);
        map.put("Odessa", 1_100_000);
        map.put("Kharkiv", 1_400_000);
        map.put("Vienna", 2_000_000);
        map.put("Bucharest", 1_700_000);
        map.put("Prague", 2_400_000);
        map.put("Budapest", 1_600_000);
        map.put("Paris", 2_000_000);

        map.put("Vienna", 2_200_000);


        Map<String, Integer> populationByCiy = new HashMap<>();

        populationByCiy.put("Istanbul", 15_655_000);
        populationByCiy.put("London", 8_800_000);
        populationByCiy.put("Berlin", 3_755_000);
        populationByCiy.put("Kyiv", 2_950_000);
        populationByCiy.put("Odessa", 1_100_000);
        populationByCiy.put("Kharkiv", 1_400_000);
        populationByCiy.put("Vienna", 2_000_000);

        Set<String> strings = populationByCiy.keySet();
        for (String key : strings) {
            Integer i = populationByCiy.get(key);
        }

        Collection<Integer> values = populationByCiy.values();

        System.out.println(populationByCiy);

        Integer populationOfKyiv = populationByCiy.get("Kyiv");
        Integer populationOfLondon = populationByCiy.get("London");
        Integer populationOfBerlin = populationByCiy.get("Berlin");

        populationByCiy.put("Bucharest", 1_700_000);
        populationByCiy.put("Prague", 1_400_000);

        populationByCiy.put("Vienna", 2_200_000);

        System.out.println(populationByCiy);

        int keyValueSize = populationByCiy.size();
        Integer berlin = populationByCiy.remove("Berlin");


        Employee employee1 = new Employee("John", "Doe", LocalDateTime.of(1985, 3, 22, 0, 0), "Software Engineer");
        Employee employee2 = new Employee("Emma", "Taylor", LocalDateTime.of(1990, 7, 15, 0, 0), "Project Manager");
        Employee employee3 = new Employee("Michael", "Brown", LocalDateTime.of(1978, 11, 30, 0, 0), "Product Designer");
        Employee employee4 = new Employee("Sophia", "Williams", LocalDateTime.of(1988, 5, 10, 0, 0), "Data Analyst");
        Employee employee5 = new Employee("James", "Wilson", LocalDateTime.of(1995, 9, 18, 0, 0), "Marketing Specialist");

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        boolean contains = employees.contains(new Employee("John", "Doe", LocalDateTime.of(1985, 3, 22, 0, 0), "Software Engineer"));


        // FIFO - first in first out
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("Hello");
        stringQueue.add("World");
        stringQueue.add("Hillel");

        int size1 = stringQueue.size();
        stringQueue.offer("Hillel");

        if (!stringQueue.isEmpty()) {
            String first = stringQueue.remove();
        }

        String poll = stringQueue.poll();
        if (poll != null) {
            System.out.println(poll);
        }

        // LIFO - last in first out
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(10);
        stack.push(12);
        stack.push(5);

        Integer last = stack.pop();
        Integer semiLast = stack.pop();


        //
        List<String> linkedList = new LinkedList<>();

//        List<String> list = new LinkedList<>();
        MyList<String> list = new MySinglyLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("hello");
        list.add("world");

        String s = list.get(2);

        String remove = list.remove(2);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String str: list) {
            System.out.println(str);
        }


        MyList<Integer> integerMyList = new MyArrayList<>();

        integerMyList.add(12);
        integerMyList.add(23);
        integerMyList.add(12);
        integerMyList.add(-100);
        integerMyList.add(-34);
        integerMyList.add(2355);
        integerMyList.add(256);


        integerMyList.remove(1);
        integerMyList.remove(5);

        for (Integer myInt: integerMyList) {
            System.out.println(myInt);
        }

        Integer i1 = integerMyList.get(2);


        List<Integer> intList = new ArrayList<>(200);

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(50);

        Integer i = intList.get(3);

        int size = intList.size();

        intList.set(2, 100);

        intList.remove(3);

        for (int j = 0; j < 100; j++) {
            intList.add(j);
        }

        // for each
        for (Integer it: intList) {
            System.out.println(it);
        }

        System.out.println();

        // array of ints
//        int[] intArr = null;
//        intArr = new int[10];
//
//        int length = intArr.length;
//
//        intArr[3] = 23; // random access
//        intArr[8] = 22;
//
//
//        int[][] twoDimensionalArray = new int[4][];
//        twoDimensionalArray[0] = new int[]{1, 2};
//        twoDimensionalArray[1] = new int[10];
//        twoDimensionalArray[3] = new int[]{};
//
//        twoDimensionalArray = new int[10][10];


        System.out.println();
    }
}
