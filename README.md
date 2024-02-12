# Desafio: Análise de vendas 2
Fazer a leitura do mesmo arquivo .csv do desafio anterior e gerar o seguinte relatório contendo:

1. **Nome de cada vendedor (sem haver repetição)**
2. **Valor total de vendas**
3. **Fazer o tratemento de exceções caso o usuário digite um caminho inválido para o arquivo .csv**

## Exemplo 1
```plaintext
Entre o caminho do arquivo: c:\temp\in.csv

Total de vendas por vendedor:
Logan - R$ 220443.05
Rachel Roth - R$ 502478.67
Padme Amidala - R$ 473104.63
Victor Von Doom - R$ 478657.40
Barry Allen - R$ 499946.28
Anakin - R$ 477153.54
Kal-El - R$ 444881.58
Wanda Maximoff - R$ 470741.34
```
## Exemplo 2
```plaintext
Entre o caminho do arquivo: c:\temp\in
Erro: c:\temp\in (O sistema não pode encontrar o arquivo especificado)
```

## Ferramentas
Desafio desenvolvido utilizando a linguagem Java e a IDE Intellij Community.


## Instruções de Uso
Antes de prosseguir com as instruções de uso, é requerido que você tenha em sua máquina o Java 20 e o git.

### Instalação
Antes de tudo, recomendo que você, pelo terminal, navegue até o diretório Desktop e rode o comando
```bash
# Clone o repositório
git clone https://github.com/LucasFrancoBN/desafio_analise_venda_2.git

# Acesse o diretório da classe Program
cd desafio_analise_venda_2/src/application
```
Agora basta você digitar no seu terminal
```bash
# Compile o projeto
javac Program.java ../entities/Sale.java
```
Retroceda ao diretório src e compile o programa
```
# Retroceda ao diretório src
cd ../

# Execute o programa
java application.Program
```
