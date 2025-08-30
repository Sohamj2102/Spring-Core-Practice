# Task Processor System (Prototype Scope Example)

## 📌 Problem Statement
We are designing a "Task Processor System" where "every new task requires a fresh processor instance".

- Class: `TaskProcessor` with method `process(String taskName)`  
- Spring Configuration: Define `TaskProcessor` as a Prototype bean  
- Main App: Request multiple `TaskProcessor` beans and show they are different objects

---

## ⚙️ Prototype Scope in Spring
The Prototype scope means a new bean instance is created every time it is requested from the Spring container.

Unlike Singleton scope (default), which creates and manages only one shared instance, Prototype scope ensures fresh objects.

### 🔑 Key Points
- Every `getBean()` call returns a new instance  
- Suitable for stateful beans  
- Spring only manages instantiation, not destruction of Prototype beans  

---

## 🆚 Prototype vs Singleton Scope

- Instance per Spring Container:- 
  -Singleton: Only one shared instance is created and reused.  
  -Prototype: A new instance is created for every request.  

- Default Scope? 
  -Singleton: Yes, it is the default scope in Spring.  
  -Prototype: No, it must be explicitly declared.  

- Best For  
  -Singleton: Suitable for stateless beans such as services, DAOs, and configuration classes.  
  - Prototype: Suitable for stateful beans such as task processors or user sessions where independent objects are needed.  

- Lifecycle Management  
  - Singleton: Spring manages the complete lifecycle including initialization and destruction.  
  - Prototype: Spring only manages instantiation; destruction must be handled by the developer.  

---

## 📌 Scopes in Standalone Applications
Spring provides six bean scopes, but for standalone (non-web) applications, only two scopes are commonly used:

1. Singleton → One instance shared across the application (default)  
2. Prototype → New instance created each time it is requested  

👉 Other scopes like `request`, `session`, `application`, and `websocket` apply only in "web applications".
