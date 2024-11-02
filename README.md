Visão Geral do Projeto
Alunos: Alex Junior Ferreira, Demóstenes Diniz Porto, João Vitor Pereira da Silva e Jonildo Pereira Araújo Junior
Nome do Projeto: Sistema de Gerenciamento de Livros
Descrição: Este projeto é um sistema de controle e organização de livros, utilizando uma estrutura de dados sequencial em Java para armazenamento e gerenciamento das informações. Com uma interface em menu, o sistema permite ao usuário realizar operações como cadastro, listagem, busca e ordenação dos livros registrados.
Objetivo: Proporcionar um sistema eficiente para adicionar, visualizar e organizar informações de livros, permitindo um fácil acesso a dados e funcionalidades que facilitam a busca e manutenção de uma biblioteca ou coleção.
Funcionalidades
Cadastro de Livros: O sistema permite ao usuário adicionar livros a uma lista sequencial, que aumenta automaticamente conforme a demanda.
Listagem de Livros: O usuário pode listar todos os livros cadastrados, com uma função de verificação para evitar exibições em caso de lista vazia.
Ordenação de Livros: Função que organiza os livros em ordem alfabética com base no título, utilizando o método compareTo para comparações de strings.
Busca por Título: O sistema possui uma função que permite buscar um livro específico pelo título, ignorando diferenças de maiúsculas e minúsculas, e retorna uma mensagem de erro se o livro não for encontrado.
Gerenciamento de Capacidade da Lista: A lista sequencial duplica sua capacidade automaticamente ao atingir o limite, otimizando o armazenamento e garantindo o funcionamento contínuo do sistema.
Explicação da estrutura e algoritmo

• Nós escolhemos a estrutura de dados sequencial, pois ela armazena em blocos de memória, ou seja, cada elemento está em uma posição subsequente. Uma vantagem é que ela tem um acesso direto e mais rápido, pois o índice dos elementos é fixo, e você pode acessar qualquer posição diretamente pelo índice.

• Criamos uma classe Livros com os atributos fornecidos e depois criamos um construtor.

• Criamos uma classe Lista Sequencial.

• Criamos um array do tipo Livro e uma variável chamada tamanho. Em seguida, criamos um construtor para inicializar a lista e passamos como parâmetro a capacidade inicial.

• Criamos um método add e passamos como parâmetro a classe Livro.

• Criamos uma condição para identificar se o array de objetos está cheio. Caso ele esteja cheio, duplicamos o seu tamanho. Caso ele não esteja cheio, adicionamos o objeto na primeira posição que estiver livre e somamos a quantidade de elementos existentes + 1.

• Criamos a função listar, que se inicia com uma condição para verificar se a lista está vazia. Se a lista não estiver vazia, entra em um laço de repetição for, que inicia com uma variável temporária chamada i, começando em 0 e indo até o valor da variável quantidade. Por fim, lista todos os objetos do array livros.

• Criamos uma função ordenar livros, que se inicia com um laço de repetição for. Ele pega o elemento na posição i e o compara com o elemento da posição j. O i começa na posição 0, e o j começa na posição i + 1. O i termina na posição quantidade -1 e o j termina na posição quantidade. Para explicar a condição de comparação, usamos o compareTo, que compara os caracteres das duas strings em sequência específica. Começa pelo primeiro caractere de cada string. Se os caracteres diferem, ele retorna com base na diferença desses caracteres. A string com o caractere que aparece depois na tabela Unicode é considerada "maior". Se os primeiros caracteres forem iguais, ele passa para o segundo caractere e assim por diante, até encontrar uma diferença ou terminar de comparar.

• O compareTo retorna um int: se o número for positivo, significa que o título do livro na posição i é maior que o título do livro na posição j. "Maior" refere-se à ordem lexicográfica dos títulos, ou seja, à ordem alfabética dos caracteres nas strings dos títulos.

• A troca ocorre utilizando uma variável temporária temp, que armazena temporariamente o livro na posição i enquanto os valores são realocados.

• Criamos uma função do tipo Livro, que busca um livro pelo título. Passamos como parâmetro uma string titulo e criamos um laço de repetição for que percorre o array de objetos. Depois, criamos uma condição que compara o título do livro na posição i do array de objetos com o título passado como parâmetro, ignorando diferenças de maiúsculas e minúsculas. No fim, ele retorna o livro na posição i. Caso o usuário digite o título de um livro que não existe, aparecerá uma mensagem indicando que o livro não foi encontrado.

• O main é a classe principal. Inicializamos a lista com uma capacidade inicial de 5 objetos e criamos um menu com cinco opções, cada uma chamando uma função correspondente.
