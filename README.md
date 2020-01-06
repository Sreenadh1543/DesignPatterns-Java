# DesignPatterns-Java

Sample Project to understand important design patterns through programming exercises

**1) FacetedBuilder**

This project explains the concept of faceted Builder for piece wise object construction in java.

**Take Away :**

* Idea or pattern for implementing fluent builders

* Will help to recognise construct behind fluent builders in libraries when using them For ex : Retrofit / String builder uses a fluent builder construct for ease of implementation .

**2)Abstract Factory**

This project is for exploring the Factory pattern for whole sale creation of the objects

**Take Away:**

* This pattern is mostly used as Factory Method i.e; Exposing a static method for object creation as constructors can not be separated for same type and different variables in java by privatising the scope of constructor.

* Factory class is an extraction of factory methods

* How ever , Abstract factory is correspondence between hierarchy of objects and hierarchy of projects but quite rare to implement in day to day implementations.

**3)Prototype :**

This project is for exploring the idea of prototyping design pattern

**Take Away:**

* This is a creation pattern

* Generally in manufacturing , consider if your are creating cars mostly they are made of a common prototype only external design and finishing changes as per the model.

* Similarly , if a huge object is to be recreated only with a minimal change in data it's better to use prototyping where you just clone the prototype object and do the change required on the object.

* This avoids boiler plate code making the change more readable.

* For this we can implement cloneable interface and override clone with deep copy, we can create copy constructors which actually copies and creates a new object using the prototype

* Simple way is use serialization which will do a deep clone by default and solves boiler plate code in application.

**Important**

* Java soon thinking to remove serialization due to insecure deserialization which is categorised as one of the top 10 OWASP vulnerabilities , how ever it's one of the alternative in this model.