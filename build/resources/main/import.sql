USE `od-cb-db`;
INSERT INTO `categoria`(nombre_categoria, imagen_categoria) VALUE ('Ositos', 'https://i.ibb.co/BjB10BQ/Osos.jpg');
INSERT INTO `categoria`(nombre_categoria, imagen_categoria) VALUE ('Accesorios', 'https://i.ibb.co/6vLTc5F/accesoriofil.jpg');
INSERT INTO `categoria`(nombre_categoria, imagen_categoria) VALUE ('Cerámica','https://i.ibb.co/FXS5QH3/tazafil.jpg');
INSERT INTO `categoria`(nombre_categoria, imagen_categoria) VALUE ('Otros','https://i.ibb.co/TLND302/otrosfil.jpg');

INSERT INTO `producto`( `nombre_producto`, `precio`, `descripcion`, `id_categoria`, `existencias`) VALUES ('Pintura De Oso', '50', 'Pintura con técnica sobre oleo', '4','1');	
INSERT INTO `producto`( `nombre_producto`, `precio`, `descripcion`, `id_categoria`, `existencias`) VALUES ('Pintura De Oso 2', '55', 'Pintura con técnica sobre oleo', '2','1');	
INSERT INTO `producto`( `nombre_producto`, `precio`, `descripcion`, `id_categoria`, `existencias`) VALUES ('Pintura De Oso 4', '55', 'Pintura con técnica sobre oleo', '2','1');	

