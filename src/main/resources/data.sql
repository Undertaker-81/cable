

insert into wire (id, diameter, name_wire, nomenclature_id, number_coil_supplier, weight)
        VALUES(1, 5.23, 'Проволока медная 5,23 ТУ16-705.492-2005', 154172, 365 ,1226),
              (2, 4.5, 'Проволока медная 4,5 ТУ16-705.492-2005',  186925, 101803 , 1998),
              (3, 4.5, 'Проволока медная 4,5 ТУ16-705.492-2005',  186925, 101103 , 1942),
              (4, 4.5, 'Проволока медная 4,5 ТУ16-705.492-2005',  186925, 101801 , 2006),
              (5, 4.5, 'Проволока медная 4,5 ТУ16-705.492-2005',  186925, 101318 , 1990),
              (6, 4.5, 'Проволока медная 4,5 ТУ16-705.492-2005',  186925, 35810 , 2024),
              (7, 4.5, 'Проволока медная 4,5 ТУ16-705.492-2005',  186925, 101516 , 1987),
              (8, 4.5, 'Проволока медная 4,5 ТУ16-705.492-2005',  186925, 101518 , 1984),
              (9, 4.5, 'Проволока медная 4,5 ТУ16-705.492-2005',  186925, 101101 , 2182);

insert into tinned_wire (track_id, date_tinned, diameter, length, name, nomenclature_id, weight, wire_id)
                VALUES ('Л-22508', '2021-01-01', 4.5, 7000, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 1019, 2),
                       ('Л-22509', '2021-01-01', 4.5, 6730, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 979, 2),
                       ('Л-22510', '2021-01-01', 4.5, 7000, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 1024, 3),
                       ('Л-22511', '2021-01-01', 4.5, 6270, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 918, 3),
                       ('Л-22516', '2021-02-01', 4.5, 7000, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 1021, 4),
                       ('Л-22517', '2021-02-01', 4.5, 6750, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 985, 4),
                       ('Л-22524', '2021-02-01', 4.5, 7000, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 1018, 5),
                       ('Л-22525', '2021-02-01', 4.5, 6680, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 972, 5),
                       ('Л-22468', '2021-01-01', 4.5, 7000, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 1019, 6),
                       ('Л-22469', '2021-01-01', 4.5, 6900, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 1005, 6),
                       ('Л-22530', '2021-02-01', 4.5, 7000, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 1015, 7),
                       ('Л-22531', '2021-02-01', 4.5, 6700, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 972, 7),
                       ('Л-22526', '2021-02-01', 4.5, 7000, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 1017, 8),
                       ('Л-22527', '2021-02-01', 4.5, 6660, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 967, 8),
                       ('Л-22514', '2021-02-01', 4.5, 7000, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 1023, 9),
                       ('Л-22515', '2021-02-01', 4.5, 7930, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 1159, 9);

insert into insulated_wire (track_id, cable_cross_section, date_insulated, length, name, nomenclature_id)
                    VALUES ('и-27232', 16, '2021-01-31', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27233', 16, '2021-01-31', 6000, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27241', 16, '2021-02-02', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27242', 16, '2021-02-02', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27234', 16, '2021-01-31', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27240', 16, '2021-02-01', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27237', 16, '2021-02-01', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27231', 16, '2021-01-31', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27224', 16, '2021-02-01', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27225', 16, '2021-02-01', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27247', 16, '2021-02-03', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27248', 16, '2021-02-03', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27150', 16, '2021-01-19', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27151', 16, '2021-01-19', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27239', 16, '2021-02-01', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27249', 16, '2021-02-03', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27250', 16, '2021-02-03', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27238', 16, '2021-02-01', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27404', 16, '2021-03-03', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27455', 16, '2021-03-11', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27236', 16, '2021-02-01', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27235', 16, '2021-02-01', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27269', 16, '2021-02-01', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929),
                             ('и-27270', 16, '2021-02-01', 7500, 'Жила изолированная КЕСБП-230 16 ТУ16.К71-362-2006', 186929);


