Android-tutorial.md

// -------------------------------------------------------
[NR] - Не читал
[MUST READ] - Требуется к прочтению
[RTFM] - Официальные спецификации
[TODO] - ОСТАНОВКА В ЧТЕНИИ

-------------------------------------------------------
# Ссылки

**Android Material Design для начинающих**
	https://devcolibri.com/course/android-material-design-%D0%B4%D0%BB%D1%8F-%D0%BD%D0%B0%D1%87%D0%B8%D0%BD%D0%B0%D1%8E%D1%89%D0%B8%D1%85

-------------------------------------------------------
Android
   https://ru.wikipedia.org/wiki/Android


// Android SDK
//   https://ru.wikipedia.org/wiki/Android_SDK
// — универсальное средство разработки мобильных приложений для операционной системы Android. 
В качестве редактора кода до конца 2014 года использовался IDE Eclipse, дополненный плагином «Android Development Tools» (ADT). 
В 2015 году вышел комплект разработки Android Studio (разработан Google с применением технологий IDE IntelliJ), ставший основным.

// Android Studio
//   https://ru.wikipedia.org/wiki/Android_Studio

// -------------------------------------------------------
// Программирование под Андроид на Java (Android Studio) / 18.10.2021
//   https://metanit.com/java/android

// С ЧЕГО НАЧАТЬ РАЗРАБОТКУ АНДРОИД ПРИЛОЖЕНИЯ? / 27 января 2022
//   https://infoshell.ru/blog/start-v-android-programmirovanii/

// Использование простой базы данных SQLite в Android-приложении / 2022
//   https://www.internet-technologies.ru/articles/ispolzovanie-prostoy-bazy-dannyh-sqlite-v-android-prilozhenii.html
// -------------------------------------------------------
# History

**Начало работы с Android**

https://metanit.com/java/android/1.1.php

**Введение. Установка Android Studio и Android SDK**

ОС Андроид была создана разработчиком Энди Рубином (Andy Rubin) в качестве операционной системы для мобильных телефонов 
и поначалу развивалась в рамках компании Android Inc. 
Но в 2005 году Google покупает Android Inc. и начинает развивать операционную систему с новой силой. 
Android постоянно эволюционирует, и вместе с операционной системой эволюционируют средства и инструменты для разработки. 
На данный момент (октябрь 2021 года) последней версией является Android 12.0, которая вышла в октябре 2021 года:


Android Studio Dolphin | 2021.3.1 Patch 1

Кроме самой среды Android Studio для разработки также потребуется набор инструментов, который называется Android SDK. Например, если ранее Android SDK еще не было установлено, то при первом обращении к Android Studio она предложит установить ряд дополнительных инструментов, которые необходимы для разработки. Прежде всего это Android SDK и ряд дополнительных компонентов
// -------------------------------------------------------
// Android

Версия	Кодовое имя	Дата выпуска	Уровень API
12.0	12			4 октября 2021		31
11.0	11			8 сентября 2020		30
10.0	10			3 сентября 2019		29
9.0		Pie			6 августа 2018		28
8.0		Oreo		5 декабря 2017		27
8.0		Oreo		21 августа 2017		26
8.1		Nougat		4 октября 2016		25
7.0		Nougat		22 августа 2016		24
6.0		Marshmallow	5 октября 2015		23
5.1		Lollipop	9 марта 2015		22
5.0		Lollipop	3 ноября 2014		21
4.		KitKat		31 октября 2013		19

-------------------------------------------------------
Приложения Android 

Приложения Android в законченном виде представляют собой пакеты формата .apk и после установки хранятся в каталоге /data/app. 
Внутри пакет APK содержит кодовые файлы .dex (байт-код для исполнения в Dalvik), файлы ресурсов и т. п.

// -------------------------------------------------------
Minimum SDK указывается самая минимальная поддерживаемая версия SDK. 
Оставим значение по умолчанию - 
API 21: Android 5.0 (Lollipop),
// -------------------------------------------------------
Packages to install: - Android SDK Platform 32 (platforms;android-32)
	Preparing "Install Android SDK Platform 32 (revision: 1)".
	Downloading https://dl.google.com/android/repository/platform-32_r01.zip
	
-------------------------------------------------------
# Samsung S21 5G
	https://www.phonearena.com/phones/Samsung-Galaxy-S21_id11508
Model name 		- Samsung S21 5G
Model number	- SM-G991B/DS
	Android 12
	One UI 4.1
	Size:	6.2 inches
	Resolution:	2400 x 1080 pixels, 20:9 ratio, 424 PPI
	Technology:	Dynamic AMOLED

// -------------------------------------------------------
04.11.2022
```
15:44	* daemon not running; starting now at tcp:5037
15:44	* daemon started successfully
15:45	Gradle sync started
15:50	Gradle sync finished in 5 m 7 s 804 ms
15:50	Project HelloWorld application is using the following JDK 
location when running Gradle:
			C:/Program Files/Android/Android Studio/jre
			Using different JDK locations on different processes might cause Gradle to
			spawn multiple daemons, for example, by executing Gradle tasks from a terminal
			while using Android Studio.
			More info...
			Select a JDK
			Do not show this warning again
```
-------------------------------------------------------
** Cоздается один модуль - app. 
Модуль имеет три подпапки:

** manifests: 
хранит файл манифеста AndroidManifest.xml, который описывает конфигурацию приложения и определяет каждый из компонентов данного приложения.

** java: 
хранит файлы кода на языке java, которые структурированы по отдельным пакетам. Так, в папке *com.example.helloapp* (название которого было указано на этапе создания проекта) имеется по умолчанию файл *MainActivity.java* с кодом на языке Java, который представляет класс *MainActivity*, запускаемый по умолчанию при старте приложения

** res: 
содержит используемые в приложении ресурсы. Все ресурсы разбиты на подпапки.

** папка drawable 
	предназначена для хранения изображений, используемых в приложении

** папка layout 
предназначена для хранения файлов, определяющих графический интерфейс. По умолчанию здесь есть файл *activity_main.xml*, который определяет интерфейс для класса *MainActivity* в виде xml

** папки mipmap 
содержат файлы изображений, которые предназначены для создания иконки приложения при различных разрешениях экрана.

** папка values 
хранит различные xml-файлы, содержащие коллекции ресурсов - различных данных, которые применяются в приложении. По умолчанию здесь есть два файла и одна папка:

	** файл colors.xml 
	хранит описание цветов, используемых в приложении

	** файл strings.xml 
	содержит строковые ресурсы, используемые в приложении

	** папки themes 
	хранит две темы приложения - для светлую (дневную) и темную (ночную)

** Отдельный элемент Gradle Scripts 
содержит ряд скриптов, которые используются при построении приложения.
	
// -------------------------------------------------------
** Подключаем девайс через отладку по WiFi
Режим разработчика на телефоне
По умолчанию опции разработчика на смартфонах скрыты. Чтобы сделать их доступными, надо зайти в Settings > About phone (Настройки > О телефоне) (в Android 8 это в Settings > System > About phone (Настройки > Система > О телефоне)) и семь раз нажать Build Number (Номер сборки).

Теперь необходимо включить отладку по USB. Для этого перейдем в Settings > System > Advanced > Developer options или Настройки > Система > Дополнительно > Для разработчиков (в Android 8 это в Settings > System > Developer options или Настройки > Система > Для разработчиков ).

Или Подключение по WiFi там же

** Класс MainActivity 
по сути представляет обычный класс java, в начале которого идет определение пакета данного класса:
package com.example.helloapp;

** Далее идет импорт классов 
из других пакетов, функциональность которых используется в MainActivity:

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

** Затем идет определение класса:
public class MainActivity extends AppCompatActivity

По умолчанию MainActivity наследуется от класса AppCompatActivity, который выше подключен с помощью директивы импорта. 
Класс AppCompatActivity по сути представляет отдельный экран (страницу) приложения или его визуальный интерфейс. 
И MainActivity наследует весь этот функционал.

По умолчанию MainActivity содержит только один метод onCreate(), в котором фактически и создается весь интерфейс приложения:

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

В метод setContentView() передается ресурс разметки графического интерфейса:

	setContentView(R.layout.activity_main);
	
Именно здесь и решается, какой именно визуальный интерфейс будет иметь MainActivity. Но что в данном случае представляет ресурс R.layout.activity_main? Это файл activity_main.xml из папки res/layout (в принципе можно заметить, что название ресурса соответствует названию файла), который также по умолчанию открыт в Android Studio:

** Файл activity_main.xml
Android Studio позволяет работать с визуальным интерфейсом как в режиме кода, так и в графическом режиме. Так, по умолчанию файл открыт в графическом режиме, и мы наглядно можем увидеть, как у нас примерно будет выглядеть экран приложения. И даже набрасать с панели инструментов какие-нибудь элементы управления, например, кнопки или текстовые поля.

Весь интерфейс представлен элементом-контейнером androidx.constraintlayout.widget.ConstraintLayout:

ConstraintLayout позволяет расположить вложенные элементы в определенных местах экрана. Вначале элемента ConstraintLayout идет определение пространств имен XML:

	xmlns:android="http://schemas.android.com/apk/res/android"
	xmlns:app="http://schemas.android.com/apk/res-auto"
	xmlns:tools="http://schemas.android.com/tools"

Зачем эти пространства имен нужны? 
Каждый ресурс или URI определяет некоторую функциональность, которая используется в приложении, например, предоставляют теги и атрибуты, которые необходимые для построения приложения.

** xmlns:android="http://schemas.android.com/apk/res/android": 
содержит основные атрибуты, которые предоставляются платформой Android, применяются в элементах управления и определяют их визуальные свойства (например, размер, позиционирование)

** xmlns:app="http://schemas.android.com/apk/res-auto": 
содержит атрибуты, которые определены в рамках приложения

** xmlns:tools="http://schemas.android.com/tools": 
применяется для работы с режиме дизайнера в Android Studio

И чтобы упростить работу с этими ресурсами, применяются префиксы. Например, дальше мы видим:

** android:layout_width 
определяет ширину контейнера. Этот атрибут (layout_width) расположен в ресурсе "http://schemas.android.com/apk/res/android". И поскольку этот ресурс сопоставляется с префиксом android, то для обращения к атрибуту перед ним через двоеточие указывается префикс данного ресурса.

Значением атрибута android:layout_weight является "match_parent".  Это значит, что элемент (ConstraintLayout) будет растягиваться по всей ширине контейнера (экрана устройства).

** Атрибут android:layout_height="match_parent" 
определяет высоту контейнера и также определен в "http://schemas.android.com/apk/res/android". Значение "match_parent" указывает, что ConstraintLayout будет растягивается по всей длине контейнера (экрана устройства).

** Атрибут tools:context 
определяет, какой класс activity (экрана приложения) связан с текущим определением интерфейса. В данном случае это класс MainActivity. Это позволяет использовать в Android Studio различные возможности в режиме дизайнера, которые зависят от класса activity.

** TextView
Текстовое поле устанавливает текст с помощью атрибута android:text.

** android:layout_width 
устанавливает ширину виджета. Значение *wrap_content* задает для виджета величину, достаточную для отображения в контейнере.

** android:layout_height 
устанавливает высоту виджета. Значение *wrap_content* аналогично установке ширины задает для виджета высоту, достаточную для отображения в контейнере

** android:text 
устанавливает текст, который будет выводиться в TextView (в данном случае это строка "Hello World!")

** app:layout_constraintLeft_toLeftOf="parent": 
указывает, что левая граница элемента будет выравниваться по левой стороне контейнера ConstraintLayout
Обратите внимание, что этот атрибут определен в пространстве имен с префиксом app, то есть в "http://schemas.android.com/apk/res-auto".

** app:layout_constraintTop_toTopOf="parent": 
указывает, что верхняя граница элемента будет выравниваться по верхней стороне контейнера ConstraintLayout

** app:layout_constraintRight_toRightOf="parent": у
казывает, что правая граница элемента будет выравниваться по правой стороне контейнера ConstraintLayout

** app:layout_constraintBottom_toBottomOf="parent": 
указывает, что нижняя граница элемента будет выравниваться по нижней стороне контейнера ConstraintLayout

# Введение в создание интерфейса
  https://metanit.com/java/android/3.1.php
  
Графический интерфейс пользователя представляет собой иерархию объектов android.view.View и android.view.ViewGroup. Каждый объект ViewGroup представляет контейнер, который содержит и упорядочивает дочерние объекты View. В частности, к контейнерам относят такие элементы, как RelativeLayout, LinearLayout, GridLayout, ConstraintLayout и ряд других.

Большинство визуальных элементов, наследующихся от класса View, такие как кнопки, текстовые поля и другие, располагаются в пакете *android.widget*

** Добавление файла layout
Но у нас может быть и несколько различных ресурсов layout. Как правило, каждый отдельный класс Activity использует свой файл layout. Либо для одного класса Activity может использоваться сразу несколько различных файлов layout.

