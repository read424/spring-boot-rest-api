create table IF NOT EXISTS public.tb_districts (
    id bigserial not null, 
    id_province bigint not null, 
    name_detail varchar(50) not null, 
    id_user integer not null, 
    condition smallint not null check (condition between 0 and 2), 
    create_at TIMESTAMP NOT NULL , 
    update_at TIMESTAMP NOT NULL , 
    delete_at TIMESTAMP DEFAULT NULL, 
    primary key (id)
);