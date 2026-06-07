package Constructor;

class Manager{
	int mid;
	String mname;
	
	Manager(int x, String y){
		mid = x; 
		mname = y;
	}
}



class Single_Constructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m1 = new Manager(101, "ABC");
		System.out.println(m1.mid);
		System.out.println(m1.mname);
	}

}
