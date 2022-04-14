truncate table deliveries;

INSERT INTO deliveries(`id`,`product` , `supplier`, `quantity`, `expecteddate` , `warehouse`)
VALUES ('101' ,'bananas','arham_marketing', 200 ,'12th may','central'),
       ('102' ,'bananas','arham_marketing', 10 ,'18th may','central');