К примеру, добавим в проект новый файл разметки интерфейса. Для этого нажмем на папку res/layout правой кнопкой мыши и в появившемся меню выберем пункт New -> Layout Resource File:


    <TextView
        android:id="@+id/header"
        android:text="Welcome to Android"
        android:textSize="26sp"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
 
Здесь определено текстовое поле TextView, которое имеет следующие атрибуты:

** android:id - 
идентификатор элемента, через который мы сможем ссылаться на него в коде. 
В записи android:id="@+id/header" 
символ @ указывает XML-парсеру использовать оставшуюся часть строки атрибута как идентификатор. 
А знак + означает, что если для элемента не определен id со значением header, то его следует определить.

** android:text - 
текст элемента - на экран будет выводиться строка "Welcome to Android".

** android:textSize - 
высота шрифта (здесь 26 единиц)

** android:layout_width - 
ширина элемента. Значение "match_parent" указывает, что элемент будет растягиваться по всей ширине контейнера ConstraintLayout

** android:layout_height - 
высота элемента. Значение "match_parent" указывает, что элемент будет растягиваться по всей высоте контейнера ConstraintLayout


# Определение размеров

При разработке приложений под Android мы можем использовать различные типы измерений:

*px*: пиксели текущего экрана. Однако эта единица измерения не рекомендуется, так как реальное представление внешнего вида может изменяться в зависимости от устройства; каждое устройство имеет определенный набор пикселей на дюйм, поэтому количество пикселей на экране может также меняться
*dp: (device-independent pixels)* независимые от плотности экрана пиксели. Абстрактная единица измерения, основанная на физической плотности экрана с разрешением 160 dpi (точек на дюйм). В этом случае 1dp = 1px. Если размер экрана больше или меньше, чем 160dpi, количество пикселей, которые применяются для отрисовки 1dp соответственно увеличивается или уменьшается. Например, на экране с 240 dpi 1dp=1,5px, а на экране с 320dpi 1dp=2px. Общая формула для получения количества физических пикселей из dp: px = dp * (dpi / 160)
*sp: (scale-independent pixels)* независимые от масштабирования пиксели. Допускают настройку размеров, производимую пользователем. Рекомендуются для работы со шрифтами.
*pt*: 1/72 дюйма, базируются на физических размерах экрана
*mm*: миллиметры
*in*: дюймы

Для упрощения работы с размерами все размеры разбиты на несколько групп:

*ldpi (low)*: ~120dpi
*mdpi (medium)*: ~160dpi
*hdpi (high)*: ~240dpi (к данной группе можно отнести такое древнее устройство как Nexus One)
*xhdpi (extra-high):* ~320dpi (Nexus 4)
*xxhdpi (extra-extra-high):* ~480dpi (Nexus 5/5X, Samsung Galaxy S5)
*xxxhdpi (extra-extra-extra-high):* ~640dpi (Nexus 6/6P, Samsung Galaxy S6)

** Установка размеров (applyDimension)
Основная проблема, связанная с размерами, связана с их установкой в коде Java. Например, некоторые методы принимают в качестве значения физические пиксели, а не device-independent pixels. В этом случае может потребоваться перевести значения из одного типа единиц в другой. Для этого требуется применить метод TypedValue.applyDimension(), который принимает три параметра:

	public static float applyDimension(int unit,
									   float value,
									   android.util.DisplayMetrics metrics)
									   
Параметр unit представляет тип единиц, из которой надо получить значение в пикселях. Тип единиц описывается одной из констант 
** TypedValue:
	*COMPLEX_UNIT_DIP* - dp или независимые от плотности экрана пиксели
	*COMPLEX_UNIT_IN* - in или дюймы
	*COMPLEX_UNIT_MM* - mm или миллиметры
	*COMPLEX_UNIT_PT* - pt или точки
	*COMPLEX_UNIT_PX* - px или физические пиксели
	*COMPLEX_UNIT_SP* - sp или независимые от масштабирования пиксели (scale-independent pixels)
Параметр *value* представляет значение, которое надо преобразовать
Параметр *metrics* представляет информацию о метрике, в рамках коорой надо выполнить преобразование

Например, нам надо получить из 60dp обычные физические пиксели:

	int valueInDp = 60;
	int valueInPx = (int) TypedValue.applyDimension(
					TypedValue.COMPLEX_UNIT_DIP, valueInDp, getResources().getDisplayMetrics());
					
В качестве третьго аргумента передается вызов метода getResources().getDisplayMetrics(), который позволяет получить информацию о метрике, связанной с текущим устройством. В итоге мы получим из 60dp некоторое количество пикселей.

*** Padding, Margins

```
<TextView
        android:layout_height="80dp"
        android:layout_width="wrap_content"
        android:text="Hello World!"
        android:textSize="30sp"
        android:background="#e0e0e0"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintTop_toTopOf="parent"
/>


        android:minWidth="200dp"
        android:maxWidth="250dp"
        android:minHeight="100dp"
        android:maxHeight="200dp"
		
		
<androidx.constraintlayout.widget.ConstraintLayout
	...
    android:padding="50dp"
		
	android:paddingTop="50dp"
	android:paddingLeft="50dp"
	android:paddingBottom="50dp"
	android:paddingRight="50dp"
	
	
    <TextView
	...
        android:paddingTop="60dp"
        android:paddingLeft="40dp"
        android:paddingRight="40dp"
        android:paddingBottom="60dp"
		...
        android:layout_marginTop="50dp"
        android:layout_marginLeft="60dp"
```

*** Java code
```
        // получаем отступ в пикселях для 50 dp
        int margin50inDp = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 50, getResources().getDisplayMetrics());
        // получаем отступ в пикселях для 60 dp
        int margin60inDp = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 60, getResources().getDisplayMetrics());
        // получаем отступ в пикселях для 40 dp
        int padding40inDp = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 40, getResources().getDisplayMetrics());
 
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
        // установка внешних отступов
        layoutParams.setMargins(margin60inDp, margin50inDp, margin60inDp, margin50inDp);
        // выравнивание по левому краю ConstraintLayout
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        // выравнивание по верхней границе ConstraintLayout
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        // устанавливаем размеры
        textView.setLayoutParams(layoutParams);
        // установка внутренних отступов
        textView.setPadding(padding40inDp, padding40inDp, padding40inDp, padding40inDp);
        // добавляем TextView в ConstraintLayout
        constraintLayout.addView(textView);
```

// -------------------------------------------------------
*** ConstraintLayout 
представляет контейнер, который позволяет создавать гибкие и масштабируемые визуальные интерфейсы.

Для позиционирования элемента внутри ConstraintLayout необходимо указать ограничения (constraints). Есть несколько типов ограничений. В частности, для установки позиции относительно определенного элемента испльзуются следующие ограничения:

layout_constraintLeft_toLeftOf: левая граница позиционируется относительно левой границы другого элемента
layout_constraintLeft_toRightOf: левая граница позиционируется относительно правой границы другого элемента
layout_constraintRight_toLeftOf: правая граница позиционируется относительно левой границы другого элемента
layout_constraintRight_toRightOf: правая граница позиционируется относительно правой границы другого элемента
layout_constraintTop_toTopOf: верхняя граница позиционируется относительно верхней границы другого элемента
layout_constraintTop_toBottomOf: верхняя граница позиционируется относительно нижней границы другого элемента
layout_constraintBottom_toBottomOf: нижняя граница позиционируется относительно нижней границы другого элемента
layout_constraintBottom_toTopOf: нижняя граница позиционируется относительно верхней границы другого элемента
layout_constraintBaseline_toBaselineOf: базовая линия позиционируется относительно базовой линии другого элемента
layout_constraintStart_toEndOf: элемент начинается там, где завершается другой элемент
layout_constraintStart_toStartOf: элемент начинается там, где начинается другой элемент
layout_constraintEnd_toStartOf: элемент завершается там, где начинается другой элемент
layout_constraintEnd_toEndOf: элемент завершается там, где завершается другой элемент

** LinearLayout
https://metanit.com/java/android/3.2.php
Контейнер LinearLayout представляет простейший контейнер - объект ViewGroup, который упорядочивает все дочерние элементы в одном направлении: по горизонтали или по вертикали. Все элемены расположены один за другим. Направление разметки указывается с помощью атрибута android:orientation.

Если, например, ориентация разметки вертикальная (android:orientation="vertical"), то все элементы располагаются в столбик - по одному элементу на каждой строке. Если ориентация горизонтальная (android:orientation="horizontal"), то элементы располагаются в одну строку. Например, расположим элементы в горизонтальный ряд:


	<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
		android:layout_width="match_parent"
		android:layout_height="match_parent"
		android:orientation="horizontal" >
	 
		<TextView
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			android:layout_margin="5dp"
			android:text="Hello"
			android:textSize="26sp" />
		
** Layout_gravity
Атрибут layout_gravity позволяет устанавливать позиционирование относительно LinearLayout. Он принимает следуюшие значения:
top: выравнивает элемент по верхней границе контейнера
bottom: выравнивает элемент по нижней границе контейнера
left: выравнивает элемент по левой границе контейнера
right: выравнивает элемент по правой границе контейнера
center_vertical: выравнивает элемент по центру по вертикали
center_horizontal: выравнивает элемент по центру по горизонтали
center: элемент позиционируется в центре
fill_vertical: элемент растягивается по вертикали
fill_horizontal: элемент растягивается по горизонтали
fill: элемент заполняет все пространство контейнера
clip_vertical: обрезает верхнюю и нижнюю границу элемента
clip_horizontal: обрезает правую и левую границу элемента
start: элемент позиционируется в начале (в верхнем левом углу) контейнера
end: элемент позиционируется в конце контейнера (в верхнем правом углу)

При указании значения мы можем комбинировать ряд значений, разделяя их вертикальной чертой: bottom|center_horizontal
	android:layout_gravity="bottom|center_horizontal"

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:layout_gravity="left"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:text="Hello Java!"
        android:background="#e8eaf6"/>
    <TextView
        android:layout_gravity="center"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:text="Hello World!"
        android:background="#e8eaf6"/>
		
** RelativeLayout 
https://metanit.com/java/android/3.3.php
RelativeLayout представляет объект ViewGroup, который располагает дочерние элементы относительно позиции других дочерних элементов разметки или относительно области самой разметки RelativeLayout. Используя относительное позиционирование, мы можем установить элемент по правому краю или в центре или иным способом, который предоставляет данный контейнер. Для установки элемента в файле xml мы можем применять следующие атрибуты:

android:layout_above: располагает элемент над элементом с указанным Id
android:layout_below: располагает элемент под элементом с указанным Id
android:layout_toLeftOf: располагается слева от элемента с указанным Id
android:layout_toRightOf: располагается справа от элемента с указанным Id
android:layout_toStartOf: располагает начало текущего элемента, где начинается элемент с указанным Id
android:layout_toEndOf: располагает начало текущего элемента, где завершается элемент с указанным Id
android:layout_alignBottom: выравнивает элемент по нижней границе другого элемента с указанным Id
android:layout_alignLeft: выравнивает элемент по левой границе другого элемента с указанным Id
android:layout_alignRight: выравнивает элемент по правой границе другого элемента с указанным Id
android:layout_alignStart: выравнивает элемент по линии, у которой начинается другой элемент с указанным Id
android:layout_alignEnd: выравнивает элемент по линии, у которой завершается другой элемент с указанным Id
android:layout_alignTop: выравнивает элемент по верхней границе другого элемента с указанным Id
android:layout_alignBaseline: выравнивает базовую линию элемента по базовой линии другого элемента с указанным Id
android:layout_alignParentBottom: если атрибут имеет значение true, то элемент прижимается к нижней границе контейнера
android:layout_alignParentRight: если атрибут имеет значение true, то элемент прижимается к правому краю контейнера
android:layout_alignParentLeft: если атрибут имеет значение true, то элемент прижимается к левому краю контейнера
android:layout_alignParentStart: если атрибут имеет значение true, то элемент прижимается к начальному краю контейнера (при левосторонней ориентации текста - левый край)
android:layout_alignParentEnd: если атрибут имеет значение true, то элемент прижимается к конечному краю контейнера (при левосторонней ориентации текста - правый край)
android:layout_alignParentTop: если атрибут имеет значение true, то элемент прижимается к верхней границе контейнера
android:layout_centerInParent: если атрибут имеет значение true, то элемент располагается по центру родительского контейнера
android:layout_centerHorizontal: при значении true выравнивает элемент по центру по горизонтали
android:layout_centerVertical: при значении true выравнивает элемент по центру по вертикали

