drop database if exists ecsite_db;

create database if not exists ecsite_db;
use ecsite_db;

drop table if exists user_info;

create table user_info(
user_id int not null primary key auto_increment,
user_name varchar(16),
password varchar(16),
postal_code varchar(16),
address varchar(50),
tell varchar(16),
email varchar(50),
insert_date datetime,
update_date datetime
);

drop table if exists item_info;

create table item_info(
item_id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
item_img varchar(50),
item_detail varchar(255),
category_id int,
category_word varchar(255),
insert_date datetime,
update_date datetime
);

drop table if exists cart_info;

create table cart_info(
item_id int not null primary key auto_increment,
user_name varchar(16),
item_name varchar(30),
total_price int,
count int,
insert_date datetime
);

drop table if exists buy_item_info;

create table buy_item_info(
id int not null primary key auto_increment,
user_id int,
user_name varchar(16),
item_name varchar(30),
total_price int,
count int,
pay varchar(16),
insert_date datetime,
delete_date datetime
);


INSERT INTO item_info(item_name, item_price, item_stock, item_img, item_detail, category_id, category_word) VALUES
("ノートBook", 100, 50,"img/note.jpg","再生紙を使っています",1,"ノートBook,文具,文房具,ノート,"),
("ボールPen",120,50,"img/ballpen.jpg","書き心地がとても良いです",1,"ボールPen,文具,文房具,ペン,ボールペン"),
("シャープPen",80,50,"img/sharppen.jpg","芯が折れにくいです",1,"シャープPen,文具,文房具,ペン,シャープペン"),
("机",8000,50,"img/table.jpg","松をつかっています",2,"机,家具,木製,つくえ,テーブル"),
("椅子",4000,50,"img/chair.jpg","しっかりしたステンレス製です",2,"椅子,家具,金属製,いす,チェア"),
("箪笥",15000,50,"img/Chest.jpg","檜を使っています",2,"箪笥,家具,木製,檜,ひのき,たんす"),
("りんご",100,50,"img/apple.jpg","青森産です",3,"りんご,リンゴ,林檎,果物,フルーツ"),
("キャベツ",200,50,"img/cabbage.jpg","身がしっかりつまってます",3,"キャベツ,野菜"),
("とうもろこし",200,50,"img/Corn.jpg","甘くておいしいです",3,"とうもろこし,野菜"),
("コート",8000,50,"img/coat.jpg","保温性がたかいです",4,"コート,服,衣類,冬物,メンズ"),
("T-シャツ",2000,50,"img/T-shirt.jpg","汗をよく吸収します",4,"T-シャツ,服,衣類,夏物"),
("スニーカー",5000,50,"img/sneakers.jpg","履き心地がいいです",4,"スニーカー,靴,メンズ"),
("電子レンジ",6000,50,"img/microwave.jpg","オーブン機能もあります",5,"電子レンジ,家電製品"),
("炊飯器",4000,50,"img/ricecooker.jpg","ご飯がおいしく炊けます",5,"炊飯器,炊飯ジャー,家電製品"),
("冷蔵庫",15000,50,"img/refrigerator.jpg","大容量の製品です",5,"冷蔵庫,家電製品");


INSERT INTO user_info(user_name, password, postal_code, address, tell, email) VALUES("internous", "internous01","120-0015", "東京都足立区足立○－○ー○","000-0000-0000","internousdev@gmail.com");