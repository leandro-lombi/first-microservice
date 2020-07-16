CREATE TABLE produto (descricao VARCHAR(255),
                      sku VARCHAR(255),
                      peso numeric,
                      altura numeric,
                      profundidade numeric,
                      fabricante VARCHAR(255),
                      preco numeric,

                      ID SERIAL PRIMARY KEY);