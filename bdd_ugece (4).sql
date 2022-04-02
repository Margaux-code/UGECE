-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : sam. 02 avr. 2022 à 10:38
-- Version du serveur : 8.0.27
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `bdd ugece`
--

-- --------------------------------------------------------

--
-- Structure de la table `clients`
--

DROP TABLE IF EXISTS `clients`;
CREATE TABLE IF NOT EXISTS `clients` (
  `User` varchar(20) DEFAULT NULL,
  `Mail` varchar(50) NOT NULL,
  `Membre` varchar(20) DEFAULT NULL,
  `Facture` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `Id_client` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`Id_client`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `clients`
--

INSERT INTO `clients` (`User`, `Mail`, `Membre`, `Facture`, `Password`, `Id_client`) VALUES
('Alix', 'alixpar@gmail.com', NULL, 'non', 'abc', 0),
('Cyriac', 'vdrcyriac@gmail.com', NULL, 'non', 'abc', 1),
('Margaux', 'margauxlango@gmail.com', 'Regulier', 'non', 'abc', 2),
('Matthieu', 'matthieu.gascon@hotmail.com', 'Regulier', 'non', 'abc', 3),
('Maggie', 'margaux.langautier@gmail.com', 'Enfant', 'non', 'abc', 4);

-- --------------------------------------------------------

--
-- Structure de la table `employe`
--

DROP TABLE IF EXISTS `employe`;
CREATE TABLE IF NOT EXISTS `employe` (
  `User` varchar(30) NOT NULL,
  `Id_reservation` int DEFAULT NULL,
  `Id_film` int DEFAULT NULL,
  `Id_client` int DEFAULT NULL,
  `Password` varchar(30) DEFAULT NULL,
  `Mail` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`User`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `employe`
--

INSERT INTO `employe` (`User`, `Id_reservation`, `Id_film`, `Id_client`, `Password`, `Mail`) VALUES
('Margaux', NULL, NULL, NULL, 'abc', 'margaux.langautier@gmail.com'),
('Paul', NULL, NULL, NULL, 'hello', 'paul.lala@hotmail.fr');

-- --------------------------------------------------------

--
-- Structure de la table `films`
--

DROP TABLE IF EXISTS `films`;
CREATE TABLE IF NOT EXISTS `films` (
  `ID_Film` int NOT NULL,
  `Nom` varchar(100) DEFAULT NULL,
  `Genres` varchar(1000) DEFAULT NULL,
  `Intrigue` varchar(1000) DEFAULT NULL,
  `Realisateur` varchar(100) DEFAULT NULL,
  `Acteurs` varchar(1000) DEFAULT NULL,
  `Annee` int DEFAULT NULL,
  `url_images` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`ID_Film`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Déchargement des données de la table `films`
--

INSERT INTO `films` (`ID_Film`, `Nom`, `Genres`, `Intrigue`, `Realisateur`, `Acteurs`, `Annee`, `url_images`) VALUES
(1, 'Le Voyage de Chihiro', 'Animation,Aventure', '<html> Chihiro, une fillette de 10 ans, est en route vers sa nouvelle demeure en compagnie de ses parents. Au cours du voyage, la famille fait une halte dans un parc à thème qui leur paraît délabré. Lors de la visite, les parents s’arrêtent dans un des bâtiments pour déguster quelques mets très appétissants, apparus comme par enchantement. Hélas cette nourriture les transforme en porcs. Prise de panique, Chihiro s’enfuit et se retrouve seule dans cet univers fantasmagorique. elle rencontre alors l’énigmatique Haku, son seul allié dans cette terrible épreuve... </hl>', ' Hayao Miyazaki', 'Rumi Hiiragi , Miyu Irino , Mari Natsuki', 2002, 'https://fr.web.img5.acsta.net/c_310_420/medias/nmedia/00/02/36/71/chihiro.jpg'),
(2, 'Le Chateau Ambulant', 'Animation,Fantastique', ' <html> La jeune Sophie, 18 ans, travaille inlassablement dans la chapellerie autrefois tenue par son père, malheureusement décédé. Résignée à son sort, c’est lors de l’une de ses rares sorties en ville qu’elle fait la connaissance du beau Hauru, un magicien. Mais la sorcière des Landes, jalouse de cette rencontre, jette un sort à Sophie, la transformant en vieille dame. Accablée par sa nouvelle apparence, Sophie s’enfuit dans les montagnes et tombe sur la demeure de Hauru : son Château Ambulant. Et si tout ceci n’était que le commencement d’une merveilleuse histoire </hl>', 'Hayao Miyazaki', ' Chieko Baisho , Takuya Kimura , Akihiro Miwa', 2005, 'https://fr.web.img4.acsta.net/c_310_420/medias/nmedia/18/35/48/22/18399898.jpg'),
(3, 'Your Name', 'Animation,Fantastique', '<html>Mitsuha, adolescente coincée dans une famille traditionnelle, rêve de quitter ses montagnes natales pour découvrir la vie trépidante de Tokyo. Elle est loin d’imaginer pouvoir vivre l’aventure urbaine dans la peau de… Taki, un jeune lycéen vivant à Tokyo, occupé entre son petit boulot dans un restaurant italien et ses nombreux amis. À travers ses rêves, Mitsuha se voit littéralement propulsée dans la vie du jeune garçon au point qu’elle croit vivre la réalité... Tout bascule lorsqu’elle réalise que Taki rêve également d’une vie dans les montagnes, entouré d’une famille traditionnelle… dans la peau d’une jeune fille ! Une étrange relation s’installe entre leurs deux corps qu’ils accaparent mutuellement. Quel mystère se cache derrière ces rêves étranges qui unissent deux destinées que tout oppose et qui ne se sont jamais rencontrées ?</hl>', 'Makoto Shinkai', 'Yoann Borg , Alice Orsat , Fanny Blanchard', 2016, 'https://fr.web.img6.acsta.net/c_310_420/pictures/16/12/12/13/49/295774.jpg'),
(4, 'Iron Man', 'Action,Science-fiction', '<html>Tony Stark, inventeur de génie, vendeur d\'armes et playboy milliardaire, est kidnappé en Aghanistan. Forcé par ses ravisseurs de fabriquer une arme redoutable, il construit en secret une armure high-tech révolutionnaire qu\'il utilise pour s\'échapper. Comprenant la puissance de cette armure, il décide de l\'améliorer et de l\'utiliser pour faire régner la justice et protéger les innocents.</hl>', 'Jon Favreau', 'Robert Downey Jr. , Terrence Howard , Gwyneth Paltrow', 2008, 'https://fr.web.img6.acsta.net/c_310_420/medias/nmedia/18/62/89/45/18876909.jpg'),
(5, 'Les Gardiens de la Galaxie', 'Science-fiction,Action', '<html>Peter Quill est un aventurier traqué par tous les chasseurs de primes pour avoir volé un mystérieux globe convoité par le puissant Ronan, dont les agissements menacent l’univers tout entier. Lorsqu’il découvre le véritable pouvoir de ce globe et la menace qui pèse sur la galaxie, il conclut une alliance fragile avec quatre aliens disparates : Rocket, un raton laveur fin tireur, Groot, un humanoïde semblable à un arbre, l’énigmatique et mortelle Gamora, et Drax le Destructeur, qui ne rêve que de vengeance. En les ralliant à sa cause, il les convainc de livrer un ultime combat aussi désespéré soit-il pour sauver ce qui peut encore l’être …</hl>', 'James Gunn', ' Chris Pratt, Zoe Saldana, Dave Bautista', 2014, 'https://fr.web.img3.acsta.net/c_310_420/pictures/14/08/04/15/09/405662.jpg'),
(6, 'Spider-Man: Homecoming', 'Action,Aventure', '<html>Après ses spectaculaires débuts dans Captain America : Civil War, le jeune Peter Parker découvre peu à peu sa nouvelle identité, celle de Spider-Man, le super-héros lanceur de toile. Galvanisé par son expérience avec les Avengers, Peter rentre chez lui auprès de sa tante May, sous l’œil attentif de son nouveau mentor, Tony Stark. Il s’efforce de reprendre sa vie d’avant, mais au fond de lui, Peter rêve de se prouver qu’il est plus que le sympathique super héros du quartier. L’apparition d’un nouvel ennemi, le Vautour, va mettre en danger tout ce qui compte pour lui...</hl>', 'Jon Watts', ' Tom Holland, Michael Keaton, Robert Downey Jr.', 2017, 'https://fr.web.img6.acsta.net/c_310_420/pictures/17/05/24/15/35/100661.jpg'),
(7, 'Vice-Versa', 'Animation,Comedie', '<htlm>Au Quartier Général, le centre de contrôle situé dans la tête de la petite Riley, 11 ans, cinq Émotions sont au travail. À leur tête, Joie, débordante d’optimisme et de bonne humeur, veille à ce que Riley soit heureuse. Peur se charge de la sécurité,  Colère s’assure que la justice règne, et Dégoût empêche Riley de se faire empoisonner la vie – au sens propre comme au figuré. Quant à Tristesse, elle n’est pas très sûre de son rôle. Les autres non plus, d’ailleurs… Lorsque la famille de Riley emménage dans une grande ville, avec tout ce que cela peut avoir d’effrayant, les Émotions ont fort à faire pour guider la jeune fille durant cette difficile transition. Mais quand Joie et Tristesse se perdent accidentellement dans les recoins les plus éloignés de l’esprit de Riley, emportant avec elles certains souvenirs essentiels, Peur, Colère et Dégoût sont bien obligés de prendre le relais. Joie et Tristesse vont devoir s’aventurer dans des endroits très inhabituels comme la Mémoire à lo', ' Pete Docter', 'Charlotte Le Bon , Pierre Niney , Mélanie Laurent', 2015, 'https://fr.web.img3.acsta.net/c_310_420/pictures/15/04/16/13/58/571071.jpg');

-- --------------------------------------------------------

--
-- Structure de la table `reservations`
--

DROP TABLE IF EXISTS `reservations`;
CREATE TABLE IF NOT EXISTS `reservations` (
  `ID_Reservation` int NOT NULL,
  `ID_Salle` int DEFAULT NULL,
  `ID_Tarif` int DEFAULT NULL,
  `Id_clients` int DEFAULT NULL,
  PRIMARY KEY (`ID_Reservation`),
  KEY `ID_Salle` (`ID_Salle`),
  KEY `ID_Tarif` (`ID_Tarif`),
  KEY `Id_clients` (`Id_clients`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Déchargement des données de la table `reservations`
--

INSERT INTO `reservations` (`ID_Reservation`, `ID_Salle`, `ID_Tarif`, `Id_clients`) VALUES
(0, 1, 42, 0),
(1, 1, 42, 1);

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

DROP TABLE IF EXISTS `salle`;
CREATE TABLE IF NOT EXISTS `salle` (
  `ID_salle` int NOT NULL,
  `places_total` int DEFAULT NULL,
  `places_libres` int DEFAULT NULL,
  `date` varchar(1000) DEFAULT NULL,
  `ID_Film` int DEFAULT NULL,
  PRIMARY KEY (`ID_salle`),
  KEY `ID_Film` (`ID_Film`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Déchargement des données de la table `salle`
--

INSERT INTO `salle` (`ID_salle`, `places_total`, `places_libres`, `date`, `ID_Film`) VALUES
(0, 50, 50, '7', 1),
(1, 100, 100, '12', 1),
(2, 150, 150, '5', 5),
(3, 70, 70, '23', 1);

-- --------------------------------------------------------

--
-- Structure de la table `tarifs`
--

DROP TABLE IF EXISTS `tarifs`;
CREATE TABLE IF NOT EXISTS `tarifs` (
  `ID_Tarif` int NOT NULL,
  `prix_enfant` int DEFAULT NULL,
  `prix_regulier` int DEFAULT NULL,
  `prix_senior` int DEFAULT NULL,
  `plein_tarif` int DEFAULT NULL,
  PRIMARY KEY (`ID_Tarif`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Déchargement des données de la table `tarifs`
--

INSERT INTO `tarifs` (`ID_Tarif`, `prix_enfant`, `prix_regulier`, `prix_senior`, `plein_tarif`) VALUES
(42, 4, 8, 6, 10);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `reservations_ibfk_1` FOREIGN KEY (`ID_Salle`) REFERENCES `salle` (`ID_salle`),
  ADD CONSTRAINT `reservations_ibfk_2` FOREIGN KEY (`ID_Tarif`) REFERENCES `tarifs` (`ID_Tarif`),
  ADD CONSTRAINT `reservations_ibfk_3` FOREIGN KEY (`Id_clients`) REFERENCES `clients` (`Id_client`);

--
-- Contraintes pour la table `salle`
--
ALTER TABLE `salle`
  ADD CONSTRAINT `ID_Film` FOREIGN KEY (`ID_Film`) REFERENCES `films` (`ID_Film`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
