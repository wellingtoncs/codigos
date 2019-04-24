# -*- coding: utf-8 -*-
"""
EquacaoSegundoGrau v1
Autor: Wellington Carvalho
Função: Escreva um programa que 
resolva uma equação de segundo grau
"""

from math import sqrt

a = float(input("Digite o valor de a: "))
b = float(input("Digite o valor de b: "))
c = float(input("Digite o valor de c: "))

delta = b**2 - 4*a*c
raiz_delta = sqrt(delta)

x1 = (-b + raiz_delta)/(2*a)
x2 = (-b - raiz_delta)/(2*a)

print ("x1 = %f" %x1)
print ("x2 = %f" %x2)