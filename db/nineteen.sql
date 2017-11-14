/*
SQLyog v10.2 
MySQL - 5.7.16 : Database - nineteen
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`nineteen` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `nineteen`;

/*Table structure for table `dict` */

DROP TABLE IF EXISTS `dict`;

CREATE TABLE `dict` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `haschild` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pid` bigint(20) DEFAULT NULL,
  `property` varchar(255) DEFAULT NULL,
  `seq` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dict` */

/*Table structure for table `history` */

DROP TABLE IF EXISTS `history`;

CREATE TABLE `history` (
  `hid` varchar(36) NOT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `first_score` int(11) DEFAULT NULL,
  `second_score` int(11) DEFAULT NULL,
  `htime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `score` int(11) DEFAULT NULL,
  `hrate` int(11) DEFAULT NULL,
  PRIMARY KEY (`hid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `history` */

/*Table structure for table `permission` */

DROP TABLE IF EXISTS `permission`;

CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `description` varchar(64) DEFAULT NULL,
  `url` varchar(64) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `permission` */

insert  into `permission`(`id`,`name`,`description`,`url`,`pid`) values (1,'ROLE_HOME','home','/',NULL),(2,'ROLE_ADMIN','ABel','/admin',NULL),(3,'user_list','user_list','/user/list',NULL),(4,'role_list',NULL,'/role/list',NULL),(5,'permission_list',NULL,'/permission/list',NULL);

/*Table structure for table `permission_role` */

DROP TABLE IF EXISTS `permission_role`;

CREATE TABLE `permission_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `permission_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `role_id` (`role_id`),
  KEY `permission_id` (`permission_id`),
  CONSTRAINT `permission_role_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `permission_role_ibfk_2` FOREIGN KEY (`permission_id`) REFERENCES `permission` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `permission_role` */

insert  into `permission_role`(`id`,`role_id`,`permission_id`) values (1,1,1),(2,1,2),(3,2,1),(4,1,3),(5,1,4),(6,1,5);

/*Table structure for table `persistent_logins` */

DROP TABLE IF EXISTS `persistent_logins`;

CREATE TABLE `persistent_logins` (
  `series` varchar(64) NOT NULL,
  `last_used` datetime NOT NULL,
  `token` varchar(64) NOT NULL,
  `username` varchar(64) NOT NULL,
  PRIMARY KEY (`series`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `persistent_logins` */

insert  into `persistent_logins`(`series`,`last_used`,`token`,`username`) values ('p24ZuxpFxS13X3i36IKJow==','2017-09-02 22:17:03','VClpxvl41BIsEpw9Bpjemg==','user');

/*Table structure for table `question` */

DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `qtype` int(11) DEFAULT NULL,
  `qcontent` varchar(255) DEFAULT NULL,
  `a` varchar(255) DEFAULT NULL,
  `b` varchar(255) DEFAULT NULL,
  `c` varchar(255) DEFAULT NULL,
  `d` varchar(255) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL,
  `qexplain` varchar(255) DEFAULT NULL,
  `qvalue` int(11) DEFAULT NULL,
  `entertime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

/*Data for the table `question` */

insert  into `question`(`id`,`qtype`,`qcontent`,`a`,`b`,`c`,`d`,`answer`,`qexplain`,`qvalue`,`entertime`) values (1,1,'中国共产党第十九次全国代表大会召开时间_________。','2017.10.17','2017.10.18','2017.10.19','2017.10.20','B','2017.10.18',2,'2017-11-14 18:33:17'),(2,1,'中国共产党第十九次全国代表大会，是在全面建成小康社会决胜阶段，中国特色社会主义进入_________的关键时期召开的一次大会','新时期','新发展','新时代','新纪元','C','新时代',2,'2017-11-14 18:33:17'),(3,1,'十九大报告指出，脱贫攻坚战取得决定性进展，______贫困人口稳定脱贫，贫困发生率从百分之十点二下降到百分之四以下。','五千多万','六千多万','七千多万','八千多万','B','六千多万',2,'2017-11-14 18:33:17'),(4,1,'习近平同志在十九大报告中指出，经过长期努力，中国特色社会主义进入了_________，这是我国发展新的_________','新时代、历史方位','新时期、历史时期','新时代、历史时期','新时期、历史方位','A','新时代、历史方位',2,'2017-11-14 18:33:17'),(5,1,'_________是实现社会主义现代化，创造人民美好生活的必由之路','中国特色共产主义道路','中国共产主义道路','中国社会主义道路','中国特色社会主义道路','D','中国特色社会主义道路',2,'2017-11-14 18:33:17'),(6,1,'_________是当代中国发展进步的根本制度保障','中华人民共和国宪法','中国特色社会主义理论体系','中国特色社会主义制度','中国社会主义基本纲领','C','中国特色社会主义制度',2,'2017-11-14 18:33:17'),(7,1,'新时代中国特色社会主义思想，明确中国特色社会主义最本质的特征是_________','坚持社会主义制度','中国共产党领导','依法治国','坚持改革开放','B','中国共产党领导',2,'2017-11-14 18:33:17'),(8,1,'_________是中国特色社会主义的本质要求和重要保障','坚持社会主义制度','中国共产党领导','全面依法治国','坚持改革开放','C','全面依法治国',2,'2017-11-14 18:33:17'),(9,1,'_________是一个国家，一个民族发展中更基本更深沉更持久的力量','文化根基','制度自信','历史含蕴','文化自信','D','文化自信',2,'2017-11-14 18:33:17'),(10,1,'十九大的主题是_________','不忘初心，牢记使命','实现中华民族的伟大复兴','牢记人民，砥砺前行','发奋努力实现中国梦','A','不忘初心，牢记使命',2,'2017-11-14 18:33:17'),(11,1,'中国的历史使命是什么？','实现共产主义','实现中华民族伟大复兴','实现中国梦','全面建成小康社会','B','实现中华民族伟大复兴',2,'2017-11-14 18:33:17'),(12,1,'中国特色社会主义进入新时代是我国发展新的________','历史方位','历史时期','使命阶段','历史阶段','A','历史方位',2,'2017-11-14 18:33:17'),(13,1,'“四个伟大”中起决定作用的是党的建设新的_________','伟大斗争','伟大工程','伟大事业','伟大梦想','B','伟大工程',2,'2017-11-14 18:33:17'),(14,1,'从全面建成小康社会到全面建成社会主义现代化强国是我国_________','新的发展目标','新的历史阶段','新的奋斗目标','新的发展动力','C','新的奋斗目标',2,'2017-11-14 18:33:17'),(15,1,'适应新时代要求的新举措是_________','深化改革，适应时代新特色','深化改革，适应新的时代发展','坚持中国特色社会主义制度','确保一张蓝图干到底','D','确保一张蓝图干到底',2,'2017-11-14 18:33:17'),(16,1,'中国共产党以马克思列宁主义、毛泽东思想、邓小平理论、“三个代表重要思想”、科学发展观和_______作为自己的行动指南。','习近平新时代中国特色社会主义发展思想','习近平中国特色社会主义发展思想','习近平新时代中国特色社会主义思想','习近平新时代中国特色社会主义发展思想','C','习近平新时代中国特色社会主义思想',2,'2017-11-14 18:33:17'),(17,1,'我国正处于并将长期处于___________。','社会主义初级阶段','社会主义发展阶段','社会主义低级阶段','社会主义初级时期','A','社会主义初级阶段',2,'2017-11-14 18:33:17'),(18,1,'在现阶段，我国社会的主要矛盾是人民日益增长的_______需要和_________之间的矛盾','美好生活，不平衡不充分的发展','幸福生活，不平衡不充分的发展','幸福生活，发展不平衡','美好生活，发展不平衡','A','美好生活，不平衡不充分的发展',2,'2017-11-14 18:33:17'),(19,1,'必须坚持以_________的发展思想，坚持创新、协调、绿色、开放、共享的发展理念。','以人为中心','人民为本','以人为本','人民为中心','D','人民为中心',2,'2017-11-14 18:33:17'),(20,1,'在新世纪新时代，经济和社会发展的战略目标是，到建党一百年时，全面建成_______,到新中国成立一百年时，全面建成_________。','共同富裕社会，社会主义现代化国家','小康社会，社会主义现代化强国','小康社会，社会主义现代化国家','共同富裕社会，社会主义现代化强国','B','小康社会，社会主义现代化强国',2,'2017-11-14 18:33:17'),(21,1,'改革开放应当大胆探索，勇于开拓，提高改革决策的科学性，更加注重改革的______、_______、________，在实践中开创新路。','系统性，整体性，协调性','系统性，合理性，协调性','全面性，整体性，协同性','系统性，整体性，协同性','D','系统性，整体性，协同性',2,'2017-11-14 18:33:17'),(22,1,'发挥市场在资源配置中的_______作用，更好发挥______作用，建立完善的宏观调控体系。','基础性，征服','决定性，协调','决定性，征服','基础性，协调','C','决定性，征服',2,'2017-11-14 18:33:17'),(23,1,'发展党员，必须把________放在首位，经过党的支部，坚持个别吸收的原则。','政治觉悟','政治标准','政治思想','政治理想','B','政治标准',2,'2017-11-14 18:33:17'),(24,1,'十九大报告中指出，中国共产党人的初心和使命，就是__________','为中国人民谋福利，为中华民族谋发展','为中国人民谋福利，为中华民族谋复兴','为中国人民谋幸福，为中华民族谋复兴','为中国人民谋幸福，为中华民族谋发展','C','为中国人民谋幸福，为中华民族谋复兴',2,'2017-11-14 18:33:17'),(25,1,'十九大报告指出，五年来，我们统筹推进“五位一体”总体布局、协调推进（）战略布局，“十二五”规划胜利完成，“十三五”规划顺利实施，党和国家事业全面开创新局面。','四个全面','四大全面','五个全面','五大全面','A','四个全面',2,'2017-11-14 18:33:17'),(26,1,'习近平所作的十九大报告大气磅礴、内涵丰富，３万多字的报告纵观历史、展望未来，浓缩了５年来中国共产党治国理政的经验与启示，描绘了从现在到（）年乃至本世纪中叶的宏伟蓝图。','2020','2030','2050','2025','A','2020',2,'2017-11-14 18:33:17'),(27,1,'十九大报告提出重大理论创新成果，指出（），是对马克思列宁主义、毛泽东思想、邓小平理论、“三个代表”重要思想、科学发展观的继承和发展，是马克思主义中国化最新成果。','中国特色社会主义思想','新时代中国特色社会主义思想','习近平新时代中国特色社会主义思想','新时代中国特色社会主义思想体系','B','新时代中国特色社会主义思想',2,'2017-11-14 18:33:17'),(28,1,'习近平所作的十九大报告提出了新时代中国特色社会主义思想的（）和（）构成的新时代坚持和发展中国特色社会主义的基本方略，两者相互统一，共同构成新时代中国特色社会主义思想框架。','“3个明确”，“15条坚持”','“5个明确”，“14条坚持”','“8个明确”，“12条坚持”','“8个明确”，“14条坚持”','D','“8个明确”，“14条坚持”',2,'2017-11-14 18:33:17'),(29,1,'习近平所作的十九大报告中指出，社会主要矛盾历史性新变化：已转化为_______','“人民日益增长的美好生活需要和不平衡不充分的发展之间的矛盾”','“人民日益增长的生活需要和不平衡不充分的发展之间的矛盾”','“人民日益增长的美好生活需要和发展不平衡之间的矛盾”','“人民日益增长的美好生活需要和发展不平衡之间的矛盾”','A','“人民日益增长的美好生活需要和不平衡不充分的发展之间的矛盾”',2,'2017-11-14 18:33:17'),(30,1,'1.         习近平所作的十九大报告中指出，新的奋斗目标：是从全面建成小康到（）','社会主义现代化国家','社会主义现代化强国','社会主义现代化富强国家','社会主义现代化文明强国','B','社会主义现代化强国',2,'2017-11-14 18:33:17'),(31,1,'习近平所作的十九大报告中提到，从十九大到二十大，是（）奋斗目标的历史交汇期。','“两个十年计划”','“两个五年规划”','“两个一百年”','“两个现代化”','C','“两个一百年”',2,'2017-11-14 18:33:17'),(32,1,'习近平所作的十九大报告提出，必须坚持质量第一、效益优先，以（）为主线，推动经济发展质量变革、效率变革、动力变革，不断增强我国经济创新力和竞争力。','改善人民生活水平','供给侧结构性改革','供给侧改革','创新发展','B','供给侧结构性改革',2,'2017-11-14 18:33:17'),(33,1,'习近平所作的十九大报告指出，我们党深刻认识到，实现中华民族伟大复兴，必须建立符合我国实际的先进（）','社会制度','国家体制','发展体制','服务体系','A','社会制度',2,'2017-11-14 18:33:17'),(34,1,'习近平代表第十八届中央委员会向大会作的报告分几个部分？','十三','八','六','十四','A','十三',2,'2017-11-14 18:33:17'),(35,1,'中国特色社会主义进入新时代包含几个“意味着”？','十三','八','六','三','D','三',2,'2017-11-14 18:33:17'),(36,1,'新时代中国特色社会主义思想包含几个“明确”？','十三','八','六','十四','B','八',2,'2017-11-14 18:33:17'),(37,1,'新时代坚持和发展中国特色社会主义的基本方略有几个？','十三','八','六','十四','D','十四',2,'2017-11-14 18:33:17'),(38,1,'贯彻新发展理念，建设现代化经济体系分为几部分？','十三','八','六','十四','C','六',2,'2017-11-14 18:33:17'),(39,1,'健全人民当家作主制度体系，发展社会主义民主政治分为几部分？','十三','八','六','十四','C','六',2,'2017-11-14 18:33:17'),(40,1,'坚定文化自信，推动社会主义文化繁荣兴盛要注意几点？','十三','八','六','五','D','五',2,'2017-11-14 18:33:17'),(41,1,'提高保障和改善民生水平，加强和创新社会治理要注意几点？','七','八','六','五','A','七',2,'2017-11-14 18:33:17'),(42,1,'加快生态文明体制改革，建设美丽中国要注意几方面？','七','四','六','五','B','四',2,'2017-11-14 18:33:17'),(43,1,'报告中提到确保到2020年基本实现机械化，信息化建设取得重大进展，战略能力有大的提升。力争到哪一年基本实现国防和军队现代化，到本世纪中叶把人民军队全面建成世界一流军队？','2025','2035','2030','2020','B','2035',2,'2017-11-14 18:33:17'),(44,1,'十月24号通过了什么重要决议','《新一届中国共产党章程（修正案）》','《中国共产党章程（修正案）》','《中国共产党章程》','《中国共产党章程（修正法案）》','B','《中国共产党章程（修正案）》',2,'2017-11-14 18:33:17'),(45,1,'国内生产总值保持年均增长百分之多少','7.50%','7.00%','7.20%','7.30%','C','7.20%',2,'2017-11-14 18:33:17'),(46,1,'人民大会堂万人大礼堂，十九大会场，巨大的横幅上写的是什么。','“不忘初心，牢记使命”','“中国共产党第十九次全国全国人民代表大会”','“中共十九大召开”','“铭记历史，继往开来”','A','“不忘初心，牢记使命”',2,'2017-11-14 18:33:17'),(47,1,'习近平同志所作的十九大报告引起社会强烈反响，被外媒誉为一次中国共产党的什么。           答案：“超级公开课”','“超级公开课”','“超级课程表”','“超级实践课”','“超级理论发展课”','A','“超级公开课”',2,'2017-11-14 18:33:17'),(48,1,'中国共产党第十九届中央政治局常委中没有谁','栗战书','杨洁篪','汪洋','王沪宁','B','杨洁篪',2,'2017-11-14 18:33:17'),(49,1,'十九大报告中提到多少次人民  203次','203次','200次','205次','204次','A','203次',2,'2017-11-14 18:33:17'),(50,1,'十九大闭幕时间','10月23号','10月24号','10月25号','10月26号','D','10月26号',2,'2017-11-14 18:33:17');

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `code` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`id`,`name`,`code`) values (1,'ROLE_ADMIN',NULL),(2,'ROLE_USER',NULL);

