# OO Principles
Depend on abstractions. Do not depend on concrete classes.

## Both Abstract Factory and Factory Method create objects
### Factory Method 
* Do it through inheritance
* To create objects using Factory Method, you need to extend a class and provide an implementation for a factory method.
* Using a subclass to do creation.
* Clients only need to know the abstract type they are using, the subclass worries about the concrete type.
* Keep clients decoupled from the concrete types.
* Example:
    * <addr>protected abstract Pizza createPizza(String type);</addr>

### Abstract Factory
* Provide an abstract type for creating a family of products. Example: PizzaIngredientFactory.java
* Subclasses of this type define how those products are produced. Example: NYPizzaIngredientFactory.java, ChicagoPizzaIngredientFactory.java
* The Abstract Factory Pattern provides an interface for creating families of related or
dependent objects without specifying their concrete classes.
* The methods of an Abstract Factory are implemented as factory methods.

### Project class diagram
![alt text](https://github.com/khoivudev/factory-pattern-example/blob/pizza-store-v3/design/class_diagram.png)