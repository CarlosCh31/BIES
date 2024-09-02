# Proyecto Planeta BIES

Autores:
Carlos Chavarria
Amanda Esquivel
Hazel Molina
Maria Hernandez

Este es un proyecto Maven para PlanetaBies basado en la vida animal que este planeta tiene. El proyecto está configurado para compilar, testear, generar Javadoc, empaquetar en un JAR, y desplegar en GitHub Packages utilizando Maven.


## Requisitos

- **Java Development Kit (JDK) 21 o superior**
- **Maven 3.6.3 o superior**
- **Git (para autenticación en GitHub Packages)**

## Instrucciones para Compilar

1. Compila el proyecto utilizando Maven

    ```bash
    mvn clean compile

2. Ejecutar las pruebas

    ```bash
    mvn test

3. Generar la documentación Javadoc

    ```bash
    mvn javadoc:javadoc

4. Empaquetar el proyecto en un JAR

    ```bash
    mvn package