package NamuDarbaiMS.BalticTalents;

public class ThirdArray {
    public static void main(String[] args) {
        int[]a = {11,8,3,99};
        int[]b = {4,16,1,4,3,99};
        int[]c = new int[a.length+b.length];
        int count = 0;

        for(int i = 0; i<a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for(int j = 0;j<b.length;j++) {
            c[count++] = b[j];
        }
        for(int i = 0;i<c.length;i++) System.out.print(c[i]+" ");
    }
}