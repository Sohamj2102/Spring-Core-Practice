# 🚗 Vehicle Service System (Spring @Qualifier Demo)

## Problem
In Spring, when multiple beans implement the same interface, the **IoC container gets confused** about which bean to inject (known as *NoUniqueBeanDefinitionException*).

Example:  
`VehicleService` is implemented by `CarService`, `BikeService`, and `TruckService`.  
When injecting `VehicleService`, Spring won’t know which one to choose.

---

## Solutions
Spring provides **3 ways** to resolve this conflict:

1. **@Qualifier** ✅  
   - Specify the exact bean name.  
   - Example:  
     ```java
     @Autowired  
     @Qualifier("carService")  
     private VehicleService service;
     ```
   - Best when you want **fine-grained control**.

2. **@Primary**  
   - Mark one bean as the default.  
   - Example:  
     ```java
     @Service
     @Primary
     public class CarService implements VehicleService { ... }
     ```
   - Useful if one bean is the **most commonly used**.

3. **Property-based Matching (Bean Name Injection)**  
   - If the field/property name matches the bean name, Spring auto-injects.  
   - Example:  
     ```java
     @Autowired  
     private VehicleService carService;  
     ```
   - Less explicit → might cause confusion in large projects.

---

## Which is Better?
- **@Qualifier** → Best for **explicit, clear, and flexible** injection.  
- **@Primary** → Good for a **default bean choice**.  
- **Property Matching** → Works but **not recommended** for readability.

---

## Conclusion
This project uses **@Qualifier** to inject the correct `VehicleService` (Car/Bike/Truck) into the `ServiceCenter`.

