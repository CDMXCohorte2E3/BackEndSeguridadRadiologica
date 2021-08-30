INSERT INTO `radiomed_database`.`admin` 
(`idAdministrador`, `Nombre`,`Apellidos`,  `Email`, `Contrasena`) 
VALUES 
(1,'Leticia', 'Somera' ,'radiomed.asesores@gmail.com','RadioMed_01'),
(2,'David','Vargas ','radiomed.contacto@gmail.com','RadioMed_01'),
(3,'América','Sánchez ','americasanchezleon@gmail.com','RadioMed_02'),
(4,'Carlos','Pérez ','carlos.dan.pvst@gmail.com','RadioMed_02'),
(5,'Alejandra','Zataráin','azatarainalp@gmail.com','RadioMed_02'),
(6,'Victor','Martínez','victor.martinez.zamora98@gmail.com','RadioMed_02');


INSERT INTO `radiomed_database`.`producto` 
(`idProducto`, `Nombre`, `Marca`, `Modelo`, `Precio`, `Descripcion`, `Imagen`, `Categoria`) 
VALUES 
(1,'Mandil emplomado económico','Marca Slim Royal','E6995','$2904.90','0.5 mm de plomo | 66x95cm | Con bolsillo | Acabado textil','.\\img\\products\\img-product1.jpg','Mandiles'),
(2,'Mandil emplomado estándar','Marca Slim Royal','S6995','$3646.65','0.5 mm de plomo | 66x95cm | Con bolsillo | acabado plástico','.\\img\\products\\img-product2.jpg','Mandiles'),
(3,'Faldón emplomado','Marca Slim Royal','SQUARE','$1443.25','0.5 mm de plomo | 40x40cm | Tipo falda','.\\img\\products\\img-product3.jpg','Mandiles'),
(4,'Lentes emplomados','Marca Slim Royal','SS-53','$2873.71',' 0.75 mm de plomo | Con estuche','.\\img\\products\\img-product4.jpg','Lentes'),
(5,'Lentes emplomados premium','Marca Slim Royal','S-53','$3403.08',' 0.5 mm de plomo | Con estuche','.\\img\\products\\img-product5.jpg','Lentes'),
(6,'Googles emplomados','Marca Slim Royal','GOOGLE-HO','$6344.55',' 0.5 mm de plomo | Con bolsa de tela','.\\img\\products\\img-product6.jpg','Lentes'),
(7,'Guantes emplomados','Marca Slim Royal','100 M/L','$2911.80',' 0.5 mm de plomo | 350 mm de largo | Tamaño mediano o grande','.\\img\\products\\img-product7.jpg','Guantes'),
(8,'Guantes emplomados','Marca Shielding','XR47','$2637.53',' Modelo RADIAXON | Equivalente a 0.5 mm de plomo | Solo bajo pedido','.\\img\\products\\img-product8.jpg','Guantes'),
(9,'Collarín emplomado','Marca Slim Royal','STANDARD-05','$767.96',' 0.5 mm de plomo','.\\img\\products\\img-product9.jpg','Collarines'),
(10,'Collarín emplomado de lujo','Marca Slim Royal','DELUX-O5','$1045.49',' 0.5 mm de plomo','.\\img\\products\\img-product10.jpg','Collarines'),
(11,'Protectores de gónadas','Marca Slim Royal','S806A','$1618.35','0.5 mm de plomo | Juego de 3 protectores: | grande, mediano y chico','.\\img\\products\\img-product11.jpg','Protectores de gónadas'),
(12,'Protectores de gónadas','Marca Slim Royal','S806 M/L','$635.24',' 0.5mm de plomo | Una pieza | Tamaño mediano o grande','.\\img\\products\\img-product12.jpg','Protectores de gónadas');


