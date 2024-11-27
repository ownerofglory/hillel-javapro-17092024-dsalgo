package ua.ithillel.dsalgo;

import ua.ithillel.dsalgo.tree.TreeNode;
import ua.ithillel.dsalgo.util.*;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;


public class Application {


    public static void main(String[] args) {
        Integer[][] undirectedGraph = new Integer[][]{
                {0, 1},
                {1, 4},
                {1, 2},
                {2, 5},
                {4, 5},
                {4, 3},
                {5, 8},
                {5, 6},
                {6, 7},
        };

        Map<Integer, List<Integer>> undirectedGrapMap = GraphUtil.edgeListToAdjacency(undirectedGraph);
        if (undirectedGrapMap == null) {

        }
        System.out.println(undirectedGrapMap);

        System.out.println(GraphUtil.depthFirstTraversal(undirectedGrapMap, 0));
        System.out.println(GraphUtil.depthFirstTraversal(undirectedGrapMap, 8));
        System.out.println(GraphUtil.depthFirstTraversal(undirectedGrapMap, 5));

        System.out.println(GraphUtil.breadthFirstTraversal(undirectedGrapMap, 0));
        System.out.println(GraphUtil.breadthFirstTraversal(undirectedGrapMap, 8));
        System.out.println(GraphUtil.breadthFirstTraversal(undirectedGrapMap, 5));

        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", List.of("B", "D", "E"));
        graph.put("B", List.of("C", "D"));
        graph.put("C", List.of());
        graph.put("D", List.of("A", "E", "C"));
        graph.put("E", List.of());

        System.out.println("Depth first");

        System.out.println(GraphUtil.depthFirstTraversal(graph, "A"));
        System.out.println(GraphUtil.depthFirstTraversal(graph, "B"));
        System.out.println(GraphUtil.depthFirstTraversal(graph, "C"));
        System.out.println(GraphUtil.depthFirstTraversal(graph, "D"));
        System.out.println(GraphUtil.depthFirstTraversal(graph, "E"));

        System.out.println("Breadth first");

        System.out.println(GraphUtil.breadthFirstTraversal(graph, "A"));
        System.out.println(GraphUtil.breadthFirstTraversal(graph, "B"));
        System.out.println(GraphUtil.breadthFirstTraversal(graph, "C"));
        System.out.println(GraphUtil.breadthFirstTraversal(graph, "D"));
        System.out.println(GraphUtil.breadthFirstTraversal(graph, "E"));

        System.out.println("A to C" + GraphUtil.breadthFirstSearch(graph, "A", "C"));
        System.out.println("C to D" + GraphUtil.breadthFirstSearch(graph, "C", "D"));
        System.out.println("B to E" + GraphUtil.breadthFirstSearch(graph, "B", "E"));



        TreeNode<Character> a = new TreeNode<>('A');
        TreeNode<Character> b = new TreeNode<>('B');
        TreeNode<Character> c = new TreeNode<>('C');
        TreeNode<Character> d = new TreeNode<>('D');
        TreeNode<Character> e = new TreeNode<>('E');
        TreeNode<Character> f = new TreeNode<>('F');

        a.setLeft(b);
        a.setRight(c);

        b.setLeft(d);

        c.setLeft(e);
        c.setRight(f);

        List<Character> characters = TreeUtil.depthFirstTraverse(a);
        List<Character> charactersRec = TreeUtil.depthFirstTraverseRec(a);
        List<Character> characters1 = TreeUtil.breadthFirstTraverse(a);

//        new TreeMap<String, String>().put()

        Enumeration<Character> enumeration = Collections.enumeration(new ArrayList<>(characters));
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        for (Character character : a) {
            System.out.println(character);
        }

        System.out.println();
        System.out.println(characters);
        System.out.println(charactersRec);
        System.out.println(characters1);
        System.out.println();

        //        a
        //    /       \
        //   b          c
        //  /       /      \
        // d        e       f


//        SortUtil.printSleepSort(new int[] {1, 4, 2, 10, 8, 7, 5, 6});


//        Student alice = new Student("Alice", "Johnson", LocalDateTime.of(2000, 5, 15, 0, 0), 3.8);
//        Student bob = new Student("Bob", "Smith", LocalDateTime.of(2001, 8, 20, 0, 0), 3.6);
//        Student charlie = new Student("Charlie", "Brown", LocalDateTime.of(2002, 12, 10, 0, 0), 3.9);
//        Student diana = new Student("Diana", "Williams", LocalDateTime.of(1999, 2, 28, 0, 0), 3.7);
//        Student evan = new Student("Evan", "Davis", LocalDateTime.of(2003, 11, 5, 0, 0), 4.0);
//
//        Student[] students = {alice, bob, charlie, diana, evan};
////
//        int studentIdx = SearchUtil.binarySearchGen((s1, s2) -> {
//            return s1.getFirstName().compareTo(s2.getFirstName());
//        }, students, diana, 0, students.length - 1);
//
//        int[] arrInt = {1, 3, 4, 6, 8, 10, 11};
//        int i = SearchUtil.binarySearch(arrInt, 6, 0, arrInt.length - 1);
//        int i2 = SearchUtil.binarySearch(arrInt, 10, 0, arrInt.length - 1);
//        int i3 = SearchUtil.binarySearch(arrInt, 3, 0, arrInt.length - 1);
//
//
//
//        System.out.println(ArithmeticUtil.maxRecGen(3, 5, 1, 2,-10));
//        System.out.println(ArithmeticUtil.maxRecGen(alice, bob, charlie, diana, evan));
//        System.out.println(ArithmeticUtil.<Student>maxRecGen((s1, s2) -> {
//            return s2.getFirstName().compareTo(s1.getFirstName());
//        }, alice, bob, charlie, diana, evan));
//
//
//        System.out.println(ArithmeticUtil.max(3, 5, 1, 2,-10));
//        System.out.println(ArithmeticUtil.maxRec(3, 5, 1, 2,-10));
//        System.out.println(ArithmeticUtil.maxRec(3));
//
//
//        System.out.println(StringUtil.reverseString("Hello"));
//        System.out.println(StringUtil.reverseStringRec("Hello"));
//        System.out.println(StringUtil.reverseString("World!"));
//        System.out.println(StringUtil.reverseStringRec("World!"));

//        Student alice = new Student("Alice", "Johnson", LocalDateTime.of(2000, 5, 15, 0, 0), 3.8);
//        Student bob = new Student("Bob", "Smith", LocalDateTime.of(2001, 8, 20, 0, 0), 3.6);
//        Student charlie = new Student("Charlie", "Brown", LocalDateTime.of(2002, 12, 10, 0, 0), 3.9);
//        Student diana = new Student("Diana", "Williams", LocalDateTime.of(1999, 2, 28, 0, 0), 3.7);
//        Student evan = new Student("Evan", "Davis", LocalDateTime.of(2003, 11, 5, 0, 0), 4.0);
//
//        Map<String, Student> studentsMap = new HashMap<>();
//        Set<String> strings = studentsMap.keySet();
//        for (String key: studentsMap.keySet()) {
//            Student student = studentsMap.get(key);
//        }
//
//        Set<Student> javaStudents = new HashSet<>();
//        javaStudents.add(alice);
//        javaStudents.add(bob);
//        javaStudents.add(charlie);
//
//        Set<Student> frontEndStudents = new LinkedHashSet<>();
//        frontEndStudents.add(evan);
//        frontEndStudents.add(alice);
//        frontEndStudents.add(diana);
//
//        Set<Student> javaAndFrontEndStudents = new LinkedHashSet<>();
//        javaAndFrontEndStudents.addAll(javaStudents);
//        javaAndFrontEndStudents.addAll(frontEndStudents);
//
//
//        Set<Student> studentsOfBoth = new TreeSet<>(javaStudents);
//        studentsOfBoth.retainAll(frontEndStudents);
//
//        Queue<Student> queue = new PriorityQueue<>((s1, s2) -> {
//            return s1.getFirstName().compareTo(s2.getFirstName());
//        }) ;
//
//
//        queue.add(alice);
//        queue.add(bob);
//        queue.add(charlie);
//        queue.add(diana);
//        queue.add(evan);
//
//        for (Student student : queue) {
//            System.out.println(student);
//        }
//
//        Deque<Student> deque = new LinkedList<>(); // Double-ended queue ; deck
//        deque.addFirst(alice);
//        deque.addLast(alice); // add
//        Student student = deque.removeFirst();


        System.out.println();


        // Map<K, V>


//        Func funcName = () -> {
//            System.out.println("Hello from func");
//        };
//
//        Supplier<String> strSupplier = Application::getSomeStr;
//        strSupplier = new Supplier<String>() {
//            @Override
//            public String get() {
//                return "";
//            }
//        };
//
//        var srtGetterSetter = new GetterSetter<String>() {
//            private String value;
//
//            @Override
//            public String get() {
//                return value;
//            }
//
//            @Override
//            public void set(String s) {
//                this.value = s;
//            }
//
//            public void printValue() {
//                System.out.println(value);
//            }
//        };
//
//        srtGetterSetter.printValue();
//
//        Class<? extends GetterSetter<String>> aClass = srtGetterSetter.getClass();
//        String simpleName = aClass.getSimpleName();
//
//
//        int random1 = (int) (Math.random() * 100); // 0 ... 1.0 * 100
//        double random2 = Math.random();
//        double random3 = Math.random();
//        double random4 = Math.random();
//
//        funcName.foo();

//        Supplier<Double> supplier = new Supplier<Double>() {
//
//            @Override
//            public Double get() {
//                return Math.random() * 100;
//            }
//        };
//
//
//        Book book1 = new Book.Builder()
//                .setId("1")
//                .setName("Effective Java")
//                .setDescription("A comprehensive guide to best practices in Java")
//                .setAuthor("Joshua Bloch")
//                .setPublisher("Addison-Wesley")
//                .setCategory("Programming")
//                .setType("Technical")
//                .build();
//
//        Book book2 = new Book.Builder()
//                .setId("2")
//                .setName("Clean Code")
//                .setDescription("A Handbook of Agile Software Craftsmanship")
//                .setAuthor("Robert C. Martin")
//                .setPublisher("Prentice Hall")
//                .setCategory("Programming")
//                .setType("Technical")
//                .build();
//
//        Book book3 = new Book.Builder()
//                .setId("3")
//                .setName("Java: The Complete Reference")
//                .setDescription("A comprehensive reference to the Java programming language")
//                .setAuthor("Herbert Schildt")
//                .setPublisher("McGraw-Hill Education")
//                .setCategory("Programming")
//                .setType("Reference")
//                .build();
//
//        Book book4 = new Book.Builder()
//                .setId("4")
//                .setName("Introduction to Algorithms")
//                .setDescription("The standard text for algorithms and data structures")
//                .setAuthor("Thomas H. Cormen")
//                .setPublisher("MIT Press")
//                .setCategory("Computer Science")
//                .setType("Textbook")
//                .build();
//
//        Book book5 = new Book.Builder()
//                .setId("5")
//                .setName("Design Patterns: Elements of Reusable Object-Oriented Software")
//                .setDescription("A classic guide to design patterns in software engineering")
//                .setAuthor("Erich Gamma")
//                .setPublisher("Addison-Wesley")
//                .setCategory("Programming")
//                .setType("Technical")
//                .build();
//
//        Book book6 = new Book.Builder()
//                .setId("6")
//                .setName("Java Concurrency in Practice")
//                .setDescription("A deep dive into concurrency and multithreading in Java")
//                .setAuthor("Brian Goetz")
//                .setPublisher("Addison-Wesley")
//                .setCategory("Programming")
//                .setType("Technical")
//                .build();
//
//        Book book7 = new Book.Builder()
//                .setId("7")
//                .setName("Refactoring: Improving the Design of Existing Code")
//                .setDescription("A guide to refactoring techniques and best practices")
//                .setAuthor("Martin Fowler")
//                .setPublisher("Addison-Wesley")
//                .setCategory("Programming")
//                .setType("Technical")
//                .build();
//
//        Book book8 = new Book.Builder()
//                .setId("8")
//                .setName("Cracking the Coding Interview")
//                .setDescription("A guide to acing technical interviews with coding questions and solutions")
//                .setAuthor("Gayle Laakmann McDowell")
//                .setPublisher("CareerCup")
//                .setCategory("Interview Preparation")
//                .setType("Practical")
//                .build();
//
//        Book book9 = new Book.Builder()
//                .setId("9")
//                .setName("Head First Java")
//                .setDescription("An engaging introduction to Java programming for beginners")
//                .setAuthor("Kathy Sierra")
//                .setPublisher("O'Reilly Media")
//                .setCategory("Programming")
//                .setType("Educational")
//                .build();
//
//        Book book10 = new Book.Builder()
//                .setId("10")
//                .setName("The Pragmatic Programmer")
//                .setDescription("A guide to pragmatic software development techniques")
//                .setAuthor("Andrew Hunt")
//                .setPublisher("Addison-Wesley")
//                .setCategory("Programming")
//                .setType("Technical")
//                .build();
//
//        List<Book> books = List.of(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10);
//
//
//        Stream<Object> empty = Stream.empty();
//
//        books.stream()
//                .parallel()
//                .peek(System.out::println)
//                .filter(s -> !s.getAuthor().equals("Andrew Hunt"));
//
//
//
//
//        boolean allMatch = books.stream()
//                .allMatch(b -> b.getName().length() > 5);
//
//        boolean programmingPresent = books.
//                stream()
//                .anyMatch(b -> b.getCategory().equals("Programming"));
//
//        Optional<Book> max = books
//                .stream()
//                .max((b1, b2) -> b1.getCategory().compareTo(b2.getCategory()));
//
//        Optional<Book> book31 = Optional.of(book3);
//
//        Optional<Book> any = books
//                .stream().findFirst();
//
//        if (max.isPresent()) {
//            Book book = max.get();
//        }
//
//        Book book = max.orElseGet(Book::new);
//        max.orElseThrow(() -> new RuntimeException("Book not found"));
//
//
//        Map<String, List<Book>> collect = books.stream()
//                .peek(System.out::println)
//                .filter(s -> !s.getAuthor().equals("Andrew Hunt"))
//                .collect(Collectors.groupingBy(Book::getCategory)); // terminal
//
//        books.stream()
//                .peek(System.out::println)
//                .filter(s -> !s.getAuthor().equals("Andrew Hunt"))
//                .collect(Collectors.toMap(b -> b.getCategory(), b -> b));
//
//        List<Book> randomBooks = Stream
//                .generate(Book::new)
//                .peek(b -> {
//                    b.setAuthor(Math.random() + "");
//                    b.setCategory(Math.random() + "");
//                    b.setCategory(Math.random() + "");
//                    b.setDescription(Math.random() + "");
//                })
//                .peek(System.out::println)
//                .limit(100)
//                .toList();
//
//        List<Double> randomNums = Stream
//                .generate(() -> Math.random() * 100)
//                .limit(100)
//                .toList();
//
//        books.stream()
//                .collect(Collectors.toMap(
//                        book -> book.getCategory(),
//                                (List<Book> list) -> list.add(book))
//                ));

//        Appender helloAppender = AppenderUtil.createAppender("Hello");
//        helloAppender.append("World");


//        Student student1 = new Student("Alice", "Johnson", LocalDateTime.of(2000, 5, 15, 0, 0), 3.8);
//        Student student2 = new Student("Bob", "Smith", LocalDateTime.of(2001, 8, 20, 0, 0), 3.6);
//        Student student3 = new Student("Charlie", "Brown", LocalDateTime.of(2002, 12, 10, 0, 0), 3.9);
//        Student student4 = new Student("Diana", "Williams", LocalDateTime.of(1999, 2, 28, 0, 0), 3.7);
//        Student student5 = new Student("Evan", "Davis", LocalDateTime.of(2003, 11, 5, 0, 0), 4.0);
//
//        List<Student> studentList = List.of(student1, student2, student3, student4, student5);
//

//        Stream<Object> empty = Stream.empty();
//        Stream<Student> studentStream = Stream.of(student1, student2, student3, student4, student5);
//        List<Student> studentWithHighGrades = studentStream
//                .peek(System.out::println) // intermediate
//                .filter(s -> s.getGpa() > 3.8) // intermediate
//                .collect(Collectors.toList()); // terminal
//
//        studentWithHighGrades = studentList.stream()
//                .peek(System.out::println)
//                .filter(s -> s.getGpa() > 3.8)
//                .toList(); // terminal
//
//        List<Employee> programmer = studentList.stream()
//                .peek(System.out::println) // intermediate
//                .filter(s -> s.getGpa() > 3.8) // intermediate
//                .map(s -> new Employee(s.getFirstName(), s.getLastName(), s.getDateOfBirth(), "SWE"))
//                .peek(System.out::println)
//                .toList();
//
//        Double sumOfGpa = studentList.stream()
//                .peek(System.out::println)
//                .reduce(0.0,
//                        (acc, student) -> acc + student.getGpa(),
//                        (acc1, acc2) -> acc1 + acc2);
//
//        long count = studentList.stream().count();
//
//
//        List<Student> students = StudentFilterUtil.filterStudents(studentList, s -> s.getGpa() > 3.8);
//
//        List<Student> filter = FilterUtil.filter(students, s -> s.getGpa() > 3.8);
//
//
//        PersonUtil.applyToPerson(student1, s -> System.out.println(s));
//
//        Consumer<Person> lastNameModifier = (s) -> s.setLastName("default");
//
//        PersonUtil.applyToPerson(student2, lastNameModifier);
//        PersonUtil.applyToPerson(student2, s -> System.out.println(s));
//        PersonUtil.applyToPerson(student2, System.out::println);
//
//        School school = SchoolCreator.createSchool(() -> new University());
//        school = SchoolCreator.createSchool(() -> new ElementarySchool());
//        school = SchoolCreator.createSchool(ElementarySchool::new);
//
//        Calculator calculator = new Calculator();
//        BinaryOperator<Double> doubleAdd = (x, y) -> x + y;
//        BinaryOperator<Double> doubleSubtracy = (x, y) -> x - y;
//
//        Double operate = calculator.operate(1.0, 2.0, doubleAdd);
//
//        Supplier<Book> builder = Book.newBuilder()::build;
//        BookUtil.generateBook(builder);
//        BookUtil.generateBook(Book.newBuilder()::build);
//
//        BookUtil.applyBook(Book::new, "New Book");
//
//        Function<String, Book> bookFunction = Book::new;
//
//        String prefix = "Prefix";
//        Function<String, Book> bookStringFunction = s -> {
//            return new Book(prefix + s);
//        };
//
//
//        Employee employee1 = new Employee("John", "Doe", LocalDateTime.of(1985, 3, 22, 0, 0), "Software Engineer");
//        Employee employee2 = new Employee("Emma", "Taylor", LocalDateTime.of(1990, 7, 15, 0, 0), "Project Manager");
//        Employee employee3 = new Employee("Michael", "Brown", LocalDateTime.of(1978, 11, 30, 0, 0), "Product Designer");
//        Employee employee4 = new Employee("Sophia", "Williams", LocalDateTime.of(1988, 5, 10, 0, 0), "Data Analyst");
//        Employee employee5 = new Employee("James", "Wilson", LocalDateTime.of(1995, 9, 18, 0, 0), "Marketing Specialist");
//
//
//        String personString = PersonUtil.convertPerson(employee1, new PersonStringConverter());
//
//        Function<Person, String> personStrConv = (Person p) -> {
//            return p.toString();
//        };
//
//        personStrConv = (Person p) -> p.toString();
//
//        personStrConv = (p) -> p.toString();
//
//        personStrConv = p -> p.toString();
//
//        personStrConv = Person::toString;
//
//        PersonUtil.convertPerson(employee1, p -> p.toString());
//        PersonUtil.convertPerson(employee1, Person::toString);
//
//        Book book = PersonUtil.convertPerson(employee2, p -> {
//            return Book.newBuilder().setAuthor(p.getFirstName() + " " + p.getLastName()).build();
//        });
//
//
//        MyMap<String, Integer> badTreeMap = new MyTreeMap<>();
//        badTreeMap.put("Berlin", 3_755_000);
//        badTreeMap.put("Istanbul", 15_655_000);
//        badTreeMap.put("London", 8_800_000);
//        badTreeMap.put("Odessa", 1_100_000);
//        badTreeMap.put("Vienna", 2_200_000);
//
//
//        MyMap<String, Integer> treeMap = new MyTreeMap<>((city1, city2) -> city2.compareTo(city1));
//        treeMap.put("Istanbul", 15_655_000);
//        treeMap.put("London", 8_800_000);
//        treeMap.put("Berlin", 3_755_000);
//        treeMap.put("Kyiv", 2_950_000);
//        treeMap.put("Odessa", 1_100_000);
//        treeMap.put("Kharkiv", 1_400_000);
//        treeMap.put("Vienna", 2_000_000);
//        treeMap.put("Bucharest", 1_700_000);
//        treeMap.put("Prague", 2_400_000);
//        treeMap.put("Budapest", 1_600_000);
//        treeMap.put("Paris", 2_000_000);
//
//        treeMap.put("Vienna", 2_200_000);
//
//        Integer populationOfKyiv1 = treeMap.get("Kyiv");
//        Integer populationOfOdessa = treeMap.get("Odessa");
//
//
//
//
//
//
//        //
//        Comparator<Student> studentAgeComparator = (left, right) -> {
//            return right.getDateOfBirth().compareTo(left.getDateOfBirth());
//        };
//
////        Map<Student, List<Book>> studentBookAssignment = new TreeMap<>(studentAgeComparator);
//        MyMap<Student, List<Book>> studentBookAssignment = new MyTreeMap<>(studentAgeComparator);
//        studentBookAssignment.put(student1, Arrays.asList(book1, book2, book3));
//        studentBookAssignment.put(student2, Arrays.asList(book1, book2));
//        studentBookAssignment.put(student3, Arrays.asList(book5, book6));
//        studentBookAssignment.put(student4, Arrays.asList(book8, book4));
//
//
//
//
//
//
//        System.out.println(treeMap);
//
//
//        MyMap<String, Integer> map = new MyHashMap<>();
//        map.put("Istanbul", 15_655_000);
//        map.put("London", 8_800_000);
//        map.put("Berlin", 3_755_000);
//        map.put("Kyiv", 2_950_000);
//        map.put("Odessa", 1_100_000);
//        map.put("Kharkiv", 1_400_000);
//        map.put("Vienna", 2_000_000);
//        map.put("Bucharest", 1_700_000);
//        map.put("Prague", 2_400_000);
//        map.put("Budapest", 1_600_000);
//        map.put("Paris", 2_000_000);
//
//        map.put("Vienna", 2_200_000);
//
//
//        Map<String, Integer> populationByCiy = new HashMap<>();
//
//        populationByCiy.put("Istanbul", 15_655_000);
//        populationByCiy.put("London", 8_800_000);
//        populationByCiy.put("Berlin", 3_755_000);
//        populationByCiy.put("Kyiv", 2_950_000);
//        populationByCiy.put("Odessa", 1_100_000);
//        populationByCiy.put("Kharkiv", 1_400_000);
//        populationByCiy.put("Vienna", 2_000_000);
//
//        Set<String> strings = populationByCiy.keySet();
//        for (String key : strings) {
//            Integer i = populationByCiy.get(key);
//        }
//
//        Collection<Integer> values = populationByCiy.values();
//
//        System.out.println(populationByCiy);
//
//        Integer populationOfKyiv = populationByCiy.get("Kyiv");
//        Integer populationOfLondon = populationByCiy.get("London");
//        Integer populationOfBerlin = populationByCiy.get("Berlin");
//
//        populationByCiy.put("Bucharest", 1_700_000);
//        populationByCiy.put("Prague", 1_400_000);
//
//        populationByCiy.put("Vienna", 2_200_000);
//
//        System.out.println(populationByCiy);
//
//        int keyValueSize = populationByCiy.size();
//        Integer berlin = populationByCiy.remove("Berlin");
//
//
//        Employee employee11 = new Employee("John", "Doe", LocalDateTime.of(1985, 3, 22, 0, 0), "Software Engineer");
//        Employee employee22 = new Employee("Emma", "Taylor", LocalDateTime.of(1990, 7, 15, 0, 0), "Project Manager");
//        Employee employee33 = new Employee("Michael", "Brown", LocalDateTime.of(1978, 11, 30, 0, 0), "Product Designer");
//        Employee employee44 = new Employee("Sophia", "Williams", LocalDateTime.of(1988, 5, 10, 0, 0), "Data Analyst");
//        Employee employee55 = new Employee("James", "Wilson", LocalDateTime.of(1995, 9, 18, 0, 0), "Marketing Specialist");
//
//        List<Employee> employees = new ArrayList<>();
//        employees.add(employee1);
//        employees.add(employee2);
//        employees.add(employee3);
//        employees.add(employee4);
//        employees.add(employee5);
//
//        boolean contains = employees.contains(new Employee("John", "Doe", LocalDateTime.of(1985, 3, 22, 0, 0), "Software Engineer"));
//
//
//        // FIFO - first in first out
//        Queue<String> stringQueue = new LinkedList<>();
//        stringQueue.add("Hello");
//        stringQueue.add("World");
//        stringQueue.add("Hillel");
//
//        int size1 = stringQueue.size();
//        stringQueue.offer("Hillel");
//
//        if (!stringQueue.isEmpty()) {
//            String first = stringQueue.remove();
//        }
//
//        String poll = stringQueue.poll();
//        if (poll != null) {
//            System.out.println(poll);
//        }
//
//        // LIFO - last in first out
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(10);
//        stack.push(12);
//        stack.push(5);
//
//        Integer last = stack.pop();
//        Integer semiLast = stack.pop();
//
//
//        //
//        List<String> linkedList = new LinkedList<>();
//
////        List<String> list = new LinkedList<>();
//        MyList<String> list = new MySinglyLinkedList<>();
//        list.add("a");
//        list.add("b");
//        list.add("hello");
//        list.add("world");
//
//        String s = list.get(2);
//
//        String remove = list.remove(2);
//
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        for (String str: list) {
//            System.out.println(str);
//        }
//
//
//        MyList<Integer> integerMyList = new MyArrayList<>();
//
//        integerMyList.add(12);
//        integerMyList.add(23);
//        integerMyList.add(12);
//        integerMyList.add(-100);
//        integerMyList.add(-34);
//        integerMyList.add(2355);
//        integerMyList.add(256);
//
//
//        integerMyList.remove(1);
//        integerMyList.remove(5);
//
//        for (Integer myInt: integerMyList) {
//            System.out.println(myInt);
//        }
//
//        Integer i1 = integerMyList.get(2);
//
//
//        List<Integer> intList = new ArrayList<>(200);
//
//        intList.add(1);
//        intList.add(2);
//        intList.add(3);
//        intList.add(50);
//
//        Integer i = intList.get(3);
//
//        int size = intList.size();
//
//        intList.set(2, 100);
//
//        intList.remove(3);
//
//        for (int j = 0; j < 100; j++) {
//            intList.add(j);
//        }
//
//        // for each
//        for (Integer it: intList) {
//            System.out.println(it);
//        }
//
//        System.out.println();
//
//        // array of ints
////        int[] intArr = null;
////        intArr = new int[10];
////
////        int length = intArr.length;
////
////        intArr[3] = 23; // random access
////        intArr[8] = 22;
////
////
////        int[][] twoDimensionalArray = new int[4][];
////        twoDimensionalArray[0] = new int[]{1, 2};
////        twoDimensionalArray[1] = new int[10];
////        twoDimensionalArray[3] = new int[]{};
////
////        twoDimensionalArray = new int[10][10];
//

        System.out.println();
    }

    private static int countSomething(Function<String, Integer> func, String s) {
        return func.apply(s);
    }

    private static void printRandomNums(Supplier<Integer> supplier) {
        for (int i = 0; i < 100; i++) {
            System.out.println("Random number: " + supplier.get());
        }
    }
}
