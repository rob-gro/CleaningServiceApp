package dev.robgro.cleaningserviceapp.infra;

import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component
public class DataLoader {

    private final DataSource dataSource;

    public DataLoader(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void loadInitialData() {
        try (Connection connection = dataSource.getConnection()) {
            ClassPathResource resource = new ClassPathResource("data.sql");
            ScriptUtils.executeSqlScript(connection, resource);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
