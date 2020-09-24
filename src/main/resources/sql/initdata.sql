create table `idea`(
    `id` int unsigned primary key auto_increment,
    `timestamp` timestamp not null default '0000-00-00 00:00:00',
    `content` text not null default ''
);