
-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 23, 2016 at 06:40 AM
-- Server version: 10.0.20-MariaDB
-- PHP Version: 5.2.17

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `u286580799_calct`
--

-- --------------------------------------------------------

--
-- Table structure for table `calories_tab1`
--

CREATE TABLE IF NOT EXISTS `calories_tab1` (
  `username` varchar(40) COLLATE utf8_unicode_ci NOT NULL COMMENT 'username',
  `target` int(11) NOT NULL COMMENT 'target calories',
  `consumed` int(11) NOT NULL COMMENT 'consumed calories',
  `changed_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'changed at',
  `e_date` date NOT NULL COMMENT 'date'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Total Calories table';

--
-- Dumping data for table `calories_tab1`
--

INSERT INTO `calories_tab1` (`username`, `target`, `consumed`, `changed_at`, `e_date`) VALUES
('pavaniv', 1203, 1520, '2016-05-09 06:04:38', '2016-05-09');

-- --------------------------------------------------------

--
-- Table structure for table `cal_dts`
--

CREATE TABLE IF NOT EXISTS `cal_dts` (
  `username` varchar(40) COLLATE utf8_unicode_ci NOT NULL COMMENT 'username',
  `calories` int(11) NOT NULL COMMENT 'calories',
  `carbs` int(11) NOT NULL COMMENT 'total carbs',
  `at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'at'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='calories details table';

-- --------------------------------------------------------

--
-- Table structure for table `mytable`
--

CREATE TABLE IF NOT EXISTS `mytable` (
  `Record_ID` int(11) NOT NULL,
  `User_ID` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `dateTime` date NOT NULL,
  `activitiescalories` int(11) NOT NULL,
  `activitiessteps` int(11) NOT NULL,
  `activitiesdistance` decimal(8,5) NOT NULL,
  `activitiesfloors` int(11) NOT NULL,
  `activitieselevation` int(11) NOT NULL,
  `activitiesminutesSedentary` int(11) NOT NULL,
  `activitiesminutesLightlyActive` int(11) NOT NULL,
  `activitiesminutesFairlyActive` int(11) NOT NULL,
  `activitiesminutesVeryActive` int(11) NOT NULL,
  `sleepstartTime` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `sleeptimeInBed` int(11) NOT NULL,
  `sleepminutesAsleep` int(11) NOT NULL,
  `sleepawakeningsCount` int(11) NOT NULL,
  `sleepminutesAwake` int(11) NOT NULL,
  `sleepminutesAfterWakeup` int(11) NOT NULL,
  `sleepefficiency` int(11) NOT NULL,
  `bodyweight` int(11) NOT NULL,
  `bodybmi` decimal(11,8) NOT NULL,
  PRIMARY KEY (`Record_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `mytable`
--

INSERT INTO `mytable` (`Record_ID`, `User_ID`, `dateTime`, `activitiescalories`, `activitiessteps`, `activitiesdistance`, `activitiesfloors`, `activitieselevation`, `activitiesminutesSedentary`, `activitiesminutesLightlyActive`, `activitiesminutesFairlyActive`, `activitiesminutesVeryActive`, `sleepstartTime`, `sleeptimeInBed`, `sleepminutesAsleep`, `sleepawakeningsCount`, `sleepminutesAwake`, `sleepminutesAfterWakeup`, `sleepefficiency`, `bodyweight`, `bodybmi`) VALUES
(1, 'pavaniv', '2016-05-27', 2380, 4344, '3.15819', 13, 39, 800, 177, 142, 100, '3:35', 221, 90, 14, 131, 0, 41, 70, '22.80498695'),
(2, 'pavaniv', '2016-05-28', 2818, 7508, '5.45853', 38, 115, 701, 303, 0, 0, '1:22', 436, 175, 14, 261, 0, 40, 70, '22.80498695'),
(3, 'pavaniv', '2016-05-29', 2519, 6644, '4.83033', 26, 79, 802, 197, 5, 5, '0:50', 431, 112, 18, 297, 22, 27, 70, '22.80498695'),
(4, 'pavaniv', '2016-05-30', 2260, 4270, '3.10444', 7, 21, 851, 167, 0, 0, '0:02', 422, 156, 20, 254, 12, 38, 70, '22.80498695'),
(5, 'pavaniv', '2016-05-31', 2427, 6322, '4.59617', 12, 36, 798, 245, 0, 0, '0:09', 397, 188, 13, 209, 0, 47, 70, '22.80498695'),
(6, 'pavaniv', '2016-06-12', 2622, 11806, '8.58311', 39, 118, 792, 176, 17, 47, '1:02', 408, 162, 11, 222, 24, 42, 70, '22.80498695'),
(7, 'pavaniv', '2016-06-13', 2439, 6979, '5.07383', 19, 57, 778, 227, 0, 0, '0:29', 403, 189, 13, 214, 0, 47, 70, '22.80498695'),
(8, 'pavaniv', '2016-06-14', 2470, 6838, '4.97133', 21, 64, 776, 251, 0, 0, '23:28', 445, 147, 16, 298, 0, 33, 70, '22.80498695'),
(9, 'pavaniv', '2016-06-16', 2478, 5906, '4.29372', 7, 21, 809, 214, 9, 1, '0:04', 388, 267, 9, 112, 9, 70, 70, '22.80498695'),
(10, 'pavaniv', '2016-06-17', 2262, 3523, '2.56142', 8, 24, 798, 173, 0, 0, '23:41', 470, 239, 15, 181, 50, 57, 70, '22.80498695'),
(11, 'pavaniv', '2016-06-18', 2467, 6660, '4.84199', 19, 57, 734, 237, 0, 0, '23:42', 464, 187, 10, 231, 46, 45, 70, '22.80498695'),
(12, 'pavaniv', '2016-06-19', 2460, 8163, '5.93456', 15, 45, 622, 178, 19, 13, '23:38', 564, 190, 15, 278, 96, 41, 70, '22.80498695'),
(13, 'pavaniv', '2016-06-20', 2336, 4566, '3.31955', 9, 27, 809, 190, 0, 0, '0:06', 441, 181, 21, 241, 19, 43, 70, '22.80498695'),
(14, 'pavaniv', '2016-06-21', 2429, 5734, '4.16868', 5, 15, 800, 208, 0, 0, '0:27', 432, 233, 14, 185, 14, 56, 70, '22.80498695'),
(15, 'pavaniv', '2016-06-22', 2211, 3405, '2.47554', 15, 45, 717, 167, 0, 0, '0:02', 494, 234, 16, 234, 26, 50, 70, '22.80498695'),
(16, 'pavaniv', '2016-06-23', 2393, 4292, '3.12043', 18, 54, 776, 191, 0, 0, '22:58', 534, 239, 19, 265, 30, 47, 70, '22.80498695'),
(17, 'pavaniv', '2016-06-24', 2293, 4563, '3.31739', 6, 18, 855, 207, 0, 0, '1:43', 378, 220, 9, 134, 24, 62, 70, '22.80498695'),
(18, 'pavaniv', '2016-06-26', 2194, 3351, '2.43620', 10, 30, 726, 130, 9, 1, '0:34', 548, 177, 16, 309, 62, 36, 70, '22.80498695'),
(19, 'pavaniv', '2016-06-27', 2530, 5167, '3.75654', 12, 36, 741, 246, 0, 0, '23:34', 479, 247, 14, 221, 11, 53, 70, '22.80498695'),
(20, 'pavaniv', '2016-06-28', 2607, 6311, '4.58828', 18, 54, 713, 253, 0, 0, '0:10', 474, 225, 12, 145, 104, 61, 70, '22.80498695'),
(21, 'pavaniv', '2016-06-29', 2732, 10138, '7.37048', 7, 21, 698, 226, 19, 26, '0:06', 471, 255, 19, 189, 27, 57, 70, '22.80498695'),
(22, 'pavaniv', '2016-06-30', 2869, 13280, '9.65472', 10, 30, 1026, 193, 28, 40, '9:36', 89, 30, 3, 59, 0, 34, 70, '22.80498695'),
(23, 'pavaniv', '2016-07-01', 2648, 9933, '7.22129', 22, 67, 840, 206, 13, 11, '22:56', 433, 184, 16, 234, 15, 44, 70, '22.80498695'),
(24, 'pavaniv', '2016-07-02', 2459, 7404, '5.38281', 42, 128, 619, 207, 24, 6, '1:16', 500, 194, 17, 276, 30, 41, 70, '22.80498695'),
(25, 'pavaniv', '2016-07-03', 2687, 9825, '7.14294', 42, 128, 752, 204, 44, 20, '1:02', 313, 104, 15, 200, 9, 34, 70, '22.80498695'),
(26, 'pavaniv', '2016-07-04', 2600, 9670, '7.03024', 14, 42, 694, 222, 26, 12, '23:34', 502, 171, 16, 296, 35, 37, 70, '22.80498695'),
(27, 'pavaniv', '2016-07-05', 2303, 6205, '4.51113', 18, 54, 795, 189, 0, 0, '23:50', 466, 178, 14, 249, 39, 42, 70, '22.80498695'),
(28, 'pavaniv', '2016-07-06', 2597, 8931, '6.49296', 8, 24, 630, 139, 72, 4, '0:36', 595, 234, 17, 361, 0, 39, 70, '22.80498695'),
(29, 'pavaniv', '2016-07-07', 2539, 6171, '4.48640', 29, 88, 728, 238, 0, 0, '0:05', 474, 173, 16, 231, 70, 43, 70, '22.80498695'),
(30, 'pavaniv', '2016-07-08', 2848, 8942, '6.50106', 28, 85, 687, 313, 16, 2, '0:09', 422, 161, 12, 215, 46, 43, 70, '22.80498695'),
(31, 'sayori', '2016-07-09', 3695, 23432, '17.03537', 286, 871, 672, 483, 67, 11, '18:45', 128, 33, 3, 85, 10, 28, 70, '22.80498695'),
(32, 'sayori', '2016-07-10', 3842, 25465, '18.51349', 354, 1078, 516, 516, 58, 43, '22:41', 329, 175, 10, 140, 14, 56, 70, '22.80498695'),
(33, 'sayori', '2016-07-11', 2138, 3957, '2.87673', 19, 57, 828, 125, 0, 0, '23:04', 419, 224, 17, 188, 7, 54, 70, '22.80498695'),
(34, 'sayori', '2016-07-16', 2450, 7241, '5.26420', 9, 27, 644, 209, 9, 2, '0:24', 576, 232, 24, 334, 10, 41, 70, '22.80498695'),
(35, 'sayori', '2016-07-17', 2389, 4966, '3.61042', 22, 67, 798, 199, 0, 0, '2:48', 434, 164, 12, 246, 24, 40, 70, '22.80498695'),
(36, 'sayori', '2016-07-18', 2408, 5431, '3.94847', 16, 48, 739, 206, 0, 0, '23:51', 458, 131, 14, 263, 64, 33, 70, '22.80498695'),
(37, 'sayori', '2016-07-19', 2504, 6101, '4.43557', 12, 36, 762, 220, 19, 2, '23:14', 483, 221, 15, 190, 72, 54, 70, '22.80498695'),
(38, 'sayori', '2016-07-20', 2425, 5346, '3.88658', 11, 33, 781, 211, 0, 0, '0:34', 432, 261, 11, 171, 0, 60, 70, '22.80498695'),
(39, 'sayori', '2016-07-21', 2264, 4371, '3.17771', 12, 36, 771, 196, 9, 0, '23:44', 480, 242, 11, 238, 0, 50, 70, '22.80498695'),
(40, 'sayori', '2016-07-24', 2007, 2034, '1.47878', 6, 18, 1197, 93, 0, 0, '16:41', 115, 35, 5, 46, 34, 43, 70, '22.80498695'),
(41, 'sayori', '2016-07-25', 2555, 6186, '4.49735', 16, 48, 685, 218, 16, 1, '23:25', 465, 163, 13, 247, 55, 40, 70, '22.80498695'),
(42, 'sayori', '2016-07-26', 2324, 4550, '3.30798', 16, 48, 842, 175, 0, 0, '22:30', 512, 244, 21, 261, 7, 48, 70, '22.80498695'),
(43, 'sayori', '2016-07-28', 2492, 4719, '3.43071', 12, 36, 839, 138, 10, 0, '23:42', 471, 93, 20, 378, 0, 20, 70, '22.80498695'),
(44, 'sayori', '2016-07-31', 2077, 4472, '3.25118', 13, 39, 1217, 126, 0, 0, '14:45', 89, 31, 4, 58, 0, 35, 70, '22.80498695'),
(45, 'sayori', '2016-08-01', 2538, 9037, '6.57003', 83, 252, 598, 247, 10, 7, '23:52', 586, 132, 25, 436, 18, 23, 70, '22.80498695'),
(46, 'sayori', '2016-08-02', 2848, 9988, '7.26127', 45, 137, 531, 317, 24, 11, '0:12', 557, 108, 27, 435, 14, 20, 70, '22.80498695'),
(47, 'sayori', '2016-08-05', 2591, 6982, '5.07606', 20, 60, 737, 295, 10, 0, '1:04', 378, 153, 13, 194, 31, 44, 70, '22.80498695'),
(48, 'sayori', '2016-08-06', 1852, 1618, '1.17632', 4, 12, 792, 59, 0, 0, '23:40', 608, 269, 20, 307, 32, 47, 70, '22.80498695'),
(49, 'sayori', '2016-08-11', 3065, 9931, '7.21995', 9, 27, 628, 422, 0, 0, '0:26', 379, 209, 17, 150, 20, 58, 70, '22.80498695'),
(50, 'sayori', '2016-08-12', 2620, 8225, '5.97969', 35, 106, 700, 296, 0, 0, '23:49', 441, 277, 14, 164, 0, 63, 70, '22.80498695'),
(51, 'sayori', '2016-08-13', 2356, 6277, '4.56348', 38, 115, 584, 180, 12, 10, '23:46', 597, 263, 20, 295, 39, 47, 70, '22.80498695'),
(52, 'sayori', '2016-08-14', 3827, 23788, '17.29422', 261, 795, 535, 651, 11, 0, '23:54', 163, 40, 6, 86, 37, 32, 70, '22.80498695'),
(53, 'sayori', '2016-08-15', 2572, 8734, '6.34972', 46, 140, 607, 264, 0, 0, '22:34', 616, 328, 16, 278, 10, 54, 70, '22.80498695'),
(54, 'sayori', '2016-08-16', 2584, 6777, '4.92697', 19, 57, 741, 280, 0, 0, '23:21', 458, 164, 18, 287, 7, 36, 70, '22.80498695'),
(55, 'sayori', '2016-08-17', 2710, 8104, '5.89176', 38, 115, 790, 297, 0, 0, '1:13', 353, 164, 11, 175, 14, 48, 70, '22.80498695'),
(56, 'sayori', '2016-08-18', 2168, 5129, '3.72887', 11, 33, 878, 155, 0, 0, '0:32', 407, 217, 18, 190, 0, 53, 70, '22.80498695'),
(57, 'sayori', '2016-08-19', 1882, 1126, '0.81866', 2, 6, 877, 57, 0, 0, '3:54', 506, 238, 18, 258, 10, 48, 70, '22.80498695'),
(58, 'sayori', '2016-08-22', 2892, 9665, '7.02663', 25, 76, 636, 350, 13, 0, '0:00', 439, 154, 17, 285, 0, 35, 70, '22.80498695'),
(59, 'sayori', '2016-08-23', 2502, 6783, '4.93132', 30, 91, 768, 244, 7, 0, '23:58', 423, 207, 12, 180, 36, 53, 70, '22.80498695'),
(60, 'sayori', '2016-08-24', 2608, 7413, '5.38942', 18, 54, 787, 268, 12, 0, '1:06', 373, 172, 12, 201, 0, 46, 70, '22.80498695'),
(61, 'nirupama', '2016-08-25', 2452, 6110, '4.44213', 15, 45, 806, 251, 0, 0, '0:40', 383, 178, 15, 189, 16, 49, 70, '22.80498695'),
(62, 'nirupama', '2016-08-27', 2437, 5974, '4.34330', 19, 57, 710, 263, 0, 0, '0:38', 467, 229, 16, 231, 7, 50, 70, '22.80498695'),
(63, 'nirupama', '2016-08-28', 2775, 8150, '5.92521', 18, 54, 718, 283, 19, 3, '3:22', 331, 145, 13, 178, 8, 45, 70, '22.80498695'),
(64, 'nirupama', '2016-08-29', 2559, 7667, '5.57406', 14, 42, 577, 275, 0, 0, '0:19', 401, 189, 13, 192, 20, 50, 70, '22.80498695'),
(65, 'nirupama', '2016-08-30', 2582, 6512, '4.73422', 13, 39, 803, 185, 0, 0, '20:53', 638, 311, 21, 327, 0, 49, 70, '22.80498695'),
(66, 'nirupama', '2016-09-10', 3489, 16726, '12.16015', 121, 368, 664, 514, 13, 5, '0:41', 244, 93, 11, 151, 0, 38, 70, '22.80498695'),
(67, 'nirupama', '2016-09-11', 3557, 23598, '17.15574', 338, 1030, 477, 355, 75, 56, '0:16', 477, 292, 13, 173, 12, 63, 70, '22.80498695'),
(68, 'pavaniv', '2016-09-12', 2601, 9041, '6.57301', 35, 106, 825, 289, 0, 0, '1:26', 326, 114, 12, 175, 37, 39, 70, '22.80498695'),
(69, 'pavaniv', '2016-09-13', 2068, 4687, '3.40748', 49, 149, 931, 72, 26, 8, '0:01', 403, 237, 7, 166, 0, 59, 70, '22.80498695'),
(70, 'pavaniv', '2016-09-25', 2453, 6707, '4.87612', 27, 82, 727, 193, 5, 5, '23:35', 396, 183, 10, 179, 34, 51, 70, '22.80498695'),
(71, 'pavaniv', '2016-09-26', 2479, 7044, '5.12113', 28, 85, 752, 261, 0, 0, '23:37', 437, 155, 13, 241, 41, 39, 70, '22.80498695'),
(72, 'pavaniv', '2016-09-27', 2416, 7083, '5.14945', 25, 76, 768, 235, 0, 0, '23:47', 424, 247, 11, 141, 36, 64, 70, '22.80498695'),
(73, 'pavaniv', '2016-09-28', 2950, 12039, '8.75255', 36, 109, 572, 352, 5, 19, '23:34', 517, 239, 13, 258, 20, 48, 70, '22.80498695'),
(74, 'pavaniv', '2016-09-29', 2140, 3352, '2.43701', 3, 9, 1222, 113, 0, 0, '20:50', 105, 76, 4, 29, 0, 72, 70, '22.80498695'),
(75, 'pavaniv', '2016-09-30', 2518, 6632, '4.82157', 22, 67, 861, 274, 0, 0, '12:03', 305, 194, 14, 94, 17, 67, 70, '22.80498695'),
(76, 'pavaniv', '2016-10-01', 2140, 5296, '3.85025', 21, 64, 973, 79, 33, 5, '10:29', 350, 266, 11, 84, 0, 76, 70, '22.80498695');

-- --------------------------------------------------------

--
-- Table structure for table `prsn_details`
--

CREATE TABLE IF NOT EXISTS `prsn_details` (
  `username` varchar(40) COLLATE utf8_unicode_ci NOT NULL COMMENT 'user',
  `gender` char(20) COLLATE utf8_unicode_ci NOT NULL COMMENT 'gender',
  `height` int(11) NOT NULL COMMENT 'height',
  `weight` int(11) NOT NULL COMMENT 'weight',
  `age` int(11) NOT NULL COMMENT 'age',
  `bmr` double(11,2) NOT NULL COMMENT 'BMR',
  `idl_cal` double(11,2) NOT NULL COMMENT 'Ideal Calories per day',
  `last_updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'last_updated',
  PRIMARY KEY (`username`),
  KEY `username` (`username`),
  KEY `username_2` (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Person Details ';

--
-- Dumping data for table `prsn_details`
--

INSERT INTO `prsn_details` (`username`, `gender`, `height`, `weight`, `age`, `bmr`, `idl_cal`, `last_updated`) VALUES
('nishu', 'Male', 0, 90, 0, 0.00, 0.00, '2016-05-01 04:40:54'),
('pavaniv', '', 0, 0, 0, 0.00, 0.00, '2016-05-09 01:08:30'),
('komal', 'Female', 0, 55, 0, 0.00, 0.00, '2016-05-01 04:40:11'),
('test4', 'Female', 170, 56, 0, 0.00, 0.00, '2016-05-01 17:18:25'),
('vibhava', 'Female', 0, 0, 0, 0.00, 0.00, '2016-05-03 19:38:36'),
('test25', 'Female', 173, 100, 0, 0.00, 0.00, '2016-05-08 00:59:30'),
('test3', 'Female', 173, 73, 0, 1551.67, 1862.01, '2016-05-08 10:15:24'),
('test7', 'Female', 173, 73, 0, 1551.67, 1862.01, '2016-05-08 10:22:37'),
('test9', 'Female', 173, 73, 26, 1551.67, 1862.01, '2016-05-08 20:12:46'),
('test26', '', 0, 0, 0, 0.00, 0.00, '2016-05-09 04:16:06');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'User id',
  `email_id` varchar(254) COLLATE utf8_unicode_ci NOT NULL COMMENT 'email id',
  `username` varchar(40) COLLATE utf8_unicode_ci NOT NULL COMMENT 'username',
  `name` char(40) COLLATE utf8_unicode_ci NOT NULL COMMENT 'First Name',
  `password` varchar(128) COLLATE utf8_unicode_ci NOT NULL COMMENT 'Password',
  `crt_on` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'Created on',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_id` (`email_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='User Table' AUTO_INCREMENT=61 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `email_id`, `username`, `name`, `password`, `crt_on`) VALUES
(1, 'pavaniv@gmail.com', 'pavaniv', 'pavani', 'password', '2016-04-12 05:58:18'),
(53, 'sayori@gmail.com', 'sayori', 'sayori', 'pass', '2016-10-07 03:04:00'),
(49, 'test10', 'test10', 'test10', 'pass', '2016-05-08 20:21:19'),
(48, 'test9', 'test9', 'test9', 'pass', '2016-05-08 10:30:38'),
(31, 'vibhava@gmail.com', 'vibhava', 'vibhava', 'pass', '2016-05-03 19:37:54'),
(47, 'test8', 'test8', 'test8', 'pass', '2016-05-08 10:26:51'),
(46, 'test7', 'test7', 'test7', 'pass', '2016-05-08 10:22:10'),
(45, 'test6', 'test6', 'test6', 'pass', '2016-05-08 10:19:44'),
(44, 'test5', 'test5', 'test5', 'pass', '2016-05-08 10:19:10'),
(26, 'amma@gmail.com', 'ama', 'amma', 'pass', '2016-05-01 17:04:16'),
(25, 'nani@gmail.com', 'nani', 'nani', 'pass', '2016-05-01 17:02:23'),
(24, 'sahana@gmail.com', 'sahana', 'sahana', 'pass', '2016-05-01 16:55:38'),
(23, 'sound@gmail.com', 'sound', 'sound', 'pass', '2016-05-01 16:46:38'),
(22, 'anu@gmail.com', 'anu', 'anu', 'password', '2016-05-01 16:34:05'),
(21, 'usha@gmail.com', 'usha', 'usha', 'password', '2016-05-01 06:22:53'),
(20, 'nishu@gmail.com', 'nishu', 'nishu', 'password', '2016-05-01 05:50:30'),
(43, 'test4', 'test4', 'test4', 'pass', '2016-05-08 10:16:09'),
(42, 'test3', 'test3', 'test3', 'pass', '2016-05-08 10:13:41'),
(41, 'test2', 'test2', 'test2', 'pass', '2016-05-08 10:07:51'),
(40, 'test1', 'test1', 'test1', 'pass', '2016-05-08 10:02:37'),
(51, 'test26', 'test26', 'test26', 'pass', '2016-05-09 04:15:00'),
(52, 'test30', 'test30', 'test30', 'pass', '2016-05-09 10:27:40'),
(54, 'sayori1@gmail.com', 'sayori1', 'sayori', 'pass', '2016-10-07 03:04:35'),
(55, 'test100@gmail.com', 'test100', 'test100', 'pass', '2016-10-07 03:24:33'),
(56, 'test555@gmail.com', 'test555', 'test555', 'pass', '2016-10-07 03:58:44'),
(57, 'nirupama@gmail.com', 'nirupama', 'nirupama', 'pass', '2016-10-08 09:24:38'),
(58, 'pragati@gmail.com', 'pragati', 'pragati', 'pass', '2016-10-08 09:25:51'),
(59, 'pragati22@gmail.com', 'pragati22', 'pragati22', 'pragati22', '2016-10-08 15:20:49'),
(60, 'varshakollu@gmail.com', 'varshak', 'varsha', 'password', '2016-10-08 17:15:13');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
