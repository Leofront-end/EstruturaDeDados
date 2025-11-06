loop = int(input())
resposta = []
for i in range(0,loop):
    lista = input().split(' ')
    lista = list(set(lista))
    lista = sorted(lista)
    resposta.append(lista)

for l in range (0,len(resposta)):
    for r in range(0, len(resposta[l])):
        if r == len(resposta[l])-1:
            print(resposta[l][r])
        else: print(resposta[l][r], end=' ')