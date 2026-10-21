# Day 16 — Generics
    Theory

1. Generic Classes

A generic class can work with different data types using a type parameter.

class Box<T> {
    T value;
}

T represents the data type.

Example:

Box<String>
Box<Integer>

2. Generic Methods

A generic method can work with different data types.

static <T> void display(T value) {
    System.out.println(value);
}

The same method can accept String, Integer, etc.

3. Type Safety

Generics prevent storing incorrect types.

ArrayList<String> names = new ArrayList<>();

names.add("Krati");
// names.add(100);   // Error

Only String values are allowed.

4. Wildcards

? represents an unknown type.

List<?> list;

It can refer to:

List<String>
List<Integer>
List<Double>

5. Bounded Types

Bounded types restrict the types that can be used.

class Box<T extends Number> {
    T value;
}

Here T can be:

Integer
Double
Float

But not String.

# Practical
Create:
Repository