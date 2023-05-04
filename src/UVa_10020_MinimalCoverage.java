import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class UVa_10020_MinimalCoverage {
    public static void main(String[] args) throws IOException {
        //Scanner sc= new Scanner(System.in);
        // adding this just to the test branch
          Scanner sc=new Scanner(new FileReader("input.txt"));
          PrintWriter out=new PrintWriter(System.out);
          int testCases= sc.nextInt();
          while(testCases-->0){
            sc.nextLine();
            int m= sc.nextInt();
            int left; int right;
              PriorityQueue<Pair>priorityQueue=new PriorityQueue<>();
            while (true){
                left= sc.nextInt();right= sc.nextInt();
                if (left==0 && right==0)break;
                priorityQueue.offer(new Pair(left,right));
            }
            myComparator myComparator = new myComparator();
            PriorityQueue<Pair>result=new PriorityQueue<>(myComparator);
            while (!priorityQueue.isEmpty()){
                Pair curr=priorityQueue.poll();
                if (curr.start<=0 && curr.finish>=m){
                   result.clear();
                    result.add(curr);break;
                }else{
                 if(priorityQueue.peek().start<=curr.finish && priorityQueue.peek().start>=curr.start ){

                 }

                }

            }
          }


    }
    static class myComparator implements Comparator<Pair>{

        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.start!=o2.start)return Integer.compare(o1.start, o2.start);
            return Integer.compare(o1.finish, o2.finish);
        }
    }
    static class Pair implements Comparable<Pair> {
        int start;
        int finish;

        public Pair(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }

        @Override
        public int compareTo(Pair o) {
            int duration1=this.finish-this.start;
            int duration2=o.finish-o.start;
            if (duration1!=duration2)return 1;
            else return Integer.compare(this.start,o.start);
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
