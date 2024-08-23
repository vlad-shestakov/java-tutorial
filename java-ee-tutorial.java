java-ee-tutorial.txt

-- Изученные материалы


---------------------------------------------------------
-- Легенда
[NR] - Прочитать потом
[RTFM] - ссылки на официальные руководства
***** - полезная статья

----------------------------------------------------------
-- Книги по Spring Framework

-- 2022 / Микросервисы Spring в действии / Джон Карнелл, Иллари Уайлупо Санчес
--   https://www.chitai-gorod.ru/catalog/book/2892147/

-- Книги по Java
--   https://vk.com/topic-111905078_34027481

-- Мои любимые книги по изучению Spring Boot и Spring Cloud в 2021 году
--   https://ichi.pro/ru/moi-lubimye-knigi-po-izuceniu-spring-boot-i-spring-cloud-v-2021-godu-129600996626140
--	 https://webcache.googleusercontent.com/search?q=cache:KviwgSNwUFoJ:https://ichi.pro/ru/moi-lubimye-knigi-po-izuceniu-spring-boot-i-spring-cloud-v-2021-godu-129600996626140+&cd=3&hl=ru&ct=clnk&gl=ru
n
----------------------------------------------------------
-- Stream API ???
-- Jax-RS
-- Liquibase

----------------------------------------------------------
-- Gradle

-- Сборка Java-проекта с использованием Gradle
	http://spring-projects.ru/guides/gradle/
	
-- H2 database example in Gradle
	http://makble.com/h2-database-example-in-gradle
----------------------------------------------------------
-- CheckStyle [NR]

---------------------------------------------------------
-- REST

	POST - Создание (через тело запроса json)
	--POST - Обновление (по id, через параметры запроса)
	PUT - Обновление
	-- PATCH - Обновление (?)
	GET
	DELETE

-- Разница между PUT и POST
	https://www.andreyolegovich.ru/PC/web/post_put.php
	https://editor.swagger.io/
	
---------------------------------------------------------
-- SPRING BOOT ШАБЛОНИЗАТОР
	https://start.spring.io/
	add spring web
		
	-- start.spring.io
	https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.4&packaging=jar&jvmVersion=11&groupId=com.shestakov&artifactId=car-parking&name=car-parking&description=Demo%20project%20for%20Spring%20Boot&packageName=com.shestakov.car-parking&dependencies=web,h2,data-rest,data-jpa,lombok


---------------------------------------------------------
---------------------------------------------------------
-- CLEAN ARCHITECTURE / Чистая архитектура (Роберта К. Мартина) / 
	https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html

-- Clean Architecture with Spring Boot
	https://www.baeldung.com/spring-boot-clean-architecture
	
-- Чистая прагматичная архитектура. Мозговой штурм
	https://habr.com/ru/company/jugru/blog/419179/


-- Многоуровневая архитектура в проекте на Java (Часть 1 / 2)
  https://alexkosarev.name/2018/07/27/n-tier-java-part1/
  https://alexkosarev.name/2018/07/27/n-tier-java-part2/
  
-- Заблуждения Clean Architecture [NR]
	https://habr.com/ru/company/mobileup/blog/335382/

-- MVP / Различия между MVVM и остальными MV*-паттернами [NR]
	https://habr.com/ru/company/mobileup/blog/313538/
	
-- Clean Architecture Example with Java and Spring Boot
	https://medium.com/swlh/clean-architecture-java-spring-fea51e26e00
	https://github.com/soyjuanmalopez/clean-architecture.git
	
----------------------------------------------------------
-- Роберт Марин - «Чистая архитектура»
	автор пропагандирует идею независимости (или минимизации зависимости) архитектуры приложения от внешних факторов: фреймворков, баз данных и прочих сторонних зависимостей

