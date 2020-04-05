/*
Navicat MySQL Data Transfer

Source Server         : sdut_sl
Source Server Version : 50613
Source Host           : localhost:3307
Source Database       : ls

Target Server Type    : MYSQL
Target Server Version : 50613
File Encoding         : 65001

Date: 2019-07-11 18:10:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for inoutrun
-- ----------------------------
DROP TABLE IF EXISTS `inoutrun`;
CREATE TABLE `inoutrun` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `financename` varchar(255) DEFAULT NULL,
  `sorts` varchar(255) NOT NULL,
  `money` double(11,0) NOT NULL,
  `time` datetime NOT NULL,
  `inoutsort` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of inoutrun
-- ----------------------------
INSERT INTO `inoutrun` VALUES ('1', '买菜', '食物', '100', '2010-10-10 08:00:00', '收入');

-- ----------------------------
-- Table structure for inoutsort
-- ----------------------------
DROP TABLE IF EXISTS `inoutsort`;
CREATE TABLE `inoutsort` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `inorout` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of inoutsort
-- ----------------------------
INSERT INTO `inoutsort` VALUES ('1', '购物', '收入');
INSERT INTO `inoutsort` VALUES ('2', '食物', '收入');
INSERT INTO `inoutsort` VALUES ('3', '购物', '支出');
INSERT INTO `inoutsort` VALUES ('4', '游戏', '支出');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `createtime` datetime NOT NULL,
  `updatetime` datetime NOT NULL,
  `roleid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '123', '123456', 'zzk', '2019-06-29 12:44:35', '2019-06-29 12:44:38', '1');
