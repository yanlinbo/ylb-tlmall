/*
 Navicat Premium Data Transfer

 Source Server         : 本地MySQL_win
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : seata_order

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 26/11/2022 12:30:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_tbl
-- ----------------------------
DROP TABLE IF EXISTS `order_tbl`;
CREATE TABLE `order_tbl`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `product_id` int(0) NULL DEFAULT NULL,
  `total_amount` int(0) NULL DEFAULT NULL,
  `status` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_tbl
-- ----------------------------
INSERT INTO `order_tbl` VALUES (2, 9, 100, 0);
INSERT INTO `order_tbl` VALUES (3, 9, 100, 0);
INSERT INTO `order_tbl` VALUES (4, 9, 100, 0);
INSERT INTO `order_tbl` VALUES (6, 9, 100, 0);
INSERT INTO `order_tbl` VALUES (7, 9, 100, 0);
INSERT INTO `order_tbl` VALUES (8, NULL, NULL, NULL);
INSERT INTO `order_tbl` VALUES (9, NULL, NULL, NULL);
INSERT INTO `order_tbl` VALUES (10, 10, 80, 0);
INSERT INTO `order_tbl` VALUES (11, 10, 80, 0);
INSERT INTO `order_tbl` VALUES (12, 11, 180, 0);
INSERT INTO `order_tbl` VALUES (13, 11, 180, 0);
INSERT INTO `order_tbl` VALUES (14, 11, 180, 0);
INSERT INTO `order_tbl` VALUES (15, 11, 180, 0);

SET FOREIGN_KEY_CHECKS = 1;
