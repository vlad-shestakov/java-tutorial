idea-tutorial.md

-------------------------------------------------------
# ItelliJ IDEA

## Быстрые клавиши IDEA
```
	Горячие клавиши IntelliJ IDEA
		https://xn--80aebiodamj0aw8fua3g.xn--p1ai/intellij-idea
	Краткая шпаргалка по сочетаниям клавиш в IntelliJ IDEA / 30 мая 2014
		https://eax.me/intellij-idea-hotkeys/
/*
ПАНЕЛИ, ОКНА
	Ctrl+Alt+S		- Настройки
	Ctrl + E		- Список недавно открытых файлов с переходом к ним
	Ctr + Shift + E	- Список недавно измененных файлов с переходом к ним
КОМПИЛЯЦИЯ, ЗАПУСК
    Shift-F10 		- Запуск
	CTRL + F9		- Build
ПОИСК
	Shift + Shift 	- Калькулятор / Поиск по всему
	Ctr + N			- Поиска класса по имени и переход к нему
	Ctr + Shift + N	- Поиск файла по имени и переход к нему
	Ctr + F			- Поиск в файле
	Ctr + Shift + F	- Поиск по всем файлам (переход — F4)
	Ctr + F3		- Искать слово под курсором
	F3 / Shift + F3	- Искать вперед/назад
	Ctr + F12		- Панель - Список методов с переходом к их объявлению
	Ctr Alt <-/->	- Перемещение вперед/назад (по переходам через клики)
	Shift Alt <-/->	- Перемещение вперед/назад по стеку поиска
	Alt+F7			- Найти все использования 
					  You can quickly find all places where a particular class, method or variable is used in the whole project by positioning the caret at the symbol's name or at its usage in code and pressing Alt+F7 (Edit | Find | Find Usages in the popup menu).
ПОДСКАЗКИ, ПОМОЩЬ 
	Ctrl + Q 	    - Показать JavaDoc по методу
	Ctrl + P 		- Какие параметры принимает метод
РЕДАКТИРОВАНИЕ
	ALT + INSERT	- Создание объекта
	Shift + F6		- Рефакторинг / Переименовать класс
	CtrlAltL		- Автоформатирование
	CtrlShiftUp/Down - Перемещение строки вверх/вниз
	CtrlShiftBackspace	- Перейти к последнему пути редактирования	
	
	Ctrl+[	Ctrl+]	- Перейти в конец / начало блока кода	 к скобкам { } 
	Ctrl+D			- Дублирование строки
  КЛАССЫ
	Ctr + B			- Перейти к объявлению переменной, класса, метода / Где использовались объекты
	Ctr + Alt + B	- Перейти к реализации
	CtrlN			- Перейти к классу / Поиск класса
	Ctrl + H 		- Панель Иерархии метода	
	CtrlAltB		- Перейти к реализации(-ям)	
	CtrlU			- Перейти к супер методу или супер классу
НАВИГАЦИЯ
  ОКНА, ВКЛАДКИ
	Alt + циферка	Открытие/закрытие окон Project, Structure, Changes и тд
	Alt + <-/->		- Перемещение между вкладками
	Ctr + F4		- Закрыть вкладку
	Ctr + Tab		- Switcher, переключение между вкладками и окнами
	Shift + Esc		- Закрыть активное окно
	F12				- Открыть последнее закрытое окно
	Ctr + колесико	- Zoom, если он был вами настроен (https://eax.me/java-jdbc/)
	
	
  ЗАКЛАДКИ
	ShiftF11		- Показать панель со списком закладок
	F11				- Поставить/убрать закладку	(простая)
	CtrlF11			- Поставить/убрать закладку с номером
	Ctrl(0..9)		- Перейти к закладке с номером 0..9	
	
ШАБЛОНЫ
	Ctrl+Alt+S		- Шаблоны IDEA
	

/**/
```

**Editor basics**
	https://www.jetbrains.com/help/idea/2021.3/using-code-editor.html

**Bookmarks**
	https://www.jetbrains.com/help/idea/bookmarks.html#navigate-bookmarks
```
F11 		- Set unnamed bookmark
Ctrl + F11 	- Set Named Bookmark
Ctrl + 1	- Go to Bookmark 1
```

**TODO comments**
	https://www.jetbrains.com/help/idea/using-todo.html


-------------------------------------------------------
## Шаблоны IDEA

Ctrl+Alt+S

```
	// sout
	System.out.println();
	// main or psvm
	public static void main(String[] args){
	// fori
	for (int i = 0; i < ; i++) { -- }
	// ifn
	if (var == null) {--
	}
```
	
-------------------------------------------------------
