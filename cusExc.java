//simple custom exception in java
class SimpleCustomException extends Exception {
    //member variable to store our custom message
    String msg;
    SimpleCustomException(String msg) {
        //passing the parameter to the super class constructor
        super(msg);
        this.msg=msg;
    }
    
    //overriding with our custom message
    @Override
    public String toString() {
        return msg;
    }
}

public class Main {
	public static void main(String[] args) {
	    try {
	        throw new SimpleCustomException("User-defined exception demonstration");
	    }
	    catch(SimpleCustomException ex) {
	        //calls override toString() method
	        System.out.println(ex);
	        //prints message passed to the super constructor
	        System.out.println(ex.getMessage());
	    }
	}
}

Note that the throw keyword has to be inside a try block, and the corresponding exception is caught in a catch block.

Call to the super constructor has to be the first statement inside a constructor.

2.User-Defined Exception for Validating Login Credentials
Consider a use case where we want to validate the login credentials entered by the user and throw an exception with a specific error message or a specific status code to make the user better understand the exception. We can define a custom exception for this case. Let's have a look over it.

//user-defined exception in java
import java.util.*;

//custom exception to validate login credentials
class InvalidCredentialsException extends Exception {
    //member variable to store our custom message
    String msg;
    InvalidCredentialsException(String msg) {
        //passing the parameter to the super class constructor
        super(msg);
        this.msg=msg;
    }
    
    //overriding with our custom message
    @Override
    public String toString() {
        return msg;
    }
}

public class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String id = sc.next();
	    String password = sc.next();
	    try {
	        if(id!="user1" || password!="1234"){
	            throw new InvalidCredentialsException("no such user with username - "+id);
	        }
	    }
	    catch(InvalidCredentialsException ex) {
	        //calls override toString() method
	        System.out.println(ex);
	        //prints message passed to the super constructor
	        System.out.println(ex.getMessage());
	    }
	}
}


In the above Java program, we've defined a custom exception, InvalidCredentialsException and added our specific error message. In the main method, we've updated the id and password variables with user input. We've put a conditional check to validate the credentials inside a try block, which throws an InvalidCredentialsException if the credentials are not valid. Then we've written a catch block to print our custom exception message.

3.User-Defined Exception for Value Less than Threshold Value
Consider a use case where a value has to be entered by a user or returned by another process, and the value has to be greater than a threshold value; else, we've raised an exception. This exception matches the example case where a user is trying to withdraw some amount, and the amount cannot be negative or zero. Let's have a look over the custom exception for this case in Java.

//user-defined exception in java
import java.util.*;

//custom exception to validate withdrawal amount matches the minimum withdrawal limit
class AmountLessThanRequiredException extends Exception {
    //member variable to store our custom message
    String msg;
    AmountLessThanRequiredException(String msg) {
        //passing the parameter to the super class constructor
        super(msg);
        this.msg=msg;
    }
    
    //overriding with our custom message
    @Override
    public String toString() {
        return msg;
    }
}

public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int withdrawAmount = sc.nextInt();
	    try {
	        if(withdrawAmount<=0) { //checking if the amount is greater than zero or not
	            throw new AmountLessThanRequiredException("Entered amount less than minimum withdrawal limit");
	        }
	    }
	    catch(AmountLessThanRequiredException ex) {
	        //calls override toString() method
	        System.out.println(ex);
	        //prints message passed to the super constructor
	        System.out.println(ex.getMessage());
	    }
	}
}


In the above java program, we've defined a custom exception, AmountLessThanRequiredException, and added our specific error message. In the main method, we've updated the withdrawAmount variable with user input. We've put a condition to check if the given withdrawal amount is less than or equal to zero inside a try block, which throws an AmountLessThanRequiredException if credentials are not valid. Then we've written a catch block to print our custom exception message.

4. User-defined Exception for Validity of an Entity
Consider a use case where a user is trying to access or log in with expired entity details, for example, a user trying to log in to an application where the provided credentials are no more active. In such a case, a user-defined exception with a custom message helps the user better understand the exception.

Here's the code to do that in Java.

//user-defined exception in java
import java.util.*;

//custom exception to check if the given id is active or not
class IdDoesnotExistException extends Exception {
    //member variable to store our custom message
    String msg;
    IdDoesnotExistException(String msg) {
        //passing the parameter to the super class constructor
        super(msg);
        this.msg=msg;
    }
    
    //overriding with our custom message
    @Override
    public String toString() {
        return msg;
    }
}

public class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int id = sc.nextInt();
	    HashSet<Integer> IdList = getIdList(); //returns HashSet with all IDs
	    try {
	        if(!IdList.contains(id)) { //checking if current id is active or not
	            throw new IdDoesnotExistException("Entered id is invalid or no more active");
	        }
	    }
	    catch(IdDoesnotExistException ex) {
	        //calls override toString() method
	        System.out.println(ex);
	        //prints message passed to the super constructor
	        System.out.println(ex.getMessage());
	    }
	}
}


In the above java program, we've defined a custom exception, IdDoesnotExistException, and added our specific error message. In the main method, we've updated the id variable with user input. Let's imagine that there's a function named getIdList() which returns a set of all active IDs. We've put an if condition to check if the given id is active inside a try block, which throws an IdDoesnotExistException if the id is not active or invalid. Then we've written a catch block to print our custom exception message.

