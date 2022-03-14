-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema cogniclothdb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema cogniclothdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cogniclothdb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `cogniclothdb` ;

-- -----------------------------------------------------
-- Table `cogniclothdb`.`categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cogniclothdb`.`categories` (
  `CATEGORYID` BIGINT NOT NULL,
  `CATEGORYNAME` VARCHAR(40) NULL DEFAULT NULL,
  PRIMARY KEY (`CATEGORYID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cogniclothdb`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cogniclothdb`.`products` (
  `PRODUCTID` BIGINT NOT NULL,
  `SUPPLIERID` BIGINT NULL DEFAULT NULL,
  `UNITPRICE` DECIMAL(7,2) NULL DEFAULT NULL,
  `PRODUCTNAME` VARCHAR(40) NOT NULL,
  `PRODUCTDESCRIPTION` VARCHAR(40) NOT NULL,
  `CATEGORYID` BIGINT NOT NULL,
  `categories_CATEGORYID` BIGINT NOT NULL,
  PRIMARY KEY (`PRODUCTID`),
  INDEX `fk_products_categories_idx` (`categories_CATEGORYID` ASC) VISIBLE,
  CONSTRAINT `fk_products_categories`
    FOREIGN KEY (`categories_CATEGORYID`)
    REFERENCES `cogniclothdb`.`categories` (`CATEGORYID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cogniclothdb`.`customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cogniclothdb`.`customers` (
  `CUSTOMERID` CHAR(6) NOT NULL,
  `COMPANYNAME` VARCHAR(40) NOT NULL,
  `CONTACTNAME` VARCHAR(30) NULL DEFAULT NULL,
  `STREET` VARCHAR(60) NULL DEFAULT NULL,
  `CITY` VARCHAR(15) NULL DEFAULT NULL,
  `STATE` VARCHAR(15) NULL DEFAULT NULL,
  `products_PRODUCTID` BIGINT NOT NULL,
  PRIMARY KEY (`CUSTOMERID`, `products_PRODUCTID`),
  INDEX `fk_customers_products1_idx` (`products_PRODUCTID` ASC) VISIBLE,
  CONSTRAINT `fk_customers_products1`
    FOREIGN KEY (`products_PRODUCTID`)
    REFERENCES `cogniclothdb`.`products` (`PRODUCTID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cogniclothdb`.`cart`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cogniclothdb`.`cart` (
  `CUSTOMERID` CHAR(6) NOT NULL,
  `CARTID` BIGINT NOT NULL,
  `ORDERID` BIGINT NULL,
  `customers_CUSTOMERID` CHAR(6) NOT NULL,
  `customers_products_PRODUCTID` BIGINT NOT NULL,
  PRIMARY KEY (`customers_CUSTOMERID`, `customers_products_PRODUCTID`),
  CONSTRAINT `fk_cart_customers1`
    FOREIGN KEY (`customers_CUSTOMERID` , `customers_products_PRODUCTID`)
    REFERENCES `cogniclothdb`.`customers` (`CUSTOMERID` , `products_PRODUCTID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cogniclothdb`.`orderdetails`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cogniclothdb`.`orderdetails` (
  `ORDERID` BIGINT NOT NULL,
  `PRODUCTID` BIGINT NOT NULL,
  `QUANTITY` SMALLINT NOT NULL,
  `cart_customers_CUSTOMERID` CHAR(6) NOT NULL,
  `cart_customers_products_PRODUCTID` BIGINT NOT NULL,
  PRIMARY KEY (`cart_customers_CUSTOMERID`, `cart_customers_products_PRODUCTID`),
  CONSTRAINT `fk_orderdetails_cart1`
    FOREIGN KEY (`cart_customers_CUSTOMERID` , `cart_customers_products_PRODUCTID`)
    REFERENCES `cogniclothdb`.`cart` (`customers_CUSTOMERID` , `customers_products_PRODUCTID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cogniclothdb`.`suppliers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cogniclothdb`.`suppliers` (
  `SUPPLIERID` BIGINT NOT NULL,
  `COMPANYNAME` VARCHAR(40) NOT NULL,
  `CONTACTNAME` VARCHAR(30) NULL DEFAULT NULL,
  `products_PRODUCTID` BIGINT NOT NULL,
  `products_PRODUCTID1` BIGINT NOT NULL,
  `customers_CUSTOMERID` CHAR(6) NOT NULL,
  PRIMARY KEY (`SUPPLIERID`, `customers_CUSTOMERID`),
  INDEX `fk_suppliers_products1_idx` (`products_PRODUCTID` ASC) VISIBLE,
  INDEX `fk_suppliers_products2_idx` (`products_PRODUCTID1` ASC) VISIBLE,
  INDEX `fk_suppliers_customers1_idx` (`customers_CUSTOMERID` ASC) VISIBLE,
  CONSTRAINT `fk_suppliers_products1`
    FOREIGN KEY (`products_PRODUCTID`)
    REFERENCES `cogniclothdb`.`products` (`PRODUCTID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_suppliers_products2`
    FOREIGN KEY (`products_PRODUCTID1`)
    REFERENCES `cogniclothdb`.`products` (`PRODUCTID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_suppliers_customers1`
    FOREIGN KEY (`customers_CUSTOMERID`)
    REFERENCES `cogniclothdb`.`customers` (`CUSTOMERID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
