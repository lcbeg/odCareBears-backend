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
INSERT INTO `productos`(`nombre_prod`, `precio`, `descripcion`,`id_categoria`, `existencias`,`foto1`,`foto2`,`foto3`) VALUES ('Oso Morado', '199','Mochilita cariñosita con correas ajustables y cierre trasero para guardar lo que desees', '10','https://i.ibb.co/744rDWn/Oso-Morado.jpg','https://i.ibb.co/VqzdZGy/Oso-Morado1.jpg','https://i.ibb.co/pnnkHKs/Oso-Morado2.jpg');
         
INSERT INTO `productos`(`nombre_prod`, `precio`, `descripcion`,`id_categoria`, `existencias`,`foto1`,`foto2`,`foto3) VALUES('Oso Dormilon', '50', 'Osito Dormiloncito, con su corazón intacto para que le des mucho amor, ojitos cansaditos y bonitos','10','https://i.ibb.co/WgNGg7d/OsoAzul.jpg','https://i.ibb.co/G90FCSb/OsoAzul1.jpg','https://i.ibb.co/4sjTnCJ/Osito-Azul3.jpg');
            
INSERT INTO `productos`(`nombre_prod`, `precio`, `descripcion`,`id_categoria`, `existencias`,`foto1`,`foto2`,`foto3) VALUES('Tiernosito café', '50', 'Tiernosito café esta listo para que acaricies, y cuides de él','1', '10', 'https://i.ibb.co/xHPXJw9/OsoCafe.jpg','https://i.ibb.co/vXBpXm0/OsoCafe1.jpg', 'https://i.ibb.co/wSd7D5w/OsoCafe2.jpg'); 
		
INSERT INTO `productos`(`nombre_prod`, `precio`, `descripcion`,`id_categoria`, `existencias`,`foto1`,`foto2`,`foto3) VALUES ('Love A Lot Bear', '50', 'Osito con mucho amor para dar y que cuides de él, en perfecto estado', '1', '10','https://i.ibb.co/dfbZP07/OsoRosa.jpg', 'https://i.ibb.co/Nsdskyv/OsoRosa1.jpg','https://i.ibb.co/7VWWcxX/OsoRosa2.jpg');

INSERT INTO `productos`(`nombre_prod`, `precio`, `descripcion`,`id_categoria`, `existencias`,`foto1`,`foto2`,`foto3) VALUES ('Bebé de los cariñositos', '50', 'adaptable a mochila, sin daños','1','5','https://i.ibb.co/mS5fHF0/Oso-Rosita.jpg', 'https://i.ibb.co/nkmGVTb/Oso-Rosita1.jpg', 'https://i.ibb.co/DQsQpCh/Oso-Rosita2.jpg');    

INSERT INTO `productos`(`nombre_prod`, `precio`, `descripcion`,`id_categoria`, `existencias`,`foto1`,`foto2`,`foto3) VALUES ('Aretes Estrella', '50', 'Hermosos aretes en dorado y azul, figuras de planeta y luna con estrellas, con moños azul, pequeños y discretos','2' ,'8', ' https://i.ibb.co/StmXdPB/Estrellitas.jpg','https://i.ibb.co/kJBSBkr/Planeta-Peque-o.jpg' , 'https://i.ibb.co/3SKdMCf/Luna-Azul2.jpg');  
            
INSERT INTO `productos`(`nombre_prod`, `precio`, `descripcion`,`id_categoria`, `existencias`,`foto1`,`foto2`,`foto3) VALUES ('Aretes Aros Luna-Planeta', '50', 'Hermosos aretes en dorado y azul en forma circular, con imagen de la luna, estrellas y un planeta','2', '10', ' ');  
            
INSERT INTO `productos`(`nombre_prod`, `precio`, `descripcion`, `id_categoria`, `existencias`,`foto1`,`foto2`,`foto3) VALUES ('Aretes Luna-Estrella', '50', 'Hermosos aretes en dorado y azul, una luna y una estrella con una perla.','2', '10');   
            
INSERT INTO `productos`(`nombre_prod`, `precio`, `descripcion`, `id_categoria`, `existencias`,`foto1`,`foto2`,`foto3) VALUES ('Noche Estrellada', '50', 'Hermosos aretes en dorado y azul, una luna llena en aros, con estrellas y planetas pequeños colgantes','2', '10');  
            
INSERT INTO `productos`(`nombre_prod`, `precio`, `descripcion`, `id_categoria`, `existencias`,`foto1`,`foto2`,`foto3) VALUES ('Alajero', '50','Alajero de ceramica con flores, bordes dorados en la base','3', '10');  
            
INSERT INTO `productos`(`nombre_prod`, `precio`, `descripcion`, `id_categoria`, `existencias`,`foto1`,`foto2`,`foto3) VALUES ('Cajita pastel', '50', 'Pastelito,con fresas en la parte de arriba,puedes guardar aretes y collares en los compartimientos internos. Fue pintado y moldeado a mano. **Incluye 2 macarons de Ositos','3', '6');  
            
INSERT INTO `productos`(`nombre_prod`, `precio`, `descripcion`, `id_categoria`,  `existencias`,`foto1`,`foto2`,`foto3) VALUES ('Plato largo', '50', 'Platón de ceramica, con la imagen de Cinnamoroll pintado a mano, con técnica de hoja de oro','3', '4');  
            
INSERT INTO `productos`(`nombre_prod`, `precio`, `descripcion`, `id_categoria`, `existencias`,`foto1`,`foto2`,`foto3) VALUES ('Alajero My Melody', '50', 'Pequeño alajero de My Melody, se asoma su figura','3', '10');  
            
INSERT INTO `productos`( `nombre_prod`, `precio`, `descripcion`, `id_categoria`,  `existencias``foto1`,`foto2`,`foto3) VALUES ('Pintura De Oso', '50', 'Pintura con técnica sobre oleo','4', '1');  
            
INSERT INTO `productos`(`nombre_prod`, `precio`, `descripcion`, `id_categoria`, `existencias`,`foto1`,`foto2`,`foto3) VALUES ('Pintura De Oso', '50', 'Pintura con técnica sobre oleo', '4', '1');