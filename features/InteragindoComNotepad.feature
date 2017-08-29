#Author: carolcruzc@gmail.com
##https://github.com/carolcruzc/

#encoding: iso-8859-1

Feature: Interagir com Notepad
	eu quero utilizar o notepad
	escrever um texto
	e salvar meu documento


Scenario: Criar documento do Notepad
Given Abrir novo documento em branco 
And Escrever no word "Hello World"
When Solicitar salvar documento
	And escolher a pasta onde armazenar
	And nomear meu documento
Then Salvar meu documento
	