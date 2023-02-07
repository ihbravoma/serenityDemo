# Serenity Demo
- Proyecto donde se ejecutan pruebas para validar la creación y edición de clientes.
- Utilización del patrón de diseño Screenplay y framework Serenity.
- Las pruebas se corren desde el navegador de Chrome.
-----
## Requerimientos
1. Tener instalado JDK 1.8.
1. Tener instalado un IDE (preferiblemente IntelliJ).
1. Tener el chromedriver.exe de acuerdo a la versión que tiene instalada en su PC.
1. Tener instalado Gradle (preferiblemente la versión 5.6.1).
----
## Ejecución del proyecto
Situarse en la raíz del proyecto desde el cmd y escribir el comando ***gradlew clean test aggregate*** (si hay un reporte anterior lo elimina y crea uno nuevo). El reporte de la prueba se guarda en la ruta ***target/site/serenity/index.html***