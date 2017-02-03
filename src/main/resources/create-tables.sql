-- ---
-- MySQL table creation script
-- ---

-- ---
-- Globals
-- ---

-- SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
-- SET FOREIGN_KEY_CHECKS=0;

-- ---
-- Table 'Ship'
-- 
-- ---

DROP TABLE IF EXISTS `Ship`;
		
CREATE TABLE `Ship` (
  `id` INTEGER NULL AUTO_INCREMENT DEFAULT NULL,
  `Name` VARCHAR(128) NOT NULL,
  `RegistryNumber` VARCHAR(35) NOT NULL,
  `LaunchDate` DATE NOT NULL,
  PRIMARY KEY (`id`)
);

-- ---
-- Table 'CrewMember'
-- 
-- ---

DROP TABLE IF EXISTS `CrewMember`;
		
CREATE TABLE `CrewMember` (
  `id` INTEGER NULL AUTO_INCREMENT DEFAULT NULL,
  `Name` VARCHAR(128) NOT NULL,
  `AcademyGraduation` DATE NOT NULL,
  `Team` VARCHAR(256) NULL DEFAULT NULL,
  `Ship_id` INTEGER NULL DEFAULT NULL,
  `isCaptain` bit NOT NULL DEFAULT FALSE,
  PRIMARY KEY (`id`),
KEY (`isCaptain`)
);

-- ---
-- Foreign Keys 
-- ---

ALTER TABLE `CrewMember` ADD FOREIGN KEY (Ship_id) REFERENCES `Ship` (`id`);

-- ---
-- Table Properties
-- ---

-- ALTER TABLE `Ship` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `CrewMember` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ---
-- Test Data
-- ---

-- INSERT INTO `Ship` (`id`,`Name`,`RegistryNumber`,`LaunchDate`) VALUES
-- ('','','','');
-- INSERT INTO `CrewMember` (`id`,`Name`,`AcademyGraduation`,`YearsOfService`,`Team`,`Ship_id`,`isCaptain`) VALUES
-- ('','','','','','','');