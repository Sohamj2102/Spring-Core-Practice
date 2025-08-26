# 🚀 Travel Booking System using Spring Core + Strategy Design Pattern

## 📌 What is Strategy Design Pattern (SDP)?
The **Strategy Design Pattern** is a Gang of Four pattern that give some set of rules and principles while designining dependency management classes which allows to design classes as loosely coupled interchangable at runtime.  

Instead of hardcoding logic (like Bus, Train, or Flight booking) into one class, you define a common interface (`Transportation`) and let specific strategies (`BusTransportation`, `TrainTransportation`, `FlightTransportation`) implement it.  

This promotes **flexibility, reusability, and maintainability**.

---

## ✅ Rules of Strategy Design Pattern
1. **Prefer composition over inheritance**  
   - We inject the strategy (`Transportation`) into the context (`TravelBooking`) instead of using inheritance.  

2. **Always code to interfaces or abstract classes to achieve loose coupling**  
   - The context (`TravelBooking`) depends only on the `Transportation` interface, not on concrete implementations.  

3. **Code must be open for extension and closed for modification (`final`)**  
   - Strategies are marked as `final` so they cannot be subclassed, ensuring stable behavior.  
   - New strategies can be added without modifying existing code (OCP principle).

---

## 🛠 Implementation in Spring Framework
- **Spring’s Dependency Injection (DI)** makes it easy to inject different strategies at runtime.  
- We define each strategy as a **Spring Bean** (`@Component`).  
- The context (`TravelBooking`) gets a strategy injected dynamically via `setTransportation()`.  


