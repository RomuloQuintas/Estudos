# -*- coding: utf-8 -*-
"""exe_funcao.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1YJGDybIZUPgaVBHfa2aVYRjeLmJBXYgn
"""

# def digitados (n):
#   if not(type(n)==int)
#     return
#   result = 1
#   if n > 0:
#     n*=-1
#   while n>0:
#     n//=10
#     if n>0:
#       result+=1
#   return result

#   digitos(0)

# 6
# def potencia(a,b):# Pega e base e o expoente
#   base = 1 # Declara a variavel base como 1 que sera o caso neutro da multiplicaçao
#   if b==0: # caso o expoente for 0, e todo numero elevado a 0 é igual a 1
#     return 1 # entao o resultado sera 1
#   else:
#     for i in range(1,b+1): # Interaçoes de 1 ate o valor do expoente
#       base = base * a # A cada interaçao a base sera multiplicada com a e incrementando
#     return base # retorna a base que sera o resultado
# print(potencia(2,3))

# def rec (*valores):
#   print()

# def soma(q,w,e):
#   result = q+w+e
#   return result
# soma(2,4,6)

# def poun(n):
#   if n%2==0:  return 'P'
#   if n%2!=0:  return 'N'
# poun(123)0


# def reverter(num):
#   lista = []; reverse=''      #inicia declarando a lista vazia e a variavel que reberá os caracteres
#   for i in range(0,len(num)): #for de de 0 ate o len do numero
#     lista.append(num[i])      #for é para pegar os caracteres da srt num e add em na lista
#     i+=1                      #incrementa i+1 para que add todos os caracteres da str

#   for i in range(1,len(lista)+1): #esse segundo for serve para pegar o elementos da lista
#     reverse += lista[-i]          #e concatenar na variavel reverse de traz para frente
#     i+=1                          #assim incrementado o i e decrementando a posição na lista
#   num_revertido = int(reverse)    #aqui apenas converte de srt para int
#   return num_revertido            #retorno o resultado e assim finalizando

# num = str(1234) # terminei o numero / pedi ao usuario, convertendo para str
# reverter(num) #chamei a função ja convertida

# def num_digi(num):
#   cont=0
#   for i in num:
#     cont+=1
#   return cont
# num = str(134352)
# num_digi(num)


# def potencia(base,expoente):
#   resultado = 1
#   for i in range(expoente):
#     resultado = resultado * base
#   return resultado

# base = 3; expoente = 5;
# potencia(base,expoente)

def alg_roma(decimal):
  romanos = ((1000,'M'),(900,'CM'),(500,'D'),(400,'CD'),(100,'C'),(90,'XC'),(50,'L'),(40,'XL'),(10,'X'),(9,'IX'),(5,'V'),(4,'IV'),(1,'I'))
  # declaro em tuplas o valor e o algarismo correspondente ao valor
  resultado = '' #variavel em str para ser concatenado futuramente
  for valor, algarismo in romanos: #for declarando os valore e os algarismos da tupla romanos
    div_int = decimal//valor #aqui pega a parte da divisao inteira e
    decimal = decimal%valor
    resultado += algarismo * div_int
  return resultado
decimal = 3022
alg_roma(decimal)