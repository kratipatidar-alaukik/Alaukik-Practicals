# DAy11

# Theory

## 1. String
- A sequence of characters used to store text.
- String is an immutable class in Java.
- Example: `String s = "Java";`

## 2. String Pool
- A special area in heap memory that stores and reuses string literals.
- Identical string literals generally refer to the same object.
- Saves memory by reusing strings.

```java
String a = "Java";
String b = "Java";
System.out.println(a == b); // true
```

## 3. Immutability
- String content cannot be changed after creation.
- Modification operations return a result without changing the original string.

```java
String s = "Hello";
s = s.concat(" Java");
```

## 4. StringBuilder
- Mutable class used for frequent string modifications.
- Generally faster for repeated modifications in a single thread.
- Not synchronized and not thread-safe.
- Methods: `append()`, `insert()`, `delete()`, `replace()`, `reverse()`.

## 5. StringBuffer
- Mutable class similar to StringBuilder.
- Its methods are synchronized, making individual method calls thread-safe.
- Useful when shared mutable text needs synchronization.
- Can be slower than StringBuilder due to synchronization.

## 6. Common String Methods
- `length()` – Returns the number of characters.
- `charAt()` – Returns a character at an index.
- `substring()` – Extracts part of a string.
- `equals()` – Compares string content.
- `equalsIgnoreCase()` – Compares without case sensitivity.
- `contains()` – Checks whether text exists.
- `replace()` – Replaces characters or text.
- `split()` – Splits a string into an array.
- `trim()` – Removes basic whitespace from both ends.
- `strip()` – Removes recognized Unicode whitespace (Java 11+).
- `toUpperCase()` / `toLowerCase()` – Changes letter case.
- `isEmpty()` – Checks whether length is zero.
- `isBlank()` – Checks whether text is empty or whitespace-only (Java 11+).


**Remember:** `==` compares references, while `equals()` compares String content.

# Practical
Create:
Text Processing Utility

# Features:
• Reverse
• Count characters
• Count words
• Palindrome
• Remove duplicate characters