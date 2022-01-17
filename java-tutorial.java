Java-tutorial

// -------------------------------------------------------
[NR] - Не читал
[MUST READ] - Требуется к прочтению
[RTFM] - Официальные спецификации
// -------------------------------------------------------

// Топ-10 книг по Java для начинающих
//  https://javarush.ru/groups/posts/top-7-knig-po-java

// https://javarush.ru/

// Легкий старт в Java. Вводный курс для чайников
//   https://stepik.org/course/90684/syllabus?auth=registration
  
// Модификаторы доступа. Private, protected, default, public
//   https://javarush.ru/groups/posts/1988-modifikatorih-dostupa-private-protected-default-public

// полезная статья, про обучение и работу после ВУЗа
//   https://javarush.ru/quests/lectures/questsyntaxpro.level22.lecture02

// Live templates
//   https://www.jetbrains.com/help/idea/using-live-templates.html

// Создание и запуск первого Java-приложения (часть 2)
//   https://javarush.ru/groups/posts/693-sozdanie-i-zapusk-pervogo-java-prilozhenija-chastjh-1
//   https://javarush.ru/groups/posts/694-sozdanie-i-zapusk-pervogo-java-prilozhenija-chastjh-2

// Java。Hello World 6等级。:Java. Hello world в 6-й степени.
// С внешней библиотекой
//   https://stackoverflow.editcode.net/thread-119505-1-1.html

// Руководство Spring Boot, Spring JDBC и Spring Transaction
//   https://betacode.net/11663/spring-boot-spring-jdbc-and-spring-transaction

// Еще советую Вам ознакомиться с книгой Крейга Уоллса "Spring в действии" (4-е издание, по-моему, сейчас актуально). Дядька очень доступно объясняет все заданные Вами вопросы, и работу многих компонентов фреймворка в целом.


// -------------------------------------------------------
// JAVA USEFUL LINKS 

// ***** Список полезных ссылок для Java программиста
//   350 самых популярных не мобильных Java opensource проектов на github (aka  Шпаргалка Java программиста 2)
//   https://github.com/Vedenin/useful-java-links/tree/master/link-rus

// Чеклист Java-developer’а. Что должен знать разработчик [MUST READ]
//   https://javarush.ru/groups/posts/3190-cheklist-java-developera-chto-dolzhen-znatjh-razrabotchik

// Collection of Hello World examples for many libraries and frameworks (In-progress)
//   https://github.com/Vedenin/useful-java-links/tree/master/helloworlds

// 250 русскоязычных обучающих видео докладов и лекций о Java
//   (aka Шпаргалка Java-программиста 5)
//   https://habr.com/ru/company/luxoft/blog/272025/


// -------------------------------------------------------
// -------------------------------------------------------
// Java

// Open JDK 13
//   https://jdk.java.net/ 

// IntelliJ IDEA Community Edition - free
// IntelliJ IDEA Ultimate Edition
// IntelliJ IDEA EAP (Early Access Program) - free
// JetBrains IntelliJ IDEA EAP (beta from JetBrains) - free

// -------------------------------------------------------
// JAVA STANDARDS

// Java Naming Conventions [** RTFM **]
//   https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html

// Code Conventions for the Java Programming Language (1999) [** RTFM **]
//   http://www.oracle.com/technetwork/java/javase/documentation/codeconvtoc-136057.html

// Java Style Guidelines (2015) [** RTFM **] 
//   http://cr.openjdk.java.net/~alundblad/styleguide/

	class Main
	int getLine()  // метод CamelCase

// -------------------------------------------------------
// Компиляция в Java
//   https://javarush.ru/groups/posts/2318-kompiljacija-v-java

// -------------------------------------------------------
// Комментарии
  // some text
  /* some text */
  
// Javadoc
/** Это документационный комментарий */

/** Это тоже
документационный комментарий */

/*******************

Это документационный комментарий

*********************/
  

// -------------------------------------------------------
// IDEA

// Быстрые клавиши IDEA
/*
    Shift-F10 		- Запуск
	Ctrl+Alt+S		- Настройки
	CTRL + F9		- Build
	ALT + INSERT	- Создание объекта
	Ctrl + P 		- Какие параметры принимает метод
	Ctrl + Q		- Документация на метод
	Shift + F6		- Рефакторинг / Переименовать класс
	Ctrl + Alt + L	- Автоформатирование
	Shift + Shift 	- Калькулятор / Поиск по всему
	Ctrl + Q 	    - Показать JavaDoc
	Ctrl + Shift + Up/Down - Перемещение строки вверх/вниз
/**/

// Editor basics
//   https://www.jetbrains.com/help/idea/2021.3/using-code-editor.html

