#Autor: yolais.0911@hotmail.com
# language: es


Característica: Validar cupon
  Yo como usuario de wappi
  Quiero utizar el cupon de bienvenida
  Para ser descontado del pedido

  @Test1
  Escenario: Validar cantidad de veces utilizadas por cupon
    Dado que Yohana quiere usar Wappi
    Y Ella diligencia el formulario
      | nombreUsuario | contrasena |
      | usuarioPrueba | 1234567891 |
    Y obtiene el cupon de bienvenida
    Cuando Ella realiza pedidos utilizando el cupon de bienvenida
    Y Ella realiza pedidos utilizando el cupon de bienvenida
    Entonces Ella valida que solo lo pueda utilizar dos veces

  Escenario: Verificar cupon inexistente
    Dado que Yohana quiere usar Wappi
    Y Ella diligencia el formulario
      | nombreUsuario | contrasena |
      | usuarioPrueba | 1234567891 |
    Cuando Ella utiliza el cupon QCFSTR1KO
    Entonces  Ella valida que el cupon no se puede usar
