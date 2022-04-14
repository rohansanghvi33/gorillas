CREATE TABLE IF NOT EXISTS deliveries
(
    id varchar (255) primary key,
    product varchar (255) not null,
    supplier varchar (255) not null,
    quantity int not null,
    expecteddate varchar (255) not null,
    warehouse varchar (255) not null,
    isreceived boolean not null default false
);