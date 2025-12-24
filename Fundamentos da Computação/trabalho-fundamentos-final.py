'''missão espacial - caça aos satélites espiões

Descrição:
Neste jogo, você é a comandante de uma base de 
defesa orbital da Terra. Satélites espiões foram 
lançados por uma nação inimiga e estão escondidos 
na órbita terrestre. Sua missão é identificar e 
desativar todos os satélites antes que eles 
transmitam informações sigilosas.


Regras: 
Neste jogo, o espaço orbital é representado por 
uma matriz 6x6. O computador posiciona 
aleatoriamente 4 satélites espiões (1) em setores distintos, enquanto os demais 
permanecem como espaço vazio (0). A cada rodada, você escolhe uma coordenada (linha e 
coluna) para lançar um feixe de interferência. Se houver um satélite na posição escolhida, 
ele será desativado e a célula marcada com -1. O jogo continua até que todos os 4 satélites 
sejam encontrados. 
Após cada tentativa, o programa exibe uma versão oculta da matriz, com as seguintes 
representações: 

● X para satélites desativados (-1), 
● . (ponto) para posições escaneadas onde não havia satélite, 
● ? (interrogação) para posições ainda não verificadas. 

Ao final, o programa deve mostrar uma mensagem de vitória com o número de tentativas 
realizadas. 

Requisitos técnicos mínimos: 
● Criar uma matriz 6x6 com todos os valores inicialmente iguais a 0. 
● Posicionar aleatoriamente 4 satélites (1), sem sobreposição. 
● Solicitar ao jogador os índices da linha e coluna (valores de 0 a 5). 
● Atualizar a matriz com -1 quando um satélite for encontrado. 
● Exibir a matriz a cada rodada com a simbologia descrita acima. 
● Contar e exibir o número total de tentativas ao final da partida. 

Dica para a Geração Aleatória: 
Use a função random.randint() para sortear coordenadas. Antes de adicionar um novo 
satélite, verifique se a posição já está ocupada. Se estiver, sorteie outra até encontrar uma 
célula livre.


AVISO!!!
Rodar o código novamente não dá erro, sendo necessário pará-lo primeiro para reiniciar o jogo. :(

'''

#início
#criação do tabuleiro 

from random import randint

campo = [[0,0,0,0,0,0],[0,0,0,0,0,0],[0,0,0,0,0,0],[0,0,0,0,0,0],[0,0,0,0,0,0],[0,0,0,0,0,0]]
campo2 = [['?','?','?','?','?','?'],['?','?','?','?','?','?'],['?','?','?','?','?','?'],['?','?','?','?','?','?'],['?','?','?','?','?','?'],['?','?','?','?','?','?']]


for k in range(4):
    while True:
        x = randint(0,5)
        y = randint(0,5)
        if campo[x][y] == 0:
            campo[x][y] = 1
            break

'''# IMPORTANTE PARA TESTES!!!
# Print da matriz original (com respostas):
for c in range(len(campo)):
    print(campo[c], end='')
    print()'''

tentativa = 0
while True:
    tentativa += 1
    cont = 0
    for c in range(len(campo2)):
        print(" ".join(campo2[c]), end='')
        print()
    while True:
        try:
            lin = int(input('Diga o índice da linha do satélite (0 até 5): '))
            if lin > 5 or lin < 0:
                 raise ValueError ('Valor inválido, digite um número inteiro entre 0 e 5.')
            elif 0 <= lin <= 5:
                break
        except ValueError:
                print('Valor inválido, digite um número inteiro entre 0 e 5.')
    while True:
        try:
            col = int(input('Diga o índice da coluna do satélite (0 até 5): '))
            if col > 5 or col < 0:
                 raise ValueError ('Valor inválido, digite um número inteiro entre 0 e 5.')
            elif 0 <= col <= 5:
                break
        except ValueError:
                print('Valor inválido, digite um número inteiro entre 0 e 5.')
    if campo[lin][col] == 1:
        campo[lin][col] = -1
        campo2[lin][col] = 'X'
    elif campo[lin][col] == 0:
            campo2[lin][col] = '.'
    elif campo [lin][col] == -1:
            print('Você já desativou esse satélite.')
    for j in range(len(campo)):
        for c in range(len(campo)):
            if campo[j][c] == 1:
                cont += 1
    if cont == 0:
        break
for c in range(len(campo2)):
        print(" ".join(campo2[c]), end='')
        print()
print('ganhou!')
print(f'Você precisou de {tentativa} tentativas para ganhar!')



