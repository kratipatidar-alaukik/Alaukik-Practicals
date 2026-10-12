# Day 12 — Exception Handling

# Theory

## 1. Exception
- An exception is an event that interrupts the normal flow of a program.
- Example: dividing a number by zero.

## 2. Error
- An error represents a serious problem, usually related to the JVM or system resources.
- Example: `OutOfMemoryError`, `StackOverflowError`.

## 3. Checked Exception
- Checked at compile time by the compiler.
- Must be handled using `try-catch` or declared using `throws`.
- Examples: `IOException`, `SQLException`.

## 4. Unchecked Exception
- Occurs at runtime and is not checked at compile time.
- Handling it is not compulsory.
- Examples: `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException`.

## 5. try
- Contains code that might throw an exception.
- Must be followed by `catch` or `finally`, or both.

## 6. catch
- Handles an exception thrown from the associated `try` block.
- Multiple `catch` blocks can handle different exception types.

## 7. finally
- Usually executes whether an exception occurs or not.
- Commonly used for cleanup operations, such as closing resources.
- May not execute if the JVM terminates abruptly.

## 8. throw
- Explicitly throws an exception.
- Used to throw an exception object.

```java
throw new ArithmeticException("Invalid operation");
```

## 9. throws
- Declares exceptions that a method may pass to its caller.
- Written in the method declaration.

```java
void readFile() throws IOException {
    // File operations
}
```

## 10. Custom Exceptions
- User-defined exceptions created for application-specific situations.
- Extend `Exception` for a checked exception or `RuntimeException` for an unchecked exception.

```java
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

# Practical:
Build:
Banking Exception System
Custom exceptions:
InsufficientBalanceException
InvalidAmountException
AccountNotFoundException