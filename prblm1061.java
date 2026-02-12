public class prblm1061 {
    public static void main(String[] args) {
        String s1 = "parker", s2 = "morris", baseStr = "parser";
        System.out.println(new prblm1061().smallestEquivalentString(s1, s2, baseStr));
    }
    
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        UnionFind dsu = new UnionFind(26);
        for(int i = 0; i < s1.length(); i++){
            int u = s1.charAt(i) - 'a';
            int v = s2.charAt(i) - 'a';
            dsu.union(u, v);
        }

        StringBuilder str = new StringBuilder();
        for(char ch : baseStr.toCharArray()){
            str.append((char) (dsu.find(ch - 'a') + 'a'));
        }
        return str.toString();
    }
}

class UnionFind{
    private int[] parent;

    public UnionFind(int size){
        this.parent = new int[size];
        for(int i = 0; i < size; i++){
            this.parent[i] = i;
        }
    }

    public boolean areFriends(int u, int v){
        return find(u) == find(v);
    }

    public void union(int u, int v){
        int p1 = find(u);
        int p2 = find(v);
        
        if(p1 == p2){
            return;
        }
        if(p1 < p2){
            parent[p2] = p1;
        }
        else{
            parent[p1] = p2;
        }
    }

    public int find(int u){
        if(parent[u] == u){
            return u;
        }
        return parent[u] = find(parent[u]);
    }
}

// By Using character array
// class UnionFind{
//     private char[] parent;
//     private int[] rank;

//     public UnionFind(int size){
//         this.parent = new char[size];
//         for(int i = 0; i < size; i++){
//             this.parent[i] = (char) ('a' + i);
//         }
//     }

//     public boolean areFriends(char u, char v){
//         return find(u) == find(v);
//     }

//     public void union(char u, char v){
//         char p1 = find(u);
//         char p2 = find(v);
        
//         if(p1 == p2){
//             return;
//         }

//         int i1 = p1 - 'a';
//         int i2 = p2 - 'a';
//         if(i1 < i2){
//             parent[i2] = p1;
//         }
//         else{
//             parent[i1] = p2;
//         }
//     }

//     public char find(char u){
//         if(parent[u - 'a'] == u){
//             return u;
//         }
//         return parent[u - 'a'] = find(parent[u - 'a']);
//     }
//}