# Spring Annotations & Concepts Notes

This file documents key concepts, annotations, and setups used in the Spring and Spring Boot demos.

---

## 1. DIY IoC/DI (Plain Java)

Created `Printer` and `UserService` classes.

![Alt Text](assets\M1.png)

➡️ Manual dependency wiring without Spring — pure Java Inversion of Control.

---

## 2. Spring Core (`spring-core-demo/`)

- Added `spring-core` dependency.
- Annotated both classes with `@Component`.
- Just Used Spring Only Not Spring Boot
- Fetched beans using Spring's IoC container:

![Alt Text](assets\M2.png)

➡️ Spring automatically wires beans based on annotations.

---

## 3. Spin up Spring Boot

- Created Spring Boot app in `springboot-fundamentals/`.
- Added a simple `GreetingController`:
- `@Controller` to make it handle http requests
- `@RequestMapping` give http path which handle the greeting
- `@RequestBody` make it return string

![Alt Text](assets\M3.png)

➡️ Spring Boot auto-configures web server and maps HTTP requests to methods.

---

## 4. Explore `@SpringBootApplication`

- Modified main class to exclude default DataSource config:

```java
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
```

- Verified in logs:
  - ✅ No H2 or HikariCP initialized
  - ✅ No embedded DataSource detected

![Alt Text](assets\M4.png)

➡️ Prevents Spring Boot from auto-configuring a database when none is needed.

---

## 5. Profiles & Config Binding

### AppProperties.java:

![Alt Text](assets\M5_2.png)

### TitleController.java:

![Alt Text](assets\M5_1.png)

➡️ Demonstrates using configuration profiles and `@ConfigurationProperties` binding.

---

## 6. Qualified DI Example

### TimeService.java:

![Alt Text](assets\M6_1.png)


### SystemTimeService.java:

![Alt Text](assets\M6_2.png)

### MockTimeService.java:

![Alt Text](assets\M6_3.png)

### TimeController.java:

![Alt Text](assets\M6_4.png)

➡️ Shows how to resolve multiple bean injection using `@Primary` and `@Qualifier`.

---
