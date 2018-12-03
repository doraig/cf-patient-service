package com.pigopoyo;

import static spark.Spark.get;
import static spark.Spark.port;

public class Main {
    public static void main(String[] args) {
        port(getCloudAssignedPort());
        get("app", (req, res) -> "Patient Service Application.");
    }

    private static Integer getCloudAssignedPort() {
        ProcessBuilder  processBuilder = new ProcessBuilder();
       return Integer.parseInt(processBuilder.environment().computeIfAbsent("PORT", s -> "4567"));
    }
}
