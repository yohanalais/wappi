#Autor: yolais.0911@hotmail.com
# language: es


Característica: Validar formulario de ingreso
  Yo como usuario de wappi
  Quiero ingresar al formulario del logueo
  Para validar sus campos


  Escenario: Validar ingreso a la aplicacion
    Dado que Yohana quiere usar Wappi
    Cuando Ella diligencia el formulario
      | nombreUsuario | contrasena |
      | usuarioPrueba | 1234567891 |
    Entonces Ella valida que el ingreso a la aplicacion es exitoso


  Esquema del escenario: Validar minimo de caracteres del campo usuario
    Dado que Yohana quiere usar Wappi
    Cuando Ella ingresa un nombre de usuario <usuario>
    Entonces Ella visualiza la validacion de minimo de caracteres

    Ejemplos:
      | usuario |
      | joseR   |


  Esquema del escenario: Validar maximo de caracteres del campo usuario
    Dado que Yohana quiere usar Wappi
    Cuando Ella ingresa un nombre de usuario <usuario>
    Entonces Ella visualiza la validacion de maximo de caracteres

    Ejemplos:
      | usuario               |
      | mariaLorenaRestrepoRi |


  Escenario: Validar minimo de caracteres del campo contrasena
    Dado que Yohana quiere usar Wappi
    Cuando Ella ingresa una contrasena eftr54t
    Entonces Ella visualiza la validacion de minimo de caracteres de contrasena


  Escenario: Validar maximo de caracteres del campo contrasena
    Dado que Yohana quiere usar Wappi
    Cuando Ella ingresa una contrasena 34tr54t1hyerdos
    Entonces Ella visualiza la validacion de maximo de caracteres de contrasena