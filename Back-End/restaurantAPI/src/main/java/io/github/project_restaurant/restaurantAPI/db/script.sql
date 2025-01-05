-- Tabelas

	CREATE TABLE restaurantes (
	    id_restaurante NUMBER PRIMARY KEY,
	    nome VARCHAR2(100) NOT NULL,
	    endereco VARCHAR2(200) NOT NULL,
	    contato VARCHAR2(15) NOT NULL,
	    horario_abertura DATE NOT NULL,
	    horario_fechamento DATE NOT NULL
	);

CREATE TABLE funcionarios (
    id_funcionario NUMBER PRIMARY KEY,
    nome VARCHAR2(100) NOT NULL,
    contato VARCHAR2(15) NOT NULL,
    disponibilidade VARCHAR2(50) NOT NULL
);

CREATE TABLE clientes (
    id_cliente NUMBER PRIMARY KEY,
    nome VARCHAR2(100) NOT NULL,
    contato VARCHAR2(15) NOT NULL,
    endereco VARCHAR2(200) NOT NULL
);

CREATE TABLE entregas (
    id_entrega NUMBER PRIMARY KEY,
    quantidade NUMBER NOT NULL,
    preco_unitario NUMBER(10, 2) NOT NULL,
    status_entrega VARCHAR2(50) NOT NULL
);

CREATE TABLE pedidos (
    id_pedido NUMBER PRIMARY KEY,
    id_cliente NUMBER NOT NULL,
    data_pedido DATE NOT NULL,
    status_pedido VARCHAR2(50) NOT NULL,
    endereco_entrega VARCHAR2(200) NOT NULL,
    desconto NUMBER(10, 2) DEFAULT 0 NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    id_entrega NUMBER, -- Relacionamento com entregas
    CONSTRAINT fk_cliente_pedido FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente) ON DELETE CASCADE,
    CONSTRAINT fk_entrega_pedido FOREIGN KEY (id_entrega) REFERENCES entregas(id_entrega) ON DELETE SET NULL
);

CREATE TABLE itens_menu (
    id_item_menu NUMBER PRIMARY KEY,
    nome VARCHAR2(100) NOT NULL,
    descricao VARCHAR2(200) NOT NULL,
    preco NUMBER(10, 2) NOT NULL
);

CREATE TABLE itens_pedido (
    id_item_pedido NUMBER PRIMARY KEY,
    id_pedido NUMBER NOT NULL,
    id_item_menu NUMBER NOT NULL,
    quantidade NUMBER NOT NULL,
    preco_total NUMBER(10, 2) NOT NULL,
    CONSTRAINT fk_pedido_item FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido) ON DELETE CASCADE,
    CONSTRAINT fk_item_menu FOREIGN KEY (id_item_menu) REFERENCES itens_menu(id_item_menu)
);

CREATE TABLE pagamentos (
    id_pagamento NUMBER PRIMARY KEY,
    id_pedido NUMBER NOT NULL,
    forma_pagamento VARCHAR2(50) NOT NULL,
    valor_pago NUMBER(10, 2) NOT NULL,
    CONSTRAINT fk_pedido_pagamento FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido) ON DELETE CASCADE
);

CREATE TABLE logs (
    id_log NUMBER PRIMARY KEY,
    tabela VARCHAR2(50) NOT NULL,
    acao VARCHAR2(200) NOT NULL,
    data_hora TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

-- Sequences

CREATE SEQUENCE seq_restaurante START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE seq_funcionario START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE seq_cliente START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE seq_entrega START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE seq_pedido START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE seq_item_menu START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE seq_item_pedido START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE seq_pagamento START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE seq_log START WITH 1 INCREMENT BY 1;


