--create table public.tb_countries (
--    id bigserial not null,
--    alpha_code_2 varchar(2) not null,
--    alpha_code_3 varchar(3) not null,
--    name_detail varchar(50) not null,
--    url_flag varchar(255),
--    timezone varchar(255),
--    gmt_offset varchar(255),
--    id_user integer not null,
--    condition smallint not null check (condition between 0 and 2),
--    create_at timestamp(6) not null,
--    update_at timestamp(6) not null,
--    delete_at timestamp default null,
--    primary key (id)
--)