CREATE TABLE `ITEM_INGREDIENT` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ID_INGREDINT` bigint(20) DEFAULT NULL,
  `ID_ITEM` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ID_ITEM` (`ID_ITEM`),
  KEY `FK_ID_INGREDINT` (`ID_INGREDINT`),
  CONSTRAINT `FK_ID_ITEM` FOREIGN KEY (`ID_ITEM`) REFERENCES `ITEM` (`ID`),
  CONSTRAINT `FK_ID_INGREDINT` FOREIGN KEY (`ID_INGREDINT`) REFERENCES `ID_INGREDINT` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;