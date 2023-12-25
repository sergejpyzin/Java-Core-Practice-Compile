# Используем образ с JDK для сборки
FROM openjdk:20 AS builder

# Устанавливаем рабочую директорию в контейнере
WORKDIR /out

# Копируем файл .dockerignore и .gitignore, если они есть



# Копируем исходный код
COPY src/ src/

# Собираем Java-приложение
RUN javac src/ru/serjeypyzin/javacore/sample/*.java src/ru/serjeypyzin/javacore/regular/*.java

# Используем минимальный образ JRE для выполнения
FROM openjdk:20

# Устанавливаем рабочую директорию в контейнере
WORKDIR /out

# Копируем скомпилированные классы и зависимости
COPY --from=builder /out/src /out/src

# Команда для выполнения при запуске контейнера
CMD ["java", "-cp", "src", "ru.serjeypyzin.javacore.sample.Main"]