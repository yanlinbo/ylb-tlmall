/*
 Navicat Premium Data Transfer

 Source Server         : 本地MySQL_win
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : seata_stock

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 26/11/2022 12:30:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for stock_tbl
-- ----------------------------
DROP TABLE IF EXISTS `stock_tbl`;
CREATE TABLE `stock_tbl`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `product_id` int(0) NULL DEFAULT NULL,
  `count` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stock_tbl
-- ----------------------------
INSERT INTO `stock_tbl` VALUES (1, 9, 96);
INSERT INTO `stock_tbl` VALUES (2, 10, 78);
INSERT INTO `stock_tbl` VALUES (3, 11, 98);
INSERT INTO `stock_tbl` VALUES (4, 12, 100);
INSERT INTO `stock_tbl` VALUES (5, 13, 100);

SET FOREIGN_KEY_CHECKS = 1;
