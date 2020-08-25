#Autor: yolais.0911@hotmail.com
# language: es


Característica: Ordenador de Ofertas
  Yo como usuario de wappi
  Quiero ordenar la informacion de las ofertas
  Para tener mejor claridad sobre los productos

  Escenario: Ordenar en forma ascendente los productos por precio
    Dado que Yohana quiere usar Wappi
    Cuando Ella diligencia el formulario
      | nombreUsuario | contrasena |
      | usuarioPrueba | 1234567890 |
    Cuando Ella ordena ascendentemente los precios
    Entonces Ella valida que esten ordenados correctamente
