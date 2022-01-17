JDK-tutorial


// -------------------------------------------------------
// JDK 

// Java Downloads
//   http://www.oracle.com/technetwork/java/javase/downloads/index.html
// инструкция по установке JDK под Windows есть здесь: ﻿http://java-course.ru/begin/install-jdk/
// -------------------------------------------------------
// JAR-файлы — что это такое ?
//   https://java-course.ru/begin/jar/
// -------------------------------------------------------
// Java virtual machine

// Режимы работы 
* интерпретация / 20x медленнее
* JIT код (предварительная компиляция байткода в язык процессора)
* 


// -------------------------------------------------------
// модули
java 	- виртуальная машина
javac	- компилятор
javap	- Просмотр байткода
jar		- упаковщик JAR

// -------------------------------------------------------
// Просмотр байткода

// Просмотр файла класса
javap -v HelloWorld.class

// -------------------------------------------------------
// Компилирование программы

// How to Use the javac Command
//   https://www.dummies.com/article/technology/programming-web-design/java/how-to-use-the-javac-command-172116
// как включить библиотеки в java без использования IDE (+ANT)
//   https://coderoad.ru/5112607/%D0%BA%D0%B0%D0%BA-%D0%B2%D0%BA%D0%BB%D1%8E%D1%87%D0%B8%D1%82%D1%8C-%D0%B1%D0%B8%D0%B1%D0%BB%D0%B8%D0%BE%D1%82%D0%B5%D0%BA%D0%B8-%D0%B2-java-%D0%B1%D0%B5%D0%B7-%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F-IDE
// Java。Hello World 6等级。:Java. Hello world в 6-й степени. (5+)
//   Внешние либы +ручной manifest
//   https://stackoverflow.editcode.net/thread-119505-1-1.html

// Работа с Java в командной строке
//   https://habr.com/ru/post/125210/
// Компиляция в Java
//   https://javarush.ru/groups/posts/2318-kompiljacija-v-java
// Компиляция и запуск приложения из командной строки
// +video 
//   https://www.examclouds.com/ru/java/java-core-russian/java-javac

// -------------------------------------------------------



// Версия компилятора
javac -version
// javac 1.8.0

%path% Должен содержать путь к каталогу JDK (javac)
echo %PATH%

// Компиляция
javac HelloWorld.java 
javac HelloWorld.java Function.java //несколько файлов
// появиться HelloWorld.class

// Просмотр файла класса
javap -v HelloWorld.class

// компиляция с добавлением внешней JAR библиотеки 
javac -classpath lib.jar HelloWorld.java 
// Запуск с добавлением внешней библиотеки JAR
java -classpath lib.jar;hw.jar HelloWorld.java 
java -classpath lib.jar:hw.jar HelloWorld.java 
// !!разделители библиотек ;-windows :-linux
// [INFO] Вы не можете использовать-cp и -jar одновременно. При использовании -jar-cp будет игнорироваться
//   https://coderoad.ru/25663882/Classpath-%D0%BF%D0%BE%D1%80%D1%8F%D0%B4%D0%BE%D0%BA-%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F-%D0%BC%D0%B0%D0%BD%D0%B8%D1%84%D0%B5%D1%81%D1%82%D0%B0


// -------------------------------------------------------
// javac's -Xlint Options
//   https://www.infoworld.com/article/2073587/javac-s--xlint-options.html

javac -Xlint:unchecked -encoding utf8 -d out\classes -cp .\lib\* @sources_list.txt 2> _build_errors.log
javac -Xlint:deprecation -encoding utf8 -d out\classes -cp .\lib\* @sources_list.txt 2> _build_errors.log

// -------------------------------------------------------
// Компилирование программы JAR

// упаковать программу в JAR
jar cfe hw.jar HelloWorld HelloWorld.class
jar cfe hw.jar HelloWorld HelloWorld.class Function.class 
// hw.jar 	- имя архива
// HelloWorld	- имя класса
// HelloWorld.class;Function.class 	- все файлы для архива
// Будет создан файл JAR
// Будет добавлен манифест, с информацией о главном классе

// просмотреть архив JAR
jar tf hw.jar 

// распаковать архив JAR
jar xf hw.jar 


// -------------------------------------------------------
// Запуск приложения
// указать имя класса!
java HelloWorld 
// настроить путь к папке с классами -classpath classes_dir 
java -classpath classes_dir HelloWorld 

// запустить программу из JAR
// с манифестом
java -jar hw.jar 
// Без манифеста
java -classpath hw.jar HelloWorld