/*Table structure for table `role_user` */

DROP TABLE IF EXISTS `role_user`;

CREATE TABLE `role_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `role_user_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `role_user_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `role_user` */

insert  into `role_user`(`id`,`user_id`,`role_id`) values (1,1,1),(2,2,2);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `phone` varchar(255) NOT NULL,
  `college_class` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `playtimes` int(11) DEFAULT NULL,
  `first_score` int(11) DEFAULT NULL,
  `second_score` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `last_rank` int(11) DEFAULT NULL,
  `enter_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`phone`,`college_class`,`name`,`playtimes`,`first_score`,`second_score`,`score`,`last_rank`,`enter_time`) values ('12634343',NULL,'江伟龙',NULL,NULL,NULL,101,NULL,'2017-11-14 17:51:34'),('13265969832','计算机152','李龙杰',NULL,NULL,NULL,0,NULL,'2017-11-14 17:51:34'),('13533805040',NULL,'钱伟健',NULL,NULL,NULL,10,NULL,'2017-11-14 17:51:34'),('13609736653','计算机151','陈文龙',NULL,NULL,NULL,0,NULL,'2017-11-14 17:52:13'),('13609748834','计算机152','陈盟',NULL,NULL,NULL,0,NULL,'2017-11-14 17:51:34');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(24) NOT NULL,
  `password` varchar(24) NOT NULL,
  `phone` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id`,`username`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`phone`) values (1,'admin','admin',NULL),(2,'abel','abel',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
