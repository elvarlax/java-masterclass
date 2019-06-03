module academy.learnprogramming.db {
    requires java.sql;
    requires sqlite.jdbc;
    requires transitive academy.learnprogramming.common;

    exports academy.learnprogramming.db;
}