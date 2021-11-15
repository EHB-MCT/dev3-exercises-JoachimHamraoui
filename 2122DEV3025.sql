/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE TABLE `cities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

CREATE TABLE `passengers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name-passenger` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

CREATE TABLE `ride-passengers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `passenger-id` int(11) NOT NULL,
  `ride-id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `passenger-id` (`passenger-id`),
  KEY `ride-passengers_ibfk_2` (`ride-id`),
  CONSTRAINT `ride-passengers_ibfk_1` FOREIGN KEY (`passenger-id`) REFERENCES `passengers` (`id`),
  CONSTRAINT `ride-passengers_ibfk_2` FOREIGN KEY (`ride-id`) REFERENCES `rides` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

CREATE TABLE `rides` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `train_id` int(11) NOT NULL,
  `departure-time` datetime NOT NULL,
  `departure-city` int(11) NOT NULL,
  `destination-city` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `train_id` (`train_id`),
  KEY `departure-city` (`departure-city`),
  KEY `destination-city` (`destination-city`),
  CONSTRAINT `rides_ibfk_1` FOREIGN KEY (`train_id`) REFERENCES `trains` (`id`),
  CONSTRAINT `rides_ibfk_2` FOREIGN KEY (`departure-city`) REFERENCES `cities` (`id`),
  CONSTRAINT `rides_ibfk_3` FOREIGN KEY (`destination-city`) REFERENCES `cities` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

CREATE TABLE `trains` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) NOT NULL,
  `max-speed` int(11) NOT NULL,
  `max-passengers` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

INSERT INTO `cities` (`id`, `city`) VALUES
(1, 'Brussel');
INSERT INTO `cities` (`id`, `city`) VALUES
(2, 'Antwerpen');
INSERT INTO `cities` (`id`, `city`) VALUES
(3, 'Gent');
INSERT INTO `cities` (`id`, `city`) VALUES
(4, 'Charleroi'),
(5, 'Ruisbroek'),
(6, 'Vorst');

INSERT INTO `passengers` (`id`, `name-passenger`, `status`) VALUES
(1, 'Joachim', 'student');
INSERT INTO `passengers` (`id`, `name-passenger`, `status`) VALUES
(2, 'Rhys', 'student');
INSERT INTO `passengers` (`id`, `name-passenger`, `status`) VALUES
(3, 'Sam', 'works');

INSERT INTO `ride-passengers` (`id`, `passenger-id`, `ride-id`) VALUES
(1, 1, 1);
INSERT INTO `ride-passengers` (`id`, `passenger-id`, `ride-id`) VALUES
(2, 1, 3);
INSERT INTO `ride-passengers` (`id`, `passenger-id`, `ride-id`) VALUES
(3, 2, 1);
INSERT INTO `ride-passengers` (`id`, `passenger-id`, `ride-id`) VALUES
(4, 3, 4),
(5, 2, 3);

INSERT INTO `rides` (`id`, `train_id`, `departure-time`, `departure-city`, `destination-city`) VALUES
(1, 1, '2021-01-29 17:01:05', 1, 4);
INSERT INTO `rides` (`id`, `train_id`, `departure-time`, `departure-city`, `destination-city`) VALUES
(2, 3, '2021-01-29 17:01:05', 4, 3);
INSERT INTO `rides` (`id`, `train_id`, `departure-time`, `departure-city`, `destination-city`) VALUES
(3, 5, '2021-01-29 17:01:05', 5, 6);
INSERT INTO `rides` (`id`, `train_id`, `departure-time`, `departure-city`, `destination-city`) VALUES
(4, 2, '2021-01-29 17:01:05', 2, 5);

INSERT INTO `trains` (`id`, `type`, `max-speed`, `max-passengers`) VALUES
(1, 'S23256', 200, 200);
INSERT INTO `trains` (`id`, `type`, `max-speed`, `max-passengers`) VALUES
(2, 'IC15645', 330, 300);
INSERT INTO `trains` (`id`, `type`, `max-speed`, `max-passengers`) VALUES
(3, 'S21565', 200, 220);
INSERT INTO `trains` (`id`, `type`, `max-speed`, `max-passengers`) VALUES
(4, 'S21234', 200, 220),
(5, 'IC26472', 330, 300);


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;