Например, позиционирование относительно контейнера RelativeLayout:

    <TextView android:text="Left Top"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"
        android:textSize="26sp"
        android:layout_alignParentLeft="true"
        android:layout_alignParentTop="true" />
 
    <TextView android:text="Right Top"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"
        android:textSize="26sp"
        android:layout_alignParentRight="true"
        android:layout_alignParentTop="true" />
 
    <TextView android:text="Left Bottom"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"
        android:textSize="26sp"
        android:layout_alignParentLeft="true"
        android:layout_alignParentBottom="true" />
 
    <TextView android:text="Right Bottom"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"
        android:textSize="26sp"
        android:layout_alignParentRight="true"
        android:layout_alignParentBottom="true" />
		
** TableLayout
https://metanit.com/java/android/3.4.php

Контейнер TableLayout структурирует элементы управления в виде таблицы по столбцам и строкам. 

спользуя элемент TableRow, мы создаем отдельную строку. Как разметка узнает сколько столбцов надо создать? Android находит строку с максимальным количеством виджетов одного уровня, и это количество будет означать количество столбцов. Например, в данном случае у нас определены две строки и в каждой по два элемента. Если бы в какой-нибудь из них было бы три виджета, то соответственно столбцов было бы также три, даже если в другой строке осталось бы два виджета.

Причем элемент TableRow наследуется от класса LinearLayout, поэтому мы можем к нему применять тот же функционал, что и к LinearLayout. В частности, для определения пространства для элементов в строке используется атрибут android:layout_weight.

Если какой-то элемент должен быть растянут на ряд столбцов, то мы можем растянуть его с помощью атрибута layout_span, который указывает на какое количество столбцов надо растянуть элемент:

** FrameLayout

https://metanit.com/java/android/3.5.php
Контейнер FrameLayout предназначен для вывода на экран одного помещенного в него визуального элемента. Если же мы поместим несколько элементов, то они будут накладываться друг на друга. Тем не менее также можно располагать в FrameLayout несколько элементов.

** GridLayout
https://metanit.com/java/android/3.6.php

GridLayout представляет еще один контейнер, который позволяет создавать табличные представления. GridLayout состоит из коллекции строк, каждая из которых состоит из отдельных ячеек:

С помощью атрибутов *android:rowCount* и *android:columnCount* устанавливается число строк и столбцов соответственно. Так, в данном случае устанавливаем 3 строки и 3 столбца. GridLayout автоматически может позиционировать вложенные элементы управления по строкам. Так, в нашем случае первая кнопка попадает в первую ячейку (первая строка первый столбец), вторая кнопка - во вторую ячейку и так далее.

Однако мы можем явно задать номер столбца и строки для определенного элемента, а при необходимости растянуть на несколько столбцов или строк. Для этого мы можем применять следующие атрибуты:

android:layout_column: номер столбца (отсчет идет от нуля)
android:layout_row: номер строки
android:layout_columnSpan: количество столбцов, на которые растягивается элемент
android:layout_rowSpan: количество строк, на которые растягивается элемент

```
<GridLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:rowCount="3"
    android:columnCount="3">

    <Button
        android:text="1"
        android:layout_column="0"
        android:layout_row="0" />
    <Button android:text="2"
        android:layout_column="1"
        android:layout_row="0"/>
    <Button android:text="3"
        android:layout_column="2"
        android:layout_row="0"  />
    <Button android:text="4"
        android:layout_width="180dp"
        android:layout_columnSpan="2"/>
    <Button android:text="5"
        android:layout_height="100dp"
        android:layout_rowSpan="2"/>
    <Button android:text="6" />
    <Button android:text="7"/>
</GridLayout>
```

** ScrollView
https://metanit.com/java/android/3.11.php

Контейнер ScrollView предназначен для создания прокрутки для такого интерфейса, все элементы которого одномоментно не могут поместиться на экране устройства. ScrollView может вмещать только один элемент, поэтому если мы хотим разместить несколько элементов, то их надо поместить в какой-нибудь контейнер.

Например, определим ряд TextView с большими текстами:
```
<ScrollView
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="10dp">
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        >
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="What is Lorem Ipsum?"
            android:textSize="34sp" />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum."
            android:textSize="14sp"/>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Why do we use it?"
            android:layout_marginTop="16dp"
            android:textSize="34sp"/>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum."
            android:textSize="14sp"/>
    </LinearLayout>
</ScrollView>
```

** Вложенные layout
https://metanit.com/java/android/3.14.php
Одна layout может содержать другую layout. Для этого применяется элемент include.

Например, добавим в папку res/layout два файла layout, которые пусть будут называться text_panel.xml и button_panel.xml:

** Gravity и позиционирование внутри элемента
https://metanit.com/java/android/3.12.php

Атрибут *gravity* задает позиционирование содержимого внутри визуального элемента. Он может принимать следующие значения:

top: элементы размещаются вверху
bottom: элементы размещаются внизу
left: элементы размещаются в левой стороне
right: элементы размещаются в правой стороне контейнера
center_vertical: выравнивает элементы по центру по вертикали
center_horizontal: выравнивает элементы по центру по горизонтали
center: элементы размещаются по центру
fill_vertical: элемент растягивается по вертикали
fill_horizontal: элемент растягивается по горизонтали
fill: элемент заполняет все пространство контейнера
clip_vertical: обрезает верхнюю и нижнюю границу элементов
clip_horizontal: обрезает правую и левую границу элементов
start: элемент позиционируется в начале (в верхнем левом углу) контейнера
end: элемент позиционируется в конце контейнера(в верхнем правом углу)

    android:gravity="bottom|right"
	
	
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
 
    <TextView
        android:gravity="bottom"
         
        android:layout_width="0dp"
        android:layout_height="200dp"
        android:text="Hello Android!"
        android:textSize="30sp"
        android:background="#e8eaf6"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
 
</androidx.constraintlayout.widget.ConstraintLayout>
```

-------------------------------------------------------
# Глава 3. Основные элементы управления

**TextView**

https://metanit.com/java/android/4.1.php

* android:text: устанавливает текст элемента
* android:textSize: устанавливает высоту текста, в качестве единиц измерения для указания высоты используются sp
* android:background: задает фоновый цвет элемента в виде цвета в шестнадцатиричной записи или в виде цветового ресурса
* android:textColor: задает цвет текста
* android:textAllCaps: при значении true делает все символы в тексте заглавными
* android:textDirection: устанавливает направление текста. По умолчанию используется направление слева направо, но с помощью значения rtl можно установить направление справо налево


* android:textAlignment: задает выравнивание текста. Может принимать следующие значения:
	* center: выравнивание по центру
	* textStart: по левому краю
	* textEnd: по правому краю
	* viewStart: при направлении текста слева направо выравнивание по левому краю, при направлении справа налево - по правому
	* viewEnd: при направлении текста слева направо выравнивание по правому краю, при направлении справа налево - по левому

* android:fontFamily: устанавливает тип шрифта. Может принимать следующие значения:
	* monospace
	* serif
	* serif-monospace
	* sans-serif
	* sans-serif-condensed
	* sans-serif-smallcaps
	* sans-serif-light
	* casual
	* cursive

Иногда необходимо вывести на экран какую-нибудь ссылку, либо телефон, по нажатию на которые производилось бы определенное действие. Для этого в TextView определен атрибут android:autoLink:
* android:autoLink может принимать несколько значений:
	* none: отключает все ссылки
	* web: включает все веб-ссылки
	* email: включает ссылки на электронные адреса
	* phone: включает ссылки на номера телефонов
	* map: включает ссылки на карту
	* all: включает все вышеперечисленные ссылки

-------------------------------------------------------
**EditText**
https://metanit.com/java/android/4.8.php

Элемент EditText является подклассом класса TextView. Он также представляет текстовое поле, но теперь уже с возможностью ввода и редактирования текста. Таким образом, в EditText мы можем использовать все те же возможности, что и в TextView.

Из тех атрибутов, что не рассматривались в теме про TextView, следует отметить атрибут android:hint. Он позволяет задать текст, который будет отображаться в качестве подсказки, если элемент EditText пуст. Кроме того, мы можем использовать атрибут android:inputType, который позволяет задать клавиатуру для ввода. В частности, среди его значений можно выделить следующие:

android:inputType:
* text: обычная клавиатура для ввода однострочного текста
* textMultiLine: многострочное текстовое поле
* textEmailAddress: обычная клавиатура, на которой присутствует символ @, ориентирована на ввод email
* textUri: обычная клавиатура, на которой присутствует символ /, ориентирована на ввод интернет-адресов
* textPassword: клавиатура для ввода пароля
* textCapWords: при вводе первый введенный символ слова представляет заглавную букву, остальные - строчные
* number: числовая клавиатура
* phone: клавиатура в стиле обычного телефона
* date: клавиатура для ввода даты
* time: клавиатура для ввода времени
* datetime: клавиатура для ввода даты и времени

Одной из возможностей элемента EditText также является возможность обработать введенные символы по мере ввода пользователя. 
...

-------------------------------------------------------
**Button**
https://metanit.com/java/android/4.9.php

Одним из часто используемых элементов являются кнопки, которые представлены классом android.widget.Button. Ключевой особенностью кнопок является возможность взаимодействия с пользователем через нажатия.

Некоторые ключевые атрибуты, которые можно задать у кнопок:
* text: задает текст на кнопке
* textColor: задает цвет текста на кнопке
* background: задает фоновый цвет кнопки
* textAllCaps: при значении true устанавливает текст в верхнем регистре. По умолчанию как раз и применяется значение true

onClick: задает обработчик нажатия кнопки

-------------------------------------------------------
**Приложение Калькулятор**
https://metanit.com/java/android/4.13.php

-------------------------------------------------------
**Всплывающие окна. Toast**
https://metanit.com/java/android/4.10.php

В обработчике отображается всплывающее окно. Для его создания применяется метод Toast.makeText(), в который передается три параметра: текущий контекст (текущий объект activity), отображаемый текст и время отобажения окна.

В качестве времени показа окна мы можем использовать целочисленное значение - колическо миллисекунд или встроенные константы 
Toast.LENGTH_LONG (3500 миллисекунд) и 
Toast.LENGTH_SHORT (2000 миллисекунд).

Для самого отображения окна вызывается метод show():

```
    public  void onClick(View view){
        Toast toast = Toast.makeText(this, "Hello Android!",Toast.LENGTH_LONG);
        toast.show();
    }
```

По умолчанию окно отображается внизу интерфейса с центрированием по центру. Но мы можем кастомизировать позиционирование окна с помощью методов setGravity() и setMargin(). Так, изменим метод onClick:

```
public  void onClick(View view){  
    Toast toast = Toast.makeText(this, "Hello Android!", Toast.LENGTH_LONG);
    toast.setGravity(Gravity.TOP, 0,160);   // import android.view.Gravity;
    toast.show();
}
```

-------------------------------------------------------
**Snackbar**

https://metanit.com/java/android/4.14.php

Элемент Snackbar в некотором роде похож на Toast: он также позволяет выводить всплывающие сообщения, но теперь сообщения растягиваются по ширине экрана.

Snackbar создается с помощью метода make(), в который передаются три параметра: объект View, к которому прикрепляется всплывающее ообщение, само сообщение в виде строки и параметр, который указывает, сколько будет отображаться сообщение. 
Последний параметр может принимать числовое значение - количество миллисекунд, либо одну из трех констант: 
* Snackbar.LENGTH_INDEFINITE (отображение в течение неопределенного периода времени),
* Snackbar.LENGTH_LONG (долгое отображение) или 
* Snackbar.LENGTH_SHORT (недолгое отображение).

После создания Snackbar отображается с помощью метода show:

Прикрепление обработчика события
Snackbar позволяет добавить виджету действие, чтобы пользователь мог как-то прореагировать на сообщение. Например, изменим код MainActivity следующим образом:

Настройка визуального вида
Ряд методов Snackbar позволяет настроить внешний вид:
* setTextColor(): настраивает цвет текста
* setBackgroundTint(): настраивает цвет фона
* setActionTextColor(): настраивает цвет текста кнопки в всплывающем сообщении

```java
    public  void onClick(View view){
        Snackbar snackbar = Snackbar.make(view, "Hello Android. Snackbar", Snackbar.LENGTH_LONG);
        snackbar.setTextColor(0XFF81C784);
        snackbar.setBackgroundTint(0XFF555555);
        snackbar.setActionTextColor(0XFF0277BD);

        snackbar.setAction("Next...", new View.OnClickListener (){
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Next clicked!",Toast.LENGTH_LONG);
                toast.show();
            }
        });
