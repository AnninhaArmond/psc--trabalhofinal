# Trabalho Prático: Programação de Soluções Computacionais  

## Dupla  
### Ana Luiza Mattos de Carvalho  
### Anna Clara de Pinho Armond Cassimiro

## 1. Proposta de Problema:
### Sistema de gerenciamento de doações. Este sistema seria projetado para **ajudar as vítimas de uma enchente** no Rio Grande do Sul. O sistema deve ser capaz de realizar as seguintes funções:  
- Receber Doações: O sistema terá uma tela com entradas onde os doadores possam informar os detalhes da doação, como o tipo de doação (dinheiro, alimentos, roupas, etc.), a quantidade e a data da doação.  
- Calcular Total de Doações: O sistema será capaz de calcular o total de doações recebidas. haverá uma função que some todas as doações e apresente o total em uma interface fácil de entender.  
- Armazenar Informações de Doações: Todas as informações sobre as doações serão armazenadas em um banco de dados ou arquivo texto. Isso permitirá que as informações sejam recuperadas e analisadas posteriormente.

## 2. Requisitos Funcionais:
### Tela de Recebimento de Doações:  
- Tipo de Doação: Receber o tipo de doação (dinheiro, alimentos, roupas, etc.).  
- Quantidade: Receber a quantidade de itens doados.  
- Data da Doação: Receber a data em que a doação foi feita.  
### Cálculo do Total de Doações:  
- Soma de Doações: Somar todas as doações recebidas.  
- Apresentação do Total: Exibir o total de doações em uma interface clara.  
### Armazenamento de Informações de Doações:  
- Banco de Dados ou Arquivo Texto: Armazenar todas as informações sobre as doações em um banco de dados ou arquivo de texto.  
- Recuperação de Informações: Permitir a recuperação das informações de doações para análise posterior.

## 3. Critica à IA:  
#### A Inteligência artifical 'ARIA' demonstrou ser eficaz para identificar requisitos funcionais do enunciado que lhe fora fornecido. No entento, existem algumas áreas onde precisa de aprimoramento:  
- Precisão: Embora os requisitos funcionais identificados pela IA sejam precisos, eles são apresentados num formato simples. Para maior clareza e facilidade de compreensão, os requisitos devem ser expressos de forma mais estruturada, usando técnicas como Especificação de Requisitos Baseada em Casos de Uso (URBS) ou Linguagem de Modelagem de Requisitos (RML).
- Justificativa: A IA não forneceu justificativa para os requisitos funcionais identificados. Incluir referências aos livros da bibliografia do curso ou a outras fontes confiáveis fortaleceria a análise e demonstraria uma compreensão mais profunda dos princípios de engenharia de requisitos.

## 4. Diagrama de Classes:  
#### Doador:  
-id_doador    
-nome    
-email    
-telefone  
+CadastrarDoador()  
+AlterarDadosDoador()  
+BuscarDoador()  
+ListarDoadores()  
   
 ##### Doação:             
-id_doacao            
-id_doador        
-tipo_doacao             
-quantidade         
-data_doacao          
+CadastrarDoacao()        
+AlterarDadosDoacao()   
+BuscarDoacao()         
+ListarDoacoes()        
+CalcularTotalDoacoes()  

#### TotalDoações:  
-totaldoacoes  
+ObterTotalDoacoes()  



