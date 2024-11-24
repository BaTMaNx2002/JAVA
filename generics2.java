Tutorials
Questions
Product Docs

Search Community
Tutorial
Java Generics Example Tutorial - Generic Method, Class, Interface
Published on August 4, 2022
Java
author
Pankaj

Java Generics Example Tutorial - Generic Method, Class, Interface
Java Genrics is one of the most important features introduced in Java 5. If you have been working on Java Collections and with version 5 or higher, I am sure that you have used it. Generics in Java with collection classes is very easy but it provides a lot more features than just creating the type of collection. We will try to learn the features of generics in this article. Understanding generics can become confusing sometimes if we go with jargon words, so I would try to keep it simple and easy to understand.

We will look into below topics of generics in java.

Generics in Java

Java Generic Class

Java Generic Interface

Java Generic Type

Java Generic Method

Java Generics Bounded Type Parameters

Java Generics and Inheritance

Java Generic Classes and Subtyping

Java Generics Wildcards

Java Generics Upper Bounded Wildcard

Java Generics Unbounded Wildcard

Java Generics Lower bounded Wildcard

Subtyping using Generics Wildcard

Java Generics Type Erasure

Generics FAQs

1. Generics in Java
Generics was added in Java 5 to provide compile-time type checking and removing risk of ClassCastException that was common while working with collection classes. The whole collection framework was re-written to use generics for type-safety. Let’s see how generics help us using collection classes safely.

List list = new ArrayList();
list.add("abc");
list.add(new Integer(5)); //OK

for(Object obj : list){
	//type casting leading to ClassCastException at runtime
    String str=(String) obj; 
}
Above code compiles fine but throws ClassCastException at runtime because we are trying to cast Object in the list to String whereas one of the element is of type Integer. After Java 5, we use collection classes like below.

List<String> list1 = new ArrayList<String>(); // java 7 ? List<String> list1 = new ArrayList<>(); 
list1.add("abc");
//list1.add(new Integer(5)); //compiler error

for(String str : list1){
     //no type casting needed, avoids ClassCastException
}
Notice that at the time of list creation, we have specified that the type of elements in the list will be String. So if we try to add any other type of object in the list, the program will throw compile-time error. Also notice that in for loop, we don’t need typecasting of the element in the list, hence removing the ClassCastException at runtime.

2. Java Generic Class
We can define our own classes with generics type. A generic type is a class or interface that is parameterized over types. We use angle brackets (<>) to specify the type parameter. To understand the benefit, let’s say we have a simple class as:

package com.journaldev.generics;

public class GenericsTypeOld {

	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

        public static void main(String args[]){
		GenericsTypeOld type = new GenericsTypeOld();
		type.set("Pankaj"); 
		String str = (String) type.get(); //type casting, error prone and can cause ClassCastException
	}
}