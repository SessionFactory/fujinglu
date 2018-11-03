/*
SQLyog Enterprise v12.2.6 (64 bit)
MySQL - 5.7.20 : Database - fujinglu
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE = ''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0 */;
/*!40101 SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES = @@SQL_NOTES, SQL_NOTES = 0 */;
CREATE
  DATABASE /*!32312 IF NOT EXISTS */fujinglu /*!40100 DEFAULT CHARACTER SET utf8 */;

USE
  fujinglu;

/*Data for the table qin_mobile */

insert into qin_mobile
(/**/
  mb_id, mb_qijiandianName, mb_photo,
  mb_bigPhotoList, mb_description,
  mb_publishDate, mb_banben, mb_operatorSystem,
  mb_name, mb_brand, mb_price,
  mb_screenSize, mb_Hot, mb_CPU,
  mb_color, mb_fenbianlv, mb_wangluozhishi,
  mb_jishenMemory, mb_yunxingMemory,
  mb_batteryMemory, mb_frontCamera, mb_photoSpecial,
  mb_backCamera, mb_weight, mb_pingmupeizhi,
  mb_laorenjipeizhi, mb_youxipeizhi, mb_cpuBrand,
  mb_duokazhichi, mb_dajiashuo/**/
)
values
(/**/
  3, '京东华为旗舰店', '1',
  '1', '1', '2018-10-02 13:20:18',
  '1', '1', '1',
  '1', 29998, '1',
  '1', '1', '黄色',
  '1', '1', '4G',
  '64G', '1', '1',
  '1', '1', '1',
  '1', '1', '1',
  '1', 1, '1'/**/
);

/*!40101 SET SQL_MODE = @OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES = @OLD_SQL_NOTES */;
