/*
 Navicat Premium Data Transfer

 Source Server         : local5.7
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : poi

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 10/01/2020 14:58:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_software
-- ----------------------------
DROP TABLE IF EXISTS `tb_software`;
CREATE TABLE `tb_software`  (
  `id` bigint(20) NOT NULL COMMENT '����\r\n',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '���������',
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '���� ���ڿ�����int��ʾ ö��',
  `charge_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '���ǵ�Excel�ĵ��� ����varchar ����=>�շ� 1:�շ� 2:���շ�',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;