/*
insert into insulated_wire_tinned_wires (insulated_wire_track_id, tinned_wires_track_id)
                                VALUES ('и-27232', 'Л-22508'),
                                       ('и-27232', 'Л-22510'),
                                       ('и-27233','Л-22508'),
                                       ('и-27233','Л-22516'),
                                       ('и-27234','Л-22516'),
                                       ('и-27234','Л-22524'),
                                       ('и-27240','Л-22469'),
                                       ('и-27241','Л-22469'),
                                       ('и-27240','Л-22530'),
                                       ('и-27239','Л-22530'),
                                       ('и-27237','Л-22527'),
                                       ('и-27237','Л-22515'),
                                       ('и-27236','Л-22515'),
                                       ('и-27241','Л-22509'),
                                       ('и-27242','Л-22509'),
                                       ('и-27231','Л-22510'),
                                       ('и-27224','Л-22517'),
                                       ('и-27225','Л-22517'),
                                       ('и-27235','Л-22524'),
                                       ('и-27247','Л-22525'),
                                       ('и-27248','Л-22525'),
                                       ('и-27150','Л-22468'),
                                       ('и-27151','Л-22468'),
                                       ('и-27249','Л-22531'),
                                       ('и-27250','Л-22531'),
                                       ('и-27269','Л-22526'),
                                       ('и-27270','Л-22526'),
                                       ('и-27238','Л-22527'),
                                       ('и-27404','Л-22514'),
                                       ('и-27455','Л-22514');

 */

insert into tinned_wire_insulated_wire (id,length_tinned, insulated_wire_track_id, tinned_wire_track_id) values
                                        (1, 5100, 'и-27232', 'Л-22508'),
                                        (2, 2400, 'и-27232', 'Л-22510'),
                                        (3, 2200, 'и-27233','Л-22508'),
                                        (4, 3800, 'и-27233','Л-22516'),
                                        (5, 2400, 'и-27234','Л-22516'),
                                        (6, 1100, 'и-27234','Л-22516'),
                                        (7, 4000, 'и-27234','Л-22524'),
                                        (8, 3100, 'и-27240','Л-22469'),
                                        (9, 4100, 'и-27241','Л-22469'),
                                        (10, 4200, 'и-27240','Л-22530'),
                                        (11, 200, 'и-27240','Л-22530'),
                                        (12, 2900, 'и-27239','Л-22530'),
                                        (13, 2200, 'и-27237','Л-22527'),
                                        (14, 3700, 'и-27237','Л-22515'),
                                        (15, 1600, 'и-27237','Л-22515'),
                                        (16, 2900, 'и-27236','Л-22515'),
                                        (17, 3400, 'и-27241','Л-22509'),
                                        (18, 3600, 'и-27242','Л-22509'),
                                        (19, 4900, 'и-27231','Л-22510'),
                                        (20, 1700, 'и-27224','Л-22517'),
                                        (21, 600, 'и-27225','Л-22517'),
                                        (22, 4700, 'и-27225','Л-22517'),
                                        (23, 3300, 'и-27235','Л-22524'),
                                        (24, 1800, 'и-27247','Л-22525'),
                                        (25, 5100, 'и-27248','Л-22525'),
                                        (26, 500, 'и-27150','Л-22468'),
                                        (27, 6738, 'и-27151','Л-22468'),
                                        (28, 4600, 'и-27249','Л-22531'),
                                        (29, 400, 'и-27250','Л-22531'),
                                        (30, 2000, 'и-27250','Л-22531'),
                                        (31, 4100, 'и-27269','Л-22526'),
                                        (32, 3200, 'и-27270','Л-22526'),
                                        (33, 4800, 'и-27238','Л-22527'),
                                        (34, 6700, 'и-27404','Л-22514'),
                                        (35, 400, 'и-27455','Л-22514');

