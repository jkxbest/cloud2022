/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : cloud2022

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 16/06/2022 19:46:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `serial` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付流水号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 44 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '支付表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of payment
-- ----------------------------
INSERT INTO `payment` VALUES (31, '尚硅谷111');
INSERT INTO `payment` VALUES (32, 'atguigu002');
INSERT INTO `payment` VALUES (34, 'atguigu002');
INSERT INTO `payment` VALUES (35, 'atguigu002');
INSERT INTO `payment` VALUES (36, 'jkxfirst001');
INSERT INTO `payment` VALUES (37, 'fjs2022');
INSERT INTO `payment` VALUES (38, NULL);
INSERT INTO `payment` VALUES (39, 'love520');
INSERT INTO `payment` VALUES (40, 'helloworld');
INSERT INTO `payment` VALUES (41, 'china');
INSERT INTO `payment` VALUES (42, 'hello');
INSERT INTO `payment` VALUES (43, 'hellojkx');
INSERT INTO `payment` VALUES (44, 'hellofjs');

SET FOREIGN_KEY_CHECKS = 1;
