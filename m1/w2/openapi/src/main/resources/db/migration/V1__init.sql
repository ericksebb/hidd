CREATE TABLE IF NOT EXISTS student (
    id SERIAL,
    nui VARCHAR(10) NOT NULL,
    fullname VARCHAR(255) NOT NULL,
    level VARCHAR(10) NOT NULL,
    age INT NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (nui)
);