# Day 18 — Stream API

# Theory

# 1. Stream

A Stream is used to process data from a collection in a simple and functional way.

A Stream:

Does not store data.

Does not modify the original collection.

Processes elements one by one.

Supports operations like filtering, sorting, mapping, and collecting.

Basic Syntax

employees.stream()

Example:

employees.stream()
         .forEach(System.out::println);

# 2. filter()

filter() is used to select elements based on a condition.

Example

employees.stream()
         .filter(e -> e.getSalary() > 50000)
         .forEach(System.out::println);

This displays employees whose salary is greater than 50000.

Syntax

filter(condition)

# 4. sorted()

sorted() is used to sort elements.

Example

employees.stream()
         .sorted()
         .forEach(System.out::println);

For sorting employees by salary:

employees.stream()
         .sorted(Comparator.comparing(Employee::getSalary))
         .forEach(System.out::println);

For descending order:

employees.stream()
         .sorted(Comparator.comparing(Employee::getSalary).reversed())
         .forEach(System.out::println);

# 6. reduce()

reduce() is used to combine multiple elements into one final result.

For example, finding the total salary:

double totalSalary = employees.stream()
        .map(Employee::getSalary)
        .reduce(0.0, Double::sum);

Example:

10000 + 20000 + 30000
             ↓
           60000

Other uses:

Total salary

Product of numbers

Finding a combined result

# 7. forEach()

forEach() is used to perform an action on every element.

Example

employees.stream()
         .forEach(e -> System.out.println(e.getName()));

It can also be written using method reference:

employees.stream()
         .forEach(System.out::println);

# 8. distinct()

distinct() removes duplicate elements from a Stream.

Example

List<Integer> numbers = Arrays.asList(10, 20, 20, 30, 30);

numbers.stream()
       .distinct()
       .forEach(System.out::println);

Output

10
20
30

# 9. limit()

limit() is used to restrict the number of elements processed.

Example

employees.stream()
         .limit(3)
         .forEach(System.out::println);

Only the first 3 employees will be processed.

🔄 Stream Operation Flow

A Stream can combine multiple operations:

employees.stream()
         .filter(e -> e.getSalary() > 50000)
         .map(Employee::getName)
         .sorted()
         .collect(Collectors.toList());

Flow

Employee List
     ↓
  stream()
     ↓
  filter()
     ↓
   map()
     ↓
 sorted()
     ↓
 collect()
     ↓
   List

# Practical
Build:
Employee Analytics System