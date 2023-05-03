import java.io.*;
import java.util.StringTokenizer;

public class UVa_1193_RadarInstallation {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(System.out);
        int n,d,cases=0;
        while ((n= sc.nextInt())!=0 | (d= sc.nextInt())!=0){
           cases++;
           Pair[]islands=new Pair[n];
           for (int i=0;i<n;i++){
               int x= sc.nextInt();int y= sc.nextInt();
               islands[i]=new Pair(x,y);
           }


        }


    }
    static class Pair{
        int x;
        int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static class Scanner{
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

        public Scanner(FileReader r){	br = new BufferedReader(r);}

        public String next() throws IOException
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());

        }

        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}

        public double nextDouble() throws IOException { return Double.parseDouble(next()); }

        public boolean ready() throws IOException {return br.ready();}
    }
}