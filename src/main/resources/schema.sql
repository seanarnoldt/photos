create table if not exists photos (
    id bigint primary key, 
    file_name varchar(255), 
    content_type varchar(255), 
    data blob
);