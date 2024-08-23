spring-tutorial.java

// -------------------------------------------------------
[NR] - Не читал
[MUST READ] - Требуется к прочтению
[RTFM] - Официальные спецификации


// -------------------------------------------------------
// Java EE — это платформа, построенная на основе Java SE, которая предоставляет API и среду времени выполнения для разработки и запуска крупномасштабных, многоуровневых, масштабируемых, надежных и безопасных сетевых приложений.

// JPA (Java Persistence API) это спецификация Java EE и Java SE, описывающая систему управления
// сохранением java объектов в таблицы реляционных баз данных в удобном виде.
//   https://ru.wikipedia.org/wiki/Java_Persistence_API

// JDO - Java Data Objects (JDO)
//   JPA (Java Persistence API) и Java Data Objects (JDO) две спецификации сохранения java объектов в базах данных.
//   Если JPA сконцентрирована только на реляционных базах, то JDO более общая спецификация которая описывает ORM
//   для любых возможных баз и хранилищ.

// ORM (англ. Object-Relational Mapping, рус. объектно-реляционное отображение, или преобразование)
//   — технология программирования, которая связывает базы данных с концепциями объектно-ориентированных
//   языков программирования, создавая «виртуальную объектную базу данных
//   https://ru.wikipedia.org/wiki/ORM

// POJO (англ. Plain Old Java Object) — «старый добрый Java-объект», простой Java-объект
//   https://ru.wikipedia.org/wiki/POJO

// DAO - Data Access Object / абстрактный интерфейс к какому-либо типу базы данных или механизму хранения.
//   https://ru.wikipedia.org/wiki/Data_Access_Object

// -------------------------------------------------------
// MICROSERVICES

// REST (от англ. Representational State Transfer — «передача репрезентативного состояния» или «передача „самоописываемого“ состояния») — архитектурный стиль
	// Другими словами, REST — это набор правил того, как программисту организовать написание кода серверного приложения, чтобы все системы легко обменивались данными и приложение можно было масштабировать.
	// В сети Интернет вызов удалённой процедуры может представлять собой обычный HTTP-запрос (обычно GET или POST; такой запрос называют «REST-запрос»), а необходимые данные передаются в качестве параметров запроса

// SOAP (от англ. Simple Object Access Protocol — простой протокол доступа к объектам) — протокол обмена структурированными сообщениями в распределённой вычислительной среде.

// Различия REST и SOAP
//   https://habr.com/ru/post/483204/

// CRUD -  акроним, обозначающий четыре базовые функции, используемые при работе с базами данных[1]: создание (англ. create), чтение (read), модификация (update), удаление (delete).
//   https://ru.wikipedia.org/wiki/CRUD



// -------------------------------------------------------
// SPRING Framework
//   https://star-wiki.ru/wiki/Spring_Framework

// org.springframework:spring-webmvc:5.3.15
//   https://search.maven.org/artifact/org.springframework/spring-webmvc/5.3.15/jar

// ***** Что нужно знать о Spring: история появления, ключевые модули, сравнение с Java EE
//   https://javarush.ru/groups/posts/3546-chto-nuzhno-znatjh-o-spring-istorija-pojavlenija-kljuchevihe-moduli-sravnenie-s-java-ee

//	core 			— базовый функционал, реализующий понятия IoC (inversion of control) и DI (dependency injection);
//	AOP 			— Aspect-Oriented Programming — аспектно-ориентированое программирование, направленное на реализацию сквозной логики;
//	MVC и WebFlux 	— фреймворки для веб взаимодествия;
//	JDBC, ORM 		— технологии взаимодействия с базами данных;
//	Test 			— функционал для прозрачного, несложного тестирования данных Spring контейнера;
//	SpEL 			— Spring Expression Language — язык выражений Spring;

// Spring Boot
// see // SPRING BOOT
//  Spring Boot обеспечивает автоматическую настройку для всего подключения к базе. В том числе и пул соединений. 

// Spring Data
//   Значительно упрощает использование технологий доступа к данным, реляционных и нереляционных баз данных
// Цель Spring Data — уменьшить объем стандартного кода, необходимого для реализации уровней доступа к данным для различных баз данных.

