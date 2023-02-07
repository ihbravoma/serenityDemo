#language: es
#author: Ian Bravo Manuel

Característica: Crear cliente

  @CrearCliente
  Esquema del escenario: : Crear cliente correctamente
    Dado que "Ian" ingresa a la aplicacion
    Cuando introduce las credenciales
      | <usuario> | <clave> |
    Y accede a la seccion de Clientes
    Y diligencia los datos con la siguiente informacion:
      | <customerID> | <companyName> | <contactName> | <contactTitle> | <address> | <country> | <city> | <phone> |
    Entonces se debe visualizar la creacion del cliente
    Ejemplos:
      | usuario | clave    | customerID | companyName    | contactName | contactTitle      | address          | country | city   | phone      |
      | admin   | serenity | HAB        | Hector Company | Ian Bravo   | Software Engineer | Diag. 81B #76-76 | Spain   | Madrid | 3157006543 |