// -------------------------------------------------------
// Шаблоны IDEA
// Ctrl+Alt+S

	// sout	
	System.out.println();
	// main or psvm	
	public static void main(String[] args){
	// fori	
	for (int i = 0; i < ; i++) { -- }
	// ifn	
	if (var == null) {-- 
	}

// -------------------------------------------------------
// IDEA PLUGINS

// codehelper.generator
//   Генерация DAO файлов
//   https://github.com/zhengjunbase/codehelper.generator/blob/master/README-EN.md

// -------------------------------------------------------
// Javadoc
//   https://ru.wikipedia.org/wiki/Javadoc
//   https://java-online.ru/java-javadoc.xhtml
// Как увидеть JavaDoc в IntelliJ идее?
//   Источник <https://coderoad.ru/11053144/%D0%9A%D0%B0%D0%BA-%D1%83%D0%B2%D0%B8%D0%B4%D0%B5%D1%82%D1%8C-JavaDoc-%D0%B2-IntelliJ-%D0%B8%D0%B4%D0%B5%D0%B5> 


// однострочный комментарий;
/* многострочный комментарий */
/** комментирование документации */

// IDEA Ctrl + Q - Показать JavaDoc


    /**
     * Creates two dimensional array from delineated string in properties file
     * @param propertyName name of the property as in the file
     * @param propFile the instance of the Properties file that has the property
     * @return two dimensional array
	 * @autor Vlad
	 * @version 1.0
     */

	// @author				Автор	класс, интерфейс
	// @version				Версия. Не более одного дескриптора на класс	класс, интерфейс
	// @since				Указывает, с какой версии доступно	класс, интерфейс, поле, метод
	// @see					Ссылка на другое место в документации	класс, интерфейс, поле, метод
	// @param				Входной параметр метода	метод
	// @return				Описание возвращаемого значения	метод
	// @exception 			имякласса описание
	// @throws 				имякласса описание	Описание исключения, которое может быть послано из метода	метод
	// @deprecated			Описание устаревших блоков кода	класс, интерфейс, поле, метод
	// {@link reference}	Ссылка	класс, интерфейс, поле, метод
	// {@value}				Описание значения переменной	статичное поле



    private static String[][] fetchArrayFromPropFile(String propertyName, Properties propFile) {


// -------------------------------------------------------
// Типы данных
// примитивные типы
	int 	num = 123;
	int 	a = 42, b = 11;
	float  	foo = 3/2;
	double	pi  = 3.14;
	char 	group = 'Z';	 // используется для хранения одного символа. В отличие от строк, значение переменной типа char помещается в одинарные кавычки.
	boolean atHome = true;
	byte 
	short
	long
	boolean f1 = x1 > x2;
// Ссылочные	
	String 	abs = "123";
	int[]	array = {1,2,3}; // массив
	String  str = null; // ссылка никуда не указывает
	
// -------------------------------------------------------
// Вывод в консоль

	// Печать в одной строке
	System.out.print("aa");
	System.out.print("bb");
	// aabb
	
	// Печать с разрывом
	System.out.println("aa");
	System.out.println("bb");
	// aa
	// bb
	// Возвраты каретки
	System.out.println("В методе main(String[]) выведи на экран все числа из трехмерного массива multiArray.\n" +
                "Требования:\n");
				
	int x = 42;
	int y = 84;
	System.out.println(x + " " + y);    // 42 84
	System.out.println(x + z);          // 126


// -------------------------------------------------------
// Ввод данных 

// импорт
import java.util.Scanner; 

// Ввести строку целиком: nextLine()
// Ввести слово (считывается до первого пробела): next()
// Ввести объект int: nextInt()
// Ввести объект float: nextFloat()
// Ввести объект double: nextDouble()
// Ввести объект boolean: nextBoolean()

// hasNext -вернет true, если в буфере есть еще что-то 


// !!! Сразу после nextInt() метод nextLine() возвращает остаток предыдущей строки, не использованный при предыдущем считывании. 
// Поскольку сначала программа считывает число методом nextInt(), то в остатке будет пустая строка. 
// Она и будет возвращена при последующем вызове метода nextLine(), а новая строка при этом считана не будет.
// https://javarush.ru/help/60447
// Вычитывать надо так
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(scanner.nextInt()); // вычитали число
		System.out.println(scanner.nextLine()); // вычитали пустую строку
	}



// Пример ввода
import java.util.Scanner;  // Работа с консолью
class MySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String 	s = sc.nextLine();
        int 	n = sc.nextInt();
        double 	d = sc.nextDouble();
		sc.close(); // Закрытие объекта
        System.out.println(s);
        System.out.format("%s", n);
        System.out.println();
    }
}
		
// Вычитывает слова и показывает их количество
import java.util.Scanner; 
class MySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        System.out.println("Вводите значения через пробел или enter. q - выход");
        while(!sc.hasNext("q")){
            String s = sc.next();
            x++;
        }
        System.out.println();
        System.out.format("Вы ввели значений - %d", x);
    }
}
		/*
		Вводите значения. q - выход
		1 2 3 4 5
		6
		7 8
		9
		q
		Вы ввели значений - 9
		*/
		