---------------------------------------------------------
-- Organizing Layers Using Hexagonal Architecture, DDD, and Spring
--   https://www.baeldung.com/hexagonal-architecture-ddd-spring
---------------------------------------------------------
-- ***** Микросервисы с Java - Часть 1
	Microservices with Java — Part 1

	https://ichi.pro/ru/mikroservisy-s-java-cast-1-270473313076138 и

	https://tiagoamp.medium.com/microservices-with-java-part-1-f5fe79bf43aa

	https://github.com/tiagoamp/microservices-series/tree/ch-01

		
-- Spring Boot, Spring Data JPA – Rest CRUD API example
	https://www.bezkoder.com/spring-boot-jpa-crud-rest-api/
	https://github.com/bezkoder/spring-boot-data-jpa-mysql
	
	
-- Начало разработки веб-приложений с Java и Spring
  https://alexkosarev.name/2019/07/11/tutorial-java-web-application-with-spring-part1/#more-435
  https://gitlab.com/akosarev-tutorials-and-howtos/tutorial-java-web-application-with-spring.git

	spring-boot-starter-web
	spring-boot-starter-thymeleaf
	spring-boot-starter-test

-- Spring Boot — пример с Postgres и JPA
	Spring Boot, JPA, REST, Postgresql, JUnit, Mockito, Thymeleaf, Ajax
	https://www.youtube.com/watch?v=7kremotjzdM

	https://github.com/caligula95/spring_crud
	

---------------------------------------------------------
-- H2 — открытая кроссплатформенная СУБД
	https://ru.wikipedia.org/wiki/H2


	http://www.h2database.com/html/download.html

-- Начало работы с базой данных H2
	https://russianblogs.com/article/58221521152/
	
-- Использование и управление базой данных H2
  https://russianblogs.com/article/54481776304/

in mem
	jdbc:h2:mem:{database::default}?[;<;,{:identifier}={:param}>]

in file
	jdbc:h2:file:~/.h2/mapstruct;AUTO_SERVER=TRUE
	
