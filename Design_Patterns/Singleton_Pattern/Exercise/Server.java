package Design_Patterns.Singleton_Pattern.Exercise;

import java.util.*;
import java.util.stream.Collectors;

class Server {

    /// private constructor
    private Server() {
        serverList = new ArrayList<>();
    };

    private List<String> serverList;
    private static Server serverInstance;


    /// Lazy initialization of the singleton instance
    public static Server getInstance() {
        if(serverInstance == null) {
            serverInstance = new Server();
        }

        return serverInstance;
    }

    /*
     * adding a server to the list
     * a method adding the server to the list should return boolean (true if the server has been added to the list, false if it's otherwise)
     * adding is possible, if its name starts from http or https
     * adding a duplicated name is impossible.
     */
    public boolean addServer(String serverName) {
        if((serverName.startsWith("https") || serverName.startsWith("http")) && !serverList.contains(serverName)) {
            return serverList.add(serverName);
        }
        return false;
    }

    /// downloading a list of servers, that names start from http.
    public List<String> getHttpServerList() {
        return serverList.stream()
        .filter(server -> server.startsWith("http"))
        .collect(Collectors.toUnmodifiableList());
    }


    /// downloading a list of servers, that names start from https.
    public List<String> getHttpsServerList() {
        return serverList.stream()
        .filter(server -> server.startsWith("https"))
        .collect(Collectors.toUnmodifiableList());
    }
}