Для конструкции вида 
        while(sc.hasNext()){

Но в IDE вываливается в бесконечный цикл. Чтобы его прервать использовать Ctrl+D
	
	
// -------------------------------------------------------
// Числа 
	int foo = 1;
	int bar = 10 % 2; // (0) остаток от деления
	int zoo = foo * bar;
	int zip = foo / 3;
/*	
Если умножение и деление производятся с данными целочисленного типа. то и результат будет целочисленным, а в случае работы с числами с плавающей точкой (float или double) - результат также будет числом с плавающей точкой. 
В том случае, если одно из чисел будет целочисленного типа, а второе - числом с плавающей точкой, то результат также будет числом с плавающей точкой. Это особенно важно в случае деления:
- если мы делим одно число типа int на другое, также типа int, то это будет целочисленное деление. К примеру, если разделить 15 на 4, результатом будет 3.
- если одно или оба числа имеют тип float или double, то результатом будет число с плавающей точкой:

15 / 4 = 3;
15.0 / 4 = 3.75;
15 / 4.0 = 3.75;
15.0 / 4.0 = 3.75;

15 / 3 = 5;
15.0 / 3 = 5.0;
15 / 3.0 = 5.0;
/**/
// -------------------------------------------------------
// Операторы
	x += y;    // То же самое, что и x = x + y;
	x -= y;    // То же самое, что и x = x - y;
	x *= y;    // То же самое, что и x = x * y;
	x /= y;    // То же самое, что и x = x / y;
	x %= y;    // То же самое, что и x = x % y;
	
	// Операторы инкримента
	int test = 5;
	++test; // test == 6
	int test = 5;
	--test; // test == 4
	
	// Существуют две формы использования инкремента (декремента) - префиксная и постфиксная.
	// В префиксной форме оператор появляется перед операндом, в то время как в постфиксной форме оператор появляется после операнда. 
	// Давайте разберёмся, как работают эти две формы.
	int x = 50;
	int y = ++x; // x == 51, y == 51
	int x = 50;
	int y = x++; // x == 51, y == 50
	
	// Побитовые операции
	int neg = ~a;  	  // byte NOT инверсия битов
	int val = a & b;  // byte AND
	int val = a | b;  // byte OR
	int val = a ^ b;  // byte XOR
	int val = a >> b;  // byte сдвиги
	int val = a >>> b;  // byte 
	int val = a << b;  // byte
	// короче
	a &= b; // a = a & b;
	a >>>= b; // a = a >>> b;
	a <<= b; // a = a << b;
	
// Приоритеты операторов
/*
постфиксные: expr++ expr--
﻿унарные: ++expr --expr +expr -expr ~ !
мультипликативные: * / %
аддитивные: + -
сдвиги: << >> >>>
сравнения: < > <= >= instanceof
равенство: == !=
побитовое И: &
побитовое исключительное ИЛИ: ^
побитовое ИЛИ: |
логическое И: &&
логическое ИЛИ: ||
тернарный: ? :
присваивания: = += -= *= /= %= &= ^= |= <<= >>= >>>=
/**/
	// Math
	x = Math.abs(y); // -5 > 5 и  5 > 5
	z = Math.pow(5, 2);	// 25.0 - Возведение в степень
	z = Math.exp(2);	// E в степени (число Эйлера -  2,71828...) https://ru.wikipedia.org/wiki/E_(%D1%87%D0%B8%D1%81%D0%BB%D0%BE)
	A = Math.round(25.364789);    // 25
	

	Math.E    // 2.7182818284...
	Math.PI   // 3.1415926535...
		
	Math.sin(x) - возвращает синус угла, равного х радиан.
	Math.cos(x) - возвращает косинус угла, равного х радиан.
	Math.tan(x) - возвращает тангенс угла, равного х радиан.
	Math.toDegrees(x) - переводит угол из радиан в градусы.
	Math.toRadians(x) - переводит угол из градусов в радианы.
	
	Math.ceil(25.364789));    // 26.0  - // округляет  до ближайшего большего целого +бесконечность
	Math.ceil(-25.364789));    // -25.0
	Math.floor(25.364789));    	// 25.0
	Math.floor(-25.364789));    	// 26.0
	
	// Округление (способ имеет низкую точность из-за погрешностей хранения в памяти компьютера чисел типа double)
	double x = 25.364789;
	int n = 3;     // количество знаков после запятой
	double scale = Math.pow(10, n);
	System.out.println(Math.round(x * scale) / scale);    // 25.365
	
	// Подрезка
	double x = 25.364789;
	String formatted = String.format("%.3f", x);
	System.out.println(formatted);    // 25.365
	
	// Сравнение вещ. чисел
	// 0.1 + 0.1 x9 <> 1 - Нужно сравнить разность чисел с какой-то маленькой дельтов
    return Math.abs((a + b) - c) < 1E-4; // 0,0001

	
// -------------------------------------------------------
// BigInteger / Short 

	BigInteger bigValue = BigInteger.valueOf(123);
	Short shortVal = Integer.valueOf(2022).shortValue();
  
	// Convert int to short in Java
	//   https://simplesolution.dev/java-convert-int-to-short/




// -------------------------------------------------------
// Char
	char a, b;
	a = 80;
	b = 'J'; // - Кавычки в char одинарные !!!!
	System.out.println(a); // P
	System.out.println(b); // J
	char a = "\t";	// таб
	char a = "\n";	// перевод строки
	char a = "\r";	// возврат каретки
	char a = "\'"; 	//  '
	char a = "\\"; 	// "\" 
	char a = "03A9"; 	//  unicode омега
	// В Джава все литералы хранятся в UTF-16
	
	System.out.println('a' + 'b'); // 195 // Соединит не два чара а сложит два числа - коды символов
// -------------------------------------------------------
// Даты

// Class Date (java.util)
//   https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
// Class Calendar
//   https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html
// How to Get Current Date and Time in Java
//   https://stackabuse.com/how-to-get-current-date-and-time-in-java/

	Date dt = Date.valueOf(LocalDate.now());
	
	
	
	SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
	Date date = new Date(System.currentTimeMillis());
	System.out.println(formatter.format(date));
	// 2020-02-05 at 10:11:33 UTC
	
	Date date = new Date(); // This object contains the current date value
	
	// We can format this date easily:
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	System.out.println(formatter.format(date));
	// And running this piece of code would yield:
	// 05-02-2020 10:12:46
	
	// Getting the current date and time is really easy using a calendar:
	Calendar calendar = Calendar.getInstance(); // Returns instance with current date and time set
	// Again, we can easily format this:
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	System.out.println(formatter.format(calendar.getTime()));
	
	LocalDate date = LocalDate.now(); // Gets the current date
	// This time around, instead of initializing a new object, we're calling the static method now() which returns the current date according to the system clock, with the default time-zone.
	// We can format this object:
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	System.out.println(date.format(formatter));
	
	
	// 
	import java.sql.Date;  
	import java.time.LocalDate;  
	  
	public class JavaSQLDateValueOfExample_1 {  
		public static void main(String [] args)  
		{  
			long ctm=System.currentTimeMillis();  
				Date d= new Date(ctm);  
				LocalDate localDate = d.toLocalDate();  
				System.out.println("Value of Local Date: "+localDate);  
				Date sqldate = Date.valueOf(localDate);  
				System.out.println("Value of SQL Date: "+sqldate);  
				}  
	}  
	
// other

	// Create an instance of SimpleDateFormat used for formatting 
	// the string representation of date (month/day/year)
	DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

	// Get the date today using Calendar object.
	Date today = Calendar.getInstance().getTime();        
	// Using DateFormat format method we can create a string 
	// representation of a date with the defined format.
	String reportDate = df.format(today);

	// Print what date is today!
	System.out.println("Report Date: " + reportDate);

// -------------------------------------------------------
// Строки 

// Это ссылочный тип

// Equals и сравнение строк
//   https://javarush.ru/groups/posts/equals-java-sravnenie-strok

// Строка в Java является неизменяемым типом. То есть, чтобы изменить переменную типа String, нужно создать новый объект, а старый при этом уничтожается. Для работы со строками, которые всё же нужно менять, существуют дополнительные классы, такие, как StringBuilder. Такое видимое неудобство компенсируется повышением скорости обработки тех строк, которые не нужно менять.
// Количество символов в строке называется её длиной. Индексация (нумерация) начинается с 0. 

	String abc = "aaaa" + "123";
	String abc = "aa\"aa";
	// \" - Эскейпинг кавычки
	// \n - Новая строка

	String name;
	name = "Ivan";	
	
