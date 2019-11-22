// https://github.com/tjwldnjss13/Adaptive-Resonance-Theory.git

public class ART2 {
    public static final double[][] PATTERN_1 = {{0,0,1,1,0,0,0,
        0,0,0,1,0,0,0,
        0,0,1,1,0,0,0,
        0,0,1,0,1,0,0,
        0,0,1,0,1,0,0,
        0,1,1,1,1,1,0,
        0,1,0,0,0,1,0,
        0,1,0,0,0,1,0,
        1,1,1,0,1,1,1},
       {1,1,1,1,1,1,0,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        0,1,1,1,1,1,0,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        1,1,1,1,1,1,0},
       {0,0,1,1,1,1,1,
        0,1,0,0,0,0,1,
        1,0,0,0,0,0,0,
        1,0,0,0,0,0,0,
        1,0,0,0,0,0,0,
        1,0,0,0,0,0,0,
        1,0,0,0,0,0,0,
        0,1,0,0,0,0,1,
        0,0,1,1,1,1,0},
       {1,1,1,1,1,0,0,
        0,1,0,0,0,1,0,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        0,1,0,0,0,1,0,
        1,1,1,1,1,0,0},
       {1,1,1,1,1,1,1,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,0,
        0,1,0,1,0,0,0,
        0,1,1,1,0,0,0,
        0,1,0,1,0,0,0,
        0,1,0,0,0,0,0,
        0,1,0,0,0,0,1,
        1,1,1,1,1,1,1},
       {0,0,0,1,1,1,1,
        0,0,0,0,0,1,0,
        0,0,0,0,0,1,0,
        0,0,0,0,0,1,0,
        0,0,0,0,0,1,0,
        0,0,0,0,0,1,0,
        0,1,0,0,0,1,0,
        0,1,0,0,0,1,0,
        0,0,1,1,1,0,0},
       {1,1,1,0,0,1,1,
        0,1,0,0,1,0,0,
        0,1,0,1,0,0,0,
        0,1,1,0,0,0,0,
        0,1,1,0,0,0,0,
        0,1,0,1,0,0,0,
        0,1,0,0,1,0,0,
        0,1,0,0,0,1,0,
        1,1,1,0,0,1,1}};
public static double[][] PATTERN_2 = {{0,0,0,1,0,0,0,
        0,0,0,1,0,0,0,
        0,0,0,1,0,0,0,
        0,0,1,0,1,0,0,
        0,0,1,0,1,0,0,
        0,1,0,0,0,1,0,
        0,1,1,1,1,1,0,
        0,1,0,0,0,1,0,
        0,1,0,0,0,1,0},
       {1,1,1,1,1,1,0,
        1,0,0,0,0,0,1,
        1,0,0,0,0,0,1,
        1,0,0,0,0,0,1,
        1,1,1,1,1,1,0,
        1,0,0,0,0,0,1,
        1,0,0,0,0,0,1,
        1,0,0,0,0,0,1,
        1,1,1,1,1,1,0},
       {0,0,1,1,1,0,0,
        0,1,0,0,0,1,0,
        1,0,0,0,0,0,1,
        1,0,0,0,0,0,0,
        1,0,0,0,0,0,0,
        1,0,0,0,0,0,0,
        1,0,0,0,0,0,1,
        0,1,0,0,0,1,0,
        0,0,1,1,1,0,0},
       {1,1,1,1,1,0,0,
        1,0,0,0,0,1,0,
        1,0,0,0,0,0,1,
        1,0,0,0,0,0,1,
        1,0,0,0,0,0,1,
        1,0,0,0,0,0,1,
        1,0,0,0,0,0,1,
        1,0,0,0,0,1,0,
        1,1,1,1,1,0,0},
       {1,1,1,1,1,1,1,
        1,0,0,0,0,0,0,
        1,0,0,0,0,0,0,
        1,0,0,0,0,0,0,
        1,1,1,1,1,0,0,
        1,0,0,0,0,0,0,
        1,0,0,0,0,0,0,
        1,0,0,0,0,0,0,
        1,1,1,1,1,1,1},
       {0,0,0,0,0,1,0,
        0,0,0,0,0,1,0,
        0,0,0,0,0,1,0,
        0,0,0,0,0,1,0,
        0,0,0,0,0,1,0,
        0,0,0,0,0,1,0,
        0,1,0,0,0,1,0,
        0,1,0,0,0,1,0,
        0,0,1,1,1,0,0},
       {1,0,0,0,0,1,0,
        1,0,0,0,1,0,0,
        1,0,0,1,0,0,0,
        1,0,1,0,0,0,0,
        1,1,0,0,0,0,0,
        1,0,1,0,0,0,0,
        1,0,0,1,0,0,0,
        1,0,0,0,1,0,0,
        1,0,0,0,0,1,0}};
public static double[][] PATTERN_3 = {{0,0,0,1,0,0,0,
        0,0,0,1,0,0,0,
        0,0,1,0,1,0,0,
        0,0,1,0,1,0,0,
        0,1,0,0,0,1,0,
        0,1,1,1,1,1,0,
        1,0,0,0,0,0,1,
        1,0,0,0,0,0,1,
        1,1,0,0,0,1,1},
       {1,1,1,1,1,1,0,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        0,1,1,1,1,1,0,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        1,1,1,1,1,1,0},
       {0,0,1,1,1,0,1,
        0,1,0,0,0,1,1,
        1,0,0,0,0,0,1,
        1,0,0,0,0,0,0,
        1,0,0,0,0,0,0,
        1,0,0,0,0,0,0,
        1,0,0,0,0,0,1,
        0,1,0,0,0,1,0,
        0,0,1,1,1,0,0},
       {1,1,1,1,1,0,0,
        0,1,0,0,0,1,0,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        0,1,0,0,0,0,1,
        0,1,0,0,0,1,0,
        1,1,1,1,1,0,0},
       {1,1,1,1,1,1,1,
        0,1,0,0,0,0,1,
        0,1,0,0,1,0,0,
        0,1,1,1,1,0,0,
        0,1,0,0,1,0,0,
        0,1,0,0,0,0,0,
        0,1,0,0,0,0,0,
        0,1,0,0,0,0,1,
        1,1,1,1,1,1,1},
       {0,0,0,0,1,1,1,
        0,0,0,0,0,1,0,
        0,0,0,0,0,1,0,
        0,0,0,0,0,1,0,
        0,0,0,0,0,1,0,
        0,0,0,0,0,1,0,
        0,0,0,0,0,1,0,
        0,1,0,0,0,1,0,
        0,0,1,1,1,0,0},
       {1,1,1,0,0,1,1,
        0,1,0,0,0,1,0,
        0,1,0,0,1,0,0,
        0,1,0,1,0,0,0,
        0,1,1,0,0,0,0,
        0,1,0,1,0,0,0,
        0,1,0,0,1,0,0,
        0,1,0,0,0,1,0,
        1,1,1,0,0,1,1}};

