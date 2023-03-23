# Ревью кода №1
## Неполное условие:
```java
    public static boolean isLeapYear(int year) {
        // здесь нужно определить, является ли переданный год високосным
        if (year % 4 == 0)return true;
        return false;
    }
```

Там по условию "год является високосным, если его номер кратен 4, но не кратен 100, а также если он кратен 400."
Поэтому не все входные параметры могут быть правильны.

Поэтому корректным условием будет:
```java
if(currentYear % 400 == 0 || (currentYear % 100 != 0 && currentYear % 4 == 0)){
    //
        }
```

Здесь у нас идет проверка того, что введенный год (делится на 4 И не делится на 100) ИЛИ (делится без остатка на 400).

## Отсутствует разница между выводами:
- Если год високосный, то мы выводим 12.09
```java
System.out.println("Високосный год: " + "12.09." + leapChecker.getCurrentYear());
```
- Если не високосный, то мы выводим 13.09
```java
System.out.println("Не високосный год: " + "13.09." + leapChecker.getCurrentYear());
```
- Плюс есть небольшие проблемы с выводом самого числа, в консоли получается седеющее: `этот год високосный год 12.091900.`