// Конкантенация
	int x = 10, y = 15;
	System.out.println(x + 1 + " не равно " + y);   //11 не равно 15
	System.out.println(x + " не равно " + y + 1);   //10 не равно 151 - !!!!
	System.out.println(x + " не равно " + (y + 1)); //10 не равно 16
	// В последней строке выражение у + 1 заключено в скобки, поэтому имеет высший приоритет исполнения. Сначала вычисляется результат сложения, и лишь затем происходит приведение к строчному типу.

// Функции строк
	String word = "Java is strong";
	int x = word.length(); //14 Длинна
	
	String word = "abracadabra"; // Получение индекса элемента в строке.
	int x = word.indexOf('b'); // 1
	
	char letter_0 = word.charAt(0); // Получение элемента строки по его индексу.
	System.out.println(letter_0); // a
	
	// СРАВНЕНИЕ СТРОК 
	// if (str == "123") Не будет работать!!!!
	String str = "asd";
	if (str.equals("123")) ...
	if (str.equalsIgnoreCase("asdфыв")) ...
	
	// Подстроки
	String str = "Добро пожаловать в мир Java!";
	System.out.println(str.substring(6));         //пожаловать в мир Java!
	System.out.println(str.substring(6, 15));     //пожаловат
	// Замена
	System.out.println(str.replace('о', 'А')); //ДАбрА пАжалАвать в мир Java! - тут char!!!
	// Регистры
	System.out.println(s.toLowerCase()); // i'll be back
	System.out.println(s.toUpperCase()); // I'LL BE BACK
	
	// На пустоту - isEmpty
	String str1 = "Hubba Bubba";
	String str2 = "   ";
	String str3 = "";
	boolean value1 = str1.isEmpty(); // false
	boolean value2 = str2.isEmpty(); // false
	boolean value3 = str3.isEmpty(); // true
	
	// Проверка на содержание
	String str1 = "One Two Three";
	String str2 = "Two";
	boolean value1 = str1.contains(str2); // true
	
	
	// Преобразование в строку
	// #1
	int num = 12345;                      // Это число типа int
	String str1 = Integer.toString(num);  // Это строка
	System.out.println(str1);           // 12345
	// #2
	String str = String.valueOf(num); // Преобразование числа в строку
	
	// Java String to Int – How to Convert a String to an Integer
	//   https://www.freecodecamp.org/news/java-string-to-int-how-to-convert-a-string-to-an-integer/
	// Check If a String Is Numeric in Java
	//   https://www.baeldung.com/java-check-string-number
	
	// Преобразование строки в число.
	String str = "12345";
	Integer num = Integer.valueOf(str);  // 12345 num - объект класса Integer
	// #2
	int    num = Integer.parseInt(str);      //num - переменная типа int
	double dbl = Double.parseDouble(str);    //dbl - переменная типа double
	
	
	
    // Форматирование строк
	System.out.format("%02d:%02d:%02d",1,2,3);  			// 01:02:03
	String str = String.format("%02d:%02d:%02d",1,2,3);		// 01:02:03
	// в форматтер передается число из двух цифр, а если цифра одна, то спереди дописывается ноль
	
	String formatted = String.format("%.3f", x); // 25.365 подрезка
	
	%f - число с плавающей точкой
	%s
	%d
	
		
	System.out.format("%s, ваш возраст %d лет.","Владимир", 40); 	// Владимир, ваш возраст 40 лет.
	// # 3
	System.out.printf("%s %s",-(b/a),c/a);
	
	// ОБРАБОТКА NULL
	// Используйте Java 8 Optional (фильтр не требуется):
	//   https://coderoad.ru/31412294/Java-%D0%BF%D1%80%D0%BE%D0%B2%D0%B5%D1%80%D0%B8%D1%82%D1%8C-%D0%BD%D0%B5-Null-%D0%BF%D1%83%D1%81%D1%82%D0%BE%D0%B9-%D0%B5%D1%89%D0%B5-%D0%BF%D1%80%D0%B8%D1%81%D0%B2%D0%BE%D0%B8%D1%82%D1%8C-%D0%B7%D0%BD%D0%B0%D1%87%D0%B5%D0%BD%D0%B8%D0%B5-%D0%BF%D0%BE-%D1%83%D0%BC%D0%BE%D0%BB%D1%87%D0%B0%D0%BD%D0%B8%D1%8E
	
	String str = Optional.ofNullable(someString).orElse("default");
	String str = Optional.ofNullable(System.getProperty("property")).orElse(defaultValue);
}
	
// -------------------------------------------------------
// Перечисления (enum) 
// ссылочный тип


// Java для начинающих. Урок 48: Enum (Перечисления).
//   https://www.youtube.com/watch?v=GOzNp1YAm5w&ab_channel=alishev

	public enum DayOfWeek { 
	//  public static final - эквивалентно
		MONDAY, TUESDAY, ..., SUNDAY;
		
		int aaa; // Поля ссылочного типа
		
		// методы перечисления
		int getDay() {
			return ...
		}
		// Тут можно сделать конструктор
	}
	
	// Доступны методы
	DayOfWeek.values()  // массив возможных значений
	DayOfWeek.name()	// -> "MONDAY" - как в исходном коде
	DayOfWeek.ordinal()	// -> 0 порядковый номер элемента
	
	// Базовым типом enum может быть только int
	
	
// -------------------------------------------------------
// Условия
	// == - =
	// != - NOT = 
	// && - AND сокращенная схема (если левая половина false - то вторую половину не вычисляют)
	// || - OR  сокращенная схема
	// &  - AND полная схема
	// |  - OR  полная схема
	// ^  - Исключающее или
	// &=
	// |=
	// ^=
	boolean foo &= bar
	boolean foo = foo & bar // полная схема вычислений
	
