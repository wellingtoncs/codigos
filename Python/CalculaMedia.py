# -*- coding: utf-8 -*-
"""
CalculaMedia v1
Autor: Wellington Carvalho
Função: Faça um programa que receba duas notas 
digitadas pelo usuário. Se a nota for maior ou 
igual a seis, escreva aprovado, senão escreva reprovado
"""

nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))

media = (nota1+nota2)/2

print ("Sua media é %f" %(media))

if media >= 6:
	print("Aprovado")
else:
	print("Reprovado")