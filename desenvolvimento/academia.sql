-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: academia
-- ------------------------------------------------------
-- Server version	5.1.56-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alunos`
--

DROP TABLE IF EXISTS `alunos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alunos` (
  `id_aluno` int(3) NOT NULL AUTO_INCREMENT,
  `nome_aluno` varchar(100) DEFAULT NULL,
  `data_nasci_aluno` date DEFAULT NULL,
  `rg_aluno` varchar(20) DEFAULT NULL,
  `telefone_aluno` varchar(20) DEFAULT NULL,
  `celular_aluno` varchar(20) DEFAULT NULL,
  `endereco_aluno` varchar(100) DEFAULT NULL,
  `num_ende_aluno` int(5) DEFAULT NULL,
  `bairro_aluno` varchar(100) DEFAULT NULL,
  `foto_aluno` longblob,
  `datainicio_aluno` date DEFAULT NULL,
  `datavencimento_aluno` date DEFAULT NULL,
  PRIMARY KEY (`id_aluno`)
) ENGINE=InnoDB AUTO_INCREMENT=118 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alunos`
--

LOCK TABLES `alunos` WRITE;
/*!40000 ALTER TABLE `alunos` DISABLE KEYS */;
INSERT INTO `alunos` VALUES (114,'joao','2016-12-09',' 21.321.312-2','(45)3453-4534','(90)9-9989-0870','rua',4,'vila',NULL,'2016-11-03','2016-11-04'),(115,'maria',NULL,' 34.343.434-3','(00)0000-0000','(00)0-0000-0000',NULL,5,'vila',NULL,'2016-11-02','2016-11-04'),(116,'jessica','2016-12-03',' 35.611.645-6','(43)5554-3545','(43)5-3453-4553','logradouro',3,'vila',NULL,'2016-11-03','2016-11-05');
/*!40000 ALTER TABLE `alunos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atividades`
--

DROP TABLE IF EXISTS `atividades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atividades` (
  `id_atividade` int(3) NOT NULL AUTO_INCREMENT,
  `nome_atividade` varchar(100) DEFAULT NULL,
  `tipo_atividade` varchar(100) DEFAULT NULL,
  `valor_atividade` double(6,2) DEFAULT NULL,
  PRIMARY KEY (`id_atividade`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atividades`
--

LOCK TABLES `atividades` WRITE;
/*!40000 ALTER TABLE `atividades` DISABLE KEYS */;
INSERT INTO `atividades` VALUES (1,'Esteira','Aeróbica',15.50),(2,'Pilates','Musculação',20.50);
/*!40000 ALTER TABLE `atividades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cargos`
--

DROP TABLE IF EXISTS `cargos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cargos` (
  `id_cargo` int(3) NOT NULL AUTO_INCREMENT,
  `nome_cargo` varchar(60) DEFAULT NULL,
  `gerenciar_aluno` tinyint(2) DEFAULT NULL,
  `gerenciar_funci` tinyint(2) DEFAULT NULL,
  `gerenciar_cargo` tinyint(2) DEFAULT NULL,
  `efetuar_pag` tinyint(2) DEFAULT NULL,
  `consulta_mensal` tinyint(2) DEFAULT NULL,
  `gerenciar_permissoes` tinyint(2) DEFAULT NULL,
  `gerenciar_relatorio` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`id_cargo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cargos`
--

LOCK TABLES `cargos` WRITE;
/*!40000 ALTER TABLE `cargos` DISABLE KEYS */;
INSERT INTO `cargos` VALUES (1,'Administrador',1,1,1,1,1,1,1),(2,'Funcionário',1,1,1,1,1,0,1),(3,'Gerente',1,1,0,1,1,0,1);
/*!40000 ALTER TABLE `cargos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionarios`
--

DROP TABLE IF EXISTS `funcionarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionarios` (
  `id_funci` int(5) NOT NULL AUTO_INCREMENT,
  `nome_funci` varchar(100) DEFAULT NULL,
  `data_nasci_funci` date DEFAULT NULL,
  `telefone_funci` varchar(20) DEFAULT NULL,
  `celular_funci` varchar(20) DEFAULT NULL,
  `foto_funci` longblob,
  `id_cargo_funci` int(3) DEFAULT NULL,
  `rg_funci` varchar(20) DEFAULT NULL,
  `usuario_funci` varchar(100) DEFAULT NULL,
  `senha_funci` varchar(100) DEFAULT NULL,
  `wallpaper_funci` longblob,
  PRIMARY KEY (`id_funci`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionarios`
--

LOCK TABLES `funcionarios` WRITE;
/*!40000 ALTER TABLE `funcionarios` DISABLE KEYS */;
INSERT INTO `funcionarios` VALUES (50,'2','2222-02-22','(00)0000-0000','(22)2-2222-2222',NULL,2,'22.222.222-2','2','2',NULL),(51,'123456',NULL,'(00)0000-0000','(00)0-0000-0000',NULL,2,'44.444.444-4','ds','df',NULL),(59,'1','1111-11-11','(11)1111-1111','(11)1-1111-1111',NULL,1,'11.111.111-1','1','1',NULL);
/*!40000 ALTER TABLE `funcionarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mensalidades`
--

DROP TABLE IF EXISTS `mensalidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mensalidades` (
  `id_mensal` int(5) NOT NULL AUTO_INCREMENT,
  `id_aluno` int(5) DEFAULT NULL,
  `id_atividade` int(5) DEFAULT NULL,
  `data_pagamento` date DEFAULT NULL,
  `data_vencimento` date DEFAULT NULL,
  `status_mensal` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_mensal`)
) ENGINE=InnoDB AUTO_INCREMENT=226 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mensalidades`
--

LOCK TABLES `mensalidades` WRITE;
/*!40000 ALTER TABLE `mensalidades` DISABLE KEYS */;
INSERT INTO `mensalidades` VALUES (109,8,NULL,'2016-11-04','2016-11-04','Pago'),(110,8,NULL,'2016-11-09','2016-12-04','Pago'),(111,8,NULL,'2016-11-09','2017-01-04','Pago'),(112,8,NULL,NULL,'2017-02-04','Devendo'),(113,9,NULL,NULL,'2016-11-04','Devendo'),(114,8,NULL,NULL,'2016-11-05','Devendo'),(115,8,NULL,NULL,'2016-11-04','Devendo'),(116,8,NULL,NULL,'2016-11-04','Devendo'),(117,13,NULL,NULL,'2016-11-04','Devendo'),(118,8,NULL,NULL,'2016-11-04','Devendo'),(119,8,NULL,NULL,'2016-11-04','Devendo'),(120,8,NULL,NULL,'2016-11-04','Devendo'),(121,8,NULL,NULL,'2016-11-04','Devendo'),(122,8,NULL,NULL,'2016-11-04','Devendo'),(123,8,NULL,NULL,'2016-11-04','Devendo'),(124,8,NULL,NULL,'2016-11-05','Devendo'),(125,8,NULL,NULL,'2016-11-05','Devendo'),(126,8,NULL,NULL,'2016-11-12','Devendo'),(127,8,NULL,NULL,'2016-11-05','Devendo'),(128,8,NULL,NULL,'2016-11-04','Devendo'),(129,8,NULL,NULL,'2016-11-04','Devendo'),(130,26,NULL,NULL,'2016-11-05','Devendo'),(131,26,NULL,NULL,'2016-11-04','Devendo'),(132,26,NULL,NULL,'2016-11-04','Devendo'),(133,26,NULL,NULL,'2016-11-04','Devendo'),(134,26,NULL,NULL,'2016-11-04','Devendo'),(135,27,NULL,NULL,'2016-11-04','Devendo'),(136,28,NULL,NULL,'2016-11-04','Devendo'),(137,29,NULL,NULL,'2016-11-04','Devendo'),(138,30,NULL,NULL,'2016-11-03','Devendo'),(139,31,NULL,NULL,'2016-11-05','Devendo'),(140,32,NULL,NULL,'2016-11-05','Devendo'),(141,33,NULL,NULL,'2016-11-05','Devendo'),(142,34,NULL,NULL,'2016-11-11','Devendo'),(143,35,NULL,NULL,'2016-11-05','Devendo'),(144,35,NULL,NULL,'2016-11-04','Devendo'),(145,35,NULL,NULL,'2016-11-05','Devendo'),(146,35,NULL,NULL,'2016-11-04','Devendo'),(147,35,NULL,NULL,'2016-11-05','Devendo'),(148,35,NULL,NULL,'2016-11-05','Devendo'),(149,38,NULL,NULL,'2016-11-12','Devendo'),(150,38,NULL,NULL,'2016-11-05','Devendo'),(151,43,NULL,NULL,'2016-11-05','Devendo'),(152,44,NULL,NULL,'2016-11-05','Devendo'),(153,45,NULL,NULL,'2016-11-05','Devendo'),(154,0,NULL,NULL,'2016-11-04','Devendo'),(155,0,NULL,NULL,'2016-11-05','Devendo'),(156,48,NULL,NULL,'2016-11-05','Devendo'),(157,49,NULL,NULL,'2016-11-12','Devendo'),(158,48,NULL,NULL,'2016-11-12','Devendo'),(159,51,NULL,NULL,'2016-11-12','Devendo'),(160,52,NULL,NULL,'2016-11-03','Devendo'),(161,53,NULL,NULL,'2016-11-12','Devendo'),(162,54,NULL,NULL,'2016-11-12','Devendo'),(163,55,NULL,NULL,'2016-11-11','Devendo'),(164,56,NULL,NULL,'2016-11-05','Devendo'),(165,57,NULL,NULL,'2016-11-12','Devendo'),(166,58,NULL,NULL,'2016-11-05','Devendo'),(167,58,NULL,NULL,'2016-11-05','Devendo'),(168,58,NULL,NULL,'2016-11-05','Devendo'),(169,61,NULL,NULL,'2016-11-05','Devendo'),(170,62,NULL,NULL,'2016-11-11','Devendo'),(171,63,NULL,NULL,'2016-11-05','Devendo'),(172,64,NULL,NULL,'2016-11-05','Devendo'),(173,65,NULL,NULL,'2016-11-05','Devendo'),(174,66,NULL,NULL,'2016-11-05','Devendo'),(175,67,NULL,NULL,'2016-11-05','Devendo'),(176,68,NULL,NULL,'2016-11-05','Devendo'),(177,69,NULL,NULL,'2016-11-04','Devendo'),(178,70,NULL,NULL,'2016-11-04','Devendo'),(179,71,NULL,NULL,'2016-11-04','Devendo'),(180,72,NULL,NULL,'2016-11-05','Devendo'),(181,73,NULL,NULL,'2016-11-04','Devendo'),(182,74,NULL,NULL,'2016-11-05','Devendo'),(183,75,NULL,NULL,'2016-11-04','Devendo'),(184,76,NULL,NULL,'2016-11-04','Devendo'),(185,77,NULL,NULL,'2016-11-04','Devendo'),(186,78,NULL,NULL,'2016-11-05','Devendo'),(187,78,NULL,NULL,'2016-11-04','Devendo'),(188,80,NULL,NULL,'2016-11-04','Devendo'),(189,81,NULL,NULL,'2016-11-05','Devendo'),(190,80,NULL,NULL,'2016-11-04','Devendo'),(191,83,NULL,NULL,'2016-11-04','Devendo'),(192,84,NULL,NULL,'2016-11-05','Devendo'),(193,85,NULL,NULL,'2016-11-04','Devendo'),(194,85,NULL,NULL,'2016-11-04','Devendo'),(195,85,NULL,NULL,'2016-11-05','Devendo'),(196,88,NULL,NULL,'2016-11-04','Devendo'),(197,89,NULL,NULL,'2016-11-05','Devendo'),(198,90,NULL,NULL,'2016-11-05','Devendo'),(199,91,NULL,NULL,'2016-11-11','Devendo'),(200,92,NULL,NULL,'2016-11-04','Devendo'),(201,93,NULL,NULL,'2016-11-05','Devendo'),(202,94,NULL,NULL,'2016-11-04','Devendo'),(203,95,NULL,NULL,'2016-11-04','Devendo'),(204,93,NULL,NULL,'2016-11-04','Devendo'),(205,97,NULL,NULL,'2016-11-05','Devendo'),(206,98,NULL,NULL,'2016-11-05','Devendo'),(207,99,NULL,NULL,'2016-11-05','Devendo'),(208,100,NULL,NULL,'2016-11-05','Devendo'),(209,98,NULL,NULL,'2016-11-05','Devendo'),(210,102,NULL,NULL,'2016-11-05','Devendo'),(211,103,NULL,NULL,'2016-11-04','Devendo'),(212,104,NULL,NULL,'2016-11-05','Devendo'),(213,105,NULL,NULL,'2016-11-04','Devendo'),(214,106,NULL,NULL,'2016-11-04','Devendo'),(215,107,NULL,NULL,'2016-11-04','Devendo'),(216,107,NULL,NULL,'2016-11-05','Devendo'),(217,109,NULL,NULL,'2016-11-05','Devendo'),(218,110,NULL,NULL,'2016-11-05','Devendo'),(219,111,NULL,NULL,'2016-11-05','Devendo'),(220,112,NULL,NULL,'2016-11-05','Devendo'),(221,113,NULL,NULL,'2016-11-05','Devendo'),(222,114,NULL,NULL,'2016-11-04','Devendo'),(223,115,NULL,NULL,'2016-11-04','Devendo'),(224,116,NULL,NULL,'2016-11-05','Devendo'),(225,117,NULL,NULL,'2016-11-05','Devendo');
/*!40000 ALTER TABLE `mensalidades` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-02 23:59:34