// Порядок условий
// Обработка логических выражений производится в соответствии с законами математической (булевой) логики. 
// 1. Сначала выполняются действия в круглых скобках.
// 2. Затем выполняются операции логического отрицания (!)
// 3. Далее выполняются операции логического И (&&)
// 4. В последнюю очередь выполняются операции логического ИЛИ (||).

	
	if (a == 3) {
		System.out.println("A is 3");
	} else {	
		System.out.println("A is not 3");
	}
	
// SWITCH
// Оператор switch является чувствительным к регистру.
// В switch используется метод String.equals() для сравнивания переданного на вход значения с существующими значениями.
// Обязательно проверяйте переданную в switch строку на null, иначе можно получить NullPointerException.
// Согласно Java 7 документации по строкам в switch, компилятор Java генерирует более эффективный байт-код, чем для нескольких if-else.
// Прежде чем использовать switch в своих программах или проектах, убедитесь, что проект использует Java 7 и выше — иначе будет выброшено исключение.

	// Тернарное сравнение
	System.out.println((a == 3) ? "A is 3" : "A is not 3");
	
	switch (выражение) {
		case  value1:
			//Группа команд
			break; // Выход из кейса. Если не добавить - выполнится и блок value2
		case value2 :
			//Группа команд
			break; // Если не добавить - выполнится и блок default
		
		... //Можно вставить столько проверяемых значений, сколько нужно

		default: //Необязательно
		   //Группа команд, исполняемая, если значение выражения не рано ни одному из случаев
	}
		
	// Пример
	int n = 10;
	switch (n) {
		case  5:
			System.out.println("5");
		case 10 :
			System.out.println("10");
		case 15 :
			System.out.println("15");
			break; // !!! Если не добавить - выполнится и блок 20 default
		case 20 :
			System.out.println("20");
		default: 
			System.out.println("default");
	}
	/*
	10
	15 !!!!!!
	*/
	
// -------------------------------------------------------
// Цикл

	// for
	// от 0 до 9
	for (int i = 0; i < 10; i++) {
		System.out.println(i);
	}
	
	int i 		// Инициализация: действие, которое выполняется только один раз в начале работы цикла. 
				// Обычно здесь задаётся внутренняя переменная, которая служит счётчиком количества повторений.
	break; 		// немедленно прерывает работу цикла (исполнение программы переходит к командам, расположенным после цикла)
	continue;	// завершает текущую итерацию (цикл переходит к исполнению следующей итерации)
	
	for (int i = 5; i < 10; i += 2) {
	for (int i = 5; i > -1; i--) {
	for (int i = 1; i < 10;) { // Бесконечный цикл
	
	// Метки для циклов
	outer:
	for (int i = 5; i < 10; i += 2) {
		for (int i = 5; i < 10; i += 2) {
			break outer; // разорвать внешний цикл
		}
	}
			
	// while
	int x = 3;
	while (x > 0) {
		System.out.println(x);
		x--;
	}
	
	// do while
	int x = 1;
	do {
		System.out.println(x);
		x++;
	} while (x < 5);
		
// -------------------------------------------------------
// Массивы

// Массивы в Java
//   https://javarush.ru/groups/posts/massivy-java

// Class Arrays (Oracle)
//   https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Arrays.html

// Импорт спецклассов
// import java.util.Arrays;


	// Инициализация
	int[]		arrayNum = new int[10]; // Массив из 10 элементов
	String[]	arrayStr = new String[10]; // Массив из 10 элементов
	int[]		arrayFoo = new int[]{1,2,3,4}; // Массив  c инициализацией
	String[] 	seasons  = {"Winter", "Spring", "Summer", "Autumn"}; // оператор new можно опустить
	String[] 	names = {"A", "B", "C", "D"};
	String 		names[] = {"A", "B", "C", "D"}; // Также возможна инициализация массива записью квадратных скобок после имени массива, однако такой способ используется гораздо реже.
	
	arrayNum[0] = 150;
	arrayStr[5] = "abc";
	int a = arrayFoo.length;  // length у массива - это не метод, а атрибут, т. е. свойство данного массива, поэтому вызывается без круглых скобок в конце.
	
	// При объявлении массива без указания значений элементов он будет заполнен значениями по умолчанию. 
	// Для int это 0, для float и double — 0.0, для char — \0, для boolean — false, а для String и любого другого класса это null.
	
	
	// перебор
	String[] numbers = {"one", "two", "three", "four", "five", "forty two"};
	for (int i=0; i < numbers.length; i++) {
		if (numbers[i].charAt(0) == 'f') {
			System.out.println(numbers[i]);
		}
	} 
	// перебор - enhanced loop
	// Важное отличие заключается в том, что в первом варианте мы работаем непосредственно со значениями элементов массива, а во втором - с их копиями:
	String[] numbers = {"one", "two", "three", "four", "five", "forty two"};
	for (String s: numbers) {
		System.out.println(s); //На новой строке
		if (s.charAt(0) == 'f') {
			System.out.println(s);
			s = "deleted";
		}
	} 
	System.out.println(numbers1[3]);    // four 

	// Формирование массива через split
	// При разрезании получается массив именно из элементов типа String. 
	// Попытка разрезать строку вида "123 16 456 852" и записать элементы в массив типа int вызовет ошибку.
	String str = "I'll be back";
	String[] words = str.split(" ");
	for (String word: words) {
		System.out.println(word); //На новой строке
	}
	//  I'll	/ be	/ back

// Класс Arrays
	
	// toString
	int[] array = {1, 2, 3, 4, 5}; 
	System.out.println(Arrays.toString(array));       // [1, 2, 3, 4, 5]
	
	// sort()
	int[] array = {5, 10, 15, 4, 1};
	Arrays.sort(array); 	// [1, 4, 5, 10, 15]
	Arrays.sort(array, 3, 7); //  только элементы массива с индексами от 3 до 6 (правая граница не входит в отрезок сортировки).
	
	String[] array = {"one", "two", "three", "four"};
	Arrays.sort(array);            // сортировка производится в лексикографическом порядке.  
	System.out.println(Arrays.toString(array));    // [four, one, three, two]
	
	// equals()
	int[] numbers1 = {1, 2, 3};
	int[] numbers2 = {1, 2, 3};	
	System.out.println(Arrays.equals(numbers1, numbers2));    // true
	
	// deepEquals
    System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));
	
	// copyOf()
	int[] numbers1 = {1, 2, 3, 4, 5};
	int[] numbers3 = Arrays.copyOf(numbers1, 3);    // [1, 2, 3]
	
	// copyOfRange()
	int[] numbers1 = {2, 4, 6, 8, 10, 12, 14, 16};
	int [] numbers2 = Arrays.copyOfRange(numbers1, 2, 5);
	System.out.println(Arrays.toString(numbers2));    // [6, 8, 10]

	
	// ----------
	// Сравнение многомерных массивов по содержанию
	int[][]arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};


	// ----------
	// Копирование массива
	// Сортировка

	int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
	int element = -5;

	int[] sortArr = Arrays.copyOf(array, array.length); // Копирование в новый массив
	Arrays.sort(sortArr); // Сортировка эдементов
	System.out.println(Arrays.toString(sortArr));
	System.out.println((Arrays.binarySearch(sortArr, element) < 0 ? false : true)); // Бинарный поиск
	
	// ----------
	// Многомерный массив
	int[][] sample = {{1, 2, 3}, {4, 5, 6}};
	String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
	int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

	System.out.println(Arrays.deepToString(strings)); // Вывод многомерного массива
	System.out.println(Arrays.deepToString(ints));
	
	// Элементы многомерного массива могут быть разной длины:
	int[][] myArr = {{1, 2, 3}, {4}, {5, 6, 7, 8}};
	System.out.println(myArr[1][0]); // 4
  

