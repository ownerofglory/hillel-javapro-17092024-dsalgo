# Test Examples

## Students
```java
Student student1 = new Student("Alice", "Johnson", LocalDateTime.of(2000, 5, 15, 0, 0), 3.8);
Student student2 = new Student("Bob", "Smith", LocalDateTime.of(2001, 8, 20, 0, 0), 3.6);
Student student3 = new Student("Charlie", "Brown", LocalDateTime.of(2002, 12, 10, 0, 0), 3.9);
Student student4 = new Student("Diana", "Williams", LocalDateTime.of(1999, 2, 28, 0, 0), 3.7);
Student student5 = new Student("Evan", "Davis", LocalDateTime.of(2003, 11, 5, 0, 0), 4.0);

```

## Employee
```java
Employee employee1 = new Employee("John", "Doe", LocalDateTime.of(1985, 3, 22, 0, 0), "Software Engineer");
Employee employee2 = new Employee("Emma", "Taylor", LocalDateTime.of(1990, 7, 15, 0, 0), "Project Manager");
Employee employee3 = new Employee("Michael", "Brown", LocalDateTime.of(1978, 11, 30, 0, 0), "Product Designer");
Employee employee4 = new Employee("Sophia", "Williams", LocalDateTime.of(1988, 5, 10, 0, 0), "Data Analyst");
Employee employee5 = new Employee("James", "Wilson", LocalDateTime.of(1995, 9, 18, 0, 0), "Marketing Specialist");

```

## Books
```java
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

```