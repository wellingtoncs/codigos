# -*- coding: utf-8 -*-
"""
OperacaoMatematica v1
Autor: Wellington Carvalho
Função: Escreva um programa que receba dois 
números e um sinal, e faça a operação 
matemática definida pelo sinal
"""

num1 = float(input("Digite o primeiro numero: "))
op = input("Digite o operador: ")
num2 = float(input("Digite o segundo numero: "))

#soma
if op == "+":
	resultado = num1 + num2

#subtração
elif op == "-":
	resultado = num1 - num2

#divisão
elif op == "/":
	resultado = num1 / num2

#multiplicação
elif op == "*":
	resultado = num1 * num2

#modulo
elif op == "%":
	resultado = num1 % num2

#exponenciação
elif op == "**":
	resultado = num1 ** num2

else:
	resultado = "Operador invalido."

print (resultado)