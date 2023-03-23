package Models;

import java.util.ArrayList;

public class Brave extends Browser{

    public Brave(String name, String iconSrc, String databasePath, String loginDatabasePath, ArrayList<String> sqlCommand,
            ArrayList<String> siteFields, ArrayList<String> downloadFields, ArrayList<String> loginFields) {
        super(name, iconSrc, databasePath, loginDatabasePath, sqlCommand, siteFields, downloadFields, loginFields);
    }

    public Brave() {
    }
}
