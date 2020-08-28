#Autor: yolais.0911@hotmail.com
# language: es




Característica: Actualizar perfil
  Yo como usuario de wappi
  Quiero ingresar la informacion personal
  Para actualizar el perfil

  Antecedentes:
    Dado que Yohana quiere usar Wappi
    Cuando Ella diligencia el formulario
      | nombreUsuario | contrasena |
      | usuarioPrueba | 1234567891 |


  Escenario: Validar la actualizaciòn de la informacion personal

    Y Ella actualiza los campos del perfil
      | nombre | apellido | fechaNacimiento | genero | pais     |
      | Yohana | Castillo | 09/11/1988      | F      | Colombia |
    Entonces Ella visualiza un mensaje de confirmacion


  Escenario: Validar obligatoriedad de los campos
    Y Ella diligencia el formulario incompleto
      | nombre | apellido | fechaNacimiento | genero | pais     |
      | Yohana | Castillo | 09/11/1988      | F      | Colombia |
    Entonces Ella visualiza un mensaje de validacion en el campo
