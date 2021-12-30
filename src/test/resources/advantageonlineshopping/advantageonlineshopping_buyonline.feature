
@test
Feature: Realizar la compra en línea de productos de tecnología

  Yo como Usuario  del portal Demo necsito Realizar la compra en línea de productos de tecnología
  para Seleccionar artículos de tecnología de la página, realizando el pago en línea.

  Scenario: La canasta de compras deberia mostrar los detalles del producto a comprar
    Given estoy logueado en el portal demo
    When el usuario agrega un articulo a la canasta de compras
    Then al hacer clic en la casta el sistema deberia mostrar los detalles del producto seleccionado

  Scenario: La canasta de compras deberia mostrar la opcion Shipping Details
     Given que el usuario esta logeado en el portal demo
     And que agrego un articulo a la canasta de compras
     When hace click en checkOut
     Then el portal deberia mostrarle una pantalla con los siguientes datos:
     |nombreUsuario|direccionUsuario|telefonoUsuario |
     |nombre       |direccion       |numerotelefonico|

  Scenario: El usario deberia poder editar la Informacion de Shopping Details
    Given que el usuario esta logeado en el portal
    And que agrego un articulo al carrito de compras
    And esta en la pantalla shipping details
    When hace click Edit shipping details
    Then el usuario deberia poder editar la informacion

  Scenario: el usuario deberia poder visulizar dos opciones de pago
    Given que se logueo en el portal
    And que agrego un articulo a la canasta
    When esta en la pantalla Payment Method
    Then deberia poder visulizar dos opciones de pago
    |opcionPago1|opcionPago2 |
    |SafePay    |Master credit|


  Scenario: el usuari deberia poder ver la opcion de editar tarjeta
    Given que se logueo el usuario en el portal
    And que el usuario agregro un articulo de compra
    When selecciona la opcion de pago Master Credit
    Then deberia poder visualizar la opcion de editar tarjeta de credito


  Scenario: el usuario deberia poder ver los datos de la tarjeta anterior
    Given que se logueo el usuario en el portal
    And que el usuario agregro un articulo de compra
    And selecciona la opcion de pago Master Credit
    When hace click en el link de editar tarjeta
    Then deberia poder visualizar los datos de la tarjeta anterior


  Scenario: el usuario deberia poder ver la opcion Pay Now
    Given que se logueo el usuario en el portal
    And que el usuario agregro un articulo de compra
    When selecciona la opcion de pago Master Credit
    Then  deberia poder visualizar el boton de Pay Now


  Scenario: el usuario deberia poder ver la orden de pago
    Given que se logueo el usuario en el portal
    And que el usuario agregro un articulo de compra
    When selecciona la opcion de pago Master Credit
    And hace click en el boton Pay Now
    Then  deberia poder visualizar la orden de pago con los siguientes campos
    |direccionDeEntrega|medioDePago   |resumenCompra|numeroOrden    |numeroGuia|
    |Shipping to       |Payment method|Order Summary|tracking number|order number|