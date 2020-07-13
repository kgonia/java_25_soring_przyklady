CREATE TABLE IF NOT EXISTS country_statistics (
  county_code VARCHAR(2) PRIMARY,
  active INT NOT NULL,
  deaths INT NOT NULL,
  recovered INT NOT NULL
);

INSERT INTO country_statistics VALUES
('pl',100000,100,10),
('de',1111111,22222,11)
