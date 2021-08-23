package ru.geekbrains.homeworks.graphs;

import ru.geekbrains.homeworks.list.LinkedList;

import java.awt.*;
import java.util.ArrayList;

public class TestMain7 {

    public static void main(String[] args) {
        //testGraph();
        //testDfs();
        //testBfs();
        findWay();

    }

//    private static void testGraph() {
//        Graph graph = new GraphImpl(4);
//
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//
//        graph.addEdge("A", "B", "C");
//        graph.addEdge("B", "A", "C", "D");
//        graph.addEdge("C", "A", "B", "D");
//        graph.addEdge("D", "B", "C");
//
//        System.out.println("Size of graph is " + graph.getSize());
//        graph.display();
//    }

//    private static void testDfs() {
//        Graph graph = new GraphImpl(7);
//
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//        graph.addVertex("E");
//        graph.addVertex("F");
//        graph.addVertex("G");
//
//        graph.addEdge("A", "B", "C", "D");
//        graph.addEdge("B", "E");
//        graph.addEdge("D", "F");
//        graph.addEdge("F", "G");
//
//        graph.dfs("A");
//
//    }

//    private static void testBfs() {
//        Graph graph = new GraphImpl(8);
//
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//        graph.addVertex("E");
//        graph.addVertex("F");
//        graph.addVertex("G");
//        graph.addVertex("H");
//
//        graph.addEdge("A", "B", "C", "D");
//        graph.addEdge("B", "E");
//        graph.addEdge("E", "H");
//        graph.addEdge("C", "F");
//        graph.addEdge("D", "G");
//
//        graph.bfs("A");
//    }

    public static void findWay() {
        MyGraph graph = new MyGraph(10);
        String[] arrayCity = new String[10];
        arrayCity[0] = "Москва";
        arrayCity[1] = "Тула";
        arrayCity[2] = "Рязань";
        arrayCity[3] = "Калуга";
        arrayCity[4] = "Липецк";
        arrayCity[5] = "Тамбов";
        arrayCity[6] = "Орел";
        arrayCity[7] = "Курск";
        arrayCity[8] = "Саратов";
        arrayCity[9] = "Воронеж";

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 4);
        graph.addEdge(4, 9);
        graph.addEdge(2, 5);
        graph.addEdge(5, 8);
        graph.addEdge(8, 9);
        graph.addEdge(3, 6);
        graph.addEdge(6, 7);
        graph.addEdge(7, 9);

        BreadthFirstPath bfs = new BreadthFirstPath(graph, 0);
        assert bfs.hasPathTo(9);
        System.out.println("Кратчайший путь: "+ bfs.pathTo(9));
    }
}
