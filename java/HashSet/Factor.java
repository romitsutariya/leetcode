public class Factor {
    public static void main(String[] args) {
        int n=16;
        int sq=(int) Math.sqrt(56);
        for (int i = 1; i <=sq; i++) {
            for (int j = 1; j <=n; j++) {
                if(i*j==n){
                    System.out.println(String.format("{%s,%s}".formatted(i,j)));
                }
            }
        }
    }
}
