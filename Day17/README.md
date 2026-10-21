# Day 17 — Functional Programming

# Theory
1. Functional Interfaces

An interface with only one abstract method is called a functional interface.

@FunctionalInterface
interface Greeting {
    void sayHello();
}

Examples: Predicate, Consumer, Supplier, Function.

2. Lambda Expressions

A lambda is a short way to provide the implementation of a functional interface.

Greeting g = () -> System.out.println("Hello");

Syntax:

(parameters) -> expression

3. Predicate

Used to check a condition.

Takes: 1 value

Returns: true or false

Method: test()

Predicate<Integer> p = n -> n > 10;

System.out.println(p.test(15));

4. Consumer

Used to perform an action on a value.

Takes: 1 value

Returns: nothing

Method: accept()

Consumer<String> c = name -> System.out.println(name);

c.accept("Krati");

5. Supplier

Used to provide or generate a value.

Takes: no value

Returns: 1 value

Method: get()

Supplier<String> s = () -> "Hello";

System.out.println(s.get());

6. Function

Used to convert or process a value.

Takes: 1 value

Returns: 1 value

Method: apply()

Function<Integer, Integer> f = n -> n * 2;

System.out.println(f.apply(5));


# Practical
Use Lambda expressions to:
• Filter employees
• Sort employees
• Calculate salary
• Search employees