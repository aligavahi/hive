CREATE DATABASE _REPLACE_WITH_DB_;
CREATE USER '_REPLACE_WITH_USER_'@'localhost' IDENTIFIED BY '_REPLACE_WITH_PASSWD_';
CREATE USER '_REPLACE_WITH_USER_'@'%' IDENTIFIED BY '_REPLACE_WITH_PASSWD_';
REVOKE ALL PRIVILEGES, GRANT OPTION FROM '_REPLACE_WITH_USER_'@'localhost';
REVOKE ALL PRIVILEGES, GRANT OPTION FROM '_REPLACE_WITH_USER_'@'%';
GRANT ALL PRIVILEGES ON _REPLACE_WITH_DB_.* TO '_REPLACE_WITH_USER_'@'localhost';
GRANT ALL PRIVILEGES ON _REPLACE_WITH_DB_.* TO '_REPLACE_WITH_USER_'@'%';
FLUSH PRIVILEGES;