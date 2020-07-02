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
  `uid` int(11) NOT NULL ,
  `passwd` varchar(100) CHARACTER SET utf8  COMMENT '密码',
  `identity` int(10) COMMENT '身份',

  PRIMARY KEY (`uid`)

) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COMMENT='登陆';

DROP TABLE IF EXISTS `User`;
CREATE TABLE `User`(
    `uid` int(11) NOT NULL ,
    `name` varchar(100) NOT NULL ,
    `identity` int(10),
    `salary` int(10),
    PRIMARY KEY (`uid`)
)ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='员工';


-- ----------------------------
--  Records of `student.html`
-- ----------------------------
BEGIN;
INSERT INTO `Login` VALUES ('18080123', '123456','0'), ('18080120','123456','1'),('18080121','123456',2),('18080122','123456',3);
INSERT INTO `User`  VALUES ('18080123','高健','0','10000'),('18080120','张三','1','8000'),('18080121','李四','2','5000'),('18080122','王五','3','3500');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
