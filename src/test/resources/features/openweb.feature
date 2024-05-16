@Succesful
Feature: Abrir una pagina

Yo como usuario
  quiero realziar una pagina
  para comprobar el resultado
Scenario: Abrir navegador exitosamente
  Given "Alberto" abre el sitio web de pruebas
  When cuando ingres al navegador
  Then visualizara el titulo de la pagina "cucumber"

