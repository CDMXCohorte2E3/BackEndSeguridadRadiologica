SELECT * FROM radiomed_database.usuario;

CREATE USER 'adminRadioMed'@'localhost' IDENTIFIED BY 'Pa$$w0rd';
GRANT ALL ON radiomed_database.* TO 'adminRadioMed'@'localhost';
FLUSH PRIVILEGES;