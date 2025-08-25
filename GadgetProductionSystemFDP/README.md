# Gadget Production System 🛠️📱💻

A **Spring-based Java project** that demonstrates the **Factory Design Pattern** by creating different types of gadgets (Smartphone, Laptop, Tablet) with various operating systems.

---

## 🚀 Project Overview
The **Gadget Production System** simulates a production line for gadgets.  
It uses the **Factory Pattern** to abstract the creation of different gadgets (Smartphone, Laptop, Tablet) and their operating systems (Android, Windows, iOS).  

Instead of creating gadgets directly in the service or main class, the responsibility of **object creation** is delegated to a **factory class** (`ConcreteGadgetFactory`).  
This makes the system **flexible**, **loosely coupled**, and **easily extendable**.

---

## 🧩 Factory Design Pattern

### 🔑 Key Idea
The **Factory Pattern** is a **Creational Design Pattern** that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

In simple words:
- **Without Factory:** We use `new` keyword everywhere in the code → tightly coupled.
- **With Factory:** A centralized `Factory` class creates objects → loosely coupled.

### ✅ Benefits of Factory Pattern
- Encapsulates object creation logic.
- Promotes loose coupling.
- Enhances flexibility and reusability.
- Supports scalability (new gadgets/OS can be added easily).
