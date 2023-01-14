SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for product_tbl
-- ----------------------------
DROP TABLE IF EXISTS `product_tbl`;
CREATE TABLE `product_tbl`  (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(100) NULL DEFAULT NULL,
  `product_sn` varchar(50) NULL DEFAULT NULL,
  `delete_status` int(0) NULL DEFAULT NULL,
  `sale` int(5) NULL DEFAULT NULL,
  `price` decimal NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_tbl
-- ----------------------------
INSERT INTO `product_tbl` VALUES (1, '被子', 'ylb001', 0,1000,20);
INSERT INTO `product_tbl` VALUES (2, '褥子', 'ylb002', 0,1000,20);
INSERT INTO `product_tbl` VALUES (3, '枕头', 'ylb003', 0,1000,20);
INSERT INTO `product_tbl` VALUES (4, '茶叶', 'ylb004', 0,1000,20);
INSERT INTO `product_tbl` VALUES (5, '手表', 'ylb005', 0,1000,20);
INSERT INTO `product_tbl` VALUES (6, '勺子', 'ylb006', 0,1000,20);

SET FOREIGN_KEY_CHECKS = 1;