import java.util.Scanner;
/**
You'll be designing and implementing a class called Dog.

For our purposes, an Dog will be assumed to have a name, breed, color, and weight. While there are certainly many more characteristics of a Dog, we'll only concern ourselves with these.

Our Dogs are playful creatures who want to run around and have fun. They can bark and run, and that's it.

When designing your Dog class, each characteristic of Dog should be stored as a class-level variable. Every Dog will get a unique copy of these traits, which means changes to the value of a particular variable in Dog A should not impact Dog B.

Please review the in-depth requirements below, design and implement your class, and upload the .java file to this question.

Instance variables with logically chosen data types for each of the following characteristics.
- Name
- Breed
- Color
- Weight
- A default constructor that accepts no arguments, but provides default values for each of the aforementioned instance variables.
- A constructor that accepts starting values for each of the aforementioned instance variables.
- Getter and setter methods for each of the instance variables.
- A method called bark that accepts no arguments, and prints a barking message to the console. Larger breeds (for our purposes, these will be limited to German Shepherd, Golden Retriever, and Rottweiler) should bark three times per call to this method. Smaller dog breeds (for our purposes, these will be limited to French Bulldog, Beagle, and Yorkshire Terrier) should bark only once per call to this method. All other breeds should bark twice per call to this method.
- A method called run that accepts two arguments (i.e., a distance, in steps, and direction in which to move) and prints a reasonable message that reports the distance and direction traveled.
- A toString method that overrides the default implementation by returning the following:

`
"{ Name: name, Breed: breed, Color: color, Weight: weight }"
`
*/
