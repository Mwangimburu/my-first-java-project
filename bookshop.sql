-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 30, 2019 at 01:59 PM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bookshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`username`, `password`) VALUES
('christopher', 'c026');

-- --------------------------------------------------------

--
-- Table structure for table `attendants`
--

CREATE TABLE `attendants` (
  `firstname` varchar(20) DEFAULT NULL,
  `secondname` varchar(20) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendants`
--

INSERT INTO `attendants` (`firstname`, `secondname`, `username`, `password`) VALUES
('jack', 'son', 'son', ''),
('jack', 'son', 'son', 'son'),
('bskjn', 'jaemb kf', 'soi', 'soi'),
('mwa', 'mwa', 'mwa', 'mwa'),
('jame', 'jame', 'james', 'james'),
('first', 'second', 'frisrt', 'hjvda'),
('me', 'me', 'me', 'me');

-- --------------------------------------------------------

--
-- Table structure for table `bookdetails`
--

CREATE TABLE `bookdetails` (
  `book_id` int(11) DEFAULT NULL,
  `book_name` varchar(20) DEFAULT NULL,
  `book_category` varchar(20) DEFAULT NULL,
  `book_version` varchar(30) DEFAULT NULL,
  `book_author` varchar(50) DEFAULT NULL,
  `add_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bookdetails`
--

INSERT INTO `bookdetails` (`book_id`, `book_name`, `book_category`, `book_version`, `book_author`, `add_date`) VALUES
(60, 'mybook', 'Science', 'seccc', 'memm', '2019-07-05'),
(89, 'chemistry', 'Science', 'nom', 'kabito', '2019-07-26'),
(100, 'book1', 'Science', 'uo', 'us', '2019-07-09'),
(5, 'book2', 'Literature', 'm', 'm', '2019-07-06'),
(8, 'koko', 'Science', 'hoh', 'lo', '2019-07-05'),
(78, 'colo', 'Science', '34567ui', '3e4rtyui', '2019-07-11');

-- --------------------------------------------------------

--
-- Table structure for table `el_reg`
--

CREATE TABLE `el_reg` (
  `firstname` varchar(25) DEFAULT NULL,
  `middlename` varchar(25) DEFAULT NULL,
  `lastname` varchar(25) DEFAULT NULL,
  `id` int(11) DEFAULT NULL,
  `phone_number` int(11) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL,
  `confirm_pass` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `el_reg`
--

INSERT INTO `el_reg` (`firstname`, `middlename`, `lastname`, `id`, `phone_number`, `email`, `username`, `password`, `confirm_pass`) VALUES
('tuyidefv', 'vfgejbftdfvyuf', 'dguydwh', 4256732, 4165736, 'wakjnf@hxc', 'barrows', 'dsgavdbv', 'gdshvds'),
('christopher', 'mburu', 'mwangi', 36919826, 745159993, 'cm.mwangi11@gmail.com', 'christopher', 'cm12', 'cm12'),
('solo', 'mon', 'obino', 1234, 56789, 'obino@gmail', 'solo', 'solo', 'solo'),
('jack', 'son', 'mace', 345, 12334, 'cm@yahoo', 'jackson', 'jackson', 'jackson'),
('ian', 'juma', 'juma', 890, 1025637, 'juma@yahoo', 'juma', 'juma', 'juma'),
('bravo', 'm', 'nm', 4657, 78373, 'brav0@yahoo', 'bravo', 'bravo', 'bravo'),
('melvine', 'kipkemoi', 'yegon', 1234523, 23456, 'dfghjj@dfgh', 'dfghjk', '1234', '1234'),
('hriukwhfw', 'chxjbhv', 'bmvjsv', 23425, 635613, 'juma@yahoo', 'me', 'me', 'me'),
('hjced,ksav', 'jhwqbfk', 'bwqiufds', 12, 1123, 'cm.mwangi11@gmail.com', 'vio', 'vio', 'vio'),
('uioycv', 'CHGVJKBHV', 'CVMH ', 3456, 2345, 'YJBNJHBN@kj', 'nomo', 'nomo', 'nomo');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('chris', 'cm'),
('chris', 'gg');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
