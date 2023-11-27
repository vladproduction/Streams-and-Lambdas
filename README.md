# Streams-Lambdas
Concise, functional-style code for processing collections of data
______________________________________________________________________
What is streams in Java?

In Java, a stream is a sequence of elements that can be processed in a functional programming style. 
It allows you to perform operations on the elements of a collection, such as filtering, mapping, sorting, and reducing, 
in a declarative and concise manner.

Java 8 introduced the Stream API as part of the java.util.stream package. 
This API provides a new way to work with collections and arrays, enabling you to write more expressive and efficient code. 
Streams can be used with a variety of data sources, including collections, arrays, I/O channels, and even infinite sequences.

The Stream API provides two types of operations:

	1-intermediate:
Intermediate operations allow you to transform or filter the elements of a stream and return a new stream. 
Some commonly used intermediate operations include filter, map, sorted, and distinct.

	2-terminal operations: 
Terminal operations, on the other hand, produce a result or a side-effect. They trigger the processing of the elements and the 
termination of the stream. Examples of terminal operations include forEach, collect, reduce, and count.

We should be familiar with some concept before going to further in stream concept and remember one thing streams 
don’t actually store elements;  they are computed on demand.

	Advantages of Stream API:
*Stream conveys elements from a source, such as a data structure, an array, a generator function, or an I/O channel, through a 
pipeline of computational operations.
*It’s functional in nature, and an operation on a stream produces a result but doesn’t modify its source. For example, when we are 
filtering a stream obtained from a collection, it has a new Stream without the filtered elements.
*Consumable: Elements of a stream are visited once during the life of a stream. Like an Iterator, a new stream should be created 
to revisit the same source elements.