C:\Users\User\.h2

	jdbc:h2:!(mem:)!(tcp://)[file:]{path:h2_db_file}[;<;,user={user:param},password={password:param},MV_STORE={MV_STORE:#param},{:identifier}={:param}>]
remote
	jdbc:h2:tcp://{host::localhost}[:{port::9092}]/{database::default}[;<;,user={user:param},password={password:param},{:identifier}={:param}>]

-- Spring Boot: создание и удаление JPA баз данных
	https://java-ru-blog.blogspot.com/2020/03/spring-boot-jpa-create-drop-databases.html
	
---------------------------------------------------------
-- ENTITIES / DOMAIN object / Работа с сущностями 
-- Доменный объект
	https://ru.wikipedia.org/wiki/%D0%94%D0%BE%D0%BC%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9_%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82

-- Spring Data JPA One To Many Relationship Mapping Example
	https://github.com/attacomsian/code-examples/tree/master/spring-data-jpa/jpa-mappings
	https://attacomsian.com/blog/spring-data-jpa-one-to-many-mapping

-- Mapping a Single Entity to Multiple Tables in JPA
	https://www.baeldung.com/jpa-mapping-single-entity-to-multiple-tables
		
	
-- 4. Операции с атрибутами объекта JPA
	https://russianblogs.com/article/29651057280
	https://gitee.com/hypier/barry-jpa/tree/master/jpa-section-3

	@OneToMany
	@Enumerated
	@Embeddable
	@AttributeOverride
	@Convert
	@Override / abstract class 
	
-- JPA отображение типов полей, таких как даты и перечисления

	@Table(name="person")
	@Column(name = "personName", length = 15, nullable = false)
	@Temporal(TemporalType.DATE)
	@Enumerated(EnumType.STRING) / EnumType.ORDINAL
---------------------------------------------------------
-- Объекты значения / Value Object / VO

-- Entity vs Value Object (DDD)
	https://habr.com/ru/post/275599/
	
---------------------------------------------------------
--  DAO / data access object / абстрактный интерфейс к какому-либо типу базы данных
	https://ru.wikipedia.org/wiki/Data_Access_Object
	
---------------------------------------------------------
-- Lombok 

-- Lombok возвращает величие Java
	https://habr.com/ru/post/438870/
	
	@Data 
	@Value 		- объект без сеттеров. Неизменяемый
	@Builder
	@NonNull
	@Singular	@Wither 	@Accessors 
	
---------------------------------------------------------
-- Работа с репозиториями
-- Difference Between CrudRepository and JPARepository in Java
	https://www.tutorialspoint.com/difference-between-crudrepository-and-jparepository-in-java#:~:text=Crud%20Repository%20is%20the%20base,acts%20as%20a%20marker%20interface.&text=JPA%20also%20provides%20some%20extra,like%20findOne%2C%20saves%2C%20etc.&text=JPA%20repository%20also%20extends%20the%20PagingAndSorting%20repository.
	
---------------------------------------------------------
-- DTO - Data Transfer Object
	https://ru.wikipedia.org/wiki/DTO

-- Переосмысление DTO в Java [NR]
	https://habr.com/ru/post/513072/
	
-- ***** Mapping JPA Entities into DTOs in Spring Boot Using MapStruct
-- ***** also Aside: Securing Spring APIs with Auth0 [NR]
	example
	https://auth0.com/blog/how-to-automatically-map-jpa-entities-into-dtos-in-spring-boot-using-mapstruct/
	https://github.com/Tonel/mapstruct-auth0
	
---------------------------------------------------------
-- MapStruct
	https://mapstruct.org/
	
-- MapStruct 1.4.2.Final Reference Guide [RTFM]
	https://mapstruct.org/documentation/stable/reference/html/

-- Spring Boot MapStruct Example of Mapping JPA and Hibernate Entity to DTO
	https://hellokoding.com/mapping-jpa-hibernate-entity-and-dto-with-mapstruct/

-- Mapping DTOs in Spring Boot with MapStruct
	http://www.masterspringboot.com/data-access/jpa-applications/mapping-dtos-in-spring-boot-with-mapstruct/
	https://github.com/fmarchioni/masterspringboot/tree/master/jpa/mapstruct-demo

-- MapStruct решение задачи с ManyToMany +
	https://habr.com/ru/post/433270/
	https://itnan.ru/post.php?c=1&p=433270
	https://github.com/developerc/mapstructexerciss6

-- Серия учебных пособий SpringBoot (55): SpringBoot интегрирует 
-- MapStruct для автоматического сопоставления DTO
	https://russianblogs.com/article/54181583003/
	https://github.com/Thinkingcao/SpringBootLearning/tree/master/springboot-mapstruct
	
---------------------------------------------------------
-- Валидация

-- Настройка валидации DTO в Spring Framework
	https://habr.com/ru/post/343960/
	
---------------------------------------------------------
-- Библиотека Jackson
		https://devcolibri.com/%D0%BA%D0%BE%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%B0%D1%86%D0%B8%D1%8F-java-%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D0%BE%D0%B2-%D0%B2-json/
-- Джексон Аннотации — Краткое руководство (много аннотаций)
	https://coderlessons.com/tutorials/java-tekhnologii/vyuchit-annotatsii-dzheksona/dzhekson-annotatsii-kratkoe-rukovodstvo

-- @JsonProperty(“name”)
	эта говорит, что данный атрибут в JSON будет именоваться как name

-- @JsonIgnore
	а эта аннотация игнорирует данный атрибут и в результате конвертирования он не будет добавлен в JSON.

---------------------------------------------------------
Unit тестирование с JUnit
	https://devcolibri.com/unit-%d1%82%d0%b5%d1%81%d1%82%d0%b8%d1%80%d0%be%d0%b2%d0%b0%d0%bd%d0%b8%d0%b5-%d1%81-junit/
---------------------------------------------------------
-- Eureka / aka Eureka Server также известен как Discovery Server.

Spring Cloud Netflix: Eureka
	https://medium.com/@kirill.sereda/spring-cloud-netflix-eureka-%D0%BF%D0%BE-%D1%80%D1%83%D1%81%D1%81%D0%BA%D0%B8-5b7829481717

---------------------------------------------------------
-- Test with curl

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
-- Exceptions

-- Spring Boot MVC CRUD Example
--   https://javatechonline.com/spring-boot-mvc-crud-example/

---------------------------------------------------------
-- Swagger (software)
	https://en.wikipedia.org/wiki/Swagger_(software)
	
---------------------------------------------------------
-- Flyway (software)
	https://en.wikipedia.org/wiki/Flyway_(software)
	
---------------------------------------------------------
-- JPA Controllers

		
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
-- Использование @Query

-- Working with Spring Data Repositories [OLD]
--   https://docs.spring.io/spring-data/jpa/docs/1.6.0.RELEASE/reference/html/repositories.html

-- Spring Data JPA @Query
--   https://www.baeldung.com/spring-data-jpa-query

-- Использование @Query
--   http://beginner-mercenary.blogspot.com/2019/03/spring-data-jpa-12.html

	@Query("select u from UserEntity u where u.firstname like %?1")
	  List<User> findByFirstnameEndsWith(String firstname);
	}
	
	@Query("select u from UserEntity u where u.firstname = :firstname or u.lastname = :lastname")
	  User findByLastnameOrFirstname(@Param("lastname") String lastname,
									 @Param("firstname") String firstname);
	}
	
