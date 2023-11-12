#Autor:Santiago Tangarife
  #Idioma=Esp

  Feature:Agregar un tv lg a mi carrito en amazon
    Dado que ingrese al sitio web de amazon

  Scenario: buscar la Tv Lg en amazon
    Given que estoy en la pagina principal de Amazon
    When quiero agregar un tv lg a mi carrito
    Then el tv debe agregarse sin errores
