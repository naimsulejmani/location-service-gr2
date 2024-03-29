CREATE TABLE families (
    id bigint not null generated by default as identity primary key ,
    name varchar(50) not null ,
    user_id bigint not null,
    created_at timestamp not null,
    constraint fk_families_users_user_id foreign key (user_id) references  users(id),
    constraint uq_families_name_user_id unique (name, user_id)
);