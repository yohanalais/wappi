#Autor: yolais.0911@hotmail.com
# language: es


Característica: Realizar pedidos
  Yo como usuario de wappi
  Quiero tener habilidad de generar pedidos
  Para realizar compras

  Antecedentes:
    Dado que Yohana quiere usar Wappi
    Cuando Ella diligencia el formulario
      | nombreUsuario | contrasena |
      | usuarioPrueba | 1234567891 |

  @Test1
  Escenario: Pedir una orden con cupon de bienvenida
    Y obtiene el cupon de bienvenida
    Cuando Ella realiza pedidos utilizando el cupon de bienvenida
    Entonces Ella visualiza el uso del cupon Si

  @Test2
  Escenario: Pedir una orden sin cupon de bienvenida
    Cuando Ella realiza pedidos sin cupon de bienvenida
    Entonces Ella visualiza el uso del cupon No

  @Test3
  Escenario: Validar datos del pedido en modal
    Cuando Ella  obtiene los datos de la oferta
    Entonces Ella visualiza los datos en el modal

  @Test4
  Escenario: Validar historial de pedidos
    Cuando Ella  obtiene los datos de la oferta
    Y Ella realiza el pedido
    Entonces Ella visualiza en su historial los datos del pedido realizado