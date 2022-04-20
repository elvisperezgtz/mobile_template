Feature: Inicio de sesion

  Como usuario
  Yo quiero una opcion de inicio de sesion
  Para poder ingresar con mis credenciales a la app

  Background: inicia aplicacion
    Given el esta en la pantalla de inicio de sesion

  @test1
  Scenario: Inicio de sesion exitoso
    When el ingresa el usuario "standard_user" y el password "secret_sauce"
    Then el deberia poder ingresar a la aplicacion

  Scenario: Inicio de sesion con el usuario generico
    When el inicia sesion con el usuario generico
    Then el deberia poder ingresar a la aplicacion