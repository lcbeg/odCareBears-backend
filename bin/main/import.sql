USE `od-cb-db`;
INSERT INTO `categoria`(nombre_categoria, imagen_categoria) VALUE ('Ositos', 'https://i.ibb.co/BjB10BQ/Osos.jpg');
INSERT INTO `categoria`(nombre_categoria, imagen_categoria) VALUE ('Accesorios', 'https://i.ibb.co/6vLTc5F/accesoriofil.jpg');
INSERT INTO `categoria`(nombre_categoria, imagen_categoria) VALUE ('Cerámica','https://i.ibb.co/FXS5QH3/tazafil.jpg');
INSERT INTO `categoria`(nombre_categoria, imagen_categoria) VALUE ('Otros','https://i.ibb.co/TLND302/otrosfil.jpg');

INSERT INTO `producto`( `nombre_producto`, `precio`, `descripcion`, `id_categoria`, `existencias`) VALUES ('Pintura De Oso', '50', 'Pintura con técnica sobre oleo', '4','1');	
INSERT INTO `producto`( `nombre_producto`, `precio`, `descripcion`, `id_categoria`, `existencias`) VALUES ('Pintura De Oso 2', '55', 'Pintura con técnica sobre oleo', '2','1');	
INSERT INTO `producto`( `nombre_producto`, `precio`, `descripcion`, `id_categoria`, `existencias`) VALUES ('Pintura De Oso 4', '55', 'Pintura con técnica sobre oleo', '2','1');	

INSERT INTO `usuario`(`email`, `full_name`, `password`, `telephone`) VALUES ("karlafer6@hotmail.com", "Karla Fernanda Rodríguez Palapa", "Osito123", "5568795574");
INSERT INTO `usuario`(`email`, `full_name`, `password`, `telephone`) VALUES ("odreygj@gmail.com", "Audrey Gerardo Juárez", "Osito123", "2223566325");
INSERT INTO `usuario`(`email`, `full_name`, `password`, `telephone`) VALUES ("gabelardo04@gmail.com", "Abelardo Gutiérrez López", "Osito123", "9541239911");
INSERT INTO `usuario`(`email`, `full_name`, `password`, `telephone`) VALUES ("vivancomiguel119@gmail.com", "Miguel Angel Vivanco Maldonado", "Osito123", "3781185488");
INSERT INTO `usuario`(`email`, `full_name`, `password`, `telephone`) VALUES ("betancourt.lucero@gmail.com", "Lucero Clarisa Betancourt García", "Osito123", "5539192506");
INSERT INTO `usuario`(`email`, `full_name`, `password`, `telephone`) VALUES ("miguelrmor@gmail.com", "Miguel Rodríguez Morán", "Osito123", "3310126351");