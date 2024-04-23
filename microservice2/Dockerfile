# Используем базовый образ Java 17
FROM openjdk:17-jdk-alpine

# Устанавливаем рабочую директорию в контейнере
WORKDIR /app

# Копируем файлы проекта в контейнер
COPY target/microservice2-*.jar /app/microservice2.jar

# Запускаем приложение
CMD ["java", "-jar", "/app/microservice2.jar"]