```

**Checkbox**
https://metanit.com/java/android/4.3.php

**ToggleButton**
https://metanit.com/java/android/4.11.php

**RadioButton**
https://metanit.com/java/android/4.12.php

-------------------------------------------------------
**DatePicker**

https://metanit.com/java/android/4.4.php

DatePicker представляет элемент для выбора даты. Среди его атрибутов можно отметить следующие:
* android:calendarTextColor: цвет текста календаря
* android:calendarViewShown: указывает, будет ли отображаться вид календаря
* android:datePickerMode: устанавливает режим выбора даты
* android:dayOfWeekBackground: устанавливает фоновый цвет панели выбора дня недели
* android:endYear: устанавливает последний отображаемый год
* android:firstDayOfWeek: устанавливает первый день недели
* android:headerBackground: устанавливает фоновый цвет для панели выбранной даты
* android:maxDate: устанавливает максимальную отображаемую дату в формате mm/dd/yyyy
* android:minDate: устанавливает минимальную отображаемую дату в формате mm/dd/yyyy
* android:spinnersShown: указывает, будет ли отображаться спиннер в виджете
* android:startYear: устанавливает начальный отображаемый год
* android:yearListSelectorColor: устанавливает цвет для поля выбора года

Среди методов DatePicker можно отметить следующие:
* int getDayOfMonth(): возвращает номер выбранного дня
* int getMonth(): возвращает номер выбранного месяца (от 0 до 11)
* int getYear()(): возвращает номер выбранного года
* void init(int year, int monthOfYear, int dayOfMonth, DatePicker.OnDateChangedListener onDateChangedListener): устанавливает начальную дату. Последний параметр устанавливает слушатель изменения выбранной даты
* void setOnDateChangedListener(DatePicker.OnDateChangedListener onDateChangedListener): устанавливает слушатель изменения выбранной даты
* void setFirstDayOfWeek(int firstDayOfWeek): устанавливает первый день недели
* void updateDate(int year, int month, int dayOfMonth): программно обновляет выбранную дату


DatePicker по умолчанию отображается в режиме календаря, но мы можем использовать добавить другой режим - спиннер с помощью атрибута android:datePickerMode:

    android:datePickerMode="spinner"
		
В данном случае спиннер отображается слева от календаря. Если мы вовсе не хотим отображать календаря, то можно установить атрибут 

	android:calendarViewShown="false"

-------------------------------------------------------
**TimePicker**

https://metanit.com/java/android/4.16.php

TimePicker представляет виджет для выбора времени, который может отображать время либо в 24-часовом, либо в 12-часовом формате.

Среди атрибутов TimePicker следует выделить timePickerMode, который позволяет режим отображения и может принимать одно из двух значений: clock (отображение в виде часов) и spinner (отображение в виде спиннера).

Среди методов TimePicker можно отметить следующие:
* int getHour(): возвращает час (в 24-часом формате)
* int getMinute(): возвращает минуты
* boolean is24HourView(): возвращает true, если используется 24-часовой формат
* void setHour(int hour): устанавливает час для TimePicker
* void setIs24HourView(Boolean is24HourView): устанавливает 24-часовой формат
* void setMinute(int minute): устанавливает минуты
* void setOnTimeChangedListener(TimePicker.OnTimeChangedListener onTimeChangedListener): устанавливает слушатель изменения времени в TimePicker в виде объекта TimePicker.OnTimeChangedListener

-------------------------------------------------------
**Ползунок SeekBar**

https://metanit.com/java/android/4.7.php

Элемент SeekBar выполняет роль ползунка, то есть шкалу делений, на которой мы можем менять текущую отметку.

Среди его атрибутов можно отметить следующие:
* android:max: устанавливает максимальное значение
* android:min: устанавливает минимальное значение
* android:progress: устанавливает текущее значение, которое находится в диапазоне между минимальным и максимальным

Для управления SeekBar определяет ряд методов, из которых выделим следующие:
* void setProgress(int progress): устанавливает текущее значение ползунка
* void setMin(int min): устанавливает минимальное значение
* void setMax(int max): устанавливает максимальное значение
* void incrementProgressBy(int diff): увеличивает текущее значение на diff
* int getMax(): возвращает максимальное значение
* int getMin(): возвращает минимальное значение
* int getProgress(): возвращает текущее значение
* void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener l): устанавливает слушателя изменения значения в SeekBar
-------------------------------------------------------

# Ресурсы

**Работа с ресурсами**

https://metanit.com/java/android/2.4.php

Ресурс в приложении Android представляет собой файл, например, файл разметки интерфейса или некоторое значение, например, простую строку. То есть ресурсы представляют собой и файлы разметки, и отдельные строки, и звуковые файлы, файлы изображений и т.д. Все ресурсы находятся в проекте в каталоге res. Для различных типов ресурсов, определенных в проекте, в каталоге res создаются подкаталоги. Поддерживаемые подкаталоги:
* animator/: xml-файлы, определяющие анимацию свойств
* anim/: xml-файлы, определяющие tween-анимацию
* color/: xml-файлы, определяющие список цветов
* drawable/: Графические файлы (.png, .jpg, .gif)
* mipmap/: Графические файлы, используемые для иконок приложения под различные разрешения экранов
* layout/: xml-файлы, определяющие пользовательский интерфейс приложения
* menu/: xml-файлы, определяющие меню приложения
* raw/: различные файлы, которые сохраняются в исходном виде
* values/: xml-файлы, которые содержат различные используемые в приложении значения, например, ресурсы строк
* xml/: Произвольные xml-файлы
* font/: файлы с определениями шрифтом и расширениями .ttf, .otf или .ttc, либо файлы XML, который содержат элемент <font-family>

По умолчанию здесь есть каталоги не для всех типов ресурсов, которые использоваться в Android, однако при необходимости мы можем добавить в папку res нужный каталог, а в него затем поместить ресурс.

Когда происходит компиляция проекта сведения обо всех ресурсах добавляются в специальный файл R.jar, который затем используется при работе с ресурсами

**Применение ресурсов**

***Ссылка на ресурсы в коде***

Тип ресурса в данной записи ссылается на одно из пространств (вложенных классов), определенных в файле R.java, которые имеют соответствующие им типы в xml:
* R.drawable (ему соответствует тип в xml drawable)
* R.id (id)
* R.layout (layout)
* R.string (string)
* R.attr (attr)
* R.plural (plurals)
* R.array (string-array)

Подобным образом мы можем получать другие ресурсы. Например, в файле res/values/strings.xml определен ресурс app_name:
```
<resources>
    <string name="app_name">ViewApp</string>
</resources>
```
Этот ресурс ссылается на строку. Чтобы получить ссылку на данный ресурс в коде java, мы можем использовать выражение R.string.app_name.

***Доступ в файле xml***

Нередко возникает необходимость ссылаться на ресурс в файле xml, например, в файле, который определяет визуальный интерфейс, к примеру, в activity_main.xml. Ссылки на ресурсы в файлах xml имеют следующую формализованную форму: 

```@[имя_пакета:]тип_ресурса/имя_ресурса```
* имя_пакета представляет имя пакета, в котором ресурс находится (указывать необязательно, если ресурс находится в том же пакете)
* тип_ресурса представляет подкласс, определенный в классе R для типа ресурса
* имя_ресурса имя файла ресурса без расширения или значение атрибута android:name в XML-элементе (для простых значений).

Например, мы хотим вывести в элемент TextView строку, которая определена в виде ресурса в файле strings.xml:
```
<TextView
        android:id="@+id/textView"
```

***Метод getResources***

Для получения ресурсов в классе Activity мы можем использовать метод getResources(), который возвращает объект android.content.res.Resources. Но чтобы получить сам ресурс, нам надо у полученного объекта Resources вызвать один из методов. 

Некоторые из его методов:
* getString(): возвращает строку из файла strings.xml по числовому идентификатору
* getDimension(): возвращает числовое значение - ресурс dimen
* getDrawable(): возвращает графический файл в виде объекта Drawable
* getBoolean(): возвращает значение boolean
* getColor(): возвращает определение цвета
* getColorStateList(): возвращает объект ColorStateList - набор цветов
* getFont(): возвращает определение шрифта в виде объекта Typeface
* getFloat(): возвращает значение float
* getLayout(): возвращает объект XmlResourceParser, связанный с файлом layout

И изменим код MainActivity:
```
        //setContentView(R.layout.activity_main);
        // получение ресурсов из файла values/strings.xml
        String app_name = getResources().getString(R.string.app_name);
```

**Ресурсы строк**

https://metanit.com/java/android/2.5.php

Форматирование строк

    <string name="welcome_message">Добро пожаловать %1$s! Уже %2$d : %3$d</string>
	
Третий ресурс - welcome_message представляет строку с форматированием. Так, она содержит такие символы как %1$s, %2$d и %3$d. Что они означают? %1$s указывает, что это первый аргумент, а символ "s" говорит, что этот аргумент представляет строку. %2$d представляет второй аргумент, а символ "d" в конце указывает, что это будет целое число. Аналогично %3$d указывает, что это третий аргумент, который представляет целое число.
```
	String text = getString(R.string.welcome_message, userName, hour, minute);
```
Метод getString(R.string.welcome_message, userName, hour, minute) получает ресурс welcome_message и в качестве последующих параметров передает его аргументам значения. Для первого аргумента-строки используется переменная userName, а для второго и третьего аргументов передаем текущее количество часов и минут, полученных с помощью класса Calendar.

***Ресурсы Plurals***

Plurals представляют еще один вид набора строк. Он предназначен для описания количества элементов. Для чего это надо? К примеру, возьмем существительное: нередко оно изменяет окончание в зависимости от числительного, которое с ним употребляется: 1 цветок, 2 цветка, 5 цветков. Для подобных случаев и используется ресурс plurals.

Посмотрим на примере. Добавим в папку res/values новый ресурс. Назовем его flowers:
```
<resources>
    <plurals name="flowers">
        <item quantity="one">%d цветок</item>
        <item quantity="few">%d цветка</item>
        <item quantity="many">%d цветков</item>
    </plurals>
```
Для задания ресурса используется элемент <plurals>, для которого существует атрибут name, получающий в качестве значения произвольное название, по которому потом ссылаются на данный ресурс.

Сами наборы строк вводятся дочерними элементами <item>. Этот элемент имеет атрибут quantity, который имеет значение, указывающее, когда эта строка используется. Данный атрибут может принимать следующие значения:
* zero: строка для количества в размере 0
* one: строка для количества в размере 1 (для русского языка - для задания всех количеств, оканчивающихся на 1, кроме 11)
* two: строка для количества в размере 2
* few: строка для небольшого количества
* many: строка для больших количеств
* other: все остальные случаи

Причем в данном случае многое зависит от конкретного языка. А система сама позволяет определить, какое значение брать для того или иного числа.

**string array**

Еще одним видом строковых ресурсов является string-array или массив строк. Например, добавим в папку res/values новый файл, который назовем languages.xml:

Ресурс задается с помощью элемента <string-array>. Фактически он определяет набор строк. А каждая отдельная строка задается с помощью элемента <item>

```
<resources>
    <string-array name="languages">
        <item>Java</item>
        <item>Kotlin</item>
        <item>Dart</item>
    </string-array>
</resources>
```

**Ресурсы dimension**

https://metanit.com/java/android/2.6.php

Определение размеров должно находиться в папке res/values в файле с любым произвольным именем. синтаксис определения ресурса:
```
<resources>
    <dimen name="horizontal_margin">64dp</dimen>
    <dimen name="vertical_margin">32dp</dimen>
    <dimen name="text_size">32sp</dimen>
</resources>
```
Здесь определены два ресурса для отступов horizontal_margin и vertical_margin, которые хранят соответственно значения 64dp и 32dp, и ресурс text_size, который хранит высоту шрифта - 32sp. Названия ресурсов могут быть произвольными.

**Ресурсы Color и установка цвета**

https://metanit.com/java/android/2.7.php
```
<resources>
    <color name="purple_200">#FFBB86FC</color>
    <color name="purple_500">#FF6200EE</color>
    <color name="purple_700">#FF3700B3</color>
    <color name="teal_200">#FF03DAC5</color>
    <color name="teal_700">#FF018786</color>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
</resources>
```
Цвет определяется с помощью элемента <color>. Его атрибут name устанавливает название цвета, которое будет использоваться в приложении, а шестнадцатеричное число - значение цвета.

Для задания цветовых ресурсов можно использовать следующие форматы:
#RGB (#F00 - 12-битное значение)
#ARGB (#8F00 - 12-битное значение с добавлением альфа-канала)
#RRGGBB (#FF00FF - 24-битное значение)
#AARRGGBB (#80FF00FF - 24-битное значение с добавлением альфа-канала)

-------------------------------------------------------
# Activity

**Activity и жизненный цикл приложения**

https://metanit.com/java/android/2.1.php

Ключевым компонентом для создания визуального интерфейса в приложении Android является activity (активность). Нередко activity ассоциируется с отдельным экраном или окном приложения, а переключение между окнами будет происходить как перемещение от одной activity к другой. Приложение может иметь одну или несколько activity. Например, при создании проекта с пустой Activity в проект по умолчанию добавляется один класс Activity - MainActivity, с которого и начинается работа приложения:
```
public class MainActivity extends AppCompatActivity {
 
