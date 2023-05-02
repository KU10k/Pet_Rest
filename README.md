# Pets
___

## Описание:
Web версия.


 ## __Инструменты__

[![IntelliJ IDEA](https://github.com/Alexey7721/product-and-reviews/raw/master/icons/intellij-idea-48.png)](https://www.jetbrains.com/idea/)
[![Java](https://github.com/Alexey7721/product-and-reviews/raw/master/icons/java-coffee-cup-48.png)](https://www.java.com/ru/)
[![PostgreSQL](https://github.com/Alexey7721/product-and-reviews/raw/master/icons/pgSQL.png)](https://www.postgresql.org/)
[![Spring](https://github.com/Alexey7721/product-and-reviews/raw/master/icons/spring-48.png)](https://spring.io/)
[![XML](https://github.com/Alexey7721/product-and-reviews/raw/master/icons/xml-48.png)](https://www.xml.com/)
[![Hibenate](https://github.com/Alexey7721/product-and-reviews/raw/master/icons/hibernate-1.png)](https://hibernate.org/)
[![Visual studio code](https://github.com/Alexey7721/product-and-reviews/raw/master/icons/visual-studio-code-2019-48.png)](https://code.visualstudio.com/)
<br> 


## __Установка и настойка__
### Перед запуском данного кода:
- #### Создайте базу данных и таблицы;


```postgresql
create table animal
(
    id                serial primary key,
    pets              varchar(45),
    petName           varchar(45),
    age               varchar(45),
    sex_of_the_animal varchar(45),
    city              varchar(45),
    email             varchar(45),
    phone_number      varchar(45)

);
```

- ### В application.properties укажите название, имя пользователя и пароль базы данных.
```xml
databases.url=jdbc:postgresql://localhost:5432/НАЗВАНИЕ_БД?useSSL=false&amp;serverTimezone=UTC
databases.username=ЛОГИН
databases.password=ПАРОЛЬ
databases.driver=org.postgresql.Driver
```
