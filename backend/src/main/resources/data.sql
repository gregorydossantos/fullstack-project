INSERT INTO tb_barbers (name) VALUES ('Ricardo');
INSERT INTO tb_barbers (name) VALUES ('Hermes');
INSERT INTO tb_barbers (name) VALUES ('Arsalan');

INSERT INTO tb_users (name, phone, mail, login, password) VALUES ('Gregory', '(11)91234-5678', 'greg@mail.com', 12345678900, 123456);
INSERT INTO tb_users (name, phone, mail, login, password) VALUES ('Noe', '(11)91234-5678', 'noe@mail.com', 12345678900, 123456);
INSERT INTO tb_users (name, phone, mail, login, password) VALUES ('Abraao', '(11)91234-5678', 'abraao@mail.com', 12345678900, 123456);
INSERT INTO tb_users (name, phone, mail, login, password) VALUES ('Moises', '(11)91234-5678', 'moises@mail.com', 12345678900, 123456);
INSERT INTO tb_users (name, phone, mail, login, password) VALUES ('Salomao', '(11)91234-5678', 'salomao@mail.com', 12345678900, 123456);
INSERT INTO tb_users (name, phone, mail, login, password) VALUES ('Milca', '(11)91234-5678', 'milca@mail.com', 12345678900, 123456);

INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T10:00:00Z', 1, 1);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T10:30:00Z', 1, 2);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T11:00:00Z', 1, 3);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T11:30:00Z', 1, 4);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T12:00:00Z', 1, 5);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T12:30:00Z', 1, 6);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T10:00:00Z', 2, 1);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T10:30:00Z', 2, 2);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T11:00:00Z', 2, 3);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T11:30:00Z', 2, 4);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T12:00:00Z', 2, 5);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T12:30:00Z', 2, 6);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T10:00:00Z', 3, 1);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T10:30:00Z', 3, 2);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T11:00:00Z', 3, 3);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T11:30:00Z', 3, 4);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T12:00:00Z', 3, 5);
INSERT INTO tb_schedules (date_hour, barber_id, user_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-06-01T12:30:00Z', 3, 6);