-- Весенние данные JPA @Query =)
--   https://javascopes.com/spring-data-jpa-query-1f2cb35e/

---------------------------------------------------------
-- СОБЫТИЯ

-- Spring Boot: события приложения и слушатели
--   https://java-ru-blog.blogspot.com/2020/03/spring-boot-events.html
-- Используйте ApplicationEvent и Listener
--   https://russianblogs.com/article/43931087984/
-- Как использовать события в Spring 3.x
--   https://coderlessons.com/articles/java/kak-ispolzovat-sobytiia-v-spring-3-x

-- Spring под капотом
-- Что у Spring под капотом, как работают @Bean / @PostConstruct
--   https://medium.com/@kirill.sereda/spring-%D0%BF%D0%BE%D0%B4-%D0%BA%D0%B0%D0%BF%D0%BE%D1%82%D0%BE%D0%BC-9d92f2bf1a04

-- Spring Boot старт приложения
-- Boot yourself, Spring is coming (Часть 1) [NR]
-- важных и интересных моментах Spring Boot на примере стартера для воображаемого Железного банка.
--   https://habr.com/ru/company/jugru/blog/424503/
-- Boot yourself, Spring is coming (Часть 2) [NR]
-- О профилях и тонкостях запуска приложения.
--   https://habr.com/ru/company/jugru/blog/425333/
---------------------------------------------------------


// -------------------------------------------------------

