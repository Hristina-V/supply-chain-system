# DB scripts

## Create table users

``` sql
CREATE TABLE supplychain.users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT
);
```