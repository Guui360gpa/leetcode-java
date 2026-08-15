# 🧠 LeetCode em Java

![Java](https://img.shields.io/badge/Java-17-orange?logo=openjdk)
![Build](https://github.com/SEU_USUARIO/leetcode-java/actions/workflows/maven.yml/badge.svg)
![License](https://img.shields.io/badge/license-MIT-blue)

Soluções dos exercícios do [LeetCode](https://leetcode.com/) implementadas em Java, organizadas por tópico, com testes unitários (JUnit 5) e integração contínua via GitHub Actions.

## 📊 Progresso

| Dificuldade | Resolvidos |
|---|---|
| 🟢 Easy | 1 |
| 🟡 Medium | 0 |
| 🔴 Hard | 0 |
| **Total** | **1** |

## 📚 Índice de soluções

| # | Problema | Dificuldade | Tópico | Solução | Teste |
|---|----------|:---:|---|---|---|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | 🟢 Easy | Array, Hash Table | [TwoSum.java](src/main/java/com/GuilhermePaivaAlves/leetcode/TwoSum.java) | [TwoSumTest.java](src/test/java/com/seunome/leetcode/arrays/TwoSumTest.java) |

> A tabela é atualizada a cada novo exercício resolvido.

## 🗂️ Estrutura do projeto

```
leetcode-java/
├── src/
│   ├── main/java/com/seunome/leetcode/
│   │   ├── arrays/
│   │   ├── strings/
│   │   ├── linkedlists/
│   │   ├── trees/
│   │   ├── graphs/
│   │   ├── dp/
│   │   ├── backtracking/
│   │   └── sorting/
│   └── test/java/com/seunome/leetcode/
│       └── (mesma estrutura de pacotes acima)
├── .github/workflows/maven.yml
├── pom.xml
└── README.md
```

Cada solução fica no pacote referente ao seu tópico principal e segue o padrão:

```java
/**
 * LeetCode 1 - Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 * Dificuldade: Easy
 * Tópico: Array, Hash Table
 *
 * Complexidade de tempo: O(n)
 * Complexidade de espaço: O(n)
 */
public class TwoSum {
    // implementação
}
```

## 🚀 Como rodar

Pré-requisitos: JDK 17+ e Maven.

```bash
# Clonar o repositório
git clone https://github.com/SEU_USUARIO/leetcode-java.git
cd leetcode-java

# Rodar todos os testes
mvn test

# Rodar um teste específico
mvn test -Dtest=TwoSumTest
```

## ✅ Convenções

- Cada exercício vem acompanhado de teste unitário (JUnit 5).
- Comentário Javadoc no topo de cada classe com número, link, dificuldade, tópico e complexidade.
- Commits seguem o padrão: `feat: add solution for <Nome> (LeetCode #<numero>)`.
- CI roda `mvn test` automaticamente a cada push/PR na branch `main`.

## 📄 Licença

Este projeto está sob a licença [MIT](LICENSE).
