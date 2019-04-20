-- MySQL dump 10.13  Distrib 5.6.26, for Win32 (x86)
--
-- Host: localhost    Database: bookstore
-- ------------------------------------------------------
-- Server version	5.6.26

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
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `books` (
  `book_id` varchar(20) NOT NULL DEFAULT '',
  `book_name` varchar(50) DEFAULT NULL,
  `language` varchar(20) DEFAULT NULL,
  `country` varchar(20) DEFAULT NULL,
  `price` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `c_id` varchar(20) NOT NULL DEFAULT '',
  `categories` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contains`
--

DROP TABLE IF EXISTS `contains`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contains` (
  `order_no` varchar(15) NOT NULL DEFAULT '',
  `book_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`order_no`),
  KEY `fk_contains` (`book_id`),
  CONSTRAINT `contains_ibfk_1` FOREIGN KEY (`order_no`) REFERENCES `parcel` (`order_no`),
  CONSTRAINT `fk_contains` FOREIGN KEY (`book_id`) REFERENCES `books` (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contains`
--

LOCK TABLES `contains` WRITE;
/*!40000 ALTER TABLE `contains` DISABLE KEYS */;
/*!40000 ALTER TABLE `contains` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `has`
--

DROP TABLE IF EXISTS `has`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `has` (
  `book_id` varchar(20) NOT NULL DEFAULT '',
  `c_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`book_id`),
  KEY `fk_has` (`c_id`),
  CONSTRAINT `fk_has` FOREIGN KEY (`c_id`) REFERENCES `category` (`c_id`),
  CONSTRAINT `has_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `books` (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `has`
--

LOCK TABLES `has` WRITE;
/*!40000 ALTER TABLE `has` DISABLE KEYS */;
/*!40000 ALTER TABLE `has` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manager`
--

DROP TABLE IF EXISTS `manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `manager` (
  `m_id` varchar(20) NOT NULL DEFAULT '',
  `shop_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`m_id`),
  KEY `fk_manager` (`shop_id`),
  CONSTRAINT `fk_manager` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manager`
--

LOCK TABLES `manager` WRITE;
/*!40000 ALTER TABLE `manager` DISABLE KEYS */;
/*!40000 ALTER TABLE `manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `u_id` varchar(20) DEFAULT NULL,
  `order_no` varchar(15) NOT NULL DEFAULT '',
  PRIMARY KEY (`order_no`),
  KEY `fk_orders` (`u_id`),
  CONSTRAINT `fk_orders` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`order_no`) REFERENCES `parcel` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parcel`
--

DROP TABLE IF EXISTS `parcel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parcel` (
  `order_no` varchar(15) NOT NULL DEFAULT '',
  `u_id` varchar(20) DEFAULT NULL,
  `book_id` varchar(20) DEFAULT NULL,
  `price` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`order_no`),
  KEY `fk_parcel` (`u_id`),
  KEY `book_id` (`book_id`),
  CONSTRAINT `fk_parcel` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`),
  CONSTRAINT `parcel_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `books` (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parcel`
--

LOCK TABLES `parcel` WRITE;
/*!40000 ALTER TABLE `parcel` DISABLE KEYS */;
/*!40000 ALTER TABLE `parcel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publisher`
--

DROP TABLE IF EXISTS `publisher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `publisher` (
  `p_id` varchar(20) DEFAULT NULL,
  `book_id` varchar(20) NOT NULL DEFAULT '',
  `year` decimal(4,0) DEFAULT NULL,
  PRIMARY KEY (`book_id`),
  CONSTRAINT `fk_publisher` FOREIGN KEY (`book_id`) REFERENCES `books` (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publisher`
--

LOCK TABLES `publisher` WRITE;
/*!40000 ALTER TABLE `publisher` DISABLE KEYS */;
/*!40000 ALTER TABLE `publisher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `selects`
--

DROP TABLE IF EXISTS `selects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `selects` (
  `u_id` varchar(20) DEFAULT NULL,
  `c_id` varchar(20) DEFAULT NULL,
  KEY `fk_course` (`u_id`),
  KEY `c_id` (`c_id`),
  CONSTRAINT `fk_course` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`),
  CONSTRAINT `selects_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `category` (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `selects`
--

LOCK TABLES `selects` WRITE;
/*!40000 ALTER TABLE `selects` DISABLE KEYS */;
/*!40000 ALTER TABLE `selects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sells`
--

DROP TABLE IF EXISTS `sells`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sells` (
  `shop_id` varchar(20) DEFAULT NULL,
  `order_no` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`order_no`),
  KEY `fk_sells` (`shop_id`),
  CONSTRAINT `fk_sells` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shop_id`),
  CONSTRAINT `sells_ibfk_1` FOREIGN KEY (`order_no`) REFERENCES `parcel` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sells`
--

LOCK TABLES `sells` WRITE;
/*!40000 ALTER TABLE `sells` DISABLE KEYS */;
/*!40000 ALTER TABLE `sells` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop`
--

DROP TABLE IF EXISTS `shop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shop` (
  `shop_id` varchar(20) NOT NULL DEFAULT '',
  `shop_name` varchar(30) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`shop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop`
--

LOCK TABLES `shop` WRITE;
/*!40000 ALTER TABLE `shop` DISABLE KEYS */;
/*!40000 ALTER TABLE `shop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stuff`
--

DROP TABLE IF EXISTS `stuff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stuff` (
  `stuff_id` varchar(20) NOT NULL DEFAULT '',
  `stuff_name` varchar(30) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `salary` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`stuff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stuff`
--

LOCK TABLES `stuff` WRITE;
/*!40000 ALTER TABLE `stuff` DISABLE KEYS */;
/*!40000 ALTER TABLE `stuff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `u_id` varchar(20) NOT NULL DEFAULT '',
  `u_name` varchar(30) DEFAULT NULL,
  `passsword` varchar(15) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `E_mail` varchar(50) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userlogin`
--

DROP TABLE IF EXISTS `userlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userlogin` (
  `user` varchar(20) NOT NULL DEFAULT '',
  `password` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userlogin`
--

LOCK TABLES `userlogin` WRITE;
/*!40000 ALTER TABLE `userlogin` DISABLE KEYS */;
/*!40000 ALTER TABLE `userlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `works`
--

DROP TABLE IF EXISTS `works`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `works` (
  `stuff_id` varchar(20) NOT NULL DEFAULT '',
  `shop_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`stuff_id`),
  KEY `shop_id` (`shop_id`),
  CONSTRAINT `fk_works` FOREIGN KEY (`stuff_id`) REFERENCES `stuff` (`stuff_id`),
  CONSTRAINT `works_ibfk_1` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `works`
--

LOCK TABLES `works` WRITE;
/*!40000 ALTER TABLE `works` DISABLE KEYS */;
/*!40000 ALTER TABLE `works` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `writer`
--

DROP TABLE IF EXISTS `writer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `writer` (
  `w_id` varchar(20) NOT NULL DEFAULT '',
  `w_name` varchar(30) DEFAULT NULL,
  `country` varchar(15) DEFAULT NULL,
  `E_mail` varchar(50) NOT NULL DEFAULT '',
  `web` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`w_id`,`E_mail`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `writer`
--

LOCK TABLES `writer` WRITE;
/*!40000 ALTER TABLE `writer` DISABLE KEYS */;
/*!40000 ALTER TABLE `writer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `writes`
--

DROP TABLE IF EXISTS `writes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `writes` (
  `w_id` varchar(20) DEFAULT NULL,
  `book_id` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`book_id`),
  KEY `fk_writes` (`w_id`),
  CONSTRAINT `fk_writes` FOREIGN KEY (`w_id`) REFERENCES `writer` (`w_id`),
  CONSTRAINT `writes_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `books` (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `writes`
--

LOCK TABLES `writes` WRITE;
/*!40000 ALTER TABLE `writes` DISABLE KEYS */;
/*!40000 ALTER TABLE `writes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-18  3:57:48