INSERT INTO `radiomed_database`.`servicio` 
(`idServicio`, `Nombre`, `ParrafoIntroductorio`, `ParrafoDos`, `ParrafoTres`, `ParrafoResaltado`, `Imagen`) 
VALUES 
(1,'Curso Básico de Protección Radiológica Nivel Personal Ocupacionalmente Expuesto (POE)','Curso dirigido a técnicos radiólogos, médicos radiólogos, enfermeras, cirujanos dentistas, médicos de diferentes especialidades y cualquier personal ocupacionalmente expuesto (POE) que haga uso de algún equipo de rayos X para diagnóstico médico.','Este curso está diseñado para que el alumno comprenda fácilmente y de forma didáctica qué son las radiaciones ionizantes y cuáles son los principios de protección radiológica que puede aplicar en su lugar de trabajo.','El contenido del curso se basa en lo estipulado en las Normas Oficiales Mexicanas NOM-229-SSA1-2002 y NOM-031-NUCL-2011.','Duración del curso: 40 horas','.\\img\\products\\Img-service1.jpg'),
(2,'Curso dirigido al personaordenl ocupacionalmente expuesto (POE) que labora en establecimientos de diagnóstico médico con rayos X y cuenta con un Curso Básico de Protección Radiológica Nivel POE.','Curso dirigido al personal ocupacionalmente expuesto (POE) que labora en establecimientos de diagnóstico médico con rayos X y cuenta con un Curso Básico de Protección Radiológica Nivel POE.','RadioMed le ofrece un Curso de Actualización personalizado, de acuerdo al tipo de establecimiento médico que lo solicita, con el fin de reforzar en el alumno los conocimientos prácticos de protección radiológica que le serán útiles en sus actividades laborales diarias.','El Curso de Actualización se imparte de forma anual de acuerdo a lo establecido en las Normas Oficiales Mexicanas NOM-229-SSA1-200 y NOM-031-NUCL-2011.','Duración del curso: 8 a 16 horas','.\\img\\products\\Img-service2.jpg'),
(3,'Dosimetría Personal OSL','La dosimetría personal más moderna y precisa del mercado a un precio accesible.','Tecnología alemana BeOSL, ampliamente conocida y utilizada en países como Italia, Japón, Suiza, Bélgica, EUA y muchos más. ',' Nuestro servicio está avalado por la Comisión Nacional de Seguridad Nuclear y Salvaguardias (CNSNS) mediante el Programa Permanente de Supervisión de Servicios de Dosimetría (PPSSD). ','¡Pregunte por nuestros descuentos y proporcione dosimetría de calidad a todo su personal! ','.\\img\\products\\Img-service3.jpg'),
(4,'Gestoría ante la COFEPRIS ','Lo apoyamos en la obtención de su Licencia Sanitaria y Permiso del Responsable de la Operación y el funcionamiento. Nuestro servicio está garantizado. ',' ',' ','Le proporcionamos Manuales de Protección Radiológica y Garantía de Calidad personalizados, de acuerdo a las necesidades de su establecimiento, todo con base en lo requerido por la Norma Oficial Mexicana NOM-229-SSA1-2002.','.\\img\\products\\Img-service4.jpg'),
(5,'Memoria Analítica','Cálculo de blindajes para su sala de rayos X.','Evite gastos innecesarios, le indicamos la forma más efectiva de blindar su sala cumpliendo con la norma mexicana y cuidando su presupuesto.','Adecuamos completamente su sala de rayos X, pregunte por nuestro servicio de blindaje de salas, manejamos plomo y barita.','Le proporcionamos un certificado con validez oficial ante la COFEPRIS.','.\\img\\products\\Img-service6.jpg'),
(6,'Levantamiento de niveles ','Verificación de los blindajes de su sala de rayos X','Las puebas se realizan con detector de radiación tipo cámara de ionización como lo establece la Norma Oficial Mexicana NOM-229-SSA1-2002.',' ','Le proporcionamos un certificado con validez oficial ante la COFEPRIS.','.\\img\\products\\Img-service6.jpg'),
(7,'Control de Calidad para Equipos de Diagnóstico Médico con Rayos X ','Somos Asesores Especializados en Seguridad Radiológica avalados por la COFEPRIS. Lo ayudamos a cumplir con el Programa de Garantía de Calidad solicitado por la Norma Oficial Mexicana NOM-229-SSA1-2002.','Realizamos pruebas de control de calidad a sus equipos de rayos X convencionales, tomógrafos, mastógrafos, rayos X dentales, fluoroscopía, etc.','Utilizamos equipos y sensores de última generación para asegurar la protección del POE y de sus pacientes. ','Nuestros certificados de pruebas de control de calidad tienen validez oficial ante la COFEPRIS.','.\\img\\products\\Img-service7.jpg'),
(8,'Auditoría interna en protección radiológica','Visitamos su establecimiento para evaluar las condiciones generales de protección radiológica en su sala de rayos X, con base en los requerimientos de la Norma Oficial Mexicana NOM-229-SSA1-2002','Se realiza una revisión a su expediente de seguridad radiológica y se entrega un dictamen con la evaluación de su sala, indicando los puntos que deben atenderse para cumplir con lo establecido por la COFEPRIS.','','Incluye una plática orientativa sobre el Programa de Garantía de Calidad establecido en la Norma Oficial Mexicana NOM-229-SSA1-2002.','.\\img\\products\\Img-service8.jpg'),
(9,'Señalamientos de protección radiológica','Le proporcionamos los señalamientos de protección radiológica necesarios para su establecimiento de diagnóstico médico. ',' ','','Nuestros señalamientos cumplen con los estándares exigidos por la Norma Oficial Mexicana NOM-229-SSA1-2002.','.\\img\\products\\Img-service9.jpg');


