java-ee-tutorial.txt

// Изученные материалы


---------------------------------------------------------
// Легенда
[NR] - Прочитать потом
[RTFM] - ссылки на официальные руководства
***** - полезная статья

----------------------------------------------------------
// Книги по Spring Framework

// 2022 / Микросервисы Spring в действии / Джон Карнелл, Иллари Уайлупо Санчес
//   https://www.chitai-gorod.ru/catalog/book/2892147/

// Книги по Java
//   https://vk.com/topic-111905078_34027481

// Мои любимые книги по изучению Spring Boot и Spring Cloud в 2021 году
//   https://ichi.pro/ru/moi-lubimye-knigi-po-izuceniu-spring-boot-i-spring-cloud-v-2021-godu-129600996626140
//	https://webcache.googleusercontent.com/search?q=cache:KviwgSNwUFoJ:https://ichi.pro/ru/moi-lubimye-knigi-po-izuceniu-spring-boot-i-spring-cloud-v-2021-godu-129600996626140+&cd=3&hl=ru&ct=clnk&gl=ru
n
----------------------------------------------------------
// Stream API ???
// Jax-RS
// Liquibase

----------------------------------------------------------
// Gradle

// Сборка Java-проекта с использованием Gradle
	http://spring-projects.ru/guides/gradle/
	
// H2 database example in Gradle
	http://makble.com/h2-database-example-in-gradle
----------------------------------------------------------
// CheckStyle [NR]

---------------------------------------------------------
// REST

	POST - Создание (через тело запроса json)
	--POST - Обновление (по id, через параметры запроса)
	PUT - Обновление
	// PATCH - Обновление (?)
	GET
	DELETE

// Разница между PUT и POST
	https://www.andreyolegovich.ru/PC/web/post_put.php
	https://editor.swagger.io/
	
---------------------------------------------------------
// SPRING BOOT ШАБЛОНИЗАТОР
	https://start.spring.io/
	add spring web
		
	// start.spring.io
	https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.4&packaging=jar&jvmVersion=11&groupId=com.shestakov&artifactId=car-parking&name=car-parking&description=Demo%20project%20for%20Spring%20Boot&packageName=com.shestakov.car-parking&dependencies=web,h2,data-rest,data-jpa,lombok


---------------------------------------------------------
---------------------------------------------------------
// CLEAN ARCHITECTURE / Чистая архитектура (Роберта К. Мартина) / 
	https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html

// Clean Architecture with Spring Boot
	https://www.baeldung.com/spring-boot-clean-architecture
	
// Чистая прагматичная архитектура. Мозговой штурм
	https://habr.com/ru/company/jugru/blog/419179/


// Многоуровневая архитектура в проекте на Java (Часть 1 / 2)
  https://alexkosarev.name/2018/07/27/n-tier-java-part1/
  https://alexkosarev.name/2018/07/27/n-tier-java-part2/
  
// Заблуждения Clean Architecture [NR]
	https://habr.com/ru/company/mobileup/blog/335382/

// MVP / Различия между MVVM и остальными MV*-паттернами [NR]
	https://habr.com/ru/company/mobileup/blog/313538/
	
// Clean Architecture Example with Java and Spring Boot
	https://medium.com/swlh/clean-architecture-java-spring-fea51e26e00
	https://github.com/soyjuanmalopez/clean-architecture.git
	
----------------------------------------------------------
// Роберт Марин - «Чистая архитектура»
	автор пропагандирует идею независимости (или минимизации зависимости) архитектуры приложения от внешних факторов: фреймворков, баз данных и прочих сторонних зависимостей

---------------------------------------------------------
// Organizing Layers Using Hexagonal Architecture, DDD, and Spring
//   https://www.baeldung.com/hexagonal-architecture-ddd-spring
---------------------------------------------------------
// ***** Микросервисы с Java - Часть 1
	Microservices with Java — Part 1

	https://ichi.pro/ru/mikroservisy-s-java-cast-1-270473313076138 и

	https://tiagoamp.medium.com/microservices-with-java-part-1-f5fe79bf43aa

	https://github.com/tiagoamp/microservices-series/tree/ch-01

		