    // содержимое класса
}
```
Все объекты activity представляют собой объекты класса android.app.Activity, которая содержит базовую функциональность для всех activity. В приложении из прошлой темы мы напрямую с этим классом не работали, а MainActivity наследовалась от класса AppCompatActivity. Однако сам класс AppCompatActivity, хоть и не напрямую, наследуется от базового класса Activity.

**Жизненный цикл приложения**

Все приложения Android имеют строго определенный системой жизненный цикл. При запуске пользователем приложения система дает этому приложению высокий приоритет. Каждое приложение запускается в виде отдельного процесса, что позволяет системе давать одним процессам более высокой приоритет, в отличие от других. Благодаря этому, например, при работе с одними приложениями Android позволяет не блокировать входящие звонки. После прекращения работы с приложением, система освобождает все связанные ресурсы и переводит приложение в разряд низкоприоритетного и закрывает его.

Все объекты activity, которые есть в приложении, управляются системой в виде стека activity, который называется back stack. При запуске новой activity она помещается поверх стека и выводится на экран устройства, пока не появится новая activity. Когда текущая activity заканчивает свою работу (например, пользователь уходит из приложения), то она удаляется из стека, и возобновляет работу та activity, которая ранее была второй в стеке.

После запуска activity проходит через ряд событий, которые обрабатываются системой и для обработки которых существует ряд обратных вызовов:

```
protected void onCreate(Bundle saveInstanceState);
protected void onStart();
protected void onRestart();
protected void onResume();
protected void onPause();
protected void onStop();
protected void onDestroy();
```

***onCreate()***
onCreate - первый метод, с которого начинается выполнение activity. В этом методе activity переходит в состояние Created. Этот метод обязательно должен быть определен в классе activity. В нем производится первоначальная настройка activity. В частности, создаются объекты визуального интерфейса. Этот метод получает объект Bundle, который содержит прежнее состояние activity, если оно было сохранено. Если activity заново создается, то данный объект имеет значение null. Если же activity уже ранее была создана, но находилась в приостановленном состоянии, то bundle содержит связанную с activity информацию.

После того, как метод onCreate() завершил выполнение, activity переходит в состояние Started, и и система вызывает метод onStart()

***onStart***
В методе onStart() осуществляется подготовка к выводу activity на экран устройства. Как правило, этот метод не требует переопределения, а всю работу производит встроенный код. После завершения работы метода activity отображается на экране, вызывается метод onResume, а activity переходит в состояние Resumed.

***onResume***
При вызове метода onResume activity переходит в состояние Resumed и отображается на экране устройства, и пользователь может с ней взаимодействовать. И собственно activity остается в этом состоянии, пока она не потеряет фокус, например, вследствии переключения на другую activity или просто из-за выключения экрана устройства.

***onPause***
Если пользователь решит перейти к другой activity, то система вызывает метод onPause, а activity переходит в состояние Paused. В этом методе можно освобождать используемые ресурсы, приостанавливать процессы, например, воспроизведение аудио, анимаций, останавливать работу камеры (если она используется) и т.д., чтобы они меньше сказывались на производительность системы.

Но надо учитывать, что в этот состоянии activity по прежнему остается видимой на экране, и на работу данного метода отводится очень мало времени, поэтому не стоит здесь сохранять какие-то данные, особенно если при этом требуется обращение к сети, например, отправка данных по интернету, или обращение к базе данных - подобные действия лучше выполнять в методе onStop().

После выполнения этого метода activity становится невидимой, не отображается на экране, но она все еще активна. И если пользователь решит вернуться к этой activity, то система вызовет снова метод onResume, и activity снова появится на экране.

Другой вариант работы может возникнуть, если вдруг система видит, что для работы активных приложений необходимо больше памяти. И система может сама завершить полностью работу activity, которая невидима и находится в фоне. Либо пользователь может нажать на кнопку Back (Назад). В этом случае у activity вызывается метод onStop.

***onStop***
В этом методе activity переходит в состояние Stopped. В этом состоянии activity полностью невидима. В методе onStop следует особождать используемые ресурсы, которые не нужны пользователю, когда он не взаимодействует с activity. Здесь также можно сохранять данные, например, в базу данных.

При этом во время состояния Stopped activity остается в памяти устройства, сохраняется состояние всех элементов интерфейса. К примеру, если в текстовое поле EditText был введен какой-то текст, то после возобновления работы activity и перехода ее в состояние Resumed мы вновь увидим в текстовом поле ранее введенный текст.

Если после вызова метода onStop пользователь решит вернуться к прежней activity, тогда система вызовет метод onRestart. Если же activity вовсе завершила свою работу, например, из-за закрытия приложения, то вызывается метод onDestroy().

***onDestroy***
Ну и завершается работа activity вызовом метода onDestroy, который возникает либо, если система решит убить activity в силу конфигурационных причин (например, поворот экрана или при многоконном режиме), либо при вызове метода finish().

Также следует отметить, что при изменении ориентации экрана система завершает activity и затем создает ее заново, вызывая метод onCreate.

**Управление жизненным циклом**
**Логирование**
```
public class MainActivity extends AppCompatActivity {
 
    private final static String TAG = "MainActivity";
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
```
Для логгирования событий здесь используется класс android.util.Log.

В данном случае обрабатываются все ключевые методы жизненного цикла. Вся обработка сведена к вызову метода Log.d(), в который передается TAG - случайное строковое значение и строка, которая выводится в консоли Logcat в нижней части Android Studio, выполняя роль отладочной информации. Если эта консоль по умолчанию скрыта, то мы можем перейти к ней через пункт меню *View -> Tool Windows -> Logcat*.

И при запуске приложения мы сможем увидеть в окне Logcat отладочную информацию, которая определяется в методах жизненного цикла activity:

-------------------------------------------------------

**Файл манифеста AndroidManifest.xml**

https://metanit.com/java/android/2.3.php

Каждое приложение содержит файл манифеста AndroidManifest.xml. Данный файл определяет важную информацию о приложении - название, версию, иконки, какие разрешения приложение использует, регистрирует все используемые классы activity, сервисы и т.д. Данный файл можно найти в проекте в папке manifests:

Элементом корневого уровня является узел manifest. В данном случае только определяется пакет приложения - package="com.example.viewapp". Собственно это определение файла манифеста по умолчанию. В каждом конкретном случае может отличаться пакет приложения, остальное содержимое при создании проекта с пустой activity будет аналогичным.

Большинство настроек уровня приложения определяются элементом application. Ряд настроек задаются с помощью атрибутов. По умолчанию применяются следующие атрибуты:
* android:allowBackup указывает, будет ли для приложения создаваться резервная копия. Значение android:allowBackup="true" разрешает создание резервной копии.
* android:icon устанавливает иконку приложения. При значении android:icon="@mipmap/ic_launcher" иконка приложения берется из каталога res/mipmap
* android:roundIcon устанавливает круглую иконку приложения. Также берется из каталога res/mipmap
* android:label задает название приложение, которое будет отображаться на мобильном устройстве в списке приложений и в заголовке. В данном случае оно хранится в строковых ресурсах - android:label="@string/app_name".
* android:supportsRtl указывает, могут ли использоваться различные RTL API - специальные API для работы с правосторонней ориентацией текста (например, для таких языков как арабский или фарси).
* android:theme устанавливает тему приложения. Подробно темы будут рассмотрены далее, а пока достаточно знать, что тема определяет общий стиль приложения. Значение @style/Theme.ViewApp" берет тему "Theme.ViewApp" из каталога res/values/themes

Вложенные элементы activity определяют все используемые в приложении activity. В данном случае видно, что в приложении есть только одна activity - MainActivity.
```
<activity android:name=".MainActivity">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />
 
        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>
```
Элемент intent-filter в MainActivity указывает, как данная activity будет использоваться. В частности, с помощью узла action android:name="android.intent.action.MAIN", что данная activity будет входной точкой в приложение и не должна получать какие-либо данные извне.

Элемент category android:name="android.intent.category.LAUNCHER" указывает, что MainActivity будет представлять стартовый экран, который отображается при запуске приложения.

Файл манифеста может содержать множество элементов, которые имеют множество атрибутов. И все возможные элементы и их атрибуты можно найти в документации. Здесь же рассмотрим некоторые примеры использования.

**Определение версии**
```
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.viewapp"
    android:versionName="1.0"
    android:versionCode="1">
```

**Установка разрешений**

Иногда приложению требуются разрешения на доступ к определенным ресурсам, например, к списку контактов, камере и т.д. Чтобы приложение могло работать с тем же списком контактов, в файле манифесте необходимо установить соответствующие разрешения. Для установки разрешений применяется элемент <uses-permission>:
```
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.viewapp">
    <uses-permission android:name="android.permission.READ_CONTACTS" />
    <uses-permission android:name="android.permission.CAMERA" android:maxSdkVersion="30" />
```

**Поддержка разных разрешений**
Мир устройств Android очень сильно фрагментирован, здесь встречаются как гаджеты с небольшим экраном, так и большие широкоэкранные телевизоры. И бывают случаи, когда надо ограничить использование приложения для определенных разрешений экранов. Для этого в файле манифеста определяется элемент <supports-screens>:

```
    <supports-screens
        android:largeScreens="true"
        android:normalScreens="true"
        android:smallScreens="false"
        android:xlargeScreens="true" />
```
Данный элемент принимает четыре атрибута:
* android:largeScreens - экраны с диагональю от 4.5 до 10"
* android:normalScreens - экраны с диагональю от 3 до 4.5"
* android:smallScreens - экраны с диагональю меньше 3"
* android:xlargeScreens - экраны с диагональю больше 10"

Если атрибут имеет значение true, то приложение будет поддерживаться соответствующим размером экрана

**Запрет на изменение ориентации**

Приложение в зависимости от положения гаджета может находиться в альбомной и портретной ориентации. Не всегда это бывает удобно. Мы можем сделать, чтобы приложение вне зависимости от поворота гаджета использовало только одну ориентацию. Для этого в файле манифеста у требуемой activity надо установить атрибут android:screenOrientation. Например, запретим альбомную ориентацию:
```
        <activity android:name=".MainActivity"
            android:screenOrientation="portrait">
```
Значение android:screenOrientation="portrait" указывает, что данная activity будет находиться только в портретной ориентации. Если же надо установить только альбомную ориентацию, тогда надо использовать значение android:screenOrientation="landscape"


-------------------------------------------------------
**Введение в Intent. Запуск Activity**

https://metanit.com/java/android/2.2.php

Для взаимодействия между различными объектами activity ключевым классом является android.content.Intent. Он представляет собой задачу, которую надо выполнить приложению.

Для работы с Intent добавим новый класс Activity. Для этого нажмем правой кнопкой мыши в папку, в которой находится класс MainActivity, и затем в контекстном меню выберем New->Activity->Empty Activity

Вызов второй Activity
```
public class MainActivity extends AppCompatActivity {
	...
    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
```

**Передача данных между Activity. Сериализация. Передача класса**

https://metanit.com/java/android/2.12.php
Для передачи данных между двумя Activity используется объект Intent. Через его метод putExtra() можно добавить ключ и связанное с ним значение.

Например, передача из текущей activity в SecondActivity строки "Hello World" с ключом "hello":
```
// создание объекта Intent для запуска SecondActivity
Intent intent = new Intent(this, SecondActivity.class);
// передача объекта с ключом "hello" и значением "Hello World"
intent.putExtra("hello", "Hello World");
// запуск SecondActivity
startActivity(intent);
```
Для передачи данных применяется метод putExtra(), который в качестве значения позволяет передать данные простейших типов - String, int, float, double, long, short, byte, char, массивы этих типов, либо объект интерфейса Serializable.

Чтобы получить отправленные данные при загрузке SecondActivity, можно воспользоваться методом get(), в который передается ключ объекта:
```
Bundle arguments = getIntent().getExtras();
String name = arguments.get("hello").toString();    // Hello World
```

В зависимости от типа отправляемых данных при их получении мы можем использовать ряд методов объекта Bundle. Все они в качестве параметра принимают ключ объекта. Основные из них:
* get(): универсальный метод, который возвращает значение типа Object. Соответственно поле получения данное значение необходимо преобразовать к нужному типу
* getString(): возвращает объект типа String
* getInt(): возвращает значение типа int
* getByte(): возвращает значение типа byte
* getChar(): возвращает значение типа char
* getShort(): возвращает значение типа short
* getLong(): возвращает значение типа long
* getFloat(): возвращает значение типа float
* getDouble(): возвращает значение типа double
* getBoolean(): возвращает значение типа boolean
* getCharArray(): возвращает массив объектов char
* getIntArray(): возвращает массив объектов int
* getFloatArray(): возвращает массив объектов float
* getSerializable(): возвращает объект интерфейса Serializable

**Parcelable**

https://metanit.com/java/android/2.13.php

Возможность сериализации объектов предоставляется напрямую инфраструктурой языка Java. Однако Android также предоставляет интерфейс Parcelable, который по сути также позволяет сериализовать объекты, как и Serializable, но является более оптимизированным для Android. И подобные объекты Parcelable также можно передавать между двумя activity или использовать каким-то иным образом.


***See also:***

* Parcelable. Передаём объекты

	http://developer.alexanderklimov.ru/android/theory/parcelable.php
	
		В Java существует специальный интерфейс Serializable, но он оказался слишком неповоротлив для мобильных устройств и пользоваться им настоятельно не рекомендуется. Для передачи объектов следует использовать другой интерфейс Parcelable.

* Сравнение Serializable и Parcelable. В секундах

	https://habr.com/ru/post/174015/
	
		На основе тестов сделано заключение, что на таких данных Parcelable работает быстрее, чем Serializable в среднем в 16 раз. Техника Serializable удобна, но может использоваться только для небольшого количества данных.
	
-------------------------------------------------------
**Получение результата из Activity (Activity Result API)**

https://metanit.com/java/android/2.11.php

В прошлой теме было рассмотрено как вызывать новую Activity и передавать ей некоторые данные. Но мы можем не только передавать данные запускаемой activity, но и ожидать от нее некоторого результата работы.

В прошлой теме мы вызывали новую activity с помощью метода startActivity(). Для получения же результата работы запускаемой activity необходимо использовать Activity Result API.

Activity Result API предоставляет компоненты для регистрации, запуска и обработки результата другой Activity. Одним из преимуществ применения Activity Result API является то, что он отвязывает результат Activity от самой Activity. Это позволяет получить и обработать результат, даже если Activity, которая возвращает результат, в силу ограничений памяти или в силу других причин завершила свою работу. Вкратце рассмотрим основные моменты применения Activity Result API.

**Регистрация функции для получения результата**

Для регистрации функции, которая будет обрабатывать результат, Activity Result API предоставляет метод registerForActivityResult(). Этот метод в качестве параметров принимает объекты ActivityResultContract и ActivityResultCallback и возвращает объект ActivityResultLauncher, который применяется для запуска другой activity.
```
ActivityResultLauncher<I> registerForActivityResult (
                ActivityResultContract<I, O> contract, 
                ActivityResultCallback<O> callback)
```
* ActivityResultContract определяет контракт: данные какого типа будут подаваться на вход и какой тип будет представлять результат.

* ActivityResultCallback представляет интерфейс с единственным методом onActivityResult(), который определяет обработку полученного результата. Когда вторая activity закончит работу и возвратит результат, то будет как раз вызываться этот метод. Результат передается в метод в качестве параметра. При этом тип параметра должен соответствовать типу результата, определенного в ActivityResultContract. 

Например:
```
    // Обработчик результата формы 2 - объект типа ActivityResultLauncher, 
	// экзепляр функция mStartForResult
    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {

                    TextView textView = findViewById(R.id.textView);
                    if(result.getResultCode() == Activity.RESULT_OK){ // Если результат ОК
                        Intent intent = result.getData(); // Получаем данные в Intent
                        String accessMessage = intent.getStringExtra(ACCESS_MESSAGE); // Получаем информацию из поля ACCESS_MESSAGE
                        textView.setText(accessMessage);
                    }
                    else{
                        textView.setText("Ошибка доступа");
                    }
                }
            });
