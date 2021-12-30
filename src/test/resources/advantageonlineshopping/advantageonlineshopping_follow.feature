@test
Feature: Ver las diferentes redes solciales en la pagina

  Yo Como mercaderista de DEMO necesito Que en la parte inferior de la pagina web aparezcan los link de redes sociales
  para que el usuario tenga la opción de  seguirnos en las diferentes redes sociales.

  Scenario: el usuario deberia al menos 3 redes sociales
    Given que el usuario ingresa a la pagina de inicio del portal
    When se dirige a la parte inferior de la pagina
    Then deberia poder ver al menos tres redes sociales
    |redsocial1|redsocial2|redsocial3|
    |Linkedin  |Twitter   |Facebook|