// Spring Data JPA 
// see // SPRING DATA JPA
// — это библиотека, которая добавляет дополнительный уровень абстракции поверх ORM реализации JPA. По умолчанию Spring Data JPA использует Hibernate, в качестве ORM провайдера (чтобы выполнять запросы). Это, кстати, можно изменить используя настройки Spring. Хотя делать это неопытным пользователям я бы не советовал.

// Spring Cloud
// Spring Security
// Spring GraphQL
// Spring Session
// Spring Integration
// Spring REST
// Spring Web Flow
// Spring WebServices
// Spring HATEOAS
// Spring Batch
// Spring AMQP
// Spring for Apache Kafka
// Spring CredHub
// Spring FLO
// Spring LDAP
// Spring Roo
// Spring Shell
// Spring Statemachine
// Spring Vault


// -------------------------------------------------------
// Spring Initializr
//   ***** Генератор исходного кода для Spring проектов
//   https://start.spring.io/

// -------------------------------------------------------
// SPRING MVC

// Spring MVC — основные принципы
//   https://habr.com/ru/post/336816/

// Spring Data JDBC/R2dbc - Альтернатива JPA (imho - https://habr.com/ru/post/551902/)
//   https://docs.spring.io/spring-data/jdbc/docs/2.1.7/reference/html/#reference

// ***** Create a Spring MVC project with maven and IntelliJ IDEA Community Edition / Хорошо сработано
//   https://medium.com/panchalprogrammingacademy/create-a-spring-mvc-project-with-maven-and-intellij-idea-community-edition-1d31b3efe078

// Форум / Java EE, Spring core/web. Как правильно настроить application context с помощью аннотаций?
//   https://qna.habr.com/q/494833

// Используйте несколько DataSources в Spring MVC
//   https://betacode.net/10859/use-multiple-datasources-in-spring-mvc

// Руководство Spring MVC для начинающих
//   https://betacode.net/10129/spring-mvc-tutorial-for-beginners

// ***** IDEA Создать POJO объекты из БД
// IntelliJ IDEA 10 generate entity (POJO) from DB model
//   https://stackoverflow.com/questions/5259276/intellij-idea-10-generate-entity-pojo-from-db-model

// -------------------------------------------------------
// setViewName("redirect:/");
//   Перенаправляет на корневую страницу - /

// Spring Data JPA [NR]
//   https://habr.com/ru/post/435114/

// -------------------------------------------------------
// Аннотации String MVC

// @Controller
//   Spring поймет что класс обрабатывает HTTP запросы
//   сообщает Spring MVC, что данный класс является контроллером

// @RequestMapping позволяет задать адреса методам контроллера

// @GetMapping - Тоже что @RequestMapping(method = RequestMethod.GET)