// -------------------------------------------------------
// Map - Ассоциативный массив

// HashMap в Java— что за карта такая?
//   https://javarush.ru/groups/posts/1940-klass-hashmap-
// Java Map
//   http://tutorials.jenkov.com/java-collections/map.html

// -------------------------------------------------------
// Пакеты

// java.lang
	Class Math
	https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

	import java.util.*;
	import java.util.Arrays;	

// org/stepic/java/HelloWorld.java
	package org.stepic.java;
		public class HelloWorld {...}
		
// Импорты
	import java.util.*;
	import java.lang.*; // неявный импорт

// Стандартные пакеты
	import java.lang
	import java.io;
	import java.nio;
	import java.math;
	import java.time;
	import java.util;
	import java.util.regex;
	import javax.xml;
	...
	
	com.oracle // прикладные пакеты JRE. Не использовать/ непереносимые, только JRE от Oracle
	com.sun

// импорт статических методов. 
// После может быть вызван без префикса sqrt(4); / out.println("foo");
	import static java.lang.Math.sqrt;
	import static java.lang.System.out;
	import static java.lang.Math.*; // импорт всех полей и методов из класса 

// Название пользовательского класса
org.vladshestakov.HomeLibary

	
-------------------------------------------------------
// Объявления класса

public final class Integer {
	// final - от класса нельзя наследоваться
	private final  int value; // Поле (свойство) класса
	// final - присвоить свойство можно только один раз
	
	// Конструктор
	public Integer (int value) {
		this.value = value;
		// this - (опционально) доступ к полю класса, 
		// чтобы исключить использование переменной с тем же именем
	}
	
	// Пример запрета конструктора - private
	private Integer() {}
	
	// Деструкторов нет, разработчики делают сами себе метод close
	public close() {}
	
}

	public static void main() {}
	// static - метод может вызываться без создания экземпляра класса
	// видит только другие статические объекты
	
	// Константы
	public static final String DEFAULT_DELIMITER = ", "; // Разделитель даных по-умолчанию
    public static final String DEFAULT_QUOTE = "'"; // Кавычка строк по-умолчанию


	// Перегрузка
	// (необязательный) Override - Проверка компилятором на верность наследования
	@Override
	public class SomeClass(char c) extends AbstractSomeClass {
		// extends - признак наследования класса	
		super SomeClass('a'); // Вызов конструктора родительского класса
	}
	// Если extends опущен подразумевается extends Object
	
	if (myObject instanceof Object) {} //Проверка на принадлежность объекта к классу
	
	
// -------------------------------------------------------
// Модификаторы доступа
	private		объект виден только внутри себя
	protected	объект виден только внутри себя и у потомков
	public  	объект виден отовсюду

	static		объект доступен даже без объявления экземпляра объекта
	final		Признак константы. Невозможность изменить объект (кроме содержимого массивов, этоже ссылки)
	native		Значит исходники не представлены, они в исходном коде

	void		Отсутствие значения
	throws		Список объектов типа Exception


// -------------------------------------------------------
// Методы пакета
	// Главный метод класса
    public static void main(String[] args) {
        System.out.println("Hello, World!");
		// Если неудачный запуск 
		System.exit(-1); // -1 - код ошибки
	} 
	
    	
	// Процедура
    public static void ShowStr(String text){
        System.out.println(text);
		// return; // немедленный выход
    }
	
	// Функция
    public static int PromptInt(String prompt) {
        Scanner console = new Scanner(System.in);
        System.out.print(prompt);
        return console.nextInt(); // Выход и возврат значения
    }
	
	// Функция с обработкой исключений
	static void loadProperties(Properties p)throws IOException {} 
	
	
	
	
// -------------------------------------------------------
// Исключения
    static void loadProperties(Properties p)throws IOException { // Функция с обработкой исключений
        try {
            // load array of users
            accounts = fetchArrayFromPropFile("accs", props);
        } catch (Exception ex) {
            accounts = ACCOUNTS_DEF;
        }
        System.out.println("accounts - " + Arrays.deepToString(accounts));
	}
	
// How to rethrow an exception in Java?
//   https://www.tutorialspoint.com/how-to-rethrow-an-exception-in-java

		try {
			...
		} catch (Exception ex){
			...
			throw ex; // rethrow
		}
	
// -------------------------------------------------------
// Порядок нициализации классов

