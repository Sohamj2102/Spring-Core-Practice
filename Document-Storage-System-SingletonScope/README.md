\# 📄 Document Storage System (Spring Bean Scope - Singleton)



\## 📝 Problem Statement

We are developing a system that stores documents into \*\*Local File System\*\*, \*\*Cloud Storage\*\*, or \*\*Database\*\*.  

This project demonstrates the \*\*Singleton Scope\*\* of Spring beans and the use of \*\*@Qualifier\*\* to inject a specific implementation.



---



\## 🚀 Features

\- `StorageService` Interface

&nbsp; - Defines `void store(String fileName);`

\- Implementations:

&nbsp; - \*\*FileSystemStorageService\*\* → `"Storing <fileName> in Local File System"`

&nbsp; - \*\*CloudStorageService\*\* → `"Storing <fileName> in Cloud Storage"`

&nbsp; - \*\*DatabaseStorageService\*\* → `"Storing <fileName> in Database"`

\- \*\*StorageManager\*\*

&nbsp; - Uses a specific `StorageService` via `@Qualifier`

&nbsp; - Provides `save(String file)` method

\- \*\*Singleton Scope Verification\*\*

&nbsp; - Print bean hashcodes to confirm that the same instance is reused.



---



\## 🔑 Singleton Class in Java

\- A \*\*design pattern\*\* where only \*\*one instance\*\* of a class is created for the entire JVM.  

\- Achieved using:

&nbsp; - \*\*Private constructor\*\* (to prevent external instantiation)

&nbsp; - \*\*Static reference\*\* to hold the single instance

&nbsp; - \*\*Public static method\*\* (factory method) to return the instance  

\- The object is created \*\*only once per JVM\*\* and reused everywhere.

\- Example: `Runtime.getRuntime()` in Java is a singleton class.



---



\## 🔑 Singleton Scope in Spring

\- \*\*Default scope\*\* of Spring beans.

\- A bean is created \*\*only once per container per bean ID\*\* and cached internally by the IoC container.

\- Unlike a singleton class, \*\*Spring Singleton is limited to the container\*\*, not the entire JVM.

\- Beans are created \*\*eagerly at container startup\*\* (unless marked with `@Lazy`).

\- All injections of the same bean ID will return the \*\*same object reference\*\*.



---



\## ⚡ How to Avoid Early Instantiation

By default, singleton beans are created eagerly. To delay creation until first use:

```java

@Component

@Lazy

public class MyBean {

&nbsp;   public MyBean() {

&nbsp;       System.out.println("MyBean created");

&nbsp;   }

}



\## 🔑When to Use Singleton Scope

=>Use singleton scope when:



* The bean is stateless (does not hold user-specific data).



* The bean represents a service that is reused across the application.



* The bean is heavy to create and should be initialized only once.



* The bean manages shared resources (like database connections or configuration).



=>Avoid singleton scope when:



* The bean is stateful and holds per-user, per-request, or per-thread data.



* You require new instances for each use case (then use prototype scope).



\## 🔑Real-Time Examples of Singleton Scope



* Service classes: PaymentService, EmailService, NotificationService



* DAO/Repository classes: Database access objects, since they rely on pooled connections.



* Utility beans: LoggingService, ConfigurationManager, or CacheManager



* Manager classes: For example, in this project, StorageManager is a singleton bean that coordinates storage operations.
