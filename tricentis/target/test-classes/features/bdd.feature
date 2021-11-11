#Author: ronimiguel@gmail.com
@executa  

Feature: Fazer cotacao
  Eu como usuario quero fazer uma cotacao de seguro para validar o valor
Background: Acessar o site da tricentis
	Given que entre no site da tricentis "http://sampleapp.tricentis.com"

  Scenario Outline: Cotacao de seguro
    And clico na cotacao de seguro <tipo>
    When preencho os dados do veiculo <tipo>
    And preencho os dados do seguro
    And preencho os dados do produto <tipo>
    And preencho os dados do valor
    And envio a cotacao
    Then valido o envio do <tipo>
    

Examples:
	|	tipo				|
	| "automobile"|
	| "truck"			|
	| "motorcycle"|
	| "camper"		|