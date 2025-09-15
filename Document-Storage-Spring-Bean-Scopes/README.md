\#Document Storage System – Spring Scopes Explanation

\#Basically, in this application I tried to implement only two scopes because it is a standalone application, which supports only singleton and prototype.





###### **#What is Scope in Spring?**

&nbsp;	=>In Spring, scope defines the lifecycle and visibility of a bean.

&nbsp;	=>It decides:



&nbsp;		-How many instances of a bean will be created.



&nbsp;		-How long the bean will exist in the Spring container.



&nbsp;		-How the bean is shared across the application.



###### **#Types of Scopes in Spring:-**

&nbsp;	=>Spring provides 6 standard bean scopes:

&nbsp;		**1. singleton (Default Scope)**



&nbsp;			-Only one instance of the bean is created per Spring IoC container.



&nbsp;			-All requests for that bean return the same shared instance.



&nbsp;			-Suitable for stateless beans (e.g., services, DAO objects).



&nbsp;			-Default behavior if no scope is defined.

&nbsp;		When to Use:



&nbsp;			-When the bean doesn’t hold client-specific state.



&nbsp;			-For reusable, thread-safe components.



&nbsp;			-Example: Logging service, utility classes, database configuration, and in this project →

&nbsp;				FileSystemStorageService, DatabaseStorageService.

&nbsp;	

&nbsp;		**2. prototype**



&nbsp;			-A new instance is created every time the bean is requested.



&nbsp;			-Each injection/lookup returns a different object.



&nbsp;			-Suitable for stateful beans.



&nbsp;		When to Use:



&nbsp;			-When you need a fresh object for each request.



&nbsp;			-Example: CloudStorageService in this project.



&nbsp;		**3. request (Web-aware scope)**



&nbsp;			-A new bean instance is created for each HTTP request.



&nbsp;			-Available only in web-aware Spring ApplicationContexts.



&nbsp;	When to Use:



&nbsp;			-For request-specific state (e.g., storing user request data).



&nbsp;		**4. session (Web-aware scope)**



&nbsp;			-One bean instance is created per HTTP session.



&nbsp;			-Shared across multiple requests within the same session.



&nbsp;		When to Use:



&nbsp;			-For user session-related data (e.g., shopping cart, logged-in user info).



&nbsp;		**5. application (Web-aware scope)**



&nbsp;			-One bean instance is created per ServletContext.



&nbsp;			-Shared across all users and all sessions in a web application.



&nbsp;		When to Use:



&nbsp;			-For application-wide configuration or caching objects.

&nbsp;		**6. websocket (Web-aware scope)**



&nbsp;			-One bean instance per WebSocket session.



&nbsp;		When to Use:



&nbsp;			-For state/data bound to a WebSocket connection.





###### **#Scopes in Different Contexts**



&nbsp;			=>Standalone (Non-Web, Console, Desktop, Spring Core projects):

&nbsp;				-Only singleton and prototype are available.



&nbsp;			=>Web Applications (Spring MVC, Spring Boot Web, etc.):

&nbsp;				-All 6 scopes are available (singleton, prototype, request, session, application, websocket).



###### **#Focus on Singleton and Prototype (Used in This Project)**





		=>Singleton



&nbsp;			-One shared instance in the Spring container.



&nbsp;			-Best for stateless services.



&nbsp;			-Examples here:



&nbsp;				FileSystemStorageService



&nbsp;				DatabaseStorageService



&nbsp;		=> Prototype



&nbsp;			-A new instance is created for each request.



&nbsp;			-Best for stateful or short-lived beans.



&nbsp;			-Example here:



&nbsp;			-CloudStorageService





Note:-



###### **#Pre-Instantiation of Singleton Scope in Spring**





&nbsp;	**#What is Pre-Instantiation?**



&nbsp;		-By default, singleton beans are created eagerly (pre-instantiated) when the Spring IoC container starts.



&nbsp;		-That means, all singleton beans are created and stored in memory during container initialization, not when you 			request them.



&nbsp;	#**Why does Spring Pre-Instantiate Singletons?**



&nbsp;		-Startup Validation



&nbsp;		-Ensures all dependencies are available at application startup.



&nbsp;		-If a required bean is missing, the app fails fast.



&nbsp;		-Performance Optimization



&nbsp;		-First call to a singleton bean is faster since the object is already in memory.



&nbsp;	#**Caching Mechanism**



&nbsp;		-Singletons are cached inside the IoC container (ApplicationContext).



&nbsp;		-They are reused every time you inject or request the bean.



&nbsp;	#**Where is the Object Stored?**



&nbsp;		-Spring keeps singleton beans in an internal cache (HashMap-like structure) inside the ApplicationContext / 				BeanFactory.



&nbsp;		-Example:



&nbsp;			Map<String, Object> singletonObjects = new ConcurrentHashMap<>();





&nbsp;		-Every time you @Autowired or request the bean, Spring returns the cached object.





&nbsp;	**#How to Avoid Pre-Instantiation?**



&nbsp;		-If you don’t want a singleton to be created eagerly:

&nbsp;	

&nbsp;		-Use Lazy Initialization:



&nbsp;		@Lazy

&nbsp;		@Component

&nbsp;		public class MyService { ... }





&nbsp;		OR globally in config:



&nbsp;		@SpringBootApplication

&nbsp;		@Lazy

&nbsp;		public class App { ... }





&nbsp;		Use prototype scope (new object every request).



&nbsp;		Use non-singleton web scopes (request, session, etc.) if in a web app.



&nbsp;	**#Are Other Scopes Pre-Instantiated?**



&nbsp;		-Only singleton beans are eagerly pre-instantiated by default.



&nbsp;		-Other scopes are lazy by nature:



&nbsp;		-prototype → created only when requested.



&nbsp;		-request/session/application/websocket → created only when the web context requests them.

&nbsp;	