D:/R_STUDIO/PRG/java/java-ee-projects/home-library-spr
	/src/main
	
		/webapp/WEB-INF
			// -------------------------------------------------------
			/pages/films.jsp	// Представление (Список фильмов)
			// -------------------------------------------------------
			/pages/editPage.jsp	// Представление (Карточка фильма)
			
		/java/org/shestakov/homelibrary
		
			// -------------------------------------------------------
			/controller/FilmController.java		// Контроллер приложения 
				@Controller	// Аннотация на класс - контроллер
				
				

				
				public class FilmController 
					/* У Spring MVC есть такая штука, как DispatcherServlet. Это как бы главный контроллер, все входящие запросы проходят через него 
					и он уже дальше передает их конкретному контроллеру. Аннотация @Controller сообщает Spring MVC, 
					что данный класс является контроллером */
					
					private FilmService filmService; // Инициализация фильм сервиса

					@Autowired // @Autowired сообщает Spring о том, что он должен покопаться у себя в контексте и подставить сюда подходящий бин.
					// сеттер для явной инициализации 
					public void setFilmService(FilmService filmService) {
						this.filmService = filmService;
					}

					@RequestMapping(value = "/", method = RequestMethod.GET)  // Аннонтация на URL приложения
					public ModelAndView allFilms() {
						// Аннотация @RequestMapping позволяет задать адреса методам контроллера, по которым они будут доступны в клиенте (браузер). 
						// http://127.0.0.1:8080/
						List<Film> films = filmService.allFilms(page); // Использование сервиса для заполнения данными
						int filmsCount = filmService.filmsCount();
						ModelAndView modelAndView = new ModelAndView();
						modelAndView.setViewName("films"); // Привязывает представление - films.jsp
						return modelAndView;
					}
					
					
			// -------------------------------------------------------
			/config/WebConfig.java // Конфигурационный класс 
							
				@Configuration	// @Configuration сообщает Spring что данный класс является конфигурационным и содержит определения и зависимости bean-компонентов.
				@EnableWebMvc	// @EnableWebMvc позволяет импортировать конфигурацию Spring MVC из класса WebMvcConfigurationSupport или WebMvcConfigurer
				@ComponentScan(basePackages = "org.shestakov.homelibrary") 	// @ComponentScan сообщает Spring где искать компоненты, которыми он должен управлять, 
																			// т.е. классы, помеченные аннотацией @Component или ее производными, 
																			// такими как @Controller, @Repository, @Service
				public class WebConfig implements WebMvcConfigurer 
				
					@Bean // Бины (bean) — это объекты, которые управляются Spring'ом. Для определения бина используется аннотация @Bean.
					ViewResolver viewResolver() {
						// Реализация viewResolver() где искать представления в webapp
						// когда в методе контроллера мы устанавливали имя "films" представление найдется как "/pages/films.jsp"
						InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
						viewResolver.setPrefix("/pages/");
						viewResolver.setSuffix(".jsp");
						return viewResolver;
					}
			
			// -------------------------------------------------------
			/config/AppInitializer.java
				
				// Класс регистрирует конфигурацию в контексте Spring 
				public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
								
					@Override // Привязка класса конфигурации - WebConfig
					protected Class<?>[] getServletConfigClasses() {
						return new Class[]{WebConfig.class};
					}
					
					@Override // Перекодировка при отправке с формы значений с русскими символами
					protected Filter[] getServletFilters() {
						CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
						characterEncodingFilter.setEncoding("UTF-8");
						characterEncodingFilter.setForceEncoding(true);
						return new Filter[] {characterEncodingFilter};
					}

			// -------------------------------------------------------
			/model/Film.java // Модель - POJO класс
			// Описывает Java объект и сущность в БД
			
				@Entity // Аннотация для JPA/ORM Сущность (Entity)
				@Table(name = "films") // указывает на конкретную таблицу для отображения этой сущности
				public class Film {

					@Id	// указывает, что данное поле является первичным ключом
				//    @Basic
					@Column(name = "ID", nullable = false, precision = 0) // связывает поле со столбцом таблицы
				//    @GeneratedValue(strategy = GenerationType.IDENTITY)
					@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_generator2") // свойство будет генерироваться автоматически
					@SequenceGenerator(name = "my_generator2", sequenceName = "FILMSIDSEQ", allocationSize = 1)
					private int id;

					@Basic
					@Column(name = "TITLE", nullable = false, length = 100)
					private String title;
					
			// -------------------------------------------------------
			/dao/FilmDAO.java // Интерфейс для объектов DAO
				// Data Access Object (DAO) — это такой паттерн проектирования. создает специальную прослойку, которая будет отвечать исключительно за доступ к данным
				
				public interface FilmDAO {
					List<Film> allFilms(int page);
					void add(Film film);
					void delete(Film film);
					void edit(Film film);
					Film getById(int id);
				}
					
			// -------------------------------------------------------
			/dao/FilmDAOImpl.java // Реализация DAO интерфейса для доступа к фильмам
							
				
				@Repository	// Обозначенние для Spring, что класс они являются DAO компонентом
				public class FilmDAOImpl implements FilmDAO {
					private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
					private static Map<Integer, Film> films = new HashMap<>();

					static { // Статический инициализатор
						Film film1 = new Film();
						film1.setId(AUTO_ID.getAndIncrement());
						film1.setTitle("Inception");
						film1.setYear(2010);
						film1.setGenre("sci-fi");
						film1.setWatched(true);
						films.put(film1.getId(), film1);
					}
					
					@Override // Возвращает все фильмы
					public List<Film> allFilms() {
						return new ArrayList<>(films.values());
					}


			// -------------------------------------------------------
			// сервисный слой, реализует другую бизнес-логику
			/service/FilmService.java // Интерфейс работы
			
				public interface FilmService {
					List<Film> allFilms(int page);
					void add(Film film);
					void delete(Film film);
					void edit(Film film);
					Film getById(int id);
					
			// -------------------------------------------------------
			/service/FilmServiceImpl.java // Реализация сервисного интерфейса
			
				@Service // Обозначенние для Spring, что класс они являются Service компонентом
				public class FilmServiceImpl implements FilmService {

					private FilmDAO filmDAO;

					@Autowired
					public void setFilmDAO(FilmDAO filmDAO) {
						this.filmDAO = filmDAO;
					}

					@Override
					@Transactional
					public List<Film> allFilms(int page) {
						return filmDAO.allFilms(page);
					}

			// -------------------------------------------------------
			
			

// -------------------------------------------------------
// CAR PARKING

D:\R_STUDIO\PRG\java\java-ee-projects\
/car-parking
	/src/main/java/com/shestakov/parkservice
		
		// -------------------------------------------------------
		/ParkServiceApplication.java
				
			@SpringBootApplication // Инициализация SpringBoot приложения
			public class ParkServiceApplication {

				public static void main(String[] args) {
					SpringApplication.run(ParkServiceApplication.class, args);
				}

			}
			
		
		// -------------------------------------------------------
		// КОНТРОЛЛЕР
		/controller/ClientController.java // Контроллер для управления парковкой
			
			// /carparking - точка входа 
			// 	selectall()		GET 		http://localhost:8080/carparking
			// 	select()		GET 		http://localhost:8080/carparking/65
			// 	update()        POST		http://localhost:8080/carparking
			// 	insert()        PUT			http://localhost:8080/carparking
			// 	delete()        DELETE		http://localhost:8080/carparking/1
					
			@RestController
			@RequestMapping("/carparking")	// URL входа
			public class ClientController {

				@Autowired
				private ClientRepository clientRepository; // Репозиторий

				@Autowired
				private ClientMapper clientMapper;

				@GetMapping
				public List<ClientGetDto> selectall() {
					List<ClientGetDto> list = new ArrayList<ClientGetDto>();

					clientRepository.findAll().iterator().forEachRemaining(t -> list.add(clientMapper.toClientGetDto(t)));
			//        clientRepository.findAll().forEach( p -> list.add(clientMapper.toClientGetDto(p)));

					return list;
				}

				@GetMapping(value = "/{clientid}")
				public ResponseEntity<ClientGetDto> select(@PathVariable(value = "clientid") Integer clientid) {

					ClientEntity clientInfo = clientRepository.findById(clientid).get();
					return new ResponseEntity<>(
							clientMapper.toClientGetDto(clientInfo),
							HttpStatus.OK
					);
				}

				@PostMapping()
				public ResponseEntity<ClientPostRsDto> update(@Valid @RequestBody ClientPostRqDto clientPostRqDto) {

					ClientEntity clientInfo = clientMapper.fromClientPostRqDto(clientPostRqDto);
					clientRepository.save(clientInfo);
					return new ResponseEntity<>(
							clientMapper.toClientPostRsDto(clientInfo),
							HttpStatus.CREATED);

				}

				@PutMapping
				public ResponseEntity<ClientPutRsDto> insert(@Valid @RequestBody ClientPutRqDto clientPutRqDto) {

					ClientEntity clientInfo = clientMapper.fromClientPutRqDto(clientPutRqDto);
					clientRepository.save(clientInfo);
					return new ResponseEntity<>(
							clientMapper.toClientPutRsDto(clientInfo),
							HttpStatus.CREATED);

				}

				@DeleteMapping("/{id}")
				public ResponseEntity delete(@PathVariable Integer id) {
					clientRepository.deleteById(id);
					return ResponseEntity.ok().build();
				}

		// -------------------------------------------------------
		// МОДЕЛЬ
		
		// -------------------------------------------------------
		/database/model/ClientEntity.java
		
			/*	
			 * Сущность - Клиенты (машины)
			 * с полями из таблиц Места для парковки и Оплатой
			 */
			@NoArgsConstructor		// @NoArgsConstructor 	lombok
			@AllArgsConstructor		// @AllArgsConstructor	lombok
			@Data					// @Data				lombok
			@Entity					// @Entity Аннотация для JPA/ORM Сущность (Entity)
			@Table(name="client")	// @Table  Указывает на конкретную таблицу для отображения этой сущности
			@SecondaryTable(name = "parkspace", pkJoinColumns = @PrimaryKeyJoinColumn(name = "clientid"))	// Ссылка на дочернюю таблицу
			@SecondaryTable(name = "bookingtime", pkJoinColumns = @PrimaryKeyJoinColumn(name = "clientid"))	// Ссылка на дочернюю таблицу
			public class ClientEntity {

				@Id
				@Column
				@GeneratedValue(strategy = GenerationType.AUTO)
				private int clientid;

				@Column
				private String licensenumber;

				// Поля из дочерних таблиц
				@Column(table = "parkspace")
				private int parkspacenum;

				@Column(table = "bookingtime")
				private Date datestart;

				@Column(table = "bookingtime")
				private Date datefinish;
		
		
		// -------------------------------------------------------
		/database/model/ParkspaceEntity.java
				
			// Сущность - Парковочные места клиентов
			@NoArgsConstructor
			@AllArgsConstructor
			@Data
			@Entity
			@Table(name = "parkspace")
			public class ParkspaceEntity{

				@Id
				@Column
				private int clientid;

				@Column
				private int parkspacenum;
				
				
		// -------------------------------------------------------
		/database/model/BookingtimeEntity.java
			
			// Сущность - Бронирования клиентов
			@NoArgsConstructor
			@AllArgsConstructor
			@Data
			@Entity
			@Table(name = "bookingtime")
			public class BookingtimeEntity {

				@Id
				@Column
				private int clientid;

				@Column
				private Date datestart;

				@Column
				private Date datefinish;

				@Column
				private int renttariff;

				@Column
				private float rentsum;

				@Column
				private float payedsum;

				@Column
				private int ispaid;


		// -------------------------------------------------------
		// РЕПОЗИТОРИЙ
		/database/repository/ClientRepository.java
		
			// Репозиторий клиентов
			//@RepositoryRestResource(collectionResourceRel = "client", path = "client")
			public interface ClientRepository extends JpaRepository<ClientEntity, Integer> 
			

		// -------------------------------------------------------
		/database/repository/ParkspaceRepository.java
		
			//Репозиторий парковочных мест
			//@RepositoryRestResource(collectionResourceRel = "parkspace", path = "parkspace")
			public interface ClientRepository extends JpaRepository<ParkspaceEntity, Integer> 
			
		// -------------------------------------------------------
		/database/repository/BookingtimeRepository.java
		
			// Репозиторий бронирований
			//@RepositoryRestResource(collectionResourceRel = "bookingtime", path = "bookingtime")
			public interface ClientRepository extends JpaRepository<BookingtimeEntity, Integer> 
			
			
		// -------------------------------------------------------
		// МАППЕР
		
		// -------------------------------------------------------
		/controller/mapper/ClientMapper.java
					
			// Маппер полей для управления парковкой
			@Mapper(componentModel = "spring")
			public interface ClientMapper {
			// Автоматически генерирует реализации интерфейса в ClientMapperImpl.java
			//     public class ClientMapperImpl implements ClientMapper {

				// ДАННЫЕ КЛИЕНТА
				// Ответ на запрос данных клиента
				ClientGetDto toClientGetDto(ClientEntity client);

				// СОЗДАНИЕ КЛИЕНТА
				// Запрос на создание клиента
				ClientEntity fromClientPutRqDto(ClientPutRqDto clientPutRqDto);
				// Ответ на запрос создания клиента
				ClientPutRsDto toClientPutRsDto(ClientEntity client);

				// ОБНОВЛЕНИЕ КЛИЕНТА
				// Запрос на обновление клиента
				ClientEntity fromClientPostRqDto(ClientPostRqDto clientPostRqDto);
				// Ответ на запрос обновления клиента
				ClientPostRsDto toClientPostRsDto(ClientEntity client);

	
		// -------------------------------------------------------
		// МОДЕЛИ ДЛЯ ЗАПРОСОВ
		
		// -------------------------------------------------------
		/controller/model/ClientGetDto.java
			// Данные о загрузке парковки ЧТЕНИЕ
			@Data
			public class ClientGetDto {
				private int clientid;           // Код клиента-машины
				private String licensenumber;   // Номер авто
				private int parkspacenum;       // Номер парковочного места
				private Date datestart;         // Дата начала парковки
				private Date datefinish;        // Дата завершения парковки
				private int renttariff;         // Тариф парковки
				private float rentsum;          // Стоимость парковки
				private float payedsum;         // Оплаченная стоимость
				private int ispaid;             // Флаг оплаты
				
		// -------------------------------------------------------
		/controller/model/ClientPutRqDto.java
			// Данные о загрузке парковки ОБНОВЛЕНИЕ ЗАПРОС
			@Data
			public class ClientPutRqDto {
				private int clientid;           // Код клиента-машины
				private String licensenumber;   // Номер авто
				private int parkspacenum;       // Номер парковочного места
				private Date datestart;         // Дата начала парковки
				private Date datefinish;        // Дата завершения парковки
				private int renttariff;         // Тариф парковки
				private float rentsum;          // Стоимость парковки
				private float payedsum;         // Оплаченная стоимость
				private int ispaid;             // Флаг оплаты


		// -------------------------------------------------------
		/controller/model/ClientPutRsDto.java
			// Данные о загрузке парковки ОБНОВЛЕНИЕ ОТВЕТ
			@Data
			public class ClientPutRsDto {
				private int clientid;           // Код клиента-машины
				private String licensenumber;   // Номер авто
				private int parkspacenum;       // Номер парковочного места
				private Date datestart;         // Дата начала парковки
				private Date datefinish;        // Дата завершения парковки
				private int renttariff;         // Тариф парковки
				private float rentsum;          // Стоимость парковки
				private float payedsum;         // Оплаченная стоимость
				private int ispaid;             // Флаг оплаты
				
		// -------------------------------------------------------
		/controller/model/ClientPostRqDto.java
		
			// Данные о загрузке парковки СОЗДАНИЕ ЗАПРОС
			@Data
			public class ClientPostRqDto {

				private String licensenumber;   // Номер авто
				private int parkspacenum;       // Номер парковочного места
				private Date datestart;         // Дата начала парковки
				private int renttariff;         // Тариф парковки
				
		// -------------------------------------------------------
// -------------------------------------------------------