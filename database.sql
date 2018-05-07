-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 07, 2018 at 05:32 PM
-- Server version: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `brain`
--
CREATE DATABASE IF NOT EXISTS `brain` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `brain`;

-- --------------------------------------------------------

--
-- Table structure for table `concepts`
--

DROP TABLE IF EXISTS `concepts`;
CREATE TABLE IF NOT EXISTS `concepts` (
  `concept_key` varchar(100) NOT NULL,
  `concept_name` varchar(100) NOT NULL,
  `concept_class_name` varchar(100) NOT NULL,
  `concept_class_keywords` varchar(1000) NOT NULL,
  `concept_url` varchar(1000) NOT NULL,
  UNIQUE KEY `key_index` (`concept_key`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `concepts`
--

INSERT INTO `concepts` (`concept_key`, `concept_name`, `concept_class_name`, `concept_class_keywords`, `concept_url`) VALUES
('labrador', 'caine', 'animal', 'patruped,dog', 'wiki....');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