INSERT INTO `radiomed_database`.`usuario` 
(`idUsuario`, `Nombre`,  `Apellidos`, `Email`, `Teléfono`, `Contrasena`) 

VALUES 
('1', 'Fabiola','León', 'correo@gmail.com',  '562482045', 'RadioMed_03'),
('2', 'Daniel','Pérez', 'correo@gmail.com',  '562482045', 'RadioMed_03'),
('3', 'Hugo ','Zamora', 'correo@gmail.com',  '562482045', 'RadioMed_03'),
('4', 'América ','Sánchez ', 'correo@gmail.com',  '562482045',  'RadioMed_03'),
('5', 'Alejandra ','Alpuche', 'correo@gmail.com',  '562482045', 'RadioMed_03');


INSERT INTO `radiomed_database`.`orden` 
(`idOrden`, `idUsuario`, `Fecha`) 
VALUES 
('1', '1', '2021-08-23 11:37:07'),
('2', '2', '2021-08-22 10:37:07'),
('3', '2', '2021-08-21 09:37:07'),
('4', '3', '2021-08-20 08:37:07'),
('5', '4', '2021-08-19 07:37:07');


INSERT INTO `radiomed_database`.`detalleorden` 
(`idDetalleOrden`, `idOrden`, `idProducto`, `Cantidad`) 
VALUES 
('1', '1', '3', '2'),
('2', '1', '1', '1'),
('3', '1', '5', '3'),
('4', '2', '8', '1'),
('5', '3', '10', '4');


INSERT INTO `radiomed_database`.`cotizacion` 
(`IdCotizacion`,`Fecha`, `Nombre`, `Apellidos`,  `Email`,  `Direccion`,  `Telefono`,  `RazonSocial`, `Empresa`) 
VALUES  
('1', '2021-08-23 12:37:07', 'Fabiola', 'Sanchez', 'americasanchezleon@gmail.com', 'Mi casa','5624821045','SALA941009000','Generation'),
('2', '2021-08-22 11:37:07','Daniel', 'Vazquez', 'danielVqz@gmail.com', 'Mi casa','5624821045','SALA941009000','Generation'),
('3', '2021-08-21 10:37:07','Alejandra', 'Alpuche', 'alejanraalp@gmail.com', 'Mi casa','5624821045','SALA941009000','Generation'),
('4', '2021-08-20 09:37:07','Grimaldo', 'Grimes', 'grimaldo@gmail.com', 'Mi casa','5624821045','SALA941009000','Generation'),
('5', '2021-08-19 08:37:07','Hugo', 'Zamora', 'hugozamora@gmail.com', 'Mi casa','5624821045','SALA941009000','Generation');



INSERT INTO `radiomed_database`.`detallecotizacion` 
(`idDetalleCotizacion`, `idCotizacion`, `idServicio`)
VALUES 
('1', '1', '8'),
('2', '1', '5'),
('3', '2', '9'),
('4', '3', '3'),
('5', '4', '2');