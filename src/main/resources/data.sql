insert into wire (diameter, name_wire, nomenclature_id, number_coil_supplier, weight)
        VALUES(5.23, 'Проволока медная 5,23 ТУ16-705.492-2005', 154172, 365 ,1226),
              (4.5, 'Проволока медная 4,5 ТУ16-705.492-2005',  186925, 101803 , 1998);

insert into tinned_wire (track_id, date_tinned, diameter, length, name, nomenclature_id, weight, wire_id)
                VALUES ('Л-22508', '2021-01-01', 4.5, 7000, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 1019, 2),
                       ('Л-22509', '2021-01-01', 4.5, 6730, 'Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006', 186925, 979, 2);

insert into insulated_wire (track_id, cable_cross_section, date_insulated, length, name, nomenclature_id, tinned_id)
                    VALUES ('и-27232', 16, '2021-01-31', ),
