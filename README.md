# Projeto Calculadora - FinançApp 🧮

## 📖 Descrição do Projeto
Módulo básico de cálculos matemáticos desenvolvido em Java para ser integrado às funcionalidades financeiras da startup fictícia FinançApp. O sistema é capaz de realizar operações de soma, subtração, multiplicação e divisão, contando com validações de regras de negócio.

## 🎯 Objetivo da Atividade
Aplicar práticas de Qualidade de Software, englobando testes funcionais, refatoração de código, tratamento de erros e geração de documentação técnica (JavaDoc), utilizando versionamento em branches separadas.

## 💻 Tecnologias Utilizadas
* **Linguagem:** Java
* **Documentação:** JavaDoc
* **Controle de Versão:** Git / GitHub

## ⚙️ Explicação das Operações
O módulo utiliza o método principal `calc(int a, int b, String op)` que delega o cálculo para métodos privados especializados.
* **Soma (`+`)**: Adiciona dois inteiros.
* **Subtração (`-`)**: Subtrai o segundo inteiro do primeiro.
* **Multiplicação (`*`)**: Multiplica ambos os inteiros.
* **Divisão (`/`)**: Divide o primeiro pelo segundo, retornando um número decimal (`double`).
* **Tratamentos:**
  * Tentativas de divisão por zero são interceptadas, retornando `NaN` (Not a Number) e emitindo um aviso, sem "quebrar" o software.
  * Operadores não mapeados emitem mensagem de alerta para o usuário.

## 🖼️ Prints da Execução dos Testes
![Print dos testes passando](coloque_aqui_o_caminho_ou_link_da_sua_imagem)
> *Nota: Os testes demonstraram 100% de precisão tanto nos caminhos felizes quanto nos tratamentos de erros.*

## 📄 Prints da Documentação JavaDoc
![Print do index.html gerado pelo javadoc](coloque_aqui_o_caminho_ou_link_da_sua_imagem)

## 🔗 Link do Repositório
[Clique aqui para acessar o repositório](cole_seu_link_do_github_aqui)