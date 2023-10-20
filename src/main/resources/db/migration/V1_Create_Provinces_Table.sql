create table IF NOT EXISTS public.tb_provinces (
    id bigserial not null, 
    id_departament bigint not null, 
    name_detail varchar(50) not null, 
    id_user bigint not null, 
    condition smallint not null check (condition between 0 and 2), 
    create_at timestamp(6) not null, 
    update_at timestamp(6) not null, 
    delete_at TIMESTAMP DEFAULT NULL, 
    primary key (id)
);