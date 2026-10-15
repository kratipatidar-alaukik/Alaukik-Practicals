# Day 15 — Collections Framework II

1. Set

Stores unique elements; duplicate values are not allowed.

Common implementations: HashSet, LinkedHashSet, TreeSet.

2. HashSet

Stores unique elements.

Does not maintain insertion order.

Allows one null value.

Example use: Removing duplicate values.

3. LinkedHashSet

Stores unique elements.

Maintains insertion order.

Allows one null value.

Example use: Storing unique names in the order they were added.

4. TreeSet

Stores unique elements in sorted order.

Does not allow null elements.

Example use: Storing unique numbers in ascending order.

5. Map

Stores data in key-value pairs.

Keys must be unique, but values can be duplicated.

Common implementations: HashMap, LinkedHashMap, TreeMap.

6. HashMap

Stores key-value pairs.

Does not maintain insertion order.

Allows one null key and multiple null values.

Example use: Storing employee IDs and names.

7. LinkedHashMap

Stores key-value pairs.

Maintains insertion order of entries.

Allows one null key and multiple null values.

Example use: Maintaining contacts in insertion order.

8. TreeMap

Stores key-value pairs sorted by keys.

Does not allow null keys, but allows null values.

Example use: Displaying employee records in sorted ID order.



# Practical
Build:
Contact Management System
Features:
• Add contact
• Search contact
• Delete contact
• Duplicate prevention