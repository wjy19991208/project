/*
 Navicat Premium Data Transfer

 Source Server         : LocalHost
 Source Server Type    : MySQL
 Source Server Version : 50621
 Source Host           : localhost
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50621
 File Encoding         : utf-8

 Date: 07/01/2018 21:28:02 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `student.html`
-- ----------------------------
DROP TABLE IF EXISTS `Login`;
CREATE TABLE `Login` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `passwd` varchar(100) CHARACTER SET utf8  COMMENT '密码',

  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COMMENT='登陆';

-- ----------------------------
--  Records of `student.html`
-- ----------------------------
BEGIN;
INSERT INTO `Login` VALUES ('18080123', '123456'), ('21233','123456');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
