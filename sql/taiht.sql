/*
 Navicat Premium Data Transfer

 Source Server         : taiht
 Source Server Type    : MySQL
 Source Server Version : 50650 (5.6.50-log)
 Source Host           : 1.15.47.70:3306
 Source Schema         : taiht

 Target Server Type    : MySQL
 Target Server Version : 50650 (5.6.50-log)
 File Encoding         : 65001

 Date: 21/11/2022 13:33:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`  (
  `a_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文章编号',
  `a_title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '文章标题',
  `a_author` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '文章作者',
  `a_time` datetime NOT NULL COMMENT '发表时间',
  `a_content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '文章内容',
  `a_cover` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '文章封面',
  `a_type` int(11) NOT NULL COMMENT '所属版块(0:新闻)',
  PRIMARY KEY (`a_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of article
-- ----------------------------

-- ----------------------------
-- Table structure for event
-- ----------------------------
DROP TABLE IF EXISTS `event`;
CREATE TABLE `event`  (
  `e_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '活动编号',
  `e_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '名称',
  `e_people_number` int(11) NOT NULL COMMENT '活动上限人数',
  `e_address` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '活动地点',
  `e_start_time` datetime NOT NULL COMMENT '活动开始日期时间',
  `e_end_time` datetime NOT NULL COMMENT '活动结束日期时间',
  `e_introduction` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '活动简介',
  `e_point` int(11) NOT NULL COMMENT '活动积分',
  `e_status` int(11) NOT NULL COMMENT '活动状态(0:失效,1:正常)',
  PRIMARY KEY (`e_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of event
-- ----------------------------

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log`  (
  `l_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '日志编号',
  `u_id` int(11) NOT NULL COMMENT '卡号',
  `l_start_time` datetime NULL DEFAULT NULL COMMENT '起始日期',
  `l_end_time` datetime NULL DEFAULT NULL COMMENT '终止日期',
  `l_type` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '日志类型',
  `l_remark` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '日志备注',
  PRIMARY KEY (`l_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of log
-- ----------------------------
INSERT INTO `log` VALUES (2, 1, '2022-11-20 19:35:39', '2022-11-20 19:35:39', 'user.login', NULL);
INSERT INTO `log` VALUES (3, 1, '2022-11-20 19:37:45', '2022-11-20 19:37:45', 'user.login', NULL);
INSERT INTO `log` VALUES (4, 1, '2022-11-20 19:39:16', '2022-11-20 19:39:16', 'user.login', NULL);
INSERT INTO `log` VALUES (5, 1, '2022-11-20 19:39:41', '2022-11-20 19:39:41', 'user.login', NULL);
INSERT INTO `log` VALUES (6, 1, '2022-11-20 19:39:44', '2022-11-20 19:39:44', 'user.login', NULL);
INSERT INTO `log` VALUES (7, 1, '2022-11-20 19:44:38', '2022-11-20 19:44:38', 'user.login', NULL);
INSERT INTO `log` VALUES (8, 1, '2022-11-20 19:45:50', '2022-11-20 19:45:50', 'user.login', NULL);
INSERT INTO `log` VALUES (9, 1, '2022-11-20 19:46:15', '2022-11-20 19:46:15', 'user.login', NULL);
INSERT INTO `log` VALUES (10, 1, '2022-11-20 19:48:36', '2022-11-20 19:48:36', 'user.login', NULL);
INSERT INTO `log` VALUES (11, 1, '2022-11-20 19:48:41', '2022-11-20 19:48:41', 'user.login', NULL);

-- ----------------------------
-- Table structure for report
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report`  (
  `r_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '举报编号',
  `r_object` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '被举报部门/人员',
  `r_title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '举报标题',
  `r_content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '举报内容',
  `r_password` char(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '查询密码',
  `r_phone` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '被举报人手机号',
  `r_public` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '是否公开(0:不公开,1:公开)',
  PRIMARY KEY (`r_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of report
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `u_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `u_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '姓名',
  `u_password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
  `u_identification_number` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '身份证号',
  `u_sex` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '性别(0:女,1:男)',
  `u_phone` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '手机号',
  `u_ethnic` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '民族',
  `u_village` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所在村',
  `u_status` int(11) NOT NULL COMMENT '账号状态(0:封禁,1:正常)',
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '摩尔', '123321', '340602000000000000', '0', '1582616876', '汉族', '童台社区', 1);

SET FOREIGN_KEY_CHECKS = 1;