// Spring Boot, Spring Data JPA – Rest CRUD API example
	https://www.bezkoder.com/spring-boot-jpa-crud-rest-api/
	https://github.com/bezkoder/spring-boot-data-jpa-mysql
	
	
// Начало разработки веб-приложений с Java и Spring
  https://alexkosarev.name/2019/07/11/tutorial-java-web-application-with-spring-part1/#more-435
  https://gitlab.com/akosarev-tutorials-and-howtos/tutorial-java-web-application-with-spring.git

	spring-boot-starter-web
	spring-boot-starter-thymeleaf
	spring-boot-starter-test

// Spring Boot — пример с Postgres и JPA
	Spring Boot, JPA, REST, Postgresql, JUnit, Mockito, Thymeleaf, Ajax
	https://www.youtube.com/watch?v=7kremotjzdM

	https://github.com/caligula95/spring_crud
	

---------------------------------------------------------
// H2 — открытая кроссплатформенная СУБД
	https://ru.wikipedia.org/wiki/H2


	http://www.h2database.com/html/download.html

// Начало работы с базой данных H2
	https://russianblogs.com/article/58221521152/
	
// Использование и управление базой данных H2
  https://russianblogs.com/article/54481776304/

in mem
	jdbc:h2:mem:{database::default}?[;<;,{:identifier}={:param}>]

in file
	jdbc:h2:file:~/.h2/mapstruct;AUTO_SERVER=TRUE
	
