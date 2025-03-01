package cz.vojtechkubat.sfgdi.datasource;

public class FakeDataSource {

    private String username;
    private String password;
    private String jdbcUrl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public void printAll() {
        System.out.println("> FakeDatasource > username: " + username);
        System.out.println("> FakeDatasource > password: " + password);
        System.out.println("> FakeDatasource > jdbcUrl:  " + jdbcUrl);
    }
}
