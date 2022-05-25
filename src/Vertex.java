import java.util.*;

public class Vertex <Edge>{  //here i wrote Edge, not V since vertex is an object, respectively edges will be added
    private Edge data;
    private Edge dest;
    private Map<Vertex<Edge>,Double> adjacentVertices;
    public void addAdjecentVertex(Vertex<Edge> destination,double weight){
        adjacentVertices.put(destination,weight);
    }

    public void setDest(Edge dest){
        this.dest=dest;
    }

    public Edge getDest(){
        return dest;
    }

}
