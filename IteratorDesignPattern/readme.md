Iterator: This is an interface that defines the methods for accessing elements in the collection, such as next(), hasNext(), etc.

Concrete Iterator: This is a class that implements the Iterator interface and maintains the current position while iterating through the collection.

Aggregate: This is an interface that defines the methods for creating an iterator object. It typically includes a method like createIterator().

Concrete Aggregate: This is a class that implements the Aggregate interface. It creates and returns an instance of the appropriate Concrete Iterator