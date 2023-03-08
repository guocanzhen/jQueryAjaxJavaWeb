CREATE DATABASE `persiondemo` /*!40100 DEFAULT CHARACTER SET utf8 */

-- persiondemo.goods definition

CREATE TABLE `goods` (
                         `id` bigint(20) NOT NULL,
                         `name` varchar(100) DEFAULT NULL,
                         `price` int(11) DEFAULT NULL,
                         `num` int(11) DEFAULT NULL,
                         `status` int(11) DEFAULT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;