insert into lead_coated_wire (track_id, cable_cross_section, date_lead_coated, length, name, nomenclature_id, insulated_id)
                       values ('с-77400', 16, '2021-02-02', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27232'),
                              ('с-77401', 16, '2021-02-02', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27232'),
                              ('с-77402', 16, '2021-02-02', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27232'),
                              ('с-77406', 16, '2021-02-03', 2000, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27233'),
                              ('с-77407', 16, '2021-02-03', 2000, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27233'),
                              ('с-77408', 16, '2021-02-03', 2000, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27233'),
                              ('с-77427', 16, '2021-02-03', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27241'),
                              ('с-77428', 16, '2021-02-03', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27241'),
                              ('с-77429', 16, '2021-02-04', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27241'),
                              ('с-77430', 16, '2021-02-04', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27242'),
                              ('с-77431', 16, '2021-02-04', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27242'),
                              ('с-77432', 16, '2021-02-04', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27242'),
                              ('с-77403', 16, '2021-02-02', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27234'),
                              ('с-77404', 16, '2021-02-03', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27234'),
                              ('с-77405', 16, '2021-02-03', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27234'),
                              ('с-77425', 16, '2021-02-03', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27240'),
                              ('с-77424', 16, '2021-02-03', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27240'),
                              ('с-77426', 16, '2021-02-03', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27240'),
                              ('с-77415', 16, '2021-02-03', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27237'),
                              ('с-77416', 16, '2021-02-03', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27237'),
                              ('с-77417', 16, '2021-02-03', 2500, 'Жила изолированная освинцованная КЕСБП-230 16 ТУ16.К71-362-2006', 161328, 'и-27237');


insert into braided_wire (track_id, cable_cross_section, date_braided, length, name, nomenclature_id, lead_coated_id)
                    VALUES ('о-118011', 16, '2021-02-03', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77400'),
                           ('о-516535', 16, '2021-02-03', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77401'),
                           ('о-118009', 16, '2021-02-02', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77402'),
                           ('о-218484', 16, '2021-02-03', 2000, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77406'),
                           ('о-418801', 16, '2021-02-03', 2000, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77407'),
                           ('о-218485', 16, '2021-02-03', 2000, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77408'),
                           ('о-118015', 16, '2021-02-04', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77427'),
                           ('о-118020', 16, '2021-02-05', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77428'),
                           ('о-118029', 16, '2021-02-07', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77429'),
                           ('о-118024', 16, '2021-02-07', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77430'),
                           ('о-118022', 16, '2021-02-05', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77431'),
                           ('о-118023', 16, '2021-02-06', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77432'),
                           ('о-218493', 16, '2021-02-06', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77403'),
                           ('о-516534', 16, '2021-02-03', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77404'),
                           ('о-118010', 16, '2021-02-03', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77405'),
                           ('о-418806', 16, '2021-02-06', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77425'),
                           ('о-118014', 16, '2021-02-06', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77424'),
                           ('о-118018', 16, '2021-02-04', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77426'),
                           ('о-118016', 16, '2021-02-05', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77415'),
                           ('о-516536', 16, '2021-02-05', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77416'),
                           ('о-118012', 16, '2021-02-04', 2500, 'Жила изолированная освинцованная в оплетке КЕСБП-230 16 ТУ16.К71-362-2006', 186933, 'с-77417');

insert into armored_wire (track_id, cable_cross_section, date_armored, length, name, nomenclature_id)
                VALUES ('б-38808', 16, '2021-02-03', 2500, 'Кабель КЕСБП-230 Келаф 3х16 ТУ16.К71-362-2006', 104669),
                       ('б-29227', 16, '2021-02-04', 2000, 'Кабель КЕСБкП-230 Келаф 3х16 (Техтребования СК Борец)', 292429),
                       ('б-29230', 16, '2021-02-06', 2500, 'Кабель КЕСБП-230 Келаф 3х16 (Техтребования СК Борец)', 281090),
                       ('б-38818', 16, '2021-02-07', 2500, 'Кабель КЕСБП-230 Келаф 3х16 (Техтребования СК Борец)', 281090),
                       ('б-38811', 16, '2021-02-05', 2500, 'Кабель КЕСБП-230 Келаф 3х16 (Техтребования СК Борец)', 281090);

insert into armored_wire_braided_wires (armored_wire_track_id, braided_wires_track_id)
                                VALUES ('б-38808', 'о-118011'),
                                       ('б-38808', 'о-118009'),
                                       ('б-38808', 'о-118010'),
                                       ('б-29227', 'о-218484'),
                                       ('б-29227', 'о-418801'),
                                       ('б-29227', 'о-218485'),
                                       ('б-29230', 'о-118020'),
                                       ('б-29230', 'о-118022'),
                                       ('б-29230', 'о-218493'),
                                       ('б-38818', 'о-118024'),
                                       ('б-38818', 'о-118023'),
                                       ('б-38818', 'о-418806'),
                                       ('б-38811', 'о-118015'),
                                       ('б-38811', 'о-118014'),
                                       ('б-38811', 'о-118016');