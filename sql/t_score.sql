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

 Date: 21/05/2023 18:07:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_score
-- ----------------------------
DROP TABLE IF EXISTS `t_score`;
CREATE TABLE `t_score`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `create_user_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人姓名',
  `course_id` bigint(2) NULL DEFAULT NULL COMMENT '课程ID',
  `user_id` bigint(1) NULL DEFAULT NULL COMMENT '用户ID',
  `score` int(11) NULL DEFAULT NULL COMMENT '分数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '分数表' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of t_score
-- ----------------------------
INSERT INTO `t_score` VALUES (11, '2023-05-21 17:57:50', '若依', 2, 1, 87);
INSERT INTO `t_score` VALUES (12, '2023-05-21 17:59:11', '若依', 3, 1, 91);
INSERT INTO `t_score` VALUES (13, '2023-05-21 17:59:20', '若依', 4, 1, 70);
INSERT INTO `t_score` VALUES (14, '2023-05-21 17:59:31', '若依', 2, 2, 94);
INSERT INTO `t_score` VALUES (15, '2023-05-21 17:59:39', '若依', 3, 2, 96);
INSERT INTO `t_score` VALUES (16, '2023-05-21 17:59:51', '若依', 4, 2, 95);
INSERT INTO `t_score` VALUES (17, '2023-05-21 18:04:44', '若依', 11, 3, 66);

SET FOREIGN_KEY_CHECKS = 1;
