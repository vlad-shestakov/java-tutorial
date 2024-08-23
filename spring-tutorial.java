// spring-tutorial.java

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

// MVC - Шаблон проектирования предполагает разделение на три отдельных компонента
// 		Модель - данных приложения, (Модель)
//		Представление - пользовательского интерфейса ()
//		Контроллер - управляющей логики ()
//  модификация каждого компонента может осуществляться независимо.

// MVC для веб: проще некуда
//   https://habr.com/ru/articles/181772/

// Spring MVC — основные принципы
//   https://habr.com/ru/post/336816/

// Spring Data JDBC/R2dbc - Альтернатива JPA (imho - https://habr.com/ru/post/551902/)
//   https://docs.spring.io/spring-data/jdbc/docs/2.1.7/reference/html/#reference

// ***** Create a Spring MVC project with maven and IntelliJ IDEA Community Edition / Хорошо сработано
//   https://medium.com/panchalprogrammingacademy/create-a-spring-mvc-project-with-maven-and-intellij-idea-community-edition-1d31b3efe078

// Java EE, Spring core/web. Как правильно настроить application context с помощью аннотаций?
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
//   https://coderoad.ru/2990799/%D0%A0%D0%B0%D0%B7%D0%BD%D0%B8%D1%86%D0%B0-%D0%BC%D0%B5%D0%B6%D0%B4%D1%83-FetchType-LAZY-%D0%B8-EAGER-%D0%B2-Java-Persistence-API


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
//   ни к чему эта аннотация не обязывает, просто для удобства

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



// -------------------------------------------------------
// КНИГИ

// 2023 Спилкэ Лауренциу - Spring быстро [RU+EN]
// 	D:\INFA\BOOKS\PRG\Java\2023 Спилкэ Лауренциу - Spring быстро [RU+EN]
//	Примеры проектов - https://manning-content.s3.amazonaws.com/download/a/32357a2-2420-4c0f-be67-645246ae0d94/code.zip
	

// -------------------------------------------------------
// СТАТЬИ 

// Что нужно знать о Spring: история появления, ключевые модули, сравнение с Java EE
//		https://javarush.com/groups/posts/3546-chto-nuzhno-znatjh-o-spring-istorija-pojavlenija-kljuchevihe-moduli-sravnenie-s-java-ee

// -------------------------------------------------------
базовые компоненты, обеспечивающие работу фреймворка Spring, — контекст и аспекты

// -------------------------------------------------------
// АЛЬТЕРНАТИВЫ SPRING

Фреймворк Spring 
Его конкурент Java EE (now Jakarta EE)

