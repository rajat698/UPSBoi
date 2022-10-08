import java.util.ArrayList;
import java.util.Arrays;

public class SymGraph extends Graph {

    private ArrayList coordinates;

    public SymGraph(int numVertices, ArrayList<ArrayList<Float>> coordinates) {
        super(numVertices);
        this.coordinates = coordinates;
        ArrayList edges = new ArrayList();
        for(int i=0; i<numVertices; i++) {
            ArrayList row =  new ArrayList<Float>();
            for(int j=0; j<numVertices; j++) {
                Float dist;
                if (j==i) {
                    dist = Float.valueOf(9999);
                } else {
                    dist = Float.valueOf(
                            Math.abs(coordinates.get(j).get(0) - coordinates.get(i).get(0)) +
                                    Math.abs(coordinates.get(j).get(1) - coordinates.get(i).get(1))
                    );
                }
                row.add(dist);
            }
            edges.add(row);
        }
        this.setEdges(edges);
    }


}