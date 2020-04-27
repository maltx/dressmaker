create sequence hibernate_sequence start with 1 increment by 1;

    create table Presence (
       id number(19,0) not null,
        section_id number(19,0),
        status_id number(19,0),
        worker_id number(19,0),
        primary key (id)
    );

    create table Section (
       id number(19,0) not null,
        section varchar2(255),
        primary key (id)
    );

    create table Status (
       id number(19,0) not null,
        status varchar2(255),
        primary key (id)
    );

    create table Worker (
       id number(19,0) not null,
        name varchar2(255),
        section_id number(19,0),
        primary key (id)
    );

    alter table Presence 
       add constraint FK56fvuyc6wyvn6bjjcm81owr0a 
       foreign key (section_id) 
       references Section;

    alter table Presence 
       add constraint FK9jg7fb44ihvqkfmixfxsjcpxl 
       foreign key (status_id) 
       references Status;

    alter table Presence 
       add constraint FKk3b261a5k2h11o11711bstpk0 
       foreign key (worker_id) 
       references Worker;

    alter table Worker 
       add constraint FKiilrpnjp23c1nvfyxllub6lyc 
       foreign key (section_id) 
       references Section;
