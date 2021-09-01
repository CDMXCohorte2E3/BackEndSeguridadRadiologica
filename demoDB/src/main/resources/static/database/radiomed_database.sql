CREATE DATABASE  IF NOT EXISTS `radiomed_database` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `radiomed_database`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: radiomed_database
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `idadministrador` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Contrasena` varchar(45) NOT NULL,
  PRIMARY KEY (`idadministrador`),
  UNIQUE KEY `idAdministrador_UNIQUE` (`idadministrador`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'Leticia','Somera','radiomed.asesores@gmail.com','RadioMed_01'),(2,'David','Vargas ','radiomed.contacto@gmail.com','RadioMed_01'),(3,'América  ','Sánchez ','americasanchezleon@gmail.com','RadioMed_02'),(4,'Carlos ','Pérez ','carlos.dan.pvst@gmail.com','RadioMed_02'),(5,'Alejandra','Zataráin','azatarainalp@gmail.com','RadioMed_02'),(6,'Victor','Martínez','victor.martinez.zamora98@gmail.com','RadioMed_02');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cotizacion`
--

DROP TABLE IF EXISTS `cotizacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cotizacion` (
  `IdCotizacion` int NOT NULL,
  `Fecha` timestamp NULL DEFAULT NULL,
  `Nombre` varchar(100) DEFAULT NULL,
  `Apellidos` varchar(45) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Direccion` varchar(200) DEFAULT NULL,
  `Telefono` varchar(15) DEFAULT NULL,
  `RazonSocial` varchar(15) DEFAULT NULL,
  `Empresa` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IdCotizacion`),
  KEY `fk_Cotizacion_DetalleCotizacion1_idx` (`IdCotizacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cotizacion`
--

LOCK TABLES `cotizacion` WRITE;
/*!40000 ALTER TABLE `cotizacion` DISABLE KEYS */;
INSERT INTO `cotizacion` VALUES (1,'2021-08-23 17:37:07','Fabiola','Sanchez','americasanchezleon@gmail.com','Mi casa','5624821045','SALA941009000','Generation'),(2,'2021-08-22 16:37:07','Daniel','Vazquez','danielVqz@gmail.com','Mi casa','5624821045','SALA941009000','Generation'),(3,'2021-08-21 15:37:07','Alejandra','Alpuche','alejanraalp@gmail.com','Mi casa','5624821045','SALA941009000','Generation'),(4,'2021-08-20 14:37:07','Grimaldo','Grimes','grimaldo@gmail.com','Mi casa','5624821045','SALA941009000','Generation'),(5,'2021-08-19 13:37:07','Hugo','Zamora','hugozamora@gmail.com','Mi casa','5624821045','SALA941009000','Generation');
/*!40000 ALTER TABLE `cotizacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallecotizacion`
--

DROP TABLE IF EXISTS `detallecotizacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallecotizacion` (
  `idDetalleCotizacion` int NOT NULL,
  `idCotizacion` int NOT NULL,
  `idServicio` int NOT NULL,
  PRIMARY KEY (`idDetalleCotizacion`,`idCotizacion`,`idServicio`),
  KEY `fk_DetalleCotizacion_Servicio1_idx` (`idServicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallecotizacion`
--

LOCK TABLES `detallecotizacion` WRITE;
/*!40000 ALTER TABLE `detallecotizacion` DISABLE KEYS */;
INSERT INTO `detallecotizacion` VALUES (5,4,2),(4,3,3),(2,1,5),(1,1,8),(3,2,9);
/*!40000 ALTER TABLE `detallecotizacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalleorden`
--

DROP TABLE IF EXISTS `detalleorden`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalleorden` (
  `idDetalleOrden` int NOT NULL,
  `idOrden` int NOT NULL,
  `idProducto` int NOT NULL,
  `Cantidad` int DEFAULT NULL,
  PRIMARY KEY (`idDetalleOrden`,`idOrden`,`idProducto`),
  KEY `fk_DetalleOrden_Producto1_idx` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalleorden`
--

LOCK TABLES `detalleorden` WRITE;
/*!40000 ALTER TABLE `detalleorden` DISABLE KEYS */;
INSERT INTO `detalleorden` VALUES (1,1,3,2),(2,1,1,1),(3,1,5,3),(4,2,8,1),(5,3,10,4);
/*!40000 ALTER TABLE `detalleorden` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orden`
--

DROP TABLE IF EXISTS `orden`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orden` (
  `idOrden` int NOT NULL,
  `idUsuario` int NOT NULL,
  `Fecha` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`idOrden`,`idUsuario`),
  KEY `fk_Orden_DetalleOrden1_idx` (`idOrden`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orden`
--

LOCK TABLES `orden` WRITE;
/*!40000 ALTER TABLE `orden` DISABLE KEYS */;
INSERT INTO `orden` VALUES (1,1,'2021-08-23 16:37:07'),(2,2,'2021-08-22 15:37:07'),(3,2,'2021-08-21 14:37:07'),(4,3,'2021-08-20 13:37:07'),(5,4,'2021-08-19 12:37:07');
/*!40000 ALTER TABLE `orden` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `idProducto` int NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Marca` varchar(45) DEFAULT NULL,
  `Modelo` varchar(45) DEFAULT NULL,
  `Precio` varchar(10) DEFAULT NULL,
  `Descripcion` varchar(200) DEFAULT NULL,
  `Imagen` varchar(150) DEFAULT NULL,
  `Categoria` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Mandil emplomado económico','Marca Slim Royal','E6995','$2904.90','0.5 mm de plomo | 66x95cm | Con bolsillo | Acabado textil','.\\img\\products\\img-product1.jpg','Mandiles'),(2,'Mandil emplomado estándar','Marca Slim Royal','S6995','$3646.65','0.5 mm de plomo | 66x95cm | Con bolsillo | acabado plástico','.\\img\\products\\img-product2.jpg','Mandiles'),(3,'Faldón emplomado','Marca Slim Royal','SQUARE','$1443.25','0.5 mm de plomo | 40x40cm | Tipo falda','.\\img\\products\\img-product3.jpg','Mandiles'),(4,'Lentes emplomados','Marca Slim Royal','SS-53','$2873.71',' 0.75 mm de plomo | Con estuche','.\\img\\products\\img-product4.jpg','Lentes'),(5,'Lentes emplomados premium','Marca Slim Royal','S-53','$3403.08',' 0.5 mm de plomo | Con estuche','.\\img\\products\\img-product5.jpg','Lentes'),(6,'Googles emplomados','Marca Slim Royal','GOOGLE-HO','$6344.55',' 0.5 mm de plomo | Con bolsa de tela','.\\img\\products\\img-product6.jpg','Lentes'),(7,'Guantes emplomados','Marca Slim Royal','100 M/L','$2911.80',' 0.5 mm de plomo | 350 mm de largo | Tamaño mediano o grande','.\\img\\products\\img-product7.jpg','Guantes'),(8,'Guantes emplomados','Marca Shielding','XR47','$2637.53',' Modelo RADIAXON | Equivalente a 0.5 mm de plomo | Solo bajo pedido','.\\img\\products\\img-product8.jpg','Guantes'),(9,'Collarín emplomado','Marca Slim Royal','STANDARD-05','$767.96',' 0.5 mm de plomo','.\\img\\products\\img-product9.jpg','Collarines'),(10,'Collarín emplomado de lujo','Marca Slim Royal','DELUX-O5','$1045.49',' 0.5 mm de plomo','.\\img\\products\\img-product10.jpg','Collarines'),(11,'Protectores de gónadas','Marca Slim Royal','S806A','$1618.35','0.5 mm de plomo | Juego de 3 protectores: | grande, mediano y chico','.\\img\\products\\img-product11.jpg','Protectores de gónadas'),(12,'Protectores de gónadas','Marca Slim Royal','S806 M/L','$635.24',' 0.5mm de plomo | Una pieza | Tamaño mediano o grande','.\\img\\products\\img-product12.jpg','Protectores de gónadas');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicio`
--

DROP TABLE IF EXISTS `servicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servicio` (
  `idServicio` int NOT NULL,
  `Nombre` varchar(200) DEFAULT NULL,
  `ParrafoIntroductorio` varchar(300) DEFAULT NULL,
  `ParrafoDos` varchar(300) DEFAULT NULL,
  `ParrafoTres` varchar(300) DEFAULT NULL,
  `ParrafoResaltado` varchar(300) DEFAULT NULL,
  `Imagen` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`idServicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicio`
--

LOCK TABLES `servicio` WRITE;
/*!40000 ALTER TABLE `servicio` DISABLE KEYS */;
INSERT INTO `servicio` VALUES (1,'Curso Básico de Protección Radiológica Nivel Personal Ocupacionalmente Expuesto (POE)','Curso dirigido a técnicos radiólogos, médicos radiólogos, enfermeras, cirujanos dentistas, médicos de diferentes especialidades y cualquier personal ocupacionalmente expuesto (POE) que haga uso de algún equipo de rayos X para diagnóstico médico.','Este curso está diseñado para que el alumno comprenda fácilmente y de forma didáctica qué son las radiaciones ionizantes y cuáles son los principios de protección radiológica que puede aplicar en su lugar de trabajo.','El contenido del curso se basa en lo estipulado en las Normas Oficiales Mexicanas NOM-229-SSA1-2002 y NOM-031-NUCL-2011.','Duración del curso: 40 horas','.\\img\\products\\Img-service1.jpg'),(2,'Curso dirigido al personaordenl ocupacionalmente expuesto (POE) que labora en establecimientos de diagnóstico médico con rayos X y cuenta con un Curso Básico de Protección Radiológica Nivel POE.','Curso dirigido al personal ocupacionalmente expuesto (POE) que labora en establecimientos de diagnóstico médico con rayos X y cuenta con un Curso Básico de Protección Radiológica Nivel POE.','RadioMed le ofrece un Curso de Actualización personalizado, de acuerdo al tipo de establecimiento médico que lo solicita, con el fin de reforzar en el alumno los conocimientos prácticos de protección radiológica que le serán útiles en sus actividades laborales diarias.','El Curso de Actualización se imparte de forma anual de acuerdo a lo establecido en las Normas Oficiales Mexicanas NOM-229-SSA1-200 y NOM-031-NUCL-2011.','Duración del curso: 8 a 16 horas','.\\img\\products\\Img-service2.jpg'),(3,'Dosimetría Personal OSL','La dosimetría personal más moderna y precisa del mercado a un precio accesible.','Tecnología alemana BeOSL, ampliamente conocida y utilizada en países como Italia, Japón, Suiza, Bélgica, EUA y muchos más. ',' Nuestro servicio está avalado por la Comisión Nacional de Seguridad Nuclear y Salvaguardias (CNSNS) mediante el Programa Permanente de Supervisión de Servicios de Dosimetría (PPSSD). ','¡Pregunte por nuestros descuentos y proporcione dosimetría de calidad a todo su personal! ','.\\img\\products\\Img-service3.jpg'),(4,'Gestoría ante la COFEPRIS ','Lo apoyamos en la obtención de su Licencia Sanitaria y Permiso del Responsable de la Operación y el funcionamiento. Nuestro servicio está garantizado. ',' ',' ','Le proporcionamos Manuales de Protección Radiológica y Garantía de Calidad personalizados, de acuerdo a las necesidades de su establecimiento, todo con base en lo requerido por la Norma Oficial Mexicana NOM-229-SSA1-2002.','.\\img\\products\\Img-service4.jpg'),(5,'Memoria Analítica','Cálculo de blindajes para su sala de rayos X.','Evite gastos innecesarios, le indicamos la forma más efectiva de blindar su sala cumpliendo con la norma mexicana y cuidando su presupuesto.','Adecuamos completamente su sala de rayos X, pregunte por nuestro servicio de blindaje de salas, manejamos plomo y barita.','Le proporcionamos un certificado con validez oficial ante la COFEPRIS.','.\\img\\products\\Img-service6.jpg'),(6,'Levantamiento de niveles ','Verificación de los blindajes de su sala de rayos X','Las puebas se realizan con detector de radiación tipo cámara de ionización como lo establece la Norma Oficial Mexicana NOM-229-SSA1-2002.',' ','Le proporcionamos un certificado con validez oficial ante la COFEPRIS.','.\\img\\products\\Img-service6.jpg'),(7,'Control de Calidad para Equipos de Diagnóstico Médico con Rayos X ','Somos Asesores Especializados en Seguridad Radiológica avalados por la COFEPRIS. Lo ayudamos a cumplir con el Programa de Garantía de Calidad solicitado por la Norma Oficial Mexicana NOM-229-SSA1-2002.','Realizamos pruebas de control de calidad a sus equipos de rayos X convencionales, tomógrafos, mastógrafos, rayos X dentales, fluoroscopía, etc.','Utilizamos equipos y sensores de última generación para asegurar la protección del POE y de sus pacientes. ','Nuestros certificados de pruebas de control de calidad tienen validez oficial ante la COFEPRIS.','.\\img\\products\\Img-service7.jpg'),(8,'Auditoría interna en protección radiológica','Visitamos su establecimiento para evaluar las condiciones generales de protección radiológica en su sala de rayos X, con base en los requerimientos de la Norma Oficial Mexicana NOM-229-SSA1-2002','Se realiza una revisión a su expediente de seguridad radiológica y se entrega un dictamen con la evaluación de su sala, indicando los puntos que deben atenderse para cumplir con lo establecido por la COFEPRIS.','','Incluye una plática orientativa sobre el Programa de Garantía de Calidad establecido en la Norma Oficial Mexicana NOM-229-SSA1-2002.','.\\img\\products\\Img-service8.jpg'),(9,'Señalamientos de protección radiológica','Le proporcionamos los señalamientos de protección radiológica necesarios para su establecimiento de diagnóstico médico. ',' ','','Nuestros señalamientos cumplen con los estándares exigidos por la Norma Oficial Mexicana NOM-229-SSA1-2002.','.\\img\\products\\Img-service9.jpg');
/*!40000 ALTER TABLE `servicio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idUsuario` int NOT NULL,
  `Nombre` varchar(100) DEFAULT NULL,
  `Apellidos` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Teléfono` varchar(15) DEFAULT NULL,
  `Contrasena` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `fk_Usuario_Orden1_idx` (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Fabiola','León','correo@gmail.com','562482045','RadioMed_03'),(2,'Daniel','Pérez','correo@gmail.com','562482045','RadioMed_03'),(3,'Hugo ','Zamora','correo@gmail.com','562482045','RadioMed_03'),(4,'América ','Sánchez ','correo@gmail.com','562482045','RadioMed_03'),(5,'Alejandra ','Alpuche','correo@gmail.com','562482045','RadioMed_03');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-27 17:14:52
