create table family_members (
    id bigint not null generated by default as identity primary key ,
    user_id bigint not null,
    family_id bigint not null,
    request_date timestamp not null default CURRENT_TIMESTAMP,
    valid_to timestamp not null default  CURRENT_TIMESTAMP + interval '7 days',
    approved boolean not null default false,
    approved_date timestamp null,
    constraint fk_family_members_users_user_id foreign key (user_id) references users(id),
    constraint fk_family_members_families_family_id foreign key (family_id) references families(id)
);