// Любой блок инициализации, присутствующий в классе, выполняется перед конструктором.
// Вызов метода Java без имени
//   https://coderoad.ru/13699075/%D0%92%D1%8B%D0%B7%D0%BE%D0%B2-%D0%BC%D0%B5%D1%82%D0%BE%D0%B4%D0%B0-Java-%D0%B1%D0%B5%D0%B7-%D0%B8%D0%BC%D0%B5%D0%BD%D0%B8

	public class Sequence {
		
		// Конструктор для класса, выполняется третьим.
		Sequence() {
			System.out.print("c ");
		}

		// Initializer block - Блок инициализации класса, общий для всех объектов(конструкторов) класса
		//   В классе может быть несколько блоков инициализации, 
		//   и в этом случае они выполняются в той последовательности, в которой они появляются в классе.
		//   non-static будет вызываться каждый раз, когда вы создаете новый экземпляр,
		//   и он будет вызываться непосредственно перед конструктором.
		{
			System.out.print("y ");
		}

		public static void main(String[] args) {
			new Sequence().go();
		}

		// лишь метод экземпляра, связанный с объектами
		void go() {
			System.out.print("g ");
		}

		// Static initializer - статический блок инициализации класса - вызывается при загрузке класса
		//   выполняются только один раз, когда класс загружен и инициализирован JRE
		static {
			System.out.print("x ");
		}
	}
	
	// Выполнит - x y c g

// -------------------------------------------------------
// Аннотации
//   https://ru.wikipedia.org/wiki/%D0%90%D0%BD%D0%BD%D0%BE%D1%82%D0%B0%D1%86%D0%B8%D1%8F_(Java)

// заводятся программистом

	@Deprecated
	public static boolean isJavaLetter(char c) {}
	// метод устарел и не рекомендуется, будет Warning компилятора
	// в javadoc предлагается замена
	
	// SuppressWarnings 
	@SuppressWarnings("unchecked")
	public static final Class<Character> TYPE ...
	// Временно отключает предупреждения компилятора
	// unchecked - какие именно предупреждения отключить
	// Uses unchecked or unsafe operations. recompile with -xlint:unchecked for details
	//   https://java2blog.com/uses-unchecked-or-unsafe-operations-recompile-with-xlintunchecked-for-details/
	// What causes javac to issue the "uses unchecked or unsafe operations" warning
	//   https://stackoverflow.com/questions/197986/what-causes-javac-to-issue-the-uses-unchecked-or-unsafe-operations-warning
	
	
	// Объявленные аннотации
	public @interface SuppressWarnings {
		String[] value();
	}
	
	@Override
	public boolean SomeClass(char c) extends AbstractSomeClass {}
	// extends - признак наследования класса
	// (необязательный) Override - Проверка компилятором на верность наследования
	
	
// -------------------------------------------------------
// Maven

// Переходим на Maven
//   Источник <https://java-course.ru/begin/maven_first/> 

// Maven и java
//   https://java-master.com/maven-%d0%b8-java/

// -------------------------------------------------------
// Java DATABASE / JDBC

// Руководство Java JDBC
// https://betacode.net/10167/java-jdbc

// Oracle JDBC Download 
//   https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html

// SQL Injection Prevention Cheat Sheet
//   https://cheatsheetseries.owasp.org/cheatsheets/SQL_Injection_Prevention_Cheat_Sheet.html

// Oracle Java JDBC: Get Primary Key of Inserted record
//   https://www.viralpatel.net/oracle-java-jdbc-get-primary-key-insert-sql/

// Базы данных на Java — введение
// 	 https://java-course.ru/begin/database01/
// Возможности JDBC — второй этап
//   https://java-course.ru/begin/database02/
// JAR-файлы — что это такое ?
//   https://java-course.ru/begin/jar/

// -------------------------------------------------------
// HIBERNATE
// Hibernate одна из самых популярных открытых реализаций последней версии спецификации (JPA 2.1)
// Самый популярный ORM (Object Relational Mapping) фреймворк / библиотека для языка программирования Java, 
//   предназначенная для решения задач объектно-реляционного отображения (ORM), 
//   самая популярная реализация спецификации JPA
//   https://ru.wikipedia.org/wiki/Hibernate_(%D0%B1%D0%B8%D0%B1%D0%BB%D0%B8%D0%BE%D1%82%D0%B5%D0%BA%D0%B0)
// 	 https://www.hibernate.org
//   HIBERNATE 5.5.6 (4 августа 2021)

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

// DAO - Data Access Object
//   https://ru.wikipedia.org/wiki/Data_Access_Object

// CRUD -  акроним, обозначающий четыре базовые функции, используемые при работе с базами данных[1]: создание (англ. create), чтение (read), модификация (update), удаление (delete).
//   https://ru.wikipedia.org/wiki/CRUD
// **** Разница между JDBC, JPA, Hibernate, Spring Data JPA
//   https://java-master.com/%D1%80%D0%B0%D0%B7%D0%BD%D0%B8%D1%86%D0%B0-%D0%BC%D0%B5%D0%B6%D0%B4%D1%83-jdbc-jpa-hibernate-spring-data-jpa/

// Основы Hibernate (2008) (3оечка)
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
// SPRING
// Spring Framework - Spring FrameworkВикипедия  site:star-wiki.ru
//   https://star-wiki.ru/wiki/Spring_Framework

// org.springframework:spring-webmvc:5.3.15	
//   https://search.maven.org/artifact/org.springframework/spring-webmvc/5.3.15/jar
 


// ***** Что нужно знать о Spring: история появления, ключевые модули, сравнение с Java EE
//   https://javarush.ru/groups/posts/3546-chto-nuzhno-znatjh-o-spring-istorija-pojavlenija-kljuchevihe-moduli-sravnenie-s-java-ee

// Spring framework

	core 			— базовый функционал, реализующий понятия IoC (inversion of control) и DI (dependency injection);
	AOP 			— Aspect-Oriented Programming — аспектно-ориентированое программирование, направленное на реализацию сквозной логики;
	MVC и WebFlux 	— фреймворки для веб взаимодествия;
	JDBC, ORM 		— технологии взаимодействия с базами данных;
	Test 			— функционал для прозрачного, несложного тестирования данных Spring контейнера;
	SpEL 			— Spring Expression Language — язык выражений Spring;