    int numTotalPattern = ART2.PATTERN_1.length + ART2.PATTERN_2.length + ART2.PATTERN_3.length;
    int numPattern = ART2.PATTERN_1.length;
    int numUnit = ART2.PATTERN_1[0].length;
    int numCurrentCluster = 1;
    double vigilanceThreshold = 10;
    double[][] weight = new double[numUnit][100];
    double[][] cluster = new double[100][this.numTotalPattern];
    double[][] centroid = new double[100][this.numUnit];
    double[] numClusterMember = new double[100];
    double[] distanceFromCluster = new double[100];
    
    public static void main(String[] args) {

    }

    void initWeight() {
        for (int i=0; i<this.numUnit; i++) {
            for (int j=0; j<100; j++) {
                this.weight[i][j] = Math.random();
            }
        }
    }

    void initCluster() {
        for (int i=0; i<100; i++) {
            for (int j=0; j<this.numTotalPattern; j++) {
                this.cluster[i][j] = 0;
            }
        }
    }

    void initCentroid() {
        for (int i=0; i<100; i++) {
            for (int j=0; j<this.numUnit; j++) {
                this.centroid[i][j] = 0;
            }
        }
    }

    void initNumClusterMember() {
        for (int i=0; i<100; i++) {
            this.numClusterMember[i] = 0;
        }
    }

    void clusterring() {
        for (int i=0; i<this.numTotalPattern; i++) {
            if (i < this.numPattern) {    // Pattern 1
                if (i == 0) {
                    for (int j=0; j<this.numUnit; j++) {
                        this.centroid[0][j] = ART2.PATTERN_1[0][j];
                    }
                }
                else {

                }
            }
            else if (i < 2 * this.numPattern) {     // Pattern 2

            }
            else if (i < 3 * this.numPattern) {     // Pattern 3

            }
        }
    }   

    void calcDistance() {
        
    }

    void makeCentroid(int iCluster, int iPattern) {
        if (iPattern < this.numPattern) {
            for (int i=0; i<this.numUnit; i++) {
                this.centroid[iCluster][i] = (ART2.PATTERN_1[iPattern][i] + this.numCurrentCluster) / (double) (this.numCurrentCluster + 1);
            }
        }
        else if (iPattern < 2 * this.numPattern) {
            for (int i=0; i<this.numUnit; i++) {
                this.centroid[iCluster][i] = (ART2.PATTERN_2[iPattern-this.numPattern][i] + this.numCurrentCluster) / (double) (this.numCurrentCluster + 1);
            }
        }
        else if (iPattern < 3 * this.numPattern) {
            for (int i=0; i<this.numUnit; i++) {
                this.centroid[iCluster][i] = (ART2.PATTERN_3[iPattern-(2*this.numPattern)][i] + this.numCurrentCluster) / (double) (this.numCurrentCluster + 1);
            }
        }
    }
}