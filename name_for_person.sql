/*
 Navicat Premium Data Transfer

 Source Server         : db_mysql
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : name_for_person

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 31/12/2022 16:02:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for forname
-- ----------------------------
DROP TABLE IF EXISTS `forname`;
CREATE TABLE `forname`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名字',
  `zodiac` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生肖',
  `disposition` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性格',
  `tdgz` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '天地干支',
  `allusion` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '典故',
  `is_double` int(0) NOT NULL DEFAULT 1 COMMENT '是否单双',
  `gender` int(0) NOT NULL DEFAULT 1 COMMENT '性别',
  `unsurname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of forname
-- ----------------------------
INSERT INTO `forname` VALUES ('雷宇', '1', '活泼', 'a', '你', 0, 1, '');

SET FOREIGN_KEY_CHECKS = 1;