```
Класс ActivityResultContracts предоставляет ряд встроенных типов контрактов. Например, в листинге кода выше применяется встроенный тип ActivityResultContracts.StartActivityForResult, который в качестве входного объекта устанавливает объект Intent, а в качестве типа результата - тип ActivityResult.

Запуск activity для получения результата
Метод registerForActivityResult() регистрирует функцию-колбек и возвращает объект ActivityResultLauncher. С помощью этого мы можем запустить activity. Для этого у объекта ActivityResultLauncher вызывается метод launch():

```
    public void onClick2210(View view) {
        // получаем введенный возраст
        EditText ageBox = findViewById(R.id.age);
        String age = ageBox.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(AGE_KEY, age);

        // Передаем форме 2 управление для возвращения результата
        mStartForResult.launch(intent);
    }
```
В метод lauch() передается объект того типа, который определен объектом ActivityResultContracts в качестве входного.

... for more, see example - lay22_10_activity_res_main
	
-------------------------------------------------------
**Взаимодействие между Activity**

https://metanit.com/java/android/2.10.php

В прошлых темах мы рассмотрели жизненный цикл activity и запуск новых activity с помощью объекта Intent. Теперь рассмотрим некоторые особенности взаимодействия между activity в одном приложении. Допустим, у нас есть три activity: MainActivity, SecondActivity и ThirdActivity.

Если мы последовательно запустим все activity: из главной MainActivity запустим SecondActivity, из SecondActivity - ThirdActivity, то в итоге у нас сложится следующий стек activity:

ThirdActivity
SecondActivity
MainActivity

Если после этого из ThirdActivity мы захотим обратиться к MainActivity, то метод startActivity() запустит новый объект MainActivity (а не вернется к уже существующему), и стек уже будет выглядеть следующим образом:

MainActivity
ThirdActivity
SecondActivity
MainActivity

То есть у нас будут две независимые копии MainActivity. Такое положение нежелательно, если мы просто хотим перейти к существующей. И этот момент надо учитывать.

Если мы нажмем на кнопку Back (Назад), то текущая activity, которая находится на вершине стека, удаляется из стека, и предыдущая activity оказывается на вершине стека и возобновляет свою работу. И таким образом с помощью кнопки Back (Назад) мы сможем перейти к предыдущей activity в стеке. Например, в случае выше если мы нажмем на кнопку Назад, то MainActivity на вершине стека завершает свою работу, и на экране начинает отображаться ThirdActivity

ThirdActivity
SecondActivity
MainActivity
Тем не менее иногда возникает необходимость упавлять переходом между activity. Например, в данном случае нам нежелательно при нажатии на кнопку в ThirdActivity запускать новую копию MainActivity вместо того, чтобы просто перейти к MainActivity, которая была запущена первой и находится в самом низу стека. Рассмотрим, какие возможности предоставляет нам Android.

***Управление стеком activity***

Чтобы выйти из этой ситуации, мы можем использовать флаг Intent.FLAG_ACTIVITY_REORDER_TO_FRONT:
```
Intent intent = new Intent(this, MainActivity.class);
intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
startActivity(intent);
```
* флаг Intent.FLAG_ACTIVITY_REORDER_TO_FRONT перемещает activity, к которой осуществляется переход на вершину стека, если она ужее есть в стеке. И в этом случае после перехода из ThirdActivity к MainActivity стек будет выглядеть следующим образом:
```
MainActivity
ThirdActivity
SecondActivity
```
Если же нам просто надо перейти из ThirdActivity к MainActivity, как если бы мы перешли назад с помощью кнопки Back, то мы можем использовать флаги Intent.FLAG_ACTIVITY_CLEAR_TOP и Intent.FLAG_ACTIVITY_SINGLE_TOP:
```
Intent intent = new Intent(this, MainActivity.class);
intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
startActivity(intent);
```
* Флаг Intent.FLAG_ACTIVITY_CLEAR_TOP очищает все activity кроме той, которая запускается (если она уже есть в стеке). 
* А флаг Intent.FLAG_ACTIVITY_SINGLE_TOP указывает, что если в вершине стеке уже есть activity, которую надо запустить, то она НЕ запускается (то она может существовать в стеке только в единичном виде).

В этом случае после перехода из ThirdActivity к MainActivity стек будет полностью очищен, и там останется одна MainActivity.

* Еще один флаг - Intent.FLAG_ACTIVITY_NO_HISTORY позволит не сохранять в стеке запускаемую activity. Например, при запуске SecondActivity мы не хотим ее сохранять в стеке:
```
Intent intent = new Intent(this, SecondActivity.class);
intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
startActivity(intent);
```
В этом случае при переходе по цепочке MainActivity -> SecondActivity -> ThirdActivity стек будет выглядеть следующим образом:
```
MainActivity
ThirdActivity
```

-------------------------------------------------------
**Глава 6. Работа с изображениями**

https://metanit.com/java/android/2.9.php

**Ресурсы изображений**

[TODO] - Stop reading

-------------------------------------------------------
**Глава 9. Меню**

https://metanit.com/java/android/7.1.php

**Создание меню**

Меню в приложениях представляет класс android.view.Menu, и каждая activity ассоциируется с объектом этого типа. Объект android.view.Menu может включать различное количество элементов, а те в свою очередь могут хранить подэлементы.

**Определение меню в xml**

Меню, как и файлы интерфейса или изображений, также представляет собой ресурс. Однако при создании нового проекта с Empty Activity по умолчанию нет никаких ресурсов меню, поэтому при необходимости их нужно добавлять вручную. Так, для определения ресурсов меню в проекте нажмем правой кнопкой мыши в проекте на каталог res и далее в открывшемся списоке выберем пункт New -> Android Resource File:

Далее в появившемся окне укажем для имени файла название main_menu, а для поля Resource Type (тип ресурса) выберем Menu:

После этого в каталоге res будет создан подкаталог menu, в котором будет находиться файл main_menu.xml.

Изменим содержимое файла, определив несколько пунктов:
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/action_settings"
        android:orderInCategory="1"
        android:title="Настройки" />
    <item
        android:id="@+id/save_settings"
        android:orderInCategory="3"
        android:title="Сохранить" />
    <item
        android:id="@+id/open_settings"
        android:orderInCategory="2"
        android:title="Открыть" />
</menu>
```

Тег <menu> является корневым узлом файла и определяет меню, состоящее из одного или нескольких элементов <item> и <group>.

Элемент <item> представляет объект MenuItem, которой является одним из элементов меню. Этот элемент может содержать внутренний подэлемент <menu>, с помощью которого создается подменю.

Элемент <item> включает следующие атрибуты, которые определяют его внешний вид и поведение:
* android:id: уникальный id элемента меню, который позволяет его опознать при выборе пользователем и найти через поиск ресурса по id
* android:icon: ссылка на ресурс drawable, который задает изображение для элемента (android:icon="@drawable/ic_help")
* android:title: ссылка на ресурс строки, содержащий заголовок элемента. По умолчанию имеет значение "Settings"
* android:orderInCategory: порядок следования элемента в меню

**Наполнение меню элементами**
Мы определили меню с тремя элементами, но само определение элементов в файле еще не создает меню. Это всего лишь декларативное описание. Чтобы вывести его на экран, нам надо использовать его в классе Activity. Для этого надо переопределить метод onCreateOptionsMenu. Итак, перейдем к классу MainActivity и изменим его следующим образом:
```
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
 
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
```

Метод getMenuInflater возвращает объект MenuInflater, у которого вызывается метод inflate(). Этот метод в качестве первого параметра принимает ресурс, представляющий наше декларативное описание меню в xml, и наполняет им объект menu, переданный в качестве второго параметра.
	
**Обработка нажатий в меню**

Если мы нажмем на любой из пунктов меню, то ничего не произойдет. Чтобы привязать к меню действия, нам надо переопределить в классе activity onOptionsItemSelected.

Для вывода выбранного элемена меню в файле activity_main.xml определим текстовое поле с id=header:

Чтобы понять, какой пункт меню выбран, вначале получаем его идентификатор int id = item.getItemId(). Затем пробегаемся в конструкции switch..case и выбираем нужный вариант и в зависимости от выбора производим определенные действия - в данном случае устанавливаем текст TextView.

```
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        TextView headerView = findViewById(R.id.selectedMenuItem);
        switch(id){
            case R.id.action_settings :
                headerView.setText("Настройки");
                return true;
            case R.id.open_settings:
                headerView.setText("Открыть");
                return true;
            case R.id.save_settings:
                headerView.setText("Сохранить");
                return true;
        }
        //headerView.setText(item.getTitle());
        return super.onOptionsItemSelected(item);
    }
```

**Группы в меню и подменю**

https://metanit.com/java/android/7.2.php

Для создания подменю в файле разметки меню определим внутренний элемент menu:

```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/action_settings"
        android:title="Настройки">
        <menu>
            <item android:id="@+id/save_settings"
                android:title="Сохранить" />
            <item android:id="@+id/open_settings"
                android:title="Открыть" />
        </menu>
 
    </item>
    <item
        android:id="@+id/action_move"
        android:title="Переход">
        <menu>
            <item android:id="@+id/forward"
                android:title="Вперед" />
            <item android:id="@+id/back"
                android:title="Назад" />
        </menu>
 
    </item>
</menu>
```

[TODO] - Stop reading

-------------------------------------------------------
**Работа с файловой системой**

https://metanit.com/java/android/13.1.php

**Чтение и сохранение файлов**

