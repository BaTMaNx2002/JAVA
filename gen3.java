public class Box<T> {  
   private T object;  
  
   public void setObject(T object) {  
      this.object = object;  
   }  
  
   public T getObject() {  
      return this.object;  
   }  
}  
ADVERTISEMENT
In this illustration, the type T, which can be any data type, is used to parameterize the Box class. An object of type T may be set and retrieved from the Box using the two methods getObject and setObject provided by the class.

ADVERTISEMENT
We only need to make an instance of the Box class and specify the desired data type in order to use it:

Box<Integer> intBox = new Box<Integer>();  
intBox.setObject(10);  
int value = intBox.getObject();  
System.out.println(value);  
An instance of the Box class using the Integer data type has been constructed in this example. By utilising the getObject method, we were able to retrieve the Box's value, which was set to 10. Finally, the value has been printed to the console.

Example 1: A Generic Class for Adding Two Numbers
In this example, we will create a generic class called AddNumbers that can add two numbers of any data type. We will then create instances of the class and use them to add two integers and two doubles.

AddNumbers.java

public class AddNumbers<T extends Number> {  
    private T num1;  
    private T num2;  
  
    public AddNumbers(T num1, T num2) {  
        this.num1 = num1;  
        this.num2 = num2;  
    }  
  
    public T add() {  
        if (num1 instanceof Integer) {  
            return (T) (Integer) (num1.intValue() + num2.intValue());  
        } else if (num1 instanceof Double) {  
            return (T) (Double) (num1.doubleValue() + num2.doubleValue());  
        } else {  
            return null;  
        }  
    }  
  
    public static void main(String[] args) {  
        AddNumbers<Integer> intAdder = new AddNumbers<>(2, 3);  
        Integer intResult = intAdder.add();  
        System.out.println("Integer Result: " + intResult);  
  
        AddNumbers<Double> doubleAdder = new AddNumbers<>(2.5, 3.5);  
        Double doubleResult = doubleAdder.add();  
        System.out.println("Double Result: " + doubleResult);  
    }  
}  
Output:

Integer Result: 5
Double Result: 6.0
In this example, we have created a generic class called AddNumbers that takes two parameters of any data type that extends the Number class. The add() method checks the type of the parameters and returns their sum. In the main method, we have created instances of the class with integer and double parameters, and we have printed the results of the addition.

Example 2: A Generic Method for Finding the Maximum Value
In this example, we will create a generic method called findMax that can find the maximum value in an array of any data type that implements the Comparable interface. We will then create an array of integers and an array of strings, and use the method to find the maximum value in each array.

FindMax.java

import java.util.Arrays;  
  
public class FindMax {  
    public static <T extends Comparable<T>> T findMax(T[] arr) {  
        Arrays.sort(arr);  
        return arr[arr.length - 1];  
    }  
  
    public static void main(String[] args) {  
        Integer[] intArr = {1, 5, 3, 2, 4};  
        String[] strArr = {"cat", "dog", "elephant", "bird"};  
  
        Integer maxInt = findMax(intArr);  
        System.out.println("Max Integer: " + maxInt);  
  
        String maxStr = findMax(strArr);  
        System.out.println("Max String: " + maxStr);  
    }  
}  
Output:

Max Integer: 5
Max String: elephant
In this example, we have created a generic method called findMax that takes an array of any data type that implements the Comparable interface. The method sorts the array and returns the maximum value. In the main method, we have created an array of integers and an array of strings, and we have used the findMax method to find the maximum value in each array.

Example 3: A Generic Method for Printing Arrays
In this example, we will create a generic method called printArray that can print any type of array. We will then create an array of integers and an array of strings, and use the method to print each array.

PrintArray.java

