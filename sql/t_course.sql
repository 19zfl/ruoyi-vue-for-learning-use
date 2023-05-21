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

 Date: 21/05/2023 18:07:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_course
-- ----------------------------
DROP TABLE IF EXISTS `t_course`;
CREATE TABLE `t_course`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `create_user_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人姓名',
  `course_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '课程名称',
  `course_status` int(1) NULL DEFAULT NULL COMMENT '课程状态（1：不可用；2：可用）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '课程表' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of t_course
-- ----------------------------
INSERT INTO `t_course` VALUES (2, '2023-01-11 20:28:21', '若依', '语文', 2);
INSERT INTO `t_course` VALUES (3, '2023-01-11 20:31:46', '若依', '数学', 2);
INSERT INTO `t_course` VALUES (4, '2023-01-11 20:31:51', '若依', '英语', 2);
INSERT INTO `t_course` VALUES (7, '2023-05-20 17:31:42', '若依', '物理', 2);
INSERT INTO `t_course` VALUES (8, '2023-05-20 17:31:53', '若依', '化学', 2);
INSERT INTO `t_course` VALUES (9, '2023-05-20 17:32:03', '若依', '生物', 2);
INSERT INTO `t_course` VALUES (10, '2023-05-20 17:32:38', '若依', '体育', 1);
INSERT INTO `t_course` VALUES (11, '2023-05-20 17:32:52', '若依', '美术', 1);

SET FOREIGN_KEY_CHECKS = 1;