5.User-defined Exception for Validating the Age of a User
Consider a use case where the user has to input an integer, and the value must be greater than or fit in a range, else we've to raise an exception. This exception matches the example case where the user tries to register for voter ID, which has an age restriction of 18. Let's create a custom exception for this case with a custom message describing the exception.

Let's have a look over the code!

//user-defined exception in java
import java.util.*;

//custom exception to validate age with defined age limit
class AgeDoesNotFitException extends Exception {
    //member variable to store our custom message
    String msg;
    AgeDoesNotFitException(String msg) {
        //passing the parameter to the super class constructor
        super(msg);
        this.msg=msg;
    }
    
    //overriding with our custom message
    @Override
    public String toString() {
        return msg;
    }
}

public class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int age = sc.nextInt();
	    try {
	        if(age<18) { //checking if the age is above the limit or not
	            throw new AgeDoesNotFitException("Entered age doesn't fulfill the required age limit");
	        }
	    }
	    catch(AgeDoesNotFitException ex) {
	        //calls override toString() method
	        System.out.println(ex);
	        //prints message passed to the super constructor
	        System.out.println(ex.getMessage());
	    }
	}
}


In the above java program, we've defined a custom exception, AgeDoesNotFitException, and added our specific error message. In the main() method, we've updated the age variable with user input. We've put a conditional check to compare the given age with the required age limit inside a try block, which throws an AgeDoesNotFitException if credentials are not valid. Then we've written a catch block to print our custom exception message.

Learn More
Now that we’ve explored the definition of user-defined examples and walked through a few examples and use cases, you might have built up some interest in the concept of exception handling in Java (of course, it is an interesting topic). Fasten your enthusiasm by reading this interesting blog on exception handling over here.

Explore Scaler Topics Java Tutorial and enhance your Java skills with Reading Tracks and Challenges.

Conclusion
Let's recall

An exception breaks the normal execution flow.
User-defined exceptions provide the flexibility to customize the exception as per our use case.
A custom exception class must extend the Exception class from the java.lang package.
Error message of a custom exception can be configured by passing a message to the super class constructor or by overriding the toString() method.
To use our custom exception, we've to create a new object of the custom exception class and throw it using the throw keyword.
Challenge Time!
quiz
Time to test your skills and win rewards!
Start Challenge!
Note: Rewards will be credited after the next product update.
Scroll to top!
Java
How would you rate this article?
Very BadBadAverageGoodLoved It!
Updated - 27 Mar 2024
7 mins read
Published : 22 Aug 2022
Written By
S
Sai Srikanth Murki
Backend Engineer @NCR Corporation
Reviewed By
Vanshita Tiwari
Free Courses by top Scaler instructors
View All
Python Course for Beginners With Certification: Mastering the Essentials
Python Course for Beginners With Certification: Mastering the Essentials
A Course by Rahul Janghu
4.90
169450
Java Course - Mastering the Fundamentals
Java Course - Mastering the Fundamentals
A Course by Tarun Luthra
5
140853
JavaScript Course With Certification: Unlocking the Power of JavaScript
JavaScript Course With Certification: Unlocking the Power of JavaScript
A Course by Mrinal Bhattacharya
4.8
77095
DBMS Course - Master the Fundamentals and Advanced Concepts
DBMS Course - Master the Fundamentals and Advanced Concepts
A Course by Srikanth Varma
5
73472
C++ Course: Learn the Essentials
C++ Course: Learn the Essentials
A Course by Prateek Narang
5
66399
Python and SQL for Data Science
Python and SQL for Data Science
A Course by Srikanth Varma
5
61061
Similar Reads
topics
Got suggestions? We would love to hear your feedback.
topics logo
A Free learning platform
made with  heart icon  by  
scaler logo
Instagram
Youtube
Twitter
Facebook
Linkedin
Discord
Explore Scaler
Academy
Data Science & ML
Neovarsity
Explore Topics
Free Online Courses
Challenges
Contest
Topics
Articles
Events
Resources
About Us
Blog
Careers
Review
Download the  
scaler logo
app!
Get all scaler resources under one roof!
Playstore Icon
Popular Free Certification Courses
Java Course for Beginners
C++ Course with Certificate
Python Course for Beginners
Javascript Free Course for Beginners
Data Science Course for Beginners
DBMS Course
Python and SQL for Data Science Course
DSA Problem Solving for Interviews
Instagram System Design Course
Dynamic Programming Course
All Free Online Courses
Popular Tutorials
Python Tutorial
Java Tutorial
DBMS Tutorial
Javascript Tutorial
C++ Tutorial
SQL Tutorial
Software Engineering Tutorial
Data Science Tutorial
Pandas Tutorial
Deep Learning Tutorial
All Tutorials
Compilers
Python Compiler
Java Compiler
Javascript Compiler
C Compiler
C++ Compiler
Tools
Json Validator
SQL Formatter
XML Formatter
CSS Formatter
JavaScript Formatter
Copyright 2024 InterviewBit Technologies Pvt. Ltd. All Rights Reserved.
Privacy Policy
Terms of Use
Contact Us
