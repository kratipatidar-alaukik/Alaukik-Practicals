# Day 19 — Optional, Date/Time & Modern Java

# Theory

## 1. Optional
Optional is a container object that may or may not contain a value.

It helps handle null values safely and reduces the chance of NullPointerException.
Creating Optional
Optional<String> name = Optional.of("Krati");
For a value that may be null:
Optional<String> name = Optional.ofNullable(value);
Common Methods
- of() → Creates Optional with a non-null value.
- ofNullable() → Allows a null value.
- isPresent() → Checks whether a value exists.
- get() → Gets the value.
- orElse() → Returns a default value if empty.
- orElseGet() → Provides a default value if empty.
- orElseThrow() → Throws an exception if empty.
Example
Optional<String> name = Optional.ofNullable(null);

String result = name.orElse("Unknown");

System.out.println(result);
Output:
Unknown

## 2. LocalDate
LocalDate represents a date without time.
Example
import java.time.LocalDate;

LocalDate date = LocalDate.now();

System.out.println(date);
Example output:
2026-10-21
Creating a Specific Date
LocalDate date = LocalDate.of(2026, 10, 21);
Common Methods
date.getYear();
date.getMonth();
date.getDayOfMonth();
date.plusDays(5);
date.minusMonths(2);

## 3. LocalTime
LocalTime represents time without a date.
Example
import java.time.LocalTime;

LocalTime time = LocalTime.now();

System.out.println(time);
Creating a Specific Time
LocalTime time = LocalTime.of(10, 30);
Common Methods
time.getHour();
time.getMinute();
time.getSecond();
time.plusHours(2);
time.minusMinutes(10);

## 4. LocalDateTime
LocalDateTime represents both date and time.
Example
import java.time.LocalDateTime;

LocalDateTime dateTime = LocalDateTime.now();

System.out.println(dateTime);
Example output:
2026-10-21T20:30:15
Creating a Specific Date and Time
LocalDateTime dateTime =
        LocalDateTime.of(2026, 10, 21, 10, 30);
Common Methods
dateTime.getYear();
dateTime.getHour();
dateTime.plusDays(2);
dateTime.minusHours(3);

## 5. Date Formatting
DateTimeFormatter is used to format dates and times into a specific pattern.
Example
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

LocalDate date = LocalDate.now();

DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("dd-MM-yyyy");

String result = date.format(formatter);

System.out.println(result);
Output:
21-10-2026
Common Formatting Patterns
dd      → Day
MM      → Month
yyyy    → Year
HH      → Hour
mm      → Minute
ss      → Second
Date + Time Formatting
DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

String result = LocalDateTime.now().format(formatter);

System.out.println(result);

## 6. Java Time API
The Java Time API was introduced in Java 8.

It provides modern classes for handling dates and times.
Important Classes
java.time
   |
   |-- LocalDate
   |-- LocalTime
   |-- LocalDateTime
   |-- ZonedDateTime
   |-- Instant
   |-- Period
   `-- Duration
Advantages
- Easy to use
- Immutable
- Thread-safe
- Better date/time calculations
- Easy formatting
- Better than older Date and Calendar APIs
Difference Between Date/Time Classes
LocalDate       → Date only
LocalTime       → Time only
LocalDateTime   → Date + Time
ZonedDateTime   → Date + Time + Time Zone
Instant         → A point in time
Easy Way to Remember
LocalDate       → 21-10-2026
LocalTime       → 20:30:15
LocalDateTime   → 21-10-2026 20:30:15

# Practical
Build:
Employee Attendance System
Features:
• Check-in
• Check-out
• Working hours
• Attendance report