DROP TABLE IF EXISTS record;
CREATE TABLE record
(
  id      INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  title   VARCHAR(255),
  text    TEXT,
  status  VARCHAR(255),
  user_id INT
);