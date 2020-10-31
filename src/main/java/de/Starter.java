package de;

import static spark.Spark.get;
import static spark.Spark.post;

public class Starter {
    public static void main(String[] args) {
        get("/", (req, res) -> "Hello World!");
        post("/hello", (req, res) -> "Hello World!");
    }
}
