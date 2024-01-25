#QUESTAO1 #########################################################################################################################

# def soma_harmonica(posi ):
#     if posi == 1:
#         return 1
#     return posi + soma_harmonica(posi-1)

# res = soma_harmonica(5, 5)
# print(5)

#QUESTAO2 #########################################################################################################################

# def bissexto():
#     while True:
#         n = int(input('Digite o num: '))
#         print()
#         if n%4==0 and n%100!=0: print('Foi um ano bissexto.'); print()
#         else: print('Nao foi ano bissexto.'); print()
# bissexto()

#QUESTAO3 #########################################################################################################################

# def linha():
#     print('~'*50)

# def menu():
#     print()
#     linha()
#     print('LISTA TELEFOICA - MENU'.center(50))
#     linha()
#     print()
#     cont = 1
#     for i in opçoes:
#         print(f'{cont} - {i}\n')
#         cont+=1
#     cont+=1

# def cadastrarpessoa(pessoa,dicio):
#     print(pessoa)
#     if pessoa in dicio.keys():
#         print('\nPessoa ja cadastrada.')
#     else:
#         dicio[pessoa] = ''


# def cadastrarnum(pessoa,dicio):
#     if pessoa in dicio.keys():
#         dicio[pessoa] = int(input(f'\nDigite o numero que deseja cadastrar para {pessoa}: '))
#     else:
#         print('\nPessoa nao esta cadastrada.')
    
# def excluirpessoa(pessoa,dicio):
#     for i in dicio.keys():
#         if pessoa in dicio.keys():
#             del(dicio[pessoa])

# def consultar(n,dicio):
#     for chave, valor in dicio.valoes():
#         if valor == n:
#             print(valor)


# dicio = {}
# opçoes = ['CADASTRAR PESSOA', 'CADASTRAR NUMERO', 'EXCLUIR PESSOA','CONSULTAR NUMERO','SAIR DA LISTA']

# while True:
#     menu(); linha()
#     op = int(input('Digite uma das opções: '))
#     if op == 1:
#         cadastrarpessoa(str(input('\nDigite o nome da pessoa que deseja cadastrar: ')),dicio)
#     if op == 2:
#         cadastrarnum((str(input('\nDigite o nome da pessoa que deseja cadastrar o numero: '))),dicio)
#     if op == 3:
#         excluirpessoa(str(input('Digite o nome da pessoa que desejava remover da lista: ')), dicio)
#     if op == 4:
#         consultar()
#     if op == 5:
#         break
# print(dicio)

#QUESTAO4 ################################################################################################################################

def linha():
    print('~'*50)

def menu():
    print()
    linha()
    print('LISTA TELEFONICA - MENU'.center(50))
    linha()
    print()
    cont = 1
    for i in opçoes:
        print(f'{cont} - {i}\n')
        cont+=1
    cont+=1

def cadastrarpessoa(pessoa,dicio):
    print(pessoa)
    if pessoa in dicio.keys():
        print('\nPessoa ja cadastrada.')
    else:
        dicio[pessoa] = ''


def cadastrarnum(pessoa,dicio):
    if pessoa in dicio.keys():
        dicio[pessoa] = int(input(f'\nDigite o numero que deseja cadastrar para {pessoa}: '))
    else:
        print('\nPessoa nao esta cadastrada.')
    
def excluirpessoa(pessoa,dicio):
    for i in dicio.keys():
        if pessoa in dicio.keys():
            del(dicio[pessoa])

def consultar(n,dicio):
    for chave, valor in dicio.valoes():
        if valor == n:
            print(valor)

def fazerbackup(dicio):
    print('Fazendo Backup...')
    with open('backup.txt', 'a' ) as arquivo:
        linhas = arquivo.readline()
        for linha in linhas:
            arquivo.write(linha)

def consultarbackup():
    with open('backup.txt', 'r') as arquivo:
        arquivo.read()

        
dicio = {}
opçoes = ['CADASTRAR PESSOA', 'CADASTRAR NUMERO', 'EXCLUIR PESSOA','CONSULTAR NUMERO', 'FAZER BACKUP', 'CONSULTAR BACKUP','SAIR DA LISTA']

while True:
    menu(); linha()
    op = int(input('Digite uma das opções: '))
    if op == 1:
        cadastrarpessoa(str(input('\nDigite o nome da pessoa que deseja cadastrar: ')),dicio)
    if op == 2:
        cadastrarnum((str(input('\nDigite o nome da pessoa que deseja cadastrar o numero: '))),dicio)
    if op == 3:
        excluirpessoa(str(input('Digite o nome da pessoa que desejava remover da lista: ')), dicio)
    if op == 4:
        consultar()
    if op == 5:
        fazerbackup(dicio)
    if op == 6:
        consultarbackup()
    if op == 7:
        break
print(dicio)