/*
 Navicat Premium Data Transfer

 Source Server         : 5.7
 Source Server Type    : MySQL
 Source Server Version : 50738
 Source Host           : localhost:3306
 Source Schema         : ry-vue

 Target Server Type    : MySQL
 Target Server Version : 50738
 File Encoding         : 65001

 Date: 21/05/2023 18:07:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student`  (
  `stu_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `stu_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '学生名称',
  PRIMARY KEY (`stu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '学生表' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES (1, '王小明');
INSERT INTO `t_student` VALUES (2, '张小丽');
INSERT INTO `t_student` VALUES (3, '赵刚');

SET FOREIGN_KEY_CHECKS = 1;
