//Mercy electronics shop has given festival offer that is 12% off, on every purchase. 
//Following are the prices of the electronic items. 4GB Transcend pen drive is Rs.500/-, Sony 
//Head set is Rs 1000/-, Samsung tablet is Rs 3500/- and Seagate Hard disk 1TB is Rs 4000/-. 
//Calculate the total bill amount to pay by doing a purchase in Mercy electronics shop. 
class items{
    int penDrive;
    int headSet;
    int tablet;
    int hardDisk;
    int total;
    int price() {
    	total=penDrive+headSet+tablet+hardDisk;
    	return total;
    }
    double discount(int total) {
    	return(0.78*total);
    }
}
public class mercyelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        items i=new items();
        i.penDrive=500;
        i.hardDisk=4000;
        i.headSet=1000;
        i.tablet=3500;
        int p=i.price();
        double d=i.discount(p);
        System.out.println("Final price after discount is: "+d);
	}

}
