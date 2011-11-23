class Main{
	public static void main(String[] args) {
	
	Santap s = new Santap();
	Makanan ma = new Makanan();
	Minuman mi = new Minuman();
	Cemilan ce = new Cemilan();
	
	s.cerna(ma);
	s.cerna(mi);
	s.cerna(ce);
	}
}