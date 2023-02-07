#language: es
#author: Ian Bravo Manuel

Característica: Editar cliente

  @EditarCliente
  Esquema del escenario: : Editar cliente correctamente
    Dado que "Ian" ingresa a la aplicacion
    Cuando introduce las credenciales
      | <usuario> | <clave> |
    Y accede a la seccion de Clientes
    Y selecciona el cliente "<clienteID>"
    Y edita la siguiente informacion:
      | <contactName> | <contactTitle> | <address> | <country> | <city> | <phone> |
    Entonces se debe visualizar los cambios realizados
    Ejemplos:
      | usuario | clave    | clienteID | contactName     | contactTitle | address          | country | city      | phone      |
      | admin   | serenity | HAB       | Nicole Zambrano | Pilot        | Diag. 90A #40-40 | Denmark | Kobenhavn | 3216789090 |
