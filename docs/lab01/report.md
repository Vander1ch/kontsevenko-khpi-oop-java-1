Звіт з лабораторної роботи № 1
- **Тема:** Налаштування середовища, Git і GitHub, компіляція та перший запуск Java-програми
- **Виконав:студент групи КН-1025 
Концевенко К.O
- **Викладач:** В. М. Савченко, О. В. Мнушка
- **Місто:** Харків
- **Рік:** 2026

Налаштування середовища
| Компонент | Версія / Опис |
|---|---|
| ОС | Windows 11 Pro 25H2 |
| Git | 2.55.0.windows.3 |
| JDK | 21.0.12.1 2026-08-13 LTS |
| IntelliJ IDEA | 2026.2.2 Community Edition |

**Репозиторій:**https://github.com/Vander1ch/kontsevenko-khpi-oop-java-1.git
**Гілка:** `lab01`

## Мета
Опанування відтворюваного циклу розроблення 
Java-програми: налаштування середовища Java SE, ручна компіляція і запуск через PowerShell, 
зіставлення CLI з IntelliJ IDEA, а також публікація результату в окремій гілці навчального репозиторію через Pull Request.

## Аналіз задачі
- **Припущення:** Використовується актуальний JDK, у системі налаштовані змінні середовища для виклику `java` та `javac` через PowerShell[cite: 2].
- **Обмеження:** Maven і Gradle у цій роботі не використовуються, складання виконується виключно вручну або через стандартні засоби конфігурації IDEA[cite: 2].
- **План розв'язання:** 
  1. Перевірка версій інструментів у PowerShell.
  2. Створення каталогів згідно з пакетною структурою.
  3. Написання вихідних кодів `HelloJava.java` та `EnvironmentReport.java`.
  4. Ручна компіляція у каталог `out/` за допомогою параметра `-d out`.
  5. Запуск програм через `java -cp out`.
  6. Фіксація змін через Git та створення Pull Request

## Структура класів
- **Дерево каталогів:**
  .gitignore
│   kontsevenko-khpi-oop-java-1.iml
│   README.md
│
├───.idea
│       misc.xml
│       modules.xml
│       vcs.xml
│       workspace.xml
│
├───docs
│   └───lab01
│       └───assets
├───evidence
│       env_output.txt
│       git_version.txt
│       hello_output.txt
│       javac_version.txt
│       javap_hellojava.txt
│       java_version.txt
│
├───out
│   └───ua
│       └───khpi
│           └───oop1
│               └───lab01
│                       EnvironmentReport.class
│                       HelloJava.class
│
└───src
    └───ua
        └───khpi
            └───oop1
                └───lab01
                        EnvironmentReport.java
                        HelloJava.java

Алгоритми та опис програми
Для компіляції та запуску в PowerShell використовувалися такі команди:
New-Item -ItemType Directory -Force out
javac -d out src/ua/khpi/oop1/lab01/HelloJava.java src/ua/khpi/oop1/lab01/EnvironmentReport.java
java -cp out ua.khpi.oop1.lab01.HelloJava
java -cp out ua.khpi.oop1.lab01.EnvironmentReport

Тестування і визначення набору даних

![Скриншот перевірки](assets/Screenshot_2026-09-23_172121.png)

Структура класів

![Скриншот перевірки](assets/Screenshot_2026-09-23_172655.png)

## Висновки
Під час виконання лабораторної роботи було успішно налаштовано середовище розробки для мови Java (встановлено JDK 21), 
вивчено базову структуру проєкту та організацію пакетів згідно зі стандартами. Отримано практичні навички ручної компіляції та запуску програм через термінал PowerShell (`javac`, `java -cp`), а також роботи з байткодом (`javap`). Крім того, закріплено навички роботи з системою контролю версій Git (створення гілок, комітів та оформлення Pull Request) і проведення базової відладки в середовищі IntelliJ IDEA.