// Spring Boot
//   Упрощает создание приложений на основе Spring
//   https://javarush.ru/groups/posts/3092-spring-ehto-nestrashno

// Spring Data
//   Значительно упрощает использование технологий доступа к данным, реляционных и нереляционных баз данных

// Spring Cloud
// Spring Security
// Spring GraphQL
// Spring Session
// Spring Integration
// Spring REST
// Spring Web Flow
Spring WebServices
Spring HATEOAS
Spring Batch
Spring AMQP
Spring for Apache Kafka
Spring CredHub
Spring FLO
Spring LDAP
Spring Roo
Spring Shell
Spring Statemachine
Spring Vault


// Spring — это не страшно, или как стартовать WEB-сервер со Spring Boot за 5 минут
//   https://javarush.ru/groups/posts/3092-spring-ehto-nestrashno

// Spring — это не страшно, или как подключить базу данных для студенческого проекта за 5 минут
//   https://javarush.ru/groups/posts/3093-spring-ehto-nestrashno-ili-kak-podkljuchitjh-bazu-dannihkh-dlja-studencheskogo-proekta-za-5-min

// -------------------------------------------------------
// Spring JPA
// - библиотека, которая добавляет дополнительный уровень абстракции поверх ORM реализации JPA
// По-умолчанию Spring Data JPA использует Hibernate, в качестве ORM провайдера (чтобы выполнять запросы)

// Spring Data JPA [OFFICIAL]
//   https://spring.io/projects/spring-data-jpa

// Spring Data JPA
//   https://habr.com/ru/post/435114/

// Что нужно знать о Spring: история появления, ключевые модули, сравнение с Java EE
//   https://javarush.ru/groups/posts/3546-chto-nuzhno-znatjh-o-spring-istorija-pojavlenija-kljuchevihe-moduli-sravnenie-s-java-ee


// Spring Data Jdbc/R2dbc - Альтернатива JPA (imho - https://habr.com/ru/post/551902/)
//   https://docs.spring.io/spring-data/jdbc/docs/2.1.7/reference/html/#reference
// Spring Data JPA / Хабр
//   https://habr.com/ru/post/435114/
// Spring Data JPA: что такое хорошо, и что такое плохо
//   https://habr.com/ru/post/441386/
// Руководство Spring Boot и Spring Data JPA - betacode
//   https://betacode.net/11897/spring-boot-and-spring-data-jpa

// Пишем простое веб-приложение используя Spring MVC, Spring Data JPA и Hibernate
//   https://habr.com/ru/post/479286/

// Spring Boot — пример с Postgres и JPA [NR]
//   https://java-master.com/spring-boot-%d0%bf%d1%80%d0%b8%d0%bc%d0%b5%d1%80-%d1%81-postgres-%d0%b8-jpa/

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
// JSP pages
// comment
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 08.01.2022
  Time: 6:49
  To change this template use File | Settings | File Templates.
--%>
// description page 
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
// add tab prefix
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

// -------------------------------------------------------
// JSP ПРОБЛЕМЫ

// Передача переменных из скриплета в c:
//   How to pass java variables from scriptlets to c:when expression in jstl?
//   https://stackoverflow.com/questions/25893913/how-to-pass-java-variables-from-scriptlets-to-cwhen-expression-in-jstl

// -------------------------------------------------------
// JSP pages and MVC 

// Руководство Java JSP для начинающих
//   https://betacode.net/10263/java-jsp


// Обращение к объекту MVC
${libItem.libraryItemNo}
<p>${libItemEntities}</p>
<td>${libItem.libraryItemNo}</td>

// Передача объекта MVC
    @GetMapping(value = "/")
    public ModelAndView allLibItems() {
        List<LibItemEntity> libItemEntities = libItemEntityService.findAllLibItems();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("items");
        modelAndView.addObject("libItemList", libItemEntities);
        return modelAndView;
    }

// Код в JSP

        <%
            Random random = new Random();
			// Выводим в консоль
            System.out.println(" Random: " + random.nextBoolean());
        %>
// Код в JSP
  <%
      java.util.Date date = new java.util.Date();
  %>
  <h2>
      Now is
      <%=date.toString()%>
  </h2>
  
// -------------------------------------------------------
// JSTL (JavaServer Pages Standard Tag Library) Стандартная Библиотека Тегов JSP
// Подключение JSTL core

// pom.xml
<dependency>
      <groupId>jstl</groupId>
      <artifactId>jstl</artifactId>
      <version>1.2</version>
</dependency>

// jsp
// тут подключается JSTL core, которая включает основные теги создания циклов, условий и т.д.
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 


// Цикл c:forEach
        <c:forEach var="libItem" items="${libItemList}">
            <tr>
                <td>${libItem.libraryItemNo}</td>
                <td>${libItem.libraryNo}</td>
                <td>${libItem.itemName}</td>
                <td>${libItem.itemAuthor}</td>
                <td>${libItem.genre}</td>
                <td>${libItem.itemDesc}</td>
                <td>${libItem.itemYear}</td>
                <td>${libItem.publisherName}</td>
                <td>${libItem.pages}</td>
                <td>${libItem.addingDate}</td>
                <td>
                    <a href="/edit/${libItem.libraryItemNo}">edit</a>
                    <a href="/delete/${libItem.libraryItemNo}">delete</a>
                </td>
            </tr>
        </c:forEach>
// Условия
    <c:if test="${empty libItem.itemName}">
        <c:url value="/additem" var="var"/>
    </c:if>
	
	
// -------------------------------------------------------
// ШАБЛОНЫ ПРОЕКТИРОВАНИЯ 

// Шаблон проектирования
//   https://ru.wikipedia.org/wiki/%D0%A8%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F

// DTO - Data Transfer Object
//   https://ru.wikipedia.org/wiki/DTO

// Data Access Object (DAO) 
//   создать специальную прослойку, которая будет отвечать исключительно за доступ к данным 
//   (работа с базой данных или другим механизмом хранения). 


// -------------------------------------------------------
// -------------------------------------------------------
