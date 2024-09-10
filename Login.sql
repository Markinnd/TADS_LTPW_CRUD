	CREATE SCHEMA IF NOT EXISTS `Login` DEFAULT CHARACTER SET utf8;
    USE `Login`;
   
   CREATE TABLE IF NOT EXISTS `Login`.`tb_login` (
   `id` INT NOT NULL AUTO_INCREMENT,
   `email` VARCHAR(50) NOT NULL,
   `senha` VARCHAR(8) NOT NULL,
   PRIMARY KEY(`id`)
   ) ENGINE = InnoDB;
   
   SELECT * FROM tb_login;