public class PrintArray {  
    public static <T> void printArray(T[] arr) {  
        for (T elem : arr) {  
            System.out.print(elem + " ");  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
        Integer[] intArr = {1, 2, 3, 4, 5};  
        String[] strArr = {"cat", "dog", "elephant", "bird"};  
  
        System.out.print("Integer Array: ");  
        printArray(intArr);  
  
        System.out.print("String Array: ");  
        printArray(strArr);  
    }  
}  
Output:

Integer Array: 1 2 3 4 5
String Array: cat dog elephant bird
In this example, we have created a generic method called printArray that takes an array of any type and prints each element in the array. In the main method, we have created an array of integers and an array of strings, and we have used the printArray method to print each array.

Example 4: A Generic Class for a Pair of Objects
In this example, we will create a generic class called Pair that represents a pair of objects. We will then create instances of the class with different data types, and use them to print the values of the objects in each pair.

Pair.java

public class Pair<T, U> {  
    private T first;  
    private U second;  
  
    public Pair(T first, U second) {  
        this.first = first;  
        this.second = second;  
    }  
  
    public T getFirst() {  
        return first;  
    }  
  
    public U getSecond() {  
        return second;  
    }  
  
    public static void main(String[] args) {  
        Pair<Integer, String> intStrPair = new Pair<>(10, "hello");  
        System.out.println("First Value: " + intStrPair.getFirst());  
        System.out.println("Second Value: " + intStrPair.getSecond());  
  
        Pair<Double, Character> doubleCharPair = new Pair<>(3.14, 'a');  
        System.out.println("First Value: " + doubleCharPair.getFirst());  
        System.out.println("Second Value: " + doubleCharPair.getSecond());  
    }  
}  
Output:

First Value: 10
Second Value: hello
First Value: 3.14
Second Value: a
In this example, we have created a generic class called Pair that takes two parameters of any type. The class has methods to get the values of the first and second objects in the pair. In the main method, we have created instances of the class with integer and string, and double and character data types, and we have printed the values of the objects in each pair.

Example 5: A Generic Interface for Sorting Objects
In this example, we will create a generic interface called Sortable that represents a sortable object. We will then create a class called Person that implements the Sortable interface, and use it to sort an array of person objects based on their age.

Person.java

import java.util.Arrays;  
  
public interface Sortable<T> {  
    public int compare(T obj);  
}  
  
class Person implements Sortable<Person> {  
    private String name;  
    private int age;  
  
    public Person(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  
  
    public int compare(Person other) {  
        return this.age - other.age;  
    }  
  
    public String toString() {  
        return "Name: " + name + ", Age: " + age;  
    }  
  
    public static void main(String[] args) {  
        Person[] people = { new Person("John", 20),   
                            new Person("Mary", 25),  
                            new Person("David", 18),  
                            new Person("Sarah", 22) };  
          
        System.out.println("Before Sorting: " + Arrays.toString(people));  
          
        Arrays.sort(people, (p1, p2) -> p1.compare(p2));  
          
        System.out.println("After Sorting: " + Arrays.toString(people));  
    }  
}  
Output:

Before Sorting: [Name: John, Age: 20, Name: Mary, Age: 25, Name: David, Age: 18, Name: Sarah, Age: 22]
After Sorting: [Name: David, Age: 18, Name: John, Age: 20, Name: Sarah, Age: 22, Name: Mary, Age: 25]
In this example, we have created a generic interface called Sortable that has a single method called compare. We have then created a class called Person that implements the Sortable interface, and defines the compare method to compare two person objects based on their age.

In the main() method, we have created an array of person objects, and printed the array before sorting. We then use the Arrays.sort() method to sort the array using a lambda expression that calls the compare method on each pair of person objects. Finally, we print the sorted array.

In the above example, we have demonstrated how generic programming can be used to sort objects of a custom class based on a specific field, in this case, the age field of the Person class.

Conclusion
Developers can construct code that is not unique to any one data type using the potent method of generic programming. It enhances the readability, maintainability, and reusability of code. Generics in Java offer a mechanism to perform generic programming by allowing classes and functions to take one or more data types as parameters. Generics allow programmers to produce more adaptable, reusable code that is simpler to maintain and less prone to errors.

Next TopicHow Can I Give the Default Date in The Array Java


← prevnext →


Latest Courses






