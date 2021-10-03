INSERT INTO tb_barbers (name) VALUES ('Ricardo');
INSERT INTO tb_barbers (name) VALUES ('Hermes');
INSERT INTO tb_barbers (name) VALUES ('Arsalan');

INSERT INTO tb_users (name, login, password) VALUES ('Gregory', 000001, 123456);
INSERT INTO tb_users (name, login, password) VALUES ('Noe', 000002, 123456);
INSERT INTO tb_users (name, login, password) VALUES ('Abraao', 000003, 123456);
INSERT INTO tb_users (name, login, password) VALUES ('Moises', 000004, 123456);
INSERT INTO tb_users (name, login, password) VALUES ('Salomao', 000005, 123456);

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