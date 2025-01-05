-- Inserts

-- Restaurantes
INSERT INTO restaurantes (id_restaurante, nome, endereco, contato, horario_abertura, horario_fechamento)
VALUES (seq_restaurante.NEXTVAL, 'Restaurante Sabor Caseiro', 'Rua Principal, 123', '99999-0001', TO_DATE('08:00', 'HH24:MI'), TO_DATE('20:00', 'HH24:MI'));

-- Funcionários
INSERT INTO funcionarios (id_funcionario, nome, contato, disponibilidade)
VALUES (seq_funcionario.NEXTVAL, 'João Silva', '99999-0002', 'Disponivel');

INSERT INTO funcionarios (id_funcionario, nome, contato, disponibilidade)
VALUES (seq_funcionario.NEXTVAL, 'Maria Oliveira', '99999-0003', 'Indisponivel');

-- Clientes
INSERT INTO clientes (id_cliente, nome, contato, endereco)
VALUES (seq_cliente.NEXTVAL, 'Carlos Santos', '99999-0004', 'Rua Nova, 456');

INSERT INTO clientes (id_cliente, nome, contato, endereco)
VALUES (seq_cliente.NEXTVAL, 'Ana Souza', '99999-0005', 'Avenida Central, 789');

-- Entregas
INSERT INTO entregas (id_entrega, quantidade, preco_unitario, status_entrega)
VALUES (seq_entrega.NEXTVAL, 5, 25.00, 'Em andamento');

-- Pedidos Associados à Entrega
INSERT INTO pedidos (id_pedido, id_cliente, data_pedido, status_pedido, endereco_entrega, id_entrega, desconto)
VALUES (seq_pedido.NEXTVAL, 1, SYSDATE, 'Em andamento', 'Rua Nova, 456', 1, 5.00);

INSERT INTO pedidos (id_pedido, id_cliente, data_pedido, status_pedido, endereco_entrega, id_entrega, desconto)
VALUES (seq_pedido.NEXTVAL, 2, SYSDATE, 'Em andamento', 'Avenida Central, 789', 1, 0.00);

-- Itens do Menu
INSERT INTO itens_menu (id_item_menu, nome, descricao, preco)
VALUES (seq_item_menu.NEXTVAL, 'Prato Executivo', 'Arroz, feijão, carne e salada', 25.50);

INSERT INTO itens_menu (id_item_menu, nome, descricao, preco)
VALUES (seq_item_menu.NEXTVAL, 'Prato Light', 'Arroz integral, frango grelhado e legumes', 30.00);

-- Itens do Pedido
INSERT INTO itens_pedido (id_item_pedido, id_pedido, id_item_menu, quantidade, preco_total)
VALUES (seq_item_pedido.NEXTVAL, 1, 1, 2, 51.00);

-- Pagamentos
INSERT INTO pagamentos (id_pagamento, id_pedido, forma_pagamento, valor_pago)
VALUES (seq_pagamento.NEXTVAL, 1, 'Pix', 46.00);

-- Logs
INSERT INTO logs (id_log, tabela, acao)
VALUES (seq_log.NEXTVAL, 'pedidos', 'Pedido criado com status Em andamento');