#Autor: �scar Germ�n V�squez <ogvasque@bancolombia.com.co>

Feature: Google Translate
	As a web user
	I want to use google translate
	to translate words between different languages

Scenario: Translate from Spanish to Japanese
	Given that Susan wants to use Google Translate
	When She translates the word gato from spanish to japanese
	Then she should see the word 猫 en the screen
	
Scenario: Translate from English to Korean
	Given that Susan wants to use Google Translate
	When She translates the word airport from english to korean
	Then she should see the word 공항 en the screen