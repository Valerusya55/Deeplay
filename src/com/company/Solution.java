package com.company;

public class Solution {
    private static Graph graph;

    public static int getResult(String species, String field) throws Exception {
        if(field.length() != 16){
            throw new Exception("Размер строки Field должен быть равен 16 символам");
        }
        graph = new Graph();
        for (int i = 0; i < field.length(); i++) {
            graph.addVertex(field.charAt(i));
        }

        for (int i = 1; i < field.length(); i++) {
            if (field.charAt(i) == 'S') {
                switch (species) {
                    case "Human" -> addWeight(i, 5);
                    case "Swamper" -> addWeight(i, 2);
                    case "Woodman" -> addWeight(i, 3);
                    default -> throw new Exception("Введены неккоректные данные в поле Species");
                }
            } else if (field.charAt(i) == 'W') {
                switch (species) {
                    case "Human", "Swamper" -> addWeight(i, 2);
                    case "Woodman" -> addWeight(i, 3);
                    default -> throw new Exception("Введены неккоректные данные в поле Species");
                }
            } else if (field.charAt(i) == 'T') {
                switch (species) {
                    case "Human" -> addWeight(i, 3);
                    case "Swamper" -> addWeight(i, 5);
                    case "Woodman" -> addWeight(i, 2);
                    default -> throw new Exception("Введены неккоректные данные в поле Species");
                }
            } else if (field.charAt(i) == 'P') {
                switch (species) {
                    case "Human" -> addWeight(i, 1);
                    case "Swamper", "Woodman" -> addWeight(i, 2);
                    default -> throw new Exception("Введены неккоректные данные в поле Species");
                }
            } else {
                throw new Exception("Введены неккоректные данные в поле Field");
            }
        }
        return graph.path();
    }

    private static void addWeight(int i, int weight) {
        if (i == 1) {
            graph.addEdge(0, 1, weight);
            graph.addEdge(5, 1, weight);
        } else if (i == 2) {
            graph.addEdge(1, 2, weight);
            graph.addEdge(6, 2, weight);
        } else if (i == 3) {
            graph.addEdge(2, 3, weight);
        } else if (i == 4) {
            graph.addEdge(0, 4, weight);
            graph.addEdge(5, 4, weight);
        } else if (i == 5) {
            graph.addEdge(1, 5, weight);
            graph.addEdge(4, 5, weight);
            graph.addEdge(6, 5, weight);
            graph.addEdge(9, 5, weight);
        } else if (i == 6) {
            graph.addEdge(2, 6, weight);
            graph.addEdge(5, 6, weight);
            graph.addEdge(7, 6, weight);
            graph.addEdge(10, 6, weight);
        } else if (i == 7) {
            graph.addEdge(3, 7, weight);
            graph.addEdge(6, 7, weight);
        } else if (i == 8) {
            graph.addEdge(4, 8, weight);
            graph.addEdge(9, 8, weight);
        } else if (i == 9) {
            graph.addEdge(5, 9, weight);
            graph.addEdge(8, 9, weight);
            graph.addEdge(10, 9, weight);
            graph.addEdge(13, 9, weight);
        } else if (i == 10) {
            graph.addEdge(6, 10, weight);
            graph.addEdge(9, 10, weight);
            graph.addEdge(11, 10, weight);
            graph.addEdge(14, 10, weight);
        } else if (i == 11) {
            graph.addEdge(7, 11, weight);
            graph.addEdge(10, 11, weight);
        } else if (i == 12) {
            graph.addEdge(8, 12, weight);
        } else if (i == 13) {
            graph.addEdge(9, 13, weight);
            graph.addEdge(12, 13, weight);
        } else if (i == 14) {
            graph.addEdge(10, 14, weight);
            graph.addEdge(13, 14, weight);
        } else if (i == 15) {
            graph.addEdge(11, 15, weight);
            graph.addEdge(14, 15, weight);
        }
    }
}