Работа с настройками уровня activity и приложения позволяет сохранить небольшие данные отдельных типов (string, int), но для работы с большими массивами данных, такими как графически файлы, файлы мультимедиа и т.д., нам придется обращаться к файловой системе.

ОС Android построена на основе Linux. Этот факт находит свое отражение в работе с файлами. Так, в путях к файлам в качестве разграничителя в Linux использует слеш "/", а не обратный слеш "\" (как в Windows). А все названия файлов и каталогов являются регистрозависимыми, то есть "data" это не то же самое, что и "Data".

Приложение Android сохраняет свои данные в каталоге /data/data/<название_пакета>/ и, как правило, относительно этого каталога будет идти работа.

Для работы с файлами абстрактный класс android.content.Context определяет ряд методов:
* boolean deleteFile (String name): удаляет определенный файл
* String[] fileList (): получает все файлы, которые содержатся в подкаталоге /files в каталоге приложения
* File getCacheDir(): получает ссылку на подкаталог cache в каталоге приложения
* File getDir(String dirName, int mode): получает ссылку на подкаталог в каталоге приложения, если такого подкаталога нет, то он создается
* File getExternalCacheDir(): получает ссылку на папку /cache внешней файловой системы устройства
* File getExternalFilesDir(String type): получает ссылку на каталог /files внешней файловой системы устройства
* File getFileStreamPath(String filename): возвращает абсолютный путь к файлу в файловой системе
* FileInputStream openFileInput(String filename): открывает файл для чтения
* FileOutputStream openFileOutput (String name, int mode): открывает файл для записи

Все файлы, которые создаются и редактируются в приложении, как правило, хранятся в подкаталоге /files в каталоге приложения.

Для непосредственного чтения и записи файлов применяются также стандартные классы Java из пакета java.io.

де физически находится созданный файл? Чтобы увидеть его на подключенном устройстве перейдем в Android Stud в меню к пункту View -> Tool Windows -> Device File Explorer

/data/data/com.shestakov.android.viewapp/files/content.txt
1224апр

Андроид Студия скачивает копии данных себе в папку
```
C:\Users\User\AppData\Local\Google\AndroidStudio2021.3\device-explorer\samsung-sm_g991b-adb-R5CR10M6NHB-i8gACL._adb-tls-connect._tcp\data\data\com.shestakov.android.viewapp\files
```

**Размещение файлов во внешнем хранилище**

https://metanit.com/java/android/13.2.php

В прошлой теме мы рассмотрели сохранение и чтение файлов из каталога приложения. По умолчанию такие файлы доступны только самому приложению. Однако мы можем помещать и работать с файлами из внешнего хранилища приложения. Это также позволит другим программам открывать данные файлы и при необходимости изменять.

Весь механизм работы с файлами будет таким же, как и при работе с хранилищем приложения. Ключевым отличием здесь будет получение и использование пути к внешнему хранилищу через метод getExternalFilesDir() класса Context.

С помощью выражения getExternalFilesDir(null) получаем доступ к папке приложения во внешнем хранилище и устанавливаем объект файла:
```
    private File getExternalPath() {
        return new File(getExternalFilesDir(null), FILE_NAME);
    }
```

И после операции записи на смартфоне через Device File Explorer мы сможем увидеть созданный файл в папке storage/self/primary/Android/data/[название_пакета]/files:

/storage/self/primary/Android/data/com.shestakov.android.viewapp/files/document.txt
external file content


Андроид Студия скачивает копии данных себе в папку
```
C:\Users\User\AppData\Local\Google\AndroidStudio2021.3\device-explorer\samsung-sm_g991b-adb-R5CR10M6NHB-i8gACL._adb-tls-connect._tcp\storage\self\primary\Android\data\com.shestakov.android.viewapp\files
```

-------------------------------------------------------
**Работа с базами данных SQLite**

https://metanit.com/java/android/14.5.php

**Подключение к базе данных SQLite**

В Android имеется встроенная поддержка одной из распространенных систем управления базами данных - SQLite. Для этого в пакете android.database.sqlite определен набор классов, которые позволяют работать с базами данных SQLite. И каждое приложение может создать свою базу данных.

Чтобы использовать SQLite в Android, надо создать базу данных с помощью выражение на языке SQL. После этого база данных будет храниться в каталоге приложения по пути:
```
DATA/data/[Название_приложения]/databases/[Название_файла_базы_данных]
```

Андроид Студия скачивает копии данных себе в папку
```
C:\Users\User\AppData\Local\Google\AndroidStudio2021.3\device-explorer\samsung-sm_g991b-adb-R5CR10M6NHB-i8gACL._adb-tls-connect._tcp\data\data\com.shestakov.android.viewapp\databases
```

ОС Android по умолчанию уже содержит ряд встроенных бад SQLite, которые используются стандартными программами - для списка контактов, для хранения фотографий с камеры, музыкальных альбомов и т.д.

Основную функциональность по работе с базами данных предоставляет пакет android.database. Функциональность непосредственно для работы с SQLite находится в пакете android.database.sqlite.

База данных в SQLite представлена классом android.database.sqlite.SQLiteDatabase. Он позволяет выполнять запросы к бд, выполнять с ней различные манипуляции.

Класс android.database.sqlite.SQLiteCursor предоставляет запрос и позволяет возвращать набор строк, которые соответствуют этому запросу.

Класс android.database.sqlite.SQLiteQueryBuilder позволяет создавать SQL-запросы.

Сами sql-выражения представлены классом android.database.sqlite.SQLiteStatement, которые позволяют с помощью плейсхолдеров вставлять в выражения динамические данные.

Класс android.database.sqlite.SQLiteOpenHelper позволяет создать базу данных со всеми таблицами, если их еще не существует.

В SQLite применяется следующая система типов данных:
* INTEGER: представляет целое число, аналог типу int в java
* REAL: представляет число с плавающей точкой, аналог float и double в java
* TEXT: представляет набор символов, аналог String и char в java
* BLOB: представляет массив бинарных данных, например, изображение, аналог типу int в java

Сохраняемые данные должны представлять соответствующие типы в java.

**Создание и открытие базы данных**

Для создания или открытия новой базы данных из кода Activity в Android мы можем вызвать метод openOrCreateDatabase(). Этот метод может принимать три параметра:

название для базы данных

числовое значение, которое определяет режим работы (как правило, в виде константы MODE_PRIVATE)

необязательный параметр в виде объекта SQLiteDatabase.CursorFactory, который представляет фабрику создания курсора для работы с бд

Например, создание базы данных app.db:
	SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app.db", MODE_PRIVATE, null);

Для выполнения запроса к базе данных можно использовать метод execSQL класса SQLiteDatabase. В этот метод передается SQL-выражение. Например, создание в базе данных таблицы users:

	SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app.db", MODE_PRIVATE, null);
	db.execSQL("CREATE TABLE IF NOT EXISTS users (name TEXT, age INTEGER)");

Если нам надо не просто выполнить выражение, но и получить из бд какие-либо данные, то используется метод rawQuery(). Этот метод в качестве параметра принимает SQL-выражение, а также набор значений для выражения sql. Например, получение всех объектов из базы данных:
```
SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app.db", MODE_PRIVATE, null);
db.execSQL("CREATE TABLE IF NOT EXISTS users (name TEXT, age INTEGER)");
Cursor query = db.rawQuery("SELECT * FROM users;", null);
if(query.moveToFirst()){
     
    String name = query.getString(0);
    int age = query.getInt(1);
}
```
Метод db.rawQuery() возвращает объект Cursor, с помощью которого мы можем извлечь полученные данные.

Возможна ситуация, когда в базе данных не будет объектов, и для этого методом query.moveToFirst() пытаемся переместиться к первому объекту, полученному из бд. Если этот метод возвратит значение false, значит запрос не получил никаких данных из бд.

Создание БД
```
    public void onClick(View view){
        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app.db", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS users (name TEXT, age INTEGER, UNIQUE(name))");
        db.execSQL("INSERT OR IGNORE INTO users VALUES ('Tom Smith', 23), ('John Dow', 31);");
 
        Cursor query = db.rawQuery("SELECT * FROM users;", null);
        TextView textView = findViewById(R.id.textView);
        textView.setText("");
        while(query.moveToNext()){
            String name = query.getString(0);
            int age = query.getInt(1);
            textView.append("Name: " + name + " Age: " + age + "\n");
        }
        query.close();
        db.close();
    }
```
По нажатию на кнопку здесь вначале создается в базе данных app.db новая таблица users, а затем в нее добавляются два объекта в базу данных с помощью SQL-выражения INSERT.

Далее с помощью выражения SELECT получаем всех добавленных пользователей из базы данных в виде курсора Cursor.

Вызовом query.moveToNext() перемещаемся в цикле while последовательно по всем объектам.

Для получения данных из курсора применяются методы query.getString(0) и query.getInt(1). В скобках в методы передается номер столбца, из которого мы получаем данные. Например, выше мы добавили вначале имя пользователя в виде строки, а затем возраст в виде числа. Значит, нулевым столбцом будет идти строкое значение, которое получаем с помощью метода getString(), а следующим - первым столбцом идет числовое значение, для которого применяется метод getInt().

После завершения работы с курсором и базой данных мы закрываем все связанные объекты:

	query.close();
	db.close();
	
Если мы не закроем курсор, то можем столкнуться с проблемой утечки памяти.

-------------------------------------------------------
**SQLiteOpenHelper и SimpleCursorAdapter, получение данных из SQLite**

https://metanit.com/java/android/14.1.php

Для упрощения работы с базами данных SQLite в Android нередко применяется класс SQLiteOpenHelper. Для использования необходимо создать класса-наследник от SQLiteOpenHelper, переопределив как минимум два его метода:
* onCreate(): вызывается при попытке доступа к базе данных, но когда еще эта база данных не создана
* onUpgrade(): вызывается, когда необходимо обновление схемы базы данных. Здесь можно пересоздать ранее созданную базу данных в onCreate(), установив соответствующие правила преобразования от старой бд к новой

Поэтому добавим в проект, в ту же папку, где находится класс MainActivity, новый класс DatabaseHelper
...

Если база данных отсутствует или ее версия (которая задается в переменной SCHEMA) выше текущей, то срабатывает метод onCreate().

Для выполнения запросов к базе данных нам потребуется объект SQLiteDatabase, который представляет базу данных. Метод onCreate() получает в качестве параметра базу данных приложения.

Для выполнения запросов к SQLite используется метод execSQL(). Он принимает sql-выражение CREATE TABLE, которое создает таблицу. Здесь также при необходимости мы можем выполнить и другие запросы, например, добавить какие-либо начальные данные. Так, в данном случае с помощью того же метода и выражения sql INSERT добавляется один объект в таблицу.

В методе onUpgrade() происходит обновление схемы БД. В данном случае для примера использован примитивный поход с удалением предыдущей базы данных с помощью sql-выражения DROP и последующим ее созданием. Но в реальности если вам будет необходимо сохранить данные, этот метод может включать более сложную логику - добавления новых столбцов, удаление ненужных, добавление дополнительных данных и т.д.

...
В методе onCreate() происходит создание объекта SQLiteOpenHelper. Сама инициализация объектов для работы с базой данных происходит в методе onResume(), который срабатывает после метода onCreate().

Чтобы получить объект базы данных, надо использовать метод getReadableDatabase() (получение базы данных для чтения) или getWritableDatabase(). Так как в данном случае мы будет только считывать данные из бд, то воспользуемся первым методом:

```db = sqlHelper.getReadableDatabase();```

**Получение данных и Cursor**

Android предоставляет различные способы для осуществления запросов к объекту SQLiteDatabase. В большинстве случаев мы можем применять метод rawQuery(), который принимает два параметра: SQL-выражение SELECT и дополнительный параметр, задающий параметры запроса.

После выполнения запроса rawQuery() возвращает объект Cursor, который хранит результат выполнения SQL-запроса:

```
userCursor =  db.rawQuery("select * from "+ DatabaseHelper.TABLE, null);
```

Класс Cursor предлагает ряд методов для управления выборкой, в частности:

getCount(): получает количество извлеченных из базы данных объектов

* Методы moveToFirst() и moveToNext() позволяют переходить к первому и к следующему элементам выборки. Метод isAfterLast() позволяет проверить, достигнут ли конец выборки.
* Методы get*(columnIndex) (например, getLong(), getString()) позволяют по индексу столбца обратиться к данному столбцу текущей строки

**CursorAdapter**
Дополнительно для управления курсором в Android имеется класс CursorAdapter. Он позволяет адаптировать полученный с помощью курсора набор к отображению в списковых элементах наподобие ListView. Как правило, при работе с курсором используется подкласс CursorAdapter - SimpleCursorAdapter. Хотя можно использовать и другие адаптеры, типа ArrayAdapter.

