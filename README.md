# design-patterns
Object Oriented Design Patterns in Java


## Strategy Pattern

There are some behaviours that are common to all subclasses of a parent class.
But some behaviours do not apply to all subclasses.
If such behaviours are part of the parent class, then subclasses that need that behaviour can inherit it.
But what about subclasses that don't need those behaviours? They can override the default behaviour to do nothing, but it is still not an optimum design.

Let's say such behaviours are pulled into an interface and the subclasses that need those behaviours can implement the interface.
There is no optimum code reuse this way. (Even though java now supports default methods in interfaces, there can be many implementations for those behaviours which can't be reused by inheritance)

So, inheritance is not the right answer.

### Design Principle: Identify the aspects of the application that vary and separate them from what stays the same. Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don't.

### Design Principle: Program to an interface, not an implementation.


