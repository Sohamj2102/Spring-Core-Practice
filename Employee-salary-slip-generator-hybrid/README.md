# \# Employee Salary Slip Generator (Spring XML + Annotation Approach)

# 

# This project demonstrates the \*\*hybrid configuration approach\*\* in Spring, where we use both \*\*XML\*\* and \*\*annotations\*\* together to configure beans and dependencies.  

# 

# The goal is to generate a simple \*\*salary slip\*\* for an employee, showcasing how Spring’s IOC container handles dependency injection with mixed configuration styles.

# 

# ---

# 

# \## ⚙️ Key Concepts Demonstrated

# 

# \### 🔹 Hybrid Configuration (XML + Annotations)

# \- \*\*Annotations (`@Component`, `@Autowired`)\*\*  

# &nbsp; - Classes that can be discovered and managed automatically by Spring are annotated with `@Component`.  

# &nbsp; - Dependencies are injected using `@Autowired`.  

# &nbsp; - To enable this, we use:

# &nbsp;   ```xml

# &nbsp;   <context:component-scan base-package="com.employee.sbeans" />

# &nbsp;   ```

# &nbsp;   which tells Spring to scan for annotated classes in the given package.

# 

# \- \*\*XML Bean Configuration (`<bean>` tag)\*\*  

# &nbsp; - For classes where we don’t use annotations (e.g., when constructor arguments need to be provided), we declare them in the XML file using `<bean>` tag.  

# &nbsp; - In this project, the `Employee` class is configured as a bean in `applicationContext.xml` with constructor arguments.

# 

# 👉 This shows how some beans can be defined using \*\*annotations\*\* while others are still created via \*\*XML configuration\*\*, depending on project requirements.

# 

# ---

# 

# \### 🔹 Dependency Injection

# \- `SalarySlipService` class depends on `Employee`.  

# \- Spring automatically wires the `Employee` bean into `SalarySlipService` using `@Autowired`.

# 

# ---

# 

# \### 🔹 ClassPathXmlApplicationContext

# We use:

# ```java

# ClassPathXmlApplicationContext ctx =

# &nbsp;   new ClassPathXmlApplicationContext("com/employee/confg/applicationContext.xml");

# 

# -It loads the Spring IOC container by reading the XML configuration file from the classpath.

# 

# -It initializes beans, applies dependency injection, and manages bean lifecycle.

# 

# -By using try-with-resources, we ensure the context is properly closed after use.