```
userAdapter = new SimpleCursorAdapter(this, android.R.layout.two_line_list_item,
                userCursor, headers, new int[]{android.R.id.text1, android.R.id.text2}, 0);
userList.setAdapter(userAdapter);
```

Конструктор класса SimpleCursorAdapter принимает шесть параметров:

* Первым параметром выступает контекст, с которым ассоциируется адаптер, например, текущая activity
* Второй параметр - ресурс разметки интерфейса, который будет использоваться для отображения результатов выборки
* Третий параметр - курсор
* Четвертый параметр - список столбцов из выборки, которые будут отображаться в разметке интерфейса
* Пятый параметр - элементы внутри ресурса разметки, которые будут отображать значения столбцов из четвертого параметра
* Шестой параметр - флаги, задающие поведения адаптера

При использовании CursorAdapter и его подклассов следует учитывать, что выборка курсора должна включать целочисленный столбец с названием _id, который должен быть уникальным для каждого элемента выборки. Значение этого столбца при нажатии на элемент списка затем передается в метод обработки onListItemClick(), благодаря чему мы можем по id идентифицировать нажатый элемент.

В данном случае у нас первый столбец как раз называется "_id".

После завершения работу курсор должен быть закрыт методом close()

И также надо учитывать, что если мы используем курсор в SimpleCursorAdapter, то мы не можем использовать метод close(), пока не завершим использование SimpleCursorAdapter. Поэтому метод cursor более предпочтительно вызывать в методе onDestroy() фрагмента или activity.

-------------------------------------------------------
**Добавление, удаление и обновление данных в SQLite**

https://metanit.com/java/android/14.2.php

Продолжим работу с проектом из прошлой темы, где мы получаем данные. Теперь добавим в него стандартную CRUD-логику (создание, обновление, удаление).

Чтобы не нагромождать форму с главной activity, все остальные действия по работе с данными будут происходить на другом экране. Добавим в проект новый класс activity, который назовем UserActivity:

При обновлении или удалении объекта из списка из главной activity в UserActivity будет передаваться id объекта:
```
long userId=0;
//.................
Bundle extras = getIntent().getExtras();
if (extras != null) {
    userId = extras.getLong("id");
}
```

Если из MainActivity не было передано id, то устанавливаем его значение 0, следовательно, у нас будет добавление, а не редактирование/удаление

Если id определен, то получаем по нему из базы данных объект для редактирования/удаления:
```
if (id < 0) {
         
    userCursor = db.rawQuery("select * from " + DatabaseHelper.TABLE + " where " +
            DatabaseHelper.COLUMN_ID + "=?", new String[]{String.valueOf(id)});
    userCursor.moveToFirst();
    nameBox.setText(userCursor.getString(1));
    yearBox.setText(String.valueOf(userCursor.getInt(2)));
    userCursor.close();
}
```
Иначе просто скрываем кнопку удаления.

Для выполнения операций по вставке, обновлению и удалению данных SQLiteDatabase имеет методы insert(), update() и delete(). Эти методы вызываются в обработчиках кнопок:

```db.delete(DatabaseHelper.TABLE, "_id = ?", new String[]{String.valueOf(id)});```

В метод delete() передается название таблицы, а также столбец, по которому происходит удаление, и его значение. В качестве критерия можно выбрать несколько столбцов, поэтому третьим параметром идет массив. Знак вопроса ? обозначает параметр, вместо которого подставляется значение из третьего параметра.

**ContentValues**

Для добавления или обновления нам надо создать объект ContentValues. Данный объект представляет словарь, который содержит набор пар "ключ-значение". Для добавления в этот словарь нового объекта применяется метод put. Первый параметр метода - это ключ, а второй - значение, например:
```
ContentValues cv = new ContentValues();
cv.put("NAME", "Tom");
cv.put("YEAR", 30);
```

В качестве значений в метод put можно передавать строки, целые числа, числа с плавающей точкой

В данном же случае добавляются введенные в текстовое поля значения:
```
ContentValues cv = new ContentValues();
cv.put(DatabaseHelper.COLUMN_NAME, nameBox.getText().toString());
cv.put(DatabaseHelper.COLUMN_YEAR, Integer.parseInt(yearBox.getText().toString()));
```
При обновлении в метод update() передается название таблицы, объект ContentValues и критерий, по которому происходит обновление (в данном случае столбец id):
```
db.update(DatabaseHelper.TABLE, cv, DatabaseHelper.COLUMN_ID + "=" + userId, null);
```
Метод insert() принимает название таблицы, объект ContentValues с добавляемыми значениями. Второй параметр является необязательным: он передает столбец, в который надо добавить значение NULL:
```
db.insert(DatabaseHelper.TABLE, null, cv);
```
Вместо этих методов, как в прошлой теме, можно использовать метод execSQL() с точным указанием выполняемого sql-выражения. В то же время методы delete/insert/update имеют преимущество - они возвращают id измененной записи, по которому мы можем узнать об успешности операции, или -1 в случае неудачной операции:
```
long result = db.insert(DatabaseHelper.TABLE, null, cv);
if(result>0){
 
    // действия
}   
```
После каждой операции выполняется метод goHome(), который возвращает на главную activity.

При нажатии на кнопку запускается UserActivity, при этом не передается никакого id, то есть в UserActivity id будет равен нулю, значит будет идти добавление данных:
```
public void add(View view){
    Intent intent = new Intent(this, UserActivity.class);
    startActivity(intent);
}
```

Другую ситуацию представляет обработчик нажатия на элемент списка - при нажатии также будет запускаться UserActivity, но теперь будет передаваться id выбранной записи:
```
public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    Intent intent = new Intent(getApplicationContext(), UserActivity.class);
    intent.putExtra("id", id);
    startActivity(intent);
}```
!!! Для корректного запуска UserActivity 
необходимо еще добавить в файл AndroidManifest.xml строчку
```
<activity android:name=".UserActivity"></activity>
```

*Q:* Возникла следующая проблема. При тестировании проекта, когда нажимаем на элемент списка ListView, приложение вылетает. Что это может быть?
*A:* надо в *Android Monitor* поглядеть, что там за ошибка и на какой строке возникает, а так сложно сказать, но скорее всего что-то не так написали.

**Использование существующей БД SQLite**

https://metanit.com/java/android/14.3.php

Кроме создания новой базы данных мы также можем использовать уже существующую. Это может быть более предпочтительно, так как в этом случае база данных приложения уже будет содержать всю необходимую информацию.

Возьмем проект, созданный в предыдущей теме, где у нас была MainActivity, которая выводила список объектов, и UserActivity, которая позволяла добавлять, редактировать и удалять объекты из БД

Для начала создадим базу данных SQLite. В этом нам может помочь такой инструмент как Sqlitebrowser. Он бесплатный и доступен для различных операционных систем по адресу https://sqlitebrowser.org/. Хотя можно использовать и другие способы для создания начальной БД.

Как видно на скриншоте, я определяю таблицу users с тремя полями: _id, name, age. Общая команда на создание таблицы будет следующей:
```
CREATE TABLE `users` (
    `_id`   INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
    `name`  TEXT NOT NULL,
    `year`  INTEGER NOT NULL
);```

После создания таблицы добавим в проект в Android Studio папку assets, а в папку assets - только что созданную базу данных. Для этого перейдем к полному опеределению проекта, нажмем на папку main правой кнопкой мыши и в меню выберем New -> Directory:

Затем в появившемся окошке выберем пункт src\main\assets и нажмем на Enter для ее добавления в проект::

По умолчанию база данных будет размещаться во внешнем хранилище, выделяемом для приложения в папке /data/data/[название_пакета]/databases/, и чтобы получить полный путь к базе данных в конструкторе используется выражение:
```
DB_PATH =context.getFilesDir().getPath() + DB_NAME;
```

D/DatabaseHelper: DB_PATH - 
/data/user/0/com.shestakov.android.viewapp/filesuserstore.db
/data/user/0/com.shestakov.android.viewapp/files/userstore.db
/data/data/com.shestakov.android.viewapp/databases/userstore.db


Метод onCreate() нам не нужен, так как нам не требуется создание встроенной базы данных. Зато здесь определен дополнительный метод create_db(), цель которого копирование базы данных из папки assets в то место, которое указано в переменной DB_PATH.

Кроме этого здесь также определен метод открытия базы данных open() с помощью метода SQLiteDatabase.openDatabase()

-------------------------------------------------------
**Динамический поиск по базе данных SQLite**

https://metanit.com/java/android/14.4.php

Прежде всего надо отметить, что для фильтрации данных в адаптере, нам надо получить фильтр адаптера, а у этого фильтра выполнить метод filter():
```
userAdapter.getFilter().filter(s.toString());
```
В этот метод filter() передается ключ поиска.

Для текстового поля мы можем отслеживать изменения содержимого с помощью слушателя:
```
userFilter.addTextChangedListener(new TextWatcher() {
 
    public void afterTextChanged(Editable s) {
    }
 
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }
    // при изменении текста выполняем фильтрацию
    public void onTextChanged(CharSequence s, int start, int before, int count) {
 
        userAdapter.getFilter().filter(s.toString());
    }
});
```
В слушателе TextWatcher в методе onTextChanged как раз и вызывается метод filter(), в который передется введенная пользователем в текстовое поле последовательность символов.

Сам вызызов метода filter() мало на что влияет. Нам нало еще определить провайдер фильтрации адаптера, которые и будет инкапсулировать реальную логику фильтрации:
```
userAdapter.setFilterQueryProvider(new FilterQueryProvider() {
    @Override
    public Cursor runQuery(CharSequence constraint) {
 
        if (constraint == null || constraint.length() == 0) {
 
            return db.rawQuery("select * from " + DatabaseHelper.TABLE, null);
        }
        else {
            return db.rawQuery("select * from " + DatabaseHelper.TABLE + " where " +
                DatabaseHelper.COLUMN_NAME + " like ?", new String[]{"%" + constraint.toString() + "%"});
            }
    }
});
```
Сущность этого провайдера заключается в выполнении SQL-выражений к бд, а именно конструкций "select from" и "select from where like". Данные простейшие выражения выполняют регистрозависимую фильтрацию. В результате адаптаре получает отфильтрованные данные.

Следует также отметить следующий код:
```
if(!userFilter.getText().toString().isEmpty())
    userAdapter.getFilter().filter(userFilter.getText().toString());
```
Данный код нам нужен при смене ориентации (например, с портретной на альбомную). И если ориентация устройства изменена, но в текстовом поле все же есть некоторые текст-фильтр, то выполняется фильтрация. Иначе бы она не выполнялась.

-------------------------------------------------------

**Модель, репозиторий и работа с базой данных**

https://metanit.com/java/android/14.6.php

добавим класс модели - User
Для взаимодействия с базой данных SQLite добавим новый класс DatabaseHelper
для работы с базой данных добавим в проект класс DatabaseAdapter:

Непосредственно для работы с данными в классе определены методы insert() (добавление), delete() (удаление), update() (обновление), getUsers() (получение всех пользователей из таблицы) и getUser() (получение одного пользователя по id).

В классе UserActivity опредлим логику добавления/изменения/удаления пользователя:


В переопределенном методе onResume() через объект DatabaseAdapter получаем всех пользователей из базы данных и через ArrayAdapter выводим их в ListView.

При нажатии на элемент ListView запускаем UserActivity, передавая ей id выделенного пользователя.

При нажатии на кнопку просто вызываем UserActivity.

 
-------------------------------------------------------
**Buttons: floating action button** 

(MATERIAL DESIGN)
A floating action button (FAB) represents the primary action of a screen.

https://m2.material.io/components/buttons-floating-action-button/android

https://guides.codepath.com/android/floating-action-buttons#floating-action-icons

-------------------------------------------------------
# Material Design

**Android Material Design для начинающих**
	https://devcolibri.com/course/android-material-design-%D0%B4%D0%BB%D1%8F-%D0%BD%D0%B0%D1%87%D0%B8%D0%BD%D0%B0%D1%8E%D1%89%D0%B8%D1%85


Урок 4. Floating actions menu
	https://devcolibri.com/unit/%d1%83%d1%80%d0%be%d0%ba-4-floating-actions-menu/?id=6162
	
Урок 6. NavigationDrawer
	https://devcolibri.com/unit/%d1%83%d1%80%d0%be%d0%ba-6-navigationdrawer/?id=6162
	
-------------------------------------------------------
# Ресурсы

**Иконки**

**material-design-icons**
	https://github.com/google/material-design-icons
	https://fonts.google.com/icons?icon.set=Material+Icons

-------------------------------------------------------
# UX/UI

**UI в Sketch для начинающих**

https://devcolibri.com/course/ui-%D0%B2-sketch-%D0%B4%D0%BB%D1%8F-%D0%BD%D0%B0%D1%87%D0%B8%D0%BD%D0%B0%D1%8E%D1%89%D0%B8%D1%85/


-------------------------------------------------------

