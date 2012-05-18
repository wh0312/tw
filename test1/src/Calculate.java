/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-5-15
 * Time: 上午9:55
 * To change this template use File | Settings | File Templates.
 */
public class Calculate {
    private int[] counts;
    private char[] all = new char[]{'A','B','C','D'};
    private String goods;
    public Calculate(){
            counts = new int[all.length];
    }
    public int price(String items){
        for(int i=0;i<counts.length;i++){
            counts[i] = 0;
        }
        calCount(items);
        return calPrice();
    }
    public int calPrice(){
        int priceA = (counts[0]/3)*130 + (counts[0]%3)*50;
        int priceB = (counts[1]/2)*45 + (counts[1]%2)*30;
        int priceC = counts[2] * 20;
        int priceD = counts[3] * 15;
        return priceA + priceB + priceC + priceD;
    }
    public void calCount(String items){
        char[] arrays = items.toCharArray();
        for(char item:arrays){
            for (int i=0;i<all.length;i++){
                if(all[i] == item){
                    counts[i]++;
                }

            }
        }
    }
}
