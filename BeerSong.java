public class BeerSong {
public static void main (String[] args) {
int beerNumb=99;
String word=" бутылок(бутылки)";
while (beerNumb>0) {
if (beerNumb<5) {

	if (beerNumb==1) {

	System.out.println(beerNumb+" бутылка на стене.Последняя");
	System.out.println("Возьми одну.");
	beerNumb=beerNumb-1; }
	if (beerNumb==0) {

	System.out.println(beerNumb+" Всё, ничего больше нет.");
	System.out.println("ты выпил всё.");
	 }
else{
System.out.println(beerNumb+" бутылки на стене");
System.out.println("Возьми одну.");
beerNumb=beerNumb-1;}
}
	

else{

System.out.println(beerNumb+" бутылок на стене");
System.out.println("Возьми одну.");
beerNumb=beerNumb-1;
}

}//while
}//
}
