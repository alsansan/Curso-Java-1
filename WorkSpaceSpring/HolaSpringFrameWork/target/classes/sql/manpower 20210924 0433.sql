-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.13-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema manpower
--

CREATE DATABASE IF NOT EXISTS manpower;
USE manpower;

--
-- Definition of table `alumnos`
--

DROP TABLE IF EXISTS `alumnos`;
CREATE TABLE `alumnos` (
  `ALU_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ALU_NOMBRE` varchar(45) NOT NULL,
  `ALU_APELLIDO` varchar(45) NOT NULL,
  `ALU_ESTUDIOS` varchar(200) NOT NULL,
  `ALU_LINKGIT` varchar(200) NOT NULL,
  PRIMARY KEY (`ALU_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `alumnos`
--

/*!40000 ALTER TABLE `alumnos` DISABLE KEYS */;
INSERT INTO `alumnos` (`ALU_ID`,`ALU_NOMBRE`,`ALU_APELLIDO`,`ALU_ESTUDIOS`,`ALU_LINKGIT`) VALUES 
 (1,'Guillermo','López Leganés','Desarrollo de aplicaciones web',' https://gitlab.com/elliotstrike/cursojava2021.git'),
 (2,'David','Tomé del Arco','Ciencias de la computación','https://gitlab.com/davidtome/cursojava.git '),
 (4,'Geovanny','Calle Rivera','Grado superior desarrollo de aplicaciones multiplataforma y estudio de desarrollo de aplicaciones web',' https://gitlab.com/geovaxd/cursojava2021.git'),
 (5,'Monsef','Bakhtaoui Dahraoui','FP2  Desarrollo De Aplicaciones Multiplataforma',' https://github.com/JMonsef/JavaCourse.git'),
 (6,'Víctor','Fuentes  Soriano','Grado en Ciencias Físicas ','https://github.com/vicfuen02/CursoJava2021.git'),
 (7,'Joel','Sebastián','Grado superior en Desarrollo de Aplicaciones Multiplataforma',' https://gitlab.com/joelscfs/cursojava2021.git'),
 (8,'Marina','Calvo Pereña','Grado en Física','https://gitlab.com/marinacalvo/cursojava2021.git'),
 (9,'Danilo','de Jesus Joia','Desarrollo de Aplicaciones Multiplataforma','https://github.com/danilo-17/CursoJava2021.git'),
 (10,'Sebastián','Riojo Fernández','Desarrollo de Aplicaciones Multiplataforma','https://github.com/Sebastian-Riojo/CursoJava2021.git'),
 (11,'Ángel','Guerreiro Guzmán','Desarrollo de Aplicaciones Multiplataforma','https://gitlab.com/angelotidas/cursojava2021.git'),
 (12,'Luis','Navarro Pashinian','Desarrollo de Aplicaciones Multiplataforma','https://github.com/Pashinian/CursoJava2021.git'),
 (13,'Aarón','Sánchez Sánchez','Desarrollo de Aplicaciones Multiplataforma','https://gitlab.com/aarondam99/curso-java-2021'),
 (14,'Mauro','Barreiro','Grado en Física','https://gitlab.com/maurobn98/cursojava2021.git'),
 (15,'Iván','Altares Palacios','Desarrollo de Aplicaciones Multiplataforma','https://gitlab.com/ivanaltares/ivanaltaresproyecto.git (fetch)'),
 (16,'Guillermo','Jiménez-Mendaño de Fuentes','Graduado en Ciclo Superior de FP de DAM','https://gitlab.com/Nahasu/cursojava2021.git'),
 (17,'Ángel','Eduardo Alvitres','Desarrollo de Aplicaciones Multiplataforma (DAM)','https://gitlab.com/Nahasu/cursojava2021.git'),
 (18,'Javier','García-Duarte Sáenz','Grado superior DAM','https://gitlab.com/javigarciaduarte/cursojava2021.git'),
 (19,'Alberto','Sánchez Sánchez','Grado en Física','https://github.com/alsansan/Curso-Java-1.git');
/*!40000 ALTER TABLE `alumnos` ENABLE KEYS */;


--
-- Definition of table `evaluaciones`
--

DROP TABLE IF EXISTS `evaluaciones`;
CREATE TABLE `evaluaciones` (
  `EVA_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `EVA_NOMBRE` varchar(45) NOT NULL,
  `EVA_FECHA` date NOT NULL,
  `EVA_RESULTADO` float NOT NULL,
  `EVA_OBSERVACIONES` varchar(45) NOT NULL,
  `ALU_ID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`EVA_ID`),
  KEY `FK_EVALUACIONES_ALUMNOS` (`ALU_ID`),
  CONSTRAINT `FK_EVALUACIONES_ALUMNOS` FOREIGN KEY (`ALU_ID`) REFERENCES `alumnos` (`ALU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `evaluaciones`
--

/*!40000 ALTER TABLE `evaluaciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluaciones` ENABLE KEYS */;


--
-- Definition of table `practicas`
--

DROP TABLE IF EXISTS `practicas`;
CREATE TABLE `practicas` (
  `PRAC_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `PRAC_NOMBRE` varchar(45) NOT NULL,
  PRIMARY KEY (`PRAC_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `practicas`
--

/*!40000 ALTER TABLE `practicas` DISABLE KEYS */;
INSERT INTO `practicas` (`PRAC_ID`,`PRAC_NOMBRE`) VALUES 
 (1,'practica 1 - pantallas'),
 (2,'practica 2 - variables'),
 (3,'practica 3 - if-condiciones'),
 (4,'practica 4-ciclos for-while-do while'),
 (5,'practica 5 - uso de Strings'),
 (6,'practica 6 - Metodos estáticos y fechas'),
 (7,'practica 7 - Objetos- persona'),
 (8,'practica 8 - Objetos- Figura');
/*!40000 ALTER TABLE `practicas` ENABLE KEYS */;


--
-- Definition of table `practicasresueltas`
--

DROP TABLE IF EXISTS `practicasresueltas`;
CREATE TABLE `practicasresueltas` (
  `PR_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `PRAC_ID` int(10) unsigned NOT NULL,
  `ALU_ID` int(10) unsigned NOT NULL,
  `PR_NOTA` float NOT NULL,
  `PR_OBSERVACIONES` varchar(200) NOT NULL,
  PRIMARY KEY (`PR_ID`),
  KEY `FK_practicasresuelta_PRACTICA` (`PRAC_ID`),
  KEY `FK_practicasresuelta_ALUMNOS` (`ALU_ID`),
  CONSTRAINT `FK_practicasresuelta_ALUMNOS` FOREIGN KEY (`ALU_ID`) REFERENCES `alumnos` (`ALU_ID`),
  CONSTRAINT `FK_practicasresuelta_PRACTICA` FOREIGN KEY (`PRAC_ID`) REFERENCES `practicas` (`PRAC_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=152 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `practicasresueltas`
--

/*!40000 ALTER TABLE `practicasresueltas` DISABLE KEYS */;
INSERT INTO `practicasresueltas` (`PR_ID`,`PRAC_ID`,`ALU_ID`,`PR_NOTA`,`PR_OBSERVACIONES`) VALUES 
 (1,1,1,1,'Al 18 y 21 esta no tiene nada'),
 (2,2,1,1,'Al 18 y 21 esta no tiene nada'),
 (3,3,1,1,'Al 18 y 21 esta no tiene nada'),
 (4,4,1,1,'Al 18 y 21 esta no tiene nada'),
 (5,1,2,7,'la practica 1 no tiene nada aunque estan los .class, posible fallo al subir'),
 (6,2,2,10,'tiene 5 ejercicios hechos y utilozo Math.pow'),
 (7,3,2,8,'Al 18 nada, 21 se puso las pilas me gusto como saco el ejercicio Mod4_ejercicio8, muy bueno lo del charAt(0) en el ejercicio11, el ejercicio20 esta raro'),
 (8,4,2,8,'Al 18 nada, 21 se puso las pilas me gusto como saco el ejercicio Mod4_ejercicio8, muy bueno lo del charAt(0) en el ejercicio11, el ejercicio20 esta raro'),
 (9,1,4,10,'todos los ejercicios resueltos'),
 (10,2,4,9,'21/10 falta el 5 solamente'),
 (11,3,4,10,'dia 18-del 1 al 15 no hay nada - 21/10 se completaron todos los ejercicios'),
 (12,4,4,1,'del 16 al 22 no hay nada '),
 (13,1,5,10,'del 1 al 3 todos los ejerecicios'),
 (14,2,5,9,'ejercicios 2,3 y 4 falta el 5'),
 (17,1,6,10,'ejercicios del 1 al 3 hata lo hecho en clase'),
 (18,2,6,10,'ejercicios del 1 al 4 falta uno pero te perdonamos'),
 (19,3,6,10,'TODOS del 1 al 15, utilzo charAt(0) para rescatar el char, ojo en el 8(piedra-papel-tijera) que tambien puede empatar, muy bueno los dedl switch para los meses, saco el de IFFF'),
 (20,4,6,10,'del 16 al 21 todos un genio '),
 (21,1,7,10,'todos los ejercicios'),
 (22,2,7,10,'ojo cuando se castea a byte puede no entrar el resutado conviene castear a int'),
 (23,3,7,1,'23/09 de ciclos no hay nada'),
 (24,4,7,9,'23/09 practica completa'),
 (25,1,8,10,'2 y 3 resueltos'),
 (26,2,8,7,'solamente el ejercicio2'),
 (27,3,8,5,'23/09 dos ejercicios el del promedio esta'),
 (28,4,8,1,'nada'),
 (30,1,9,10,'ejercicio resueltos '),
 (31,2,9,9,'El promedio esta mal sacado y deberian estar en otro paquete'),
 (32,3,9,8,'23/09 practica completa'),
 (33,4,9,1,'nada'),
 (34,1,10,10,'perfecto hasta los ejemplos de la clase estan'),
 (35,2,10,9,'muy buenos los comentarios faltaron 3'),
 (36,3,10,10,'del 1 al 15 todos utilizo String para el ejercicio 3, charAt en el 11'),
 (37,4,10,10,'23/09 practica completa'),
 (38,1,11,10,'del 1 al 3 todos'),
 (39,2,11,8,'no utilizo variables y faltaron 2 ejercicios'),
 (40,3,11,9,'23/09 practica completa'),
 (41,4,11,9,'23/09 practica completa'),
 (42,1,12,10,'del 1 al 3 completita'),
 (43,2,12,9,'conviene castear a int y el 5 esta faltando'),
 (44,3,12,7,'hasta el ejercicio 7 utilizo equals...'),
 (45,4,12,9,'23/09 practica completa'),
 (46,1,13,10,'completa del 1 al 3'),
 (47,2,13,9,'falta el 5 ojo cuando se castea a byte puede no entrar'),
 (48,3,13,8,'del 1 al 7 uso equals y switch'),
 (49,4,13,9,'23/09 practica completa'),
 (50,1,14,10,'del 1 al 3 estan todos pero sin paquetes'),
 (51,2,14,8,'faltan el 4 y 5 pero sin paquetes'),
 (52,3,14,8,'23/09 practica avanzada'),
 (53,4,14,1,'nada de esto'),
 (55,1,15,10,'completa'),
 (56,2,15,8,'utilizo Math.pow, el promedio debe ser float'),
 (57,3,15,9,'23/09 completa'),
 (58,4,15,9,'23/09 completa'),
 (59,1,16,10,'completa'),
 (60,2,16,10,'completa'),
 (61,3,16,9,'23/09 completa'),
 (62,4,16,9,'23/09 completa'),
 (63,1,17,10,'completa'),
 (64,2,17,10,'completa'),
 (65,3,17,9,'23/09 completa'),
 (66,4,17,9,'23/09 completa'),
 (67,1,18,10,'completa'),
 (68,2,18,9,'faltan 2 '),
 (69,3,18,9,'23/09 completa'),
 (70,4,18,9,'23/09 completa'),
 (71,1,19,8,'falta el 3ro'),
 (72,2,19,8,'el promedio de goles debe ser float no tiene paquetes'),
 (73,3,19,9,'23/09 completa'),
 (74,4,19,9,'23/09 completa'),
 (76,5,2,10,'me gusto mucho el uso de funciones'),
 (77,6,2,8,'no cumple con el tema de la clase StringUtil'),
 (79,5,4,5,'21/09 solo el ejercicio de ejempmlo'),
 (80,7,4,10,'21/09 muy bien hasta el testeo unitario esta'),
 (81,3,5,9,'21/09 muy bien felicitaciones'),
 (82,4,5,9,'21/09 completa'),
 (83,5,5,10,'21/09 perfecto'),
 (84,7,5,8,'21/09 faltan los testeos unitados'),
 (85,6,5,9,'21/09 muy bueno solamente falta el calendar'),
 (86,5,1,1,'23/09 no tiene nada de :('),
 (87,6,1,1,'23/09 no tiene nada de :('),
 (88,7,1,1,'23/09 no tiene nada de :('),
 (89,8,1,1,'23/09 no tiene nada de :('),
 (90,5,2,9,'23/09 completa'),
 (91,6,2,9,'23/09 completa tratar de utilizar las constantes Calendar.SUNDAY en vez de los nros'),
 (92,7,2,9,'23/09 completa en testear hicistes algo raro lo upcasteastes a cuenta????'),
 (93,8,2,9,'23/09 la superficie del cuadrado es lado*lado, el parimetro de un triangulo es sacar la hipotenusa y sumarla, teniendo como atributos la base y la altura'),
 (94,6,4,1,'23/09  falto :('),
 (95,8,4,9,'23/09  la superficia se calcula en el contructor para saber si supera el maximo'),
 (96,8,5,10,'23/09  la superficia se calcula en el contructor para saber si supera el maximo y debe ser estatica, mmmuy bien por los testeos unitarios, el perimetro del triangulo'),
 (97,5,6,10,'23/09 muy bueno me gusto el uso de expresiones regulares para solucionar el tema de los numeros '),
 (98,6,6,8,'23/09 muy bueno me gusto el uso de expresiones regulares para solucionar el tema de los numeros y dobles espacios'),
 (99,7,6,10,'23/09 muy bueno'),
 (100,8,6,9,'23/09 el maximo debe realizarse en el constructor'),
 (101,5,7,10,'23/09 completa'),
 (102,6,7,9,'23/09 completa los errores deben ser lanzados y no tratados tratar de utilizar las constantes Calendar.SUNDAY'),
 (103,7,7,9,'23/09 completa el equals feo...., pero muy bien'),
 (104,8,7,1,'23/09 falto :('),
 (105,5,8,1,'23/09 falto :('),
 (106,6,8,1,'23/09 falto :('),
 (107,7,8,5,'23/09 hay un eercicio que extiende de una clase que se llama practica 7'),
 (108,8,8,1,'23/09 no esta'),
 (109,5,9,3,'23/09 solo ejemplo'),
 (110,6,9,1,'23/09 no esta :('),
 (111,7,9,8,'23/09 correcta'),
 (112,5,10,10,'23/09 Excelente utilizastes pantalllas'),
 (113,6,10,8,'23/09 falto solamente el DateUtil'),
 (114,7,10,9,'23/09 completo'),
 (115,7,10,9,'23/09 completo el calculo del maximo debe hacerse en el constructor'),
 (116,5,11,10,'23/09 completo muy bueno el uso de contains para las vocales'),
 (117,6,11,10,'23/09 practica completa excelente hasta el testeo estaba'),
 (118,8,11,10,'23/09 completa'),
 (120,5,12,8,'23/09 algunos estan incompletos'),
 (121,6,12,3,'23/09 completo esta vacio'),
 (122,8,12,1,'23/09 no esta'),
 (123,7,12,9,'23/09 no esta completo aunque el equals feo'),
 (124,5,13,9,'23/09 completa muy bueno lo de concat'),
 (125,6,13,9,'23/09 completa '),
 (126,7,13,10,'23/09 completa '),
 (127,8,13,9,'23/09 completa '),
 (128,5,14,1,'23/09 falta :( '),
 (129,6,14,1,'23/09 falta :( '),
 (130,7,14,1,'23/09 falta :( '),
 (131,8,14,1,'23/09 falta :( '),
 (132,5,15,10,'23/09 completa '),
 (133,6,15,10,'23/09 completa las excepciones no se deben tratar se deben lanzar'),
 (134,7,15,10,'23/09 completa'),
 (135,8,15,10,'23/09 completa las partes '),
 (136,5,16,10,'23/09 completa '),
 (137,6,16,9,'23/09 completa '),
 (138,7,16,9,'23/09 completa '),
 (139,8,16,1,'23/09 falta :('),
 (140,5,17,10,'23/09 completa'),
 (141,6,17,10,'23/09 completa muy bueno los dedl contains para doble espacio asi lo resuelvo yo'),
 (142,7,17,10,'23/09 completa esta feo el equals pero vale por el testeo unitario'),
 (143,8,17,1,'falta :('),
 (144,5,18,10,'completa...'),
 (145,6,18,10,'completa...'),
 (146,7,18,9,'completa..tanto en alumno como en profesor falta agregar las particularidades en los metodos equals y hashCode'),
 (147,8,18,9,'completa..la maxima superiice debe verificarse en el contructor'),
 (148,5,19,10,'completa..,me gusto lo de las expresiones regulares'),
 (149,6,19,9,'completa..,pero apostaria que el StringUtil no funciona'),
 (150,7,19,10,'completa..,'),
 (151,8,19,10,'completa..,');
/*!40000 ALTER TABLE `practicasresueltas` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
