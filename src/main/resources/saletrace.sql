-- MySQL dump 10.13  Distrib 5.7.12, for osx10.9 (x86_64)
--
-- Host: localhost    Database: sale_trace
-- ------------------------------------------------------
-- Server version	5.7.9

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
-- Table structure for table `customer_info`
--

DROP TABLE IF EXISTS `customer_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_info` (
  `customer_id` varchar(20) NOT NULL,
  `customer_phone` varchar(20) DEFAULT NULL,
  `gender` char(4) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `model` varchar(30) DEFAULT NULL,
  `value` decimal(4,2) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `customer_info_customer_id_uindex` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_info`
--

LOCK TABLES `customer_info` WRITE;
/*!40000 ALTER TABLE `customer_info` DISABLE KEYS */;
INSERT INTO `customer_info` VALUES ('1','17791641009','M',25,'panamera',99.00,1),('2','123124123213','M',19,'POLO',23.00,1),('3','12313421312','M',24,'Ferrari',35.00,2),('4','1233413412','F',20,'RANGE ROVER',30.00,2),('5','1889230283','男',40,'宝马',50.00,1),('6','123123','男',22,'丰田',22.00,2);
/*!40000 ALTER TABLE `customer_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_info_kuan`
--

DROP TABLE IF EXISTS `customer_info_kuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_info_kuan` (
  `customer_id` varchar(20) NOT NULL,
  `balance` decimal(4,2) DEFAULT NULL,
  `customer_phone1` varchar(20) DEFAULT NULL,
  `customer_phone2` varchar(20) DEFAULT NULL,
  `gender` char(4) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `model` varchar(30) DEFAULT NULL,
  `purchase_time` datetime DEFAULT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `customer_info_kuan_customer_id_uindex` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_info_kuan`
--

LOCK TABLES `customer_info_kuan` WRITE;
/*!40000 ALTER TABLE `customer_info_kuan` DISABLE KEYS */;
INSERT INTO `customer_info_kuan` VALUES ('12',12.00,'123','123','12',12,'12',NULL),('122',13.00,'1312','12','12',32,'12',NULL);
/*!40000 ALTER TABLE `customer_info_kuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fail_reason`
--

DROP TABLE IF EXISTS `fail_reason`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fail_reason` (
  `fail_reason_type` int(11) DEFAULT NULL,
  `fail_reason` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fail_reason`
--

LOCK TABLES `fail_reason` WRITE;
/*!40000 ALTER TABLE `fail_reason` DISABLE KEYS */;
/*!40000 ALTER TABLE `fail_reason` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `feedback` (
  `feedback_id` varchar(20) DEFAULT NULL,
  `user_id` varchar(20) DEFAULT NULL,
  `customer_id` varchar(20) DEFAULT NULL,
  `fail_reason_type` varchar(40) DEFAULT NULL,
  `sales_date` date DEFAULT NULL,
  `last_purchasedate` date DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES ('843327908391026688','1','1','未打通','2017-03-19',NULL,'qwe'),('843328940177227776','1','1','未打通','2017-03-19','2017-03-08','lll'),('843331303520813056','1','1','未打通','2017-03-19','2017-03-08','ooooo'),('843489417750626304','1','1','未打通','2017-03-19',NULL,''),('843489430836854784','1','2','未打通','2017-03-19',NULL,''),('843489433420546048','1','3','未打通','2017-03-19',NULL,''),('843489435404451840','1','4','未打通','2017-03-19',NULL,''),('843489439045107712','1','5','未打通','2017-03-19',NULL,''),('843489441809154048','1','6','未打通','2017-03-19',NULL,'');
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_info`
--

DROP TABLE IF EXISTS `user_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_info` (
  `user_type_id` int(11) DEFAULT NULL,
  `user_id` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_info_user_id_uindex` (`user_id`),
  UNIQUE KEY `user_info_username_uindex` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_info`
--

LOCK TABLES `user_info` WRITE;
/*!40000 ALTER TABLE `user_info` DISABLE KEYS */;
INSERT INTO `user_info` VALUES (1,'12121212','cc','cc'),(2,'123','123','123'),(2,'123123','hehe','1231234'),(1,'admin','admin','admin'),(2,'user1','testuser','testuser');
/*!40000 ALTER TABLE `user_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(45) DEFAULT NULL,
  `registration_code` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (1,'hehe','123',NULL,'123'),(3,'haha','123',NULL,'123'),(4,'cc','ferrari',NULL,'123');
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_type`
--

DROP TABLE IF EXISTS `user_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_type` (
  `user_type_id` int(11) DEFAULT NULL,
  `user_type` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_type`
--

LOCK TABLES `user_type` WRITE;
/*!40000 ALTER TABLE `user_type` DISABLE KEYS */;
INSERT INTO `user_type` VALUES (1,'admin'),(2,'user');
/*!40000 ALTER TABLE `user_type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-23 19:32:54