C:\Users\User\.h2

	jdbc:h2:!(mem:)!(tcp://)[file:]{path:h2_db_file}[;<;,user={user:param},password={password:param},MV_STORE={MV_STORE:#param},{:identifier}={:param}>]
remote
	jdbc:h2:tcp://{host::localhost}[:{port::9092}]/{database::default}[;<;,user={user:param},password={password:param},{:identifier}={:param}>]

// Spring Boot: создание и удаление JPA баз данных
	https://java-ru-blog.blogspot.com/2020/03/spring-boot-jpa-create-drop-databases.html
	
---------------------------------------------------------
// ENTITIES / DOMAIN object / Работа с сущностями 
// Доменный объект
	https://ru.wikipedia.org/wiki/%D0%94%D0%BE%D0%BC%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9_%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82

// Spring Data JPA One To Many Relationship Mapping Example
	https://github.com/attacomsian/code-examples/tree/master/spring-data-jpa/jpa-mappings
	https://attacomsian.com/blog/spring-data-jpa-one-to-many-mapping

// Mapping a Single Entity to Multiple Tables in JPA
	https://www.baeldung.com/jpa-mapping-single-entity-to-multiple-tables
		
	
// 4. Операции с атрибутами объекта JPA
	https://russianblogs.com/article/29651057280
	https://gitee.com/hypier/barry-jpa/tree/master/jpa-section-3

	@OneToMany
	@Enumerated
	@Embeddable
	@AttributeOverride
	@Convert
	@Override / abstract class 
	
// JPA отображение типов полей, таких как даты и перечисления

	@Table(name="person")
	@Column(name = "personName", length = 15, nullable = false)
	@Temporal(TemporalType.DATE)
	@Enumerated(EnumType.STRING) / EnumType.ORDINAL
---------------------------------------------------------
// Объекты значения / Value Object / VO

// Entity vs Value Object (DDD)
	https://habr.com/ru/post/275599/
	
---------------------------------------------------------
//  DAO / data access object / абстрактный интерфейс к какому-либо типу базы данных
	https://ru.wikipedia.org/wiki/Data_Access_Object
	
---------------------------------------------------------
// Lombok 

// Lombok возвращает величие Java
	https://habr.com/ru/post/438870/
	
	@Data 
	@Value 		- объект без сеттеров. Неизменяемый
	@Builder
	@NonNull
	@Singular	@Wither 	@Accessors 
	
---------------------------------------------------------
// Работа с репозиториями
// Difference Between CrudRepository and JPARepository in Java
	https://www.tutorialspoint.com/difference-between-crudrepository-and-jparepository-in-java#:~:text=Crud%20Repository%20is%20the%20base,acts%20as%20a%20marker%20interface.&text=JPA%20also%20provides%20some%20extra,like%20findOne%2C%20saves%2C%20etc.&text=JPA%20repository%20also%20extends%20the%20PagingAndSorting%20repository.
	
---------------------------------------------------------
// DTO - Data Transfer Object
	https://ru.wikipedia.org/wiki/DTO

// Переосмысление DTO в Java [NR]
	https://habr.com/ru/post/513072/
	
// ***** Mapping JPA Entities into DTOs in Spring Boot Using MapStruct
// ***** also Aside: Securing Spring APIs with Auth0 [NR]
	example
	https://auth0.com/blog/how-to-automatically-map-jpa-entities-into-dtos-in-spring-boot-using-mapstruct/
	https://github.com/Tonel/mapstruct-auth0
	
---------------------------------------------------------
// MapStruct
	https://mapstruct.org/
	
// MapStruct 1.4.2.Final Reference Guide [RTFM]
	https://mapstruct.org/documentation/stable/reference/html/

// Spring Boot MapStruct Example of Mapping JPA and Hibernate Entity to DTO
	https://hellokoding.com/mapping-jpa-hibernate-entity-and-dto-with-mapstruct/

// Mapping DTOs in Spring Boot with MapStruct
	http://www.masterspringboot.com/data-access/jpa-applications/mapping-dtos-in-spring-boot-with-mapstruct/
	https://github.com/fmarchioni/masterspringboot/tree/master/jpa/mapstruct-demo

// MapStruct решение задачи с ManyToMany +
	https://habr.com/ru/post/433270/
	https://itnan.ru/post.php?c=1&p=433270
	https://github.com/developerc/mapstructexerciss6

// Серия учебных пособий SpringBoot (55): SpringBoot интегрирует 
// MapStruct для автоматического сопоставления DTO
	https://russianblogs.com/article/54181583003/
	https://github.com/Thinkingcao/SpringBootLearning/tree/master/springboot-mapstruct
	
---------------------------------------------------------
// Валидация

// Настройка валидации DTO в Spring Framework
	https://habr.com/ru/post/343960/
	
---------------------------------------------------------
// Библиотека Jackson
		https://devcolibri.com/%D0%BA%D0%BE%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%B0%D1%86%D0%B8%D1%8F-java-%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D0%BE%D0%B2-%D0%B2-json/
// Джексон Аннотации — Краткое руководство (много аннотаций)
	https://coderlessons.com/tutorials/java-tekhnologii/vyuchit-annotatsii-dzheksona/dzhekson-annotatsii-kratkoe-rukovodstvo

// @JsonProperty(“name”)
	эта говорит, что данный атрибут в JSON будет именоваться как name

// @JsonIgnore
	а эта аннотация игнорирует данный атрибут и в результате конвертирования он не будет добавлен в JSON.

---------------------------------------------------------
Unit тестирование с JUnit
	https://devcolibri.com/unit-%d1%82%d0%b5%d1%81%d1%82%d0%b8%d1%80%d0%be%d0%b2%d0%b0%d0%bd%d0%b8%d0%b5-%d1%81-junit/
---------------------------------------------------------
// Eureka / aka Eureka Server также известен как Discovery Server.

Spring Cloud Netflix: Eureka
	https://medium.com/@kirill.sereda/spring-cloud-netflix-eureka-%D0%BF%D0%BE-%D1%80%D1%83%D1%81%D1%81%D0%BA%D0%B8-5b7829481717

---------------------------------------------------------
// Test with cURL

Create a new product

	curl -i -H "Content-Type: application/json" -X POST -d '{"name":"Hello Koding","description": "Simple coding examples and tutorials","price":"1"}' http://localhost:8080/api/v1/products

Find all products

	curl -i http://localhost:8080/api/v1/products

--
test adding an Entity:
	curl -i -X POST -H "Content-Type: application/json" -d "{\"email\":\"user@mail.com\",\"name\":\"john\",\"surname\":\"smith\",\"password\":\"secret\"}" http://localhost:8080/customers

And retrieving the Entity:
	curl -s http://localhost:8080/customers/1 | jq
	{
	  "id": 1,
	  "email": "user@mail.com",
	  "name": "john",
	  "surname": "smith"
	}
---------------------------------------------------------
// Exceptions

// Spring Boot MVC CRUD Example
//   https://javatechonline.com/spring-boot-mvc-crud-example/

---------------------------------------------------------
// Swagger (software)
	https://en.wikipedia.org/wiki/Swagger_(software)
	
---------------------------------------------------------
// Flyway (software)
	https://en.wikipedia.org/wiki/Flyway_(software)
	
---------------------------------------------------------
// JPA Controllers

		
	@RestController
	@RequestMapping("/parkspaces")
	public class ParkspacesServiceController {
		
		@Autowired
		private ParkspacesServiceImpl parkspacesServiceImpl;

		@Autowired
		private ParkspacesMapper parkspacesMapper;
		
		// Возврат через маппинг
		@PostMapping(value = "/enter")
		public ResponseEntity<ParkspacesResponse> enterParking(@Valid @RequestBody ParkspacesRequest parkspacesRequest){
			int parkspacesid = parkspacesMapper.map(parkspacesRequest).getParkspaceid();
			return new ResponseEntity<>(parkspacesMapper.map(parkspacesServiceImpl.enterParking(parkspacesid)),HttpStatus.OK);
		}
		
		// Возврат одного значения через Объект и присваивание поля
		@GetMapping(value = "/freespaces")
		public ResponseEntity<Object> freeSpaces() {
			long freeSpaces = parkspacesServiceImpl.getFreeSpaces();
			ParkspacesFreeResponse parkspacesFreeResponse = new ParkspacesFreeResponse();
			parkspacesFreeResponse.setFreespaces(freeSpaces);
			return new ResponseEntity<>(parkspacesFreeResponse, HttpStatus.OK);
		}
		
		// Возврат через коллекцию
		@GetMapping(value = "/freespaces", produces= MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Object> freeSpaces() {
	        return ResponseEntity.status(HttpStatus.OK).body(
	        Collections.singletonMap("freespaces", parkspacesServiceImpl.getFreeSpaces()));
		}
		
---------------------------------------------------------
// Использование @Query

// Working with Spring Data Repositories [OLD]
//   https://docs.spring.io/spring-data/jpa/docs/1.6.0.RELEASE/reference/html/repositories.html

// Spring Data JPA @Query
//   https://www.baeldung.com/spring-data-jpa-query

// Использование @Query
//   http://beginner-mercenary.blogspot.com/2019/03/spring-data-jpa-12.html

	@Query("select u from UserEntity u where u.firstname like %?1")
	  List<User> findByFirstnameEndsWith(String firstname);
	}
	
	@Query("select u from UserEntity u where u.firstname = :firstname or u.lastname = :lastname")
	  User findByLastnameOrFirstname(@Param("lastname") String lastname,
									 @Param("firstname") String firstname);
	}
	
// Весенние данные JPA @Query =)
//   https://javascopes.com/spring-data-jpa-query-1f2cb35e/

---------------------------------------------------------
// СОБЫТИЯ

// Spring Boot: события приложения и слушатели
//   https://java-ru-blog.blogspot.com/2020/03/spring-boot-events.html
// Используйте ApplicationEvent и Listener
//   https://russianblogs.com/article/43931087984/
// Как использовать события в Spring 3.x
//   https://coderlessons.com/articles/java/kak-ispolzovat-sobytiia-v-spring-3-x

// Spring под капотом
// Что у Spring под капотом, как работают @Bean / @PostConstruct
//   https://medium.com/@kirill.sereda/spring-%D0%BF%D0%BE%D0%B4-%D0%BA%D0%B0%D0%BF%D0%BE%D1%82%D0%BE%D0%BC-9d92f2bf1a04

// Spring Boot старт приложения
// Boot yourself, Spring is coming (Часть 1) [NR]
// важных и интересных моментах Spring Boot на примере стартера для воображаемого Железного банка.
//   https://habr.com/ru/company/jugru/blog/424503/
// Boot yourself, Spring is coming (Часть 2) [NR]
// О профилях и тонкостях запуска приложения.
//   https://habr.com/ru/company/jugru/blog/425333/
---------------------------------------------------------
