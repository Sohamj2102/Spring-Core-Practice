# 🚚 Dynamic Shipping Cost Calculator (Spring Core + Strategy Pattern)

## 📌 Overview
This project demonstrates a **Dynamic Shipping Cost Calculator** using **Spring Core** and the **Strategy Design Pattern**.  
The system dynamically switches between **Air, Sea, and Road** shipping strategies at runtime, with configuration values injected from an external `.properties` file.  

##⚙️ Key Concepts Used
-@Value → Injects property values into fields.
	@Value("${shipping.air.base}")
	private double base;
-@PropertySource → Loads external .properties file into Spring context.
	@PropertySource("classpath:shipping.properties")
-Strategy Pattern → Provides multiple interchangeable algorithms (Air, Sea, Road).
-Map Injection → Spring automatically injects all ShippingStrategy beans into a
	Map<String, ShippingStrategy> for dynamic lookup.
		@Autowired
		private Map<String, ShippingStrategy> strategies;


