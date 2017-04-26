# Loja
Projeto realizado com Maven, JPA ORM, JAXB API, Pattern DAO e Banco de Dados MySQL para a gestão de pedidos via XML.
1 - O teste possui uma aba com duas opções de cadastro sendo: 
Clientes(Onde é possível consultar os clientes já cadastrados, clique nessa opção para
visualizar todos os clientes já cadastrados anteriormente)
Pedidos(Cadastro de novos pedidos onde o usuário irá importar um arquivo XML e o 
formulário receberá as entradas dos campos)

2- Clicando na opção pedidos para que o usuário insira um novo pedido é necessário abrir 
e logo a seguir importar um novo arquivo XML, para isso clique no botão "Abrir XML" e loca-
lize o diretório que se encontra no caminho: Loja-master\Loja\formularioPedido\pedido.xml
(obs: esse arquivo é editável sendo possível editar as tags com os valores exceto deixar
as tags da data de cadastro em branco ou 0, e a data deve ser inserida no formato yyyy-MM-dd)

3- Feito isso clique em importar XML para importar o arquivo a seguir, os dados deverão 
aparecer nos campos de texto sendo também possível editá-los. Logo após para inserir o usuário
clique no botão Submeter Pedido, o usuário também poderá cancelar o pedido o que desabilitará o 
botão Submeter Pedido.

4- Caso deseja-se consultar algum pedido realizado o usuário deverá clicar duas vezes na linha deseja-
da na tabela, e os campos aparecerão nos campos de texto.

5- Caso deseja-se excluir algum registro o usuário deverá clicar duas vezes na linha desejada
da tabela e realizar a exclusão através do botão "Excluir Pedido".

Se necessário, importe através do MySQL a tabela de criação de scripts do teste em:
Loja-master\Banco de Dados\loja.sql