контейнер Spring IoC

	Было время, когда разработчики очень ценили спецификацию Java EE. Обладая немного иной философией, 
	Java EE (код которой в 2017 году был переработан, открыт и назван Jakarta EE — https://jakarta.ee/) 
	предлагает такие спецификации, как Context and Dependency Injection (CDI) и Enterprise Java Beans (EJB).

	хорошим фреймворком для управления экземплярами 
	объектов в контейнере был Google Guice (https://github.com/google/guice).
	
вместо Spring Security 
	можно использовать Apache Shiro (https://shiro.Apache.org/).
	
вместо Spring MVC и технологий Spring можно построить веб-приложение на фреймворке Play (https://www.playframework.com/

Из более новых проектов многообещающе выглядит Red Hat Quarkus (https://quarkus.io/). 
Quarkus был создан для внедрения облачных решений и сейчас 
быстро совершенствуется. Я не удивлюсь, если однажды он станет одним 
из ведущих проектов для разработки промышленных приложений в экосистеме Java

// -------------------------------------------------------
// Экосистема фреймворков Spring

Spring проекты 
	Spring Core — фундаментальная часть Spring, в которой реализован его базовый функционал.
	Spring Boot 
	Spring Data
	Spring Security, 
	Spring Cloud, 
	Spring Batch, 
	Spring Boot
		
проекты, которые действительно необходимы на начальном этапе: Spring Core, Spring Data и Spring Boot. 

Полный список проектов экосистемы Spring вы найдете на официальном веб-сайте Spring: 
	https://Spring.io/projects/
	

// -------------------------------------------------------
// Проект Spring Core
	основа Spring, предоставляющая такие функции, как контекст, аспекты и базовый доступ к данным;
	
	// Контекст Spring 
		— это фундаментальная функциональная возможность, благодаря которой Spring может управлять экземплярами приложения. 
	
		// Инверсия управления Spring (inversion of control, IoC)	
		Spring работает по принципу инверсии управления (inversion of control, IoC): 
		вместо того чтобы приложение само контролировало свое выполнение, управление передается некоторому
		другому программному обеспечению — в данном случае фреймворку Spring. Посредством системы настроек мы предоставляем фреймворку инструкции
		о том, как распоряжаться написанным нами кодом, что и определяет логику работы приложения.
		
		Благодаря контейнеру IoC, который часто называют *контекстом Spring,*
		
	// Аспекты Spring 
		- С ними Spring может перехватывать определенные в приложении методы и манипулировать ими
	
		Аспектно-ориентированное программирование (aspect-oriented programming, AOP) в Spring. 
		Spring позволяет управлять экземплярами, помещенными в контроллер IoC, и, в частности, перехватывать методы, описывающие поведение этих экземпляров. 
		Такая возможность называется аспектированием метода. 
		
	// Spring Expression Language (SpEL) 
		- Он позволяет описывать конфигурации Spring с помощью специального языка

// Spring MVC (model-view-controller, «модель — представление — контроллер»)
	Эта часть фреймворка Spring позволяет создавать веб-приложения, обрабатывающие HTTP-запросы. 
	
// Spring Data Access (часть Spring Core)
	еще одна базовая часть Spring. Она предоставляет основные инструменты для соединения с базами данных SQL, что позволяет
	реализовать уровень доступа к данным в приложении. 
	
	управление транзакциями, JDBC и интеграция с фреймворками, реализующими объектно-реляционную привязку (object relational mapping, ORM), например, с Hibernate
	
// Spring Testing
	Эта часть фреймворка включает в себя инструменты, позволяющие писать тесты для Spring-приложения
	
	
// -------------------------------------------------------
// Проект Spring Data 
	— это часть экосистемы Spring, которая позволяет легко подключаться к базам данных и использовать уровень доступа к данным, написав минимальное количество строк кода. 
	Проект обращается как к SQL, так и к NoSQL-базам данных и имеет высокоуровневую обертку, которая упрощает работу с хранением данных
	
	набор качественного удобного инструментария для реализации уровня доступа к данным в приложении. 
	
// -------------------------------------------------------
// Проект Spring Boot 
	
	— это часть экосистемы Spring, реализующая концепцию
	«соглашения важнее конфигурации». Главная идея этой концепции состоит
	в следующем. Вместо того чтобы описывать все параметры конфигурации в самом
	фреймворке, Spring Boot предлагает некую конфигурацию по умолчанию, которую
	можно изменять по мере необходимости.
	
	будет более эффективно не описывать заново всю конфигурацию
	в каждом новом приложении, а начать с некоторой конфигурации по умолчанию
	и изменить в ней лишь то, что отличается от общепринятого. 
// -------------------------------------------------------
// Тестирование для Spring 

	Для написания тестовых сценариев разработчики используют фреймворки Selenium,
	Cucumber, Gauge

// -------------------------------------------------------
// Создание проекта 

IDEA / New / Project / Maven / 4 / JDM 14

// -------------------------------------------------------
// Добавление зависимостей

// Maven central
	https://central.sonatype.com/
	
Зависимости, которые нужно добавить вручную при создании проекта Spring, вы найдете в справочнике 
	https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html
	https://docs.spring.io/spring-framework/reference/core.html
	
	Большинство зависимостей Spring относятся к группе с ID  - org.springframework

по умолчанию Maven берет зависимости (обычно это JAR-файлы) из репозитория с названием Maven central. 
Загруженные JAR-файлы размещаются в папке внешних зависимостей проекта

spring-jdbc
https://central.sonatype.com/artifact/org.springframework/spring-jdbc

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>6.1.11</version>
</dependency>

// -------------------------------------------------------
// Содержимое файла pom.xml по умолчанию 

	<?xml version="1.0" encoding="UTF-8"?>
	<project xmlns="http://Maven.apache.org/POM/4.0.0"
			 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			 xsi:schemaLocation="http://Maven.apache.org/POM/4.0.0
			 http://Maven.apache.org/xsd/Maven-4.0.0.xsd">
			 
		<modelVersion>4.0.0</modelVersion>
		
		<groupId>org.example</groupId>
		<artifactId>sq-ch2-ex1</artifactId>
		<version>1.0-SNAPSHOT</version>
			
		<!-- Добавлена зависимость - spring-jdbc -->
		<dependencies>
			<dependency>
				<groupId>org.springframework</groupId>
				<artifactId>spring-jdbc</artifactId>
				<version>5.2.6.RELEASE</version>
			</dependency>
		</dependencies>
	</project>
	
	
		
	
// -------------------------------------------------------
// Контекст Spring:

Spring — контекст
	(в Spring-приложениях его еще называют контекстом приложения). Представьте
	контекст как место в памяти приложения, куда добавляются все экземпляры
	объектов, которыми должен управлять фреймворк. 
	По умолчанию Spring ничего
	о них не знает. Чтобы фреймворк эти объекты «увидел», их нужно добавить
	в контекст. 
	Контекст — сложный механизм, позволяющий Spring
	контролировать создаваемые вами экземпляры. Таким образом, контекст по
	зволяет использовать возможности фреймворка.
	
добавлять экземпляры объектов (так называемые бины) в контекст Spring.

способы включить бин в контекст :
	 посредством аннотации @Bean;
	 посредством стереотипных аннотаций;
	 программно.

// Создать экземпляр контекста Spring

	// Добавить - spring-context 5.3.8
	
	public static void main(String[] args) {
	 var context = new AnnotationConfigApplicationContext(); // создание экземпляра контекста Spring
	 
	 Parrot p = new Parrot();
	 // Осталось добавить в контекст объект Parrot,
	 }
	 
класс AnnotationConfigApplicationContext. У Spring есть несколько реализаций. Поскольку в большинстве
случаев вы будете применять класс AnnotationConfigApplicationContext (где используется наиболее 
распространенный в настоящее время инструмент — аннотации),

// -------------------------------------------------------
// аннотации @Bean.
// Добавление экземпляров объекта в контекст Spring с помощью бинов - 

1. Определить в проекте класс конфигурации (с аннотацией @Configuration). 
Этот класс (который мы рассмотрим позже) используется для описания
конфигурации контекста Spring.
2. Добавить в класс конфигурацииметод, возвращающий экземпляр объекта, который
мы хотимдобавить в контекст, и снабдить этотметод аннотацией @Bean.
3. Настроить Spring на использование класса конфигурации, созданного
в пункте 1. 


// Класс конфигурации 
	— это специальный класс в приложении Spring, посредством
	которого можно настроить фреймворк на выполнение определенных действий, таких
	как создание бинов или активация определенного функционала. В

	// ProjectConfig.java
	@Configuration
	public class ProjectConfig {
		
		@Bean // Аннотация, на подключение метода как бина в контекст спринга
		Parrot parrot1(){
			var p = new Parrot();
			p.setName("Кеша");
			return p; // Spring добавляет в контекст экземпляр класса Parrot, возвращаемый методом
		}
	}

	// Main.java
	public class Main {
		public static void main(String[] args) {

			// создание экземпляра контекста Spring через конкретный класс
			var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
			
			// Получаем ссылку на бин типа Parrot из контекста Spring
			Parrot p1 = context.getBean("parrot1", Parrot.class);
			System.out.println("Parrot1 name is " + p1.getName());
		}
	}
	

// -------------------------------------------------------
// Стереотипные аннотации @Component
// В случае стереотипных аннотаций для включения бинов в контекст Spring можно обойтись меньшим количеством кода

Стереотипные аннотации размещаются над классом, экземпляр которого мы хотим добавить в контекст Spring. Таким образом мы сообщаем Spring,
что данный класс является компонентом. 

// Cat.java
	@Component
	public class Cat {
		private String name;

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

// ProjectConfig.java
	@Configuration
	@ComponentScan(basePackages = "org.example.main")   // @ComponentScan сообщить Spring, где находятся классы,
														// отмеченные аннотацией @Component. Будет автодобавлен
														// класс Cat
	public class ProjectConfig { ...}

// Main.java
	public static void main(String[] args) {
		...
		Cat ct = context.getBean(Cat.class);
		ct.setName("Чикса");
		System.out.println("Cat is " + ct);
		System.out.println("Cat name is " + ct.getName());
		/*
		Cat is org.example.main.Cat@740cae06
		Cat name is Чикса
		*/
	
// -------------------------------------------------------

@Service
Сервисы — объекты, задачей которых является реализация сценариев использования, 
	Вместо аннотации @Component для класса CommentService можно было бы использовать @Service

@Repository
Репозитории — объекты, отвечающие за сохранность данных. 

Аннотации @Service и @Repository позволяют явно указать обязанности
компонентов в структуре классов. Если в Spring нет специальной аннотации
для данной обязанности, продолжаем использовать @Component

// -------------------------------------------------------
// Области видимости бинов - одиночка и прототип.

// Одиночная область видимости 
	— это область видимости, которую бин Spring получает по умолчанию.

Spring создает одиночные бины при загрузке контекста и присваивает им имена
(иначе, ID бина). Называется одиночной, поскольку при
обращении к конкретному бину мы всегда получаем один и тот же экземпляр. 

Возвращает всегда один и тотже экземпляр объекта из контекста (по имени). 
Может быть несколько объектов одного типа но с разными наивенованиями.

	1. Фреймворк ассоциирует имя с существующим
	экземпляром объекта
	2. При обращении к бину по имени каждый раз
	получаем один и тот же экземпляр объекта
	3. Можно настроить Spring так, чтобы экземпляр
	создавался при загрузке контекста или при
	первом обращении к этому экземпляру
	4. По умолчанию Spring создает бины
	с одиночной областью видимости
	5. Не рекомендуется создавать одиночные бины
	с изменяемыми атрибутами (делать final)

// @Scope - Прототипная область видимости - @Scope(BeanDefinition.SCOPE_PROTOTYPE)


	@Bean
	@Scope(BeanDefinition.SCOPE_PROTOTYPE) // Объявляем этот бин прототипным
	// всякий раз, когда нужно получить бин, создается новый экземпляр объекта. 
	public CommentService commentService() {
		return new CommentService();
		}
	}

1. Имя ассоциируется с типом
2. При обращении к бину по имени каждый
раз получаем новый экземпляр
3. Фреймворк всегда создает экземпляры
объектов с прототипной областью
видимости при обращении к бину
4. Необходимо явно обозначить бин как
прототипный
5. У прототипного бина могут быть
изменяемые атрибуты
// -------------------------------------------------------
// @Lazy - Ленивое добавление в контекст

	@Service
	// @Lazy 
	// Сообщает спрингу создать экземпляр только, если к нему обратились
	public class CommentService {


// -------------------------------------------------------
// Аспекты и АОП в Spring
// АОП - аспектно-ориентированное программирование.

// Аспект  	- какой код должен выполнять Spring при вызове данных методов. 
// Cовет 	- когда приложение должно выполнять логику аспекта (например, перед, после или вместо вызова метода).
// Срез 	- выполнение каких методов должен перехватывать фреймворк и реализовывать аспект. 	
// Точка соединения 	- событие, запускающее выполнение аспекта. Но в Spring это событие всегда одно и то же — вызов метода.
// целевым объектом 	- Бин, в котором объявляется прерываемый аспектом метод
// Прокси-объект - Spring не даст нам прямую ссылку на бин, если мы запросим его из
контекста. Вместо этого Spring предоставит объект, который вызывает не метод,
а логику аспекта. Принято говорить, что взамен бину Spring предлагает проксиобъект. 
// Вплетение - при получении бина из контекста нам всегда будет даваться
его прокси-объект, независимо от того, вызывается ли непосредственно метод
getBean() для контекста, или же используется DI. Данная технология называется вплетением.

// @Aspect - Сообщаем Spring в данном классе содержится определение аспекта
Аннотация не является стереотипной. Типичная ошибка - не добавить класс с аннотацией @Aspect в контекст.

// @Around - Аннотация - совет. можно выбрать совет и снабдить метод соответствующей аннотацией. 
Сообщает Spring, какой метод нужно перехватить. 
// AspectJ - язык срезов, язык выражений
документация (http://mng.bz/4K9g).


	@Aspect
	public class LoggingAspect {
	 @Around("execution(* services.*.*(..))") // Определение перехватываемых методов
		// Выражение среза AspectJ сообщает Spring, что нужно перехватывать вызовы всех методов из пакета services, 
		// независимо от типа возвращаемого значения, класса, к которому метод принадлежит, имени метода или принимаемых им параметров
	 public void log(
		ProceedingJoinPoint joinPoint // ProceedingJoinPoint - параметр, перехватываемый метод. 
		) {
	 joinPoint.proceed(); // Делегирование управления перехваченному методу
	 }
	}

// -------------------------------------------------------
// Фреймворки журналирования

Log4j (https://logging.apache.org/log4j/2.x/);
Logback (http://logback.qos.ch/);
Java Logging API, в комплект которого входит JDK (http://mng.bz/v4Xq).


	import java.util.logging.Logger;
	@Service
	public class CommentService {
	  private Logger logger = Logger.getLogger(CommentService.class.getName()); // Логгер
	  public void publishComment(Comment comment) {
		logger.info("Publishing comment:" + comment.getText());
	  }
	  public void setLogger(Logger logger) {
		this.logger = logger;
	  }
	}

// -------------------------------------------------------


