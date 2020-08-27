#Autor: yolais.0911@hotmail.com
# language: es


Característica: Validar cupon
  Yo como usuario de wappi
  Quiero utizar el cupon de bienvenida
  Para ser descontado del pedido

  Antecedentes:
    Dado que Yohana quiere usar Wappi
    Cuando Ella diligencia el formulario
      | nombreUsuario | contrasena |
      | usuarioPrueba | 1234567891 |

  Escenario: Validar cantidad de veces utilizadas por cupon
    Y obtiene el cupon de bienvenida
    Cuando Ella realiza pedidos utilizando el cupon de bienvenida
    Y Ella realiza pedidos utilizando el cupon de bienvenida
    Entonces Ella valida que solo lo pueda utilizar dos veces

  @Test1
  Escenario: Verificar cupon inexistente
    Cuando Ella utiliza el cupon QCFSTR1KO
    Entonces  Ella valida que el cupon no se puede usar
