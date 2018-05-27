-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 20, 2018 at 11:33 AM
-- Server version: 5.7.21
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `brain`
--

-- --------------------------------------------------------

--
-- Table structure for table `concepts`
--

DROP TABLE IF EXISTS `concepts`;
CREATE TABLE IF NOT EXISTS `concepts` (
  `key_concept` varchar(100) NOT NULL,
  `class` varchar(100) NOT NULL,
  `subclass` varchar(100) NOT NULL,
  `characteristic` varchar(1000) NOT NULL,
  `link` varchar(100) NOT NULL,
  PRIMARY KEY (`key_concept`),
  KEY `indx` (`key_concept`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `concepts_class`
--

DROP TABLE IF EXISTS `concepts_class`;
CREATE TABLE IF NOT EXISTS `concepts_class` (
  `name_class` varchar(100) NOT NULL,
  `subclass` varchar(100) NOT NULL,
  `keywords` varchar(1000) NOT NULL,
  `characteristics` varchar(1000) NOT NULL,
  PRIMARY KEY (`name_class`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
