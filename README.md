# IntList Project

This project implements a dynamic integer list using an `IntList` interface with two implementations: `IntArrayList` and `IntVector`.

- **IntList Interface**
   - `add(int number)`: Adds a number to the list.
   - `get(int id)`: Retrieves a number by its index.

- **IntArrayList**
   - Starts with an array of size 10.
   - If full, grows by 50%.
   - More memory-efficient for small or slowly growing lists.

- **IntVector**
   - Starts with an array of size 20.
   - If full, doubles its size.
   - Faster for large or quickly growing lists but uses more memory.

- **Example Usage**
```java
IntList list1 = new IntArrayList();
IntList list2 = new IntVector();

list1.add(5);
list2.add(10);

System.out.println(list1.get(0)); // 5
System.out.println(list2.get(0)); // 10