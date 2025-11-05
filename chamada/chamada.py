linha = input().split(' ')
loop = int(linha[0])
valor = int(linha[1])

array = []
for i in range(0,loop):
    nome = input()
    array.append(nome)
array.sort()
print(array)
print(array[valor-1])