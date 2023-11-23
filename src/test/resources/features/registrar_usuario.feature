Feature: registrar un nuevo usuario
  dado que estoy en el sitio de registro

  Scenario: registrar usuario nuevo
    Given que me encuentro en el sitio de registro de la app
    When escribo los datos para un correcto registro
    Then el registro debe agregarse sin errores
