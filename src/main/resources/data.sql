SET FOREIGN_KEY_CHECKS = 0;
ALTER TABLE houses DROP FOREIGN KEY FK5tsdkcf1lxtwgx8lw30jsux4y;
TRUNCATE houses;
TRUNCATE clients;
SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO clients (id, email, first_name, last_name, phone)
VALUES (1, 'bsoughton0@toplist.cz', 'Blisse', 'Soughton', '635 105 7680');
INSERT INTO clients (id, email, first_name, last_name, phone)
VALUES (2, 'llarcher1@dyndns.org', 'Leodora', 'Larcher', '227 759 6856');
INSERT INTO clients (id, email, first_name, last_name, phone)
VALUES (3, 'wbrinkworth2@topsy.com', 'Walther', 'Brinkworth', '150 518 7695');
INSERT INTO clients (id, email, first_name, last_name, phone)
VALUES (4, 'avirgin3@vistaprint.com', 'Ammamaria', 'Virgin', '217 855 8434');
INSERT INTO clients (id, email, first_name, last_name, phone)
VALUES (5, 'ykerwen4@cyberchimps.com', 'Yettie', 'Kerwen', '745 368 0151');
INSERT INTO clients (id, email, first_name, last_name, phone)
VALUES (6, 'kdarcy5@who.int', 'Kacey', 'd''Arcy', '874 428 4836');
INSERT INTO clients (id, email, first_name, last_name, phone)
VALUES (7, 'bfawdrie6@surveymonkey.com', 'Beck', 'Fawdrie', '155 331 4303');
INSERT INTO clients (id, email, first_name, last_name, phone)
VALUES (8, 'tdemichetti7@php.net', 'Thomas', 'De Michetti', '825 304 7834');
INSERT INTO clients (id, email, first_name, last_name, phone)
VALUES (9, 'smacloughlin8@cyberchimps.com', 'Silva', 'MacLoughlin', '819 835 7480');
INSERT INTO clients (id, email, first_name, last_name, phone)
VALUES (10, 'mwalder9@loc.gov', 'Meyer', 'Walder', '760 287 7277');
INSERT INTO clients (id, email, first_name, last_name, phone)
VALUES (11, 'rob@gro.dev', 'Robert', 'Grodzki', '123 456 789');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (1, 'West Bromwich', 'B71 3QU', 'Wyndmill Crescent', '116', '2');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (2, 'Birmingham', 'B14 5HT', 'Hawkhurst Road', '46', '1');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (3, 'Birmingham', 'B1 3QH', 'Parade Crescent', '13', null);
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (4, 'Alvechurch', 'B48 7SX', 'Old Rectory Lane', '4', '3');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (5, 'Birmingham', 'B23 5EJ', 'Cossington Road', '40', '6');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (6, 'Smethwick', 'B66 1LY', 'Albion Business Park', 'Unit 8', null);
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (7, 'Great Barr', 'B43 6EW', 'Whitecrest', '154', '8');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (8, 'Erdington', 'B24 9NQ', 'Kingsbury Road', '9', '7');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (9, 'Smethwick', 'B66 1DL', 'Perry Street', '49', '10');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (10, 'Sparkhill', 'B11 4JG', 'Croome Close', '3', '5');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (11, 'Redditch', 'B97 6JL', 'Ash Tree Road', '14', '7');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (12, 'Birmingham', 'B37 7PW', 'Willow Way', '68', '11');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (13, 'Bromsgrove', 'B60 2SR', 'Sonata Road', '2', '11');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (14, 'Handsworth', 'B20 3QD', 'Crompton Road', '33', '8');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (15, 'Sparkhill', 'B11 4PP', 'Wilton Road', '42', '9');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (16, 'Smethwick', 'B67 6QU', 'Hales Crescent', '2', '10');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (17, 'Birmingham', 'B11 1XA', 'Mole Street', '56', '4');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (18, 'Birmingham', 'B15 2PG', 'Metchley Park Road', '18', '5');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (19, 'Birmingham', 'B17 9AF', 'Hampton Court Road', '68', '6');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (20, 'Hanbury', 'B60 4HT', 'Forest Lane', '23', '9');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (21, 'Tividale', 'B69 1UQ', 'Penrice Drive', '24', '8');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (22, 'Tamworth', 'B77 4EF', 'Cornel Street', '48', '7');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (23, 'Bromsgrove', 'B60 2BG', 'Windsor Street', '2', '5');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (24, 'Hints', 'B78 3DW', 'School Lane', '34', '5');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (25, 'Sutton Coldfield', 'B75 6BB', 'Cossington Road', '81', '2');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (26, 'Birmingham', 'B31 3ST', 'Alfred Road', '36', '1');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (27, 'Dorridge', 'B93 8SQ', 'Wyndmill Crescent', '45', '3');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (28, 'Birmingham', 'B11 3JH', 'Evelyn Road', '15', '10');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (29, 'West Bromwich', 'B71 2QJ', 'Coles Lane', '29', '10');
INSERT INTO houses (id, city, post_code, street_name, street_number, client_id)
VALUES (30, 'Birmingham', 'B23 5EJ', 'Penrice Drive', '41', '8');