/*
Navicat MySQL Data Transfer

Source Server         : sada
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2022-06-22 16:50:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `admin` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '测试数据aaa');

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `department_name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '生产部');
INSERT INTO `department` VALUES ('2', '人事部');
INSERT INTO `department` VALUES ('3', '研发部');
INSERT INTO `department` VALUES ('4', '后勤部');

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `last_name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `gender` int(20) NOT NULL,
  `d_id` int(20) NOT NULL,
  `birth` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1003 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1001', 'E-AA', 'aa@163.com', '1', '1', '2022-06-22');
INSERT INTO `employee` VALUES ('1002', 'E-BB', 'bb@163.com', '1', '1', '2022-06-22');
