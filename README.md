# 📝 Exercícios P1 - Técnicas de Programação

Atividade desenvolvida na **FATEC Praia Grande** para a aula de **Técnicas de Programação**, reunindo os exercícios práticos preparatórios para a avaliação P1.

## 📋 Sobre o Projeto

Este projeto reúne **3 exercícios fundamentais** que abordam desde a modelagem básica de classes até conceitos avançados de encapsulamento e manipulação de arrays paralelos em Java.

O objetivo principal é aplicar conceitos como:
```
*   Modelagem de Classes: Criação de estruturas para representar objetos do mundo real.
*   Encapsulamento: Proteção de dados através de modificadores de acesso privados e métodos Getters/Setters.
*   Arrays Paralelos: Gerenciamento de dados sincronizados por índices.
*   Lógica de Negócio: Implementação de regras como descontos automáticos e gestão de estoque.
*   Interação com o Usuário: Entrada e saída de dados via console.
```
## 🚀 Tecnologias Utilizadas

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)<br>
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)

## 📁 Estrutura do Projeto

```
src/
└── br/
    └── edu/
        └── fatecpg/
            └── tecprog/
                └── exerciciop1/           
                    ├── model/
                    │   ├── Carro.java
                    │   ├── Aluno.java
                    │   └── Farmacia.java
                    └── view/
                        └── Main.java
```

## 🧱 Exercícios e Modelagem Orientada a Objetos

### 🔹 1. Sistema de Inventário AutoDrive (Modelagem Básica)

**Cenário:** A concessionária AutoDrive precisa modernizar seu controle de estoque, substituindo planilhas manuais por um sistema de inventário.

| Tipo | Descrição |
| --- | --- |
| **Classe** | `Carro` |
| **Atributos** | `marca`, `modelo`, `ano` (Públicos para protótipo inicial) |

*   **Funcionalidade:** O sistema simula a chegada de um veículo, instancia o objeto, atribui os valores e gera um relatório completo para o gerente.

---

### 🔹 2. Gestão Acadêmica (Encapsulamento)

**Cenário:** Refatoração do sistema para garantir a segurança dos dados, impedindo alterações diretas sem validação.

| Tipo | Descrição |
| --- | --- |
| **Classe** | `Aluno` |
| **Atributos** | `nome`, `matricula`, `notaFinal` (Privados) |
| **Métodos** | Getters e Setters para acesso controlado |

*   **Funcionalidade:** Simula o cadastro de um aluno utilizando Setters e exibe um boletim escolar organizado através dos Getters.

---

### 🔹 3. Controle de Estoque VidaSaúde (Arrays Paralelos)

**Cenário:** Gestão de medicamentos para evitar prejuízos com produtos vencidos, automatizando alertas e descontos.

| Tipo | Descrição |
| --- | --- |
| **Classe** | `Farmacia` |
| **Estrutura** | Arrays paralelos: `nomesMedicamentos`, `diasParaVencimento`, `precos` |

**Funcionalidades Operacionais:**
*   Listagem completa de produtos e prazos.
*   Cálculo da média de dias para vencimento.
*   Alerta de vencimento próximo (menos de 5 dias).
*   **Desconto Automático:** Aplicação de 50% de desconto em produtos próximos ao vencimento.
*   **Venda:** Remoção de itens do estoque após a transação.

## 👤 Autor

| Nome |
| --- |
| Carlos Roberto |
