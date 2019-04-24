# -*- coding: utf-8 -*-
"""
OrdenaLista v1
Autor: Wellington Carvalho
Função: Escreva um programa que ordene 
uma lista numérica com três elementos
"""

lista = [3,2,1,100,500,30,70]

for i in range(len(lista)):

	menor = i

	for j in range(i+1, len(lista)):

		if lista[j] < lista[menor]:
			menor = j

	if lista[i] != lista[menor]:
		aux = lista[i]
		lista[i] = lista[menor]
		lista[menor] = aux

print(lista)

