# Используем базовый образ Java 17
FROM openjdk:17-jdk-alpine

# Устанавливаем рабочую директорию в контейнере
WORKDIR /app

# Копируем файлы проекта в контейнер
COPY target/api-gateway-*.jar /app/api-gateway.jar

# Запускаем приложение
CMD ["java", "-jar", "/app/api-gateway.jar"]