// @PathVariable. Она указывает на то, что данный параметр (int id) получается из адресной строки.
//   Чтобы указать место этого параметра в адресной строке используется конструкция {id}
//   (кстати, если имя переменной совпадает, как в данном случае, то в скобках это можно не указывать,
//    а написать просто @PathVariable int id).
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editPage(@PathVariable("id") int id) {

// @ModelAttribute
@RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editFilm(@ModelAttribute("film") Film film) {
// @PostMapping

// @Configuration
//   говорит Spring-у что класс может содержать описания бинов.
//   сообщает Spring что данный класс является конфигурационным и содержит определения и зависимости bean-компонентов
// @Bean - объекты, которые управляются Spring'ом

// @EnableWebMvc
//   импортирует базовую настройку spring-mvc (контроллеры, резолверы, хэндлеры всё вот это вот)
//   позволяет импортировать конфигурацию Spring MVC из класса WebMvcConfigurationSupport
// @ComponentScan сообщает Spring где искать компоненты, которыми он должен управлять, т.е. классы, помеченные аннотацией

// @Repository
//   класс является репозиторием
// @Service
//   класс является сервисом

// @Autowired
//    Ставят на метод контроллера и сервиса по отношению к классам @Repository @Service для автосоздания их экземпляров

	@Service
	public class LibItemEntityServiceImpl implements LibItemEntityService {

		@Autowired
		public void setLibItemEntityDao(LibItemEntityDaoImpl libItemEntityDao) {
			this.libItemEntityDao = libItemEntityDao;
		}
		...
	}

// -------------------------------------------------------
// Apache iBatis
//   https://question-it.com/questions/4942552/kak-vypolnit-fajl-stsenarija-sql-na-java


// -------------------------------------------------------
// SPRING BOOT
//   Проект, целью которого является упрощение создания приложений на основе Spring.
//   Он позволяет наиболее простым способом создать web-приложение, требуя от разработчиков минимум усилий по его настройке и написанию кода.
// Spring Boot — это полезный проект, целью которого является упрощение создания приложений на основе Spring. Он позволяет наиболее простым способом создать web-приложение, требуя от разработчиков минимум усилий по его настройке и написанию кода

// Каждый раз, создавая очередное корпоративное Java-приложение на основе Spring, вам необходимо повторять одни и те же рутинные шаги по его настройке:

// В зависимости от типа создаваемого приложения (Spring MVC, Spring JDBC, Spring ORM и т.д.) импортировать необходимые Spring-модули
// ** Импортировать библиотеку web-контейнеров (в случае web-приложений)
// ** Импортировать необходимые сторонние библиотеки (например, Hibernate, Jackson), при этом вы должны искать версии, совместимые с указанной версией Spring
// ** Конфигурировать компоненты DAO, такие, как: источники данных, управление транзакциями и т.д.
// ** Конфигурировать компоненты web-слоя, такие, как: диспетчер ресурсов, view resolver
// ** Определить класс, который загрузит все необходимые конфигурации

//  spring-boot-starter-data-jpa 
// Spring Data JPA для доступа к базе данных, просто включите в свой проект зависимость spring-boot-starter-data-jpa и все будет готово (вам не придется искать совместимые драйверы баз данных и библиотеки Hibernate)

// spring-boot-starter-web
// Spring web-приложение, просто добавьте зависимость spring-boot-starter-web, которая подтянет в проект все библиотеки, необходимые для разработки Spring MVC-приложений, таких как spring-webmvc, jackson-json, validation-api и Tomcat

// ***** Введение в Spring Boot: создание простого REST API на Java / Модули Spring Boot
//   https://habr.com/ru/post/435144/

// Знакомство со Spring Boot
//   https://topjava.ru/blog/introducing-spring-boot

// Spring Boot | Spring по-русски!
//   http://spring-projects.ru/projects/spring-boot/

// ***** Spring — это не страшно, или как стартовать WEB-сервер со Spring Boot за 5 минут [NR]
//   14 статей (+ H2 (ейч ту) база в памяти / + библиотека Lombok / + REST контроллер)
//   https://javarush.ru/groups/posts/3092-spring-ehto-nestrashno

// Руководство Spring Boot, Spring JDBC и Spring Transaction
//   https://betacode.net/11663/spring-boot-spring-jdbc-and-spring-transaction

// Общие свойства Spring Boot
//   https://betacode.net/11685/spring-boot-common-properties

// Руководство Spring Boot и Spring Data JPA - betacode
//   https://betacode.net/11897/spring-boot-and-spring-data-jpa

// Spring Boot — пример с Postgres и JPA [NR]
//   https://java-master.com/spring-boot-%d0%bf%d1%80%d0%b8%d0%bc%d0%b5%d1%80-%d1%81-postgres-%d0%b8-jpa/



// -------------------------------------------------------
// HIBERNATE
// Hibernate одна из самых популярных открытых реализаций последней версии спецификации (JPA 2.1)
// Самый популярный ORM (Object Relational Mapping) фреймворк / библиотека для языка программирования Java,
//   предназначенная для решения задач объектно-реляционного отображения (ORM),
//   самая популярная реализация спецификации JPA
//   https://ru.wikipedia.org/wiki/Hibernate_(%D0%B1%D0%B8%D0%B1%D0%BB%D0%B8%D0%BE%D1%82%D0%B5%D0%BA%D0%B0)
// 	 https://www.hibernate.org
//   HIBERNATE 5.5.6 (4 августа 2021)


// **** Разница между JDBC, JPA, Hibernate, Spring Data JPA
//   https://java-master.com/%D1%80%D0%B0%D0%B7%D0%BD%D0%B8%D1%86%D0%B0-%D0%BC%D0%B5%D0%B6%D0%B4%D1%83-jdbc-jpa-hibernate-spring-data-jpa/

// Основы Hibernate (2008) (3-оечка)
//   Есть interface DAO / DAO implementation
//   https://habr.com/ru/post/29694/

// JPQL (Java Persistence query language)
//   это язык запросов, практически такой же как SQL, однако вместо имен и колонок таблиц базы данных, он использует имена классов Entity и их атрибуты

// Criteria API это тоже язык запросов, аналогичным JPQL (Java Persistence query language),
//   однако запросы основаны на методах и объектах


// ***** Шпаргалка Java программиста 1: JPA и Hibernate в вопросах и ответах
//   https://habr.com/ru/post/265061/

// Hibernate для начинающих
//   https://habr.com/ru/post/320542/

// ***** Ваше первое приложение на Hibernate (БОДРО, PostgreSQL)
//   https://javarush.ru/groups/posts/hibernate-java


// Руководства Java Hibernate (Каталог статей Betacode)
//   Источник <https://betacode.net/10969/hibernate>

// Руководство Java Hibernate для начинающих
//   https://betacode.net/10201/java-hibernate

// Запрос Java Hibernate (подробности для видов БД)
//   Источник <https://betacode.net/10225/java-hibernate-reference>

// How to make Hibernate work with Oracle database (only adaptation mechanic)
//   Источник <https://www.codejava.net/frameworks/hibernate/how-to-make-hibernate-work-with-oracle-database>

// Hibernate для самых маленьких и не только (2011)
//   Источник <https://habr.com/ru/post/132385/>

// Документация разработчика Hibernate – Глава I. Доступ к базе данных [** RTFM **]
//   Источник <https://habr.com/ru/post/301384/>

// Документация разработчика Hibernate – Глава II. Транзакции и контроль многопоточности
//   Источник <https://habr.com/ru/post/269485/>

// Знакомство с Maven, Spring, MySQL, Hibernate и первое CRUD приложение (часть 1)
//   Источник <https://javarush.ru/groups/posts/2253-znakomstvo-s-maven-spring-mysql-hibernate-i-pervoe-crud-prilozhenie-chastjh-1>

// Java Transaction API (JTA)
//   API, для поддержки транзакций, входящее в стандарт серверной платформы для языка программирования Java –
//   Jakarta EE. Определяет взаимодействие между менеджером транзакций и другими участниками распределённой
//   транзакционной системы.

// HibernateSearch [?]
//   ? К этому можно добавить HibernateSearch добавляя на нужные домены аннотации и получая классный поиск с автоматическим обновлением индекса при CRUD. А также возможность поднять всё это в кластере.

// JAVAC Compiler note - Uses unchecked or unsafe operations. recompile with -xlint:unchecked for details
//   https://java2blog.com/uses-unchecked-or-unsafe-operations-recompile-with-xlintunchecked-for-details/

// ***** Руководство по Hibernate
//   https://proselyte.net/tutorials/hibernate-tutorial/
// Руководство по Hibernate. Архитектура.
//   Источник <https://proselyte.net/tutorials/hibernate-tutorial/architecture/>
// Руководство по HIbernate. Язык запросов Hibernate (HQL)
//   https://proselyte.net/tutorials/hibernate-tutorial/hibernate-query-language/
// Руководство по HIbernate. Criteria Queries
//   https://proselyte.net/tutorials/hibernate-tutorial/criteria-queries/
// Руководство по HIbernate. Нативный SQL.
//   https://proselyte.net/tutorials/hibernate-tutorial/native-sql/
// Руководство по Hibernate. Кеширование
//   https://proselyte.net/tutorials/hibernate-tutorial/caching/
// Руководство по Hibernate. Обработка “пакетов”.
//   https://proselyte.net/tutorials/hibernate-tutorial/batch-processing/

// Hibernate: использование lazy initialization в разработке клиент-серверного приложения
//   https://habr.com/ru/post/111911/

// Hibernate или JPA или JDBC или?
//   https://coderoad.ru/2560500/Hibernate-%D0%B8%D0%BB%D0%B8-JPA-%D0%B8%D0%BB%D0%B8-JDBC-%D0%B8%D0%BB%D0%B8

// ***** Почему следует избегать использования JPA/Hibernate в продакшене (костыли JPA / альтернативы / здраво)
//   https://habr.com/ru/post/551902/

// FetchType LAZY и EAGER
	https://coderoad.ru/2990799/%D0%A0%D0%B0%D0%B7%D0%BD%D0%B8%D1%86%D0%B0-%D0%BC%D0%B5%D0%B6%D0%B4%D1%83-FetchType-LAZY-%D0%B8-EAGER-%D0%B2-Java-Persistence-API


// Metamodel - метаданные JPA
//   ?

// -------------------------------------------------------
// HIBERNATE СПРАВКА


// Два типа fetch стратегии в JPA
//   1) LAZY — данные поля будут загруженны только во время первого доступа к этому полю,
//	 2) EAGER — данные поля будут загруженны немедленно,

// Четыре статуса жизненного цикла Entity объекта (Entity Instance’s Life Cycle)
//   1) new — объект создан, но при этом ещё не имеет сгенерированных первичных ключей и пока ещё не сохранен в базе данных,
//	 2) managed — объект создан, управляется JPA, имеет сгенерированные первичные ключи,
//	 3) detached — объект был создан, но не управляется (или больше не управляется) JPA,
// 	 4) removed — объект создан, управляется JPA, но будет удален после commit'a транзакции.

// Два вида кэшей (cache):
//   1) first-level cache (кэш первого уровня) — кэширует данные одной транзакции,
//   2) second-level cache (кэш второго уровня) — кэширует данные дольше чем одна транзакция.



// -------------------------------------------------------
// JPA аннотации

// Основы O/R отображения [** RTFM **]
//   http://hibernate-refdoc.3141.ru/ch5.BasicORMapping

// @Entity

// @Table(name = "routes")

// @Basic Annotation
//   https://www.baeldung.com/jpa-basic-annotation


// @Id
// @GeneratedValue
// @Column(name = "id")

// @DynamicInsert(false)
// @DynamicUpdate
// @Access Annotation
//   @Access(AcessType.PROPERTY) / @Access(AcessType.FIELD)
//   https://ru.stackoverflow.com/questions/874276/%D0%94%D0%BB%D1%8F-%D1%87%D0%B5%D0%B3%D0%BE-accesstype-field-%D0%B8-accesstype-property-%D0%B2-access

// @Cacheable
//    использование кеша второго уровня (second-level cache)

// @IndexColumn("index_name")

// @NotNull
// @Length(max = 6)

// @ManyToOne
// @JoinColumn(name = "fk_route")
   private Route route;

// @OneToMany(mappedBy = "driver")
   private Set<Driver> drivers;

// @MappedSuperclass

// @Service
// ни к чему эта аннотация не обязывает, просто для удобства. Аналогична @Component

// @Convert и @Converts  / Converters for JPA 2.1
//   задания класса преобразования basic аттрибута Entity в другой тип при сохранении/получении данных их базы (например, работать с аттрибутом Entity boolean типа, но в базу сохранять его как число)

// @EntityListeners
//   Callback методы служат для вызова при определенных событиях Entity (то есть добавить обработку
//   например удаления Entity методами JPA)

// @OrderBy и @OrderColumn
//   установки порядка выдачи элементов коллекций Entity
//   @OrderBy("lastname ASC") / @OrderBy // PK is assumed / @OrderBy("zipcode.zip, zipcode.plusFour")

// @Transient
//   исключить поли и свойства Entity из маппинга (property or field is not persistent)?

// @NamedEntityGraph / for JPA 2.1
//   можно изменить настройки fetch стратегии любых атрибутов Entity для отдельных запросов (query) или методов поиска (find)
//   то если у Enity есть атрибут с fetchType = LAZY, но для конкретного запроса его требуется сделать EAGER или наоборот?

// @Proxy(lazy=false)


// -------------------------------------------------------
// Hibernate / JPA Troubleshooting

// LazyInitializationException
//   ?
// HABR [lazy initialization]
//   https://habr.com/ru/search/?target_type=posts&order=relevance&q=%5Blazy%20initialization%5D


// Типы функций: функции-мошенники
//   https://azhidkov.pro/posts/21/01/210126-fraud-functions/


// -------------------------------------------------------
// Hibernate & Oracle Tips

// Hibernate and Oracle Sequence (Usefull for sequence description in xml)
//   https://stackoverflow.com/questions/19582219/hibernate-and-oracle-sequence

// Auto updating fields with default values in DB after persisting using dynamicInsert
//   https://stackoverflow.com/questions/32049106/auto-updating-fields-with-default-values-in-db-after-persisting-using-dynamicins
// Hibernation annotations, specify column default value (Useful tip for DynamicInsert)
//   https://stackoverflow.com/questions/3413487/hibernation-annotations-specify-column-default-value/36259735


// -------------------------------------------------------
// Hibernate. Конфигурирование
//   https://proselyte.net/tutorials/hibernate-tutorial/configure/

 XML-файл – hibernate.cfg.xml,
 либо – hibernate.properties.


// -------------------------------------------------------
// SPRING JPA
// - библиотека, которая добавляет дополнительный уровень абстракции поверх ORM реализации JPA
// По-умолчанию Spring Data JPA использует Hibernate, в качестве ORM провайдера (чтобы выполнять запросы)

// Spring Data JPA [OFFICIAL]
//   https://spring.io/projects/spring-data-jpa

// Spring Data JPA / Хабр
//   https://habr.com/ru/post/435114/


// Spring Data JPA: что такое хорошо, и что такое плохо
//   https://habr.com/ru/post/441386/

// Пишем простое веб-приложение используя Spring MVC, Spring Data JPA и Hibernate
//   https://habr.com/ru/post/479286/


// -------------------------------------------------------
// JAVA ENTERPRISE

// ***** Введение в Enterprise-разработку (в 8 частях) [NR] (Понятно! В 6 статье подъем томката доступно, выпуск сертификата для HTTPS)
//   https://javarush.ru/groups/posts/2514-vvedenie-v-enterprise-razrabotku
//	 https://javarush.ru/groups/posts/2519-chastjh-2-pogovorim-nemnogo-ob-arkhitekture-po
//	 https://javarush.ru/groups/posts/2521-chastjh-3-protokolih-httphttps
//	 https://javarush.ru/groups/posts/2523-chastjh-4osnovih-maven
//	 https://javarush.ru/groups/posts/2529-chastjh-5-servletih-pishem-prostoe-veb-prilozhenie
//	 https://javarush.ru/groups/posts/2533-chastjh-6-konteynerih-servletov (TOMCAT)
//	 https://javarush.ru/groups/posts/2536-chastjh-7-znakomstvo-s-patternom-mvc-model-view-controller
//	 https://javarush.ru/groups/posts/2537-chastjh-8-pishem-neboljhshoe-prilozhenie-na-spring-boot (Spring Boot)

// -------------------------------------------------------
//   Что надо знать по JAVA
//   
//   Java Core
//     Коллекции 
//     Массивы
//     Хеш мапы
//     Потоки
//     
//   JUNIT 4
//   
//   Сборщик
//   	Gradle вместо Maven
//     
//   Spring Boot
//   Spring Boot Starter JPA
//   Spring JPA вместо Hibernate
//   
//   Менеджер пакетов
//   	OpenShift - промышленный
//   	Docker - домашний
//   
//   
//   Фирма Фархад
//   	Global Track
//   	

// -------------------------------------------------------
// MAVEN Зависимости


// org.springframework:spring-webmvc:5.3.15
//   https://search.maven.org/artifact/org.springframework/spring-webmvc/5.3.15/jar

// spring-context
https://central.sonatype.com/artifact/org.springframework/spring-context

	<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-context</artifactId>
		<version>6.1.11</version>
	</dependency>

// -------------------------------------------------------

