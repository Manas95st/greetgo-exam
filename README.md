Чтобы скачать с гитхаба проект запускаем git и набираем команду
https://github.com/Manas95st/greetgo-exam.git
Открываем проект с помощью IDE, ждем пока зависимости скачаются Maven-ом. 

В файле src\main\webapp\WEB-INF\spring\appServlet\servlet-context.xml изменяем строку номер 34 для работы с базы данных. Набираем имя пользователя и пароль.
Создаем базу данных MySql  "student", импортируем в него файл students.sql, который находиться в корневом каталоге проекта.
Выполняем проект в вашем IDE (Run as -> Run on Server). 

Заходим в localhost:8080/exam1/

Логин: admin
Пароль: admin
