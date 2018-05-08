-- table book data
CREATE TABLE IF NOT EXISTS Book
(
	Id Int NOT NULL AUTO_INCREMENT,
	Name Varchar(60) NULL,
	Author Varchar(60) NULL,
	CONSTRAINT PK_Book PRIMARY KEY(Id)
);