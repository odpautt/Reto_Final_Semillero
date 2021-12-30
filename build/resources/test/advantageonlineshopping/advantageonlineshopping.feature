@test
Feature: Ver diferentes categorias de productos

  Yo como gerente de marketing de  Demonecesito implementar un portal web en el que se exhiban diferentes productos de tecnologia por categoria
  para la compra de articulos online y asi poder saber la tendencia de los articulos de tecnologia que tienen mayor demanda


  Scenario: el usuario deberia  poder ver las diferentes categorias de productos
    Given que el usuario ingresa a la pagina de inicio
    When carga el contenido
    Then deberia poder ver las diferentes categoria



  Scenario: el usuario deberia  poder ver un espacio publicitario
    Given que el usuario esta en la pagina de inicio
    When carga se el contenido de la pagina
    Then deberia poder ver un espacio publicitario


  Scenario: el usuario deberia poder ver un menu de opciones
    Given que el usuario esta en la pagina de inicio del portal
    When carga el contenido de la pagina
    Then deberia poder ver un menu de opciones
      |opcion1            |opcion2             |opcion3             |opcion4          |
      |    OUR PRODUCTS   |    SPECIAL OFFER   |   POPULAR ITEMS    |    CONTACT US   |
