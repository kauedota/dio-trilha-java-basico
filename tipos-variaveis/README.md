# Tipos de Variáveis em Java — Primitivos e Referência

Este projeto demonstra, com exemplos práticos e explicados, todos os **principais tipos de variáveis em Java**, incluindo os tipos **primitivos** e os tipos **por referência**.

💡 Útil para quem está começando com Java ou quer revisar conceitos básicos de tipos de dados.

---

## ✅ O que o código demonstra

### 🔹 Tipos Primitivos

| Tipo       | Descrição                       | Exemplo                   |
|------------|----------------------------------|----------------------------|
| `byte`     | Números inteiros pequenos       | `byte idadeByte = 30;`     |
| `short`    | Números inteiros maiores        | `short populacaoCidade = 25000;` |
| `int`      | Números inteiros padrão         | `int populacaoBrasil = 215000000;` |
| `long`     | Números inteiros grandes        | `long populacaoMundial = 8000000000L;` |
| `float`    | Números decimais simples        | `float precoProduto = 99.99f;` |
| `double`   | Números decimais com mais precisão | `double saldoBancario = 1000000.75;` |
| `char`     | Caractere único                 | `char letraInicial = 'K';` |
| `boolean`  | Verdadeiro ou falso             | `boolean estaLogado = true;` |

---

### 🔹 Tipos por Referência

| Tipo         | Descrição                                | Exemplo                                   |
|--------------|--------------------------------------------|--------------------------------------------|
| `String`     | Texto (cadeia de caracteres)              | `String nome = "Kaue Dota";`              |
| `Array`      | Lista fixa de elementos                   | `int[] numeros = {1, 2, 3, 4, 5};`         |
| `ArrayList`  | Lista dinâmica                            | `ArrayList<String> frutas = new ArrayList<>();` |
| `HashMap`    | Mapa de chave-valor                       | `HashMap<String, Integer> estoque = new HashMap<>();` |
| `LocalDate`  | Representação de data atual               | `LocalDate hoje = LocalDate.now();`       |
| `Scanner`    | Entrada de dados pelo terminal            | `Scanner scanner = new Scanner(System.in);` |

---

## 🧪 Execução do Código

O código pede que o usuário digite um e-mail e exibe um **resumo de todas as variáveis utilizadas** no final.

### ▶️ Como rodar:
1. Compile o arquivo:

javac TiposVariaveis.java

2. Execute o programa:

java TiposVariaveis