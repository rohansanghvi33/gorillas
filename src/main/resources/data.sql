truncate table deliveries;

INSERT INTO deliveries(`id`,`product` , `supplier`, `quantity`, `expecteddate` , `warehouse`)
VALUES ('101' ,'Bananas','JungleInc', 1000000 ,'2027-01-08T07:17:48.237Z','TheMoon'),
       ('102' ,'Saiyans','Bardock', 9001 ,'2019-10-10T09:08:11.098Z','Namek'),
       ('103' ,'Skull, Crystal','Akator', 1 ,'2008-05-22T00:00:00.001Z','Headquarters'),
       ('104' ,'Bananas','JungleInc', 1 ,'2020-10-08T07:18:42.937Z','BerlinZoo'),
       ('105' ,'Apples','ApplesToOrangesInc', 50 ,'2019-10-10T09:08:11.098Z','Oranges'),
       ('106' ,'Salad','HealthyFoodInc', 600 ,'2021-11-01T11:20:42.000Z','Headquarters'),
       ('107' ,'Salad','HealthyFoodInc', 400 ,'2021-11-02T11:20:42.000Z','Headquarters'),
       ('108' ,'Salad','HealthyFoodInc', 800 ,'2021-11-03T11:20:42.000Z','Headquarters');
